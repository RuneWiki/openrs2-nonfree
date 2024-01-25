import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public final class Class137_Sub2 extends Class137 {

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
	private int anInt4025 = -1;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
	private int anInt4031 = -1;

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
	public final int anInt4029;

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
	public final int anInt4026;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	public final int anInt4024;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!nq;IIII[BI)V")
	public Class137_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt4029 = arg3;
		this.anInt4026 = arg2;
		this.anInt4024 = arg4;
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7136, 0, super.anInt7134, this.anInt4026, this.anInt4029, this.anInt4024, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5783(true);
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!nq;IIII)V")
	public Class137_Sub2(@OriginalArg(0) Class167_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt4026 = arg2;
		this.anInt4024 = arg4;
		this.anInt4029 = arg3;
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glTexImage3Dub(super.anInt7136, 0, super.anInt7134, this.anInt4026, this.anInt4029, this.anInt4024, 0, Static29.method4785(super.anInt7134), 5121, null, 0);
		this.method5783(true);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5778() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt4031, this.anInt4025, super.anInt7136, 0, 0, 0);
		this.anInt4025 = -1;
		this.anInt4031 = -1;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIII)V")
	public void method3432(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		super.aClass167_Sub1_43.method4028(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7136, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
