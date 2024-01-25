import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class6_Sub1_Sub30 extends Class6_Sub1 {

	@OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
	private int anInt8394 = 0;

	@OriginalMember(owner = "client!rw", name = "E", descriptor = "I")
	private int anInt8391 = 12288;

	@OriginalMember(owner = "client!rw", name = "D", descriptor = "I")
	private int anInt8390 = 8192;

	@OriginalMember(owner = "client!rw", name = "P", descriptor = "I")
	private int anInt8399 = 0;

	@OriginalMember(owner = "client!rw", name = "J", descriptor = "I")
	private int anInt8395 = 2048;

	@OriginalMember(owner = "client!rw", name = "S", descriptor = "I")
	private int anInt8402 = 4096;

	@OriginalMember(owner = "client!rw", name = "R", descriptor = "I")
	private int anInt8401 = 2048;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(III)Z")
	private boolean method7032(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt8391 >> 12;
		@Pc(28) int local28 = Static293.anIntArray416[local13 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt8391;
		@Pc(42) int local42 = (local35 << 12) / this.anInt8390;
		@Pc(49) int local49 = this.anInt8402 * local42 >> 12;
		return local49 > arg1 + arg0 && -local49 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIB)Z")
	private boolean method7034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt8391 >> 12;
		@Pc(22) int local22 = Static293.anIntArray416[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local22 << 12) / this.anInt8391;
		@Pc(44) int local44 = (local37 << 12) / this.anInt8390;
		@Pc(51) int local51 = this.anInt8402 * local44 >> 12;
		return arg1 - arg0 < local51 && arg1 - arg0 > -local51;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		Static463.method7157();
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(27) int local27 = Static346.anIntArray472[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static289.anInt5549; local29++) {
				@Pc(37) int local37 = Static473.anIntArray730[local29] - 2048;
				@Pc(42) int local42 = this.anInt8401 + local37;
				@Pc(53) int local53 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(62) int local62 = local53 > 2048 ? local53 - 4096 : local53;
				@Pc(67) int local67 = local27 + this.anInt8394;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(87) int local87 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(92) int local92 = this.anInt8399 + local37;
				@Pc(101) int local101 = local92 >= -2048 ? local92 : local92 + 4096;
				@Pc(112) int local112 = local101 <= 2048 ? local101 : local101 - 4096;
				@Pc(117) int local117 = local27 + this.anInt8395;
				@Pc(128) int local128 = local117 < -2048 ? local117 + 4096 : local117;
				@Pc(139) int local139 = local128 > 2048 ? local128 - 4096 : local128;
				local11[local29] = this.method7032(local87, local62) || this.method7034(local112, local139) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt8401 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt8394 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt8399 = arg1.method4999();
		} else if (arg0 == 3) {
			this.anInt8395 = arg1.method4999();
		} else if (arg0 == 4) {
			this.anInt8391 = arg1.method4999();
		} else if (arg0 == 5) {
			this.anInt8402 = arg1.method4999();
		} else if (arg0 == 6) {
			this.anInt8390 = arg1.method4999();
		}
	}
}
