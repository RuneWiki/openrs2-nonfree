import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class64_Sub2 extends Class64 {

	@OriginalMember(owner = "client!er", name = "y", descriptor = "I")
	private int anInt1591 = -1;

	@OriginalMember(owner = "client!er", name = "C", descriptor = "I")
	private int anInt1594 = -1;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "I")
	public final int anInt1593;

	@OriginalMember(owner = "client!er", name = "z", descriptor = "I")
	public final int anInt1592;

	@OriginalMember(owner = "client!er", name = "E", descriptor = "I")
	public final int anInt1596;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!na;IIII)V")
	public Class64_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt1593 = arg3;
		this.anInt1592 = arg2;
		this.anInt1596 = arg4;
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glTexImage3Dub(super.anInt4388, 0, super.anInt4384, this.anInt1592, this.anInt1593, this.anInt1596, 0, Static353.method4961(super.anInt4384), 5121, null, 0);
		this.method3523(true);
	}

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!na;IIII[BI)V")
	public Class64_Sub2(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt1596 = arg4;
		this.anInt1592 = arg2;
		this.anInt1593 = arg3;
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt4388, 0, super.anInt4384, this.anInt1592, this.anInt1593, this.anInt1596, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method3523(true);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBIIIII)V")
	public void method1467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(7) int arg2) {
		super.aClass75_Sub2_24.method3844(this);
		OpenGL.glCopyTexSubImage3D(super.anInt4388, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	@Override
	public void method5596() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1591, this.anInt1594, super.anInt4388, 0, 0, 0);
		this.anInt1594 = -1;
		this.anInt1591 = -1;
	}
}
