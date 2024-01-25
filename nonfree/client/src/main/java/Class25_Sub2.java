import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class25_Sub2 extends Class25 implements Interface24 {

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lclient!hl;IZ[[I)V")
	public Class25_Sub2(@OriginalArg(0) Class5_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static120.aClass178_4, Static302.aClass176_8, arg1 * 6 * arg1, arg2);
		super.aClass5_Sub2_Sub2_12.method4008(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8620(arg1, arg3[local22], arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8616(), arg1, arg1, 0, Static360.method5822(super.aClass178_15), super.aClass5_Sub2_Sub2_12.anInt4984, arg3[local22], 0);
			}
		}
	}
}
