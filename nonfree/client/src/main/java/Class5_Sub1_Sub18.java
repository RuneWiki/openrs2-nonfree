import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class5_Sub1_Sub18 extends Class5_Sub1 {

	@OriginalMember(owner = "client!td", name = "y", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray60;

	@OriginalMember(owner = "client!td", name = "D", descriptor = "[I")
	private int[] anIntArray577;

	@OriginalMember(owner = "client!td", name = "E", descriptor = "[I")
	public int[] anIntArray578;

	@OriginalMember(owner = "client!td", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray90;

	@OriginalMember(owner = "client!td", name = "G", descriptor = "Z")
	public boolean aBoolean496 = true;

	static {
		new Class85(null, "Spieler nicht auf deiner Freunde-Liste.", null, null);
		new Class85("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IILclient!rg;)V")
	public void method5348(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class5_Sub12 arg1) {
		if (this.anIntArray577 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray577.length; local13++) {
			if (local13 >= arg0.length) {
				return;
			}
			@Pc(21) int local21 = Static79.anIntArray124[this.method5356(local13)];
			if (local21 > 0) {
				arg1.method5107(local21, (long) arg0[local13]);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rg;B)Ljava/lang/String;")
	public String method5349(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(13) StringBuffer local13 = new StringBuffer(80);
		if (this.anIntArray577 != null) {
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray577.length; local18++) {
				local13.append(this.aStringArray60[local18]);
				local13.append(Static30.method543(this.anIntArray577[local18], arg0.method5077(Static60.anIntArray184[this.anIntArray577[local18]]), this.anIntArrayArray90[local18]));
			}
		}
		local13.append(this.aStringArray60[this.aStringArray60.length - 1]);
		return local13.toString();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rg;BI)V")
	private void method5350(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray60 = Static172.method4047(arg0.method5064(), '<');
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg1 == 2) {
			local22 = arg0.method5115();
			this.anIntArray578 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray578[local28] = arg0.method5106();
			}
		} else if (arg1 == 3) {
			local22 = arg0.method5115();
			this.anIntArrayArray90 = new int[local22][];
			this.anIntArray577 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				@Pc(67) int local67 = arg0.method5106();
				this.anIntArray577[local28] = local67;
				this.anIntArrayArray90[local28] = new int[Static347.anIntArray631[local67]];
				for (@Pc(82) int local82 = 0; local82 < Static347.anIntArray631[local67]; local82++) {
					this.anIntArrayArray90[local28][local82] = arg0.method5106();
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean496 = false;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	public int method5351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray577 == null || arg1 < 0 || arg1 > this.anIntArray577.length) {
			return -1;
		} else if (this.anIntArrayArray90[arg1] == null || arg0 < 0 || this.anIntArrayArray90[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray90[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Lclient!rg;B)V")
	public void method5352(@OriginalArg(0) Class5_Sub12 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method5115();
			if (local3 == 0) {
				return;
			}
			this.method5350(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
	public void method5353() {
		if (this.anIntArray578 != null) {
			for (@Pc(16) int local16 = 0; local16 < this.anIntArray578.length; local16++) {
				this.anIntArray578[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)I")
	public int method5355() {
		return this.anIntArray577 == null ? 0 : this.anIntArray577.length;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(IB)I")
	public int method5356(@OriginalArg(0) int arg0) {
		return this.anIntArray577 == null || arg0 < 0 || arg0 > this.anIntArray577.length ? -1 : this.anIntArray577[arg0];
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "(I)Ljava/lang/String;")
	public String method5359() {
		@Pc(8) StringBuffer local8 = new StringBuffer(80);
		if (this.aStringArray60 == null) {
			return "";
		}
		local8.append(this.aStringArray60[0]);
		for (@Pc(22) int local22 = 1; local22 < this.aStringArray60.length; local22++) {
			local8.append("...");
			local8.append(this.aStringArray60[local22]);
		}
		return local8.toString();
	}
}
