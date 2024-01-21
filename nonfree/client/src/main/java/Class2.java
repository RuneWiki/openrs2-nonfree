import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BSYFPVLV")
public final class Class2 {

	@OriginalMember(owner = "client!BSYFPVLV", name = "f", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!BSYFPVLV", name = "g", descriptor = "Lclient!MLYYHULT;")
	private static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_1;

	@OriginalMember(owner = "client!BSYFPVLV", name = "d", descriptor = "[Lclient!BSYFPVLV;")
	private static Class2[] aClass2Array1 = new Class2[5000];

	@OriginalMember(owner = "client!BSYFPVLV", name = "e", descriptor = "[I")
	public static int[] anIntArray2 = new int[5000];

	@OriginalMember(owner = "client!BSYFPVLV", name = "a", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!BSYFPVLV", name = "i", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!BSYFPVLV", name = "j", descriptor = "I")
	private int anInt5;

	@OriginalMember(owner = "client!BSYFPVLV", name = "b", descriptor = "I")
	private int anInt3 = 1;

	@OriginalMember(owner = "client!BSYFPVLV", name = "c", descriptor = "Z")
	private boolean aBoolean1 = false;

	@OriginalMember(owner = "client!BSYFPVLV", name = "h", descriptor = "[Lclient!RLHOXRLU;")
	private Class28[] aClass28Array1 = new Class28[10];

	@OriginalMember(owner = "client!BSYFPVLV", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	public static void method1(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1) {
		try {
			aByteArray1 = new byte[441000];
			aClass3_Sub1_Sub2_1 = new Class3_Sub1_Sub2(true, aByteArray1);
			@Pc(13) boolean local13 = false;
			Class28.method384();
			while (true) {
				@Pc(20) int local20 = arg0.method202();
				if (local20 == 65535) {
					return;
				}
				aClass2Array1[local20] = new Class2((byte) -75);
				aClass2Array1[local20].method3(arg0);
				anIntArray2[local20] = aClass2Array1[local20].method4();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("1028, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSYFPVLV", name = "a", descriptor = "(BII)Lclient!MLYYHULT;")
	public static Class3_Sub1_Sub2 method2(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			if (aClass2Array1[arg2] == null) {
				return null;
			} else {
				@Pc(18) Class2 local18 = aClass2Array1[arg2];
				return local18.method5(arg1);
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("46109, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSYFPVLV", name = "<init>", descriptor = "(B)V")
	private Class2(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!BSYFPVLV", name = "b", descriptor = "(Lclient!MLYYHULT;B)V")
	private void method3(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method200();
				if (local6 != 0) {
					arg0.anInt429--;
					this.aClass28Array1[local1] = new Class28();
					this.aClass28Array1[local1].method387(arg0);
				}
			}
			this.anInt4 = arg0.method202();
			this.anInt5 = arg0.method202();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("54092, " + arg0 + ", " + 2 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSYFPVLV", name = "a", descriptor = "(I)I")
	private int method4() {
		try {
			@Pc(9) int local9 = 9999999;
			for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
				if (this.aClass28Array1[local11] != null && this.aClass28Array1[local11].anInt581 / 20 < local9) {
					local9 = this.aClass28Array1[local11].anInt581 / 20;
				}
			}
			if (this.anInt4 < this.anInt5 && this.anInt4 / 20 < local9) {
				local9 = this.anInt4 / 20;
			}
			if (local9 == 9999999 || local9 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass28Array1[local64] != null) {
					this.aClass28Array1[local64].anInt581 -= local9 * 20;
				}
			}
			if (this.anInt4 < this.anInt5) {
				this.anInt4 -= local9 * 20;
				this.anInt5 -= local9 * 20;
			}
			return local9;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("51811, " + 6 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSYFPVLV", name = "a", descriptor = "(II)Lclient!MLYYHULT;")
	private Class3_Sub1_Sub2 method5(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method6(arg0);
			aClass3_Sub1_Sub2_1.anInt429 = 0;
			aClass3_Sub1_Sub2_1.method194(1380533830);
			aClass3_Sub1_Sub2_1.method195(local3 + 36);
			aClass3_Sub1_Sub2_1.method194(1463899717);
			aClass3_Sub1_Sub2_1.method194(1718449184);
			aClass3_Sub1_Sub2_1.method195(16);
			aClass3_Sub1_Sub2_1.method192(1);
			aClass3_Sub1_Sub2_1.method192(1);
			aClass3_Sub1_Sub2_1.method195(22050);
			aClass3_Sub1_Sub2_1.method195(22050);
			aClass3_Sub1_Sub2_1.method192(1);
			aClass3_Sub1_Sub2_1.method192(8);
			aClass3_Sub1_Sub2_1.method194(1684108385);
			aClass3_Sub1_Sub2_1.method195(local3);
			aClass3_Sub1_Sub2_1.anInt429 += local3;
			return aClass3_Sub1_Sub2_1;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("7733, " + arg0 + ", " + 30473 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSYFPVLV", name = "b", descriptor = "(I)I")
	private int method6(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass28Array1[local5] != null && this.aClass28Array1[local5].anInt580 + this.aClass28Array1[local5].anInt581 > local3) {
				local3 = this.aClass28Array1[local5].anInt580 + this.aClass28Array1[local5].anInt581;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt4 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt5 * 22050 / 1000;
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
			if (this.aClass28Array1[local106] != null) {
				local123 = this.aClass28Array1[local106].anInt580 * 22050 / 1000;
				local133 = this.aClass28Array1[local106].anInt581 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass28Array1[local106].method385(local123, this.aClass28Array1[local106].anInt580);
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
