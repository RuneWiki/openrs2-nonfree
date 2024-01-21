import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class43 {

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private static boolean aBoolean165;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_23;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private static int anInt891 = 3;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "I")
	private static int anInt892 = 754;

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "[Lclient!yb;")
	private static Class43[] aClass43Array1 = new Class43[1000];

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[I")
	public static int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!yb", name = "j", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "[Lclient!zb;")
	private Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method553(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			aByteArray15 = new byte[441000];
			aClass1_Sub3_Sub3_23 = new Class1_Sub3_Sub3(0, aByteArray15);
			Class44.method567();
			@Pc(17) int local17;
			if (anInt891 > 3 || anInt891 < 3) {
				for (local17 = 1; local17 > 0; local17++) {
				}
			}
			while (true) {
				local17 = arg0.method385();
				if (local17 == 65535) {
					return;
				}
				aClass43Array1[local17] = new Class43();
				aClass43Array1[local17].method555(arg0);
				anIntArray231[local17] = aClass43Array1[local17].method556();
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("71304, " + arg0 + ", " + 3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(III)Lclient!kb;")
	public static Class1_Sub3_Sub3 method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg2 <= 0) {
				aBoolean165 = !aBoolean165;
			}
			if (aClass43Array1[arg0] == null) {
				return null;
			} else {
				@Pc(15) Class43 local15 = aClass43Array1[arg0];
				return local15.method557(arg1);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("5407, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(Lclient!kb;I)V")
	private void method555(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg0.method383();
				if (local8 != 0) {
					arg0.anInt566--;
					this.aClass44Array1[local3] = new Class44();
					this.aClass44Array1[local3].method570(arg0);
				}
			}
			this.anInt893 = arg0.method385();
			this.anInt894 = arg0.method385();
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("57383, " + arg0 + ", " + 0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(B)I")
	private int method556() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt961 / 20 < local3) {
					local3 = this.aClass44Array1[local5].anInt961 / 20;
				}
			}
			if (this.anInt893 < this.anInt894 && this.anInt893 / 20 < local3) {
				local3 = this.anInt893 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass44Array1[local58] != null) {
					this.aClass44Array1[local58].anInt961 -= local3 * 20;
				}
			}
			if (this.anInt893 < this.anInt894) {
				this.anInt893 -= local3 * 20;
				this.anInt894 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("74120, " + 3 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(II)Lclient!kb;")
	private Class1_Sub3_Sub3 method557(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method558(arg0);
			aClass1_Sub3_Sub3_23.anInt566 = 0;
			aClass1_Sub3_Sub3_23.method377(1380533830);
			aClass1_Sub3_Sub3_23.method378(local3 + 36);
			aClass1_Sub3_Sub3_23.method377(1463899717);
			aClass1_Sub3_Sub3_23.method377(1718449184);
			aClass1_Sub3_Sub3_23.method378(16);
			aClass1_Sub3_Sub3_23.method375(1);
			aClass1_Sub3_Sub3_23.method375(1);
			aClass1_Sub3_Sub3_23.method378(22050);
			aClass1_Sub3_Sub3_23.method378(22050);
			aClass1_Sub3_Sub3_23.method375(1);
			aClass1_Sub3_Sub3_23.method375(8);
			aClass1_Sub3_Sub3_23.method377(1684108385);
			aClass1_Sub3_Sub3_23.method378(local3);
			aClass1_Sub3_Sub3_23.anInt566 += local3;
			return aClass1_Sub3_Sub3_23;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("22891, " + -32269 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)I")
	private int method558(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt960 + this.aClass44Array1[local5].anInt961 > local3) {
				local3 = this.aClass44Array1[local5].anInt960 + this.aClass44Array1[local5].anInt961;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt893 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt894 * 22050 / 1000;
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
			if (this.aClass44Array1[local106] != null) {
				local123 = this.aClass44Array1[local106].anInt960 * 22050 / 1000;
				local133 = this.aClass44Array1[local106].anInt961 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass44Array1[local106].method568(local123, this.aClass44Array1[local106].anInt960);
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
