import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "I")
	private int anInt817 = -1;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "I")
	private int anInt821 = -1;

	@OriginalMember(owner = "client!bo", name = "w", descriptor = "I")
	public final int anInt815;

	static {
		new Class202("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!os;IIZ[[I)V")
	public Class19_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt815 = arg2;
		super.aClass39_Sub3_26.method5719(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static304.method4760(super.anInt5628, local30 + 34069, arg2, arg2, super.aClass39_Sub3_26.anInt6735, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5628, arg2, arg2, 0, 32993, super.aClass39_Sub3_26.anInt6735, arg4[local30], 0);
			}
		}
		this.method4799(true);
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!os;II)V")
	public Class19_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt815 = arg2;
		super.aClass39_Sub3_26.method5719(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5628, arg2, arg2, 0, Static428.method6599(super.anInt5628), 5121, null, 0);
		}
		this.method4799(true);
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!os;IIZ[[BI)V")
	public Class19_Sub1(@OriginalArg(0) Class39_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt815 = arg2;
		super.aClass39_Sub3_26.method5719(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5628, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4799(true);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	@Override
	public void method4798() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt817, this.anInt821, 3553, 0, 0);
		this.anInt821 = -1;
		this.anInt817 = -1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)V")
	public void method831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt5624, 0);
		this.anInt821 = arg1;
		this.anInt817 = arg2;
	}
}
