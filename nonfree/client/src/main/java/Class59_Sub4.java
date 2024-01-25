import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class59_Sub4 extends Class59 implements Interface23 {

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!sb;IZ[[I)V")
	public Class59_Sub4(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[][] arg3) {
		super(arg0, 34067, Static393.aClass188_12, Static290.aClass189_11, arg1 * 6 * arg1, arg2);
		super.aClass95_Sub3_Sub2_8.method7112(this);
		@Pc(22) int local22;
		if (arg2) {
			for (local22 = 0; local22 < 6; local22++) {
				this.method4768(arg1, arg1, arg3[local22], local22 + 34069);
			}
		} else {
			for (local22 = 0; local22 < 6; local22++) {
				OpenGL.glTexImage2Di(local22 + 34069, 0, this.method4765(), arg1, arg1, 0, Static269.method3772(super.aClass188_10), super.aClass95_Sub3_Sub2_8.anInt8480, arg3[local22], 0);
			}
		}
	}
}
