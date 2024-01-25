import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class2_Sub10_Sub6 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ed", name = "F", descriptor = "[I")
	public int[] anIntArray315;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray43;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "Z")
	public boolean aBoolean102 = true;

	static {
		new Class32("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class101("", 76);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBLclient!kk;)V")
	private void method1138(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (arg0 == 1) {
			this.aStringArray43 = Static104.method2176('<', arg1.method5364());
			return;
		}
		@Pc(27) int local27;
		@Pc(33) int local33;
		if (arg0 == 2) {
			local27 = arg1.method5350();
			this.anIntArray315 = new int[local27];
			for (local33 = 0; local33 < local27; local33++) {
				this.anIntArray315[local33] = arg1.method5312();
			}
		} else if (arg0 == 3) {
			local27 = arg1.method5350();
			this.anIntArray316 = new int[local27];
			this.anIntArrayArray14 = new int[local27][];
			for (local33 = 0; local33 < local27; local33++) {
				@Pc(87) int local87 = arg1.method5312();
				this.anIntArray316[local33] = local87;
				this.anIntArrayArray14[local33] = new int[Static89.anIntArray385[local87]];
				for (@Pc(102) int local102 = 0; local102 < Static89.anIntArray385[local87]; local102++) {
					this.anIntArrayArray14[local33][local102] = arg1.method5312();
				}
			}
		} else if (arg0 == 4) {
			this.aBoolean102 = false;
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(B)V")
	public void method1139() {
		if (this.anIntArray315 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray315.length; local14++) {
				this.anIntArray315[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IBI)I")
	public int method1140(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray316 == null || arg1 < 0 || arg1 > this.anIntArray316.length) {
			return -1;
		} else if (this.anIntArrayArray14[arg1] == null || arg0 < 0 || arg0 > this.anIntArrayArray14[arg1].length) {
			return -1;
		} else {
			return this.anIntArrayArray14[arg1][arg0];
		}
	}

	@OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)I")
	public int method1141() {
		return this.anIntArray316 == null ? 0 : this.anIntArray316.length;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method1142(@OriginalArg(0) Class2_Sub16 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method5350();
			if (local16 == 0) {
				return;
			}
			this.method1138(local16, arg0);
		}
	}

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "(B)Ljava/lang/String;")
	public String method1143() {
		@Pc(15) StringBuffer local15 = new StringBuffer(80);
		if (this.aStringArray43 == null) {
			return "";
		}
		local15.append(this.aStringArray43[0]);
		for (@Pc(29) int local29 = 1; local29 < this.aStringArray43.length; local29++) {
			local15.append("...");
			local15.append(this.aStringArray43[local29]);
		}
		return local15.toString();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B[ILclient!kk;)V")
	public void method1144(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class2_Sub16 arg1) {
		if (this.anIntArray316 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray316.length; local18++) {
			if (local18 >= arg0.length) {
				return;
			}
			@Pc(27) int local27 = Static141.anIntArray578[this.method1146(local18)];
			if (local27 > 0) {
				arg1.method5360((long) arg0[local18], local27);
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!kk;)Ljava/lang/String;")
	public String method1145(@OriginalArg(1) Class2_Sub16 arg0) {
		@Pc(17) StringBuffer local17 = new StringBuffer(80);
		if (this.anIntArray316 != null) {
			for (@Pc(22) int local22 = 0; local22 < this.anIntArray316.length; local22++) {
				local17.append(this.aStringArray43[local22]);
				local17.append(Static292.method4416(arg0.method5322(Static62.anIntArray268[this.anIntArray316[local22]]), this.anIntArrayArray14[local22], this.anIntArray316[local22]));
			}
		}
		local17.append(this.aStringArray43[this.aStringArray43.length - 1]);
		return local17.toString();
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)I")
	public int method1146(@OriginalArg(1) int arg0) {
		return this.anIntArray316 == null || arg0 < 0 || arg0 > this.anIntArray316.length ? -1 : this.anIntArray316[arg0];
	}
}
