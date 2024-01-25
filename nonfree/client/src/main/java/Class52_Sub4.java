import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public final class Class52_Sub4 extends Class52 {

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
	private int anInt6866 = -1;

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	private int anInt6869 = -1;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
	public final int anInt6871;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "I")
	public final int anInt6864;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "I")
	public final int anInt6867;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!ag;IIII[BI)V")
	public Class52_Sub4(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6871 = arg4;
		this.anInt6864 = arg3;
		this.anInt6867 = arg2;
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6859, 0, super.anInt6855, this.anInt6867, this.anInt6864, this.anInt6871, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5644(true);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!ag;IIII)V")
	public Class52_Sub4(@OriginalArg(0) Class12_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6871 = arg4;
		this.anInt6864 = arg3;
		this.anInt6867 = arg2;
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glTexImage3Dub(super.anInt6859, 0, super.anInt6855, this.anInt6867, this.anInt6864, this.anInt6871, 0, Static494.method6908(super.anInt6855), 5121, null, 0);
		this.method5644(true);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	@Override
	public void method5633() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt6866, this.anInt6869, super.anInt6859, 0, 0, 0);
		this.anInt6866 = -1;
		this.anInt6869 = -1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIIII)V")
	public void method5646(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(6) int arg2) {
		super.aClass12_Sub1_31.method378(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6859, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}
}
