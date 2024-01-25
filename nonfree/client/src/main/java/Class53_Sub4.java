import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class53_Sub4 extends Class53 {

	@OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
	private int anInt9824 = -1;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
	private int anInt9829 = -1;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
	public final int anInt9828;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
	public final int anInt9831;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
	public final int anInt9825;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!pq;IIII)V")
	public Class53_Sub4(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt9828 = arg2;
		this.anInt9831 = arg4;
		this.anInt9825 = arg3;
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glTexImage3Dub(super.anInt9817, 0, super.anInt9821, this.anInt9828, this.anInt9825, this.anInt9831, 0, Static628.method8638(super.anInt9821), 5121, (byte[]) null, 0);
		this.method8287(true);
	}

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!pq;IIII[BI)V")
	public Class53_Sub4(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt9825 = arg3;
		this.anInt9831 = arg4;
		this.anInt9828 = arg2;
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9817, 0, super.anInt9821, this.anInt9828, this.anInt9825, this.anInt9831, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8287(true);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIIZI)V")
	public void method8295(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(7) int arg2) {
		super.aClass132_Sub3_40.method6759(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9817, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
	@Override
	public void method8284() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt9829, this.anInt9824, super.anInt9817, 0, 0, 0);
		this.anInt9824 = -1;
		this.anInt9829 = -1;
	}
}
