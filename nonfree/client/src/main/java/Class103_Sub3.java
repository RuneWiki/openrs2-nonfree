import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public final class Class103_Sub3 extends Class103 implements Interface20 {

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lclient!lm;IZ[[I)V")
	public Class103_Sub3(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static356.aClass88_11, Static47.aClass42_4, arg1 * 6 * arg1, arg2);
		super.aClass100_Sub1_Sub2_12.method4876(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7051(arg1, local22 + 34069, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7057(), arg1, arg1, 0, Static314.method7316(super.aClass88_14), super.aClass100_Sub1_Sub2_12.anInt5876, arg3[local22], 0);
			}
		}
	}
}
