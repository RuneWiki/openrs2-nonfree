import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class30_Sub4 extends Class30 implements Interface25 {

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!ai;IZ[[I)V")
	public Class30_Sub4(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static456.aClass366_9, Static258.aClass160_9, arg1 * arg1 * 6, arg2);
		super.aClass16_Sub1_Sub1_12.method3889(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7914(arg1, local22 + 34069, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7917(), arg1, arg1, 0, Static215.method4064(super.aClass366_13), super.aClass16_Sub1_Sub1_12.anInt775, arg3[local22], 0);
			}
		}
	}
}
