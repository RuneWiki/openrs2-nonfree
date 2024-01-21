import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private static int anInt191 = 1000;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[5000];

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static int[] anIntArray29 = new int[5000];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt192 = -47594;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lb;I)V")
	public static void method78(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(anInt191, aByteArray1);
			Class7.method243();
			while (true) {
				@Pc(17) int local17 = arg0.method482();
				if (local17 == 65535) {
					return;
				}
				aClass5Array1[local17] = new Class5(0);
				aClass5Array1[local17].method80(arg0);
				anIntArray29[local17] = aClass5Array1[local17].method81();
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("27982, " + arg0 + ", " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBI)Lclient!lb;")
	public static Class1_Sub1_Sub3 method79(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) boolean local6 = false;
			if (aClass5Array1[arg0] == null) {
				return null;
			} else {
				@Pc(23) Class5 local23 = aClass5Array1[arg0];
				return local23.method82(arg2);
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("5163, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	private Class5(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method80(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method480();
				if (local6 != 0) {
					arg0.anInt751--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method246(arg0);
				}
			}
			this.anInt193 = arg0.method482();
			this.anInt194 = arg0.method482();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("68255, " + 8 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
	private int method81() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(10) int local10 = 0; local10 < 10; local10++) {
				if (this.aClass7Array1[local10] != null && this.aClass7Array1[local10].anInt481 / 20 < local3) {
					local3 = this.aClass7Array1[local10].anInt481 / 20;
				}
			}
			if (this.anInt193 < this.anInt194 && this.anInt193 / 20 < local3) {
				local3 = this.anInt193 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass7Array1[local63] != null) {
					this.aClass7Array1[local63].anInt481 -= local3 * 20;
				}
			}
			if (this.anInt193 < this.anInt194) {
				this.anInt193 -= local3 * 20;
				this.anInt194 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("97794, " + -13 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!lb;")
	private Class1_Sub1_Sub3 method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method83(arg0);
			aClass1_Sub1_Sub3_1.anInt751 = 0;
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
			aClass1_Sub1_Sub3_1.anInt751 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("68199, " + arg0 + ", " + 11970 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method83(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt480 + this.aClass7Array1[local5].anInt481 > local3) {
				local3 = this.aClass7Array1[local5].anInt480 + this.aClass7Array1[local5].anInt481;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt193 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt194 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt480 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt481 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method244(local123, this.aClass7Array1[local106].anInt480);
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
