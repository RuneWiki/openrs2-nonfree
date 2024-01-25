import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class105_Sub4 extends Class105 implements Interface24 {

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!ck;IZ[[I)V")
	public Class105_Sub4(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static333.aClass82_9, Static137.aClass89_8, arg1 * 6 * arg1, arg2);
		super.aClass33_Sub1_Sub1_10.method1987(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7295(arg3[local22], arg1, arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7307(), arg1, arg1, 0, Static341.method5637(super.aClass82_15), super.aClass33_Sub1_Sub1_10.anInt1756, arg3[local22], 0);
			}
		}
	}
}
