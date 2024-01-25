import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class38_Sub2 extends Class38 implements Interface19 {

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lclient!bga;IZ[[I)V")
	public Class38_Sub2(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static354.aClass375_31, Static29.aClass26_4, arg1 * 6 * arg1, arg2);
		super.aClass20_Sub2_Sub2_12.method1484(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8293(arg1, arg1, arg3[local22], local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8288(), arg1, arg1, 0, Static209.method4123(super.aClass375_46), super.aClass20_Sub2_Sub2_12.anInt1667, arg3[local22], 0);
			}
		}
	}
}
