import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!daa")
public final class Class61_Sub1 extends Class61 implements Interface22 {

	@OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(Lclient!mc;IZ[[I)V")
	public Class61_Sub1(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static255.aClass214_8, Static108.aClass82_8, arg1 * 6 * arg1, arg2);
		super.aClass121_Sub2_Sub1_5.method7167(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method5542(arg3[local22], arg1, arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method5535(), arg1, arg1, 0, Static564.method7708(super.aClass214_12), super.aClass121_Sub2_Sub1_5.anInt5463, arg3[local22], 0);
			}
		}
	}
}
