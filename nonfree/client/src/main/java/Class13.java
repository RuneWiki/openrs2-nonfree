import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GRRWPPAT")
public final class Class13 {

	@OriginalMember(owner = "client!GRRWPPAT", name = "d", descriptor = "[B")
	private static byte[] aByteArray3;

	@OriginalMember(owner = "client!GRRWPPAT", name = "e", descriptor = "Lclient!RGCGKKUR;")
	private static Class6_Sub1_Sub4 aClass6_Sub1_Sub4_2;

	@OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "I")
	private static int anInt136 = -313;

	@OriginalMember(owner = "client!GRRWPPAT", name = "b", descriptor = "[Lclient!GRRWPPAT;")
	private static Class13[] aClass13Array1 = new Class13[5000];

	@OriginalMember(owner = "client!GRRWPPAT", name = "c", descriptor = "[I")
	public static int[] anIntArray42 = new int[5000];

	@OriginalMember(owner = "client!GRRWPPAT", name = "g", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!GRRWPPAT", name = "h", descriptor = "I")
	private int anInt138;

	@OriginalMember(owner = "client!GRRWPPAT", name = "f", descriptor = "[Lclient!OZEEIHVG;")
	private Class33[] aClass33Array1 = new Class33[10];

	@OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(BLclient!RGCGKKUR;)V")
	public static void method102(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			aByteArray3 = new byte[441000];
			aClass6_Sub1_Sub4_2 = new Class6_Sub1_Sub4(aByteArray3, (byte) -17);
			Class33.method370();
			while (true) {
				@Pc(22) int local22 = arg0.method413();
				if (local22 == 65535) {
					return;
				}
				aClass13Array1[local22] = new Class13(0);
				aClass13Array1[local22].method104(arg0);
				anIntArray42[local22] = aClass13Array1[local22].method105();
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("83172, " + 6 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(III)Lclient!RGCGKKUR;")
	public static Class6_Sub1_Sub4 method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass13Array1[arg0] == null) {
				return null;
			} else {
				@Pc(11) Class13 local11 = aClass13Array1[arg0];
				return local11.method106(arg1);
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("51350, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRRWPPAT", name = "<init>", descriptor = "(I)V")
	private Class13(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(ILclient!RGCGKKUR;)V")
	private void method104(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method411();
				if (local6 != 0) {
					arg0.anInt704--;
					this.aClass33Array1[local1] = new Class33();
					this.aClass33Array1[local1].method373(arg0);
				}
			}
			this.anInt137 = arg0.method413();
			this.anInt138 = arg0.method413();
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("71579, " + 5 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(Z)I")
	private int method105() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass33Array1[local5] != null && this.aClass33Array1[local5].anInt634 / 20 < local3) {
					local3 = this.aClass33Array1[local5].anInt634 / 20;
				}
			}
			if (this.anInt137 < this.anInt138 && this.anInt137 / 20 < local3) {
				local3 = this.anInt137 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass33Array1[local58] != null) {
					this.aClass33Array1[local58].anInt634 -= local3 * 20;
				}
			}
			if (this.anInt137 < this.anInt138) {
				this.anInt137 -= local3 * 20;
				this.anInt138 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("93332, " + false + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(BI)Lclient!RGCGKKUR;")
	private Class6_Sub1_Sub4 method106(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method107(arg0);
			aClass6_Sub1_Sub4_2.anInt704 = 0;
			aClass6_Sub1_Sub4_2.method405(1380533830);
			aClass6_Sub1_Sub4_2.method406(local3 + 36);
			aClass6_Sub1_Sub4_2.method405(1463899717);
			aClass6_Sub1_Sub4_2.method405(1718449184);
			aClass6_Sub1_Sub4_2.method406(16);
			aClass6_Sub1_Sub4_2.method403(1);
			aClass6_Sub1_Sub4_2.method403(1);
			aClass6_Sub1_Sub4_2.method406(22050);
			aClass6_Sub1_Sub4_2.method406(22050);
			aClass6_Sub1_Sub4_2.method403(1);
			aClass6_Sub1_Sub4_2.method403(8);
			aClass6_Sub1_Sub4_2.method405(1684108385);
			aClass6_Sub1_Sub4_2.method406(local3);
			aClass6_Sub1_Sub4_2.anInt704 += local3;
			return aClass6_Sub1_Sub4_2;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("83702, " + -1 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GRRWPPAT", name = "a", descriptor = "(I)I")
	private int method107(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass33Array1[local5] != null && this.aClass33Array1[local5].anInt633 + this.aClass33Array1[local5].anInt634 > local3) {
				local3 = this.aClass33Array1[local5].anInt633 + this.aClass33Array1[local5].anInt634;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt137 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt138 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray3[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass33Array1[local106] != null) {
				local123 = this.aClass33Array1[local106].anInt633 * 22050 / 1000;
				local133 = this.aClass33Array1[local106].anInt634 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass33Array1[local106].method371(local123, this.aClass33Array1[local106].anInt633);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray3[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray3[local133 + local123] = aByteArray3[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray3[local147 + local123] = aByteArray3[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
