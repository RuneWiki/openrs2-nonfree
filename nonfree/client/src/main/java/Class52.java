import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class52 {

	@OriginalMember(owner = "client!ds", name = "s", descriptor = "[I")
	public static final int[] anIntArray111;

	@OriginalMember(owner = "client!ds", name = "q", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_35;

	@OriginalMember(owner = "client!ds", name = "v", descriptor = "[[I")
	public static final int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_56;

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "Lclient!ad;")
	private Class4 aClass4_30;

	@OriginalMember(owner = "client!ds", name = "i", descriptor = "Lclient!ad;")
	public Class4 aClass4_31;

	@OriginalMember(owner = "client!ds", name = "l", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
	private int anInt1632;

	@OriginalMember(owner = "client!ds", name = "n", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
	private String aString16 = "null";

	static {
		new Class79("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
		new Class79("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
		anIntArray111 = new int[6];
		aClass79_35 = new Class79("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");
		anIntArrayArray15 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };
		aClass145_56 = new Class145(20, 4);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)I", line = 179)
	public int method1768(@OriginalArg(1) int arg0) {
		if (this.aClass4_31 == null) {
			return this.anInt1632;
		} else {
			@Pc(23) Class2_Sub39 local23 = (Class2_Sub39) this.aClass4_31.method90((long) arg0);
			return local23 == null ? this.anInt1632 : local23.anInt6805;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lclient!bt;BI)V", line = 200)
	private void method1769(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static74.method5699(arg0.method4826());
		} else if (arg1 == 2) {
			this.aChar3 = Static74.method5699(arg0.method4826());
		} else if (arg1 == 3) {
			this.aString16 = arg0.method4810();
		} else if (arg1 == 4) {
			this.anInt1632 = arg0.method4837();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(45) int local45 = arg0.method4830();
			this.aClass4_31 = new Class4(Static152.method2978(local45));
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				@Pc(61) int local61 = arg0.method4837();
				@Pc(73) Class2 local73;
				if (arg1 == 5) {
					local73 = new Class2_Sub40(arg0.method4810());
				} else {
					local73 = new Class2_Sub39(arg0.method4837());
				}
				this.aClass4_31.method87(local73, (long) local61);
			}
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 254)
	private void method1770() {
		this.aClass4_30 = new Class4(this.aClass4_31.method89());
		for (@Pc(20) Class2_Sub39 local20 = (Class2_Sub39) this.aClass4_31.method80(); local20 != null; local20 = (Class2_Sub39) this.aClass4_31.method79()) {
			@Pc(29) Class2_Sub39 local29 = new Class2_Sub39((int) local20.aLong232);
			this.aClass4_30.method87(local29, (long) local20.anInt6805);
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 276)
	public boolean method1771(@OriginalArg(1) String arg0) {
		if (this.aClass4_31 == null) {
			return false;
		}
		if (this.aClass4_30 == null) {
			this.method1775();
		}
		for (@Pc(37) Class2_Sub28 local37 = (Class2_Sub28) this.aClass4_30.method90(Static76.method5983(arg0)); local37 != null; local37 = (Class2_Sub28) this.aClass4_30.method82()) {
			if (local37.aString54.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)Z", line = 321)
	public boolean method1773(@OriginalArg(1) int arg0) {
		if (this.aClass4_31 == null) {
			return false;
		}
		if (this.aClass4_30 == null) {
			this.method1770();
		}
		@Pc(29) Class2_Sub39 local29 = (Class2_Sub39) this.aClass4_30.method90((long) arg0);
		return local29 != null;
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)V", line = 365)
	private void method1775() {
		this.aClass4_30 = new Class4(this.aClass4_31.method89());
		for (@Pc(28) Class2_Sub40 local28 = (Class2_Sub40) this.aClass4_31.method80(); local28 != null; local28 = (Class2_Sub40) this.aClass4_31.method79()) {
			@Pc(39) Class2_Sub28 local39 = new Class2_Sub28(local28.aString65, (int) local28.aLong232);
			this.aClass4_30.method87(local39, Static76.method5983(local28.aString65));
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!bt;)V", line = 389)
	public void method1776(@OriginalArg(1) Class2_Sub4 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4816();
			if (local11 == 0) {
				return;
			}
			this.method1769(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(II)Ljava/lang/String;", line = 411)
	public String method1777(@OriginalArg(0) int arg0) {
		if (this.aClass4_31 == null) {
			return this.aString16;
		} else {
			@Pc(19) Class2_Sub40 local19 = (Class2_Sub40) this.aClass4_31.method90((long) arg0);
			return local19 == null ? this.aString16 : local19.aString65;
		}
	}
}
