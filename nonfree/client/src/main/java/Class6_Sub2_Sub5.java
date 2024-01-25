import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class6_Sub2_Sub5 extends Class6_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!ip", name = "C", descriptor = "I")
	private int anInt3497 = -1;

	@OriginalMember(owner = "client!ip", name = "M", descriptor = "I")
	private int anInt3504 = -1;

	@OriginalMember(owner = "client!ip", name = "K", descriptor = "I")
	public final int anInt3502;

	@OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
	public final int anInt3496;

	@OriginalMember(owner = "client!ip", name = "D", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_19;

	@OriginalMember(owner = "client!ip", name = "O", descriptor = "I")
	private final int anInt3506;

	@OriginalMember(owner = "client!ip", name = "N", descriptor = "I")
	private int anInt3505;

	@OriginalMember(owner = "client!ip", name = "L", descriptor = "I")
	private final int anInt3503;

	static {
		new Class267("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!rl;III)V")
	public Class6_Sub2_Sub5(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3502 = arg2;
		this.anInt3496 = arg3;
		this.aClass66_Sub2_19 = arg0;
		this.anInt3506 = arg1;
		OpenGL.glGenRenderbuffersEXT(1, Static94.anIntArray123, 0);
		this.anInt3505 = Static94.anIntArray123[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3505);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt3506, this.anInt3502, this.anInt3496);
		this.anInt3503 = this.anInt3496 * this.anInt3502 * this.aClass66_Sub2_19.method5131(this.anInt3506);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!rl;IIII)V")
	public Class6_Sub2_Sub5(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3502 = arg2;
		this.aClass66_Sub2_19 = arg0;
		this.anInt3506 = arg1;
		this.anInt3496 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static94.anIntArray123, 0);
		this.anInt3505 = Static94.anIntArray123[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt3505);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt3506, this.anInt3502, this.anInt3496);
		this.anInt3503 = this.anInt3496 * this.anInt3502 * this.aClass66_Sub2_19.method5131(this.anInt3506);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	@Override
	public void method4235() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt3504, this.anInt3497, 36161, 0);
		this.anInt3497 = -1;
		this.anInt3504 = -1;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(III)V")
	public void method2899(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt3505);
		this.anInt3497 = arg0;
		this.anInt3504 = arg1;
	}

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "(B)V")
	public void method2900() {
		if (this.anInt3505 > 0) {
			this.aClass66_Sub2_19.method5141(this.anInt3505, this.anInt3503);
			this.anInt3505 = 0;
		}
	}

	@OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2900();
		super.finalize();
	}
}
