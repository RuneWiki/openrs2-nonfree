import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class43 {

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!ge;")
	private Class4 aClass4_65;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "J")
	private long aLong49;

	@OriginalMember(owner = "client!dj", name = "q", descriptor = "Lclient!ge;")
	private Class4 aClass4_66;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int anInt1591 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public final int anInt1579;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "[Lclient!ge;")
	public final Class4[] aClass4Array1;

	static {
		new Class159("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
		new Class159("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
	public Class43(@OriginalArg(0) int arg0) {
		this.anInt1579 = arg0;
		this.aClass4Array1 = new Class4[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class4 local23 = this.aClass4Array1[local13] = new Class4();
			local23.aClass4_252 = local23;
			local23.aClass4_251 = local23;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(JI)Lclient!ge;")
	public Class4 method1273(@OriginalArg(0) long arg0) {
		this.aLong49 = arg0;
		@Pc(28) Class4 local28 = this.aClass4Array1[(int) ((long) (this.anInt1579 - 1) & arg0)];
		for (this.aClass4_65 = local28.aClass4_252; this.aClass4_65 != local28; this.aClass4_65 = this.aClass4_65.aClass4_252) {
			if (arg0 == this.aClass4_65.aLong223) {
				@Pc(47) Class4 local47 = this.aClass4_65;
				this.aClass4_65 = this.aClass4_65.aClass4_252;
				return local47;
			}
		}
		this.aClass4_65 = null;
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	public int method1274() {
		return this.anInt1579;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)I")
	public int method1275() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1579; local9++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local9];
			@Pc(19) Class4 local19 = local16.aClass4_252;
			while (local16 != local19) {
				local19 = local19.aClass4_252;
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ge;JI)V")
	public void method1276(@OriginalArg(0) Class4 arg0, @OriginalArg(1) long arg1) {
		if (arg0.aClass4_251 != null) {
			arg0.method5687();
		}
		@Pc(21) Class4 local21 = this.aClass4Array1[(int) ((long) (this.anInt1579 - 1) & arg1)];
		arg0.aClass4_252 = local21;
		arg0.aClass4_251 = local21.aClass4_251;
		arg0.aClass4_251.aClass4_252 = arg0;
		arg0.aClass4_252.aClass4_251 = arg0;
		arg0.aLong223 = arg1;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)Lclient!ge;")
	public Class4 method1278() {
		@Pc(28) Class4 local28;
		if (this.anInt1591 > 0 && this.aClass4Array1[this.anInt1591 - 1] != this.aClass4_66) {
			local28 = this.aClass4_66;
			this.aClass4_66 = local28.aClass4_252;
			return local28;
		}
		while (this.anInt1579 > this.anInt1591) {
			local28 = this.aClass4Array1[this.anInt1591++].aClass4_252;
			if (local28 != this.aClass4Array1[this.anInt1591 - 1]) {
				this.aClass4_66 = local28.aClass4_252;
				return local28;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)Lclient!ge;")
	public Class4 method1279() {
		if (this.aClass4_65 == null) {
			return null;
		}
		@Pc(23) Class4 local23 = this.aClass4Array1[(int) (this.aLong49 & (long) (this.anInt1579 - 1))];
		while (local23 != this.aClass4_65) {
			if (this.aLong49 == this.aClass4_65.aLong223) {
				@Pc(35) Class4 local35 = this.aClass4_65;
				this.aClass4_65 = this.aClass4_65.aClass4_252;
				return local35;
			}
			this.aClass4_65 = this.aClass4_65.aClass4_252;
		}
		this.aClass4_65 = null;
		return null;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	public void method1282() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1579; local3++) {
			@Pc(10) Class4 local10 = this.aClass4Array1[local3];
			while (true) {
				@Pc(13) Class4 local13 = local10.aClass4_252;
				if (local13 == local10) {
					break;
				}
				local13.method5687();
			}
		}
		this.aClass4_65 = null;
		this.aClass4_66 = null;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lclient!ge;")
	public Class4 method1283() {
		this.anInt1591 = 0;
		return this.method1278();
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "([Lclient!ge;I)I")
	public int method1284(@OriginalArg(0) Class4[] arg0) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < this.anInt1579; local9++) {
			@Pc(16) Class4 local16 = this.aClass4Array1[local9];
			for (@Pc(19) Class4 local19 = local16.aClass4_252; local19 != local16; local19 = local19.aClass4_252) {
				arg0[local7++] = local19;
			}
		}
		return local7;
	}
}
