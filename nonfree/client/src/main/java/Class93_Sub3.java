import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class93_Sub3 extends Class93 implements Interface10 {

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!pa;IZ[[I)V")
	public Class93_Sub3(@OriginalArg(0) Class13_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static419.aClass327_2, Static246.aClass152_10, arg1 * arg1 * 6, arg2);
		super.aClass13_Sub1_Sub1_11.method7530(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8150(arg3[local22], local22 + 34069, arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8144(), arg1, arg1, 0, Static282.method4524(super.aClass327_16), super.aClass13_Sub1_Sub1_11.anInt7382, arg3[local22], 0);
			}
		}
	}
}
