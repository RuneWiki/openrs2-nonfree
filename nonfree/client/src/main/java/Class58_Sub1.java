import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class58_Sub1 extends Class58 implements Interface11 {

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!tm;IZ[[I)V")
	public Class58_Sub1(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static171.aClass110_13, Static517.aClass308_15, arg1 * arg1 * 6, arg2);
		super.aClass4_Sub2_Sub2_10.method7316(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7762(local22 + 34069, arg1, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7766(), arg1, arg1, 0, Static295.method5137(super.aClass110_23), super.aClass4_Sub2_Sub2_10.anInt8409, arg3[local22], 0);
			}
		}
	}
}
