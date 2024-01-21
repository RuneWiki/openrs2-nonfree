import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class3_Sub2_Sub7 extends Class3_Sub2 {

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub7() {
		super(3, false);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(29) int[] local29 = this.method3328(2, arg0);
			@Pc(35) int[][] local35 = this.method3332(0, arg0);
			@Pc(41) int[][] local41 = this.method3332(1, arg0);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[1];
			@Pc(61) int[] local61 = local35[0];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static190.anInt3865; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local61[local79];
					local49[local79] = local57[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(140) int local140 = 4096 - local85;
					local45[local79] = local61[local79] * local85 + local69[local79] * local140 >> 12;
					local49[local79] = local85 * local57[local79] + local140 * local73[local79] >> 12;
					local53[local79] = local65[local79] * local85 + local140 * local77[local79] >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(29) int[] local29 = this.method3328(0, arg0);
			@Pc(35) int[] local35 = this.method3328(1, arg0);
			@Pc(41) int[] local41 = this.method3328(2, arg0);
			for (@Pc(43) int local43 = 0; local43 < Static190.anInt3865; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local11[local43] = local29[local43];
				} else if (local49 == 0) {
					local11[local43] = local35[local43];
				} else {
					local11[local43] = local49 * local29[local43] + (4096 - local49) * local35[local43] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean190 = arg0.method1278() == 1;
		}
	}
}
