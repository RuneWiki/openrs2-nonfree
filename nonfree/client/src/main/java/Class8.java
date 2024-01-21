import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EJAYDEWE")
public final class Class8 {

	@OriginalMember(owner = "client!EJAYDEWE", name = "b", descriptor = "Z")
	private static boolean aBoolean46;

	@OriginalMember(owner = "client!EJAYDEWE", name = "f", descriptor = "[B")
	private static byte[] aByteArray3;

	@OriginalMember(owner = "client!EJAYDEWE", name = "g", descriptor = "Lclient!IMUIZRAF;")
	private static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_1;

	@OriginalMember(owner = "client!EJAYDEWE", name = "a", descriptor = "I")
	private static int anInt146 = 8;

	@OriginalMember(owner = "client!EJAYDEWE", name = "d", descriptor = "[Lclient!EJAYDEWE;")
	private static Class8[] aClass8Array1 = new Class8[5000];

	@OriginalMember(owner = "client!EJAYDEWE", name = "e", descriptor = "[I")
	public static int[] anIntArray27 = new int[5000];

	@OriginalMember(owner = "client!EJAYDEWE", name = "i", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!EJAYDEWE", name = "j", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!EJAYDEWE", name = "c", descriptor = "I")
	private int anInt147 = -820;

	@OriginalMember(owner = "client!EJAYDEWE", name = "h", descriptor = "[Lclient!SNQOEFQG;")
	private Class37[] aClass37Array1 = new Class37[10];

	@OriginalMember(owner = "client!EJAYDEWE", name = "a", descriptor = "(Lclient!IMUIZRAF;Z)V")
	public static void method100(@OriginalArg(0) Class3_Sub1_Sub3 arg0) {
		try {
			aByteArray3 = new byte[441000];
			aClass3_Sub1_Sub3_1 = new Class3_Sub1_Sub3(0, aByteArray3);
			Class37.method394();
			while (true) {
				@Pc(15) int local15 = arg0.method148();
				if (local15 == 65535) {
					return;
				}
				aClass8Array1[local15] = new Class8(true);
				aClass8Array1[local15].method102(anInt146, arg0);
				anIntArray27[local15] = aClass8Array1[local15].method103(aBoolean46);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("78788, " + arg0 + ", " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJAYDEWE", name = "a", descriptor = "(BII)Lclient!IMUIZRAF;")
	public static Class3_Sub1_Sub3 method101(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass8Array1[arg0] == null) {
				return null;
			} else {
				@Pc(14) Class8 local14 = aClass8Array1[arg0];
				return local14.method104(arg1);
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("76318, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJAYDEWE", name = "<init>", descriptor = "(Z)V")
	private Class8(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!EJAYDEWE", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	private void method102(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			if (arg0 != 8) {
				this.anInt147 = -35;
			}
			for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
				@Pc(12) int local12 = arg1.method146();
				if (local12 != 0) {
					arg1.anInt243--;
					this.aClass37Array1[local7] = new Class37();
					this.aClass37Array1[local7].method397(anInt146, arg1);
				}
			}
			this.anInt148 = arg1.method148();
			this.anInt149 = arg1.method148();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("33319, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJAYDEWE", name = "a", descriptor = "(Z)I")
	private int method103(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass37Array1[local5] != null && this.aClass37Array1[local5].anInt598 / 20 < local3) {
					local3 = this.aClass37Array1[local5].anInt598 / 20;
				}
			}
			if (this.anInt148 < this.anInt149 && this.anInt148 / 20 < local3) {
				local3 = this.anInt148 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass37Array1[local58] != null) {
					this.aClass37Array1[local58].anInt598 -= local3 * 20;
				}
			}
			if (arg0) {
				anInt146 = 346;
			}
			if (this.anInt148 < this.anInt149) {
				this.anInt148 -= local3 * 20;
				this.anInt149 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("7023, " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJAYDEWE", name = "a", descriptor = "(II)Lclient!IMUIZRAF;")
	private Class3_Sub1_Sub3 method104(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = this.method105(arg0);
			aClass3_Sub1_Sub3_1.anInt243 = 0;
			aClass3_Sub1_Sub3_1.method140(1380533830);
			aClass3_Sub1_Sub3_1.method141(local5 + 36);
			aClass3_Sub1_Sub3_1.method140(1463899717);
			aClass3_Sub1_Sub3_1.method140(1718449184);
			aClass3_Sub1_Sub3_1.method141(16);
			aClass3_Sub1_Sub3_1.method138(1);
			aClass3_Sub1_Sub3_1.method138(1);
			aClass3_Sub1_Sub3_1.method141(22050);
			aClass3_Sub1_Sub3_1.method141(22050);
			aClass3_Sub1_Sub3_1.method138(1);
			aClass3_Sub1_Sub3_1.method138(8);
			aClass3_Sub1_Sub3_1.method140(1684108385);
			aClass3_Sub1_Sub3_1.method141(local5);
			aClass3_Sub1_Sub3_1.anInt243 += local5;
			return aClass3_Sub1_Sub3_1;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("72157, " + arg0 + ", " + -777 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EJAYDEWE", name = "a", descriptor = "(I)I")
	private int method105(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass37Array1[local5] != null && this.aClass37Array1[local5].anInt597 + this.aClass37Array1[local5].anInt598 > local3) {
				local3 = this.aClass37Array1[local5].anInt597 + this.aClass37Array1[local5].anInt598;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt148 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt149 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray3[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass37Array1[local106] != null) {
				local123 = this.aClass37Array1[local106].anInt597 * 22050 / 1000;
				local133 = this.aClass37Array1[local106].anInt598 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass37Array1[local106].method395(local123, this.aClass37Array1[local106].anInt597);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray3[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray3[local133 + local123] = aByteArray3[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray3[local147 + local123] = aByteArray3[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
