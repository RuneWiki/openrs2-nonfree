import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WBMSJJDO")
public final class Class41 {

	@OriginalMember(owner = "client!WBMSJJDO", name = "f", descriptor = "[B")
	private static byte[] aByteArray17;

	@OriginalMember(owner = "client!WBMSJJDO", name = "g", descriptor = "Lclient!TQYMAXSO;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_2;

	@OriginalMember(owner = "client!WBMSJJDO", name = "b", descriptor = "I")
	private static int anInt680 = 166;

	@OriginalMember(owner = "client!WBMSJJDO", name = "c", descriptor = "I")
	private static int anInt681 = 8;

	@OriginalMember(owner = "client!WBMSJJDO", name = "d", descriptor = "[Lclient!WBMSJJDO;")
	private static Class41[] aClass41Array1 = new Class41[5000];

	@OriginalMember(owner = "client!WBMSJJDO", name = "e", descriptor = "[I")
	public static int[] anIntArray180 = new int[5000];

	@OriginalMember(owner = "client!WBMSJJDO", name = "i", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!WBMSJJDO", name = "j", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "Z")
	private boolean aBoolean165 = false;

	@OriginalMember(owner = "client!WBMSJJDO", name = "h", descriptor = "[Lclient!FFMSWDBM;")
	private Class12[] aClass12Array1 = new Class12[10];

	@OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(BLclient!TQYMAXSO;)V")
	public static void method501(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			aByteArray17 = new byte[441000];
			aClass8_Sub1_Sub3_2 = new Class8_Sub1_Sub3(aByteArray17, -631);
			Class12.method72();
			while (true) {
				@Pc(17) int local17 = arg0.method408();
				if (local17 == 65535) {
					return;
				}
				aClass41Array1[local17] = new Class41(true);
				aClass41Array1[local17].method503(arg0);
				anIntArray180[local17] = aClass41Array1[local17].method504();
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("34730, " + -109 + ", " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(BII)Lclient!TQYMAXSO;")
	public static Class8_Sub1_Sub3 method502(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			if (aClass41Array1[arg2] == null) {
				return null;
			} else {
				@Pc(16) Class41 local16 = aClass41Array1[arg2];
				return local16.method505(arg1);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("45052, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBMSJJDO", name = "<init>", descriptor = "(Z)V")
	private Class41(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	private void method503(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 10; local8++) {
				@Pc(13) int local13 = arg0.method406();
				if (local13 != 0) {
					arg0.anInt620--;
					this.aClass12Array1[local8] = new Class12();
					this.aClass12Array1[local8].method75(arg0);
				}
			}
			this.anInt682 = arg0.method408();
			this.anInt683 = arg0.method408();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("37047, " + 3 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(I)I")
	private int method504() {
		try {
			@Pc(7) int local7 = 9999999;
			for (@Pc(9) int local9 = 0; local9 < 10; local9++) {
				if (this.aClass12Array1[local9] != null && this.aClass12Array1[local9].anInt179 / 20 < local7) {
					local7 = this.aClass12Array1[local9].anInt179 / 20;
				}
			}
			if (this.anInt682 < this.anInt683 && this.anInt682 / 20 < local7) {
				local7 = this.anInt682 / 20;
			}
			if (local7 == 9999999 || local7 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass12Array1[local62] != null) {
					this.aClass12Array1[local62].anInt179 -= local7 * 20;
				}
			}
			if (this.anInt682 < this.anInt683) {
				this.anInt682 -= local7 * 20;
				this.anInt683 -= local7 * 20;
			}
			return local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("8949, " + 0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBMSJJDO", name = "a", descriptor = "(II)Lclient!TQYMAXSO;")
	private Class8_Sub1_Sub3 method505(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method506(arg0);
			aClass8_Sub1_Sub3_2.anInt620 = 0;
			aClass8_Sub1_Sub3_2.method400(1380533830);
			aClass8_Sub1_Sub3_2.method401(local3 + 36);
			aClass8_Sub1_Sub3_2.method400(1463899717);
			aClass8_Sub1_Sub3_2.method400(1718449184);
			aClass8_Sub1_Sub3_2.method401(16);
			aClass8_Sub1_Sub3_2.method398(1);
			aClass8_Sub1_Sub3_2.method398(1);
			aClass8_Sub1_Sub3_2.method401(22050);
			aClass8_Sub1_Sub3_2.method401(22050);
			aClass8_Sub1_Sub3_2.method398(1);
			aClass8_Sub1_Sub3_2.method398(8);
			aClass8_Sub1_Sub3_2.method400(1684108385);
			aClass8_Sub1_Sub3_2.method401(local3);
			aClass8_Sub1_Sub3_2.anInt620 += local3;
			return aClass8_Sub1_Sub3_2;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("6821, " + arg0 + ", " + 20468 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBMSJJDO", name = "b", descriptor = "(I)I")
	private int method506(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass12Array1[local5] != null && this.aClass12Array1[local5].anInt178 + this.aClass12Array1[local5].anInt179 > local3) {
				local3 = this.aClass12Array1[local5].anInt178 + this.aClass12Array1[local5].anInt179;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt682 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt683 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray17[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass12Array1[local106] != null) {
				local123 = this.aClass12Array1[local106].anInt178 * 22050 / 1000;
				local133 = this.aClass12Array1[local106].anInt179 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass12Array1[local106].method73(local123, this.aClass12Array1[local106].anInt178);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray17[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray17[local133 + local123] = aByteArray17[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray17[local147 + local123] = aByteArray17[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
