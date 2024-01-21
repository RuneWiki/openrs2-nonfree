import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CMHYVIXN")
public final class Class7 {

	@OriginalMember(owner = "client!CMHYVIXN", name = "c", descriptor = "Z")
	private static boolean aBoolean16;

	@OriginalMember(owner = "client!CMHYVIXN", name = "g", descriptor = "[B")
	private static byte[] aByteArray8;

	@OriginalMember(owner = "client!CMHYVIXN", name = "h", descriptor = "Lclient!GLMIQHJI;")
	private static Class8_Sub1_Sub3 aClass8_Sub1_Sub3_2;

	@OriginalMember(owner = "client!CMHYVIXN", name = "e", descriptor = "[Lclient!CMHYVIXN;")
	private static Class7[] aClass7Array1 = new Class7[5000];

	@OriginalMember(owner = "client!CMHYVIXN", name = "f", descriptor = "[I")
	public static int[] anIntArray18 = new int[5000];

	@OriginalMember(owner = "client!CMHYVIXN", name = "j", descriptor = "I")
	private int anInt110;

	@OriginalMember(owner = "client!CMHYVIXN", name = "k", descriptor = "I")
	private int anInt111;

	@OriginalMember(owner = "client!CMHYVIXN", name = "a", descriptor = "B")
	private byte aByte6 = -79;

	@OriginalMember(owner = "client!CMHYVIXN", name = "b", descriptor = "I")
	private int anInt109 = 5;

	@OriginalMember(owner = "client!CMHYVIXN", name = "d", descriptor = "Z")
	private boolean aBoolean17 = true;

	@OriginalMember(owner = "client!CMHYVIXN", name = "i", descriptor = "[Lclient!WLTAOGXS;")
	private Class41[] aClass41Array1 = new Class41[10];

	@OriginalMember(owner = "client!CMHYVIXN", name = "a", descriptor = "(ZLclient!GLMIQHJI;)V")
	public static void method32(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			aByteArray8 = new byte[441000];
			aClass8_Sub1_Sub3_2 = new Class8_Sub1_Sub3(aByteArray8, -49015);
			Class41.method524();
			while (true) {
				@Pc(20) int local20 = arg0.method167();
				if (local20 == 65535) {
					return;
				}
				aClass7Array1[local20] = new Class7((byte) 9);
				aClass7Array1[local20].method34((byte) 8, arg0);
				anIntArray18[local20] = aClass7Array1[local20].method35();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("87511, " + false + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMHYVIXN", name = "a", descriptor = "(III)Lclient!GLMIQHJI;")
	public static Class8_Sub1_Sub3 method33(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass7Array1[arg1] == null) {
				return null;
			} else {
				@Pc(15) Class7 local15 = aClass7Array1[arg1];
				return local15.method36(arg0);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("51993, " + arg0 + ", " + -740 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMHYVIXN", name = "<init>", descriptor = "(B)V")
	private Class7(@OriginalArg(0) byte arg0) {
		try {
			@Pc(19) boolean local19 = false;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("87483, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMHYVIXN", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	private void method34(@OriginalArg(0) byte arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg1.method165();
				if (local8 != 0) {
					arg1.anInt253--;
					this.aClass41Array1[local3] = new Class41();
					this.aClass41Array1[local3].method527((byte) 8, arg1);
				}
			}
			this.anInt110 = arg1.method167();
			@Pc(43) boolean local43 = false;
			this.anInt111 = arg1.method167();
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("86633, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMHYVIXN", name = "a", descriptor = "(I)I")
	private int method35() {
		try {
			@Pc(9) int local9 = 9999999;
			for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
				if (this.aClass41Array1[local11] != null && this.aClass41Array1[local11].anInt768 / 20 < local9) {
					local9 = this.aClass41Array1[local11].anInt768 / 20;
				}
			}
			if (this.anInt110 < this.anInt111 && this.anInt110 / 20 < local9) {
				local9 = this.anInt110 / 20;
			}
			if (local9 == 9999999 || local9 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass41Array1[local64] != null) {
					this.aClass41Array1[local64].anInt768 -= local9 * 20;
				}
			}
			if (this.anInt110 < this.anInt111) {
				this.anInt110 -= local9 * 20;
				this.anInt111 -= local9 * 20;
			}
			return local9;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("14635, " + 24288 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMHYVIXN", name = "a", descriptor = "(BI)Lclient!GLMIQHJI;")
	private Class8_Sub1_Sub3 method36(@OriginalArg(1) int arg0) {
		try {
			@Pc(9) int local9 = this.method37(arg0);
			aClass8_Sub1_Sub3_2.anInt253 = 0;
			aClass8_Sub1_Sub3_2.method159(1380533830);
			aClass8_Sub1_Sub3_2.method160(local9 + 36);
			aClass8_Sub1_Sub3_2.method159(1463899717);
			aClass8_Sub1_Sub3_2.method159(1718449184);
			aClass8_Sub1_Sub3_2.method160(16);
			aClass8_Sub1_Sub3_2.method157(this.aByte6, 1);
			aClass8_Sub1_Sub3_2.method157(this.aByte6, 1);
			aClass8_Sub1_Sub3_2.method160(22050);
			aClass8_Sub1_Sub3_2.method160(22050);
			aClass8_Sub1_Sub3_2.method157(this.aByte6, 1);
			aClass8_Sub1_Sub3_2.method157(this.aByte6, 8);
			aClass8_Sub1_Sub3_2.method159(1684108385);
			aClass8_Sub1_Sub3_2.method160(local9);
			aClass8_Sub1_Sub3_2.anInt253 += local9;
			return aClass8_Sub1_Sub3_2;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("53437, " + 126 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMHYVIXN", name = "b", descriptor = "(I)I")
	private int method37(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass41Array1[local5] != null && this.aClass41Array1[local5].anInt767 + this.aClass41Array1[local5].anInt768 > local3) {
				local3 = this.aClass41Array1[local5].anInt767 + this.aClass41Array1[local5].anInt768;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt110 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt111 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray8[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass41Array1[local106] != null) {
				local123 = this.aClass41Array1[local106].anInt767 * 22050 / 1000;
				local133 = this.aClass41Array1[local106].anInt768 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass41Array1[local106].method525(local123, this.aClass41Array1[local106].anInt767);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray8[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray8[local133 + local123] = aByteArray8[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray8[local147 + local123] = aByteArray8[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
