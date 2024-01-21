import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DCZESDQX")
public final class Class8 {

	@OriginalMember(owner = "client!DCZESDQX", name = "h", descriptor = "[B")
	private static byte[] aByteArray2;

	@OriginalMember(owner = "client!DCZESDQX", name = "i", descriptor = "Lclient!BSNPYLEV;")
	private static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_1;

	@OriginalMember(owner = "client!DCZESDQX", name = "d", descriptor = "I")
	private static int anInt98 = -645;

	@OriginalMember(owner = "client!DCZESDQX", name = "e", descriptor = "I")
	private static int anInt99 = 438;

	@OriginalMember(owner = "client!DCZESDQX", name = "f", descriptor = "[Lclient!DCZESDQX;")
	private static Class8[] aClass8Array1 = new Class8[5000];

	@OriginalMember(owner = "client!DCZESDQX", name = "g", descriptor = "[I")
	public static int[] anIntArray33 = new int[5000];

	@OriginalMember(owner = "client!DCZESDQX", name = "k", descriptor = "I")
	private int anInt100;

	@OriginalMember(owner = "client!DCZESDQX", name = "l", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "Z")
	private boolean aBoolean56 = true;

	@OriginalMember(owner = "client!DCZESDQX", name = "b", descriptor = "I")
	private int anInt97 = 340;

	@OriginalMember(owner = "client!DCZESDQX", name = "c", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!DCZESDQX", name = "j", descriptor = "[Lclient!ZJWNEIBQ;")
	private Class50[] aClass50Array1 = new Class50[10];

	@OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(Lclient!BSNPYLEV;I)V")
	public static void method171(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			aByteArray2 = new byte[441000];
			aClass2_Sub1_Sub2_1 = new Class2_Sub1_Sub2(aByteArray2, (byte) 3);
			Class50.method572();
			while (true) {
				@Pc(17) int local17 = arg0.method96();
				if (local17 == 65535) {
					return;
				}
				aClass8Array1[local17] = new Class8((byte) 82);
				aClass8Array1[local17].method173(arg0);
				anIntArray33[local17] = aClass8Array1[local17].method174();
			}
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("76936, " + arg0 + ", " + -29636 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(IZI)Lclient!BSNPYLEV;")
	public static Class2_Sub1_Sub2 method172(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		try {
			if (!arg1) {
				anInt99 = -277;
			}
			if (aClass8Array1[arg0] == null) {
				return null;
			} else {
				@Pc(11) Class8 local11 = aClass8Array1[arg0];
				return local11.method175(arg2);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("78310, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCZESDQX", name = "<init>", descriptor = "(B)V")
	private Class8(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	private void method173(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			for (@Pc(8) int local8 = 0; local8 < 10; local8++) {
				@Pc(13) int local13 = arg0.method94();
				if (local13 != 0) {
					arg0.anInt81--;
					this.aClass50Array1[local8] = new Class50();
					this.aClass50Array1[local8].method575(arg0);
				}
			}
			this.anInt100 = arg0.method96();
			this.anInt101 = arg0.method96();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("31552, " + 7 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(I)I")
	private int method174() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass50Array1[local5] != null && this.aClass50Array1[local5].anInt827 / 20 < local3) {
					local3 = this.aClass50Array1[local5].anInt827 / 20;
				}
			}
			if (this.anInt100 < this.anInt101 && this.anInt100 / 20 < local3) {
				local3 = this.anInt100 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass50Array1[local58] != null) {
					this.aClass50Array1[local58].anInt827 -= local3 * 20;
				}
			}
			if (this.anInt100 < this.anInt101) {
				this.anInt100 -= local3 * 20;
				this.anInt101 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("63373, " + 6 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCZESDQX", name = "a", descriptor = "(II)Lclient!BSNPYLEV;")
	private Class2_Sub1_Sub2 method175(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method176(arg0);
			aClass2_Sub1_Sub2_1.anInt81 = 0;
			aClass2_Sub1_Sub2_1.method88(1380533830);
			aClass2_Sub1_Sub2_1.method89(local3 + 36);
			aClass2_Sub1_Sub2_1.method88(1463899717);
			aClass2_Sub1_Sub2_1.method88(1718449184);
			aClass2_Sub1_Sub2_1.method89(16);
			aClass2_Sub1_Sub2_1.method86(1);
			aClass2_Sub1_Sub2_1.method86(1);
			aClass2_Sub1_Sub2_1.method89(22050);
			aClass2_Sub1_Sub2_1.method89(22050);
			aClass2_Sub1_Sub2_1.method86(1);
			aClass2_Sub1_Sub2_1.method86(8);
			aClass2_Sub1_Sub2_1.method88(1684108385);
			aClass2_Sub1_Sub2_1.method89(local3);
			aClass2_Sub1_Sub2_1.anInt81 += local3;
			return aClass2_Sub1_Sub2_1;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("17657, " + 2 + ", " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DCZESDQX", name = "b", descriptor = "(I)I")
	private int method176(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass50Array1[local5] != null && this.aClass50Array1[local5].anInt826 + this.aClass50Array1[local5].anInt827 > local3) {
				local3 = this.aClass50Array1[local5].anInt826 + this.aClass50Array1[local5].anInt827;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt100 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt101 * 22050 / 1000;
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
			if (this.aClass50Array1[local106] != null) {
				local123 = this.aClass50Array1[local106].anInt826 * 22050 / 1000;
				local133 = this.aClass50Array1[local106].anInt827 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass50Array1[local106].method573(local123, this.aClass50Array1[local106].anInt826);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray2[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray2[local147 + local133 + 44] = (byte) local165;
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
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray2[local147 + local123] = aByteArray2[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
