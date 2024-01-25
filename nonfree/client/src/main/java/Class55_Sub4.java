import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class55_Sub4 extends Class55 {

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
	private int anInt7040 = -1;

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "I")
	private int anInt7042 = -1;

	@OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
	public final int anInt7045;

	static {
		new Class209("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!ef;IIZ[[I)V")
	public Class55_Sub4(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7045 = arg2;
		super.aClass49_Sub2_42.method1646(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static167.method2727(super.aClass49_Sub2_42.anInt2043, arg4[local30], arg2, local30 + 34069, super.anInt7029, arg2);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7029, arg2, arg2, 0, 32993, super.aClass49_Sub2_42.anInt2043, arg4[local30], 0);
			}
		}
		this.method5553(true);
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!ef;II)V")
	public Class55_Sub4(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt7045 = arg2;
		super.aClass49_Sub2_42.method1646(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7029, arg2, arg2, 0, Static192.method3007(super.anInt7029), 5121, null, 0);
		}
		this.method5553(true);
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!ef;IIZ[[BI)V")
	public Class55_Sub4(@OriginalArg(0) Class49_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7045 = arg2;
		super.aClass49_Sub2_42.method1646(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7029, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5553(true);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	@Override
	public void method5551() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7042, this.anInt7040, 3553, 0, 0);
		this.anInt7042 = -1;
		this.anInt7040 = -1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
	public void method5564(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt7034, 0);
		this.anInt7040 = arg2;
		this.anInt7042 = arg0;
	}
}
