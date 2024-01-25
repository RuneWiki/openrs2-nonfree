import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class4_Sub2_Sub5 extends Class4_Sub2 implements Interface10 {

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
	private int anInt756 = -1;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	private int anInt751 = -1;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_5;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
	public final int anInt760;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
	private final int anInt757;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "I")
	public final int anInt761;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
	private final int anInt749;

	static {
		new Class15("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ug;III)V")
	public Class4_Sub2_Sub5(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass135_Sub2_5 = arg0;
		this.anInt760 = arg3;
		this.anInt757 = arg1;
		this.anInt761 = arg2;
		OpenGL.glGenRenderbuffersEXT(1, Static347.anIntArray456, 0);
		this.anInt753 = Static347.anIntArray456[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt753);
		OpenGL.glRenderbufferStorageEXT(36161, this.anInt757, this.anInt761, this.anInt760);
		this.anInt749 = this.anInt760 * this.anInt761 * this.aClass135_Sub2_5.method5433(this.anInt757);
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!ug;IIII)V")
	public Class4_Sub2_Sub5(@OriginalArg(0) Class135_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass135_Sub2_5 = arg0;
		this.anInt757 = arg1;
		this.anInt761 = arg2;
		this.anInt760 = arg3;
		OpenGL.glGenRenderbuffersEXT(1, Static347.anIntArray456, 0);
		this.anInt753 = Static347.anIntArray456[0];
		OpenGL.glBindRenderbufferEXT(36161, this.anInt753);
		OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.anInt757, this.anInt761, this.anInt760);
		this.anInt749 = this.anInt761 * this.anInt760 * this.aClass135_Sub2_5.method5433(this.anInt757);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method631() {
		if (this.anInt753 > 0) {
			this.aClass135_Sub2_5.method5444(this.anInt749, this.anInt753);
			this.anInt753 = 0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	@Override
	public void method4759() {
		OpenGL.glFramebufferRenderbufferEXT(this.anInt756, this.anInt751, 36161, 0);
		this.anInt751 = -1;
		this.anInt756 = -1;
	}

	@OriginalMember(owner = "client!cf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method631();
		super.finalize();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	public void method633(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		OpenGL.glFramebufferRenderbufferEXT(arg1, arg0, 36161, this.anInt753);
		this.anInt751 = arg0;
		this.anInt756 = arg1;
	}
}
