import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OOQAHIET")
public final class Class30 {

	@OriginalMember(owner = "client!OOQAHIET", name = "c", descriptor = "Z")
	private static boolean aBoolean122;

	@OriginalMember(owner = "client!OOQAHIET", name = "f", descriptor = "[B")
	private static byte[] aByteArray13;

	@OriginalMember(owner = "client!OOQAHIET", name = "g", descriptor = "Lclient!RSWRPCHR;")
	private static Class2_Sub1_Sub4 aClass2_Sub1_Sub4_3;

	@OriginalMember(owner = "client!OOQAHIET", name = "d", descriptor = "[Lclient!OOQAHIET;")
	private static Class30[] aClass30Array1 = new Class30[5000];

	@OriginalMember(owner = "client!OOQAHIET", name = "e", descriptor = "[I")
	public static int[] anIntArray103 = new int[5000];

	@OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "I")
	private int anInt488;

	@OriginalMember(owner = "client!OOQAHIET", name = "i", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!OOQAHIET", name = "j", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!OOQAHIET", name = "b", descriptor = "I")
	private int anInt489 = 6;

	@OriginalMember(owner = "client!OOQAHIET", name = "h", descriptor = "[Lclient!ILFXQDER;")
	private Class16[] aClass16Array1 = new Class16[10];

	@OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(ZLclient!RSWRPCHR;)V")
	public static void method285(@OriginalArg(1) Class2_Sub1_Sub4 arg0) {
		try {
			aByteArray13 = new byte[441000];
			aClass2_Sub1_Sub4_3 = new Class2_Sub1_Sub4(aByteArray13, -46859);
			Class16.method129();
			while (true) {
				@Pc(20) int local20 = arg0.method342();
				if (local20 == 65535) {
					return;
				}
				aClass30Array1[local20] = new Class30(true);
				aClass30Array1[local20].method287(arg0);
				anIntArray103[local20] = aClass30Array1[local20].method288();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("29904, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(III)Lclient!RSWRPCHR;")
	public static Class2_Sub1_Sub4 method286(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass30Array1[arg1] == null) {
				return null;
			} else {
				@Pc(15) Class30 local15 = aClass30Array1[arg1];
				return local15.method289(arg0);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("39353, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OOQAHIET", name = "<init>", descriptor = "(Z)V")
	private Class30(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(Lclient!RSWRPCHR;B)V")
	private void method287(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method340();
				if (local6 != 0) {
					arg0.anInt556--;
					this.aClass16Array1[local1] = new Class16();
					this.aClass16Array1[local1].method132(arg0);
				}
			}
			this.anInt490 = arg0.method342();
			this.anInt491 = arg0.method342();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("94554, " + arg0 + ", " + 46 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(B)I")
	private int method288() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(10) int local10 = 0; local10 < 10; local10++) {
				if (this.aClass16Array1[local10] != null && this.aClass16Array1[local10].anInt214 / 20 < local3) {
					local3 = this.aClass16Array1[local10].anInt214 / 20;
				}
			}
			if (this.anInt490 < this.anInt491 && this.anInt490 / 20 < local3) {
				local3 = this.anInt490 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass16Array1[local63] != null) {
					this.aClass16Array1[local63].anInt214 -= local3 * 20;
				}
			}
			if (this.anInt490 < this.anInt491) {
				this.anInt490 -= local3 * 20;
				this.anInt491 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("52978, " + 8 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(IB)Lclient!RSWRPCHR;")
	private Class2_Sub1_Sub4 method289(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method290(arg0);
			aClass2_Sub1_Sub4_3.anInt556 = 0;
			aClass2_Sub1_Sub4_3.method334(1380533830);
			aClass2_Sub1_Sub4_3.method335(this.anInt488, local3 + 36);
			aClass2_Sub1_Sub4_3.method334(1463899717);
			aClass2_Sub1_Sub4_3.method334(1718449184);
			aClass2_Sub1_Sub4_3.method335(this.anInt488, 16);
			aClass2_Sub1_Sub4_3.method332(1);
			aClass2_Sub1_Sub4_3.method332(1);
			aClass2_Sub1_Sub4_3.method335(this.anInt488, 22050);
			aClass2_Sub1_Sub4_3.method335(this.anInt488, 22050);
			aClass2_Sub1_Sub4_3.method332(1);
			aClass2_Sub1_Sub4_3.method332(8);
			aClass2_Sub1_Sub4_3.method334(1684108385);
			aClass2_Sub1_Sub4_3.method335(this.anInt488, local3);
			aClass2_Sub1_Sub4_3.anInt556 += local3;
			return aClass2_Sub1_Sub4_3;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("92134, " + arg0 + ", " + -124 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OOQAHIET", name = "a", descriptor = "(I)I")
	private int method290(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass16Array1[local5] != null && this.aClass16Array1[local5].anInt213 + this.aClass16Array1[local5].anInt214 > local3) {
				local3 = this.aClass16Array1[local5].anInt213 + this.aClass16Array1[local5].anInt214;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt490 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt491 * 22050 / 1000;
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
			if (this.aClass16Array1[local106] != null) {
				local123 = this.aClass16Array1[local106].anInt213 * 22050 / 1000;
				local133 = this.aClass16Array1[local106].anInt214 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass16Array1[local106].method130(local123, this.aClass16Array1[local106].anInt213);
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
