import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
	private int anInt1937 = -1;

	@OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
	private int anInt1941 = -1;

	@OriginalMember(owner = "client!fd", name = "C", descriptor = "I")
	public final int anInt1938;

	@OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
	public final int anInt1939;

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
	public final int anInt1936;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!tt;IIII)V")
	public Class31_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt1938 = arg4;
		this.anInt1939 = arg2;
		this.anInt1936 = arg3;
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glTexImage3Dub(super.anInt5787, 0, super.anInt5789, this.anInt1939, this.anInt1936, this.anInt1938, 0, Static314.method3855(super.anInt5789), 5121, null, 0);
		this.method4591(true);
	}

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lclient!tt;IIII[BI)V")
	public Class31_Sub2(@OriginalArg(0) Class200_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt1939 = arg2;
		this.anInt1938 = arg4;
		this.anInt1936 = arg3;
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt5787, 0, super.anInt5789, this.anInt1939, this.anInt1936, this.anInt1938, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4591(true);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIIIIIII)V")
	public void method1579(@OriginalArg(2) int arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2) {
		super.aClass200_Sub2_34.method5312(this);
		OpenGL.glCopyTexSubImage3D(super.anInt5787, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	@Override
	public void method4581() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1937, this.anInt1941, super.anInt5787, 0, 0, 0);
		this.anInt1937 = -1;
		this.anInt1941 = -1;
	}
}
