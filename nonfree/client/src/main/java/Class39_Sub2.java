import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class39_Sub2 extends Class39 implements Interface7 {

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lclient!lt;IZ[[I)V")
	public Class39_Sub2(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static557.aClass145_14, Static438.aClass261_14, arg1 * 6 * arg1, arg2);
		super.aClass67_Sub1_Sub2_12.method5612(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method9260(arg3[local22], arg1, local22 + 34069, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method9264(), arg1, arg1, 0, Static235.method3664(super.aClass145_16), super.aClass67_Sub1_Sub2_12.anInt6778, arg3[local22], 0);
			}
		}
	}
}
