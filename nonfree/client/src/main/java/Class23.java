import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
	public static int anInt750;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[I")
	private int[] anIntArray221;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private int anInt748 = 10514;

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private int anInt749 = 9;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt751 = -1;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "[I")
	private int[] anIntArray222 = new int[6];

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "[I")
	private int[] anIntArray223 = new int[6];

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "[I")
	private int[] anIntArray224 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	public boolean aBoolean192 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method496(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg1.method666("idk.dat", null), -26728);
			@Pc(14) int local14;
			if (arg0 != 0) {
				for (local14 = 1; local14 > 0; local14++) {
				}
			}
			anInt750 = local10.method482();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt750];
			}
			for (local14 = 0; local14 < anInt750; local14++) {
				if (aClass23Array1[local14] == null) {
					aClass23Array1[local14] = new Class23();
				}
				aClass23Array1[local14].method497(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("93076, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method497(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method480();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt751 = arg0.method480();
				} else if (local13 == 2) {
					@Pc(31) int local31 = arg0.method480();
					this.anIntArray221 = new int[local31];
					for (@Pc(37) int local37 = 0; local37 < local31; local37++) {
						this.anIntArray221[local37] = arg0.method482();
					}
				} else if (local13 == 3) {
					this.aBoolean192 = true;
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray222[local13 - 40] = arg0.method482();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray223[local13 - 50] = arg0.method482();
				} else if (local13 >= 60 && local13 < 70) {
					this.anIntArray224[local13 - 60] = arg0.method482();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("46723, " + arg0 + ", " + 8 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z")
	public boolean method498() {
		try {
			if (this.anIntArray221 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray221.length; local15++) {
				if (!Class1_Sub1_Sub1_Sub5.method262(this.anIntArray221[local15])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("44477, " + -41 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method499() {
		try {
			if (this.anIntArray221 == null) {
				return null;
			}
			@Pc(16) Class1_Sub1_Sub1_Sub5[] local16 = new Class1_Sub1_Sub1_Sub5[this.anIntArray221.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray221.length; local18++) {
				local16[local18] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray221[local18]);
			}
			@Pc(43) Class1_Sub1_Sub1_Sub5 local43;
			if (local16.length == 1) {
				local43 = local16[0];
			} else {
				local43 = new Class1_Sub1_Sub1_Sub5(local16.length, -314, local16);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray222[local55] != 0; local55++) {
				local43.method275(this.anIntArray222[local55], this.anIntArray223[local55]);
			}
			return local43;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("63212, " + -514 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)Z")
	public boolean method500() {
		try {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray224[local9] != -1 && !Class1_Sub1_Sub1_Sub5.method262(this.anIntArray224[local9])) {
					local7 = false;
				}
			}
			return local7;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("67395, " + 875 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(I)Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method501() {
		try {
			@Pc(4) Class1_Sub1_Sub1_Sub5[] local4 = new Class1_Sub1_Sub1_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray224[local8] != -1) {
					local4[local6++] = Class1_Sub1_Sub1_Sub5.method261(this.anIntArray224[local8]);
				}
			}
			if (this.anInt749 != 9) {
				this.anInt749 = -438;
			}
			@Pc(44) Class1_Sub1_Sub1_Sub5 local44 = new Class1_Sub1_Sub1_Sub5(local6, -314, local4);
			for (@Pc(46) int local46 = 0; local46 < 6 && this.anIntArray222[local46] != 0; local46++) {
				local44.method275(this.anIntArray222[local46], this.anIntArray223[local46]);
			}
			return local44;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("5248, " + 9 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}
}
