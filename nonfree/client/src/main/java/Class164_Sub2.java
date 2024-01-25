import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public final class Class164_Sub2 extends Class164 {

	@OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
	private int anInt5248 = -1;

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
	private int anInt5255 = -1;

	@OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
	public final int anInt5250;

	@OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
	public final int anInt5251;

	@OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
	public final int anInt5252;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!mh;IIII)V")
	public Class164_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt5250 = arg3;
		this.anInt5251 = arg4;
		this.anInt5252 = arg2;
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glTexImage3Dub(super.anInt9448, 0, super.anInt9461, this.anInt5252, this.anInt5250, this.anInt5251, 0, Static514.method7865(super.anInt9461), 5121, null, 0);
		this.method8154(true);
	}

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lclient!mh;IIII[BI)V")
	public Class164_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt5251 = arg4;
		this.anInt5250 = arg3;
		this.anInt5252 = arg2;
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9448, 0, super.anInt9461, this.anInt5252, this.anInt5250, this.anInt5251, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8154(true);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIZI)V")
	public void method4850(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(7) int arg2) {
		super.aClass4_Sub3_43.method5250(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9448, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	@Override
	public void method8143() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt5248, this.anInt5255, super.anInt9448, 0, 0, 0);
		this.anInt5255 = -1;
		this.anInt5248 = -1;
	}
}
