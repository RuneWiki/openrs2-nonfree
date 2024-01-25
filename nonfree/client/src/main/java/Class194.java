import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class194 {

	@OriginalMember(owner = "client!po", name = "a", descriptor = "[Lclient!mf;")
	public Class112_Sub2[] aClass112_Sub2Array1 = null;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "[Lclient!mf;")
	public Class112_Sub2[] aClass112_Sub2Array2 = null;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!jd;")
	public Class112_Sub1 aClass112_Sub1_1 = null;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Lclient!jd;")
	public Class112_Sub1 aClass112_Sub1_2 = null;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "Lclient!jd;")
	public Class112_Sub1 aClass112_Sub1_3 = null;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Z")
	public final boolean aBoolean474;

	static {
		new Class189("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
		new Class189("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class194(@OriginalArg(0) Class172_Sub2 arg0) {
		this.aBoolean474 = arg0.aBoolean610;
		Static123.method1980(arg0);
		if (this.aBoolean474) {
			@Pc(108) byte[] local108 = Static415.method5326(false, Static365.anObject13);
			this.aClass112_Sub1_2 = new Class112_Sub1(arg0, 6410, 128, 128, 16, local108, 6410);
			@Pc(125) byte[] local125 = Static415.method5326(false, Static87.anObject12);
			this.aClass112_Sub1_3 = new Class112_Sub1(arg0, 6410, 128, 128, 16, local125, 6410);
			@Pc(140) Class45 local140 = arg0.aClass45_1;
			if (local140.method1222()) {
				local108 = Static415.method5326(false, Static72.anObject6);
				this.aClass112_Sub1_1 = new Class112_Sub1(arg0, 6408, 128, 128, 16);
				@Pc(170) Class112_Sub1 local170 = new Class112_Sub1(arg0, 6409, 128, 128, 16, local108, 6409);
				if (local140.method1220(local170, 2.0F, this.aClass112_Sub1_1)) {
					this.aClass112_Sub1_1.method4549();
				} else {
					this.aClass112_Sub1_1.method4553();
					this.aClass112_Sub1_1 = null;
				}
				local170.method4553();
			}
		} else {
			this.aClass112_Sub2Array1 = new Class112_Sub2[16];
			for (@Pc(32) int local32 = 0; local32 < 16; local32++) {
				@Pc(43) byte[] local43 = Static221.method3339(Static365.anObject13, local32 * 128 * 256);
				this.aClass112_Sub2Array1[local32] = new Class112_Sub2(arg0, 3553, 6410, 128, 128, true, local43, 6410, false);
			}
			this.aClass112_Sub2Array2 = new Class112_Sub2[16];
			for (@Pc(69) int local69 = 0; local69 < 16; local69++) {
				@Pc(82) byte[] local82 = Static221.method3339(Static87.anObject12, local69 * 2 * 128 * 128);
				this.aClass112_Sub2Array2[local69] = new Class112_Sub2(arg0, 3553, 6410, 128, 128, true, local82, 6410, false);
			}
		}
	}
}
