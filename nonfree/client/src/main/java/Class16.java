import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JRSHCCMF")
public final class Class16 {

	@OriginalMember(owner = "client!JRSHCCMF", name = "e", descriptor = "[B")
	private static byte[] aByteArray5;

	@OriginalMember(owner = "client!JRSHCCMF", name = "f", descriptor = "Lclient!SVWJKJVI;")
	private static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!JRSHCCMF", name = "c", descriptor = "[Lclient!JRSHCCMF;")
	private static Class16[] aClass16Array1 = new Class16[5000];

	@OriginalMember(owner = "client!JRSHCCMF", name = "d", descriptor = "[I")
	public static int[] anIntArray96 = new int[5000];

	@OriginalMember(owner = "client!JRSHCCMF", name = "h", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!JRSHCCMF", name = "i", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!JRSHCCMF", name = "b", descriptor = "I")
	private int anInt196 = -214;

	@OriginalMember(owner = "client!JRSHCCMF", name = "g", descriptor = "[Lclient!HJHNNPSW;")
	private Class11[] aClass11Array1 = new Class11[10];

	@OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(Lclient!SVWJKJVI;I)V")
	public static void method181(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			aByteArray5 = new byte[441000];
			aClass1_Sub1_Sub4_2 = new Class1_Sub1_Sub4(aByteArray5, true);
			Class11.method105();
			while (true) {
				@Pc(22) int local22 = arg0.method407();
				if (local22 == 65535) {
					return;
				}
				aClass16Array1[local22] = new Class16((byte) -61);
				aClass16Array1[local22].method183(arg0);
				anIntArray96[local22] = aClass16Array1[local22].method184();
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("85970, " + arg0 + ", " + 24414 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(III)Lclient!SVWJKJVI;")
	public static Class1_Sub1_Sub4 method182(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass16Array1[arg0] == null) {
				return null;
			} else {
				@Pc(14) Class16 local14 = aClass16Array1[arg0];
				return local14.method185(arg1);
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("65844, " + -26286 + ", " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRSHCCMF", name = "<init>", descriptor = "(B)V")
	private Class16(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(ILclient!SVWJKJVI;)V")
	private void method183(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 10; local8++) {
				@Pc(13) int local13 = arg0.method405();
				if (local13 != 0) {
					arg0.anInt624--;
					this.aClass11Array1[local8] = new Class11();
					this.aClass11Array1[local8].method108(arg0);
				}
			}
			this.anInt197 = arg0.method407();
			this.anInt198 = arg0.method407();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("38587, " + -13096 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(B)I")
	private int method184() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass11Array1[local5] != null && this.aClass11Array1[local5].anInt136 / 20 < local3) {
					local3 = this.aClass11Array1[local5].anInt136 / 20;
				}
			}
			if (this.anInt197 < this.anInt198 && this.anInt197 / 20 < local3) {
				local3 = this.anInt197 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass11Array1[local64] != null) {
					this.aClass11Array1[local64].anInt136 -= local3 * 20;
				}
			}
			if (this.anInt197 < this.anInt198) {
				this.anInt197 -= local3 * 20;
				this.anInt198 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("74769, " + 2 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(ZI)Lclient!SVWJKJVI;")
	private Class1_Sub1_Sub4 method185(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method186(arg0);
			aClass1_Sub1_Sub4_2.anInt624 = 0;
			aClass1_Sub1_Sub4_2.method399(1380533830);
			aClass1_Sub1_Sub4_2.method400(local3 + 36);
			aClass1_Sub1_Sub4_2.method399(1463899717);
			aClass1_Sub1_Sub4_2.method399(1718449184);
			aClass1_Sub1_Sub4_2.method400(16);
			aClass1_Sub1_Sub4_2.method397(1);
			aClass1_Sub1_Sub4_2.method397(1);
			aClass1_Sub1_Sub4_2.method400(22050);
			aClass1_Sub1_Sub4_2.method400(22050);
			aClass1_Sub1_Sub4_2.method397(1);
			aClass1_Sub1_Sub4_2.method397(8);
			aClass1_Sub1_Sub4_2.method399(1684108385);
			aClass1_Sub1_Sub4_2.method400(local3);
			aClass1_Sub1_Sub4_2.anInt624 += local3;
			return aClass1_Sub1_Sub4_2;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("81834, " + true + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JRSHCCMF", name = "a", descriptor = "(I)I")
	private int method186(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass11Array1[local5] != null && this.aClass11Array1[local5].anInt135 + this.aClass11Array1[local5].anInt136 > local3) {
				local3 = this.aClass11Array1[local5].anInt135 + this.aClass11Array1[local5].anInt136;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt197 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt198 * 22050 / 1000;
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
				local123 = this.aClass11Array1[local106].anInt135 * 22050 / 1000;
				local133 = this.aClass11Array1[local106].anInt136 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass11Array1[local106].method106(local123, this.aClass11Array1[local106].anInt135);
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
