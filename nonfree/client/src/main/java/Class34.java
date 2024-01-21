import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PWXXEHUE")
public final class Class34 {

	@OriginalMember(owner = "client!PWXXEHUE", name = "f", descriptor = "[B")
	private static byte[] aByteArray7;

	@OriginalMember(owner = "client!PWXXEHUE", name = "g", descriptor = "Lclient!JHKSAGUC;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_3;

	@OriginalMember(owner = "client!PWXXEHUE", name = "d", descriptor = "[Lclient!PWXXEHUE;")
	private static Class34[] aClass34Array1 = new Class34[5000];

	@OriginalMember(owner = "client!PWXXEHUE", name = "e", descriptor = "[I")
	public static int[] anIntArray93 = new int[5000];

	@OriginalMember(owner = "client!PWXXEHUE", name = "c", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!PWXXEHUE", name = "i", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!PWXXEHUE", name = "j", descriptor = "I")
	private int anInt538;

	@OriginalMember(owner = "client!PWXXEHUE", name = "a", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!PWXXEHUE", name = "b", descriptor = "I")
	private int anInt535 = 9;

	@OriginalMember(owner = "client!PWXXEHUE", name = "h", descriptor = "[Lclient!QCXYCZNF;")
	private Class36[] aClass36Array1 = new Class36[10];

	@OriginalMember(owner = "client!PWXXEHUE", name = "a", descriptor = "(ILclient!JHKSAGUC;)V")
	public static void method341(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			aByteArray7 = new byte[441000];
			aClass1_Sub1_Sub3_3 = new Class1_Sub1_Sub3(aByteArray7, 8);
			Class36.method360();
			@Pc(13) boolean local13 = false;
			while (true) {
				@Pc(16) int local16 = arg1.method240();
				if (local16 == 65535) {
					return;
				}
				aClass34Array1[local16] = new Class34(310);
				aClass34Array1[local16].method343(arg1);
				anIntArray93[local16] = aClass34Array1[local16].method344();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("71433, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PWXXEHUE", name = "a", descriptor = "(III)Lclient!JHKSAGUC;")
	public static Class1_Sub1_Sub3 method342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass34Array1[arg0] == null) {
				return null;
			} else {
				@Pc(15) Class34 local15 = aClass34Array1[arg0];
				return local15.method345(arg1);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("81212, " + arg0 + ", " + -164 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PWXXEHUE", name = "<init>", descriptor = "(I)V")
	private Class34(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!PWXXEHUE", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	private void method343(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method238();
				if (local6 != 0) {
					arg0.anInt352--;
					this.aClass36Array1[local1] = new Class36();
					this.aClass36Array1[local1].method363(arg0);
				}
			}
			this.anInt537 = arg0.method240();
			this.anInt538 = arg0.method240();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("33807, " + arg0 + ", " + 0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PWXXEHUE", name = "a", descriptor = "(B)I")
	private int method344() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
				if (this.aClass36Array1[local11] != null && this.aClass36Array1[local11].anInt555 / 20 < local3) {
					local3 = this.aClass36Array1[local11].anInt555 / 20;
				}
			}
			if (this.anInt537 < this.anInt538 && this.anInt537 / 20 < local3) {
				local3 = this.anInt537 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass36Array1[local64] != null) {
					this.aClass36Array1[local64].anInt555 -= local3 * 20;
				}
			}
			if (this.anInt537 < this.anInt538) {
				this.anInt537 -= local3 * 20;
				this.anInt538 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("4868, " + -13 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PWXXEHUE", name = "a", descriptor = "(II)Lclient!JHKSAGUC;")
	private Class1_Sub1_Sub3 method345(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method346(arg0);
			aClass1_Sub1_Sub3_3.anInt352 = 0;
			aClass1_Sub1_Sub3_3.method232(1380533830);
			aClass1_Sub1_Sub3_3.method233(local3 + 36);
			aClass1_Sub1_Sub3_3.method232(1463899717);
			aClass1_Sub1_Sub3_3.method232(1718449184);
			aClass1_Sub1_Sub3_3.method233(16);
			aClass1_Sub1_Sub3_3.method230(1);
			aClass1_Sub1_Sub3_3.method230(1);
			aClass1_Sub1_Sub3_3.method233(22050);
			aClass1_Sub1_Sub3_3.method233(22050);
			aClass1_Sub1_Sub3_3.method230(1);
			aClass1_Sub1_Sub3_3.method230(8);
			aClass1_Sub1_Sub3_3.method232(1684108385);
			aClass1_Sub1_Sub3_3.method233(local3);
			aClass1_Sub1_Sub3_3.anInt352 += local3;
			return aClass1_Sub1_Sub3_3;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("51482, " + -17105 + ", " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PWXXEHUE", name = "a", descriptor = "(I)I")
	private int method346(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass36Array1[local5] != null && this.aClass36Array1[local5].anInt554 + this.aClass36Array1[local5].anInt555 > local3) {
				local3 = this.aClass36Array1[local5].anInt554 + this.aClass36Array1[local5].anInt555;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt537 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt538 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray7[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass36Array1[local106] != null) {
				local123 = this.aClass36Array1[local106].anInt554 * 22050 / 1000;
				local133 = this.aClass36Array1[local106].anInt555 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass36Array1[local106].method361(local123, this.aClass36Array1[local106].anInt554);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray7[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray7[local133 + local123] = aByteArray7[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray7[local147 + local123] = aByteArray7[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
