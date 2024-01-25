import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class150_Sub2 extends Class150 implements Interface18 {

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!hj;IZ[[I)V")
	public Class150_Sub2(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static95.aClass168_2, Static280.aClass182_8, arg1 * 6 * arg1, arg2);
		super.aClass82_Sub3_Sub1_11.method4972(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8494(arg1, arg1, local22 + 34069, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8493(), arg1, arg1, 0, Static383.method8680(super.aClass168_15), super.aClass82_Sub3_Sub1_11.anInt4414, arg3[local22], 0);
			}
		}
	}
}
