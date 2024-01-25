import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class7_Sub1 extends Class7 implements Interface17 {

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!nv;IZ[[I)V")
	public Class7_Sub1(@OriginalArg(0) Class33_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static220.aClass276_11, Static111.aClass79_7, arg1 * arg1 * 6, arg2);
		super.aClass33_Sub2_Sub1_12.method8159(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8622(local22 + 34069, arg1, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8616(), arg1, arg1, 0, Static36.method738(super.aClass276_19), super.aClass33_Sub2_Sub1_12.anInt6609, arg3[local22], 0);
			}
		}
	}
}
