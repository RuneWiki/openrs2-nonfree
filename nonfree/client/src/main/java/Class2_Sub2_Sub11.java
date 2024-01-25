import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub11() {
		super(3, false);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean729 = arg0.method4325() == 1;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(29) int[] local29 = this.method7951(arg0, 0);
			@Pc(35) int[] local35 = this.method7951(arg0, 1);
			@Pc(41) int[] local41 = this.method7951(arg0, 2);
			for (@Pc(43) int local43 = 0; local43 < Static153.anInt3070; local43++) {
				@Pc(49) int local49 = local41[local43];
				if (local49 == 4096) {
					local11[local43] = local29[local43];
				} else if (local49 == 0) {
					local11[local43] = local35[local43];
				} else {
					local11[local43] = local35[local43] * (4096 - local49) + local49 * local29[local43] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7946(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass314_41.method7006(arg0);
		if (super.aClass314_41.aBoolean653) {
			@Pc(25) int[] local25 = this.method7951(arg0, 2);
			@Pc(31) int[][] local31 = this.method7947(0, arg0);
			@Pc(37) int[][] local37 = this.method7947(1, arg0);
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[1];
			@Pc(49) int[] local49 = local11[2];
			@Pc(53) int[] local53 = local31[0];
			@Pc(57) int[] local57 = local31[1];
			@Pc(61) int[] local61 = local31[2];
			@Pc(65) int[] local65 = local37[0];
			@Pc(69) int[] local69 = local37[1];
			@Pc(73) int[] local73 = local37[2];
			for (@Pc(75) int local75 = 0; local75 < Static153.anInt3070; local75++) {
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
					@Pc(114) int local114 = 4096 - local81;
					local41[local75] = local81 * local53[local75] + local114 * local65[local75] >> 12;
					local45[local75] = local81 * local57[local75] + local69[local75] * local114 >> 12;
					local49[local75] = local114 * local73[local75] + local81 * local61[local75] >> 12;
				}
			}
		}
		return local11;
	}
}
