import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FPQKMBUX")
public final class Class14 {

	@OriginalMember(owner = "client!FPQKMBUX", name = "g", descriptor = "[B")
	private static byte[] aByteArray8;

	@OriginalMember(owner = "client!FPQKMBUX", name = "h", descriptor = "Lclient!EGCCHUZS;")
	private static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_2;

	@OriginalMember(owner = "client!FPQKMBUX", name = "b", descriptor = "I")
	private static int anInt265 = 189;

	@OriginalMember(owner = "client!FPQKMBUX", name = "d", descriptor = "I")
	private static int anInt267 = 829;

	@OriginalMember(owner = "client!FPQKMBUX", name = "e", descriptor = "[Lclient!FPQKMBUX;")
	private static Class14[] aClass14Array1 = new Class14[5000];

	@OriginalMember(owner = "client!FPQKMBUX", name = "f", descriptor = "[I")
	public static int[] anIntArray34 = new int[5000];

	@OriginalMember(owner = "client!FPQKMBUX", name = "j", descriptor = "I")
	private int anInt268;

	@OriginalMember(owner = "client!FPQKMBUX", name = "k", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!FPQKMBUX", name = "a", descriptor = "B")
	private byte aByte10 = -84;

	@OriginalMember(owner = "client!FPQKMBUX", name = "c", descriptor = "I")
	private int anInt266 = 189;

	@OriginalMember(owner = "client!FPQKMBUX", name = "i", descriptor = "[Lclient!LLJZJXBB;")
	private Class26[] aClass26Array1 = new Class26[10];

	@OriginalMember(owner = "client!FPQKMBUX", name = "a", descriptor = "(ILclient!EGCCHUZS;)V")
	public static void method217(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			aByteArray8 = new byte[441000];
			aClass4_Sub1_Sub3_2 = new Class4_Sub1_Sub3(aByteArray8, false);
			Class26.method393();
			while (true) {
				@Pc(16) int local16 = arg0.method169();
				if (local16 == 65535) {
					return;
				}
				aClass14Array1[local16] = new Class14((byte) -84);
				aClass14Array1[local16].method219(arg0);
				anIntArray34[local16] = aClass14Array1[local16].method220(anInt265);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("55075, " + 0 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPQKMBUX", name = "a", descriptor = "(III)Lclient!EGCCHUZS;")
	public static Class4_Sub1_Sub3 method218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass14Array1[arg0] == null) {
				return null;
			} else {
				@Pc(11) Class14 local11 = aClass14Array1[arg0];
				return local11.method221(arg1);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("19489, " + -11 + ", " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPQKMBUX", name = "<init>", descriptor = "(B)V")
	private Class14(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte10) {
				throw new NullPointerException();
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("17665, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPQKMBUX", name = "a", descriptor = "(Lclient!EGCCHUZS;Z)V")
	private void method219(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
				@Pc(12) int local12 = arg0.method167();
				if (local12 != 0) {
					arg0.anInt242--;
					this.aClass26Array1[local7] = new Class26();
					this.aClass26Array1[local7].method396(arg0);
				}
			}
			this.anInt268 = arg0.method169();
			this.anInt269 = arg0.method169();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("75825, " + arg0 + ", " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPQKMBUX", name = "a", descriptor = "(I)I")
	private int method220(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = 75 / arg0;
			@Pc(7) int local7 = 9999999;
			for (@Pc(9) int local9 = 0; local9 < 10; local9++) {
				if (this.aClass26Array1[local9] != null && this.aClass26Array1[local9].anInt457 / 20 < local7) {
					local7 = this.aClass26Array1[local9].anInt457 / 20;
				}
			}
			if (this.anInt268 < this.anInt269 && this.anInt268 / 20 < local7) {
				local7 = this.anInt268 / 20;
			}
			if (local7 == 9999999 || local7 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass26Array1[local62] != null) {
					this.aClass26Array1[local62].anInt457 -= local7 * 20;
				}
			}
			if (this.anInt268 < this.anInt269) {
				this.anInt268 -= local7 * 20;
				this.anInt269 -= local7 * 20;
			}
			return local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("40044, " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPQKMBUX", name = "a", descriptor = "(II)Lclient!EGCCHUZS;")
	private Class4_Sub1_Sub3 method221(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method222(arg0);
			aClass4_Sub1_Sub3_2.anInt242 = 0;
			aClass4_Sub1_Sub3_2.method161(1380533830);
			aClass4_Sub1_Sub3_2.method162(local3 + 36);
			aClass4_Sub1_Sub3_2.method161(1463899717);
			aClass4_Sub1_Sub3_2.method161(1718449184);
			aClass4_Sub1_Sub3_2.method162(16);
			aClass4_Sub1_Sub3_2.method159(1);
			aClass4_Sub1_Sub3_2.method159(1);
			aClass4_Sub1_Sub3_2.method162(22050);
			aClass4_Sub1_Sub3_2.method162(22050);
			aClass4_Sub1_Sub3_2.method159(1);
			aClass4_Sub1_Sub3_2.method159(8);
			aClass4_Sub1_Sub3_2.method161(1684108385);
			aClass4_Sub1_Sub3_2.method162(local3);
			aClass4_Sub1_Sub3_2.anInt242 += local3;
			return aClass4_Sub1_Sub3_2;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("23336, " + -523 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FPQKMBUX", name = "b", descriptor = "(I)I")
	private int method222(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass26Array1[local5] != null && this.aClass26Array1[local5].anInt456 + this.aClass26Array1[local5].anInt457 > local3) {
				local3 = this.aClass26Array1[local5].anInt456 + this.aClass26Array1[local5].anInt457;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt268 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt269 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray8[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass26Array1[local106] != null) {
				local123 = this.aClass26Array1[local106].anInt456 * 22050 / 1000;
				local133 = this.aClass26Array1[local106].anInt457 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass26Array1[local106].method394(local123, this.aClass26Array1[local106].anInt456);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray8[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray8[local133 + local123] = aByteArray8[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray8[local147 + local123] = aByteArray8[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
