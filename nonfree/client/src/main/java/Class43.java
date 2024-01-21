import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!yb")
public final class Class43 {

	@OriginalMember(owner = "client!yb", name = "e", descriptor = "[B")
	private static byte[] aByteArray15;

	@OriginalMember(owner = "client!yb", name = "f", descriptor = "Lclient!kb;")
	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_23;

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private static int anInt885 = 473;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "[Lclient!yb;")
	private static Class43[] aClass43Array1 = new Class43[1000];

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "[I")
	public static int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private boolean aBoolean160 = true;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[Lclient!zb;")
	private Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Lclient!kb;I)V")
	public static void method561(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			aByteArray15 = new byte[441000];
			aClass1_Sub3_Sub3_23 = new Class1_Sub3_Sub3(363, aByteArray15);
			@Pc(12) boolean local12 = false;
			Class44.method575();
			while (true) {
				@Pc(16) int local16 = arg0.method393();
				if (local16 == 65535) {
					return;
				}
				aClass43Array1[local16] = new Class43();
				aClass43Array1[local16].method563(arg0);
				anIntArray231[local16] = aClass43Array1[local16].method564((byte) 7);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("6214, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(BII)Lclient!kb;")
	public static Class1_Sub3_Sub3 method562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass43Array1[arg1] == null) {
				return null;
			} else {
				@Pc(12) Class43 local12 = aClass43Array1[arg1];
				return local12.method565(arg0);
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("72905, " + -16 + ", " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZLclient!kb;)V")
	private void method563(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method391();
				if (local6 != 0) {
					arg0.anInt561--;
					this.aClass44Array1[local1] = new Class44();
					this.aClass44Array1[local1].method578(arg0);
				}
			}
			this.anInt886 = arg0.method393();
			this.anInt887 = arg0.method393();
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("58220, " + false + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(B)I")
	private int method564(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt956 / 20 < local3) {
					local3 = this.aClass44Array1[local5].anInt956 / 20;
				}
			}
			@Pc(38) boolean local38 = false;
			if (this.anInt886 < this.anInt887 && this.anInt886 / 20 < local3) {
				local3 = this.anInt886 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
				if (this.aClass44Array1[local67] != null) {
					this.aClass44Array1[local67].anInt956 -= local3 * 20;
				}
			}
			if (this.anInt886 < this.anInt887) {
				this.anInt886 -= local3 * 20;
				this.anInt887 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("49328, " + arg0 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZI)Lclient!kb;")
	private Class1_Sub3_Sub3 method565(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method566(arg0);
			aClass1_Sub3_Sub3_23.anInt561 = 0;
			aClass1_Sub3_Sub3_23.method385(1380533830);
			aClass1_Sub3_Sub3_23.method386(local3 + 36);
			aClass1_Sub3_Sub3_23.method385(1463899717);
			aClass1_Sub3_Sub3_23.method385(1718449184);
			aClass1_Sub3_Sub3_23.method386(16);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 1);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 1);
			aClass1_Sub3_Sub3_23.method386(22050);
			aClass1_Sub3_Sub3_23.method386(22050);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 1);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 8);
			aClass1_Sub3_Sub3_23.method385(1684108385);
			aClass1_Sub3_Sub3_23.method386(local3);
			aClass1_Sub3_Sub3_23.anInt561 += local3;
			return aClass1_Sub3_Sub3_23;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("83597, " + true + ", " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)I")
	private int method566(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt955 + this.aClass44Array1[local5].anInt956 > local3) {
				local3 = this.aClass44Array1[local5].anInt955 + this.aClass44Array1[local5].anInt956;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt886 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt887 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray15[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass44Array1[local106] != null) {
				local123 = this.aClass44Array1[local106].anInt955 * 22050 / 1000;
				local133 = this.aClass44Array1[local106].anInt956 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass44Array1[local106].method576(local123, this.aClass44Array1[local106].anInt955);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray15[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray15[local133 + local123] = aByteArray15[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray15[local147 + local123] = aByteArray15[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
