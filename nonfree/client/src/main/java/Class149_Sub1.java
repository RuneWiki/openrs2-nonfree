import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class149_Sub1 extends Class149 implements Interface11 {

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Lclient!tba;IZ[[I)V")
	public Class149_Sub1(@OriginalArg(0) Class78_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static429.aClass271_12, Static243.aClass172_9, arg1 * arg1 * 6, arg2);
		super.aClass78_Sub1_Sub2_11.method6931(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7304(local22 + 34069, arg1, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7302(), arg1, arg1, 0, Static267.method3896(super.aClass271_13), super.aClass78_Sub1_Sub2_11.anInt8681, arg3[local22], 0);
			}
		}
	}
}
