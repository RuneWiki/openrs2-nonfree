import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class32_Sub4 extends Class32 implements Interface22 {

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!tia;IZ[[I)V")
	public Class32_Sub4(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static171.aClass358_12, Static104.aClass86_8, arg1 * arg1 * 6, arg2);
		super.aClass100_Sub1_Sub2_11.method7923(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8906(arg1, arg3[local22], arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8898(), arg1, arg1, 0, Static298.method4688(super.aClass358_17), super.aClass100_Sub1_Sub2_11.anInt9359, arg3[local22], 0);
			}
		}
	}
}
