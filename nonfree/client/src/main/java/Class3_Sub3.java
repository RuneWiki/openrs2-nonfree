import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!gp", name = "A", descriptor = "I")
	private int anInt3822 = -1;

	@OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
	private int anInt3830 = -1;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
	public final int anInt3826;

	@OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
	public final int anInt3825;

	@OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
	public final int anInt3827;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!wh;IIII)V")
	public Class3_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3826 = arg2;
		this.anInt3825 = arg3;
		this.anInt3827 = arg4;
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glTexImage3Dub(super.anInt6738, 0, super.anInt6737, this.anInt3826, this.anInt3825, this.anInt3827, 0, Static59.method1052(super.anInt6737), 5121, (byte[]) null, 0);
		this.method5781(true);
	}

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lclient!wh;IIII[BI)V")
	public Class3_Sub3(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt3826 = arg2;
		this.anInt3827 = arg4;
		this.anInt3825 = arg3;
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6738, 0, super.anInt6737, this.anInt3826, this.anInt3825, this.anInt3827, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5781(true);
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	@Override
	public void method5769() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3830, this.anInt3822, super.anInt6738, 0, 0, 0);
		this.anInt3830 = -1;
		this.anInt3822 = -1;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIBIIIII)V")
	public void method3389(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		super.aClass100_Sub3_34.method8925(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6738, 0, 0, 0, arg2, 0, 0, arg1, arg0);
		OpenGL.glFlush();
	}
}
