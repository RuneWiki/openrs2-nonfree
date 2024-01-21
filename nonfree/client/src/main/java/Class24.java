import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MYEMYBYY")
public final class Class24 {

	@OriginalMember(owner = "client!MYEMYBYY", name = "e", descriptor = "[B")
	private static byte[] aByteArray12;

	@OriginalMember(owner = "client!MYEMYBYY", name = "f", descriptor = "Lclient!EYMNCFMK;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!MYEMYBYY", name = "c", descriptor = "[Lclient!MYEMYBYY;")
	private static Class24[] aClass24Array1 = new Class24[5000];

	@OriginalMember(owner = "client!MYEMYBYY", name = "d", descriptor = "[I")
	public static int[] anIntArray88 = new int[5000];

	@OriginalMember(owner = "client!MYEMYBYY", name = "h", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!MYEMYBYY", name = "i", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "I")
	private int anInt567 = -776;

	@OriginalMember(owner = "client!MYEMYBYY", name = "g", descriptor = "[Lclient!UJYLHBCS;")
	private Class40[] aClass40Array1 = new Class40[10];

	@OriginalMember(owner = "client!MYEMYBYY", name = "b", descriptor = "I")
	private int anInt568;

	@OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(Lclient!EYMNCFMK;Z)V")
	public static void method365(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray12 = new byte[441000];
			aClass1_Sub1_Sub3_3 = new Class1_Sub1_Sub3(aByteArray12, 0);
			Class40.method494();
			while (true) {
				@Pc(21) int local21 = arg0.method157();
				if (local21 == 65535) {
					return;
				}
				aClass24Array1[local21] = new Class24((byte) 38);
				aClass24Array1[local21].method367((byte) 5, arg0);
				anIntArray88[local21] = aClass24Array1[local21].method368();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("84536, " + arg0 + ", " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(IZI)Lclient!EYMNCFMK;")
	public static Class1_Sub1_Sub3 method366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass24Array1[arg0] == null) {
				return null;
			} else {
				@Pc(16) Class24 local16 = aClass24Array1[arg0];
				return local16.method369(arg1);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("24880, " + arg0 + ", " + true + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYEMYBYY", name = "<init>", descriptor = "(B)V")
	private Class24(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(BLclient!EYMNCFMK;)V")
	private void method367(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg1.method155();
				if (local8 != 0) {
					arg1.anInt301--;
					this.aClass40Array1[local3] = new Class40();
					this.aClass40Array1[local3].method497((byte) 5, arg1);
				}
			}
			this.anInt569 = arg1.method157();
			this.anInt570 = arg1.method157();
			@Pc(47) boolean local47 = false;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("84742, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(Z)I")
	private int method368() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(14) int local14 = 0; local14 < 10; local14++) {
				if (this.aClass40Array1[local14] != null && this.aClass40Array1[local14].anInt708 / 20 < local3) {
					local3 = this.aClass40Array1[local14].anInt708 / 20;
				}
			}
			if (this.anInt569 < this.anInt570 && this.anInt569 / 20 < local3) {
				local3 = this.anInt569 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
				if (this.aClass40Array1[local67] != null) {
					this.aClass40Array1[local67].anInt708 -= local3 * 20;
				}
			}
			if (this.anInt569 < this.anInt570) {
				this.anInt569 -= local3 * 20;
				this.anInt570 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("67200, " + true + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(II)Lclient!EYMNCFMK;")
	private Class1_Sub1_Sub3 method369(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method370(arg0);
			aClass1_Sub1_Sub3_3.anInt301 = 0;
			aClass1_Sub1_Sub3_3.method149(1380533830);
			aClass1_Sub1_Sub3_3.method150(local3 + 36, this.anInt567);
			aClass1_Sub1_Sub3_3.method149(1463899717);
			aClass1_Sub1_Sub3_3.method149(1718449184);
			aClass1_Sub1_Sub3_3.method150(16, this.anInt567);
			aClass1_Sub1_Sub3_3.method147(1);
			aClass1_Sub1_Sub3_3.method147(1);
			aClass1_Sub1_Sub3_3.method150(22050, this.anInt567);
			aClass1_Sub1_Sub3_3.method150(22050, this.anInt567);
			aClass1_Sub1_Sub3_3.method147(1);
			aClass1_Sub1_Sub3_3.method147(8);
			aClass1_Sub1_Sub3_3.method149(1684108385);
			aClass1_Sub1_Sub3_3.method150(local3, this.anInt567);
			aClass1_Sub1_Sub3_3.anInt301 += local3;
			return aClass1_Sub1_Sub3_3;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("97598, " + 29861 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MYEMYBYY", name = "a", descriptor = "(I)I")
	private int method370(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass40Array1[local5] != null && this.aClass40Array1[local5].anInt707 + this.aClass40Array1[local5].anInt708 > local3) {
				local3 = this.aClass40Array1[local5].anInt707 + this.aClass40Array1[local5].anInt708;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt569 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt570 * 22050 / 1000;
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
			if (this.aClass40Array1[local106] != null) {
				local123 = this.aClass40Array1[local106].anInt707 * 22050 / 1000;
				local133 = this.aClass40Array1[local106].anInt708 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass40Array1[local106].method495(local123, this.aClass40Array1[local106].anInt707);
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
