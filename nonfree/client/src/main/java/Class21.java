import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LOEGFAGM")
public final class Class21 {

	@OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "I")
	private static int anInt446;

	@OriginalMember(owner = "client!LOEGFAGM", name = "b", descriptor = "Z")
	private static boolean aBoolean99;

	@OriginalMember(owner = "client!LOEGFAGM", name = "g", descriptor = "[B")
	private static byte[] aByteArray12;

	@OriginalMember(owner = "client!LOEGFAGM", name = "h", descriptor = "Lclient!BFQIDHPO;")
	private static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!LOEGFAGM", name = "e", descriptor = "[Lclient!LOEGFAGM;")
	private static Class21[] aClass21Array1 = new Class21[5000];

	@OriginalMember(owner = "client!LOEGFAGM", name = "f", descriptor = "[I")
	public static int[] anIntArray61 = new int[5000];

	@OriginalMember(owner = "client!LOEGFAGM", name = "j", descriptor = "I")
	private int anInt447;

	@OriginalMember(owner = "client!LOEGFAGM", name = "k", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!LOEGFAGM", name = "c", descriptor = "Z")
	private boolean aBoolean100 = true;

	@OriginalMember(owner = "client!LOEGFAGM", name = "d", descriptor = "Z")
	private boolean aBoolean101 = true;

	@OriginalMember(owner = "client!LOEGFAGM", name = "i", descriptor = "[Lclient!VCSQFXER;")
	private Class38[] aClass38Array1 = new Class38[10];

	@OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(ZLclient!BFQIDHPO;)V")
	public static void method248(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			aByteArray12 = new byte[441000];
			aClass2_Sub1_Sub2_1 = new Class2_Sub1_Sub2(aByteArray12, -990);
			Class38.method484();
			while (true) {
				@Pc(16) int local16 = arg0.method81();
				if (local16 == 65535) {
					return;
				}
				aClass21Array1[local16] = new Class21(-11406);
				aClass21Array1[local16].method250(arg0);
				anIntArray61[local16] = aClass21Array1[local16].method251(aBoolean99);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("54466, " + true + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(III)Lclient!BFQIDHPO;")
	public static Class2_Sub1_Sub2 method249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			if (aClass21Array1[arg1] == null) {
				return null;
			} else {
				@Pc(11) Class21 local11 = aClass21Array1[arg1];
				return local11.method252(arg0);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("61672, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOEGFAGM", name = "<init>", descriptor = "(I)V")
	private Class21(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	private void method250(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg0.method79();
				if (local8 != 0) {
					arg0.anInt123--;
					this.aClass38Array1[local3] = new Class38();
					this.aClass38Array1[local3].method487(arg0);
				}
			}
			this.anInt447 = arg0.method81();
			this.anInt448 = arg0.method81();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("38666, " + -11 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(Z)I")
	private int method251(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				return anInt446;
			}
			@Pc(7) int local7 = 9999999;
			for (@Pc(9) int local9 = 0; local9 < 10; local9++) {
				if (this.aClass38Array1[local9] != null && this.aClass38Array1[local9].anInt722 / 20 < local7) {
					local7 = this.aClass38Array1[local9].anInt722 / 20;
				}
			}
			if (this.anInt447 < this.anInt448 && this.anInt447 / 20 < local7) {
				local7 = this.anInt447 / 20;
			}
			if (local7 == 9999999 || local7 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass38Array1[local62] != null) {
					this.aClass38Array1[local62].anInt722 -= local7 * 20;
				}
			}
			if (this.anInt447 < this.anInt448) {
				this.anInt447 -= local7 * 20;
				this.anInt448 -= local7 * 20;
			}
			return local7;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("50712, " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(ZI)Lclient!BFQIDHPO;")
	private Class2_Sub1_Sub2 method252(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method253(arg0);
			aClass2_Sub1_Sub2_1.anInt123 = 0;
			aClass2_Sub1_Sub2_1.method73(1380533830);
			aClass2_Sub1_Sub2_1.method74(local3 + 36);
			aClass2_Sub1_Sub2_1.method73(1463899717);
			aClass2_Sub1_Sub2_1.method73(1718449184);
			aClass2_Sub1_Sub2_1.method74(16);
			aClass2_Sub1_Sub2_1.method71(1);
			aClass2_Sub1_Sub2_1.method71(1);
			aClass2_Sub1_Sub2_1.method74(22050);
			aClass2_Sub1_Sub2_1.method74(22050);
			aClass2_Sub1_Sub2_1.method71(1);
			aClass2_Sub1_Sub2_1.method71(8);
			aClass2_Sub1_Sub2_1.method73(1684108385);
			aClass2_Sub1_Sub2_1.method74(local3);
			aClass2_Sub1_Sub2_1.anInt123 += local3;
			return aClass2_Sub1_Sub2_1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("4412, " + true + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LOEGFAGM", name = "a", descriptor = "(I)I")
	private int method253(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass38Array1[local5] != null && this.aClass38Array1[local5].anInt721 + this.aClass38Array1[local5].anInt722 > local3) {
				local3 = this.aClass38Array1[local5].anInt721 + this.aClass38Array1[local5].anInt722;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt447 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt448 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray12[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass38Array1[local106] != null) {
				local123 = this.aClass38Array1[local106].anInt721 * 22050 / 1000;
				local133 = this.aClass38Array1[local106].anInt722 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass38Array1[local106].method485(local123, this.aClass38Array1[local106].anInt721);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray12[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray12[local147 + local133 + 44] = (byte) local165;
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
				aByteArray12[local133 + local123] = aByteArray12[local133];
			}
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray12[local147 + local123] = aByteArray12[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
