import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
	private int anInt6735 = -1;

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
	private int anInt6734 = -1;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
	public final int anInt6732;

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public final int anInt6731;

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	public final int anInt6736;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!uca;IIII)V")
	public Class3_Sub4(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt6732 = arg4;
		this.anInt6731 = arg2;
		this.anInt6736 = arg3;
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glTexImage3Dub(super.anInt6726, 0, super.anInt6725, this.anInt6731, this.anInt6736, this.anInt6732, 0, Static472.method6125(super.anInt6725), 5121, null, 0);
		this.method5571(true);
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!uca;IIII[BI)V")
	public Class3_Sub4(@OriginalArg(0) Class162_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt6731 = arg2;
		this.anInt6732 = arg4;
		this.anInt6736 = arg3;
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6726, 0, super.anInt6725, this.anInt6731, this.anInt6736, this.anInt6732, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5571(true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	@Override
	public void method5566() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt6734, this.anInt6735, super.anInt6726, 0, 0, 0);
		this.anInt6734 = -1;
		this.anInt6735 = -1;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IBIIIIII)V")
	public void method5578(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int arg2) {
		super.aClass162_Sub3_33.method6911(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6726, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}
}
