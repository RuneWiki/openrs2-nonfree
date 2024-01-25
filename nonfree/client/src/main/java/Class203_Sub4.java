import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class203_Sub4 extends Class203 implements Interface14 {

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!jc;IZ[[I)V")
	public Class203_Sub4(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static435.aClass339_15, Static120.aClass89_7, arg1 * 6 * arg1, arg2);
		super.aClass65_Sub2_Sub2_10.method4426(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7705(arg1, local22 + 34069, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7709(), arg1, arg1, 0, Static111.method4956(super.aClass339_14), super.aClass65_Sub2_Sub2_10.anInt5364, arg3[local22], 0);
			}
		}
	}
}
