import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class19_Sub2 extends Class19 implements Interface20 {

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!jq;IZ[[I)V")
	public Class19_Sub2(@OriginalArg(0) Class43_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static581.aClass93_14, Static461.aClass292_14, arg1 * 6 * arg1, arg2);
		super.aClass43_Sub1_Sub2_12.method4298(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7427(arg1, local22 + 34069, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7428(), arg1, arg1, 0, Static428.method1615(super.aClass93_12), super.aClass43_Sub1_Sub2_12.anInt4926, arg3[local22], 0);
			}
		}
	}
}
