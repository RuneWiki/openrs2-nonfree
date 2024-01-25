import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class13_Sub1 extends Class13 implements Interface1 {

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!vaa;IZ[[I)V")
	public Class13_Sub1(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static646.aClass335_14, Static259.aClass167_7, arg1 * arg1 * 6, arg2);
		super.aClass22_Sub2_Sub2_8.method8976(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method4744(arg1, arg1, local22 + 34069, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method4743(), arg1, arg1, 0, Static82.method1790(super.aClass335_8), super.aClass22_Sub2_Sub2_8.anInt10582, arg3[local22], 0);
			}
		}
	}
}
