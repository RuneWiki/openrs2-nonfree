import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NGSVJLXG")
public final class Class30 {

	@OriginalMember(owner = "client!NGSVJLXG", name = "f", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!NGSVJLXG", name = "g", descriptor = "Lclient!PKHWFJLM;")
	private static Class5_Sub1_Sub4 aClass5_Sub1_Sub4_3;

	@OriginalMember(owner = "client!NGSVJLXG", name = "a", descriptor = "Z")
	private static boolean aBoolean94 = true;

	@OriginalMember(owner = "client!NGSVJLXG", name = "b", descriptor = "I")
	private static int anInt294 = 6;

	@OriginalMember(owner = "client!NGSVJLXG", name = "d", descriptor = "[Lclient!NGSVJLXG;")
	private static Class30[] aClass30Array1 = new Class30[5000];

	@OriginalMember(owner = "client!NGSVJLXG", name = "e", descriptor = "[I")
	public static int[] anIntArray89 = new int[5000];

	@OriginalMember(owner = "client!NGSVJLXG", name = "i", descriptor = "I")
	private int anInt295;

	@OriginalMember(owner = "client!NGSVJLXG", name = "j", descriptor = "I")
	private int anInt296;

	@OriginalMember(owner = "client!NGSVJLXG", name = "c", descriptor = "B")
	private byte aByte10 = 9;

	@OriginalMember(owner = "client!NGSVJLXG", name = "h", descriptor = "[Lclient!DZFLZLPS;")
	private Class12[] aClass12Array1 = new Class12[10];

	@OriginalMember(owner = "client!NGSVJLXG", name = "a", descriptor = "(ILclient!PKHWFJLM;)V")
	public static void method197(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			if (arg0 >= 3 && arg0 <= 3) {
				aByteArray15 = new byte[441000];
				aClass5_Sub1_Sub4_3 = new Class5_Sub1_Sub4(aByteArray15, 0);
				Class12.method98();
				while (true) {
					@Pc(19) int local19 = arg1.method242();
					if (local19 == 65535) {
						return;
					}
					aClass30Array1[local19] = new Class30((byte) 9);
					aClass30Array1[local19].method199(arg1, aBoolean94);
					anIntArray89[local19] = aClass30Array1[local19].method200();
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("68089, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGSVJLXG", name = "a", descriptor = "(IZI)Lclient!PKHWFJLM;")
	public static Class5_Sub1_Sub4 method198(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg1) {
				anInt294 = 294;
			}
			if (aClass30Array1[arg2] == null) {
				return null;
			} else {
				@Pc(11) Class30 local11 = aClass30Array1[arg2];
				return local11.method201(arg0);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("80700, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGSVJLXG", name = "<init>", descriptor = "(B)V")
	private Class30(@OriginalArg(0) byte arg0) {
		try {
			@Pc(13) boolean local13 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("58774, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGSVJLXG", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	private void method199(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method240();
				if (local6 != 0) {
					arg0.anInt429--;
					this.aClass12Array1[local1] = new Class12();
					this.aClass12Array1[local1].method101(arg0, aBoolean94);
				}
			}
			if (!arg1) {
				throw new NullPointerException();
			}
			this.anInt295 = arg0.method242();
			this.anInt296 = arg0.method242();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("64515, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGSVJLXG", name = "a", descriptor = "(I)I")
	private int method200() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(9) int local9 = 0; local9 < 10; local9++) {
				if (this.aClass12Array1[local9] != null && this.aClass12Array1[local9].anInt118 / 20 < local3) {
					local3 = this.aClass12Array1[local9].anInt118 / 20;
				}
			}
			if (this.anInt295 < this.anInt296 && this.anInt295 / 20 < local3) {
				local3 = this.anInt295 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass12Array1[local62] != null) {
					this.aClass12Array1[local62].anInt118 -= local3 * 20;
				}
			}
			if (this.anInt295 < this.anInt296) {
				this.anInt295 -= local3 * 20;
				this.anInt296 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("20858, " + -622 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGSVJLXG", name = "a", descriptor = "(II)Lclient!PKHWFJLM;")
	private Class5_Sub1_Sub4 method201(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method202(arg0);
			aClass5_Sub1_Sub4_3.anInt429 = 0;
			aClass5_Sub1_Sub4_3.method234(1380533830);
			aClass5_Sub1_Sub4_3.method235(local3 + 36);
			aClass5_Sub1_Sub4_3.method234(1463899717);
			aClass5_Sub1_Sub4_3.method234(1718449184);
			aClass5_Sub1_Sub4_3.method235(16);
			aClass5_Sub1_Sub4_3.method232(1);
			aClass5_Sub1_Sub4_3.method232(1);
			aClass5_Sub1_Sub4_3.method235(22050);
			aClass5_Sub1_Sub4_3.method235(22050);
			aClass5_Sub1_Sub4_3.method232(1);
			aClass5_Sub1_Sub4_3.method232(8);
			aClass5_Sub1_Sub4_3.method234(1684108385);
			aClass5_Sub1_Sub4_3.method235(local3);
			aClass5_Sub1_Sub4_3.anInt429 += local3;
			return aClass5_Sub1_Sub4_3;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("25784, " + 0 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NGSVJLXG", name = "b", descriptor = "(I)I")
	private int method202(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass12Array1[local5] != null && this.aClass12Array1[local5].anInt117 + this.aClass12Array1[local5].anInt118 > local3) {
				local3 = this.aClass12Array1[local5].anInt117 + this.aClass12Array1[local5].anInt118;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt295 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt296 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray15[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass12Array1[local106] != null) {
				local123 = this.aClass12Array1[local106].anInt117 * 22050 / 1000;
				local133 = this.aClass12Array1[local106].anInt118 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass12Array1[local106].method99(local123, this.aClass12Array1[local106].anInt117);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray15[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray15[local133 + local123] = aByteArray15[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray15[local147 + local123] = aByteArray15[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
