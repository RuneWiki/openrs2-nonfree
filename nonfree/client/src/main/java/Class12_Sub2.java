import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class12_Sub2 extends Class12 implements Interface19 {

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Lclient!el;IZ[[I)V")
	public Class12_Sub2(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static122.aClass219_7, Static239.aClass161_12, arg1 * arg1 * 6, arg2);
		super.aClass14_Sub2_Sub1_10.method7034(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7596(arg1, local22 + 34069, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7591(), arg1, arg1, 0, Static255.method4299(super.aClass219_15), super.aClass14_Sub2_Sub1_10.anInt2779, arg3[local22], 0);
			}
		}
	}
}
