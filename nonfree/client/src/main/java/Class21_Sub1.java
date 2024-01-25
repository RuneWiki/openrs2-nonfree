import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	private int anInt420 = -1;

	@OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
	private int anInt425 = -1;

	@OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
	public final int anInt427;

	@OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
	public final int anInt421;

	@OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
	public final int anInt428;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!qg;IIII[BI)V")
	public Class21_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt427 = arg2;
		this.anInt421 = arg3;
		this.anInt428 = arg4;
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt4557, 0, super.anInt4549, this.anInt427, this.anInt421, this.anInt428, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3755(true);
	}

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lclient!qg;IIII)V")
	public Class21_Sub1(@OriginalArg(0) Class121_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt427 = arg2;
		this.anInt421 = arg3;
		this.anInt428 = arg4;
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glTexImage3Dub(super.anInt4557, 0, super.anInt4549, this.anInt427, this.anInt421, this.anInt428, 0, Static422.method1666(super.anInt4549), 5121, null, 0);
		this.method3755(true);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIIB)V")
	public void method353(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass121_Sub2_24.method4681(this);
		OpenGL.glCopyTexSubImage3D(super.anInt4557, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
	@Override
	public void method3747() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt420, this.anInt425, super.anInt4557, 0, 0, 0);
		this.anInt425 = -1;
		this.anInt420 = -1;
	}
}
