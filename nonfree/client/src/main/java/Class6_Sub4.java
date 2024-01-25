import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class6_Sub4 extends Class6 {

	@OriginalMember(owner = "client!im", name = "y", descriptor = "I")
	private int anInt3252 = -1;

	@OriginalMember(owner = "client!im", name = "A", descriptor = "I")
	private int anInt3254 = -1;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "I")
	public final int anInt3257;

	static {
		new Class83("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!fd;IIZ[[BI)V")
	public Class6_Sub4(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3257 = arg2;
		super.aClass19_Sub2_31.method1905(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5443, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4181(true);
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!fd;IIZ[[I)V")
	public Class6_Sub4(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt3257 = arg2;
		super.aClass19_Sub2_31.method1905(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static37.method665(arg4[local30], super.anInt5443, arg2, arg2, super.aClass19_Sub2_31.anInt2307, local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5443, arg2, arg2, 0, 32993, super.aClass19_Sub2_31.anInt2307, arg4[local30], 0);
			}
		}
		this.method4181(true);
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!fd;II)V")
	public Class6_Sub4(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt3257 = arg2;
		super.aClass19_Sub2_31.method1905(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt5443, arg2, arg2, 0, Static304.method4122(super.anInt5443), 5121, null, 0);
		}
		this.method4181(true);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIBI)V")
	public void method2754(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg2, arg1, super.anInt5449, 0);
		this.anInt3252 = arg2;
		this.anInt3254 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
	@Override
	public void method4178() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt3254, this.anInt3252, 3553, 0, 0);
		this.anInt3252 = -1;
		this.anInt3254 = -1;
	}
}
