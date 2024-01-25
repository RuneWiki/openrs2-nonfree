import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class79_Sub3 extends Class79 {

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
	private int anInt5944 = -1;

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
	private int anInt5947 = -1;

	@OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
	public final int anInt5942;

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
	public final int anInt5938;

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
	public final int anInt5943;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!gi;IIII)V")
	public Class79_Sub3(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt5942 = arg4;
		this.anInt5938 = arg3;
		this.anInt5943 = arg2;
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glTexImage3Dub(super.anInt6293, 0, super.anInt6298, this.anInt5943, this.anInt5938, this.anInt5942, 0, Static439.method6675(super.anInt6298), 5121, null, 0);
		this.method5278(true);
	}

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!gi;IIII[BI)V")
	public Class79_Sub3(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt5943 = arg2;
		this.anInt5942 = arg4;
		this.anInt5938 = arg3;
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6293, 0, super.anInt6298, this.anInt5943, this.anInt5938, this.anInt5942, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5278(true);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	@Override
	public void method5270() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt5947, this.anInt5944, super.anInt6293, 0, 0, 0);
		this.anInt5947 = -1;
		this.anInt5944 = -1;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIZIII)V")
	public void method4968(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) int arg2) {
		super.aClass42_Sub3_23.method3219(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6293, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}
}
