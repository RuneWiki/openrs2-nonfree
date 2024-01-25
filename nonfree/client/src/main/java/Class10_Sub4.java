import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public final class Class10_Sub4 extends Class10 {

	@OriginalMember(owner = "client!sga", name = "x", descriptor = "I")
	private int anInt8432 = -1;

	@OriginalMember(owner = "client!sga", name = "B", descriptor = "I")
	private int anInt8435 = -1;

	@OriginalMember(owner = "client!sga", name = "D", descriptor = "I")
	public final int anInt8437;

	@OriginalMember(owner = "client!sga", name = "y", descriptor = "I")
	public final int anInt8433;

	@OriginalMember(owner = "client!sga", name = "G", descriptor = "I")
	public final int anInt8440;

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!bi;IIII[BI)V")
	public Class10_Sub4(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt8437 = arg4;
		this.anInt8433 = arg3;
		this.anInt8440 = arg2;
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt8418, 0, super.anInt8428, this.anInt8440, this.anInt8433, this.anInt8437, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7260(true);
	}

	@OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lclient!bi;IIII)V")
	public Class10_Sub4(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt8433 = arg3;
		this.anInt8437 = arg4;
		this.anInt8440 = arg2;
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glTexImage3Dub(super.anInt8418, 0, super.anInt8428, this.anInt8440, this.anInt8433, this.anInt8437, 0, Static241.method4099(super.anInt8428), 5121, (byte[]) null, 0);
		this.method7260(true);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
	@Override
	public void method7251() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt8435, this.anInt8432, super.anInt8418, 0, 0, 0);
		this.anInt8432 = -1;
		this.anInt8435 = -1;
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIIIIIII)V")
	public void method7266(@OriginalArg(4) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		super.aClass13_Sub2_39.method1096(this);
		OpenGL.glCopyTexSubImage3D(super.anInt8418, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}
}
