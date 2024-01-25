import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class39_Sub3 extends Class39 {

	@OriginalMember(owner = "client!ew", name = "y", descriptor = "I")
	private int anInt2804 = -1;

	@OriginalMember(owner = "client!ew", name = "C", descriptor = "I")
	private int anInt2808 = -1;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "I")
	public final int anInt2805;

	@OriginalMember(owner = "client!ew", name = "A", descriptor = "I")
	public final int anInt2806;

	@OriginalMember(owner = "client!ew", name = "B", descriptor = "I")
	public final int anInt2807;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!hk;IIII[BI)V")
	public Class39_Sub3(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt2805 = arg4;
		this.anInt2806 = arg3;
		this.anInt2807 = arg2;
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9936, 0, super.anInt9934, this.anInt2807, this.anInt2806, this.anInt2805, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8465(true);
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!hk;IIII)V")
	public Class39_Sub3(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt2807 = arg2;
		this.anInt2805 = arg4;
		this.anInt2806 = arg3;
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glTexImage3Dub(super.anInt9936, 0, super.anInt9934, this.anInt2807, this.anInt2806, this.anInt2805, 0, Static512.method7238(super.anInt9934), 5121, (byte[]) null, 0);
		this.method8465(true);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIIIIB)V")
	public void method2573(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		super.aClass16_Sub2_39.method3620(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9936, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	@Override
	public void method8457() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2808, this.anInt2804, super.anInt9936, 0, 0, 0);
		this.anInt2804 = -1;
		this.anInt2808 = -1;
	}
}
