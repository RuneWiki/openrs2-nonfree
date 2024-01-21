import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OWCBJDUM")
public final class Class38 {

	@OriginalMember(owner = "client!OWCBJDUM", name = "g", descriptor = "[B")
	private static byte[] aByteArray11;

	@OriginalMember(owner = "client!OWCBJDUM", name = "h", descriptor = "Lclient!XGRGMPUQ;")
	private static Class5_Sub1_Sub4 aClass5_Sub1_Sub4_4;

	@OriginalMember(owner = "client!OWCBJDUM", name = "a", descriptor = "Z")
	private static boolean aBoolean151 = true;

	@OriginalMember(owner = "client!OWCBJDUM", name = "d", descriptor = "Z")
	private static boolean aBoolean153 = true;

	@OriginalMember(owner = "client!OWCBJDUM", name = "e", descriptor = "[Lclient!OWCBJDUM;")
	private static Class38[] aClass38Array1 = new Class38[5000];

	@OriginalMember(owner = "client!OWCBJDUM", name = "f", descriptor = "[I")
	public static int[] anIntArray110 = new int[5000];

	@OriginalMember(owner = "client!OWCBJDUM", name = "j", descriptor = "I")
	private int anInt560;

	@OriginalMember(owner = "client!OWCBJDUM", name = "k", descriptor = "I")
	private int anInt561;

	@OriginalMember(owner = "client!OWCBJDUM", name = "b", descriptor = "Z")
	private boolean aBoolean152 = true;

	@OriginalMember(owner = "client!OWCBJDUM", name = "c", descriptor = "I")
	private int anInt559 = 17642;

	@OriginalMember(owner = "client!OWCBJDUM", name = "i", descriptor = "[Lclient!LQCMEXCE;")
	private Class27[] aClass27Array1 = new Class27[10];

	@OriginalMember(owner = "client!OWCBJDUM", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	public static void method251(@OriginalArg(1) Class5_Sub1_Sub4 arg0) {
		try {
			aByteArray11 = new byte[441000];
			aClass5_Sub1_Sub4_4 = new Class5_Sub1_Sub4(aByteArray11, -82);
			Class27.method219();
			while (true) {
				@Pc(20) int local20 = arg0.method439();
				if (local20 == 65535) {
					return;
				}
				aClass38Array1[local20] = new Class38(false);
				aClass38Array1[local20].method253(aBoolean151, arg0);
				anIntArray110[local20] = aClass38Array1[local20].method254();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("40136, " + true + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCBJDUM", name = "a", descriptor = "(III)Lclient!XGRGMPUQ;")
	public static Class5_Sub1_Sub4 method252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass38Array1[arg1] == null) {
				return null;
			} else {
				@Pc(13) Class38 local13 = aClass38Array1[arg1];
				return local13.method255(arg0);
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("17642, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCBJDUM", name = "<init>", descriptor = "(Z)V")
	private Class38(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!OWCBJDUM", name = "b", descriptor = "(ZLclient!XGRGMPUQ;)V")
	private void method253(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg1.method437();
				if (local6 != 0) {
					arg1.anInt755--;
					this.aClass27Array1[local1] = new Class27();
					this.aClass27Array1[local1].method222(aBoolean151, arg1);
				}
			}
			if (!arg0) {
				throw new NullPointerException();
			}
			this.anInt560 = arg1.method439();
			this.anInt561 = arg1.method439();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("8494, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCBJDUM", name = "a", descriptor = "(I)I")
	private int method254() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass27Array1[local5] != null && this.aClass27Array1[local5].anInt411 / 20 < local3) {
					local3 = this.aClass27Array1[local5].anInt411 / 20;
				}
			}
			if (this.anInt560 < this.anInt561 && this.anInt560 / 20 < local3) {
				local3 = this.anInt560 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(64) int local64 = 0; local64 < 10; local64++) {
				if (this.aClass27Array1[local64] != null) {
					this.aClass27Array1[local64].anInt411 -= local3 * 20;
				}
			}
			if (this.anInt560 < this.anInt561) {
				this.anInt560 -= local3 * 20;
				this.anInt561 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(110) RuntimeException local110) {
			signlink.reporterror("96150, " + 0 + ", " + local110.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCBJDUM", name = "a", descriptor = "(II)Lclient!XGRGMPUQ;")
	private Class5_Sub1_Sub4 method255(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method256(arg0);
			aClass5_Sub1_Sub4_4.anInt755 = 0;
			aClass5_Sub1_Sub4_4.method431(1380533830);
			aClass5_Sub1_Sub4_4.method432(local3 + 36);
			aClass5_Sub1_Sub4_4.method431(1463899717);
			aClass5_Sub1_Sub4_4.method431(1718449184);
			aClass5_Sub1_Sub4_4.method432(16);
			aClass5_Sub1_Sub4_4.method429(1);
			aClass5_Sub1_Sub4_4.method429(1);
			aClass5_Sub1_Sub4_4.method432(22050);
			aClass5_Sub1_Sub4_4.method432(22050);
			aClass5_Sub1_Sub4_4.method429(1);
			aClass5_Sub1_Sub4_4.method429(8);
			aClass5_Sub1_Sub4_4.method431(1684108385);
			aClass5_Sub1_Sub4_4.method432(local3);
			aClass5_Sub1_Sub4_4.anInt755 += local3;
			return aClass5_Sub1_Sub4_4;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("98808, " + -335 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OWCBJDUM", name = "b", descriptor = "(I)I")
	private int method256(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass27Array1[local5] != null && this.aClass27Array1[local5].anInt410 + this.aClass27Array1[local5].anInt411 > local3) {
				local3 = this.aClass27Array1[local5].anInt410 + this.aClass27Array1[local5].anInt411;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt560 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt561 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray11[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass27Array1[local106] != null) {
				local123 = this.aClass27Array1[local106].anInt410 * 22050 / 1000;
				local133 = this.aClass27Array1[local106].anInt411 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass27Array1[local106].method220(local123, this.aClass27Array1[local106].anInt410);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray11[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray11[local133 + local123] = aByteArray11[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray11[local147 + local123] = aByteArray11[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
