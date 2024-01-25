import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!cka", name = "y", descriptor = "I")
	private int anInt1514 = -1;

	@OriginalMember(owner = "client!cka", name = "z", descriptor = "I")
	private int anInt1515 = -1;

	@OriginalMember(owner = "client!cka", name = "v", descriptor = "I")
	public final int anInt1510;

	@OriginalMember(owner = "client!cka", name = "x", descriptor = "I")
	public final int anInt1517;

	@OriginalMember(owner = "client!cka", name = "D", descriptor = "I")
	public final int anInt1512;

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!uja;IIII[BI)V")
	public Class64_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt1510 = arg3;
		this.anInt1517 = arg2;
		this.anInt1512 = arg4;
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt4996, 0, super.anInt4992, this.anInt1517, this.anInt1510, this.anInt1512, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method4540(true);
	}

	@OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lclient!uja;IIII)V")
	public Class64_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt1517 = arg2;
		this.anInt1512 = arg4;
		this.anInt1510 = arg3;
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glTexImage3Dub(super.anInt4996, 0, super.anInt4992, this.anInt1517, this.anInt1510, this.anInt1512, 0, Static100.method1532(super.anInt4992), 5121, (byte[]) null, 0);
		this.method4540(true);
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(IIIIIIII)V")
	public void method1324(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass145_Sub3_27.method8872(this);
		OpenGL.glCopyTexSubImage3D(super.anInt4996, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)V")
	@Override
	public void method4536() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1514, this.anInt1515, super.anInt4996, 0, 0, 0);
		this.anInt1514 = -1;
		this.anInt1515 = -1;
	}
}
