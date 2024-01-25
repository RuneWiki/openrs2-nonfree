import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!bv", name = "J", descriptor = "I")
	private int anInt897 = -1;

	@OriginalMember(owner = "client!bv", name = "z", descriptor = "I")
	private int anInt902 = -1;

	@OriginalMember(owner = "client!bv", name = "G", descriptor = "I")
	public final int anInt892;

	@OriginalMember(owner = "client!bv", name = "x", descriptor = "I")
	public final int anInt900;

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "I")
	public final int anInt898;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!ffa;IIII[BI)V")
	public Class32_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt892 = arg2;
		this.anInt900 = arg4;
		this.anInt898 = arg3;
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9813, 0, super.anInt9805, this.anInt892, this.anInt898, this.anInt900, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8430(true);
	}

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(Lclient!ffa;IIII)V")
	public Class32_Sub2(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt900 = arg4;
		this.anInt892 = arg2;
		this.anInt898 = arg3;
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glTexImage3Dub(super.anInt9813, 0, super.anInt9805, this.anInt892, this.anInt898, this.anInt900, 0, Static640.method8945(super.anInt9805), 5121, (byte[]) null, 0);
		this.method8430(true);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	@Override
	public void method8965() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt897, this.anInt902, super.anInt9813, 0, 0, 0);
		this.anInt902 = -1;
		this.anInt897 = -1;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIIBI)V")
	public void method841(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		super.aClass57_Sub2_36.method2362(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9813, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}
}
