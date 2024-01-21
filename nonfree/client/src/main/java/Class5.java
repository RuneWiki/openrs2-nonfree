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
	public static int[] anIntArray28 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt170;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt171;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "B")
	private byte aByte6 = 117;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!lb;)V")
	public static void method77(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			aByteArray1 = new byte[441000];
			@Pc(6) boolean local6 = false;
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3((byte) 3, aByteArray1);
			Class7.method241();
			while (true) {
				@Pc(16) int local16 = arg1.method474();
				if (local16 == 65535) {
					return;
				}
				aClass5Array1[local16] = new Class5(685);
				aClass5Array1[local16].method79(arg1);
				anIntArray28[local16] = aClass5Array1[local16].method80();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("26705, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Lclient!lb;")
	public static Class1_Sub1_Sub3 method78(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg0] == null) {
				return null;
			} else {
				@Pc(13) Class5 local13 = aClass5Array1[arg0];
				return local13.method81(arg1);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("40730, " + false + ", " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	private Class5(@OriginalArg(0) int arg0) {
		try {
			@Pc(15) int local15 = 55 / arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("60582, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method79(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
				@Pc(18) int local18 = arg0.method472();
				if (local18 != 0) {
					arg0.anInt715--;
					this.aClass7Array1[local13] = new Class7();
					this.aClass7Array1[local13].method244(arg0);
				}
			}
			this.anInt170 = arg0.method474();
			this.anInt171 = arg0.method474();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("57868, " + arg0 + ", " + -32477 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)I")
	private int method80() {
		try {
			@Pc(8) int local8 = 9999999;
			for (@Pc(10) int local10 = 0; local10 < 10; local10++) {
				if (this.aClass7Array1[local10] != null && this.aClass7Array1[local10].anInt456 / 20 < local8) {
					local8 = this.aClass7Array1[local10].anInt456 / 20;
				}
			}
			if (this.anInt170 < this.anInt171 && this.anInt170 / 20 < local8) {
				local8 = this.anInt170 / 20;
			}
			if (local8 == 9999999 || local8 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass7Array1[local63] != null) {
					this.aClass7Array1[local63].anInt456 -= local8 * 20;
				}
			}
			if (this.anInt170 < this.anInt171) {
				this.anInt170 -= local8 * 20;
				this.anInt171 -= local8 * 20;
			}
			return local8;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("98427, " + false + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)Lclient!lb;")
	private Class1_Sub1_Sub3 method81(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method82(arg0);
			aClass1_Sub1_Sub3_1.anInt715 = 0;
			aClass1_Sub1_Sub3_1.method466(1380533830);
			aClass1_Sub1_Sub3_1.method467(local3 + 36, this.aByte6);
			aClass1_Sub1_Sub3_1.method466(1463899717);
			aClass1_Sub1_Sub3_1.method466(1718449184);
			aClass1_Sub1_Sub3_1.method467(16, this.aByte6);
			aClass1_Sub1_Sub3_1.method464(1);
			aClass1_Sub1_Sub3_1.method464(1);
			aClass1_Sub1_Sub3_1.method467(22050, this.aByte6);
			aClass1_Sub1_Sub3_1.method467(22050, this.aByte6);
			aClass1_Sub1_Sub3_1.method464(1);
			aClass1_Sub1_Sub3_1.method464(8);
			aClass1_Sub1_Sub3_1.method466(1684108385);
			aClass1_Sub1_Sub3_1.method467(local3, this.aByte6);
			aClass1_Sub1_Sub3_1.anInt715 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("95668, " + true + ", " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method82(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt455 + this.aClass7Array1[local5].anInt456 > local3) {
				local3 = this.aClass7Array1[local5].anInt455 + this.aClass7Array1[local5].anInt456;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt170 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt171 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt455 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt456 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method242(local123, this.aClass7Array1[local106].anInt455);
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
