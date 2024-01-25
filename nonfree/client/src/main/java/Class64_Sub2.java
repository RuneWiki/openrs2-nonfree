import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!el", name = "v", descriptor = "I")
	private int anInt2503 = -1;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "I")
	private int anInt2504 = -1;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "I")
	public final int anInt2502;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!uja;IIZ[[I)V")
	public Class64_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2502 = arg2;
		super.aClass145_Sub3_27.method8872(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static14.method221(local30 + 34069, arg2, super.anInt4992, arg2, super.aClass145_Sub3_27.anInt10181, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt4992, arg2, arg2, 0, 32993, super.aClass145_Sub3_27.anInt10181, arg4[local30], 0);
			}
		}
		this.method4540(true);
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!uja;IIZ[[BI)V")
	public Class64_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt2502 = arg2;
		super.aClass145_Sub3_27.method8872(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4992, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4540(true);
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!uja;II)V")
	public Class64_Sub2(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt2502 = arg2;
		super.aClass145_Sub3_27.method8872(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4992, arg2, arg2, 0, Static100.method1532(super.anInt4992), 5121, (byte[]) null, 0);
		}
		this.method4540(true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
	@Override
	public void method4536() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt2503, this.anInt2504, 3553, 0, 0);
		this.anInt2503 = -1;
		this.anInt2504 = -1;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V")
	public void method2164(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt4988, 0);
		this.anInt2503 = arg0;
		this.anInt2504 = arg1;
	}
}
