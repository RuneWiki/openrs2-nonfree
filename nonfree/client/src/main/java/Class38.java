import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VKAZQVPD")
public final class Class38 {

	@OriginalMember(owner = "client!VKAZQVPD", name = "e", descriptor = "[B")
	private static byte[] aByteArray19;

	@OriginalMember(owner = "client!VKAZQVPD", name = "f", descriptor = "Lclient!WBEWPIXO;")
	private static Class3_Sub3_Sub4 aClass3_Sub3_Sub4_5;

	@OriginalMember(owner = "client!VKAZQVPD", name = "b", descriptor = "I")
	private static int anInt727 = 1;

	@OriginalMember(owner = "client!VKAZQVPD", name = "c", descriptor = "[Lclient!VKAZQVPD;")
	private static Class38[] aClass38Array1 = new Class38[5000];

	@OriginalMember(owner = "client!VKAZQVPD", name = "d", descriptor = "[I")
	public static int[] anIntArray188 = new int[5000];

	@OriginalMember(owner = "client!VKAZQVPD", name = "h", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!VKAZQVPD", name = "i", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "I")
	private int anInt726 = 787;

	@OriginalMember(owner = "client!VKAZQVPD", name = "g", descriptor = "[Lclient!OBDRPXUY;")
	private Class27[] aClass27Array1 = new Class27[10];

	@OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	public static void method448(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			aByteArray19 = new byte[441000];
			aClass3_Sub3_Sub4_5 = new Class3_Sub3_Sub4((byte) -115, aByteArray19);
			Class27.method235();
			while (true) {
				@Pc(21) int local21 = arg0.method470();
				if (local21 == 65535) {
					return;
				}
				aClass38Array1[local21] = new Class38((byte) 80);
				aClass38Array1[local21].method450(arg0, 767);
				anIntArray188[local21] = aClass38Array1[local21].method451(anInt727);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("35714, " + arg0 + ", " + 713 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(III)Lclient!WBEWPIXO;")
	public static Class3_Sub3_Sub4 method449(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass38Array1[arg1] == null) {
				return null;
			} else {
				@Pc(16) Class38 local16 = aClass38Array1[arg1];
				return local16.method452(arg0);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("95504, " + -95 + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VKAZQVPD", name = "<init>", descriptor = "(B)V")
	private Class38(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!VKAZQVPD", name = "b", descriptor = "(Lclient!WBEWPIXO;I)V")
	private void method450(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				@Pc(10) int local10 = arg0.method468();
				if (local10 != 0) {
					arg0.anInt738--;
					this.aClass27Array1[local5] = new Class27();
					this.aClass27Array1[local5].method238(arg0, 767);
				}
			}
			this.anInt728 = arg0.method470();
			this.anInt729 = arg0.method470();
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("19895, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(I)I")
	private int method451(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass27Array1[local5] != null && this.aClass27Array1[local5].anInt418 / 20 < local3) {
					local3 = this.aClass27Array1[local5].anInt418 / 20;
				}
			}
			if (arg0 != anInt727) {
				return 3;
			}
			if (this.anInt728 < this.anInt729 && this.anInt728 / 20 < local3) {
				local3 = this.anInt728 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass27Array1[local63] != null) {
					this.aClass27Array1[local63].anInt418 -= local3 * 20;
				}
			}
			if (this.anInt728 < this.anInt729) {
				this.anInt728 -= local3 * 20;
				this.anInt729 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("20075, " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VKAZQVPD", name = "a", descriptor = "(IZ)Lclient!WBEWPIXO;")
	private Class3_Sub3_Sub4 method452(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method453(arg0);
			aClass3_Sub3_Sub4_5.anInt738 = 0;
			aClass3_Sub3_Sub4_5.method462(1380533830);
			aClass3_Sub3_Sub4_5.method463(local3 + 36);
			aClass3_Sub3_Sub4_5.method462(1463899717);
			aClass3_Sub3_Sub4_5.method462(1718449184);
			aClass3_Sub3_Sub4_5.method463(16);
			aClass3_Sub3_Sub4_5.method460(1);
			aClass3_Sub3_Sub4_5.method460(1);
			aClass3_Sub3_Sub4_5.method463(22050);
			aClass3_Sub3_Sub4_5.method463(22050);
			aClass3_Sub3_Sub4_5.method460(1);
			aClass3_Sub3_Sub4_5.method460(8);
			aClass3_Sub3_Sub4_5.method462(1684108385);
			aClass3_Sub3_Sub4_5.method463(local3);
			aClass3_Sub3_Sub4_5.anInt738 += local3;
			return aClass3_Sub3_Sub4_5;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("29745, " + arg0 + ", " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VKAZQVPD", name = "b", descriptor = "(I)I")
	private int method453(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass27Array1[local5] != null && this.aClass27Array1[local5].anInt417 + this.aClass27Array1[local5].anInt418 > local3) {
				local3 = this.aClass27Array1[local5].anInt417 + this.aClass27Array1[local5].anInt418;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt728 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt729 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray19[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass27Array1[local106] != null) {
				local123 = this.aClass27Array1[local106].anInt417 * 22050 / 1000;
				local133 = this.aClass27Array1[local106].anInt418 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass27Array1[local106].method236(local123, this.aClass27Array1[local106].anInt417);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray19[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray19[local147 + local133 + 44] = (byte) local165;
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
				aByteArray19[local133 + local123] = aByteArray19[local133];
			}
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray19[local147 + local123] = aByteArray19[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
