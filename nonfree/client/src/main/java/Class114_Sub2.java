import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class114_Sub2 extends Class114 implements Interface19 {

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lclient!no;IZ[[I)V")
	public Class114_Sub2(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static203.aClass250_7, Static409.aClass242_13, arg1 * 6 * arg1, arg2);
		super.aClass100_Sub1_Sub2_10.method6033(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7835(arg3[local22], arg1, arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7828(), arg1, arg1, 0, Static124.method2047(super.aClass250_14), super.aClass100_Sub1_Sub2_10.anInt7250, arg3[local22], 0);
			}
		}
	}
}
