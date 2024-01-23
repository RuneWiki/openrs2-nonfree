import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub2_Sub30 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub30() {
		super(3, false);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4572(@OriginalArg(1) int arg0) {
		@Pc(14) int[][] local14 = this.aClass151_41.method3758(arg0);
		if (this.aClass151_41.aBoolean344) {
			@Pc(29) int[] local29 = this.method4570(arg0, 2);
			@Pc(37) int[][] local37 = this.method4575(0, arg0);
			@Pc(43) int[][] local43 = this.method4575(1, arg0);
			@Pc(47) int[] local47 = local14[0];
			@Pc(51) int[] local51 = local14[1];
			@Pc(55) int[] local55 = local37[0];
			@Pc(59) int[] local59 = local14[2];
			@Pc(63) int[] local63 = local37[1];
			@Pc(67) int[] local67 = local43[1];
			@Pc(71) int[] local71 = local37[2];
			@Pc(75) int[] local75 = local43[0];
			@Pc(79) int[] local79 = local43[2];
			for (@Pc(81) int local81 = 0; local81 < Static299.anInt5670; local81++) {
				@Pc(92) int local92 = local29[local81];
				if (local92 == 4096) {
					local47[local81] = local55[local81];
					local51[local81] = local63[local81];
					local59[local81] = local71[local81];
				} else if (local92 == 0) {
					local47[local81] = local75[local81];
					local51[local81] = local67[local81];
					local59[local81] = local79[local81];
				} else {
					@Pc(146) int local146 = 4096 - local92;
					local47[local81] = local146 * local75[local81] + local92 * local55[local81] >> 12;
					local51[local81] = local67[local81] * local146 + local63[local81] * local92 >> 12;
					local59[local81] = local71[local81] * local92 + local79[local81] * local146 >> 12;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.aBoolean424 = arg0.method2595() == 1;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(27) int[] local27 = this.method4570(arg0, 0);
			@Pc(33) int[] local33 = this.method4570(arg0, 1);
			@Pc(39) int[] local39 = this.method4570(arg0, 2);
			for (@Pc(41) int local41 = 0; local41 < Static299.anInt5670; local41++) {
				@Pc(48) int local48 = local39[local41];
				if (local48 == 4096) {
					local17[local41] = local27[local41];
				} else if (local48 == 0) {
					local17[local41] = local33[local41];
				} else {
					local17[local41] = local48 * local27[local41] + (4096 - local48) * local33[local41] >> 12;
				}
			}
		}
		return local17;
	}
}
