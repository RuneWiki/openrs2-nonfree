import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class6_Sub2_Sub16 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "[I")
	public int[] anIntArray507;

	@OriginalMember(owner = "client!ut", name = "L", descriptor = "Ljava/lang/String;")
	public String aString66;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "[I")
	public int[] anIntArray509;

	@OriginalMember(owner = "client!ut", name = "O", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!ut", name = "P", descriptor = "[C")
	public char[] aCharArray6;

	static {
		new Class267("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZC)I")
	public int method6062(@OriginalArg(1) char arg0) {
		if (this.anIntArray507 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray507.length; local17++) {
			if (this.aCharArray6[local17] == arg0) {
				return this.anIntArray507[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!ae;)V")
	public void method6064(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6433();
			if (local5 == 0) {
				return;
			}
			this.method6069(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BC)I")
	public int method6065(@OriginalArg(1) char arg0) {
		if (this.anIntArray509 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray509.length; local12++) {
			if (this.aCharArray5[local12] == arg0) {
				return this.anIntArray509[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "(B)V")
	public void method6067() {
		@Pc(6) int local6;
		if (this.anIntArray507 != null) {
			for (local6 = 0; local6 < this.anIntArray507.length; local6++) {
				this.anIntArray507[local6] |= 0x8000;
			}
		}
		if (this.anIntArray509 != null) {
			for (local6 = 0; local6 < this.anIntArray509.length; local6++) {
				this.anIntArray509[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!ae;IZ)V")
	private void method6069(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString66 = arg0.method6473();
			return;
		}
		@Pc(37) int local37;
		@Pc(47) int local47;
		@Pc(60) byte local60;
		if (arg1 == 2) {
			local37 = arg0.method6433();
			this.aCharArray5 = new char[local37];
			this.anIntArray509 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray509[local47] = arg0.method6485();
				local60 = arg0.method6438();
				this.aCharArray5[local47] = local60 == 0 ? 0 : Static199.method3102(local60);
			}
		} else if (arg1 == 3) {
			local37 = arg0.method6433();
			this.aCharArray6 = new char[local37];
			this.anIntArray507 = new int[local37];
			for (local47 = 0; local47 < local37; local47++) {
				this.anIntArray507[local47] = arg0.method6485();
				local60 = arg0.method6438();
				this.aCharArray6[local47] = local60 == 0 ? 0 : Static199.method3102(local60);
			}
			return;
		}
	}
}
