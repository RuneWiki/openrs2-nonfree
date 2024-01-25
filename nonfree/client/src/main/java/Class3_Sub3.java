import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
	private int anInt2040 = -1;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
	private int anInt2043 = -1;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
	public final int anInt2042;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!uca;IIZ[[BI)V")
	public Class3_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt2042 = arg2;
		super.aClass162_Sub3_33.method6911(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6725, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5571(true);
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!uca;IIZ[[I)V")
	public Class3_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt2042 = arg2;
		super.aClass162_Sub3_33.method6911(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static306.method4398(super.aClass162_Sub3_33.anInt8702, arg2, arg4[local30], arg2, super.anInt6725, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6725, arg2, arg2, 0, 32993, super.aClass162_Sub3_33.anInt8702, arg4[local30], 0);
			}
		}
		this.method5571(true);
	}

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lclient!uca;II)V")
	public Class3_Sub3(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt2042 = arg2;
		super.aClass162_Sub3_33.method6911(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6725, arg2, arg2, 0, Static472.method6125(super.anInt6725), 5121, null, 0);
		}
		this.method5571(true);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	@Override
	public void method5566() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2043, this.anInt2040, 3553, 0, 0);
		this.anInt2040 = -1;
		this.anInt2043 = -1;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IBIII)V")
	public void method1698(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt6724, 0);
		this.anInt2040 = arg1;
		this.anInt2043 = arg0;
	}
}
