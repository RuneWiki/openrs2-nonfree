import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class111_Sub2 extends Class111 implements Interface7 {

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!sha;IZ[[I)V")
	public Class111_Sub2(@OriginalArg(0) Class95_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static21.aClass122_14, Static666.aClass389_16, arg1 * arg1 * 6, arg2);
		super.aClass95_Sub1_Sub1_12.method8147(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7464(arg1, arg3[local22], arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7471(), arg1, arg1, 0, Static450.method6089(super.aClass122_18), super.aClass95_Sub1_Sub1_12.anInt8944, arg3[local22], 0);
			}
		}
	}
}
