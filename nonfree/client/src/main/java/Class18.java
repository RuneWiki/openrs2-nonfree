import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JHDAGNBV")
public final class Class18 {

	@OriginalMember(owner = "client!JHDAGNBV", name = "b", descriptor = "Z")
	private static boolean aBoolean96;

	@OriginalMember(owner = "client!JHDAGNBV", name = "g", descriptor = "[B")
	private static byte[] aByteArray8;

	@OriginalMember(owner = "client!JHDAGNBV", name = "h", descriptor = "Lclient!MBMGIXGO;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!JHDAGNBV", name = "c", descriptor = "Z")
	private static boolean aBoolean97 = true;

	@OriginalMember(owner = "client!JHDAGNBV", name = "e", descriptor = "[Lclient!JHDAGNBV;")
	private static Class18[] aClass18Array1 = new Class18[5000];

	@OriginalMember(owner = "client!JHDAGNBV", name = "f", descriptor = "[I")
	public static int[] anIntArray70 = new int[5000];

	@OriginalMember(owner = "client!JHDAGNBV", name = "j", descriptor = "I")
	private int anInt399;

	@OriginalMember(owner = "client!JHDAGNBV", name = "k", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!JHDAGNBV", name = "i", descriptor = "[Lclient!CLRWXPOI;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!JHDAGNBV", name = "d", descriptor = "I")
	private int anInt398;

	@OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(ILclient!MBMGIXGO;)V")
	public static void method221(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray8 = new byte[441000];
			aClass1_Sub1_Sub3_3 = new Class1_Sub1_Sub3(aByteArray8, 891);
			Class7.method36();
			while (true) {
				@Pc(20) int local20 = arg0.method270();
				if (local20 == 65535) {
					return;
				}
				aClass18Array1[local20] = new Class18(8);
				aClass18Array1[local20].method223(arg0);
				anIntArray70[local20] = aClass18Array1[local20].method224();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("17085, " + 0 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(IIZ)Lclient!MBMGIXGO;")
	public static Class1_Sub1_Sub3 method222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass18Array1[arg1] == null) {
				return null;
			} else {
				@Pc(15) Class18 local15 = aClass18Array1[arg1];
				return local15.method225(arg0);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("50738, " + arg0 + ", " + arg1 + ", " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHDAGNBV", name = "<init>", descriptor = "(I)V")
	private Class18(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(ZLclient!MBMGIXGO;)V")
	private void method223(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method268();
				if (local6 != 0) {
					arg0.anInt468--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method39(arg0);
				}
			}
			this.anInt399 = arg0.method270();
			this.anInt400 = arg0.method270();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("1629, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(I)I")
	private int method224() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(10) int local10 = 0; local10 < 10; local10++) {
				if (this.aClass7Array1[local10] != null && this.aClass7Array1[local10].anInt50 / 20 < local3) {
					local3 = this.aClass7Array1[local10].anInt50 / 20;
				}
			}
			if (this.anInt399 < this.anInt400 && this.anInt399 / 20 < local3) {
				local3 = this.anInt399 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass7Array1[local63] != null) {
					this.aClass7Array1[local63].anInt50 -= local3 * 20;
				}
			}
			if (this.anInt399 < this.anInt400) {
				this.anInt399 -= local3 * 20;
				this.anInt400 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("43186, " + 0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHDAGNBV", name = "a", descriptor = "(II)Lclient!MBMGIXGO;")
	private Class1_Sub1_Sub3 method225(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method226(arg0);
			aClass1_Sub1_Sub3_3.anInt468 = 0;
			aClass1_Sub1_Sub3_3.method262(1380533830);
			aClass1_Sub1_Sub3_3.method263(local3 + 36);
			aClass1_Sub1_Sub3_3.method262(1463899717);
			aClass1_Sub1_Sub3_3.method262(1718449184);
			aClass1_Sub1_Sub3_3.method263(16);
			aClass1_Sub1_Sub3_3.method260(1);
			aClass1_Sub1_Sub3_3.method260(1);
			aClass1_Sub1_Sub3_3.method263(22050);
			aClass1_Sub1_Sub3_3.method263(22050);
			aClass1_Sub1_Sub3_3.method260(1);
			aClass1_Sub1_Sub3_3.method260(8);
			aClass1_Sub1_Sub3_3.method262(1684108385);
			aClass1_Sub1_Sub3_3.method263(local3);
			aClass1_Sub1_Sub3_3.anInt468 += local3;
			return aClass1_Sub1_Sub3_3;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("47851, " + arg0 + ", " + 6 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JHDAGNBV", name = "b", descriptor = "(I)I")
	private int method226(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt49 + this.aClass7Array1[local5].anInt50 > local3) {
				local3 = this.aClass7Array1[local5].anInt49 + this.aClass7Array1[local5].anInt50;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt399 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt400 * 22050 / 1000;
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
			if (this.aClass7Array1[local106] != null) {
				local123 = this.aClass7Array1[local106].anInt49 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt50 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method37(local123, this.aClass7Array1[local106].anInt49);
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
