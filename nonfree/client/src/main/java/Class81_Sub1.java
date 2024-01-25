import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class81_Sub1 extends Class81 implements Interface22 {

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!nfa;IZ[[I)V")
	public Class81_Sub1(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static487.aClass333_15, Static336.aClass220_12, arg1 * 6 * arg1, arg2);
		super.aClass9_Sub3_Sub2_10.method5494(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7741(arg1, local22 + 34069, arg1, arg3[local22]);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7742(), arg1, arg1, 0, Static290.method4775(super.aClass333_16), super.aClass9_Sub3_Sub2_10.anInt6644, arg3[local22], 0);
			}
		}
	}
}
