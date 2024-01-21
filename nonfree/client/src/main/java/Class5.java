import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!mb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
	public static int[] anIntArray22 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private int anInt221 = 20776;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!mb;I)V")
	public static void method73(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, true);
			Class7.method232();
			while (true) {
				@Pc(16) int local16 = arg0.method470();
				if (local16 == 65535) {
					return;
				}
				aClass5Array1[local16] = new Class5();
				aClass5Array1[local16].method75(arg0);
				anIntArray22[local16] = aClass5Array1[local16].method76();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("13030, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lclient!mb;")
	public static Class1_Sub1_Sub3 method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass5Array1[arg1] == null) {
				return null;
			} else {
				@Pc(14) Class5 local14 = aClass5Array1[arg1];
				return local14.method77(arg0);
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("95287, " + arg0 + ", " + arg1 + ", " + 3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method75(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method468();
				if (local6 != 0) {
					arg0.anInt777--;
					this.aClass7Array1[local1] = new Class7();
					this.aClass7Array1[local1].method235(arg0);
				}
			}
			this.anInt222 = arg0.method470();
			this.anInt223 = arg0.method470();
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("86957, " + 3251 + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method76() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt488 / 20 < local3) {
					local3 = this.aClass7Array1[local5].anInt488 / 20;
				}
			}
			if (this.anInt222 < this.anInt223 && this.anInt222 / 20 < local3) {
				local3 = this.anInt222 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(72) int local72 = 0; local72 < 10; local72++) {
				if (this.aClass7Array1[local72] != null) {
					this.aClass7Array1[local72].anInt488 -= local3 * 20;
				}
			}
			if (this.anInt222 < this.anInt223) {
				this.anInt222 -= local3 * 20;
				this.anInt223 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("35385, " + 8 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)Lclient!mb;")
	private Class1_Sub1_Sub3 method77(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method78(arg0);
			aClass1_Sub1_Sub3_1.anInt777 = 0;
			aClass1_Sub1_Sub3_1.method462(1380533830);
			aClass1_Sub1_Sub3_1.method463(local3 + 36);
			aClass1_Sub1_Sub3_1.method462(1463899717);
			aClass1_Sub1_Sub3_1.method462(1718449184);
			aClass1_Sub1_Sub3_1.method463(16);
			aClass1_Sub1_Sub3_1.method460(1, this.anInt221);
			aClass1_Sub1_Sub3_1.method460(1, this.anInt221);
			aClass1_Sub1_Sub3_1.method463(22050);
			aClass1_Sub1_Sub3_1.method463(22050);
			aClass1_Sub1_Sub3_1.method460(1, this.anInt221);
			aClass1_Sub1_Sub3_1.method460(8, this.anInt221);
			aClass1_Sub1_Sub3_1.method462(1684108385);
			aClass1_Sub1_Sub3_1.method463(local3);
			aClass1_Sub1_Sub3_1.anInt777 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("73968, " + 115 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	private int method78(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt487 + this.aClass7Array1[local5].anInt488 > local3) {
				local3 = this.aClass7Array1[local5].anInt487 + this.aClass7Array1[local5].anInt488;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt222 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt223 * 22050 / 1000;
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
				local123 = this.aClass7Array1[local106].anInt487 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt488 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method233(local123, this.aClass7Array1[local106].anInt487);
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
