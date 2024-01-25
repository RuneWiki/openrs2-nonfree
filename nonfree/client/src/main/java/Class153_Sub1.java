import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class153_Sub1 extends Class153 implements Interface1 {

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!og;IZ[[I)V")
	public Class153_Sub1(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static92.aClass255_3, Static314.aClass206_12, arg1 * arg1 * 6, arg2);
		super.aClass143_Sub1_Sub2_10.method6338(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7440(arg1, arg3[local22], arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7446(), arg1, arg1, 0, Static517.method7337(super.aClass255_22), super.aClass143_Sub1_Sub2_10.anInt7508, arg3[local22], 0);
			}
		}
	}
}
