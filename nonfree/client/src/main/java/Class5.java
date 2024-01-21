import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private static boolean aBoolean38 = true;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	private static int anInt222 = -35541;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static int[] anIntArray31 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method79(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(45427, aByteArray1);
			Class7.method240();
			while (true) {
				@Pc(20) int local20 = arg0.method500();
				if (local20 == 65535) {
					return;
				}
				aClass5Array1[local20] = new Class5(anInt222);
				aClass5Array1[local20].method81(arg0);
				anIntArray31[local20] = aClass5Array1[local20].method82((byte) 8);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("40121, " + arg0 + ", " + 680 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)Lclient!mb;")
	public static Class1_Sub1_Sub3 method80(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg0] == null) {
				return null;
			} else {
				@Pc(19) Class5 local19 = aClass5Array1[arg0];
				return local19.method83(arg1);
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("63558, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	private Class5(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != -35541) {
				aBoolean39 = true;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("76570, " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mb;B)V")
	private void method81(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 10; local8++) {
				@Pc(13) int local13 = arg0.method498();
				if (local13 != 0) {
					arg0.anInt796--;
					this.aClass7Array1[local8] = new Class7();
					this.aClass7Array1[local8].method243(arg0);
				}
			}
			this.anInt223 = arg0.method500();
			this.anInt224 = arg0.method500();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("55204, " + arg0 + ", " + 66 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
	private int method82(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt503 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt503 / 20;
				}
			}
			if (this.anInt223 < this.anInt224 && this.anInt223 / 20 < local3) {
				local3 = this.anInt223 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass7Array1[local58] != null) {
					this.aClass7Array1[local58].anInt503 -= local3 * 20;
				}
			}
			@Pc(85) boolean local85 = false;
			if (this.anInt223 < this.anInt224) {
				this.anInt223 -= local3 * 20;
				this.anInt224 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("2352, " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)Lclient!mb;")
	private Class1_Sub1_Sub3 method83(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method84(arg0);
			aClass1_Sub1_Sub3_1.anInt796 = 0;
			aClass1_Sub1_Sub3_1.method492(1380533830);
			aClass1_Sub1_Sub3_1.method493(local3 + 36);
			aClass1_Sub1_Sub3_1.method492(1463899717);
			aClass1_Sub1_Sub3_1.method492(1718449184);
			aClass1_Sub1_Sub3_1.method493(16);
			aClass1_Sub1_Sub3_1.method490(1, this.anInt221);
			aClass1_Sub1_Sub3_1.method490(1, this.anInt221);
			aClass1_Sub1_Sub3_1.method493(22050);
			aClass1_Sub1_Sub3_1.method493(22050);
			aClass1_Sub1_Sub3_1.method490(1, this.anInt221);
			aClass1_Sub1_Sub3_1.method490(8, this.anInt221);
			aClass1_Sub1_Sub3_1.method492(1684108385);
			aClass1_Sub1_Sub3_1.method493(local3);
			aClass1_Sub1_Sub3_1.anInt796 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("90339, " + 0 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method84(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt502 + this.aClass7Array1[local5].anInt503 > local3) {
				local3 = this.aClass7Array1[local5].anInt502 + this.aClass7Array1[local5].anInt503;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt223 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt224 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt502 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt503 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method241(local123, this.aClass7Array1[local106].anInt502);
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
