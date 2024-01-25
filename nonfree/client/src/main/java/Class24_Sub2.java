import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
	private int anInt1297 = -1;

	@OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
	private int anInt1293 = -1;

	@OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
	public final int anInt1289;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	public final int anInt1290;

	@OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
	public final int anInt1296;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!vj;IIII)V")
	public Class24_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt1289 = arg4;
		this.anInt1290 = arg3;
		this.anInt1296 = arg2;
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glTexImage3Dub(super.anInt3100, 0, super.anInt3110, this.anInt1296, this.anInt1290, this.anInt1289, 0, Static430.method6073(super.anInt3110), 5121, null, 0);
		this.method2802(true);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lclient!vj;IIII[BI)V")
	public Class24_Sub2(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt1290 = arg3;
		this.anInt1289 = arg4;
		this.anInt1296 = arg2;
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt3100, 0, super.anInt3110, this.anInt1296, this.anInt1290, this.anInt1289, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method2802(true);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
	@Override
	public void method2792() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1297, this.anInt1293, super.anInt3100, 0, 0, 0);
		this.anInt1297 = -1;
		this.anInt1293 = -1;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIIIII)V")
	public void method1219(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		super.aClass45_Sub3_16.method7475(this);
		OpenGL.glCopyTexSubImage3D(super.anInt3100, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
