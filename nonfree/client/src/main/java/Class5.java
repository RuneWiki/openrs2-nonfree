import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private static boolean aBoolean46 = true;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[5000];

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
	public static int[] anIntArray29 = new int[5000];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt172;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private int anInt170 = -798;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!lb;)V")
	public static void method78(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, (byte) -93);
			Class7.method243();
			while (true) {
				@Pc(20) int local20 = arg0.method482();
				if (local20 == 65535) {
					return;
				}
				aClass5Array1[local20] = new Class5((byte) 3);
				aClass5Array1[local20].method80(arg0);
				anIntArray29[local20] = aClass5Array1[local20].method81();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("73503, " + false + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZI)Lclient!lb;")
	public static Class1_Sub1_Sub3 method79(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(16) Class5 local16 = aClass5Array1[arg1];
				return local16.method82(arg0);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("89474, " + arg0 + ", " + false + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(B)V")
	private Class5(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method80(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg0.method480();
				if (local8 != 0) {
					arg0.anInt720--;
					this.aClass7Array1[local3] = new Class7();
					this.aClass7Array1[local3].method246(210, arg0);
				}
			}
			this.anInt171 = arg0.method482();
			this.anInt172 = arg0.method482();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("18006, " + 210 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method81() {
		try {
			@Pc(10) int local10 = 9999999;
			for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
				if (this.aClass7Array1[local12] != null && this.aClass7Array1[local12].anInt451 / 20 < local10) {
					local10 = this.aClass7Array1[local12].anInt451 / 20;
				}
			}
			if (this.anInt171 < this.anInt172 && this.anInt171 / 20 < local10) {
				local10 = this.anInt171 / 20;
			}
			if (local10 == 9999999 || local10 == 0) {
				return 0;
			}
			for (@Pc(65) int local65 = 0; local65 < 10; local65++) {
				if (this.aClass7Array1[local65] != null) {
					this.aClass7Array1[local65].anInt451 -= local10 * 20;
				}
			}
			if (this.anInt171 < this.anInt172) {
				this.anInt171 -= local10 * 20;
				this.anInt172 -= local10 * 20;
			}
			return local10;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("54562, " + -183 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!lb;")
	private Class1_Sub1_Sub3 method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method83(arg0);
			aClass1_Sub1_Sub3_1.anInt720 = 0;
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
			aClass1_Sub1_Sub3_1.anInt720 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("35330, " + arg0 + ", " + 422 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	private int method83(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt450 + this.aClass7Array1[local5].anInt451 > local3) {
				local3 = this.aClass7Array1[local5].anInt450 + this.aClass7Array1[local5].anInt451;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt171 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt172 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt450 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt451 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method244(local123, this.aClass7Array1[local106].anInt450);
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
