import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IXJIDLUT")
public final class Class17 {

	@OriginalMember(owner = "client!IXJIDLUT", name = "d", descriptor = "I")
	private static int anInt344;

	@OriginalMember(owner = "client!IXJIDLUT", name = "i", descriptor = "[B")
	private static byte[] aByteArray4;

	@OriginalMember(owner = "client!IXJIDLUT", name = "j", descriptor = "Lclient!XJCNBMKS;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_2;

	@OriginalMember(owner = "client!IXJIDLUT", name = "a", descriptor = "B")
	private static byte aByte11 = -27;

	@OriginalMember(owner = "client!IXJIDLUT", name = "c", descriptor = "Z")
	private static boolean aBoolean74 = true;

	@OriginalMember(owner = "client!IXJIDLUT", name = "g", descriptor = "[Lclient!IXJIDLUT;")
	private static Class17[] aClass17Array1 = new Class17[5000];

	@OriginalMember(owner = "client!IXJIDLUT", name = "h", descriptor = "[I")
	public static int[] anIntArray82 = new int[5000];

	@OriginalMember(owner = "client!IXJIDLUT", name = "l", descriptor = "I")
	private int anInt347;

	@OriginalMember(owner = "client!IXJIDLUT", name = "m", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!IXJIDLUT", name = "b", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!IXJIDLUT", name = "e", descriptor = "I")
	private int anInt345 = 397;

	@OriginalMember(owner = "client!IXJIDLUT", name = "f", descriptor = "I")
	private int anInt346 = -393;

	@OriginalMember(owner = "client!IXJIDLUT", name = "k", descriptor = "[Lclient!JUIUBOIF;")
	private Class20[] aClass20Array1 = new Class20[10];

	@OriginalMember(owner = "client!IXJIDLUT", name = "a", descriptor = "(ILclient!XJCNBMKS;)V")
	public static void method210(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray4 = new byte[441000];
			aClass1_Sub1_Sub3_2 = new Class1_Sub1_Sub3((byte) 9, aByteArray4);
			Class20.method224();
			while (true) {
				@Pc(20) int local20 = arg0.method500();
				if (local20 == 65535) {
					return;
				}
				aClass17Array1[local20] = new Class17(905);
				aClass17Array1[local20].method212(aByte11, arg0);
				anIntArray82[local20] = aClass17Array1[local20].method213();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("75774, " + 0 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXJIDLUT", name = "a", descriptor = "(III)Lclient!XJCNBMKS;")
	public static Class1_Sub1_Sub3 method211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass17Array1[arg0] == null) {
				return null;
			} else {
				@Pc(11) Class17 local11 = aClass17Array1[arg0];
				return local11.method214(arg1);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("29507, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXJIDLUT", name = "<init>", descriptor = "(I)V")
	private Class17(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!IXJIDLUT", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	private void method212(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg1.method498();
				if (local6 != 0) {
					arg1.anInt806--;
					this.aClass20Array1[local1] = new Class20();
					this.aClass20Array1[local1].method227(aByte11, arg1);
				}
			}
			this.anInt347 = arg1.method500();
			if (arg0 != aByte11) {
				aBoolean74 = !aBoolean74;
			}
			this.anInt348 = arg1.method500();
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("62687, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXJIDLUT", name = "a", descriptor = "(I)I")
	private int method213() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(14) int local14 = 0; local14 < 10; local14++) {
				if (this.aClass20Array1[local14] != null && this.aClass20Array1[local14].anInt373 / 20 < local3) {
					local3 = this.aClass20Array1[local14].anInt373 / 20;
				}
			}
			if (this.anInt347 < this.anInt348 && this.anInt347 / 20 < local3) {
				local3 = this.anInt347 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
				if (this.aClass20Array1[local67] != null) {
					this.aClass20Array1[local67].anInt373 -= local3 * 20;
				}
			}
			if (this.anInt347 < this.anInt348) {
				this.anInt347 -= local3 * 20;
				this.anInt348 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("32494, " + 3 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXJIDLUT", name = "a", descriptor = "(II)Lclient!XJCNBMKS;")
	private Class1_Sub1_Sub3 method214(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method215(arg0);
			aClass1_Sub1_Sub3_2.anInt806 = 0;
			aClass1_Sub1_Sub3_2.method492(1380533830);
			aClass1_Sub1_Sub3_2.method493(local3 + 36);
			aClass1_Sub1_Sub3_2.method492(1463899717);
			aClass1_Sub1_Sub3_2.method492(1718449184);
			aClass1_Sub1_Sub3_2.method493(16);
			aClass1_Sub1_Sub3_2.method490(1);
			aClass1_Sub1_Sub3_2.method490(1);
			aClass1_Sub1_Sub3_2.method493(22050);
			aClass1_Sub1_Sub3_2.method493(22050);
			aClass1_Sub1_Sub3_2.method490(1);
			aClass1_Sub1_Sub3_2.method490(8);
			aClass1_Sub1_Sub3_2.method492(1684108385);
			aClass1_Sub1_Sub3_2.method493(local3);
			aClass1_Sub1_Sub3_2.anInt806 += local3;
			return aClass1_Sub1_Sub3_2;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("27496, " + arg0 + ", " + 533 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IXJIDLUT", name = "b", descriptor = "(I)I")
	private int method215(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass20Array1[local5] != null && this.aClass20Array1[local5].anInt372 + this.aClass20Array1[local5].anInt373 > local3) {
				local3 = this.aClass20Array1[local5].anInt372 + this.aClass20Array1[local5].anInt373;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt347 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt348 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray4[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass20Array1[local106] != null) {
				local123 = this.aClass20Array1[local106].anInt372 * 22050 / 1000;
				local133 = this.aClass20Array1[local106].anInt373 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass20Array1[local106].method225(local123, this.aClass20Array1[local106].anInt372);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray4[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray4[local133 + local123] = aByteArray4[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray4[local147 + local123] = aByteArray4[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
