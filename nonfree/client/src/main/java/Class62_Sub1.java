import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!gh", name = "A", descriptor = "I")
	private int anInt2654 = -1;

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "I")
	private int anInt2655 = -1;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "I")
	public final int anInt2651;

	@OriginalMember(owner = "client!gh", name = "z", descriptor = "I")
	public final int anInt2653;

	@OriginalMember(owner = "client!gh", name = "H", descriptor = "I")
	public final int anInt2660;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!bt;IIII[BI)V")
	public Class62_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt2651 = arg4;
		this.anInt2653 = arg3;
		this.anInt2660 = arg2;
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6644, 0, super.anInt6634, this.anInt2660, this.anInt2653, this.anInt2651, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5349(true);
	}

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!bt;IIII)V")
	public Class62_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt2651 = arg4;
		this.anInt2653 = arg3;
		this.anInt2660 = arg2;
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glTexImage3Dub(super.anInt6644, 0, super.anInt6634, this.anInt2660, this.anInt2653, this.anInt2651, 0, Static311.method4741(super.anInt6634), 5121, null, 0);
		this.method5349(true);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V")
	@Override
	public void method5348() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2655, this.anInt2654, super.anInt6644, 0, 0, 0);
		this.anInt2655 = -1;
		this.anInt2654 = -1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIIIIII)V")
	public void method2397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass30_Sub1_40.method730(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6644, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}
}
