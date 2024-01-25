import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class24_Sub2 extends Class24 implements Interface19 {

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Lclient!dga;IZ[[I)V")
	public Class24_Sub2(@OriginalArg(0) Class75_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static432.aClass155_45, Static435.aClass274_13, arg1 * arg1 * 6, arg2);
		super.aClass75_Sub1_Sub1_12.method6814(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8710(arg3[local22], local22 + 34069, arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8714(), arg1, arg1, 0, Static305.method5428(super.aClass155_59), super.aClass75_Sub1_Sub1_12.anInt2026, arg3[local22], 0);
			}
		}
	}
}
