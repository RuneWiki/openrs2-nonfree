import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class23_Sub1 extends Class23 implements Interface9 {

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Lclient!oaa;IZ[[I)V")
	public Class23_Sub1(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static169.aClass265_9, Static417.aClass250_14, arg1 * arg1 * 6, arg2);
		super.aClass132_Sub1_Sub1_12.method7635(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method8245(arg1, local22 + 34069, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method8248(), arg1, arg1, 0, Static233.method3518(super.aClass265_17), super.aClass132_Sub1_Sub1_12.anInt7181, arg3[local22], 0);
			}
		}
	}
}
