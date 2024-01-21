import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LMDSPIVT")
public final class Class20 {

	@OriginalMember(owner = "client!LMDSPIVT", name = "c", descriptor = "I")
	private static int anInt324;

	@OriginalMember(owner = "client!LMDSPIVT", name = "d", descriptor = "[Lclient!LMDSPIVT;")
	public static Class20[] aClass20Array1;

	@OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "Z")
	private static boolean aBoolean74 = true;

	@OriginalMember(owner = "client!LMDSPIVT", name = "e", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!LMDSPIVT", name = "f", descriptor = "[I")
	public int[] anIntArray110;

	@OriginalMember(owner = "client!LMDSPIVT", name = "g", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!LMDSPIVT", name = "h", descriptor = "[I")
	private int[] anIntArray112;

	@OriginalMember(owner = "client!LMDSPIVT", name = "j", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!LMDSPIVT", name = "s", descriptor = "I")
	private int anInt334;

	@OriginalMember(owner = "client!LMDSPIVT", name = "b", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!LMDSPIVT", name = "i", descriptor = "I")
	public int anInt326 = -1;

	@OriginalMember(owner = "client!LMDSPIVT", name = "k", descriptor = "Z")
	public boolean aBoolean76 = false;

	@OriginalMember(owner = "client!LMDSPIVT", name = "l", descriptor = "I")
	public int anInt327 = 5;

	@OriginalMember(owner = "client!LMDSPIVT", name = "m", descriptor = "I")
	public int anInt328 = -1;

	@OriginalMember(owner = "client!LMDSPIVT", name = "n", descriptor = "I")
	public int anInt329 = -1;

	@OriginalMember(owner = "client!LMDSPIVT", name = "o", descriptor = "I")
	public int anInt330 = 99;

	@OriginalMember(owner = "client!LMDSPIVT", name = "p", descriptor = "I")
	public int anInt331 = -1;

	@OriginalMember(owner = "client!LMDSPIVT", name = "q", descriptor = "I")
	public int anInt332 = -1;

	@OriginalMember(owner = "client!LMDSPIVT", name = "r", descriptor = "I")
	public int anInt333 = 2;

	@OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "(BLclient!SXKKBWPU;)V")
	public static void method169(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method364("seq.dat", null), -631);
			anInt324 = local8.method408();
			if (aClass20Array1 == null) {
				aClass20Array1 = new Class20[anInt324];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt324; local27++) {
				if (aClass20Array1[local27] == null) {
					aClass20Array1[local27] = new Class20();
				}
				aClass20Array1[local27].method171(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("26430, " + -109 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LMDSPIVT", name = "<init>", descriptor = "()V")
	private Class20() {
	}

	@OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "(II)I")
	public int method170(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray112[arg0];
			if (local4 == 0) {
				@Pc(22) Class34 local22 = Class34.method330(this.anIntArray110[arg0]);
				if (local22 != null) {
					local4 = this.anIntArray112[arg0] = local22.anInt547;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("19762, " + -204 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LMDSPIVT", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	private void method171(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(17) int local17 = arg0.method406();
				if (local17 == 0) {
					if (this.anInt325 == 0) {
						this.anInt325 = 1;
						this.anIntArray110 = new int[1];
						this.anIntArray110[0] = -1;
						this.anIntArray111 = new int[1];
						this.anIntArray111[0] = -1;
						this.anIntArray112 = new int[1];
						this.anIntArray112[0] = -1;
					}
					if (this.anInt331 == -1) {
						if (this.anIntArray113 == null) {
							this.anInt331 = 0;
						} else {
							this.anInt331 = 2;
						}
					}
					if (this.anInt332 == -1) {
						if (this.anIntArray113 != null) {
							this.anInt332 = 2;
							return;
						}
						this.anInt332 = 0;
						return;
					}
					return;
				}
				@Pc(44) int local44;
				if (local17 == 1) {
					this.anInt325 = arg0.method406();
					this.anIntArray110 = new int[this.anInt325];
					this.anIntArray111 = new int[this.anInt325];
					this.anIntArray112 = new int[this.anInt325];
					for (local44 = 0; local44 < this.anInt325; local44++) {
						this.anIntArray110[local44] = arg0.method408();
						this.anIntArray111[local44] = arg0.method408();
						if (this.anIntArray111[local44] == 65535) {
							this.anIntArray111[local44] = -1;
						}
						this.anIntArray112[local44] = arg0.method408();
					}
				} else if (local17 == 2) {
					this.anInt326 = arg0.method408();
				} else if (local17 == 3) {
					local44 = arg0.method406();
					this.anIntArray113 = new int[local44 + 1];
					for (@Pc(105) int local105 = 0; local105 < local44; local105++) {
						this.anIntArray113[local105] = arg0.method406();
					}
					this.anIntArray113[local44] = 9999999;
				} else if (local17 == 4) {
					this.aBoolean76 = true;
				} else if (local17 == 5) {
					this.anInt327 = arg0.method406();
				} else if (local17 == 6) {
					this.anInt328 = arg0.method408();
				} else if (local17 == 7) {
					this.anInt329 = arg0.method408();
				} else if (local17 == 8) {
					this.anInt330 = arg0.method406();
				} else if (local17 == 9) {
					this.anInt331 = arg0.method406();
				} else if (local17 == 10) {
					this.anInt332 = arg0.method406();
				} else if (local17 == 11) {
					this.anInt333 = arg0.method406();
				} else if (local17 == 12) {
					this.anInt334 = arg0.method411();
				} else {
					System.out.println("Error unrecognised seq config code: " + local17);
				}
			}
		} catch (@Pc(279) RuntimeException local279) {
			signlink.reporterror("12989, " + 3 + ", " + arg0 + ", " + local279.toString());
			throw new RuntimeException();
		}
	}
}
