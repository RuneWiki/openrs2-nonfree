import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gaa")
public final class Class111_Sub1 extends Class111 implements Interface3 {

	@OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lclient!mba;IZ[[I)V")
	public Class111_Sub1(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static502.aClass182_14, Static637.aClass376_16, arg1 * 6 * arg1, arg2);
		super.aClass5_Sub1_Sub2_6.method5609(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method4562(arg1, local22 + 34069, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method4561(), arg1, arg1, 0, Static419.method6584(super.aClass182_10), super.aClass5_Sub1_Sub2_6.anInt6638, arg3[local22], 0);
			}
		}
	}
}
