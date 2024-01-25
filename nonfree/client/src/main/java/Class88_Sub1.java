import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public final class Class88_Sub1 extends Class88 {

	@OriginalMember(owner = "client!efa", name = "x", descriptor = "I")
	private int anInt2857 = -1;

	@OriginalMember(owner = "client!efa", name = "F", descriptor = "I")
	private int anInt2863 = -1;

	@OriginalMember(owner = "client!efa", name = "I", descriptor = "I")
	public final int anInt2865;

	@OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
	public final int anInt2858;

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
	public final int anInt2856;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!oea;IIII[BI)V")
	public Class88_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2865 = arg2;
		this.anInt2858 = arg4;
		this.anInt2856 = arg3;
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8317, 0, super.anInt8313, this.anInt2865, this.anInt2856, this.anInt2858, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6981(true);
	}

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!oea;IIII)V")
	public Class88_Sub1(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt2856 = arg3;
		this.anInt2858 = arg4;
		this.anInt2865 = arg2;
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glTexImage3Dub(super.anInt8317, 0, super.anInt8313, this.anInt2865, this.anInt2856, this.anInt2858, 0, Static471.method6784(super.anInt8313), 5121, null, 0);
		this.method6981(true);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZIIIIIII)V")
	public void method2464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		super.aClass87_Sub2_32.method6167(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8317, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
	@Override
	public void method6980() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2857, this.anInt2863, super.anInt8317, 0, 0, 0);
		this.anInt2863 = -1;
		this.anInt2857 = -1;
	}
}
