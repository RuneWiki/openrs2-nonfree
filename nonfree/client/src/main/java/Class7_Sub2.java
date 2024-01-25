import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class7_Sub2 extends Class7 implements Interface18 {

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!ia;IZ[[I)V")
	public Class7_Sub2(@OriginalArg(0) Class15_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static492.aClass261_14, Static302.aClass200_11, arg1 * arg1 * 6, arg2);
		super.aClass15_Sub2_Sub1_10.method5414(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8225(local22 + 34069, arg1, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8227(), arg1, arg1, 0, Static282.method4862(super.aClass261_15), super.aClass15_Sub2_Sub1_10.anInt4275, arg3[local22], 0);
			}
		}
	}
}
