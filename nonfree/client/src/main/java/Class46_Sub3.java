import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class46_Sub3 extends Class46 {

	@OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
	private int anInt2617 = -1;

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
	private int anInt2624 = -1;

	@OriginalMember(owner = "client!fba", name = "B", descriptor = "I")
	public final int anInt2619;

	@OriginalMember(owner = "client!fba", name = "u", descriptor = "I")
	public final int anInt2612;

	@OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
	public final int anInt2620;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!lj;IIII[BI)V")
	public Class46_Sub3(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt2619 = arg3;
		this.anInt2612 = arg4;
		this.anInt2620 = arg2;
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6350, 0, super.anInt6354, this.anInt2620, this.anInt2619, this.anInt2612, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5134(true);
	}

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Lclient!lj;IIII)V")
	public Class46_Sub3(@OriginalArg(0) Class78_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt2619 = arg3;
		this.anInt2620 = arg2;
		this.anInt2612 = arg4;
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glTexImage3Dub(super.anInt6350, 0, super.anInt6354, this.anInt2620, this.anInt2619, this.anInt2612, 0, Static485.method6695(super.anInt6354), 5121, null, 0);
		this.method5134(true);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
	@Override
	public void method7511() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2617, this.anInt2624, super.anInt6350, 0, 0, 0);
		this.anInt2617 = -1;
		this.anInt2624 = -1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIII)V")
	public void method2302(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(7) int arg2) {
		super.aClass78_Sub3_26.method4535(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6350, 0, 0, 0, arg1, 0, 0, arg2, arg0);
		OpenGL.glFlush();
	}
}
