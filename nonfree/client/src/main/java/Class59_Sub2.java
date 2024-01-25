import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class59_Sub2 extends Class59 {

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
	private int anInt3418 = -1;

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
	private int anInt3419 = -1;

	@OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
	public final int anInt3416;

	@OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
	public final int anInt3423;

	@OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
	public final int anInt3425;

	static {
		new Class55("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!vd;IIII[BI)V")
	public Class59_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt3416 = arg4;
		this.anInt3423 = arg2;
		this.anInt3425 = arg3;
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt7465, 0, super.anInt7474, this.anInt3423, this.anInt3425, this.anInt3416, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5760(true);
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!vd;IIII)V")
	public Class59_Sub2(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt3416 = arg4;
		this.anInt3425 = arg3;
		this.anInt3423 = arg2;
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glTexImage3Dub(super.anInt7465, 0, super.anInt7474, this.anInt3423, this.anInt3425, this.anInt3416, 0, Static110.method1907(super.anInt7474), 5121, null, 0);
		this.method5760(true);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIIII)V")
	public void method2786(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		super.aClass51_Sub2_43.method5364(this);
		OpenGL.glCopyTexSubImage3D(super.anInt7465, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	@Override
	public void method5755() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3419, this.anInt3418, super.anInt7465, 0, 0, 0);
		this.anInt3419 = -1;
		this.anInt3418 = -1;
	}
}
