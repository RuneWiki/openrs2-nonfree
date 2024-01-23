import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dk", name = "ib", descriptor = "I")
	private int anInt1065 = 4096;

	@OriginalMember(owner = "client!dk", name = "jb", descriptor = "I")
	private int anInt1066 = 0;

	@OriginalMember(owner = "client!dk", name = "db", descriptor = "I")
	private int anInt1061 = 0;

	@OriginalMember(owner = "client!dk", name = "fb", descriptor = "I")
	private int anInt1063 = 2048;

	@OriginalMember(owner = "client!dk", name = "cb", descriptor = "I")
	private int anInt1060 = 2048;

	@OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
	private int anInt1057 = 8192;

	@OriginalMember(owner = "client!dk", name = "ob", descriptor = "I")
	private int anInt1071 = 12288;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1063 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt1066 = arg0.method3805();
		} else if (arg1 == 2) {
			this.anInt1061 = arg0.method3805();
		} else if (arg1 == 3) {
			this.anInt1060 = arg0.method3805();
		} else if (arg1 == 4) {
			this.anInt1071 = arg0.method3805();
		} else if (arg1 == 5) {
			this.anInt1065 = arg0.method3805();
		} else if (arg1 == 6) {
			this.anInt1057 = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
	private boolean method784(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = this.anInt1071 * (arg1 + arg0) >> 12;
		@Pc(22) int local22 = Static49.anIntArray67[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt1071;
		@Pc(36) int local36 = (local29 << 12) / this.anInt1057;
		@Pc(43) int local43 = this.anInt1065 * local36 >> 12;
		return local43 > arg0 - arg1 && arg0 - arg1 > -local43;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	@Override
	public void method3739() {
		Static67.method1167();
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(BII)Z")
	private boolean method789(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = (arg0 - arg1) * this.anInt1071 >> 12;
		@Pc(28) int local28 = Static49.anIntArray67[local14 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt1071;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1057;
		@Pc(49) int local49 = this.anInt1065 * local42 >> 12;
		return arg0 + arg1 < local49 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(22) int local22 = Static211.anIntArray334[arg0] - 2048;
			for (@Pc(24) int local24 = 0; local24 < Static157.anInt3431; local24++) {
				@Pc(32) int local32 = Static73.anIntArray105[local24] - 2048;
				@Pc(37) int local37 = this.anInt1066 + local22;
				@Pc(46) int local46 = local37 < -2048 ? local37 + 4096 : local37;
				@Pc(57) int local57 = local46 <= 2048 ? local46 : local46 - 4096;
				@Pc(62) int local62 = local32 + this.anInt1061;
				@Pc(73) int local73 = local62 >= -2048 ? local62 : local62 + 4096;
				@Pc(82) int local82 = local73 > 2048 ? local73 - 4096 : local73;
				@Pc(88) int local88 = local32 + this.anInt1063;
				@Pc(97) int local97 = local88 < -2048 ? local88 + 4096 : local88;
				@Pc(106) int local106 = local97 > 2048 ? local97 - 4096 : local97;
				@Pc(111) int local111 = this.anInt1060 + local22;
				@Pc(120) int local120 = local111 < -2048 ? local111 + 4096 : local111;
				@Pc(129) int local129 = local120 > 2048 ? local120 - 4096 : local120;
				local7[local24] = this.method789(local57, local106) || this.method784(local129, local82) ? 4096 : 0;
			}
		}
		return local7;
	}
}
