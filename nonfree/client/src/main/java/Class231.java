import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class231 {

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "[I")
	public int[] anIntArray517;

	@OriginalMember(owner = "client!tq", name = "F", descriptor = "[[I")
	public int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public int anInt6971 = -1;

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
	public int anInt6972 = -1;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
	public int anInt6975 = -1;

	@OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
	public int anInt6981 = -1;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
	public int anInt6979 = -1;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
	public int anInt6987 = -1;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	public int anInt6985 = -1;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	public int anInt6991 = -1;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
	public int anInt6977 = 0;

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
	public int anInt6989 = -1;

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
	public int anInt6974 = 0;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
	public int anInt6976 = -1;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	public int anInt6984 = -1;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
	public int anInt6978 = -1;

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
	public int anInt6995 = 0;

	@OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
	public int anInt6982 = -1;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public int anInt6980 = -1;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
	public int anInt6983 = 0;

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "I")
	public int anInt6998 = -1;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public int anInt6973 = -1;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
	private int anInt6992 = 0;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
	public int anInt6986 = -1;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
	public int anInt6996 = 0;

	@OriginalMember(owner = "client!tq", name = "H", descriptor = "I")
	public int anInt6999 = 0;

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
	public int anInt7005 = -1;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
	public int anInt6990 = 0;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
	public int anInt6970 = -1;

	@OriginalMember(owner = "client!tq", name = "J", descriptor = "I")
	public int anInt7001 = -1;

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "[I")
	public int[] anIntArray518 = null;

	@OriginalMember(owner = "client!tq", name = "N", descriptor = "I")
	public int anInt7004 = -1;

	@OriginalMember(owner = "client!tq", name = "R", descriptor = "I")
	public int anInt7007 = -1;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "[I")
	public int[] anIntArray516 = null;

	@OriginalMember(owner = "client!tq", name = "M", descriptor = "I")
	public int anInt7003 = 0;

	@OriginalMember(owner = "client!tq", name = "C", descriptor = "Z")
	public boolean aBoolean586 = true;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	public int anInt6993 = 0;

	@OriginalMember(owner = "client!tq", name = "W", descriptor = "I")
	public int anInt7012 = -1;

	@OriginalMember(owner = "client!tq", name = "V", descriptor = "I")
	public int anInt7011 = 0;

	@OriginalMember(owner = "client!tq", name = "U", descriptor = "I")
	public int anInt7010 = -1;

	@OriginalMember(owner = "client!tq", name = "X", descriptor = "I")
	public int anInt7013 = 0;

	@OriginalMember(owner = "client!tq", name = "L", descriptor = "I")
	public int anInt7002 = 0;

	@OriginalMember(owner = "client!tq", name = "S", descriptor = "I")
	public int anInt7008 = -1;

	static {
		new Class96("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLclient!ti;I)V")
	private void method5397(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt6986 = arg0.method4498();
			this.anInt6980 = arg0.method4498();
			if (this.anInt6980 == 65535) {
				this.anInt6980 = -1;
			}
			if (this.anInt6986 == 65535) {
				this.anInt6986 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt7005 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt6973 = arg0.method4498();
		} else if (arg1 == 4) {
			this.anInt7004 = arg0.method4498();
		} else if (arg1 == 5) {
			this.anInt6976 = arg0.method4498();
		} else if (arg1 == 6) {
			this.anInt6975 = arg0.method4498();
		} else if (arg1 == 7) {
			this.anInt6972 = arg0.method4498();
		} else if (arg1 == 8) {
			this.anInt6984 = arg0.method4498();
		} else if (arg1 == 9) {
			this.anInt6998 = arg0.method4498();
		} else if (arg1 == 26) {
			this.anInt6990 = (short) (arg0.method4548() * 4);
			this.anInt6999 = (short) (arg0.method4548() * 4);
		} else {
			@Pc(100) int local100;
			@Pc(108) int local108;
			if (arg1 == 27) {
				if (this.anIntArrayArray51 == null) {
					this.anIntArrayArray51 = new int[12][];
				}
				local100 = arg0.method4548();
				this.anIntArrayArray51[local100] = new int[6];
				for (local108 = 0; local108 < 6; local108++) {
					this.anIntArrayArray51[local100][local108] = arg0.method4531();
				}
			} else if (arg1 == 28) {
				this.anIntArray517 = new int[12];
				for (local100 = 0; local100 < 12; local100++) {
					this.anIntArray517[local100] = arg0.method4548();
					if (this.anIntArray517[local100] == 255) {
						this.anIntArray517[local100] = -1;
					}
				}
			} else if (arg1 == 29) {
				this.anInt7011 = arg0.method4548();
			} else if (arg1 == 30) {
				this.anInt6983 = arg0.method4498();
			} else if (arg1 == 31) {
				this.anInt6974 = arg0.method4548();
			} else if (arg1 == 32) {
				this.anInt6993 = arg0.method4498();
			} else if (arg1 == 33) {
				this.anInt7003 = arg0.method4531();
			} else if (arg1 == 34) {
				this.anInt7002 = arg0.method4548();
			} else if (arg1 == 35) {
				this.anInt6995 = arg0.method4498();
			} else if (arg1 == 36) {
				this.anInt7013 = arg0.method4531();
			} else if (arg1 == 37) {
				this.anInt6978 = arg0.method4548();
			} else if (arg1 == 38) {
				this.anInt6971 = arg0.method4498();
			} else if (arg1 == 39) {
				this.anInt6987 = arg0.method4498();
			} else if (arg1 == 40) {
				this.anInt6970 = arg0.method4498();
			} else if (arg1 == 41) {
				this.anInt6982 = arg0.method4498();
			} else if (arg1 == 42) {
				this.anInt6979 = arg0.method4498();
			} else if (arg1 == 43) {
				this.anInt6991 = arg0.method4498();
			} else if (arg1 == 44) {
				this.anInt6985 = arg0.method4498();
			} else if (arg1 == 45) {
				this.anInt7007 = arg0.method4498();
			} else if (arg1 == 46) {
				this.anInt7012 = arg0.method4498();
			} else if (arg1 == 47) {
				this.anInt7001 = arg0.method4498();
			} else if (arg1 == 48) {
				this.anInt6989 = arg0.method4498();
			} else if (arg1 == 49) {
				this.anInt6981 = arg0.method4498();
			} else if (arg1 == 50) {
				this.anInt7010 = arg0.method4498();
			} else if (arg1 == 51) {
				this.anInt7008 = arg0.method4498();
			} else if (arg1 == 52) {
				local100 = arg0.method4548();
				this.anIntArray516 = new int[local100];
				this.anIntArray518 = new int[local100];
				for (local108 = 0; local108 < local100; local108++) {
					this.anIntArray518[local108] = arg0.method4498();
					@Pc(373) int local373 = arg0.method4548();
					this.anIntArray516[local108] = local373;
					this.anInt6992 += local373;
				}
			} else if (arg1 == 53) {
				this.aBoolean586 = false;
			} else if (arg1 == 54) {
				this.anInt6996 = arg0.method4548() << 6;
				this.anInt6977 = arg0.method4548() << 6;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLclient!ti;)V")
	public void method5398(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method5397(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)Z")
	public boolean method5400(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (this.anInt6986 == arg0) {
			return true;
		} else {
			if (this.anIntArray518 != null) {
				for (@Pc(29) int local29 = 0; local29 < this.anIntArray518.length; local29++) {
					if (arg0 == this.anIntArray518[local29]) {
						return true;
					}
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)I")
	public int method5402() {
		if (this.anInt6986 != -1) {
			return this.anInt6986;
		} else if (this.anIntArray518 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) ((double) this.anInt6992 * Math.random());
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray516[local30]; local30++) {
				local28 -= this.anIntArray516[local30];
			}
			return this.anIntArray518[local30];
		}
	}
}
