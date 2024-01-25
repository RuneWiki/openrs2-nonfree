import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "I")
	private int anInt3664 = -1;

	@OriginalMember(owner = "client!ho", name = "H", descriptor = "I")
	private int anInt3668 = -1;

	@OriginalMember(owner = "client!ho", name = "B", descriptor = "I")
	public final int anInt3663;

	@OriginalMember(owner = "client!ho", name = "D", descriptor = "I")
	public final int anInt3665;

	@OriginalMember(owner = "client!ho", name = "A", descriptor = "I")
	public final int anInt3662;

	static {
		new Class40("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!jj;IIII[BI)V")
	public Class4_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg4 * arg3 * arg2, false);
		this.anInt3663 = arg3;
		this.anInt3665 = arg4;
		this.anInt3662 = arg2;
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glPixelStorei(3317, 1);
		OpenGL.glTexImage3Dub(super.anInt6708, 0, super.anInt6703, this.anInt3662, this.anInt3663, this.anInt3665, 0, arg6, 5121, arg5, 0);
		OpenGL.glPixelStorei(3317, 4);
		this.method5502(true);
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!jj;IIII)V")
	public Class4_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg3 * arg2 * arg4, false);
		this.anInt3663 = arg3;
		this.anInt3665 = arg4;
		this.anInt3662 = arg2;
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glTexImage3Dub(super.anInt6708, 0, super.anInt6703, this.anInt3662, this.anInt3663, this.anInt3665, 0, Static366.method5588(super.anInt6703), 5121, null, 0);
		this.method5502(true);
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIIIIIII)V")
	public void method3193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(6) int arg2) {
		super.aClass62_Sub3_28.method4007(this);
		OpenGL.glCopyTexSubImage3D(super.anInt6708, 0, 0, 0, arg0, 0, 0, arg1, arg2);
		OpenGL.glFlush();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)V")
	@Override
	public void method5490() {
		OpenGL.glFramebufferTexture3DEXT(this.anInt3668, this.anInt3664, super.anInt6708, 0, 0, 0);
		this.anInt3668 = -1;
		this.anInt3664 = -1;
	}
}
