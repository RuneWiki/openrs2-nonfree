import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wm")
public final class Class1_Sub2_Sub39 extends Class1_Sub2 {

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub39() {
		super(3, false);
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(29) int[] local29 = this.method5510(arg0, 0);
			@Pc(35) int[] local35 = this.method5510(arg0, 1);
			@Pc(41) int[] local41 = this.method5510(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static158.anInt2658; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local11[local43] = local29[local43];
				} else if (local49 == 0) {
					local11[local43] = local35[local43];
				} else {
					local11[local43] = local35[local43] * (4096 - local49) + local29[local43] * local49 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(27) int[] local27 = this.method5510(arg0, 2);
			@Pc(33) int[][] local33 = this.method5514(arg0, 0);
			@Pc(39) int[][] local39 = this.method5514(arg0, 1);
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			@Pc(55) int[] local55 = local33[0];
			@Pc(59) int[] local59 = local33[1];
			@Pc(63) int[] local63 = local33[2];
			@Pc(67) int[] local67 = local39[0];
			@Pc(71) int[] local71 = local39[1];
			@Pc(75) int[] local75 = local39[2];
			for (@Pc(77) int local77 = 0; local77 < Static158.anInt2658; local77++) {
				@Pc(83) int local83 = local27[local77];
				if (local83 == 4096) {
					local43[local77] = local55[local77];
					local47[local77] = local59[local77];
					local51[local77] = local63[local77];
				} else if (local83 == 0) {
					local43[local77] = local67[local77];
					local47[local77] = local71[local77];
					local51[local77] = local75[local77];
				} else {
					@Pc(118) int local118 = 4096 - local83;
					local43[local77] = local67[local77] * local118 + local83 * local55[local77] >> 12;
					local47[local77] = local118 * local71[local77] + local83 * local59[local77] >> 12;
					local51[local77] = local83 * local63[local77] + local75[local77] * local118 >> 12;
				}
			}
		}
		return local11;
	}
}
