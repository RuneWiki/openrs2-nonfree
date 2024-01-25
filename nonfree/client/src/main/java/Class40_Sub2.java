import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
	private int anInt2090 = -1;

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
	private int anInt2092 = -1;

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
	public final int anInt2087;

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
	public final int anInt2089;

	@OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
	public final int anInt2093;

	static {
		new Class231(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!bl;IIII[BI)V")
	public Class40_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2087 = arg4;
		this.anInt2089 = arg3;
		this.anInt2093 = arg2;
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6158, 0, super.anInt6159, this.anInt2093, this.anInt2089, this.anInt2087, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5148(true);
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!bl;IIII)V")
	public Class40_Sub2(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt2089 = arg3;
		this.anInt2093 = arg2;
		this.anInt2087 = arg4;
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glTexImage3Dub(super.anInt6158, 0, super.anInt6159, this.anInt2093, this.anInt2089, this.anInt2087, 0, Static234.method3692(super.anInt6159), 5121, null, 0);
		this.method5148(true);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIZIII)V")
	public void method1923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		super.aClass28_Sub1_35.method654(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6158, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
	@Override
	public void method5143() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2090, this.anInt2092, super.anInt6158, 0, 0, 0);
		this.anInt2092 = -1;
		this.anInt2090 = -1;
	}
}
