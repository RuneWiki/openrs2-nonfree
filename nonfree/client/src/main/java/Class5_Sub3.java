import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class5_Sub3 extends Class5 implements Interface11 {

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!ad;IZ[[I)V")
	public Class5_Sub3(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static151.aClass161_6, Static424.aClass273_12, arg1 * 6 * arg1, arg2);
		super.aClass7_Sub1_Sub1_11.method5694(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7360(local22 + 34069, arg1, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7363(), arg1, arg1, 0, Static546.method7654(super.aClass161_18), super.aClass7_Sub1_Sub1_11.anInt721, arg3[local22], 0);
			}
		}
	}
}
