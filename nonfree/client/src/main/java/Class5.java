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
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public static int[] anIntArray29 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt173;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt174;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
	private boolean aBoolean47 = true;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!lb;)V")
	public static void method77(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, 15787);
			Class7.method242();
			while (true) {
				@Pc(15) int local15 = arg0.method478();
				if (local15 == 65535) {
					return;
				}
				aClass5Array1[local15] = new Class5((byte) 58);
				aClass5Array1[local15].method79(arg0);
				anIntArray29[local15] = aClass5Array1[local15].method80();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("47278, " + true + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!lb;")
	public static Class1_Sub1_Sub3 method78(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(17) Class5 local17 = aClass5Array1[arg1];
				return local17.method81(arg0, 873);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("54696, " + arg0 + ", " + 7 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(B)V")
	private Class5(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(ZLclient!lb;)V")
	private void method79(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method476();
				if (local6 != 0) {
					arg0.anInt734--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method245(arg0);
				}
			}
			this.anInt173 = arg0.method478();
			this.anInt174 = arg0.method478();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("59639, " + false + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method80() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.aClass7Array1[local15] != null && this.aClass7Array1[local15].anInt467 / 20 < local3) {
					local3 = this.aClass7Array1[local15].anInt467 / 20;
				}
			}
			if (this.anInt173 < this.anInt174 && this.anInt173 / 20 < local3) {
				local3 = this.anInt173 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(68) int local68 = 0; local68 < 10; local68++) {
				if (this.aClass7Array1[local68] != null) {
					this.aClass7Array1[local68].anInt467 -= local3 * 20;
				}
			}
			if (this.anInt173 < this.anInt174) {
				this.anInt173 -= local3 * 20;
				this.anInt174 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("95859, " + 368 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Lclient!lb;")
	private Class1_Sub1_Sub3 method81(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.method82(arg0);
			aClass1_Sub1_Sub3_1.anInt734 = 0;
			aClass1_Sub1_Sub3_1.method470(1380533830);
			aClass1_Sub1_Sub3_1.method471(local3 + 36);
			aClass1_Sub1_Sub3_1.method470(1463899717);
			aClass1_Sub1_Sub3_1.method470(1718449184);
			aClass1_Sub1_Sub3_1.method471(16);
			aClass1_Sub1_Sub3_1.method468(1);
			aClass1_Sub1_Sub3_1.method468(1);
			aClass1_Sub1_Sub3_1.method471(22050);
			aClass1_Sub1_Sub3_1.method471(22050);
			@Pc(45) boolean local45 = false;
			aClass1_Sub1_Sub3_1.method468(1);
			aClass1_Sub1_Sub3_1.method468(8);
			aClass1_Sub1_Sub3_1.method470(1684108385);
			aClass1_Sub1_Sub3_1.method471(local3);
			aClass1_Sub1_Sub3_1.anInt734 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("32783, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	private int method82(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt466 + this.aClass7Array1[local5].anInt467 > local3) {
				local3 = this.aClass7Array1[local5].anInt466 + this.aClass7Array1[local5].anInt467;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt173 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt174 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt466 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt467 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method243(local123, this.aClass7Array1[local106].anInt466);
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
