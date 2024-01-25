import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
	private int anInt837 = -1;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
	private int anInt838 = -1;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
	public final int anInt841;

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
	public final int anInt835;

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
	public final int anInt833;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!fd;IIII[BI)V")
	public Class6_Sub3(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt841 = arg3;
		this.anInt835 = arg4;
		this.anInt833 = arg2;
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5441, 0, super.anInt5443, this.anInt833, this.anInt841, this.anInt835, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4181(true);
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!fd;IIII)V")
	public Class6_Sub3(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt835 = arg4;
		this.anInt833 = arg2;
		this.anInt841 = arg3;
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glTexImage3Dub(super.anInt5441, 0, super.anInt5443, this.anInt833, this.anInt841, this.anInt835, 0, Static304.method4122(super.anInt5443), 5121, null, 0);
		this.method4181(true);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	@Override
	public void method4178() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt837, this.anInt838, super.anInt5441, 0, 0, 0);
		this.anInt838 = -1;
		this.anInt837 = -1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIBII)V")
	public void method793(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		super.aClass19_Sub2_31.method1905(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5441, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
