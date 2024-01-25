import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class102_Sub2 extends Class102 implements Interface15 {

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!lh;IZ[[I)V")
	public Class102_Sub2(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static189.aClass174_6, Static523.aClass306_15, arg1 * 6 * arg1, arg2);
		super.aClass62_Sub1_Sub2_10.method4676(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7445(arg1, arg1, local22 + 34069, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7444(), arg1, arg1, 0, Static546.method7437(super.aClass174_17), super.aClass62_Sub1_Sub2_10.anInt5782, arg3[local22], 0);
			}
		}
	}
}
