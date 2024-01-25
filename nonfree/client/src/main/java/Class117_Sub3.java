import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class117_Sub3 extends Class117 implements Interface16 {

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Lclient!ko;IZ[[I)V")
	public Class117_Sub3(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static238.aClass363_4, Static47.aClass36_5, arg1 * 6 * arg1, arg2);
		super.aClass137_Sub1_Sub1_12.method8007(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method9027(arg1, local22 + 34069, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method9026(), arg1, arg1, 0, Static1.method8561(super.aClass363_16), super.aClass137_Sub1_Sub1_12.anInt5950, arg3[local22], 0);
			}
		}
	}
}
