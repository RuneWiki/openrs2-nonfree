import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!oc")
public final class Class29 {

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	private static int anInt806;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[Lclient!oc;")
	public static Class29[] aClass29Array1;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	private static int anInt805 = 6771;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "Z")
	private static boolean aBoolean201 = true;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "[I")
	public int[] anIntArray238;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
	public int[] anIntArray240;

	@OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	public int anInt808 = -1;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
	public boolean aBoolean202 = false;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
	public int anInt809 = 5;

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
	public int anInt810 = -1;

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public int anInt811 = -1;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public int anInt812 = 99;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
	public int anInt813 = -1;

	@OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
	public int anInt814 = -1;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method528(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method689("seq.dat", null), true);
			anInt806 = local8.method505();
			if (aClass29Array1 == null) {
				aClass29Array1 = new Class29[anInt806];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt806; local18++) {
				if (aClass29Array1[local18] == null) {
					aClass29Array1[local18] = new Class29();
				}
				aClass29Array1[local18].method530(local8);
			}
			if (anInt805 != 6771) {
				aBoolean201 = !aBoolean201;
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("76424, " + 6771 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class29() {
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)I")
	public int method529(@OriginalArg(1) int arg0) {
		try {
			@Pc(12) int local12 = this.anIntArray239[arg0];
			if (local12 == 0) {
				@Pc(21) Class12 local21 = Class12.method303(this.anIntArray237[arg0]);
				if (local21 != null) {
					local12 = this.anIntArray239[arg0] = local21.anInt535;
				}
			}
			if (local12 == 0) {
				local12 = 1;
			}
			return local12;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("57565, " + 1 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLclient!mb;)V")
	private void method530(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method503();
				if (local11 == 0) {
					if (this.anInt807 == 0) {
						this.anInt807 = 1;
						this.anIntArray237 = new int[1];
						this.anIntArray237[0] = -1;
						this.anIntArray238 = new int[1];
						this.anIntArray238[0] = -1;
						this.anIntArray239 = new int[1];
						this.anIntArray239[0] = -1;
					}
					if (this.anInt813 == -1) {
						if (this.anIntArray240 == null) {
							this.anInt813 = 0;
						} else {
							this.anInt813 = 2;
						}
					}
					if (this.anInt814 == -1) {
						if (this.anIntArray240 != null) {
							this.anInt814 = 2;
							return;
						}
						this.anInt814 = 0;
						return;
					}
					return;
				}
				@Pc(38) int local38;
				if (local11 == 1) {
					this.anInt807 = arg0.method503();
					this.anIntArray237 = new int[this.anInt807];
					this.anIntArray238 = new int[this.anInt807];
					this.anIntArray239 = new int[this.anInt807];
					for (local38 = 0; local38 < this.anInt807; local38++) {
						this.anIntArray237[local38] = arg0.method505();
						this.anIntArray238[local38] = arg0.method505();
						if (this.anIntArray238[local38] == 65535) {
							this.anIntArray238[local38] = -1;
						}
						this.anIntArray239[local38] = arg0.method505();
					}
				} else if (local11 == 2) {
					this.anInt808 = arg0.method505();
				} else if (local11 == 3) {
					local38 = arg0.method503();
					this.anIntArray240 = new int[local38 + 1];
					for (@Pc(99) int local99 = 0; local99 < local38; local99++) {
						this.anIntArray240[local99] = arg0.method503();
					}
					this.anIntArray240[local38] = 9999999;
				} else if (local11 == 4) {
					this.aBoolean202 = true;
				} else if (local11 == 5) {
					this.anInt809 = arg0.method503();
				} else if (local11 == 6) {
					this.anInt810 = arg0.method505();
				} else if (local11 == 7) {
					this.anInt811 = arg0.method505();
				} else if (local11 == 8) {
					this.anInt812 = arg0.method503();
				} else if (local11 == 9) {
					this.anInt813 = arg0.method503();
				} else if (local11 == 10) {
					this.anInt814 = arg0.method503();
				} else if (local11 == 11) {
					this.anInt815 = arg0.method503();
				} else {
					System.out.println("Error unrecognised seq config code: " + local11);
				}
			}
		} catch (@Pc(264) RuntimeException local264) {
			signlink.reporterror("95511, " + 44 + ", " + arg0 + ", " + local264.toString());
			throw new RuntimeException();
		}
	}
}
