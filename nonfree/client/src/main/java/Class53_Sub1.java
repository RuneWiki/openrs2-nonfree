import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jga")
public final class Class53_Sub1 extends Class53 implements Interface22 {

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lclient!dc;IZ[[I)V")
	public Class53_Sub1(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static85.aClass141_2, Static349.aClass239_12, arg1 * arg1 * 6, arg2);
		super.aClass66_Sub1_Sub1_10.method6979(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method6771(local22 + 34069, arg3[local22], arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method6770(), arg1, arg1, 0, Static241.method4095(super.aClass141_15), super.aClass66_Sub1_Sub1_10.anInt2250, arg3[local22], 0);
			}
		}
	}
}
