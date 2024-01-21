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

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "Z")
	private static boolean aBoolean158 = true;

	@OriginalMember(owner = "client!yb", name = "c", descriptor = "[Lclient!yb;")
	private static Class43[] aClass43Array1 = new Class43[1000];

	@OriginalMember(owner = "client!yb", name = "d", descriptor = "[I")
	public static int[] anIntArray231 = new int[1000];

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "I")
	private int anInt883;

	@OriginalMember(owner = "client!yb", name = "h", descriptor = "I")
	private int anInt884;

	@OriginalMember(owner = "client!yb", name = "i", descriptor = "I")
	private int anInt885;

	@OriginalMember(owner = "client!yb", name = "g", descriptor = "[Lclient!zb;")
	private Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ILclient!kb;)V")
	public static void method561(@OriginalArg(1) Class1_Sub3_Sub3 arg0) {
		try {
			aByteArray15 = new byte[441000];
			aClass1_Sub3_Sub3_23 = new Class1_Sub3_Sub3((byte) 64, aByteArray15);
			Class44.method575();
			while (true) {
				@Pc(21) int local21 = arg0.method393();
				if (local21 == 65535) {
					return;
				}
				aClass43Array1[local21] = new Class43();
				aClass43Array1[local21].method563(arg0);
				anIntArray231[local21] = aClass43Array1[local21].method564();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("82824, " + -5880 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(ZII)Lclient!kb;")
	public static Class1_Sub3_Sub3 method562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass43Array1[arg1] == null) {
				return null;
			} else {
				@Pc(13) Class43 local13 = aClass43Array1[arg1];
				return local13.method565(arg0);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("21774, " + false + ", " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(Lclient!kb;Z)V")
	private void method563(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
				@Pc(12) int local12 = arg0.method391();
				if (local12 != 0) {
					arg0.anInt554--;
					this.aClass44Array1[local7] = new Class44();
					this.aClass44Array1[local7].method578(arg0);
				}
			}
			this.anInt884 = arg0.method393();
			this.anInt885 = arg0.method393();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("33710, " + arg0 + ", " + true + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(I)I")
	private int method564() {
		try {
			@Pc(8) int local8 = 9999999;
			for (@Pc(10) int local10 = 0; local10 < 10; local10++) {
				if (this.aClass44Array1[local10] != null && this.aClass44Array1[local10].anInt956 / 20 < local8) {
					local8 = this.aClass44Array1[local10].anInt956 / 20;
				}
			}
			if (this.anInt884 < this.anInt885 && this.anInt884 / 20 < local8) {
				local8 = this.anInt884 / 20;
			}
			if (local8 == 9999999 || local8 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass44Array1[local63] != null) {
					this.aClass44Array1[local63].anInt956 -= local8 * 20;
				}
			}
			if (this.anInt884 < this.anInt885) {
				this.anInt884 -= local8 * 20;
				this.anInt885 -= local8 * 20;
			}
			return local8;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("18772, " + 0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "a", descriptor = "(II)Lclient!kb;")
	private Class1_Sub3_Sub3 method565(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method566(arg0);
			aClass1_Sub3_Sub3_23.anInt554 = 0;
			aClass1_Sub3_Sub3_23.method385(1380533830);
			aClass1_Sub3_Sub3_23.method386(local3 + 36);
			aClass1_Sub3_Sub3_23.method385(1463899717);
			aClass1_Sub3_Sub3_23.method385(1718449184);
			aClass1_Sub3_Sub3_23.method386(16);
			aClass1_Sub3_Sub3_23.method383(1);
			aClass1_Sub3_Sub3_23.method383(1);
			aClass1_Sub3_Sub3_23.method386(22050);
			aClass1_Sub3_Sub3_23.method386(22050);
			aClass1_Sub3_Sub3_23.method383(1);
			aClass1_Sub3_Sub3_23.method383(8);
			aClass1_Sub3_Sub3_23.method385(1684108385);
			aClass1_Sub3_Sub3_23.method386(local3);
			aClass1_Sub3_Sub3_23.anInt554 += local3;
			return aClass1_Sub3_Sub3_23;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("92349, " + arg0 + ", " + 933 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!yb", name = "b", descriptor = "(I)I")
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
		@Pc(58) int local58 = this.anInt884 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt885 * 22050 / 1000;
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
