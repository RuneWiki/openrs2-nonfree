import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VSVAEWAC")
public final class Class43 {

	@OriginalMember(owner = "client!VSVAEWAC", name = "f", descriptor = "[B")
	private static byte[] aByteArray20;

	@OriginalMember(owner = "client!VSVAEWAC", name = "g", descriptor = "Lclient!CFARFRSG;")
	private static Class1_Sub1_Sub2 aClass1_Sub1_Sub2_5;

	@OriginalMember(owner = "client!VSVAEWAC", name = "d", descriptor = "[Lclient!VSVAEWAC;")
	private static Class43[] aClass43Array1 = new Class43[5000];

	@OriginalMember(owner = "client!VSVAEWAC", name = "e", descriptor = "[I")
	public static int[] anIntArray189 = new int[5000];

	@OriginalMember(owner = "client!VSVAEWAC", name = "i", descriptor = "I")
	private int anInt757;

	@OriginalMember(owner = "client!VSVAEWAC", name = "j", descriptor = "I")
	private int anInt758;

	@OriginalMember(owner = "client!VSVAEWAC", name = "a", descriptor = "I")
	private int anInt754 = 22486;

	@OriginalMember(owner = "client!VSVAEWAC", name = "b", descriptor = "I")
	private int anInt755 = -524;

	@OriginalMember(owner = "client!VSVAEWAC", name = "c", descriptor = "I")
	private int anInt756 = -75;

	@OriginalMember(owner = "client!VSVAEWAC", name = "h", descriptor = "[Lclient!GJBKSAZL;")
	private Class16[] aClass16Array1 = new Class16[10];

	@OriginalMember(owner = "client!VSVAEWAC", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	public static void method540(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(1) int arg1) {
		try {
			aByteArray20 = new byte[441000];
			@Pc(6) boolean local6 = false;
			aClass1_Sub1_Sub2_5 = new Class1_Sub1_Sub2(aByteArray20, 792);
			Class16.method252();
			while (true) {
				@Pc(16) int local16 = arg0.method61();
				if (local16 == 65535) {
					return;
				}
				aClass43Array1[local16] = new Class43((byte) 5);
				aClass43Array1[local16].method542(arg0);
				anIntArray189[local16] = aClass43Array1[local16].method543();
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("58765, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSVAEWAC", name = "a", descriptor = "(III)Lclient!CFARFRSG;")
	public static Class1_Sub1_Sub2 method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass43Array1[arg0] == null) {
				return null;
			} else {
				@Pc(14) Class43 local14 = aClass43Array1[arg0];
				return local14.method544(arg1, 154);
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("20638, " + arg0 + ", " + arg1 + ", " + -29127 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSVAEWAC", name = "<init>", descriptor = "(B)V")
	private Class43(@OriginalArg(0) byte arg0) {
		try {
			@Pc(19) boolean local19 = false;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("11610, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSVAEWAC", name = "b", descriptor = "(Lclient!CFARFRSG;I)V")
	private void method542(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method59();
				if (local6 != 0) {
					arg0.anInt153--;
					this.aClass16Array1[local1] = new Class16();
					this.aClass16Array1[local1].method255(arg0);
				}
			}
			if (this.anInt754 != 22486) {
				throw new NullPointerException();
			}
			this.anInt757 = arg0.method61();
			this.anInt758 = arg0.method61();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("82198, " + arg0 + ", " + 22486 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSVAEWAC", name = "a", descriptor = "(Z)I")
	private int method543() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass16Array1[local5] != null && this.aClass16Array1[local5].anInt365 / 20 < local3) {
					local3 = this.aClass16Array1[local5].anInt365 / 20;
				}
			}
			if (this.anInt757 < this.anInt758 && this.anInt757 / 20 < local3) {
				local3 = this.anInt757 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
				if (this.aClass16Array1[local62] != null) {
					this.aClass16Array1[local62].anInt365 -= local3 * 20;
				}
			}
			if (this.anInt757 < this.anInt758) {
				this.anInt757 -= local3 * 20;
				this.anInt758 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("40225, " + false + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSVAEWAC", name = "a", descriptor = "(II)Lclient!CFARFRSG;")
	private Class1_Sub1_Sub2 method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.method545(arg0);
			aClass1_Sub1_Sub2_5.anInt153 = 0;
			aClass1_Sub1_Sub2_5.method53(1380533830);
			aClass1_Sub1_Sub2_5.method54(local3 + 36);
			aClass1_Sub1_Sub2_5.method53(1463899717);
			aClass1_Sub1_Sub2_5.method53(1718449184);
			aClass1_Sub1_Sub2_5.method54(16);
			aClass1_Sub1_Sub2_5.method51(1);
			aClass1_Sub1_Sub2_5.method51(1);
			aClass1_Sub1_Sub2_5.method54(22050);
			aClass1_Sub1_Sub2_5.method54(22050);
			aClass1_Sub1_Sub2_5.method51(1);
			@Pc(49) boolean local49 = false;
			aClass1_Sub1_Sub2_5.method51(8);
			aClass1_Sub1_Sub2_5.method53(1684108385);
			aClass1_Sub1_Sub2_5.method54(local3);
			aClass1_Sub1_Sub2_5.anInt153 += local3;
			return aClass1_Sub1_Sub2_5;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("16391, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VSVAEWAC", name = "a", descriptor = "(I)I")
	private int method545(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass16Array1[local5] != null && this.aClass16Array1[local5].anInt364 + this.aClass16Array1[local5].anInt365 > local3) {
				local3 = this.aClass16Array1[local5].anInt364 + this.aClass16Array1[local5].anInt365;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt757 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt758 * 22050 / 1000;
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
			if (this.aClass16Array1[local106] != null) {
				local123 = this.aClass16Array1[local106].anInt364 * 22050 / 1000;
				local133 = this.aClass16Array1[local106].anInt365 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass16Array1[local106].method253(local123, this.aClass16Array1[local106].anInt364);
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
