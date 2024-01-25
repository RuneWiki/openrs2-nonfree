import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class19_Sub4 extends Class19 implements Interface18 {

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lclient!bea;IZ[[I)V")
	public Class19_Sub4(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static18.aClass245_3, Static331.aClass204_13, arg1 * 6 * arg1, arg2);
		super.aClass31_Sub1_Sub1_7.method7129(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method3097(arg3[local22], local22 + 34069, arg1, arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method3094(), arg1, arg1, 0, Static580.method7901(super.aClass245_10), super.aClass31_Sub1_Sub1_7.anInt1093, arg3[local22], 0);
			}
		}
	}
}
