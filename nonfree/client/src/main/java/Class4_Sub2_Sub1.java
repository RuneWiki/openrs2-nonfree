import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!b", name = "G", descriptor = "I")
	private int anInt605 = 8192;

	@OriginalMember(owner = "client!b", name = "E", descriptor = "I")
	private int anInt604 = 4096;

	@OriginalMember(owner = "client!b", name = "L", descriptor = "I")
	private int anInt609 = 0;

	@OriginalMember(owner = "client!b", name = "D", descriptor = "I")
	private int anInt603 = 0;

	@OriginalMember(owner = "client!b", name = "O", descriptor = "I")
	private int anInt612 = 12288;

	@OriginalMember(owner = "client!b", name = "R", descriptor = "I")
	private int anInt614 = 2048;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	private int anInt607 = 2048;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		Static282.method4074();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(26) int local26 = Static429.anIntArray465[arg0] - 2048;
			for (@Pc(28) int local28 = 0; local28 < Static269.anInt4330; local28++) {
				@Pc(36) int local36 = Static312.anIntArray370[local28] - 2048;
				@Pc(41) int local41 = this.anInt614 + local36;
				@Pc(52) int local52 = local41 < -2048 ? local41 + 4096 : local41;
				@Pc(63) int local63 = local52 <= 2048 ? local52 : local52 - 4096;
				@Pc(68) int local68 = this.anInt609 + local26;
				@Pc(77) int local77 = local68 < -2048 ? local68 + 4096 : local68;
				@Pc(88) int local88 = local77 <= 2048 ? local77 : local77 - 4096;
				@Pc(93) int local93 = this.anInt603 + local36;
				@Pc(104) int local104 = local93 >= -2048 ? local93 : local93 + 4096;
				@Pc(115) int local115 = local104 > 2048 ? local104 - 4096 : local104;
				@Pc(120) int local120 = this.anInt607 + local26;
				@Pc(129) int local129 = local120 < -2048 ? local120 + 4096 : local120;
				@Pc(138) int local138 = local129 > 2048 ? local129 - 4096 : local129;
				local11[local28] = this.method598(local63, local88) || this.method599(local138, local115) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)Z")
	private boolean method598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt612 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static190.anIntArray170[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt612;
		@Pc(37) int local37 = (local30 << 12) / this.anInt605;
		@Pc(44) int local44 = local37 * this.anInt604 >> 12;
		return arg0 + arg1 < local44 && -local44 < arg0 + arg1;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt614 = arg1.method8859();
		} else if (arg0 == 1) {
			this.anInt609 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt603 = arg1.method8859();
		} else if (arg0 == 3) {
			this.anInt607 = arg1.method8859();
		} else if (arg0 == 4) {
			this.anInt612 = arg1.method8859();
		} else if (arg0 == 5) {
			this.anInt604 = arg1.method8859();
		} else if (arg0 == 6) {
			this.anInt605 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIZ)Z")
	private boolean method599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt612 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static190.anIntArray170[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt612;
		@Pc(42) int local42 = (local30 << 12) / this.anInt605;
		@Pc(49) int local49 = this.anInt604 * local42 >> 12;
		return local49 > arg0 - arg1 && -local49 < arg0 - arg1;
	}
}
