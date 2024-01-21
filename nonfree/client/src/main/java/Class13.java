import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HNYSLMKN")
public final class Class13 {

	@OriginalMember(owner = "client!HNYSLMKN", name = "e", descriptor = "[B")
	private static byte[] aByteArray6;

	@OriginalMember(owner = "client!HNYSLMKN", name = "f", descriptor = "Lclient!UAWAYCTK;")
	private static Class6_Sub2_Sub3 aClass6_Sub2_Sub3_3;

	@OriginalMember(owner = "client!HNYSLMKN", name = "c", descriptor = "[Lclient!HNYSLMKN;")
	private static Class13[] aClass13Array1 = new Class13[5000];

	@OriginalMember(owner = "client!HNYSLMKN", name = "d", descriptor = "[I")
	public static int[] anIntArray37 = new int[5000];

	@OriginalMember(owner = "client!HNYSLMKN", name = "h", descriptor = "I")
	private int anInt107;

	@OriginalMember(owner = "client!HNYSLMKN", name = "i", descriptor = "I")
	private int anInt108;

	@OriginalMember(owner = "client!HNYSLMKN", name = "a", descriptor = "I")
	private int anInt106 = -883;

	@OriginalMember(owner = "client!HNYSLMKN", name = "b", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!HNYSLMKN", name = "g", descriptor = "[Lclient!VUJNNHKQ;")
	private Class43[] aClass43Array1 = new Class43[10];

	@OriginalMember(owner = "client!HNYSLMKN", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	public static void method89(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			aByteArray6 = new byte[441000];
			aClass6_Sub2_Sub3_3 = new Class6_Sub2_Sub3(741, aByteArray6);
			Class43.method470();
			while (true) {
				@Pc(15) int local15 = arg0.method404();
				if (local15 == 65535) {
					return;
				}
				aClass13Array1[local15] = new Class13(-505);
				aClass13Array1[local15].method91(arg0);
				anIntArray37[local15] = aClass13Array1[local15].method92();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("57773, " + 0 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNYSLMKN", name = "a", descriptor = "(IZI)Lclient!UAWAYCTK;")
	public static Class6_Sub2_Sub3 method90(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass13Array1[arg0] == null) {
				return null;
			} else {
				@Pc(13) Class13 local13 = aClass13Array1[arg0];
				return local13.method93(arg1);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("78132, " + arg0 + ", " + true + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNYSLMKN", name = "<init>", descriptor = "(I)V")
	private Class13(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!HNYSLMKN", name = "b", descriptor = "(ILclient!UAWAYCTK;)V")
	private void method91(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg0.method402();
				if (local8 != 0) {
					arg0.anInt609--;
					this.aClass43Array1[local3] = new Class43();
					this.aClass43Array1[local3].method473(arg0);
				}
			}
			this.anInt107 = arg0.method404();
			this.anInt108 = arg0.method404();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("7515, " + -7321 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNYSLMKN", name = "a", descriptor = "(I)I")
	private int method92() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
				if (this.aClass43Array1[local17] != null && this.aClass43Array1[local17].anInt703 / 20 < local3) {
					local3 = this.aClass43Array1[local17].anInt703 / 20;
				}
			}
			if (this.anInt107 < this.anInt108 && this.anInt107 / 20 < local3) {
				local3 = this.anInt107 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(70) int local70 = 0; local70 < 10; local70++) {
				if (this.aClass43Array1[local70] != null) {
					this.aClass43Array1[local70].anInt703 -= local3 * 20;
				}
			}
			if (this.anInt107 < this.anInt108) {
				this.anInt107 -= local3 * 20;
				this.anInt108 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("80419, " + -608 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNYSLMKN", name = "a", descriptor = "(II)Lclient!UAWAYCTK;")
	private Class6_Sub2_Sub3 method93(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method94(arg0);
			aClass6_Sub2_Sub3_3.anInt609 = 0;
			aClass6_Sub2_Sub3_3.method396(1380533830);
			aClass6_Sub2_Sub3_3.method397(this.anInt106, local3 + 36);
			aClass6_Sub2_Sub3_3.method396(1463899717);
			aClass6_Sub2_Sub3_3.method396(1718449184);
			aClass6_Sub2_Sub3_3.method397(this.anInt106, 16);
			aClass6_Sub2_Sub3_3.method394(1);
			aClass6_Sub2_Sub3_3.method394(1);
			aClass6_Sub2_Sub3_3.method397(this.anInt106, 22050);
			aClass6_Sub2_Sub3_3.method397(this.anInt106, 22050);
			aClass6_Sub2_Sub3_3.method394(1);
			aClass6_Sub2_Sub3_3.method394(8);
			aClass6_Sub2_Sub3_3.method396(1684108385);
			aClass6_Sub2_Sub3_3.method397(this.anInt106, local3);
			aClass6_Sub2_Sub3_3.anInt609 += local3;
			return aClass6_Sub2_Sub3_3;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("62685, " + 0 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HNYSLMKN", name = "b", descriptor = "(I)I")
	private int method94(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass43Array1[local5] != null && this.aClass43Array1[local5].anInt702 + this.aClass43Array1[local5].anInt703 > local3) {
				local3 = this.aClass43Array1[local5].anInt702 + this.aClass43Array1[local5].anInt703;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt107 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt108 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray6[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass43Array1[local106] != null) {
				local123 = this.aClass43Array1[local106].anInt702 * 22050 / 1000;
				local133 = this.aClass43Array1[local106].anInt703 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass43Array1[local106].method471(local123, this.aClass43Array1[local106].anInt702);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray6[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray6[local133 + local123] = aByteArray6[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray6[local147 + local123] = aByteArray6[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
