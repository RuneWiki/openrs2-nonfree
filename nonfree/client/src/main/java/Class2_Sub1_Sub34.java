import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub34() {
		super(3, false);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(22) int[] local22 = this.method3265(arg0, 0);
			@Pc(28) int[] local28 = this.method3265(arg0, 1);
			@Pc(34) int[] local34 = this.method3265(arg0, 2);
			for (@Pc(36) int local36 = 0; local36 < Static135.anInt2897; local36++) {
				@Pc(42) int local42 = local34[local36];
				if (local42 == 4096) {
					local7[local36] = local22[local36];
				} else if (local42 == 0) {
					local7[local36] = local28[local36];
				} else {
					local7[local36] = local42 * local22[local36] + (4096 - local42) * local28[local36] >> 12;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			super.aBoolean196 = arg0.method260() == 1;
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(21) int[] local21 = this.method3265(arg0, 2);
			@Pc(29) int[][] local29 = this.method3259(arg0, 0);
			@Pc(35) int[][] local35 = this.method3259(arg0, 1);
			@Pc(39) int[] local39 = local11[0];
			@Pc(43) int[] local43 = local11[1];
			@Pc(47) int[] local47 = local11[2];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local29[1];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[1];
			@Pc(67) int[] local67 = local35[0];
			@Pc(71) int[] local71 = local35[2];
			for (@Pc(73) int local73 = 0; local73 < Static135.anInt2897; local73++) {
				@Pc(79) int local79 = local21[local73];
				if (local79 == 4096) {
					local39[local73] = local51[local73];
					local43[local73] = local55[local73];
					local47[local73] = local59[local73];
				} else if (local79 == 0) {
					local39[local73] = local67[local73];
					local43[local73] = local63[local73];
					local47[local73] = local71[local73];
				} else {
					@Pc(112) int local112 = 4096 - local79;
					local39[local73] = local112 * local67[local73] + local79 * local51[local73] >> 12;
					local43[local73] = local112 * local63[local73] + local79 * local55[local73] >> 12;
					local47[local73] = local79 * local59[local73] + local71[local73] * local112 >> 12;
				}
			}
		}
		return local11;
	}
}
