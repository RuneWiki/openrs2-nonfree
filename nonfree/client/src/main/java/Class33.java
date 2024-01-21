import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PTKBILNJ")
public final class Class33 {

	@OriginalMember(owner = "client!PTKBILNJ", name = "f", descriptor = "I")
	public static int anInt468;

	@OriginalMember(owner = "client!PTKBILNJ", name = "g", descriptor = "[Lclient!PTKBILNJ;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!PTKBILNJ", name = "a", descriptor = "Z")
	private static boolean aBoolean127 = true;

	@OriginalMember(owner = "client!PTKBILNJ", name = "d", descriptor = "Z")
	private static boolean aBoolean129 = true;

	@OriginalMember(owner = "client!PTKBILNJ", name = "i", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!PTKBILNJ", name = "b", descriptor = "B")
	private byte aByte13 = 96;

	@OriginalMember(owner = "client!PTKBILNJ", name = "c", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!PTKBILNJ", name = "e", descriptor = "I")
	private int anInt467 = -47097;

	@OriginalMember(owner = "client!PTKBILNJ", name = "h", descriptor = "I")
	public int anInt469 = -1;

	@OriginalMember(owner = "client!PTKBILNJ", name = "j", descriptor = "[I")
	private int[] anIntArray146 = new int[6];

	@OriginalMember(owner = "client!PTKBILNJ", name = "k", descriptor = "[I")
	private int[] anIntArray147 = new int[6];

	@OriginalMember(owner = "client!PTKBILNJ", name = "l", descriptor = "[I")
	private int[] anIntArray148 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!PTKBILNJ", name = "m", descriptor = "Z")
	public boolean aBoolean130 = false;

	@OriginalMember(owner = "client!PTKBILNJ", name = "a", descriptor = "(ILclient!TXPLZUUI;)V")
	public static void method349(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		try {
			if (arg0 < 3 || arg0 > 3) {
				aBoolean129 = !aBoolean129;
			}
			@Pc(20) Class5_Sub1_Sub4 local20 = new Class5_Sub1_Sub4(arg1.method464("idk.dat", null), 0);
			anInt468 = local20.method242();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt468];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt468; local30++) {
				if (aClass33Array1[local30] == null) {
					aClass33Array1[local30] = new Class33();
				}
				aClass33Array1[local30].method350(local20, aBoolean127);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("64366, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTKBILNJ", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!PTKBILNJ", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	private void method350(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				this.aBoolean128 = !this.aBoolean128;
			}
			while (true) {
				while (true) {
					@Pc(14) int local14 = arg0.method240();
					if (local14 == 0) {
						return;
					}
					if (local14 == 1) {
						this.anInt469 = arg0.method240();
					} else if (local14 == 2) {
						@Pc(32) int local32 = arg0.method240();
						this.anIntArray145 = new int[local32];
						for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
							this.anIntArray145[local38] = arg0.method242();
						}
					} else if (local14 == 3) {
						this.aBoolean130 = true;
					} else if (local14 >= 40 && local14 < 50) {
						this.anIntArray146[local14 - 40] = arg0.method242();
					} else if (local14 >= 50 && local14 < 60) {
						this.anIntArray147[local14 - 50] = arg0.method242();
					} else if (local14 >= 60 && local14 < 70) {
						this.anIntArray148[local14 - 60] = arg0.method242();
					} else {
						System.out.println("Error unrecognised config code: " + local14);
					}
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("80833, " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTKBILNJ", name = "a", descriptor = "(B)Z")
	public boolean method351() {
		try {
			if (this.anIntArray145 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray145.length; local14++) {
				if (!Class5_Sub1_Sub2_Sub5.method325(this.anIntArray145[local14])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("90504, " + -91 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTKBILNJ", name = "a", descriptor = "(I)Lclient!PSGMMDJS;")
	public Class5_Sub1_Sub2_Sub5 method352() {
		try {
			if (this.anIntArray145 == null) {
				return null;
			}
			@Pc(11) Class5_Sub1_Sub2_Sub5[] local11 = new Class5_Sub1_Sub2_Sub5[this.anIntArray145.length];
			for (@Pc(25) int local25 = 0; local25 < this.anIntArray145.length; local25++) {
				local11[local25] = Class5_Sub1_Sub2_Sub5.method324(this.anIntArray145[local25]);
			}
			@Pc(49) Class5_Sub1_Sub2_Sub5 local49;
			if (local11.length == 1) {
				local49 = local11[0];
			} else {
				local49 = new Class5_Sub1_Sub2_Sub5(8111, local11.length, local11);
			}
			for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray146[local61] != 0; local61++) {
				local49.method338(this.anIntArray146[local61], this.anIntArray147[local61]);
			}
			return local49;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("6020, " + 8 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTKBILNJ", name = "b", descriptor = "(I)Z")
	public boolean method353() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray148[local9] != -1 && !Class5_Sub1_Sub2_Sub5.method325(this.anIntArray148[local9])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("8930, " + -44 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PTKBILNJ", name = "b", descriptor = "(B)Lclient!PSGMMDJS;")
	public Class5_Sub1_Sub2_Sub5 method354() {
		try {
			@Pc(4) Class5_Sub1_Sub2_Sub5[] local4 = new Class5_Sub1_Sub2_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray148[local8] != -1) {
					local4[local6++] = Class5_Sub1_Sub2_Sub5.method324(this.anIntArray148[local8]);
				}
			}
			@Pc(36) Class5_Sub1_Sub2_Sub5 local36 = new Class5_Sub1_Sub2_Sub5(8111, local6, local4);
			if (this.aByte13 != 96) {
				throw new NullPointerException();
			}
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray146[local46] != 0; local46++) {
				local36.method338(this.anIntArray146[local46], this.anIntArray147[local46]);
			}
			return local36;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("73573, " + 96 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
