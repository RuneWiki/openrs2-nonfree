import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class73_Sub2 extends Class73 implements Interface6 {

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!mr;IZ[[I)V")
	public Class73_Sub2(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static469.aClass314_11, Static471.aClass298_15, arg1 * 6 * arg1, arg2);
		super.aClass45_Sub2_Sub2_10.method4926(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method5958(arg1, arg3[local22], local22 + 34069, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method5957(), arg1, arg1, 0, Static537.method7176(super.aClass314_18), super.aClass45_Sub2_Sub2_10.anInt5961, arg3[local22], 0);
			}
		}
	}
}
