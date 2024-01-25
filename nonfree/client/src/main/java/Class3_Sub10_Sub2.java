import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class3_Sub10_Sub2 extends Class3_Sub10 {

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
	public int[] anIntArray147;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "[C")
	public char[] aCharArray2;

	static {
		new Class67("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
		new Class67(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILclient!rt;)V")
	private void method1033(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 1) {
			this.aString9 = arg1.method7589();
			return;
		}
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(46) byte local46;
		if (arg0 == 2) {
			local23 = arg1.method7548();
			this.anIntArray147 = new int[local23];
			this.aCharArray2 = new char[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray147[local33] = arg1.method7591();
				local46 = arg1.method7584();
				this.aCharArray2[local33] = local46 == 0 ? 0 : Static473.method6742(local46);
			}
		} else if (arg0 == 3) {
			local23 = arg1.method7548();
			this.aCharArray1 = new char[local23];
			this.anIntArray148 = new int[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray148[local33] = arg1.method7591();
				local46 = arg1.method7584();
				this.aCharArray1[local33] = local46 == 0 ? 0 : Static473.method6742(local46);
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lclient!rt;I)V")
	public void method1035(@OriginalArg(0) Class3_Sub27 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7548();
			if (local9 == 0) {
				return;
			}
			this.method1033(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "(I)V")
	public void method1036() {
		@Pc(6) int local6;
		if (this.anIntArray148 != null) {
			for (local6 = 0; local6 < this.anIntArray148.length; local6++) {
				this.anIntArray148[local6] |= 0x8000;
			}
		}
		if (this.anIntArray147 != null) {
			for (local6 = 0; local6 < this.anIntArray147.length; local6++) {
				this.anIntArray147[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IC)I")
	public int method1037(@OriginalArg(1) char arg0) {
		if (this.anIntArray147 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray147.length; local12++) {
			if (arg0 == this.aCharArray2[local12]) {
				return this.anIntArray147[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(CI)I")
	public int method1039(@OriginalArg(0) char arg0) {
		if (this.anIntArray148 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray148.length; local12++) {
			if (this.aCharArray1[local12] == arg0) {
				return this.anIntArray148[local12];
			}
		}
		return -1;
	}
}
