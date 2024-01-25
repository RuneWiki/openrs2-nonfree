import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sk", name = "z", descriptor = "[C")
	public char[] aCharArray7;

	@OriginalMember(owner = "client!sk", name = "F", descriptor = "[I")
	public int[] anIntArray426;

	@OriginalMember(owner = "client!sk", name = "G", descriptor = "[I")
	public int[] anIntArray427;

	@OriginalMember(owner = "client!sk", name = "I", descriptor = "Ljava/lang/String;")
	public String aString53;

	@OriginalMember(owner = "client!sk", name = "J", descriptor = "[C")
	public char[] aCharArray8;

	static {
		new Class256("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!md;)V")
	private void method5042(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.aString53 = arg1.method3717();
			return;
		}
		@Pc(28) int local28;
		@Pc(38) int local38;
		@Pc(51) byte local51;
		if (arg0 == 2) {
			local28 = arg1.method3737();
			this.aCharArray8 = new char[local28];
			this.anIntArray427 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray427[local38] = arg1.method3711();
				local51 = arg1.method3693();
				this.aCharArray8[local38] = local51 == 0 ? 0 : Static82.method1460(local51);
			}
		} else if (arg0 == 3) {
			local28 = arg1.method3737();
			this.aCharArray7 = new char[local28];
			this.anIntArray426 = new int[local28];
			for (local38 = 0; local38 < local28; local38++) {
				this.anIntArray426[local38] = arg1.method3711();
				local51 = arg1.method3693();
				this.aCharArray7[local38] = local51 == 0 ? 0 : Static82.method1460(local51);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(CI)I")
	public int method5043(@OriginalArg(0) char arg0) {
		if (this.anIntArray427 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray427.length; local17++) {
			if (arg0 == this.aCharArray8[local17]) {
				return this.anIntArray427[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILclient!md;)V")
	public void method5044(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3737();
			if (local5 == 0) {
				return;
			}
			this.method5042(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
	public void method5046() {
		@Pc(12) int local12;
		if (this.anIntArray426 != null) {
			for (local12 = 0; local12 < this.anIntArray426.length; local12++) {
				this.anIntArray426[local12] |= 0x8000;
			}
		}
		if (this.anIntArray427 != null) {
			for (local12 = 0; local12 < this.anIntArray427.length; local12++) {
				this.anIntArray427[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(BC)I")
	public int method5047(@OriginalArg(1) char arg0) {
		if (this.anIntArray426 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray426.length; local18++) {
			if (arg0 == this.aCharArray7[local18]) {
				return this.anIntArray426[local18];
			}
		}
		return -1;
	}
}
