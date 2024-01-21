import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public static int anInt731;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "Z")
	private boolean aBoolean149 = true;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt730 = -797;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt732 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
	private int[] anIntArray202 = new int[6];

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "[I")
	private int[] anIntArray203 = new int[6];

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	private int[] anIntArray204 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
	public boolean aBoolean150 = false;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!yb;I)V")
	public static void method425(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method644("idk.dat", null), true);
			@Pc(12) boolean local12 = false;
			anInt731 = local8.method470();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt731];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt731; local22++) {
				if (aClass21Array1[local22] == null) {
					aClass21Array1[local22] = new Class21();
				}
				aClass21Array1[local22].method426(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("1762, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method426(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method468();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt732 = arg0.method468();
				} else if (local14 == 2) {
					@Pc(32) int local32 = arg0.method468();
					this.anIntArray201 = new int[local32];
					for (@Pc(38) int local38 = 0; local38 < local32; local38++) {
						this.anIntArray201[local38] = arg0.method470();
					}
				} else if (local14 == 3) {
					this.aBoolean150 = true;
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray202[local14 - 40] = arg0.method470();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray203[local14 - 50] = arg0.method470();
				} else if (local14 >= 60 && local14 < 70) {
					this.anIntArray204[local14 - 60] = arg0.method470();
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("44749, " + 3251 + ", " + arg0 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Z")
	public boolean method427() {
		try {
			if (this.anIntArray201 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray201.length; local18++) {
				if (!Class1_Sub1_Sub1_Sub5.method280(this.anIntArray201[local18])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("3053, " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method428(@OriginalArg(0) int arg0) {
		try {
			if (this.anIntArray201 == null) {
				return null;
			}
			@Pc(11) Class1_Sub1_Sub1_Sub5[] local11 = new Class1_Sub1_Sub1_Sub5[this.anIntArray201.length];
			@Pc(15) boolean local15 = false;
			for (@Pc(17) int local17 = 0; local17 < this.anIntArray201.length; local17++) {
				local11[local17] = Class1_Sub1_Sub1_Sub5.method279(this.anIntArray201[local17], this.anInt730);
			}
			@Pc(43) Class1_Sub1_Sub1_Sub5 local43;
			if (local11.length == 1) {
				local43 = local11[0];
			} else {
				local43 = new Class1_Sub1_Sub1_Sub5(local11.length, local11, (byte) 4);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray202[local55] != 0; local55++) {
				local43.method293(this.anIntArray202[local55], this.anIntArray203[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("30124, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Z")
	public boolean method429(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
				if (this.anIntArray204[local5] != -1 && !Class1_Sub1_Sub1_Sub5.method280(this.anIntArray204[local5])) {
					local3 = false;
				}
			}
			while (arg0 >= 0) {
				for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
				}
			}
			return local3;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("10739, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)Lclient!fb;")
	public Class1_Sub1_Sub1_Sub5 method430() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray204[local14] != -1) {
					local4[local12++] = Class1_Sub1_Sub1_Sub5.method279(this.anIntArray204[local14], this.anInt730);
				}
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = new Class1_Sub1_Sub1_Sub5(local12, local4, (byte) 4);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray202[local46] != 0; local46++) {
				local44.method293(this.anIntArray202[local46], this.anIntArray203[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("59833, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
