import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private static boolean aBoolean38;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
	public static int[] anIntArray31 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private int anInt220 = 2;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mb;Z)V")
	public static void method79(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, 337);
			Class7.method240();
			while (true) {
				@Pc(15) int local15 = arg0.method500();
				if (local15 == 65535) {
					return;
				}
				aClass5Array1[local15] = new Class5(1);
				aClass5Array1[local15].method81(arg0);
				anIntArray31[local15] = aClass5Array1[local15].method82();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23249, " + arg0 + ", " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!mb;")
	public static Class1_Sub1_Sub3 method80(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(15) Class5 local15 = aClass5Array1[arg1];
				return local15.method83(arg0);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("76586, " + 572 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	private Class5(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method81(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(12) int local12 = 0; local12 < 10; local12++) {
				@Pc(17) int local17 = arg0.method498();
				if (local17 != 0) {
					arg0.anInt768--;
					this.aClass7Array1[local12] = new Class7();
					this.aClass7Array1[local12].method243(arg0);
				}
			}
			this.anInt221 = arg0.method500();
			this.anInt222 = arg0.method500();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("85903, " + 0 + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method82() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt488 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt488 / 20;
				}
			}
			if (this.anInt221 < this.anInt222 && this.anInt221 / 20 < local3) {
				local3 = this.anInt221 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass7Array1[local63] != null) {
					this.aClass7Array1[local63].anInt488 -= local3 * 20;
				}
			}
			if (this.anInt221 < this.anInt222) {
				this.anInt221 -= local3 * 20;
				this.anInt222 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("54002, " + 0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!mb;")
	private Class1_Sub1_Sub3 method83(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method84(arg0);
			aClass1_Sub1_Sub3_1.anInt768 = 0;
			aClass1_Sub1_Sub3_1.method492(1380533830);
			aClass1_Sub1_Sub3_1.method493(local3 + 36);
			aClass1_Sub1_Sub3_1.method492(1463899717);
			aClass1_Sub1_Sub3_1.method492(1718449184);
			aClass1_Sub1_Sub3_1.method493(16);
			aClass1_Sub1_Sub3_1.method490((byte) 9, 1);
			aClass1_Sub1_Sub3_1.method490((byte) 9, 1);
			aClass1_Sub1_Sub3_1.method493(22050);
			aClass1_Sub1_Sub3_1.method493(22050);
			aClass1_Sub1_Sub3_1.method490((byte) 9, 1);
			aClass1_Sub1_Sub3_1.method490((byte) 9, 8);
			aClass1_Sub1_Sub3_1.method492(1684108385);
			aClass1_Sub1_Sub3_1.method493(local3);
			aClass1_Sub1_Sub3_1.anInt768 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("85296, " + -186 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	private int method84(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt487 + this.aClass7Array1[local5].anInt488 > local3) {
				local3 = this.aClass7Array1[local5].anInt487 + this.aClass7Array1[local5].anInt488;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt221 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt222 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt487 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt488 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method241(local123, this.aClass7Array1[local106].anInt487);
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
