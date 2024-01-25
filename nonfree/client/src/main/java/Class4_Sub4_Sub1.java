import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class4_Sub4_Sub1 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
	private int anInt349 = 4096;

	@OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
	private int anInt348 = 8192;

	@OriginalMember(owner = "client!ao", name = "O", descriptor = "I")
	private int anInt354 = 2048;

	@OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
	private int anInt351 = 2048;

	@OriginalMember(owner = "client!ao", name = "V", descriptor = "I")
	private int anInt359 = 0;

	@OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
	private int anInt357 = 0;

	@OriginalMember(owner = "client!ao", name = "W", descriptor = "I")
	private int anInt360 = 12288;

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BILclient!eh;)V")
	@Override
	public void method7886(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt351 = arg1.method5982();
		} else if (arg0 == 1) {
			this.anInt357 = arg1.method5982();
		} else if (arg0 == 2) {
			this.anInt359 = arg1.method5982();
		} else if (arg0 == 3) {
			this.anInt354 = arg1.method5982();
		} else if (arg0 == 4) {
			this.anInt360 = arg1.method5982();
		} else if (arg0 == 5) {
			this.anInt349 = arg1.method5982();
		} else if (arg0 == 6) {
			this.anInt348 = arg1.method5982();
		}
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(III)Z")
	private boolean method365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt360 * (arg0 + arg1) >> 12;
		@Pc(27) int local27 = Static488.anIntArray645[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt360;
		@Pc(41) int local41 = (local34 << 12) / this.anInt348;
		@Pc(48) int local48 = this.anInt349 * local41 >> 12;
		return local48 > arg1 - arg0 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB)Z")
	private boolean method366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt360 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static488.anIntArray645[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt360;
		@Pc(43) int local43 = (local30 << 12) / this.anInt348;
		@Pc(50) int local50 = this.anInt349 * local43 >> 12;
		return local50 > arg0 + arg1 && arg0 + arg1 > -local50;
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	@Override
	public void method7894() {
		Static61.method1040();
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method7883(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass343_41.method7596(arg0);
		if (super.aClass343_41.aBoolean638) {
			@Pc(26) int local26 = Static450.anIntArray619[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static560.anInt9394; local28++) {
				@Pc(36) int local36 = Static80.anIntArray212[local28] - 2048;
				@Pc(42) int local42 = local36 + this.anInt351;
				@Pc(53) int local53 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(62) int local62 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(68) int local68 = local26 + this.anInt357;
				@Pc(79) int local79 = local68 >= -2048 ? local68 : local68 + 4096;
				@Pc(88) int local88 = local79 <= 2048 ? local79 : local79 - 4096;
				@Pc(93) int local93 = this.anInt359 + local36;
				@Pc(102) int local102 = local93 < -2048 ? local93 + 4096 : local93;
				@Pc(111) int local111 = local102 <= 2048 ? local102 : local102 - 4096;
				@Pc(116) int local116 = this.anInt354 + local26;
				@Pc(125) int local125 = local116 >= -2048 ? local116 : local116 + 4096;
				@Pc(134) int local134 = local125 > 2048 ? local125 - 4096 : local125;
				local16[local28] = this.method366(local88, local62) || this.method365(local111, local134) ? 4096 : 0;
			}
		}
		return local16;
	}
}
