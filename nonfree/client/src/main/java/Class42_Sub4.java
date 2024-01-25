import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class42_Sub4 extends Class42 {

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
	private int anInt6246 = -1;

	@OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
	private int anInt6248 = -1;

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
	public final int anInt6250;

	@OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
	public final int anInt6247;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
	public final int anInt6252;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!gk;IIII[BI)V")
	public Class42_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt6250 = arg3;
		this.anInt6247 = arg4;
		this.anInt6252 = arg2;
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6241, 0, super.anInt6239, this.anInt6252, this.anInt6250, this.anInt6247, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4910(true);
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!gk;IIII)V")
	public Class42_Sub4(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6250 = arg3;
		this.anInt6247 = arg4;
		this.anInt6252 = arg2;
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glTexImage3Dub(super.anInt6241, 0, super.anInt6239, this.anInt6252, this.anInt6250, this.anInt6247, 0, Static142.method2552(super.anInt6239), 5121, null, 0);
		this.method4910(true);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	@Override
	public void method4908() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt6248, this.anInt6246, super.anInt6241, 0, 0, 0);
		this.anInt6248 = -1;
		this.anInt6246 = -1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIZIIII)V")
	public void method4921(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		super.aClass75_Sub2_37.method2456(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6241, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}
}
