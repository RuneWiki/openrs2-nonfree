import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class144_Sub1 extends Class144 implements Interface4 {

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!qba;IZ[[I)V")
	public Class144_Sub1(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static51.aClass150_1, Static268.aClass171_10, arg1 * 6 * arg1, arg2);
		super.aClass39_Sub2_Sub2_10.method6179(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7141(arg1, arg1, arg3[local22], local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7134(), arg1, arg1, 0, Static126.method6453(super.aClass150_15), super.aClass39_Sub2_Sub2_10.anInt7396, arg3[local22], 0);
			}
		}
	}
}
