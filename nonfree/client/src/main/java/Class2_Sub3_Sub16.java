import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class2_Sub3_Sub16 extends Class2_Sub3 {

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub16() {
		super(3, false);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(25) int[] local25 = this.method5700(2, arg0);
			@Pc(31) int[][] local31 = this.method5707(arg0, 0);
			@Pc(37) int[][] local37 = this.method5707(arg0, 1);
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			@Pc(53) int[] local53 = local31[0];
			@Pc(57) int[] local57 = local31[1];
			@Pc(61) int[] local61 = local31[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			for (@Pc(75) int local75 = 0; local75 < Static263.anInt5504; local75++) {
				@Pc(81) int local81 = local25[local75];
				if (local81 == 4096) {
					local41[local75] = local53[local75];
					local45[local75] = local57[local75];
					local49[local75] = local61[local75];
				} else if (local81 == 0) {
					local41[local75] = local65[local75];
					local45[local75] = local69[local75];
					local49[local75] = local73[local75];
				} else {
					@Pc(116) int local116 = 4096 - local81;
					local41[local75] = local81 * local53[local75] + local65[local75] * local116 >> 12;
					local45[local75] = local69[local75] * local116 + local57[local75] * local81 >> 12;
					local49[local75] = local73[local75] * local116 + local61[local75] * local81 >> 12;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(28) int[] local28 = this.method5700(0, arg0);
			@Pc(34) int[] local34 = this.method5700(1, arg0);
			@Pc(40) int[] local40 = this.method5700(2, arg0);
			for (@Pc(42) int local42 = 0; local42 < Static263.anInt5504; local42++) {
				@Pc(48) int local48 = local40[local42];
				if (local48 == 4096) {
					local16[local42] = local28[local42];
				} else if (local48 == 0) {
					local16[local42] = local34[local42];
				} else {
					local16[local42] = local34[local42] * (4096 - local48) + local28[local42] * local48 >> 12;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			super.aBoolean606 = arg1.method3124() == 1;
		}
	}
}
