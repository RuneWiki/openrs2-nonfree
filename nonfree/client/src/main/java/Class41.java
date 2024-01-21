import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!URXFHLNO")
public final class Class41 {

	@OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "Z")
	private static boolean aBoolean142;

	@OriginalMember(owner = "client!URXFHLNO", name = "e", descriptor = "[B")
	private static byte[] aByteArray18;

	@OriginalMember(owner = "client!URXFHLNO", name = "f", descriptor = "Lclient!WNCFPLWV;")
	private static Class3_Sub1_Sub4 aClass3_Sub1_Sub4_5;

	@OriginalMember(owner = "client!URXFHLNO", name = "b", descriptor = "B")
	private static byte aByte28 = 45;

	@OriginalMember(owner = "client!URXFHLNO", name = "c", descriptor = "[Lclient!URXFHLNO;")
	private static Class41[] aClass41Array1 = new Class41[5000];

	@OriginalMember(owner = "client!URXFHLNO", name = "d", descriptor = "[I")
	public static int[] anIntArray171 = new int[5000];

	@OriginalMember(owner = "client!URXFHLNO", name = "h", descriptor = "I")
	private int anInt639;

	@OriginalMember(owner = "client!URXFHLNO", name = "i", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!URXFHLNO", name = "g", descriptor = "[Lclient!PJPXFVTH;")
	private Class29[] aClass29Array1 = new Class29[10];

	@OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(BLclient!WNCFPLWV;)V")
	public static void method422(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			aByteArray18 = new byte[441000];
			aClass3_Sub1_Sub4_5 = new Class3_Sub1_Sub4((byte) -58, aByteArray18);
			Class29.method303();
			while (true) {
				@Pc(21) int local21 = arg0.method460();
				if (local21 == 65535) {
					return;
				}
				aClass41Array1[local21] = new Class41(aByte28);
				aClass41Array1[local21].method424(arg0);
				anIntArray171[local21] = aClass41Array1[local21].method425();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("43130, " + -114 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(III)Lclient!WNCFPLWV;")
	public static Class3_Sub1_Sub4 method423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass41Array1[arg0] == null) {
				return null;
			} else {
				@Pc(13) Class41 local13 = aClass41Array1[arg0];
				return local13.method426(arg1);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("99315, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URXFHLNO", name = "<init>", descriptor = "(B)V")
	private Class41(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 45) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("1172, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	private void method424(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			for (@Pc(14) int local14 = 0; local14 < 10; local14++) {
				@Pc(19) int local19 = arg0.method458();
				if (local19 != 0) {
					arg0.anInt666--;
					this.aClass29Array1[local14] = new Class29();
					this.aClass29Array1[local14].method306(arg0);
				}
			}
			this.anInt639 = arg0.method460();
			this.anInt640 = arg0.method460();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("29435, " + -934 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(I)I")
	private int method425() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass29Array1[local5] != null && this.aClass29Array1[local5].anInt383 / 20 < local3) {
					local3 = this.aClass29Array1[local5].anInt383 / 20;
				}
			}
			if (this.anInt639 < this.anInt640 && this.anInt639 / 20 < local3) {
				local3 = this.anInt639 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass29Array1[local58] != null) {
					this.aClass29Array1[local58].anInt383 -= local3 * 20;
				}
			}
			if (this.anInt639 < this.anInt640) {
				this.anInt639 -= local3 * 20;
				this.anInt640 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(117) RuntimeException local117) {
			signlink.reporterror("29998, " + 4 + ", " + local117.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URXFHLNO", name = "a", descriptor = "(ZI)Lclient!WNCFPLWV;")
	private Class3_Sub1_Sub4 method426(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method427(arg0);
			aClass3_Sub1_Sub4_5.anInt666 = 0;
			aClass3_Sub1_Sub4_5.method452(1380533830);
			aClass3_Sub1_Sub4_5.method453(local3 + 36);
			aClass3_Sub1_Sub4_5.method452(1463899717);
			aClass3_Sub1_Sub4_5.method452(1718449184);
			aClass3_Sub1_Sub4_5.method453(16);
			aClass3_Sub1_Sub4_5.method450(1);
			aClass3_Sub1_Sub4_5.method450(1);
			aClass3_Sub1_Sub4_5.method453(22050);
			aClass3_Sub1_Sub4_5.method453(22050);
			aClass3_Sub1_Sub4_5.method450(1);
			aClass3_Sub1_Sub4_5.method450(8);
			aClass3_Sub1_Sub4_5.method452(1684108385);
			aClass3_Sub1_Sub4_5.method453(local3);
			aClass3_Sub1_Sub4_5.anInt666 += local3;
			return aClass3_Sub1_Sub4_5;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("61352, " + false + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URXFHLNO", name = "b", descriptor = "(I)I")
	private int method427(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass29Array1[local5] != null && this.aClass29Array1[local5].anInt382 + this.aClass29Array1[local5].anInt383 > local3) {
				local3 = this.aClass29Array1[local5].anInt382 + this.aClass29Array1[local5].anInt383;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt639 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt640 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray18[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass29Array1[local106] != null) {
				local123 = this.aClass29Array1[local106].anInt382 * 22050 / 1000;
				local133 = this.aClass29Array1[local106].anInt383 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass29Array1[local106].method304(local123, this.aClass29Array1[local106].anInt382);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray18[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray18[local147 + local133 + 44] = (byte) local165;
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
				aByteArray18[local133 + local123] = aByteArray18[local133];
			}
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray18[local147 + local123] = aByteArray18[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
