import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public final class Class44_Sub2 extends Class44 {

	@OriginalMember(owner = "client!kga", name = "F", descriptor = "I")
	private int anInt4683 = -1;

	@OriginalMember(owner = "client!kga", name = "I", descriptor = "I")
	private int anInt4685 = -1;

	@OriginalMember(owner = "client!kga", name = "B", descriptor = "I")
	public final int anInt4680;

	@OriginalMember(owner = "client!kga", name = "z", descriptor = "I")
	public final int anInt4678;

	@OriginalMember(owner = "client!kga", name = "C", descriptor = "I")
	public final int anInt4681;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!kv;IIII[BI)V")
	public Class44_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4680 = arg2;
		this.anInt4678 = arg3;
		this.anInt4681 = arg4;
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7892, 0, super.anInt7885, this.anInt4680, this.anInt4678, this.anInt4681, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6706(true);
	}

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!kv;IIII)V")
	public Class44_Sub2(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg2 * arg3, false);
		this.anInt4681 = arg4;
		this.anInt4680 = arg2;
		this.anInt4678 = arg3;
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glTexImage3Dub(super.anInt7892, 0, super.anInt7885, this.anInt4680, this.anInt4678, this.anInt4681, 0, Static423.method6426(super.anInt7885), 5121, (byte[]) null, 0);
		this.method6706(true);
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
	@Override
	public void method6695() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt4685, this.anInt4683, super.anInt7892, 0, 0, 0);
		this.anInt4683 = -1;
		this.anInt4685 = -1;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIBIIII)V")
	public void method4111(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		super.aClass143_Sub2_32.method4945(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7892, 0, 0, 0, arg0, 0, 0, arg2, arg1);
		OpenGL.glFlush();
	}
}
