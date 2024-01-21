import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class43 {

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!yb", name = "k", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_23;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "B")
	private static byte aByte60 = 8;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private static int anInt874 = -37106;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "Z")
	private static boolean aBoolean183 = true;

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "B")
	private static byte aByte61 = 119;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "I")
	private static int anInt875 = 6;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[Lclient!yb;")
	private static Class43[] aClass43Array1 = new Class43[1000];

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "[I")
	public static int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!yb", name = "m", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!yb", name = "n", descriptor = "I")
	private int anInt878;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "I")
	private int anInt876 = 6;

	@OriginalMember(owner = "client!yb", name = "l", descriptor = "[Lclient!zb;")
	private Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method553(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			aByteArray15 = new byte[441000];
			aClass1_Sub3_Sub3_23 = new Class1_Sub3_Sub3(aByteArray15, 0);
			Class44.method567();
			while (true) {
				@Pc(21) int local21 = arg0.method385();
				if (local21 == 65535) {
					return;
				}
				aClass43Array1[local21] = new Class43();
				aClass43Array1[local21].method555(aByte60, arg0);
				anIntArray231[local21] = aClass43Array1[local21].method556();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("43792, " + 4 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(IBI)Lclient!kb;")
	public static Class1_Sub3_Sub3 method554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aByte61 != 119) {
				anInt874 = 0;
			}
			if (aClass43Array1[arg0] == null) {
				return null;
			} else {
				@Pc(12) Class43 local12 = aClass43Array1[arg0];
				return local12.method557(anInt875, arg1);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("45359, " + arg0 + ", " + 119 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BLclient!kb;)V")
	private void method555(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg1.method383();
				if (local6 != 0) {
					arg1.anInt548--;
					this.aClass44Array1[local1] = new Class44();
					this.aClass44Array1[local1].method570(aByte60, arg1);
				}
			}
			this.anInt877 = arg1.method385();
			this.anInt878 = arg1.method385();
			if (arg0 != 8) {
				throw new NullPointerException();
			}
			@Pc(45) boolean local45 = false;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("14158, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)I")
	private int method556() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(14) int local14 = 0; local14 < 10; local14++) {
				if (this.aClass44Array1[local14] != null && this.aClass44Array1[local14].anInt948 / 20 < local3) {
					local3 = this.aClass44Array1[local14].anInt948 / 20;
				}
			}
			if (this.anInt877 < this.anInt878 && this.anInt877 / 20 < local3) {
				local3 = this.anInt877 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
				if (this.aClass44Array1[local67] != null) {
					this.aClass44Array1[local67].anInt948 -= local3 * 20;
				}
			}
			if (this.anInt877 < this.anInt878) {
				this.anInt877 -= local3 * 20;
				this.anInt878 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("40139, " + 5 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(II)Lclient!kb;")
	private Class1_Sub3_Sub3 method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.method558(arg1);
			aClass1_Sub3_Sub3_23.anInt548 = 0;
			aClass1_Sub3_Sub3_23.method377(1380533830);
			aClass1_Sub3_Sub3_23.method378(local3 + 36);
			aClass1_Sub3_Sub3_23.method377(1463899717);
			aClass1_Sub3_Sub3_23.method377(1718449184);
			aClass1_Sub3_Sub3_23.method378(16);
			aClass1_Sub3_Sub3_23.method375(1);
			aClass1_Sub3_Sub3_23.method375(1);
			if (arg0 != this.anInt876) {
				this.aBoolean182 = !this.aBoolean182;
			}
			aClass1_Sub3_Sub3_23.method378(22050);
			aClass1_Sub3_Sub3_23.method378(22050);
			aClass1_Sub3_Sub3_23.method375(1);
			aClass1_Sub3_Sub3_23.method375(8);
			aClass1_Sub3_Sub3_23.method377(1684108385);
			aClass1_Sub3_Sub3_23.method378(local3);
			aClass1_Sub3_Sub3_23.anInt548 += local3;
			return aClass1_Sub3_Sub3_23;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("25318, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(I)I")
	private int method558(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt947 + this.aClass44Array1[local5].anInt948 > local3) {
				local3 = this.aClass44Array1[local5].anInt947 + this.aClass44Array1[local5].anInt948;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt877 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt878 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray15[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass44Array1[local106] != null) {
				local123 = this.aClass44Array1[local106].anInt947 * 22050 / 1000;
				local133 = this.aClass44Array1[local106].anInt948 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass44Array1[local106].method568(local123, this.aClass44Array1[local106].anInt947);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray15[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			local58 += 44;
			local65 += 44;
			local51 += 44;
			local90 += 44;
			local123 = local90 - local51;
			for (local133 = local51 - 1; local133 >= local65; local133--) {
				aByteArray15[local133 + local123] = aByteArray15[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray15[local147 + local123] = aByteArray15[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
