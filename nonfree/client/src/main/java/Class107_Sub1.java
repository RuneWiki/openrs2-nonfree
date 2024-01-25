import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fka")
public final class Class107_Sub1 extends Class107 implements Interface26 {

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!fc;IZ[[I)V")
	public Class107_Sub1(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static584.aClass244_9, Static114.aClass79_7, arg1 * arg1 * 6, arg2);
		super.aClass101_Sub1_Sub1_12.method5909(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method9098(arg1, local22 + 34069, arg3[local22], arg1);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method9092(), arg1, arg1, 0, Static410.method6767(super.aClass244_14), super.aClass101_Sub1_Sub1_12.anInt3368, arg3[local22], 0);
			}
		}
	}
}
