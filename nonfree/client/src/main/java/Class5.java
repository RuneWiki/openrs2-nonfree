import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private static boolean aBoolean40;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private static boolean aBoolean41 = true;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private static int anInt181 = 8;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[5000];

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static int[] anIntArray29 = new int[5000];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private int anInt182 = 47044;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lb;I)V")
	public static void method78(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, aBoolean40);
			Class7.method243();
			while (true) {
				@Pc(16) int local16 = arg0.method482();
				if (local16 == 65535) {
					return;
				}
				aClass5Array1[local16] = new Class5(true);
				aClass5Array1[local16].method80(arg0);
				anIntArray29[local16] = aClass5Array1[local16].method81();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("64762, " + arg0 + ", " + 5 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!lb;")
	public static Class1_Sub1_Sub3 method79(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (anInt181 != 8) {
				aBoolean41 = !aBoolean41;
			}
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(16) Class5 local16 = aClass5Array1[arg1];
				return local16.method82(arg0);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("58612, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Z)V")
	private Class5(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method80(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method480();
				if (local6 != 0) {
					arg0.anInt733--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method246(arg0);
				}
			}
			this.anInt183 = arg0.method482();
			this.anInt184 = arg0.method482();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("70113, " + false + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	private int method81() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt468 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt468 / 20;
				}
			}
			if (this.anInt183 < this.anInt184 && this.anInt183 / 20 < local3) {
				local3 = this.anInt183 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass7Array1[local62] != null) {
					this.aClass7Array1[local62].anInt468 -= local3 * 20;
				}
			}
			if (this.anInt183 < this.anInt184) {
				this.anInt183 -= local3 * 20;
				this.anInt184 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("80453, " + true + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)Lclient!lb;")
	private Class1_Sub1_Sub3 method82(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method83(arg0);
			aClass1_Sub1_Sub3_1.anInt733 = 0;
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
			aClass1_Sub1_Sub3_1.anInt733 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("69967, " + arg0 + ", " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method83(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt467 + this.aClass7Array1[local5].anInt468 > local3) {
				local3 = this.aClass7Array1[local5].anInt467 + this.aClass7Array1[local5].anInt468;
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
				local123 = this.aClass7Array1[local106].anInt467 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt468 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method244(local123, this.aClass7Array1[local106].anInt467);
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
