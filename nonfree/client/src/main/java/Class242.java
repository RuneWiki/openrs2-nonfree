import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class242 {

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "Lclient!lq;")
	public Class179 aClass179_2;

	@OriginalMember(owner = "client!qp", name = "h", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!qp", name = "m", descriptor = "[I")
	private int[] anIntArray693;

	@OriginalMember(owner = "client!qp", name = "r", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!qp", name = "i", descriptor = "[I")
	private final int[] anIntArray692 = new int[] { -1, -1, -1, -1, -1 };

	static {
		new Class45("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
		new Class45(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IILclient!os;)V")
	private void method6383(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			arg1.method4487();
			return;
		}
		@Pc(13) int local13;
		@Pc(19) int local19;
		if (arg0 == 2) {
			local13 = arg1.method4487();
			this.anIntArray693 = new int[local13];
			for (local19 = 0; local19 < local13; local19++) {
				this.anIntArray693[local19] = arg1.method4494();
			}
		} else if (arg0 != 3) {
			if (arg0 == 40) {
				local13 = arg1.method4487();
				this.aShortArray108 = new short[local13];
				this.aShortArray109 = new short[local13];
				for (local19 = 0; local19 < local13; local19++) {
					this.aShortArray109[local19] = (short) arg1.method4494();
					this.aShortArray108[local19] = (short) arg1.method4494();
				}
			} else if (arg0 == 41) {
				local13 = arg1.method4487();
				this.aShortArray111 = new short[local13];
				this.aShortArray110 = new short[local13];
				for (local19 = 0; local19 < local13; local19++) {
					this.aShortArray110[local19] = (short) arg1.method4494();
					this.aShortArray111[local19] = (short) arg1.method4494();
				}
			} else if (arg0 >= 60 && arg0 < 70) {
				this.anIntArray692[arg0 - 60] = arg1.method4494();
			}
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BLclient!os;)V")
	public void method6386(@OriginalArg(1) Class1_Sub17 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4487();
			if (local5 == 0) {
				return;
			}
			this.method6383(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)Lclient!ei;")
	public Class81 method6387() {
		if (this.anIntArray693 == null) {
			return null;
		}
		@Pc(15) Class81[] local15 = new Class81[this.anIntArray693.length];
		@Pc(19) Class69 local19 = this.aClass179_2.aClass69_57;
		synchronized (this.aClass179_2.aClass69_57) {
			@Pc(23) int local23 = 0;
			while (true) {
				if (local23 >= this.anIntArray693.length) {
					break;
				}
				local15[local23] = Static274.method4851(this.anIntArray693[local23], this.aClass179_2.aClass69_57);
				local23++;
			}
		}
		for (@Pc(56) int local56 = 0; local56 < this.anIntArray693.length; local56++) {
			if (local15[local56].anInt2236 < 13) {
				local15[local56].method2155();
			}
		}
		@Pc(92) Class81 local92;
		if (local15.length == 1) {
			local92 = local15[0];
		} else {
			local92 = new Class81(local15, local15.length);
		}
		if (local92 == null) {
			return null;
		}
		@Pc(110) int local110;
		if (this.aShortArray109 != null) {
			for (local110 = 0; local110 < this.aShortArray109.length; local110++) {
				local92.method2157(this.aShortArray109[local110], this.aShortArray108[local110]);
			}
		}
		if (this.aShortArray110 != null) {
			for (local110 = 0; local110 < this.aShortArray110.length; local110++) {
				local92.method2156(this.aShortArray110[local110], this.aShortArray111[local110]);
			}
		}
		return local92;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)Z")
	public boolean method6389() {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class69 local11 = this.aClass179_2.aClass69_57;
		synchronized (this.aClass179_2.aClass69_57) {
			for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
				if (this.anIntArray692[local15] != -1 && !this.aClass179_2.aClass69_57.method1893(this.anIntArray692[local15], 0)) {
					local7 = false;
				}
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "(I)Z")
	public boolean method6390() {
		if (this.anIntArray693 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		@Pc(21) Class69 local21 = this.aClass179_2.aClass69_57;
		synchronized (this.aClass179_2.aClass69_57) {
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray693.length; local25++) {
				if (!this.aClass179_2.aClass69_57.method1893(this.anIntArray693[local25], 0)) {
					local17 = false;
				}
			}
			return local17;
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)Lclient!ei;")
	public Class81 method6393() {
		@Pc(8) Class81[] local8 = new Class81[5];
		@Pc(10) int local10 = 0;
		@Pc(14) Class69 local14 = this.aClass179_2.aClass69_57;
		@Pc(23) int local23;
		synchronized (this.aClass179_2.aClass69_57) {
			local23 = 0;
			while (true) {
				if (local23 >= 5) {
					break;
				}
				if (this.anIntArray692[local23] != -1) {
					local8[local10++] = Static274.method4851(this.anIntArray692[local23], this.aClass179_2.aClass69_57);
				}
				local23++;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < 5; local57++) {
			if (local8[local57] != null && local8[local57].anInt2236 < 13) {
				local8[local57].method2155();
			}
		}
		@Pc(87) Class81 local87 = new Class81(local8, local10);
		if (this.aShortArray109 != null) {
			for (local23 = 0; local23 < this.aShortArray109.length; local23++) {
				local87.method2157(this.aShortArray109[local23], this.aShortArray108[local23]);
			}
		}
		if (this.aShortArray110 != null) {
			for (local23 = 0; local23 < this.aShortArray110.length; local23++) {
				local87.method2156(this.aShortArray110[local23], this.aShortArray111[local23]);
			}
		}
		return local87;
	}
}
