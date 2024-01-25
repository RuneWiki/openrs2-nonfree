import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public final class Class88_Sub2 extends Class88 implements Interface7 {

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ph;IZ[[I)V")
	public Class88_Sub2(@OriginalArg(0) Class122_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static542.aClass292_17, Static431.aClass264_15, arg1 * 6 * arg1, arg2);
		super.aClass122_Sub2_Sub2_10.method5651(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7308(arg3[local22], arg1, arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7309(), arg1, arg1, 0, Static168.method4654(super.aClass292_16), super.aClass122_Sub2_Sub2_10.anInt6812, arg3[local22], 0);
			}
		}
	}
}
