import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hea")
public final class Class26_Sub2 extends Class26 implements Interface10 {

	@OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lclient!mc;IZ[[I)V")
	public Class26_Sub2(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static493.aClass171_15, Static407.aClass254_14, arg1 * 6 * arg1, arg2);
		super.aClass90_Sub3_Sub1_10.method7624(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7041(arg1, arg1, arg3[local22], local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7040(), arg1, arg1, 0, Static474.method6581(super.aClass171_16), super.aClass90_Sub3_Sub1_10.anInt6027, arg3[local22], 0);
			}
		}
	}
}
