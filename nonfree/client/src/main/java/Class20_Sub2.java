import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "[Lclient!gt;")
	public static final Class123[] aClass123Array1 = new Class123[5];

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "I")
	private int anInt2745 = -1;

	@OriginalMember(owner = "client!dl", name = "A", descriptor = "I")
	private int anInt2747 = -1;

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
	public final int anInt2743;

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "I")
	public final int anInt2744;

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
	public final int anInt2741;

	static {
		for (@Pc(9) int local9 = 0; local9 < aClass123Array1.length; local9++) {
			aClass123Array1[local9] = new Class123();
		}
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!nv;IIII)V")
	public Class20_Sub2(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt2743 = arg2;
		this.anInt2744 = arg4;
		this.anInt2741 = arg3;
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glTexImage3Dub(super.anInt9337, 0, super.anInt9338, this.anInt2743, this.anInt2741, this.anInt2744, 0, Static607.method6373(super.anInt9338), 5121, null, 0);
		this.method7620(true);
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!nv;IIII[BI)V")
	public Class20_Sub2(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt2743 = arg2;
		this.anInt2741 = arg3;
		this.anInt2744 = arg4;
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt9337, 0, super.anInt9338, this.anInt2743, this.anInt2741, this.anInt2744, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method7620(true);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBIIII)V")
	public void method2345(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		super.aClass16_Sub3_40.method6020(this);
		OpenGL.glCopyTexSubImage3D(super.anInt9337, 0, 0, 0, arg2, 0, 0, arg0, arg1);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	@Override
	public void method7611() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt2747, this.anInt2745, super.anInt9337, 0, 0, 0);
		this.anInt2747 = -1;
		this.anInt2745 = -1;
	}
}
