import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class53_Sub2 extends Class53 implements Interface18 {

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lclient!om;IZ[[I)V")
	public Class53_Sub2(@OriginalArg(0) Class133_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static576.aClass223_16, Static20.aClass19_4, arg1 * arg1 * 6, arg2);
		super.aClass133_Sub1_Sub2_9.method6153(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method4630(arg3[local22], arg1, arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method4634(), arg1, arg1, 0, Static117.method1781(super.aClass223_11), super.aClass133_Sub1_Sub2_9.anInt7107, arg3[local22], 0);
			}
		}
	}
}
