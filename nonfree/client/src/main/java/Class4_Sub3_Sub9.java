import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class4_Sub3_Sub9 extends Class4_Sub3 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(23) int[] local23 = this.method3149(arg0, 2);
			@Pc(29) int[][] local29 = this.method3150(0, arg0);
			@Pc(35) int[][] local35 = this.method3150(1, arg0);
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local29[1];
			@Pc(51) int[] local51 = local29[0];
			@Pc(55) int[] local55 = local13[2];
			@Pc(59) int[] local59 = local29[2];
			@Pc(63) int[] local63 = local35[0];
			@Pc(67) int[] local67 = local35[2];
			@Pc(71) int[] local71 = local35[1];
			for (@Pc(73) int local73 = 0; local73 < Static134.anInt3188; local73++) {
				@Pc(79) int local79 = local23[local73];
				if (local79 == 4096) {
					local39[local73] = local51[local73];
					local43[local73] = local47[local73];
					local55[local73] = local59[local73];
				} else if (local79 == 0) {
					local39[local73] = local63[local73];
					local43[local73] = local71[local73];
					local55[local73] = local67[local73];
				} else {
					@Pc(91) int local91 = 4096 - local79;
					local39[local73] = local63[local73] * local91 + local51[local73] * local79 >> 12;
					local43[local73] = local47[local73] * local79 + local91 * local71[local73] >> 12;
					local55[local73] = local79 * local59[local73] + local91 * local67[local73] >> 12;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			super.aBoolean170 = arg1.method1253() == 1;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(29) int[] local29 = this.method3149(arg0, 0);
			@Pc(35) int[] local35 = this.method3149(arg0, 1);
			@Pc(41) int[] local41 = this.method3149(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static134.anInt3188; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = local49 * local29[local43] + (4096 - local49) * local35[local43] >> 12;
				}
			}
		}
		return local19;
	}
}
