import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MDGCJDZI")
public final class Class23 {

	@OriginalMember(owner = "client!MDGCJDZI", name = "b", descriptor = "I")
	private static int anInt367;

	@OriginalMember(owner = "client!MDGCJDZI", name = "g", descriptor = "[B")
	private static byte[] aByteArray5;

	@OriginalMember(owner = "client!MDGCJDZI", name = "h", descriptor = "Lclient!NQUAUMDT;")
	private static Class6_Sub2_Sub3 aClass6_Sub2_Sub3_3;

	@OriginalMember(owner = "client!MDGCJDZI", name = "e", descriptor = "[Lclient!MDGCJDZI;")
	private static Class23[] aClass23Array1 = new Class23[5000];

	@OriginalMember(owner = "client!MDGCJDZI", name = "f", descriptor = "[I")
	public static int[] anIntArray113 = new int[5000];

	@OriginalMember(owner = "client!MDGCJDZI", name = "j", descriptor = "I")
	private int anInt369;

	@OriginalMember(owner = "client!MDGCJDZI", name = "k", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!MDGCJDZI", name = "c", descriptor = "I")
	private int anInt368 = 7;

	@OriginalMember(owner = "client!MDGCJDZI", name = "d", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!MDGCJDZI", name = "i", descriptor = "[Lclient!FMKSNCAT;")
	private Class11[] aClass11Array1 = new Class11[10];

	@OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(Lclient!NQUAUMDT;I)V")
	public static void method179(@OriginalArg(0) Class6_Sub2_Sub3 arg0) {
		try {
			aByteArray5 = new byte[441000];
			aClass6_Sub2_Sub3_3 = new Class6_Sub2_Sub3(-587, aByteArray5);
			Class11.method106();
			while (true) {
				@Pc(16) int local16 = arg0.method264();
				if (local16 == 65535) {
					return;
				}
				aClass23Array1[local16] = new Class23(7);
				aClass23Array1[local16].method181(arg0);
				anIntArray113[local16] = aClass23Array1[local16].method182();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("34351, " + arg0 + ", " + -332 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(IIZ)Lclient!NQUAUMDT;")
	public static Class6_Sub2_Sub3 method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass23Array1[arg0] == null) {
				return null;
			} else {
				@Pc(13) Class23 local13 = aClass23Array1[arg0];
				return local13.method183(arg1);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("40641, " + arg0 + ", " + arg1 + ", " + false + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDGCJDZI", name = "<init>", descriptor = "(I)V")
	private Class23(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt368) {
				this.aBoolean108 = !this.aBoolean108;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("15606, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	private void method181(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			for (@Pc(13) int local13 = 0; local13 < 10; local13++) {
				@Pc(18) int local18 = arg0.method262();
				if (local18 != 0) {
					arg0.anInt404--;
					this.aClass11Array1[local13] = new Class11();
					this.aClass11Array1[local13].method109(arg0);
				}
			}
			this.anInt369 = arg0.method264();
			this.anInt370 = arg0.method264();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("49584, " + 6 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(I)I")
	private int method182() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass11Array1[local5] != null && this.aClass11Array1[local5].anInt235 / 20 < local3) {
					local3 = this.aClass11Array1[local5].anInt235 / 20;
				}
			}
			if (this.anInt369 < this.anInt370 && this.anInt369 / 20 < local3) {
				local3 = this.anInt369 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass11Array1[local58] != null) {
					this.aClass11Array1[local58].anInt235 -= local3 * 20;
				}
			}
			if (this.anInt369 < this.anInt370) {
				this.anInt369 -= local3 * 20;
				this.anInt370 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("8586, " + -667 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDGCJDZI", name = "a", descriptor = "(BI)Lclient!NQUAUMDT;")
	private Class6_Sub2_Sub3 method183(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method184(arg0);
			aClass6_Sub2_Sub3_3.anInt404 = 0;
			aClass6_Sub2_Sub3_3.method256(1380533830);
			aClass6_Sub2_Sub3_3.method257(local3 + 36);
			aClass6_Sub2_Sub3_3.method256(1463899717);
			aClass6_Sub2_Sub3_3.method256(1718449184);
			aClass6_Sub2_Sub3_3.method257(16);
			aClass6_Sub2_Sub3_3.method254(1);
			aClass6_Sub2_Sub3_3.method254(1);
			aClass6_Sub2_Sub3_3.method257(22050);
			aClass6_Sub2_Sub3_3.method257(22050);
			aClass6_Sub2_Sub3_3.method254(1);
			aClass6_Sub2_Sub3_3.method254(8);
			aClass6_Sub2_Sub3_3.method256(1684108385);
			aClass6_Sub2_Sub3_3.method257(local3);
			aClass6_Sub2_Sub3_3.anInt404 += local3;
			return aClass6_Sub2_Sub3_3;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("16904, " + -67 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MDGCJDZI", name = "b", descriptor = "(I)I")
	private int method184(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass11Array1[local5] != null && this.aClass11Array1[local5].anInt234 + this.aClass11Array1[local5].anInt235 > local3) {
				local3 = this.aClass11Array1[local5].anInt234 + this.aClass11Array1[local5].anInt235;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt369 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt370 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray5[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass11Array1[local106] != null) {
				local123 = this.aClass11Array1[local106].anInt234 * 22050 / 1000;
				local133 = this.aClass11Array1[local106].anInt235 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass11Array1[local106].method107(local123, this.aClass11Array1[local106].anInt234);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray5[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray5[local133 + local123] = aByteArray5[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray5[local147 + local123] = aByteArray5[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
