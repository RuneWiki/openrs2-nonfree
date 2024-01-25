import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kaa")
public final class Class8_Sub3 extends Class8 implements Interface20 {

	@OriginalMember(owner = "client!kaa", name = "<init>", descriptor = "(Lclient!gf;IZ[[I)V")
	public Class8_Sub3(@OriginalArg(0) Class5_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static468.aClass167_14, Static524.aClass310_16, arg1 * arg1 * 6, arg2);
		super.aClass5_Sub3_Sub1_9.method6416(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method6477(arg1, arg1, local22 + 34069, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method6479(), arg1, arg1, 0, Static88.method1793(super.aClass167_12), super.aClass5_Sub3_Sub1_9.anInt3688, arg3[local22], 0);
			}
		}
	}
}
