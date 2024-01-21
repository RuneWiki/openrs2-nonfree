import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!dc")
public final class Class7 {

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "Z")
	private static boolean aBoolean99;

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "[B")
	private static byte[] aByteArray2;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_4;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
	private static int anInt470 = 6771;

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "[Lclient!dc;")
	private static Class7[] aClass7Array1 = new Class7[1000];

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
	public static int[] anIntArray101 = new int[1000];

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	private int anInt472;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "[Lclient!ec;")
	private Class9[] aClass9Array1 = new Class9[10];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!mb;)V")
	public static void method236(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray2 = new byte[441000];
			aClass1_Sub1_Sub3_4 = new Class1_Sub1_Sub3(aByteArray2, true);
			if (anInt470 != 6771) {
				aBoolean99 = !aBoolean99;
			}
			Class9.method281();
			while (true) {
				@Pc(21) int local21 = arg0.method505();
				if (local21 == 65535) {
					return;
				}
				aClass7Array1[local21] = new Class7(-388);
				aClass7Array1[local21].method238(arg0);
				anIntArray101[local21] = aClass7Array1[local21].method239();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("76492, " + 6771 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Lclient!mb;")
	public static Class1_Sub1_Sub3 method237(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass7Array1[arg0] == null) {
				return null;
			} else {
				@Pc(15) Class7 local15 = aClass7Array1[arg0];
				return local15.method240(arg1);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("46172, " + arg0 + ", " + -648 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
	private Class7(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!mb;)V")
	private void method238(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method503();
				if (local6 != 0) {
					arg0.anInt766--;
					this.aClass9Array1[local1] = new Class9();
					this.aClass9Array1[local1].method284(arg0);
				}
			}
			this.anInt471 = arg0.method505();
			this.anInt472 = arg0.method505();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("50018, " + 44 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)I")
	private int method239() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass9Array1[local5] != null && this.aClass9Array1[local5].anInt504 / 20 < local3) {
					local3 = this.aClass9Array1[local5].anInt504 / 20;
				}
			}
			if (this.anInt471 < this.anInt472 && this.anInt471 / 20 < local3) {
				local3 = this.anInt471 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass9Array1[local58] != null) {
					this.aClass9Array1[local58].anInt504 -= local3 * 20;
				}
			}
			if (this.anInt471 < this.anInt472) {
				this.anInt471 -= local3 * 20;
				this.anInt472 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("16781, " + false + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lclient!mb;")
	private Class1_Sub1_Sub3 method240(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method241(arg0);
			aClass1_Sub1_Sub3_4.anInt766 = 0;
			aClass1_Sub1_Sub3_4.method497(1380533830);
			aClass1_Sub1_Sub3_4.method498(local3 + 36);
			aClass1_Sub1_Sub3_4.method497(1463899717);
			aClass1_Sub1_Sub3_4.method497(1718449184);
			aClass1_Sub1_Sub3_4.method498(16);
			aClass1_Sub1_Sub3_4.method495(1);
			aClass1_Sub1_Sub3_4.method495(1);
			aClass1_Sub1_Sub3_4.method498(22050);
			aClass1_Sub1_Sub3_4.method498(22050);
			aClass1_Sub1_Sub3_4.method495(1);
			aClass1_Sub1_Sub3_4.method495(8);
			aClass1_Sub1_Sub3_4.method497(1684108385);
			aClass1_Sub1_Sub3_4.method498(local3);
			aClass1_Sub1_Sub3_4.anInt766 += local3;
			return aClass1_Sub1_Sub3_4;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("52096, " + arg0 + ", " + 5 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	private int method241(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass9Array1[local5] != null && this.aClass9Array1[local5].anInt503 + this.aClass9Array1[local5].anInt504 > local3) {
				local3 = this.aClass9Array1[local5].anInt503 + this.aClass9Array1[local5].anInt504;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt471 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt472 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray2[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass9Array1[local106] != null) {
				local123 = this.aClass9Array1[local106].anInt503 * 22050 / 1000;
				local133 = this.aClass9Array1[local106].anInt504 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass9Array1[local106].method282(local123, this.aClass9Array1[local106].anInt503);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray2[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray2[local133 + local123] = aByteArray2[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray2[local147 + local123] = aByteArray2[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
