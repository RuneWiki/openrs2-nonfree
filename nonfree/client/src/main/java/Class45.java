import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WTXWLORU")
public final class Class45 {

	@OriginalMember(owner = "client!WTXWLORU", name = "g", descriptor = "[B")
	private static byte[] aByteArray20;

	@OriginalMember(owner = "client!WTXWLORU", name = "h", descriptor = "Lclient!MVHXDWGI;")
	private static Class1_Sub1_Sub4 aClass1_Sub1_Sub4_5;

	@OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "Z")
	private static boolean aBoolean171 = true;

	@OriginalMember(owner = "client!WTXWLORU", name = "b", descriptor = "Z")
	private static boolean aBoolean172 = true;

	@OriginalMember(owner = "client!WTXWLORU", name = "c", descriptor = "I")
	private static int anInt778 = -472;

	@OriginalMember(owner = "client!WTXWLORU", name = "e", descriptor = "[Lclient!WTXWLORU;")
	private static Class45[] aClass45Array1 = new Class45[5000];

	@OriginalMember(owner = "client!WTXWLORU", name = "f", descriptor = "[I")
	public static int[] anIntArray203 = new int[5000];

	@OriginalMember(owner = "client!WTXWLORU", name = "j", descriptor = "I")
	private int anInt780;

	@OriginalMember(owner = "client!WTXWLORU", name = "k", descriptor = "I")
	private int anInt781;

	@OriginalMember(owner = "client!WTXWLORU", name = "d", descriptor = "I")
	private int anInt779 = -560;

	@OriginalMember(owner = "client!WTXWLORU", name = "i", descriptor = "[Lclient!TDNGNEZO;")
	private Class40[] aClass40Array1 = new Class40[10];

	@OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(BLclient!MVHXDWGI;)V")
	public static void method551(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			aByteArray20 = new byte[441000];
			aClass1_Sub1_Sub4_5 = new Class1_Sub1_Sub4(0, aByteArray20);
			Class40.method500();
			while (true) {
				@Pc(16) int local16 = arg0.method296();
				if (local16 == 65535) {
					return;
				}
				aClass45Array1[local16] = new Class45(aBoolean172);
				aClass45Array1[local16].method553(arg0);
				anIntArray203[local16] = aClass45Array1[local16].method554(anInt778);
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("5342, " + 8 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(ZII)Lclient!MVHXDWGI;")
	public static Class1_Sub1_Sub4 method552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass45Array1[arg1] == null) {
				return null;
			} else {
				@Pc(15) Class45 local15 = aClass45Array1[arg1];
				return local15.method555(arg0);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("68923, " + true + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTXWLORU", name = "<init>", descriptor = "(Z)V")
	private Class45(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
				}
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("70343, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	private void method553(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method294();
				if (local6 != 0) {
					arg0.anInt529--;
					this.aClass40Array1[local1] = new Class40();
					this.aClass40Array1[local1].method503(arg0);
				}
			}
			this.anInt780 = arg0.method296();
			this.anInt781 = arg0.method296();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("75572, " + 403 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(I)I")
	private int method554(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass40Array1[local5] != null && this.aClass40Array1[local5].anInt724 / 20 < local3) {
					local3 = this.aClass40Array1[local5].anInt724 / 20;
				}
			}
			if (arg0 >= 0) {
				return 4;
			}
			if (this.anInt780 < this.anInt781 && this.anInt780 / 20 < local3) {
				local3 = this.anInt780 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass40Array1[local62] != null) {
					this.aClass40Array1[local62].anInt724 -= local3 * 20;
				}
			}
			if (this.anInt780 < this.anInt781) {
				this.anInt780 -= local3 * 20;
				this.anInt781 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("99567, " + arg0 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTXWLORU", name = "a", descriptor = "(IZ)Lclient!MVHXDWGI;")
	private Class1_Sub1_Sub4 method555(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method556(arg0);
			aClass1_Sub1_Sub4_5.anInt529 = 0;
			aClass1_Sub1_Sub4_5.method288(1380533830);
			aClass1_Sub1_Sub4_5.method289(local3 + 36, (byte) 8);
			aClass1_Sub1_Sub4_5.method288(1463899717);
			aClass1_Sub1_Sub4_5.method288(1718449184);
			aClass1_Sub1_Sub4_5.method289(16, (byte) 8);
			aClass1_Sub1_Sub4_5.method286((byte) 6, 1);
			aClass1_Sub1_Sub4_5.method286((byte) 6, 1);
			aClass1_Sub1_Sub4_5.method289(22050, (byte) 8);
			aClass1_Sub1_Sub4_5.method289(22050, (byte) 8);
			aClass1_Sub1_Sub4_5.method286((byte) 6, 1);
			aClass1_Sub1_Sub4_5.method286((byte) 6, 8);
			aClass1_Sub1_Sub4_5.method288(1684108385);
			aClass1_Sub1_Sub4_5.method289(local3, (byte) 8);
			aClass1_Sub1_Sub4_5.anInt529 += local3;
			return aClass1_Sub1_Sub4_5;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("9014, " + arg0 + ", " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTXWLORU", name = "b", descriptor = "(I)I")
	private int method556(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass40Array1[local5] != null && this.aClass40Array1[local5].anInt723 + this.aClass40Array1[local5].anInt724 > local3) {
				local3 = this.aClass40Array1[local5].anInt723 + this.aClass40Array1[local5].anInt724;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt780 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt781 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray20[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass40Array1[local106] != null) {
				local123 = this.aClass40Array1[local106].anInt723 * 22050 / 1000;
				local133 = this.aClass40Array1[local106].anInt724 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass40Array1[local106].method501(local123, this.aClass40Array1[local106].anInt723);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray20[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray20[local133 + local123] = aByteArray20[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray20[local147 + local123] = aByteArray20[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
