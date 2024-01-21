import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private static boolean aBoolean34 = true;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[5000];

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
	public static int[] anIntArray29 = new int[5000];

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private int anInt179 = -325;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt180 = -47;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
	private boolean aBoolean36 = false;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!lb;)V")
	public static void method78(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(false, aByteArray1);
			@Pc(13) int local13;
			if (arg0 != 35102) {
				for (local13 = 1; local13 > 0; local13++) {
				}
			}
			Class7.method243();
			while (true) {
				local13 = arg1.method482();
				if (local13 == 65535) {
					return;
				}
				aClass5Array1[local13] = new Class5(aBoolean34);
				aClass5Array1[local13].method80(arg1);
				anIntArray29[local13] = aClass5Array1[local13].method81();
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("55277, " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!lb;")
	public static Class1_Sub1_Sub3 method79(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg0] == null) {
				return null;
			} else {
				@Pc(13) Class5 local13 = aClass5Array1[arg0];
				return local13.method82(arg1);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("87098, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Z)V")
	private Class5(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
				}
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("27335, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lb;Z)V")
	private void method80(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 10; local6++) {
				@Pc(11) int local11 = arg0.method480();
				if (local11 != 0) {
					arg0.anInt757--;
					this.aClass7Array1[local6] = new Class7();
					this.aClass7Array1[local6].method246(arg0);
				}
			}
			this.anInt181 = arg0.method482();
			this.anInt182 = arg0.method482();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("98263, " + arg0 + ", " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	private int method81() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.aClass7Array1[local15] != null && this.aClass7Array1[local15].anInt484 / 20 < local3) {
					local3 = this.aClass7Array1[local15].anInt484 / 20;
				}
			}
			if (this.anInt181 < this.anInt182 && this.anInt181 / 20 < local3) {
				local3 = this.anInt181 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(68) int local68 = 0; local68 < 10; local68++) {
				if (this.aClass7Array1[local68] != null) {
					this.aClass7Array1[local68].anInt484 -= local3 * 20;
				}
			}
			if (this.anInt181 < this.anInt182) {
				this.anInt181 -= local3 * 20;
				this.anInt182 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("58287, " + false + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!lb;")
	private Class1_Sub1_Sub3 method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method83(arg0);
			aClass1_Sub1_Sub3_1.anInt757 = 0;
			aClass1_Sub1_Sub3_1.method474(1380533830);
			aClass1_Sub1_Sub3_1.method475(this.anInt179, local3 + 36);
			aClass1_Sub1_Sub3_1.method474(1463899717);
			aClass1_Sub1_Sub3_1.method474(1718449184);
			aClass1_Sub1_Sub3_1.method475(this.anInt179, 16);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method475(this.anInt179, 22050);
			aClass1_Sub1_Sub3_1.method475(this.anInt179, 22050);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method472(8);
			aClass1_Sub1_Sub3_1.method474(1684108385);
			aClass1_Sub1_Sub3_1.method475(this.anInt179, local3);
			aClass1_Sub1_Sub3_1.anInt757 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("86130, " + arg0 + ", " + 121 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method83(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt483 + this.aClass7Array1[local5].anInt484 > local3) {
				local3 = this.aClass7Array1[local5].anInt483 + this.aClass7Array1[local5].anInt484;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt181 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt182 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt483 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt484 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method244(local123, this.aClass7Array1[local106].anInt483);
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
