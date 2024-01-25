import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public final class Class125_Sub3 extends Class125 {

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	private int anInt6764 = -1;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	private int anInt6765 = -1;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
	public final int anInt6762;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
	public final int anInt6760;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	public final int anInt6758;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!aq;IIII)V")
	public Class125_Sub3(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt6762 = arg3;
		this.anInt6760 = arg4;
		this.anInt6758 = arg2;
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glTexImage3Dub(super.anInt10843, 0, super.anInt10853, this.anInt6758, this.anInt6762, this.anInt6760, 0, Static156.method2537(super.anInt10853), 5121, (byte[]) null, 0);
		this.method9217(true);
	}

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!aq;IIII[BI)V")
	public Class125_Sub3(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt6760 = arg4;
		this.anInt6758 = arg2;
		this.anInt6762 = arg3;
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt10843, 0, super.anInt10853, this.anInt6758, this.anInt6762, this.anInt6760, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method9217(true);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIII)V")
	public void method5850(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		super.aClass22_Sub1_41.method955(this);
		OpenGL.glCopyTexSubImage3D(super.anInt10843, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public void method9208() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt6764, this.anInt6765, super.anInt10843, 0, 0, 0);
		this.anInt6765 = -1;
		this.anInt6764 = -1;
	}
}
