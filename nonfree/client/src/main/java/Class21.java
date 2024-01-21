import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LTINEQTV")
public final class Class21 {

	@OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "Z")
	private static boolean aBoolean95;

	@OriginalMember(owner = "client!LTINEQTV", name = "e", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!LTINEQTV", name = "f", descriptor = "Lclient!EMWAMCXW;")
	private static Class2_Sub1_Sub3 aClass2_Sub1_Sub3_3;

	@OriginalMember(owner = "client!LTINEQTV", name = "c", descriptor = "[Lclient!LTINEQTV;")
	private static Class21[] aClass21Array1 = new Class21[5000];

	@OriginalMember(owner = "client!LTINEQTV", name = "d", descriptor = "[I")
	public static int[] anIntArray98 = new int[5000];

	@OriginalMember(owner = "client!LTINEQTV", name = "h", descriptor = "I")
	private int anInt242;

	@OriginalMember(owner = "client!LTINEQTV", name = "i", descriptor = "I")
	private int anInt243;

	@OriginalMember(owner = "client!LTINEQTV", name = "b", descriptor = "I")
	private int anInt241 = -5335;

	@OriginalMember(owner = "client!LTINEQTV", name = "g", descriptor = "[Lclient!JRZPSMWR;")
	private Class19[] aClass19Array1 = new Class19[10];

	@OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(ILclient!EMWAMCXW;)V")
	public static void method211(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			aByteArray15 = new byte[441000];
			aClass2_Sub1_Sub3_3 = new Class2_Sub1_Sub3(aByteArray15, true);
			Class19.method185();
			while (true) {
				@Pc(15) int local15 = arg0.method99();
				if (local15 == 65535) {
					return;
				}
				aClass21Array1[local15] = new Class21(-41493);
				aClass21Array1[local15].method213(arg0);
				anIntArray98[local15] = aClass21Array1[local15].method214();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("41837, " + 0 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(IIB)Lclient!EMWAMCXW;")
	public static Class2_Sub1_Sub3 method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass21Array1[arg0] == null) {
				return null;
			} else {
				@Pc(16) Class21 local16 = aClass21Array1[arg0];
				return local16.method215(arg1);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99205, " + arg0 + ", " + arg1 + ", " + -65 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LTINEQTV", name = "<init>", descriptor = "(I)V")
	private Class21(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!LTINEQTV", name = "b", descriptor = "(ILclient!EMWAMCXW;)V")
	private void method213(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method97();
				if (local6 != 0) {
					arg0.anInt136--;
					this.aClass19Array1[local1] = new Class19();
					this.aClass19Array1[local1].method188(arg0);
				}
			}
			this.anInt242 = arg0.method99();
			this.anInt243 = arg0.method99();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("49469, " + 1016 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(I)I")
	private int method214() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass19Array1[local5] != null && this.aClass19Array1[local5].anInt222 / 20 < local3) {
					local3 = this.aClass19Array1[local5].anInt222 / 20;
				}
			}
			if (this.anInt242 < this.anInt243 && this.anInt242 / 20 < local3) {
				local3 = this.anInt242 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass19Array1[local64] != null) {
					this.aClass19Array1[local64].anInt222 -= local3 * 20;
				}
			}
			if (this.anInt242 < this.anInt243) {
				this.anInt242 -= local3 * 20;
				this.anInt243 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("11364, " + -28344 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LTINEQTV", name = "a", descriptor = "(ZI)Lclient!EMWAMCXW;")
	private Class2_Sub1_Sub3 method215(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method216(arg0);
			aClass2_Sub1_Sub3_3.anInt136 = 0;
			aClass2_Sub1_Sub3_3.method91(1380533830);
			aClass2_Sub1_Sub3_3.method92(local3 + 36);
			aClass2_Sub1_Sub3_3.method91(1463899717);
			aClass2_Sub1_Sub3_3.method91(1718449184);
			aClass2_Sub1_Sub3_3.method92(16);
			aClass2_Sub1_Sub3_3.method89(1);
			aClass2_Sub1_Sub3_3.method89(1);
			aClass2_Sub1_Sub3_3.method92(22050);
			aClass2_Sub1_Sub3_3.method92(22050);
			aClass2_Sub1_Sub3_3.method89(1);
			aClass2_Sub1_Sub3_3.method89(8);
			aClass2_Sub1_Sub3_3.method91(1684108385);
			aClass2_Sub1_Sub3_3.method92(local3);
			aClass2_Sub1_Sub3_3.anInt136 += local3;
			return aClass2_Sub1_Sub3_3;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("12517, " + false + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LTINEQTV", name = "b", descriptor = "(I)I")
	private int method216(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass19Array1[local5] != null && this.aClass19Array1[local5].anInt221 + this.aClass19Array1[local5].anInt222 > local3) {
				local3 = this.aClass19Array1[local5].anInt221 + this.aClass19Array1[local5].anInt222;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt242 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt243 * 22050 / 1000;
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
			if (this.aClass19Array1[local106] != null) {
				local123 = this.aClass19Array1[local106].anInt221 * 22050 / 1000;
				local133 = this.aClass19Array1[local106].anInt222 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass19Array1[local106].method186(local123, this.aClass19Array1[local106].anInt221);
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
