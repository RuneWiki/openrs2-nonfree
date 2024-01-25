import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class1_Sub4 extends Class1 {

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
	private int anInt5575 = -1;

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
	private int anInt5574 = -1;

	@OriginalMember(owner = "client!pp", name = "N", descriptor = "I")
	public final int anInt5576;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
	public final int anInt5568;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
	public final int anInt5567;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!bv;IIII[BI)V")
	public Class1_Sub4(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt5576 = arg3;
		this.anInt5568 = arg2;
		this.anInt5567 = arg4;
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5564, 0, super.anInt5551, this.anInt5568, this.anInt5576, this.anInt5567, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4273(true);
	}

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!bv;IIII)V")
	public Class1_Sub4(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt5567 = arg4;
		this.anInt5576 = arg3;
		this.anInt5568 = arg2;
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glTexImage3Dub(super.anInt5564, 0, super.anInt5551, this.anInt5568, this.anInt5576, this.anInt5567, 0, Static4.method121(super.anInt5551), 5121, null, 0);
		this.method4273(true);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
	@Override
	public void method4264() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt5575, this.anInt5574, super.anInt5564, 0, 0, 0);
		this.anInt5574 = -1;
		this.anInt5575 = -1;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIII)V")
	public void method4281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		super.aClass30_Sub1_36.method916(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5564, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}
}
