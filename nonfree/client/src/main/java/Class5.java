import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private static boolean aBoolean36 = true;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[5000];

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public static int[] anIntArray29 = new int[5000];

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private int anInt181 = 921;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt182 = 18835;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!lb;)V")
	public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			aByteArray1 = new byte[441000];
			if (arg0 != 0) {
				aBoolean36 = !aBoolean36;
			}
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, -26728);
			Class7.method243();
			while (true) {
				@Pc(20) int local20 = arg1.method482();
				if (local20 == 65535) {
					return;
				}
				aClass5Array1[local20] = new Class5(-374);
				aClass5Array1[local20].method80(arg1);
				anIntArray29[local20] = aClass5Array1[local20].method81();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("12708, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Lclient!lb;")
	public static Class1_Sub1_Sub3 method79(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(16) Class5 local16 = aClass5Array1[arg1];
				return local16.method82(arg0);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("4092, " + true + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	private Class5(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method80(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method480();
				if (local6 != 0) {
					arg0.anInt742--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method246(arg0);
				}
			}
			this.anInt183 = arg0.method482();
			this.anInt184 = arg0.method482();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("49815, " + arg0 + ", " + 8 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method81() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
				if (this.aClass7Array1[local11] != null && this.aClass7Array1[local11].anInt482 / 20 < local3) {
					local3 = this.aClass7Array1[local11].anInt482 / 20;
				}
			}
			if (this.anInt183 < this.anInt184 && this.anInt183 / 20 < local3) {
				local3 = this.anInt183 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass7Array1[local64] != null) {
					this.aClass7Array1[local64].anInt482 -= local3 * 20;
				}
			}
			if (this.anInt183 < this.anInt184) {
				this.anInt183 -= local3 * 20;
				this.anInt184 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("23171, " + -36823 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!lb;")
	private Class1_Sub1_Sub3 method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method83(arg0);
			aClass1_Sub1_Sub3_1.anInt742 = 0;
			aClass1_Sub1_Sub3_1.method474(1380533830);
			aClass1_Sub1_Sub3_1.method475(local3 + 36);
			aClass1_Sub1_Sub3_1.method474(1463899717);
			aClass1_Sub1_Sub3_1.method474(1718449184);
			aClass1_Sub1_Sub3_1.method475(16);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method475(22050);
			aClass1_Sub1_Sub3_1.method475(22050);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method472(8);
			aClass1_Sub1_Sub3_1.method474(1684108385);
			aClass1_Sub1_Sub3_1.method475(local3);
			aClass1_Sub1_Sub3_1.anInt742 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("26993, " + arg0 + ", " + -33430 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	private int method83(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt481 + this.aClass7Array1[local5].anInt482 > local3) {
				local3 = this.aClass7Array1[local5].anInt481 + this.aClass7Array1[local5].anInt482;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt183 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt184 * 22050 / 1000;
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
			if (this.aClass7Array1[local106] != null) {
				local123 = this.aClass7Array1[local106].anInt481 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt482 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method244(local123, this.aClass7Array1[local106].anInt481);
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
