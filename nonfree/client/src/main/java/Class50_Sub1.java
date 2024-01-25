import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!cfa", name = "z", descriptor = "I")
	private int anInt1405 = -1;

	@OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
	private int anInt1407 = -1;

	@OriginalMember(owner = "client!cfa", name = "x", descriptor = "I")
	public final int anInt1403;

	@OriginalMember(owner = "client!cfa", name = "G", descriptor = "I")
	public final int anInt1409;

	@OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
	public final int anInt1408;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!lea;IIII)V")
	public Class50_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt1403 = arg4;
		this.anInt1409 = arg3;
		this.anInt1408 = arg2;
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glTexImage3Dub(super.anInt10677, 0, super.anInt10669, this.anInt1408, this.anInt1409, this.anInt1403, 0, Static402.method7538(super.anInt10669), 5121, (byte[]) null, 0);
		this.method9134(true);
	}

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(Lclient!lea;IIII[BI)V")
	public Class50_Sub1(@OriginalArg(0) Class101_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt1403 = arg4;
		this.anInt1409 = arg3;
		this.anInt1408 = arg2;
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10677, 0, super.anInt10669, this.anInt1408, this.anInt1409, this.anInt1403, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9134(true);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V")
	@Override
	public void method9133() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1407, this.anInt1405, super.anInt10677, 0, 0, 0);
		this.anInt1407 = -1;
		this.anInt1405 = -1;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIIIIII)V")
	public void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2) {
		super.aClass101_Sub2_41.method5690(this);
		OpenGL.glCopyTexSubImage3D(super.anInt10677, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
