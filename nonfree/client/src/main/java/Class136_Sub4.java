import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class136_Sub4 extends Class136 implements Interface22 {

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!eea;IZ[[I)V")
	public Class136_Sub4(@OriginalArg(0) Class87_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static524.aClass187_15, Static545.aClass324_12, arg1 * 6 * arg1, arg2);
		super.aClass87_Sub1_Sub1_9.method5079(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method7145(arg1, arg3[local22], arg1, local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method7146(), arg1, arg1, 0, Static253.method4172(super.aClass187_14), super.aClass87_Sub1_Sub1_9.anInt2786, arg3[local22], 0);
			}
		}
	}
}
