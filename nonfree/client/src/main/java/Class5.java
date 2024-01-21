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

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[5000];

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public static int[] anIntArray29 = new int[5000];

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private int anInt193 = 2;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lb;Z)V")
	public static void method78(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(-49365, aByteArray1);
			Class7.method243();
			while (true) {
				@Pc(15) int local15 = arg0.method482();
				if (local15 == 65535) {
					return;
				}
				aClass5Array1[local15] = new Class5(-932);
				aClass5Array1[local15].method80(arg0);
				anIntArray29[local15] = aClass5Array1[local15].method81();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("47131, " + arg0 + ", " + false + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)Lclient!lb;")
	public static Class1_Sub1_Sub3 method79(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			if (aClass5Array1[arg2] == null) {
				return null;
			} else {
				@Pc(18) Class5 local18 = aClass5Array1[arg2];
				return local18.method82(arg1);
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("54541, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	private Class5(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!lb;Z)V")
	private void method80(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method480();
				if (local6 != 0) {
					arg0.anInt763--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method246(arg0);
				}
			}
			this.anInt195 = arg0.method482();
			this.anInt196 = arg0.method482();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("31819, " + arg0 + ", " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method81() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt482 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt482 / 20;
				}
			}
			if (this.anInt195 < this.anInt196 && this.anInt195 / 20 < local3) {
				local3 = this.anInt195 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass7Array1[local63] != null) {
					this.aClass7Array1[local63].anInt482 -= local3 * 20;
				}
			}
			if (this.anInt195 < this.anInt196) {
				this.anInt195 -= local3 * 20;
				this.anInt196 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("35996, " + 0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)Lclient!lb;")
	private Class1_Sub1_Sub3 method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method83(arg0);
			aClass1_Sub1_Sub3_1.anInt763 = 0;
			aClass1_Sub1_Sub3_1.method474(1380533830);
			aClass1_Sub1_Sub3_1.method475(local3 + 36, this.anInt193);
			aClass1_Sub1_Sub3_1.method474(1463899717);
			aClass1_Sub1_Sub3_1.method474(1718449184);
			aClass1_Sub1_Sub3_1.method475(16, this.anInt193);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method475(22050, this.anInt193);
			aClass1_Sub1_Sub3_1.method475(22050, this.anInt193);
			aClass1_Sub1_Sub3_1.method472(1);
			aClass1_Sub1_Sub3_1.method472(8);
			aClass1_Sub1_Sub3_1.method474(1684108385);
			aClass1_Sub1_Sub3_1.method475(local3, this.anInt193);
			aClass1_Sub1_Sub3_1.anInt763 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("74130, " + arg0 + ", " + true + ", " + local80.toString());
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
		@Pc(58) int local58 = this.anInt195 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt196 * 22050 / 1000;
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
