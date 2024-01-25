import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lha")
public final class Class48_Sub3 extends Class48 implements Interface18 {

	@OriginalMember(owner = "client!lha", name = "<init>", descriptor = "(Lclient!laa;IZ[[I)V")
	public Class48_Sub3(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static208.aClass281_10, Static385.aClass247_14, arg1 * 6 * arg1, arg2);
		super.aClass126_Sub2_Sub1_12.method5449(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7622(arg3[local22], local22 + 34069, arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7616(), arg1, arg1, 0, Static350.method5350(super.aClass281_18), super.aClass126_Sub2_Sub1_12.anInt5452, arg3[local22], 0);
			}
		}
	}
}
