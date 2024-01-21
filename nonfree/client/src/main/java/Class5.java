import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private static int anInt228 = 309;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
	public static int[] anIntArray22 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt229;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	private int anInt230;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private boolean aBoolean25 = true;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "B")
	private byte aByte1 = 33;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mb;B)V")
	public static void method73(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(699, aByteArray1);
			@Pc(13) boolean local13 = false;
			Class7.method231();
			while (true) {
				@Pc(21) int local21 = arg0.method469();
				if (local21 == 65535) {
					return;
				}
				aClass5Array1[local21] = new Class5();
				aClass5Array1[local21].method75(arg0);
				anIntArray22[local21] = aClass5Array1[local21].method76();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("54592, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!mb;")
	public static Class1_Sub1_Sub3 method74(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(17) Class5 local17 = aClass5Array1[arg1];
				return local17.method77(arg0);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("5342, " + arg0 + ", " + -872 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!mb;)V")
	private void method75(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method467();
				if (local6 != 0) {
					arg0.anInt771--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method234(arg0);
				}
			}
			this.anInt229 = arg0.method469();
			this.anInt230 = arg0.method469();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("98280, " + false + ", " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)I")
	private int method76() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt490 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt490 / 20;
				}
			}
			if (this.aByte1 != 33) {
				aBoolean24 = true;
			}
			if (this.anInt229 < this.anInt230 && this.anInt229 / 20 < local3) {
				local3 = this.anInt229 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(68) int local68 = 0; local68 < 10; local68++) {
				if (this.aClass7Array1[local68] != null) {
					this.aClass7Array1[local68].anInt490 -= local3 * 20;
				}
			}
			if (this.anInt229 < this.anInt230) {
				this.anInt229 -= local3 * 20;
				this.anInt230 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("25708, " + 33 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)Lclient!mb;")
	private Class1_Sub1_Sub3 method77(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method78(arg0);
			aClass1_Sub1_Sub3_1.anInt771 = 0;
			aClass1_Sub1_Sub3_1.method461(1380533830);
			aClass1_Sub1_Sub3_1.method462(local3 + 36);
			aClass1_Sub1_Sub3_1.method461(1463899717);
			aClass1_Sub1_Sub3_1.method461(1718449184);
			aClass1_Sub1_Sub3_1.method462(16);
			aClass1_Sub1_Sub3_1.method459((byte) 4, 1);
			aClass1_Sub1_Sub3_1.method459((byte) 4, 1);
			aClass1_Sub1_Sub3_1.method462(22050);
			aClass1_Sub1_Sub3_1.method462(22050);
			aClass1_Sub1_Sub3_1.method459((byte) 4, 1);
			aClass1_Sub1_Sub3_1.method459((byte) 4, 8);
			aClass1_Sub1_Sub3_1.method461(1684108385);
			aClass1_Sub1_Sub3_1.method462(local3);
			aClass1_Sub1_Sub3_1.anInt771 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("57371, " + true + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method78(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt489 + this.aClass7Array1[local5].anInt490 > local3) {
				local3 = this.aClass7Array1[local5].anInt489 + this.aClass7Array1[local5].anInt490;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt229 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt230 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray1[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass7Array1[local106] != null) {
				local123 = this.aClass7Array1[local106].anInt489 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt490 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method232(local123, this.aClass7Array1[local106].anInt489);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray1[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray1[local133 + local123] = aByteArray1[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray1[local147 + local123] = aByteArray1[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
