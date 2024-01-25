import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public final class Class116_Sub3 extends Class116 {

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
	private int anInt8960 = -1;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	private int anInt8964 = -1;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	public final int anInt8965;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	public final int anInt8959;

	@OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
	public final int anInt8962;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!pc;IIII[BI)V")
	public Class116_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt8965 = arg4;
		this.anInt8959 = arg2;
		this.anInt8962 = arg3;
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9736, 0, super.anInt9737, this.anInt8959, this.anInt8962, this.anInt8965, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method8346(true);
	}

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!pc;IIII)V")
	public Class116_Sub3(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt8962 = arg3;
		this.anInt8959 = arg2;
		this.anInt8965 = arg4;
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glTexImage3Dub(super.anInt9736, 0, super.anInt9737, this.anInt8959, this.anInt8962, this.anInt8965, 0, Static310.method4319(super.anInt9737), 5121, (byte[]) null, 0);
		this.method8346(true);
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V")
	public void method7647(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2) {
		super.aClass33_Sub3_36.method6340(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9736, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
	@Override
	public void method8676() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt8964, this.anInt8960, super.anInt9736, 0, 0, 0);
		this.anInt8960 = -1;
		this.anInt8964 = -1;
	}
}
