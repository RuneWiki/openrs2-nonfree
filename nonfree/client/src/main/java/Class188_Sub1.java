import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class188_Sub1 extends Class188 implements Interface3 {

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!kd;IZ[[I)V")
	public Class188_Sub1(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static225.aClass366_3, Static42.aClass35_4, arg1 * 6 * arg1, arg2);
		super.aClass162_Sub1_Sub2_12.method3865(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7384(arg3[local22], local22 + 34069, arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7377(), arg1, arg1, 0, Static280.method4043(super.aClass366_14), super.aClass162_Sub1_Sub2_12.anInt4711, arg3[local22], 0);
			}
		}
	}
}
