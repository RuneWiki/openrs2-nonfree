import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nv")
public final class Class14_Sub4 extends Class14 implements Interface8 {

	@OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lclient!hp;IZ[[I)V")
	public Class14_Sub4(@OriginalArg(0) Class134_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static129.aClass203_5, Static215.aClass155_10, arg1 * 6 * arg1, arg2);
		super.aClass134_Sub1_Sub1_9.method6766(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method4937(arg3[local22], arg1, arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method4925(), arg1, arg1, 0, Static28.method321(super.aClass203_12), super.aClass134_Sub1_Sub1_9.anInt3985, arg3[local22], 0);
			}
		}
	}
}
