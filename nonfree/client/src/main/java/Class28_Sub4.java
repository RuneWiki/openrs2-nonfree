import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wja")
public final class Class28_Sub4 extends Class28 implements Interface20 {

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!md;IZ[[I)V")
	public Class28_Sub4(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static641.aClass260_12, Static18.aClass19_4, arg1 * 6 * arg1, arg2);
		super.aClass144_Sub1_Sub2_12.method5643(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method9351(arg1, local22 + 34069, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method9353(), arg1, arg1, 0, Static40.method669(super.aClass260_15), super.aClass144_Sub1_Sub2_12.anInt6620, arg3[local22], 0);
			}
		}
	}
}
