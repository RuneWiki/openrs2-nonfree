import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QQGIMXLX")
public final class Class31 {

	@OriginalMember(owner = "client!QQGIMXLX", name = "b", descriptor = "I")
	private static int anInt581;

	@OriginalMember(owner = "client!QQGIMXLX", name = "g", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!QQGIMXLX", name = "h", descriptor = "Lclient!LDILQFVA;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!QQGIMXLX", name = "e", descriptor = "[Lclient!QQGIMXLX;")
	private static Class31[] aClass31Array1 = new Class31[5000];

	@OriginalMember(owner = "client!QQGIMXLX", name = "f", descriptor = "[I")
	public static int[] anIntArray134 = new int[5000];

	@OriginalMember(owner = "client!QQGIMXLX", name = "j", descriptor = "I")
	private int anInt583;

	@OriginalMember(owner = "client!QQGIMXLX", name = "k", descriptor = "I")
	private int anInt584;

	@OriginalMember(owner = "client!QQGIMXLX", name = "a", descriptor = "I")
	private int anInt580 = 16191;

	@OriginalMember(owner = "client!QQGIMXLX", name = "c", descriptor = "I")
	private int anInt582 = 49272;

	@OriginalMember(owner = "client!QQGIMXLX", name = "d", descriptor = "B")
	private byte aByte29 = 9;

	@OriginalMember(owner = "client!QQGIMXLX", name = "i", descriptor = "[Lclient!VSTUETUV;")
	private Class42[] aClass42Array1 = new Class42[10];

	@OriginalMember(owner = "client!QQGIMXLX", name = "a", descriptor = "(ILclient!LDILQFVA;)V")
	public static void method477(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray15 = new byte[441000];
			aClass1_Sub1_Sub3_3 = new Class1_Sub1_Sub3(aByteArray15, anInt581);
			Class42.method533();
			while (true) {
				@Pc(15) int local15 = arg0.method361();
				if (local15 == 65535) {
					return;
				}
				aClass31Array1[local15] = new Class31(684);
				aClass31Array1[local15].method479(arg0);
				anIntArray134[local15] = aClass31Array1[local15].method480();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("91515, " + 68 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQGIMXLX", name = "a", descriptor = "(IIZ)Lclient!LDILQFVA;")
	public static Class1_Sub1_Sub3 method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass31Array1[arg0] == null) {
				return null;
			} else {
				@Pc(13) Class31 local13 = aClass31Array1[arg0];
				return local13.method481(arg1);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("15282, " + arg0 + ", " + arg1 + ", " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQGIMXLX", name = "<init>", descriptor = "(I)V")
	private Class31(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!QQGIMXLX", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	private void method479(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method359();
				if (local6 != 0) {
					arg0.anInt443--;
					this.aClass42Array1[local1] = new Class42();
					this.aClass42Array1[local1].method536(arg0);
				}
			}
			if (this.anInt580 != 16191) {
				throw new NullPointerException();
			}
			this.anInt583 = arg0.method361();
			this.anInt584 = arg0.method361();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("84839, " + arg0 + ", " + 16191 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQGIMXLX", name = "a", descriptor = "(Z)I")
	private int method480() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass42Array1[local5] != null && this.aClass42Array1[local5].anInt753 / 20 < local3) {
					local3 = this.aClass42Array1[local5].anInt753 / 20;
				}
			}
			if (this.anInt583 < this.anInt584 && this.anInt583 / 20 < local3) {
				local3 = this.anInt583 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass42Array1[local58] != null) {
					this.aClass42Array1[local58].anInt753 -= local3 * 20;
				}
			}
			if (this.anInt583 < this.anInt584) {
				this.anInt583 -= local3 * 20;
				this.anInt584 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("98406, " + true + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQGIMXLX", name = "a", descriptor = "(ZI)Lclient!LDILQFVA;")
	private Class1_Sub1_Sub3 method481(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method482(arg0);
			aClass1_Sub1_Sub3_3.anInt443 = 0;
			aClass1_Sub1_Sub3_3.method353(1380533830);
			aClass1_Sub1_Sub3_3.method354(local3 + 36);
			aClass1_Sub1_Sub3_3.method353(1463899717);
			aClass1_Sub1_Sub3_3.method353(1718449184);
			aClass1_Sub1_Sub3_3.method354(16);
			aClass1_Sub1_Sub3_3.method351(1, this.anInt582);
			aClass1_Sub1_Sub3_3.method351(1, this.anInt582);
			aClass1_Sub1_Sub3_3.method354(22050);
			aClass1_Sub1_Sub3_3.method354(22050);
			aClass1_Sub1_Sub3_3.method351(1, this.anInt582);
			aClass1_Sub1_Sub3_3.method351(8, this.anInt582);
			aClass1_Sub1_Sub3_3.method353(1684108385);
			aClass1_Sub1_Sub3_3.method354(local3);
			aClass1_Sub1_Sub3_3.anInt443 += local3;
			return aClass1_Sub1_Sub3_3;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("86570, " + false + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QQGIMXLX", name = "a", descriptor = "(I)I")
	private int method482(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass42Array1[local5] != null && this.aClass42Array1[local5].anInt752 + this.aClass42Array1[local5].anInt753 > local3) {
				local3 = this.aClass42Array1[local5].anInt752 + this.aClass42Array1[local5].anInt753;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt583 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt584 * 22050 / 1000;
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
			if (this.aClass42Array1[local106] != null) {
				local123 = this.aClass42Array1[local106].anInt752 * 22050 / 1000;
				local133 = this.aClass42Array1[local106].anInt753 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass42Array1[local106].method534(local123, this.aClass42Array1[local106].anInt752);
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
