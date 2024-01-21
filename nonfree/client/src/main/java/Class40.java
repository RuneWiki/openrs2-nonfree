import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VYSYBHPS")
public final class Class40 {

	@OriginalMember(owner = "client!VYSYBHPS", name = "f", descriptor = "[B")
	private static byte[] aByteArray14;

	@OriginalMember(owner = "client!VYSYBHPS", name = "g", descriptor = "Lclient!GHHPHSRU;")
	private static Class3_Sub1_Sub2 aClass3_Sub1_Sub2_4;

	@OriginalMember(owner = "client!VYSYBHPS", name = "a", descriptor = "I")
	private static int anInt734 = 8;

	@OriginalMember(owner = "client!VYSYBHPS", name = "d", descriptor = "[Lclient!VYSYBHPS;")
	private static Class40[] aClass40Array1 = new Class40[5000];

	@OriginalMember(owner = "client!VYSYBHPS", name = "e", descriptor = "[I")
	public static int[] anIntArray187 = new int[5000];

	@OriginalMember(owner = "client!VYSYBHPS", name = "i", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!VYSYBHPS", name = "j", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!VYSYBHPS", name = "b", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!VYSYBHPS", name = "c", descriptor = "B")
	private byte aByte31 = 64;

	@OriginalMember(owner = "client!VYSYBHPS", name = "h", descriptor = "[Lclient!UFBSEXDM;")
	private Class33[] aClass33Array1 = new Class33[10];

	@OriginalMember(owner = "client!VYSYBHPS", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	public static void method494(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			aByteArray14 = new byte[441000];
			aClass3_Sub1_Sub2_4 = new Class3_Sub1_Sub2(-527, aByteArray14);
			Class33.method462();
			while (true) {
				@Pc(25) int local25 = arg0.method91();
				if (local25 == 65535) {
					return;
				}
				aClass40Array1[local25] = new Class40(4);
				aClass40Array1[local25].method496(arg0);
				anIntArray187[local25] = aClass40Array1[local25].method497();
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("18523, " + arg0 + ", " + 1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYSYBHPS", name = "a", descriptor = "(III)Lclient!GHHPHSRU;")
	public static Class3_Sub1_Sub2 method495(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass40Array1[arg1] == null) {
				return null;
			} else {
				@Pc(13) Class40 local13 = aClass40Array1[arg1];
				return local13.method498(arg0);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("54142, " + arg0 + ", " + -960 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYSYBHPS", name = "<init>", descriptor = "(I)V")
	private Class40(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!VYSYBHPS", name = "b", descriptor = "(Lclient!GHHPHSRU;I)V")
	private void method496(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
				@Pc(12) int local12 = arg0.method89();
				if (local12 != 0) {
					arg0.anInt257--;
					this.aClass33Array1[local7] = new Class33();
					this.aClass33Array1[local7].method465(arg0);
				}
			}
			this.anInt735 = arg0.method91();
			this.anInt736 = arg0.method91();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("49160, " + arg0 + ", " + 0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYSYBHPS", name = "a", descriptor = "(I)I")
	private int method497() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass33Array1[local5] != null && this.aClass33Array1[local5].anInt695 / 20 < local3) {
					local3 = this.aClass33Array1[local5].anInt695 / 20;
				}
			}
			if (this.anInt735 < this.anInt736 && this.anInt735 / 20 < local3) {
				local3 = this.anInt735 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(69) int local69 = 0; local69 < 10; local69++) {
				if (this.aClass33Array1[local69] != null) {
					this.aClass33Array1[local69].anInt695 -= local3 * 20;
				}
			}
			if (this.anInt735 < this.anInt736) {
				this.anInt735 -= local3 * 20;
				this.anInt736 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("27347, " + -7091 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYSYBHPS", name = "a", descriptor = "(IZ)Lclient!GHHPHSRU;")
	private Class3_Sub1_Sub2 method498(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method499(arg0);
			aClass3_Sub1_Sub2_4.anInt257 = 0;
			aClass3_Sub1_Sub2_4.method83(1380533830);
			aClass3_Sub1_Sub2_4.method84(local3 + 36);
			aClass3_Sub1_Sub2_4.method83(1463899717);
			aClass3_Sub1_Sub2_4.method83(1718449184);
			aClass3_Sub1_Sub2_4.method84(16);
			aClass3_Sub1_Sub2_4.method81(1);
			aClass3_Sub1_Sub2_4.method81(1);
			aClass3_Sub1_Sub2_4.method84(22050);
			aClass3_Sub1_Sub2_4.method84(22050);
			aClass3_Sub1_Sub2_4.method81(1);
			aClass3_Sub1_Sub2_4.method81(8);
			aClass3_Sub1_Sub2_4.method83(1684108385);
			aClass3_Sub1_Sub2_4.method84(local3);
			aClass3_Sub1_Sub2_4.anInt257 += local3;
			return aClass3_Sub1_Sub2_4;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("80386, " + arg0 + ", " + true + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYSYBHPS", name = "b", descriptor = "(I)I")
	private int method499(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass33Array1[local5] != null && this.aClass33Array1[local5].anInt694 + this.aClass33Array1[local5].anInt695 > local3) {
				local3 = this.aClass33Array1[local5].anInt694 + this.aClass33Array1[local5].anInt695;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt735 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt736 * 22050 / 1000;
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
			if (this.aClass33Array1[local106] != null) {
				local123 = this.aClass33Array1[local106].anInt694 * 22050 / 1000;
				local133 = this.aClass33Array1[local106].anInt695 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass33Array1[local106].method463(local123, this.aClass33Array1[local106].anInt694);
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
