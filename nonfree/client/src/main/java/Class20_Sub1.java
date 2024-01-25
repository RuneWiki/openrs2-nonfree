import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!au", name = "D", descriptor = "I")
	private int anInt1004 = -1;

	@OriginalMember(owner = "client!au", name = "G", descriptor = "I")
	private int anInt1006 = -1;

	@OriginalMember(owner = "client!au", name = "B", descriptor = "I")
	public final int anInt1002;

	@OriginalMember(owner = "client!au", name = "C", descriptor = "I")
	public final int anInt1003;

	@OriginalMember(owner = "client!au", name = "L", descriptor = "I")
	public final int anInt1009;

	static {
		new Class114("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!te;IIII)V")
	public Class20_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt1002 = arg3;
		this.anInt1003 = arg4;
		this.anInt1009 = arg2;
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glTexImage3Dub(super.anInt7329, 0, super.anInt7318, this.anInt1009, this.anInt1002, this.anInt1003, 0, Static210.method3821(super.anInt7318), 5121, null, 0);
		this.method6237(true);
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!te;IIII[BI)V")
	public Class20_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt1002 = arg3;
		this.anInt1009 = arg2;
		this.anInt1003 = arg4;
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7329, 0, super.anInt7318, this.anInt1009, this.anInt1002, this.anInt1003, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method6237(true);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIIIIII)V")
	public void method1017(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(7) int arg2) {
		super.aClass9_Sub3_36.method6701(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7329, 0, 0, 0, arg1, 0, 0, arg0, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V")
	@Override
	public void method6233() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt1004, this.anInt1006, super.anInt7329, 0, 0, 0);
		this.anInt1004 = -1;
		this.anInt1006 = -1;
	}
}
