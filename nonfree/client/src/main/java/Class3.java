import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ADSZDTIC")
public final class Class3 {

	@OriginalMember(owner = "client!ADSZDTIC", name = "h", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!ADSZDTIC", name = "i", descriptor = "Lclient!CMGGUSPR;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "I")
	private static int anInt6 = 536;

	@OriginalMember(owner = "client!ADSZDTIC", name = "d", descriptor = "I")
	private static int anInt7 = 3;

	@OriginalMember(owner = "client!ADSZDTIC", name = "f", descriptor = "[Lclient!ADSZDTIC;")
	private static Class3[] aClass3Array1 = new Class3[5000];

	@OriginalMember(owner = "client!ADSZDTIC", name = "g", descriptor = "[I")
	public static int[] anIntArray1 = new int[5000];

	@OriginalMember(owner = "client!ADSZDTIC", name = "k", descriptor = "I")
	private int anInt8;

	@OriginalMember(owner = "client!ADSZDTIC", name = "l", descriptor = "I")
	private int anInt9;

	@OriginalMember(owner = "client!ADSZDTIC", name = "b", descriptor = "Z")
	private boolean aBoolean8 = true;

	@OriginalMember(owner = "client!ADSZDTIC", name = "c", descriptor = "B")
	private byte aByte1 = -83;

	@OriginalMember(owner = "client!ADSZDTIC", name = "e", descriptor = "Z")
	private boolean aBoolean9 = false;

	@OriginalMember(owner = "client!ADSZDTIC", name = "j", descriptor = "[Lclient!GCVPDIUI;")
	private Class10[] aClass10Array1 = new Class10[10];

	@OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(ILclient!CMGGUSPR;)V")
	public static void method13(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			if (anInt7 <= 3 && anInt7 >= 3) {
				aByteArray1 = new byte[441000];
				aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, anInt6);
				Class10.method169();
				while (true) {
					@Pc(19) int local19 = arg0.method57();
					if (local19 == 65535) {
						return;
					}
					aClass3Array1[local19] = new Class3(0);
					aClass3Array1[local19].method15(arg0);
					anIntArray1[local19] = aClass3Array1[local19].method16();
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("55282, " + 3 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(III)Lclient!CMGGUSPR;")
	public static Class1_Sub1_Sub3 method14(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass3Array1[arg0] == null) {
				return null;
			} else {
				@Pc(17) Class3 local17 = aClass3Array1[arg0];
				return local17.method17(arg1);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("99340, " + 5 + ", " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADSZDTIC", name = "<init>", descriptor = "(I)V")
	private Class3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(Lclient!CMGGUSPR;I)V")
	private void method15(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				@Pc(10) int local10 = arg0.method55();
				if (local10 != 0) {
					arg0.anInt78--;
					this.aClass10Array1[local5] = new Class10();
					this.aClass10Array1[local5].method172(arg0);
				}
			}
			this.anInt8 = arg0.method57();
			this.anInt9 = arg0.method57();
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("45194, " + arg0 + ", " + -593 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(I)I")
	private int method16() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(9) int local9 = 0; local9 < 10; local9++) {
				if (this.aClass10Array1[local9] != null && this.aClass10Array1[local9].anInt153 / 20 < local3) {
					local3 = this.aClass10Array1[local9].anInt153 / 20;
				}
			}
			if (this.anInt8 < this.anInt9 && this.anInt8 / 20 < local3) {
				local3 = this.anInt8 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass10Array1[local62] != null) {
					this.aClass10Array1[local62].anInt153 -= local3 * 20;
				}
			}
			if (this.anInt8 < this.anInt9) {
				this.anInt8 -= local3 * 20;
				this.anInt9 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("83467, " + 0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADSZDTIC", name = "a", descriptor = "(II)Lclient!CMGGUSPR;")
	private Class1_Sub1_Sub3 method17(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method18(arg0);
			aClass1_Sub1_Sub3_1.anInt78 = 0;
			aClass1_Sub1_Sub3_1.method49(1380533830);
			aClass1_Sub1_Sub3_1.method50(local3 + 36, this.aBoolean8);
			aClass1_Sub1_Sub3_1.method49(1463899717);
			aClass1_Sub1_Sub3_1.method49(1718449184);
			aClass1_Sub1_Sub3_1.method50(16, this.aBoolean8);
			aClass1_Sub1_Sub3_1.method47(1);
			aClass1_Sub1_Sub3_1.method47(1);
			aClass1_Sub1_Sub3_1.method50(22050, this.aBoolean8);
			aClass1_Sub1_Sub3_1.method50(22050, this.aBoolean8);
			aClass1_Sub1_Sub3_1.method47(1);
			aClass1_Sub1_Sub3_1.method47(8);
			aClass1_Sub1_Sub3_1.method49(1684108385);
			aClass1_Sub1_Sub3_1.method50(local3, this.aBoolean8);
			aClass1_Sub1_Sub3_1.anInt78 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("14155, " + -36990 + ", " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ADSZDTIC", name = "b", descriptor = "(I)I")
	private int method18(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass10Array1[local5] != null && this.aClass10Array1[local5].anInt152 + this.aClass10Array1[local5].anInt153 > local3) {
				local3 = this.aClass10Array1[local5].anInt152 + this.aClass10Array1[local5].anInt153;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt8 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt9 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray1[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass10Array1[local106] != null) {
				local123 = this.aClass10Array1[local106].anInt152 * 22050 / 1000;
				local133 = this.aClass10Array1[local106].anInt153 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass10Array1[local106].method170(local123, this.aClass10Array1[local106].anInt152);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray1[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray1[local133 + local123] = aByteArray1[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray1[local147 + local123] = aByteArray1[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
