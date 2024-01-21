import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SHEJQUDB")
public final class Class36 {

	@OriginalMember(owner = "client!SHEJQUDB", name = "f", descriptor = "[B")
	private static byte[] aByteArray13;

	@OriginalMember(owner = "client!SHEJQUDB", name = "g", descriptor = "Lclient!PGNBHFUF;")
	private static Class4_Sub1_Sub4 aClass4_Sub1_Sub4_4;

	@OriginalMember(owner = "client!SHEJQUDB", name = "a", descriptor = "I")
	private static int anInt584 = 974;

	@OriginalMember(owner = "client!SHEJQUDB", name = "d", descriptor = "[Lclient!SHEJQUDB;")
	private static Class36[] aClass36Array1 = new Class36[5000];

	@OriginalMember(owner = "client!SHEJQUDB", name = "e", descriptor = "[I")
	public static int[] anIntArray147 = new int[5000];

	@OriginalMember(owner = "client!SHEJQUDB", name = "i", descriptor = "I")
	private int anInt585;

	@OriginalMember(owner = "client!SHEJQUDB", name = "j", descriptor = "I")
	private int anInt586;

	@OriginalMember(owner = "client!SHEJQUDB", name = "b", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!SHEJQUDB", name = "c", descriptor = "Z")
	private boolean aBoolean150 = true;

	@OriginalMember(owner = "client!SHEJQUDB", name = "h", descriptor = "[Lclient!KWOZHDOE;")
	private Class22[] aClass22Array1 = new Class22[10];

	@OriginalMember(owner = "client!SHEJQUDB", name = "a", descriptor = "(ILclient!PGNBHFUF;)V")
	public static void method437(@OriginalArg(1) Class4_Sub1_Sub4 arg0) {
		try {
			aByteArray13 = new byte[441000];
			aClass4_Sub1_Sub4_4 = new Class4_Sub1_Sub4(5, aByteArray13);
			Class22.method298();
			while (true) {
				@Pc(15) int local15 = arg0.method357();
				if (local15 == 65535) {
					return;
				}
				aClass36Array1[local15] = new Class36(-373);
				aClass36Array1[local15].method439(arg0, anInt584);
				anIntArray147[local15] = aClass36Array1[local15].method440();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("14007, " + 0 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHEJQUDB", name = "a", descriptor = "(III)Lclient!PGNBHFUF;")
	public static Class4_Sub1_Sub4 method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			if (aClass36Array1[arg0] == null) {
				return null;
			} else {
				@Pc(11) Class36 local11 = aClass36Array1[arg0];
				return local11.method441(arg1);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("67139, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHEJQUDB", name = "<init>", descriptor = "(I)V")
	private Class36(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!SHEJQUDB", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	private void method439(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method355();
				if (local6 != 0) {
					arg0.anInt506--;
					this.aClass22Array1[local1] = new Class22();
					this.aClass22Array1[local1].method301(arg0, anInt584);
				}
			}
			@Pc(36) int local36 = 25 / arg1;
			this.anInt585 = arg0.method357();
			this.anInt586 = arg0.method357();
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("6851, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHEJQUDB", name = "a", descriptor = "(I)I")
	private int method440() {
		try {
			@Pc(14) int local14 = 9999999;
			for (@Pc(16) int local16 = 0; local16 < 10; local16++) {
				if (this.aClass22Array1[local16] != null && this.aClass22Array1[local16].anInt406 / 20 < local14) {
					local14 = this.aClass22Array1[local16].anInt406 / 20;
				}
			}
			if (this.anInt585 < this.anInt586 && this.anInt585 / 20 < local14) {
				local14 = this.anInt585 / 20;
			}
			if (local14 == 9999999 || local14 == 0) {
				return 0;
			}
			for (@Pc(69) int local69 = 0; local69 < 10; local69++) {
				if (this.aClass22Array1[local69] != null) {
					this.aClass22Array1[local69].anInt406 -= local14 * 20;
				}
			}
			if (this.anInt585 < this.anInt586) {
				this.anInt585 -= local14 * 20;
				this.anInt586 -= local14 * 20;
			}
			return local14;
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("43368, " + 2 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHEJQUDB", name = "a", descriptor = "(IZ)Lclient!PGNBHFUF;")
	private Class4_Sub1_Sub4 method441(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method442(arg0);
			aClass4_Sub1_Sub4_4.anInt506 = 0;
			aClass4_Sub1_Sub4_4.method349(1380533830);
			aClass4_Sub1_Sub4_4.method350(local3 + 36);
			aClass4_Sub1_Sub4_4.method349(1463899717);
			aClass4_Sub1_Sub4_4.method349(1718449184);
			aClass4_Sub1_Sub4_4.method350(16);
			aClass4_Sub1_Sub4_4.method347(1);
			aClass4_Sub1_Sub4_4.method347(1);
			aClass4_Sub1_Sub4_4.method350(22050);
			aClass4_Sub1_Sub4_4.method350(22050);
			aClass4_Sub1_Sub4_4.method347(1);
			aClass4_Sub1_Sub4_4.method347(8);
			aClass4_Sub1_Sub4_4.method349(1684108385);
			aClass4_Sub1_Sub4_4.method350(local3);
			aClass4_Sub1_Sub4_4.anInt506 += local3;
			return aClass4_Sub1_Sub4_4;
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("98683, " + arg0 + ", " + true + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHEJQUDB", name = "b", descriptor = "(I)I")
	private int method442(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass22Array1[local5] != null && this.aClass22Array1[local5].anInt405 + this.aClass22Array1[local5].anInt406 > local3) {
				local3 = this.aClass22Array1[local5].anInt405 + this.aClass22Array1[local5].anInt406;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt585 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt586 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray13[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass22Array1[local106] != null) {
				local123 = this.aClass22Array1[local106].anInt405 * 22050 / 1000;
				local133 = this.aClass22Array1[local106].anInt406 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass22Array1[local106].method299(local123, this.aClass22Array1[local106].anInt405);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray13[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray13[local133 + local123] = aByteArray13[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray13[local147 + local123] = aByteArray13[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
