import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class5_Sub2_Sub7 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub7() {
		super(3, false);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean834 = arg0.method8645() == 1;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(IZ)[[I")
	@Override
	public int[][] method8827(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass370_41.method8551(arg0);
		if (super.aClass370_41.aBoolean819) {
			@Pc(29) int[] local29 = this.method8821(arg0, 2);
			@Pc(35) int[][] local35 = this.method8823(arg0, 0);
			@Pc(41) int[][] local41 = this.method8823(arg0, 1);
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			@Pc(57) int[] local57 = local35[0];
			@Pc(61) int[] local61 = local35[1];
			@Pc(65) int[] local65 = local35[2];
			@Pc(69) int[] local69 = local41[0];
			@Pc(73) int[] local73 = local41[1];
			@Pc(77) int[] local77 = local41[2];
			for (@Pc(79) int local79 = 0; local79 < Static314.anInt6320; local79++) {
				@Pc(85) int local85 = local29[local79];
				if (local85 == 4096) {
					local45[local79] = local57[local79];
					local49[local79] = local61[local79];
					local53[local79] = local65[local79];
				} else if (local85 == 0) {
					local45[local79] = local69[local79];
					local49[local79] = local73[local79];
					local53[local79] = local77[local79];
				} else {
					@Pc(140) int local140 = 4096 - local85;
					local45[local79] = local69[local79] * local140 + local57[local79] * local85 >> 12;
					local49[local79] = local140 * local73[local79] + local85 * local61[local79] >> 12;
					local53[local79] = local85 * local65[local79] + local77[local79] * local140 >> 12;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			@Pc(29) int[] local29 = this.method8821(arg0, 0);
			@Pc(35) int[] local35 = this.method8821(arg0, 1);
			@Pc(41) int[] local41 = this.method8821(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static314.anInt6320; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local19[local43] = local29[local43];
				} else if (local49 == 0) {
					local19[local43] = local35[local43];
				} else {
					local19[local43] = (4096 - local49) * local35[local43] + local49 * local29[local43] >> 12;
				}
			}
		}
		return local19;
	}
}
