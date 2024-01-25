import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!haa")
public final class Class112_Sub1 extends Class112 implements Interface12 {

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!qi;IZ[[I)V")
	public Class112_Sub1(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static253.aClass297_5, Static554.aClass340_14, arg1 * 6 * arg1, arg2);
		super.aClass12_Sub2_Sub2_11.method6159(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7318(arg1, arg3[local22], arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7324(), arg1, arg1, 0, Static395.method5609(super.aClass297_14), super.aClass12_Sub2_Sub2_11.anInt7642, arg3[local22], 0);
			}
		}
	}
}
