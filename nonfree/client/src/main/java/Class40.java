import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TBRIOEDI")
public final class Class40 {

	@OriginalMember(owner = "client!TBRIOEDI", name = "l", descriptor = "[B")
	private static byte[] aByteArray19;

	@OriginalMember(owner = "client!TBRIOEDI", name = "m", descriptor = "Lclient!FTMSICIZ;")
	private static Class4_Sub1_Sub3 aClass4_Sub1_Sub3_5;

	@OriginalMember(owner = "client!TBRIOEDI", name = "d", descriptor = "I")
	private static int anInt567 = -762;

	@OriginalMember(owner = "client!TBRIOEDI", name = "i", descriptor = "Z")
	private static boolean aBoolean165 = true;

	@OriginalMember(owner = "client!TBRIOEDI", name = "j", descriptor = "[Lclient!TBRIOEDI;")
	private static Class40[] aClass40Array1 = new Class40[5000];

	@OriginalMember(owner = "client!TBRIOEDI", name = "k", descriptor = "[I")
	public static int[] anIntArray145 = new int[5000];

	@OriginalMember(owner = "client!TBRIOEDI", name = "o", descriptor = "I")
	private int anInt571;

	@OriginalMember(owner = "client!TBRIOEDI", name = "p", descriptor = "I")
	private int anInt572;

	@OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "I")
	private int anInt566 = -20315;

	@OriginalMember(owner = "client!TBRIOEDI", name = "b", descriptor = "Z")
	private boolean aBoolean163 = false;

	@OriginalMember(owner = "client!TBRIOEDI", name = "c", descriptor = "B")
	private byte aByte29 = 19;

	@OriginalMember(owner = "client!TBRIOEDI", name = "e", descriptor = "I")
	private int anInt568 = -762;

	@OriginalMember(owner = "client!TBRIOEDI", name = "f", descriptor = "I")
	private int anInt569 = 47368;

	@OriginalMember(owner = "client!TBRIOEDI", name = "g", descriptor = "I")
	private int anInt570 = 2;

	@OriginalMember(owner = "client!TBRIOEDI", name = "h", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!TBRIOEDI", name = "n", descriptor = "[Lclient!YXUDALYQ;")
	private Class49[] aClass49Array1 = new Class49[10];

	@OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(ZLclient!FTMSICIZ;)V")
	public static void method395(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			aByteArray19 = new byte[441000];
			aClass4_Sub1_Sub3_5 = new Class4_Sub1_Sub3(aByteArray19, (byte) 3);
			Class49.method525();
			while (true) {
				@Pc(20) int local20 = arg0.method104();
				if (local20 == 65535) {
					return;
				}
				aClass40Array1[local20] = new Class40(anInt567);
				aClass40Array1[local20].method397(arg0);
				anIntArray145[local20] = aClass40Array1[local20].method398();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("79994, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(ZII)Lclient!FTMSICIZ;")
	public static Class4_Sub1_Sub3 method396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass40Array1[arg0] == null) {
				return null;
			} else {
				@Pc(16) Class40 local16 = aClass40Array1[arg0];
				return local16.method399(arg1);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("87477, " + false + ", " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBRIOEDI", name = "<init>", descriptor = "(I)V")
	private Class40(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("7754, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	private void method397(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			for (@Pc(11) int local11 = 0; local11 < 10; local11++) {
				@Pc(16) int local16 = arg0.method102();
				if (local16 != 0) {
					arg0.anInt101--;
					this.aClass49Array1[local11] = new Class49();
					this.aClass49Array1[local11].method528(arg0, 799);
				}
			}
			this.anInt571 = arg0.method104();
			this.anInt572 = arg0.method104();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("83459, " + arg0 + ", " + 799 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(I)I")
	private int method398() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass49Array1[local5] != null && this.aClass49Array1[local5].anInt771 / 20 < local3) {
					local3 = this.aClass49Array1[local5].anInt771 / 20;
				}
			}
			if (this.anInt571 < this.anInt572 && this.anInt571 / 20 < local3) {
				local3 = this.anInt571 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass49Array1[local58] != null) {
					this.aClass49Array1[local58].anInt771 -= local3 * 20;
				}
			}
			if (this.anInt569 != 47368) {
				this.aBoolean163 = !this.aBoolean163;
			}
			if (this.anInt571 < this.anInt572) {
				this.anInt571 -= local3 * 20;
				this.anInt572 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(116) RuntimeException local116) {
			signlink.reporterror("66383, " + 47368 + ", " + local116.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBRIOEDI", name = "a", descriptor = "(II)Lclient!FTMSICIZ;")
	private Class4_Sub1_Sub3 method399(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method400(arg0);
			aClass4_Sub1_Sub3_5.anInt101 = 0;
			aClass4_Sub1_Sub3_5.method96(1380533830);
			aClass4_Sub1_Sub3_5.method97(local3 + 36);
			aClass4_Sub1_Sub3_5.method96(1463899717);
			aClass4_Sub1_Sub3_5.method96(1718449184);
			aClass4_Sub1_Sub3_5.method97(16);
			aClass4_Sub1_Sub3_5.method94(this.anInt566, 1);
			aClass4_Sub1_Sub3_5.method94(this.anInt566, 1);
			aClass4_Sub1_Sub3_5.method97(22050);
			aClass4_Sub1_Sub3_5.method97(22050);
			aClass4_Sub1_Sub3_5.method94(this.anInt566, 1);
			aClass4_Sub1_Sub3_5.method94(this.anInt566, 8);
			aClass4_Sub1_Sub3_5.method96(1684108385);
			aClass4_Sub1_Sub3_5.method97(local3);
			aClass4_Sub1_Sub3_5.anInt101 += local3;
			return aClass4_Sub1_Sub3_5;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("50448, " + arg0 + ", " + -16409 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TBRIOEDI", name = "b", descriptor = "(I)I")
	private int method400(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass49Array1[local5] != null && this.aClass49Array1[local5].anInt770 + this.aClass49Array1[local5].anInt771 > local3) {
				local3 = this.aClass49Array1[local5].anInt770 + this.aClass49Array1[local5].anInt771;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt571 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt572 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray19[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass49Array1[local106] != null) {
				local123 = this.aClass49Array1[local106].anInt770 * 22050 / 1000;
				local133 = this.aClass49Array1[local106].anInt771 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass49Array1[local106].method526(local123, this.aClass49Array1[local106].anInt770);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray19[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray19[local147 + local133 + 44] = (byte) local165;
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
				aByteArray19[local133 + local123] = aByteArray19[local133];
			}
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray19[local147 + local123] = aByteArray19[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
