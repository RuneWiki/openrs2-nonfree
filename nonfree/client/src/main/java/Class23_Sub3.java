import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qfa")
public final class Class23_Sub3 extends Class23 implements Interface24 {

	@OriginalMember(owner = "client!qfa", name = "<init>", descriptor = "(Lclient!rda;IZ[[I)V")
	public Class23_Sub3(@OriginalArg(0) Class57_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static412.aClass114_17, Static453.aClass278_13, arg1 * arg1 * 6, arg2);
		super.aClass57_Sub3_Sub1_12.method7813(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8311(arg3[local22], local22 + 34069, arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8310(), arg1, arg1, 0, Static446.method6638(super.aClass114_20), super.aClass57_Sub3_Sub1_12.anInt8653, arg3[local22], 0);
			}
		}
	}
}
