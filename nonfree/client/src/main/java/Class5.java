import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
	public static int[] anIntArray31 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt219;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt220;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
	private int anInt218 = 922;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method79(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			aByteArray1 = new byte[441000];
			if (arg0 == 3) {
				aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, false);
				Class7.method240();
				while (true) {
					@Pc(16) int local16 = arg1.method498();
					if (local16 == 65535) {
						return;
					}
					aClass5Array1[local16] = new Class5();
					aClass5Array1[local16].method81(arg1);
					anIntArray31[local16] = aClass5Array1[local16].method82();
				}
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("53849, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZ)Lclient!mb;")
	public static Class1_Sub1_Sub3 method80(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass5Array1[arg0] == null) {
				return null;
			} else {
				@Pc(13) Class5 local13 = aClass5Array1[arg0];
				return local13.method83(arg1);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("33282, " + arg0 + ", " + arg1 + ", " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method81(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method496();
				if (local6 != 0) {
					arg0.anInt778--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method243(arg0);
				}
			}
			this.anInt219 = arg0.method498();
			this.anInt220 = arg0.method498();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("4130, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	private int method82() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt496 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt496 / 20;
				}
			}
			if (this.anInt219 < this.anInt220 && this.anInt219 / 20 < local3) {
				local3 = this.anInt219 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass7Array1[local58] != null) {
					this.aClass7Array1[local58].anInt496 -= local3 * 20;
				}
			}
			if (this.anInt219 < this.anInt220) {
				this.anInt219 -= local3 * 20;
				this.anInt220 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("97361, " + true + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!mb;")
	private Class1_Sub1_Sub3 method83(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method84(arg0);
			aClass1_Sub1_Sub3_1.anInt778 = 0;
			aClass1_Sub1_Sub3_1.method490(1380533830);
			aClass1_Sub1_Sub3_1.method491(local3 + 36);
			aClass1_Sub1_Sub3_1.method490(1463899717);
			aClass1_Sub1_Sub3_1.method490(1718449184);
			aClass1_Sub1_Sub3_1.method491(16);
			aClass1_Sub1_Sub3_1.method488(1);
			aClass1_Sub1_Sub3_1.method488(1);
			aClass1_Sub1_Sub3_1.method491(22050);
			aClass1_Sub1_Sub3_1.method491(22050);
			aClass1_Sub1_Sub3_1.method488(1);
			aClass1_Sub1_Sub3_1.method488(8);
			aClass1_Sub1_Sub3_1.method490(1684108385);
			aClass1_Sub1_Sub3_1.method491(local3);
			aClass1_Sub1_Sub3_1.anInt778 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("10750, " + 5 + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method84(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt495 + this.aClass7Array1[local5].anInt496 > local3) {
				local3 = this.aClass7Array1[local5].anInt495 + this.aClass7Array1[local5].anInt496;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt219 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt220 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt495 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt496 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method241(local123, this.aClass7Array1[local106].anInt495);
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
