import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NUMTWBFA")
public final class Class27 {

	@OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "Z")
	private static boolean aBoolean107;

	@OriginalMember(owner = "client!NUMTWBFA", name = "b", descriptor = "Z")
	private static boolean aBoolean108;

	@OriginalMember(owner = "client!NUMTWBFA", name = "c", descriptor = "Z")
	private static boolean aBoolean109;

	@OriginalMember(owner = "client!NUMTWBFA", name = "j", descriptor = "[B")
	private static byte[] aByteArray10;

	@OriginalMember(owner = "client!NUMTWBFA", name = "k", descriptor = "Lclient!LBBVYYXO;")
	private static Class2_Sub1_Sub3 aClass2_Sub1_Sub3_2;

	@OriginalMember(owner = "client!NUMTWBFA", name = "h", descriptor = "[Lclient!NUMTWBFA;")
	private static Class27[] aClass27Array1 = new Class27[5000];

	@OriginalMember(owner = "client!NUMTWBFA", name = "i", descriptor = "[I")
	public static int[] anIntArray108 = new int[5000];

	@OriginalMember(owner = "client!NUMTWBFA", name = "m", descriptor = "I")
	private int anInt375;

	@OriginalMember(owner = "client!NUMTWBFA", name = "n", descriptor = "I")
	private int anInt376;

	@OriginalMember(owner = "client!NUMTWBFA", name = "d", descriptor = "I")
	private int anInt373 = -39349;

	@OriginalMember(owner = "client!NUMTWBFA", name = "e", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!NUMTWBFA", name = "f", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!NUMTWBFA", name = "g", descriptor = "I")
	private int anInt374 = 105;

	@OriginalMember(owner = "client!NUMTWBFA", name = "l", descriptor = "[Lclient!UXJRWLQU;")
	private Class39[] aClass39Array1 = new Class39[10];

	@OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(Lclient!LBBVYYXO;I)V")
	public static void method334(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			aByteArray10 = new byte[441000];
			aClass2_Sub1_Sub3_2 = new Class2_Sub1_Sub3((byte) 114, aByteArray10);
			Class39.method459();
			while (true) {
				@Pc(16) int local16 = arg0.method269();
				if (local16 == 65535) {
					return;
				}
				aClass27Array1[local16] = new Class27(aBoolean108);
				aClass27Array1[local16].method336(arg0);
				anIntArray108[local16] = aClass27Array1[local16].method337(aBoolean109);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("59579, " + arg0 + ", " + 5 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(III)Lclient!LBBVYYXO;")
	public static Class2_Sub1_Sub3 method335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass27Array1[arg1] == null) {
				return null;
			} else {
				@Pc(19) Class27 local19 = aClass27Array1[arg1];
				return local19.method338(arg0);
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("81360, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUMTWBFA", name = "<init>", descriptor = "(Z)V")
	private Class27(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean111 = !this.aBoolean111;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("57165, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	private void method336(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg0.method267();
				if (local8 != 0) {
					arg0.anInt283--;
					this.aClass39Array1[local3] = new Class39();
					this.aClass39Array1[local3].method462(arg0);
				}
			}
			this.anInt375 = arg0.method269();
			this.anInt376 = arg0.method269();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("93665, " + arg0 + ", " + 59 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(Z)I")
	private int method337(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean110 = !this.aBoolean110;
			}
			@Pc(13) int local13 = 9999999;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.aClass39Array1[local15] != null && this.aClass39Array1[local15].anInt612 / 20 < local13) {
					local13 = this.aClass39Array1[local15].anInt612 / 20;
				}
			}
			if (this.anInt375 < this.anInt376 && this.anInt375 / 20 < local13) {
				local13 = this.anInt375 / 20;
			}
			if (local13 == 9999999 || local13 == 0) {
				return 0;
			}
			for (@Pc(68) int local68 = 0; local68 < 10; local68++) {
				if (this.aClass39Array1[local68] != null) {
					this.aClass39Array1[local68].anInt612 -= local13 * 20;
				}
			}
			if (this.anInt375 < this.anInt376) {
				this.anInt375 -= local13 * 20;
				this.anInt376 -= local13 * 20;
			}
			return local13;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("94273, " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(IZ)Lclient!LBBVYYXO;")
	private Class2_Sub1_Sub3 method338(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method339(arg0);
			aClass2_Sub1_Sub3_2.anInt283 = 0;
			aClass2_Sub1_Sub3_2.method261(1380533830);
			aClass2_Sub1_Sub3_2.method262(local3 + 36);
			aClass2_Sub1_Sub3_2.method261(1463899717);
			aClass2_Sub1_Sub3_2.method261(1718449184);
			aClass2_Sub1_Sub3_2.method262(16);
			aClass2_Sub1_Sub3_2.method259(1);
			aClass2_Sub1_Sub3_2.method259(1);
			aClass2_Sub1_Sub3_2.method262(22050);
			aClass2_Sub1_Sub3_2.method262(22050);
			aClass2_Sub1_Sub3_2.method259(1);
			aClass2_Sub1_Sub3_2.method259(8);
			aClass2_Sub1_Sub3_2.method261(1684108385);
			aClass2_Sub1_Sub3_2.method262(local3);
			aClass2_Sub1_Sub3_2.anInt283 += local3;
			return aClass2_Sub1_Sub3_2;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("40157, " + arg0 + ", " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUMTWBFA", name = "a", descriptor = "(I)I")
	private int method339(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass39Array1[local5] != null && this.aClass39Array1[local5].anInt611 + this.aClass39Array1[local5].anInt612 > local3) {
				local3 = this.aClass39Array1[local5].anInt611 + this.aClass39Array1[local5].anInt612;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt375 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt376 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray10[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass39Array1[local106] != null) {
				local123 = this.aClass39Array1[local106].anInt611 * 22050 / 1000;
				local133 = this.aClass39Array1[local106].anInt612 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass39Array1[local106].method460(local123, this.aClass39Array1[local106].anInt611);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray10[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray10[local133 + local123] = aByteArray10[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray10[local147 + local123] = aByteArray10[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
