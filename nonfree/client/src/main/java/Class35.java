import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SHTECHVG")
public final class Class35 {

	@OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "Z")
	private static boolean aBoolean140;

	@OriginalMember(owner = "client!SHTECHVG", name = "h", descriptor = "[B")
	private static byte[] aByteArray14;

	@OriginalMember(owner = "client!SHTECHVG", name = "i", descriptor = "Lclient!TKPFKOXP;")
	private static Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!SHTECHVG", name = "b", descriptor = "Z")
	private static boolean aBoolean141 = true;

	@OriginalMember(owner = "client!SHTECHVG", name = "f", descriptor = "[Lclient!SHTECHVG;")
	private static Class35[] aClass35Array1 = new Class35[5000];

	@OriginalMember(owner = "client!SHTECHVG", name = "g", descriptor = "[I")
	public static int[] anIntArray158 = new int[5000];

	@OriginalMember(owner = "client!SHTECHVG", name = "k", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!SHTECHVG", name = "l", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!SHTECHVG", name = "c", descriptor = "I")
	private int anInt533 = -223;

	@OriginalMember(owner = "client!SHTECHVG", name = "d", descriptor = "I")
	private int anInt534 = -340;

	@OriginalMember(owner = "client!SHTECHVG", name = "e", descriptor = "I")
	private int anInt535 = 577;

	@OriginalMember(owner = "client!SHTECHVG", name = "j", descriptor = "[Lclient!DWRVLVYL;")
	private Class8[] aClass8Array1 = new Class8[10];

	@OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(BLclient!TKPFKOXP;)V")
	public static void method428(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			aByteArray14 = new byte[441000];
			aClass2_Sub1_Sub4_1 = new Class2_Sub1_Sub4(859, aByteArray14);
			Class8.method61();
			while (true) {
				@Pc(21) int local21 = arg0.method494();
				if (local21 == 65535) {
					return;
				}
				aClass35Array1[local21] = new Class35(false);
				aClass35Array1[local21].method430(arg0);
				anIntArray158[local21] = aClass35Array1[local21].method431();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("23763, " + -3 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(IIZ)Lclient!TKPFKOXP;")
	public static Class2_Sub1_Sub4 method429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass35Array1[arg1] == null) {
				return null;
			} else {
				@Pc(16) Class35 local16 = aClass35Array1[arg1];
				return local16.method432(arg0);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("4256, " + arg0 + ", " + arg1 + ", " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHTECHVG", name = "<init>", descriptor = "(Z)V")
	private Class35(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(Lclient!TKPFKOXP;B)V")
	private void method430(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method492();
				if (local6 != 0) {
					arg0.anInt672--;
					this.aClass8Array1[local1] = new Class8();
					this.aClass8Array1[local1].method64(arg0);
				}
			}
			this.anInt536 = arg0.method494();
			this.anInt537 = arg0.method494();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("24370, " + arg0 + ", " + 4 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(I)I")
	private int method431() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass8Array1[local5] != null && this.aClass8Array1[local5].anInt145 / 20 < local3) {
					local3 = this.aClass8Array1[local5].anInt145 / 20;
				}
			}
			if (this.anInt536 < this.anInt537 && this.anInt536 / 20 < local3) {
				local3 = this.anInt536 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass8Array1[local64] != null) {
					this.aClass8Array1[local64].anInt145 -= local3 * 20;
				}
			}
			if (this.anInt536 < this.anInt537) {
				this.anInt536 -= local3 * 20;
				this.anInt537 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("44032, " + 31724 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHTECHVG", name = "a", descriptor = "(IZ)Lclient!TKPFKOXP;")
	private Class2_Sub1_Sub4 method432(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method433(arg0);
			aClass2_Sub1_Sub4_1.anInt672 = 0;
			aClass2_Sub1_Sub4_1.method486(1380533830);
			aClass2_Sub1_Sub4_1.method487(local3 + 36);
			aClass2_Sub1_Sub4_1.method486(1463899717);
			aClass2_Sub1_Sub4_1.method486(1718449184);
			aClass2_Sub1_Sub4_1.method487(16);
			aClass2_Sub1_Sub4_1.method484(1);
			aClass2_Sub1_Sub4_1.method484(1);
			aClass2_Sub1_Sub4_1.method487(22050);
			aClass2_Sub1_Sub4_1.method487(22050);
			aClass2_Sub1_Sub4_1.method484(1);
			aClass2_Sub1_Sub4_1.method484(8);
			aClass2_Sub1_Sub4_1.method486(1684108385);
			aClass2_Sub1_Sub4_1.method487(local3);
			aClass2_Sub1_Sub4_1.anInt672 += local3;
			return aClass2_Sub1_Sub4_1;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("46647, " + arg0 + ", " + false + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHTECHVG", name = "b", descriptor = "(I)I")
	private int method433(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass8Array1[local5] != null && this.aClass8Array1[local5].anInt144 + this.aClass8Array1[local5].anInt145 > local3) {
				local3 = this.aClass8Array1[local5].anInt144 + this.aClass8Array1[local5].anInt145;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt536 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt537 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray14[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass8Array1[local106] != null) {
				local123 = this.aClass8Array1[local106].anInt144 * 22050 / 1000;
				local133 = this.aClass8Array1[local106].anInt145 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass8Array1[local106].method62(local123, this.aClass8Array1[local106].anInt144);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray14[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray14[local133 + local123] = aByteArray14[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray14[local147 + local123] = aByteArray14[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
