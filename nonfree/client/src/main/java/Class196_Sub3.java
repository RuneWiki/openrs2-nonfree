import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class196_Sub3 extends Class196 implements Interface13 {

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!dda;IZ[[I)V")
	public Class196_Sub3(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static7.aClass97_5, Static53.aClass42_4, arg1 * 6 * arg1, arg2);
		super.aClass44_Sub2_Sub1_12.method4265(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8278(arg1, arg1, local22 + 34069, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8276(), arg1, arg1, 0, Static445.method6846(super.aClass97_56), super.aClass44_Sub2_Sub1_12.anInt2122, arg3[local22], 0);
			}
		}
	}
}
