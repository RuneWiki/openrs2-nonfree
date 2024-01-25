import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class197_Sub3 extends Class197 implements Interface19 {

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!tk;IZ[[I)V")
	public Class197_Sub3(@OriginalArg(0) Class13_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static78.aClass104_3, Static638.aClass381_15, arg1 * 6 * arg1, arg2);
		super.aClass13_Sub3_Sub1_12.method8234(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8819(arg1, local22 + 34069, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8826(), arg1, arg1, 0, Static626.method8676(super.aClass104_19), super.aClass13_Sub3_Sub1_12.anInt9186, arg3[local22], 0);
			}
		}
	}
}
