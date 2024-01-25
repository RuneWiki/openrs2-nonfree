import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class40_Sub3 extends Class40 implements Interface20 {

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!oia;IZ[[I)V")
	public Class40_Sub3(@OriginalArg(0) Class16_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static264.aClass361_8, Static553.aClass330_14, arg1 * 6 * arg1, arg2);
		super.aClass16_Sub1_Sub2_7.method6197(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method5711(arg3[local22], arg1, local22 + 34069, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method5712(), arg1, arg1, 0, Static299.method4638(super.aClass361_13), super.aClass16_Sub1_Sub2_7.anInt7565, arg3[local22], 0);
			}
		}
	}
}
