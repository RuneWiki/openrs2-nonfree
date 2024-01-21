import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MFQVDWNR")
public final class Class25 {

	@OriginalMember(owner = "client!MFQVDWNR", name = "g", descriptor = "[B")
	private static byte[] aByteArray11;

	@OriginalMember(owner = "client!MFQVDWNR", name = "h", descriptor = "Lclient!PQBRPYKE;")
	private static Class6_Sub1_Sub4 aClass6_Sub1_Sub4_4;

	@OriginalMember(owner = "client!MFQVDWNR", name = "d", descriptor = "Z")
	private static boolean aBoolean86 = true;

	@OriginalMember(owner = "client!MFQVDWNR", name = "e", descriptor = "[Lclient!MFQVDWNR;")
	private static Class25[] aClass25Array1 = new Class25[5000];

	@OriginalMember(owner = "client!MFQVDWNR", name = "f", descriptor = "[I")
	public static int[] anIntArray110 = new int[5000];

	@OriginalMember(owner = "client!MFQVDWNR", name = "j", descriptor = "I")
	private int anInt329;

	@OriginalMember(owner = "client!MFQVDWNR", name = "k", descriptor = "I")
	private int anInt330;

	@OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!MFQVDWNR", name = "b", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!MFQVDWNR", name = "c", descriptor = "B")
	private byte aByte23 = -99;

	@OriginalMember(owner = "client!MFQVDWNR", name = "i", descriptor = "[Lclient!QWSZQDKL;")
	private Class31[] aClass31Array1 = new Class31[10];

	@OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(BLclient!PQBRPYKE;)V")
	public static void method161(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			aByteArray11 = new byte[441000];
			aClass6_Sub1_Sub4_4 = new Class6_Sub1_Sub4(888, aByteArray11);
			Class31.method299();
			while (true) {
				@Pc(16) int local16 = arg0.method241();
				if (local16 == 65535) {
					return;
				}
				aClass25Array1[local16] = new Class25((byte) 125);
				aClass25Array1[local16].method163(arg0);
				anIntArray110[local16] = aClass25Array1[local16].method164();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("18174, " + -82 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(IBI)Lclient!PQBRPYKE;")
	public static Class6_Sub1_Sub4 method162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass25Array1[arg0] == null) {
				return null;
			} else {
				@Pc(16) Class25 local16 = aClass25Array1[arg0];
				return local16.method165(arg1);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("79138, " + arg0 + ", " + -75 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFQVDWNR", name = "<init>", descriptor = "(B)V")
	private Class25(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	private void method163(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method239();
				if (local6 != 0) {
					arg0.anInt390--;
					this.aClass31Array1[local1] = new Class31();
					this.aClass31Array1[local1].method302(arg0);
				}
			}
			this.anInt329 = arg0.method241();
			this.anInt330 = arg0.method241();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("52410, " + arg0 + ", " + false + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(Z)I")
	private int method164() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass31Array1[local5] != null && this.aClass31Array1[local5].anInt413 / 20 < local3) {
					local3 = this.aClass31Array1[local5].anInt413 / 20;
				}
			}
			if (this.anInt329 < this.anInt330 && this.anInt329 / 20 < local3) {
				local3 = this.anInt329 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass31Array1[local58] != null) {
					this.aClass31Array1[local58].anInt413 -= local3 * 20;
				}
			}
			if (this.anInt329 < this.anInt330) {
				this.anInt329 -= local3 * 20;
				this.anInt330 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("48604, " + false + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(ZI)Lclient!PQBRPYKE;")
	private Class6_Sub1_Sub4 method165(@OriginalArg(1) int arg0) {
		try {
			@Pc(13) int local13 = this.method166(arg0);
			aClass6_Sub1_Sub4_4.anInt390 = 0;
			aClass6_Sub1_Sub4_4.method233(1380533830);
			aClass6_Sub1_Sub4_4.method234(36 + local13);
			aClass6_Sub1_Sub4_4.method233(1463899717);
			aClass6_Sub1_Sub4_4.method233(1718449184);
			aClass6_Sub1_Sub4_4.method234(16);
			aClass6_Sub1_Sub4_4.method231(1);
			aClass6_Sub1_Sub4_4.method231(1);
			aClass6_Sub1_Sub4_4.method234(22050);
			aClass6_Sub1_Sub4_4.method234(22050);
			aClass6_Sub1_Sub4_4.method231(1);
			aClass6_Sub1_Sub4_4.method231(8);
			aClass6_Sub1_Sub4_4.method233(1684108385);
			aClass6_Sub1_Sub4_4.method234(local13);
			aClass6_Sub1_Sub4_4.anInt390 += local13;
			return aClass6_Sub1_Sub4_4;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("48689, " + true + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFQVDWNR", name = "a", descriptor = "(I)I")
	private int method166(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass31Array1[local5] != null && this.aClass31Array1[local5].anInt412 + this.aClass31Array1[local5].anInt413 > local3) {
				local3 = this.aClass31Array1[local5].anInt412 + this.aClass31Array1[local5].anInt413;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = 22050 * local3 / 1000;
		@Pc(58) int local58 = 22050 * this.anInt329 / 1000;
		@Pc(65) int local65 = 22050 * this.anInt330 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray11[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass31Array1[local106] != null) {
				local123 = this.aClass31Array1[local106].anInt412 * 22050 / 1000;
				local133 = this.aClass31Array1[local106].anInt413 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass31Array1[local106].method300(local123, this.aClass31Array1[local106].anInt412);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray11[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray11[local147 + local133 + 44] = (byte) local165;
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
				aByteArray11[local133 + local123] = aByteArray11[local133];
			}
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray11[local147 + local123] = aByteArray11[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
