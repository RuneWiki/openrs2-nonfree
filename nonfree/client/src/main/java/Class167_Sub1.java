import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class167_Sub1 extends Class167 {

	@OriginalMember(owner = "client!io", name = "D", descriptor = "I")
	private int anInt4400 = -1;

	@OriginalMember(owner = "client!io", name = "G", descriptor = "I")
	private int anInt4403 = -1;

	@OriginalMember(owner = "client!io", name = "F", descriptor = "I")
	public final int anInt4402;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!rs;IIZ[[I)V")
	public Class167_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4402 = arg2;
		super.aClass133_Sub3_34.method7375(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static113.method1741(arg4[local30], arg2, super.anInt9261, arg2, super.aClass133_Sub3_34.anInt8566, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9261, arg2, arg2, 0, 32993, super.aClass133_Sub3_34.anInt8566, arg4[local30], 0);
			}
		}
		this.method8013(true);
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!rs;IIZ[[BI)V")
	public Class167_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt4402 = arg2;
		super.aClass133_Sub3_34.method7375(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9261, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method8013(true);
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!rs;II)V")
	public Class167_Sub1(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt4402 = arg2;
		super.aClass133_Sub3_34.method7375(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9261, arg2, arg2, 0, Static48.method834(super.anInt9261), 5121, null, 0);
		}
		this.method8013(true);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIII)V")
	public void method3973(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt9272, 0);
		this.anInt4400 = arg0;
		this.anInt4403 = arg2;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
	@Override
	public void method8000() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4400, this.anInt4403, 3553, 0, 0);
		this.anInt4400 = -1;
		this.anInt4403 = -1;
	}
}
