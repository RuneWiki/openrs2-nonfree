import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class198 {

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!h;")
	public static final Class89 aClass89_199 = new Class89(98, -2);

	@OriginalMember(owner = "client!ra", name = "r", descriptor = "F")
	public static float aFloat67 = 0.0F;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "[I")
	public static final int[] anIntArray381;

	@OriginalMember(owner = "client!ra", name = "u", descriptor = "Lclient!ad;")
	public static final Class4 aClass4_109;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!oc;")
	public Class167 aClass167_1;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[Lclient!oc;")
	public Class167[] aClass167Array1;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt5575;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "[I")
	public int[] anIntArray377;

	@OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
	public int anInt5579;

	@OriginalMember(owner = "client!ra", name = "m", descriptor = "[[I")
	public int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public int anInt5580;

	@OriginalMember(owner = "client!ra", name = "t", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	public final int anInt5577;

	static {
		new Class79("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
		anIntArray381 = new int[14];
		aClass4_109 = new Class4(16);
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([BI)V", line = 298)
	public Class198(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5577 = Static35.method1111(arg0, arg0.length);
		if (arg1 != this.anInt5577) {
			throw new RuntimeException();
		}
		this.method5106(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)V", line = 86)
	private void method5106(@OriginalArg(0) byte[] arg0) {
		@Pc(12) Class2_Sub4 local12 = new Class2_Sub4(Static151.method2971(arg0));
		@Pc(16) int local16 = local12.method4816();
		if (local16 != 5 && local16 != 6) {
			throw new RuntimeException();
		}
		if (local16 < 6) {
			this.anInt5575 = 0;
		} else {
			this.anInt5575 = local12.method4837();
		}
		@Pc(45) int local45 = local12.method4816();
		this.anInt5579 = local12.method4830();
		@Pc(52) int local52 = 0;
		this.anIntArray380 = new int[this.anInt5579];
		@Pc(59) int local59 = -1;
		for (@Pc(61) int local61 = 0; local61 < this.anInt5579; local61++) {
			this.anIntArray380[local61] = local52 += local12.method4830();
			if (this.anIntArray380[local61] > local59) {
				local59 = this.anIntArray380[local61];
			}
		}
		this.anInt5580 = local59 + 1;
		this.anIntArray377 = new int[this.anInt5580];
		this.anIntArrayArray46 = new int[this.anInt5580][];
		this.anIntArray378 = new int[this.anInt5580];
		this.anIntArray382 = new int[this.anInt5580];
		this.anIntArray376 = new int[this.anInt5580];
		@Pc(141) int local141;
		@Pc(155) int local155;
		if (local45 != 0) {
			this.anIntArray379 = new int[this.anInt5580];
			for (local141 = 0; local141 < this.anInt5580; local141++) {
				this.anIntArray379[local141] = -1;
			}
			for (local155 = 0; local155 < this.anInt5579; local155++) {
				this.anIntArray379[this.anIntArray380[local155]] = local12.method4837();
			}
			this.aClass167_1 = new Class167(this.anIntArray379);
		}
		for (local141 = 0; local141 < this.anInt5579; local141++) {
			this.anIntArray382[this.anIntArray380[local141]] = local12.method4837();
		}
		for (local155 = 0; local155 < this.anInt5579; local155++) {
			this.anIntArray378[this.anIntArray380[local155]] = local12.method4837();
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt5579; local223++) {
			this.anIntArray376[this.anIntArray380[local223]] = local12.method4830();
		}
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(268) int local268;
		@Pc(270) int local270;
		@Pc(287) int local287;
		for (@Pc(246) int local246 = 0; local246 < this.anInt5579; local246++) {
			local253 = this.anIntArray380[local246];
			local52 = 0;
			local260 = this.anIntArray376[local253];
			this.anIntArrayArray46[local253] = new int[local260];
			local268 = -1;
			for (local270 = 0; local270 < local260; local270++) {
				local287 = this.anIntArrayArray46[local253][local270] = local52 += local12.method4830();
				if (local287 > local268) {
					local268 = local287;
				}
			}
			this.anIntArray377[local253] = local268 + 1;
			if (local268 + 1 == local260) {
				this.anIntArrayArray46[local253] = null;
			}
		}
		if (local45 == 0) {
			return;
		}
		this.anIntArrayArray47 = new int[local59 + 1][];
		this.aClass167Array1 = new Class167[local59 + 1];
		for (local253 = 0; local253 < this.anInt5579; local253++) {
			local260 = this.anIntArray380[local253];
			local268 = this.anIntArray376[local260];
			this.anIntArrayArray47[local260] = new int[this.anIntArray377[local260]];
			for (local270 = 0; local270 < this.anIntArray377[local260]; local270++) {
				this.anIntArrayArray47[local260][local270] = -1;
			}
			for (local287 = 0; local287 < local268; local287++) {
				@Pc(408) int local408;
				if (this.anIntArrayArray46[local260] == null) {
					local408 = local287;
				} else {
					local408 = this.anIntArrayArray46[local260][local287];
				}
				this.anIntArrayArray47[local260][local408] = local12.method4837();
			}
			this.aClass167Array1[local260] = new Class167(this.anIntArrayArray47[local260]);
		}
	}
}
