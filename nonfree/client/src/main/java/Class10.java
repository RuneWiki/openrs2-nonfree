import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EHYLCNJX")
public final class Class10 {

	@OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "I")
	private static int anInt197;

	@OriginalMember(owner = "client!EHYLCNJX", name = "b", descriptor = "[Lclient!EHYLCNJX;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!EHYLCNJX", name = "c", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!EHYLCNJX", name = "d", descriptor = "[I")
	public int[] anIntArray68;

	@OriginalMember(owner = "client!EHYLCNJX", name = "e", descriptor = "[I")
	public int[] anIntArray69;

	@OriginalMember(owner = "client!EHYLCNJX", name = "f", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!EHYLCNJX", name = "h", descriptor = "[I")
	public int[] anIntArray71;

	@OriginalMember(owner = "client!EHYLCNJX", name = "q", descriptor = "I")
	private int anInt207;

	@OriginalMember(owner = "client!EHYLCNJX", name = "g", descriptor = "I")
	public int anInt199 = -1;

	@OriginalMember(owner = "client!EHYLCNJX", name = "i", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!EHYLCNJX", name = "j", descriptor = "I")
	public int anInt200 = 5;

	@OriginalMember(owner = "client!EHYLCNJX", name = "k", descriptor = "I")
	public int anInt201 = -1;

	@OriginalMember(owner = "client!EHYLCNJX", name = "l", descriptor = "I")
	public int anInt202 = -1;

	@OriginalMember(owner = "client!EHYLCNJX", name = "m", descriptor = "I")
	public int anInt203 = 99;

	@OriginalMember(owner = "client!EHYLCNJX", name = "n", descriptor = "I")
	public int anInt204 = -1;

	@OriginalMember(owner = "client!EHYLCNJX", name = "o", descriptor = "I")
	public int anInt205 = -1;

	@OriginalMember(owner = "client!EHYLCNJX", name = "p", descriptor = "I")
	public int anInt206 = 2;

	@OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "(Lclient!FUZJMGZB;I)V")
	public static void method159(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("seq.dat", null));
			anInt197 = local8.method269();
			if (aClass10Array1 == null) {
				aClass10Array1 = new Class10[anInt197];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt197; local22++) {
				if (aClass10Array1[local22] == null) {
					aClass10Array1[local22] = new Class10();
				}
				aClass10Array1[local22].method161(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("25051, " + arg0 + ", " + 5 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHYLCNJX", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "(II)I")
	public int method160(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray70[arg0];
			if (local4 == 0) {
				@Pc(17) Class32 local17 = Class32.method373(this.anIntArray68[arg0]);
				if (local17 != null) {
					local4 = this.anIntArray70[arg0] = local17.anInt442;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("44517, " + arg0 + ", " + -26977 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EHYLCNJX", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	private void method161(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method267();
				if (local11 == 0) {
					if (this.anInt198 == 0) {
						this.anInt198 = 1;
						this.anIntArray68 = new int[1];
						this.anIntArray68[0] = -1;
						this.anIntArray69 = new int[1];
						this.anIntArray69[0] = -1;
						this.anIntArray70 = new int[1];
						this.anIntArray70[0] = -1;
					}
					if (this.anInt204 == -1) {
						if (this.anIntArray71 == null) {
							this.anInt204 = 0;
						} else {
							this.anInt204 = 2;
						}
					}
					if (this.anInt205 == -1) {
						if (this.anIntArray71 != null) {
							this.anInt205 = 2;
							return;
						}
						this.anInt205 = 0;
						return;
					}
					return;
				}
				@Pc(38) int local38;
				if (local11 == 1) {
					this.anInt198 = arg0.method267();
					this.anIntArray68 = new int[this.anInt198];
					this.anIntArray69 = new int[this.anInt198];
					this.anIntArray70 = new int[this.anInt198];
					for (local38 = 0; local38 < this.anInt198; local38++) {
						this.anIntArray68[local38] = arg0.method269();
						this.anIntArray69[local38] = arg0.method269();
						if (this.anIntArray69[local38] == 65535) {
							this.anIntArray69[local38] = -1;
						}
						this.anIntArray70[local38] = arg0.method269();
					}
				} else if (local11 == 2) {
					this.anInt199 = arg0.method269();
				} else if (local11 == 3) {
					local38 = arg0.method267();
					this.anIntArray71 = new int[local38 + 1];
					for (@Pc(99) int local99 = 0; local99 < local38; local99++) {
						this.anIntArray71[local99] = arg0.method267();
					}
					this.anIntArray71[local38] = 9999999;
				} else if (local11 == 4) {
					this.aBoolean57 = true;
				} else if (local11 == 5) {
					this.anInt200 = arg0.method267();
				} else if (local11 == 6) {
					this.anInt201 = arg0.method269();
				} else if (local11 == 7) {
					this.anInt202 = arg0.method269();
				} else if (local11 == 8) {
					this.anInt203 = arg0.method267();
				} else if (local11 == 9) {
					this.anInt204 = arg0.method267();
				} else if (local11 == 10) {
					this.anInt205 = arg0.method267();
				} else if (local11 == 11) {
					this.anInt206 = arg0.method267();
				} else if (local11 == 12) {
					this.anInt207 = arg0.method272();
				} else {
					System.out.println("Error unrecognised seq config code: " + local11);
				}
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("43433, " + arg0 + ", " + 59 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}
}
