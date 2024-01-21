import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KTPZRJZJ")
public final class Class19 {

	@OriginalMember(owner = "client!KTPZRJZJ", name = "e", descriptor = "[B")
	private static byte[] aByteArray4;

	@OriginalMember(owner = "client!KTPZRJZJ", name = "f", descriptor = "Lclient!NHEPCMLW;")
	private static Class3_Sub1_Sub3 aClass3_Sub1_Sub3_3;

	@OriginalMember(owner = "client!KTPZRJZJ", name = "a", descriptor = "I")
	private static int anInt398 = -17039;

	@OriginalMember(owner = "client!KTPZRJZJ", name = "c", descriptor = "[Lclient!KTPZRJZJ;")
	private static Class19[] aClass19Array1 = new Class19[5000];

	@OriginalMember(owner = "client!KTPZRJZJ", name = "d", descriptor = "[I")
	public static int[] anIntArray110 = new int[5000];

	@OriginalMember(owner = "client!KTPZRJZJ", name = "h", descriptor = "I")
	private int anInt400;

	@OriginalMember(owner = "client!KTPZRJZJ", name = "i", descriptor = "I")
	private int anInt401;

	@OriginalMember(owner = "client!KTPZRJZJ", name = "b", descriptor = "I")
	private int anInt399 = 5;

	@OriginalMember(owner = "client!KTPZRJZJ", name = "g", descriptor = "[Lclient!SMALAPQM;")
	private Class35[] aClass35Array1 = new Class35[10];

	@OriginalMember(owner = "client!KTPZRJZJ", name = "a", descriptor = "(ILclient!NHEPCMLW;)V")
	public static void method211(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			aByteArray4 = new byte[441000];
			aClass3_Sub1_Sub3_3 = new Class3_Sub1_Sub3((byte) -103, aByteArray4);
			Class35.method375();
			while (true) {
				@Pc(18) int local18 = arg0.method276();
				if (local18 == 65535) {
					return;
				}
				aClass19Array1[local18] = new Class19(false);
				aClass19Array1[local18].method213(arg0);
				anIntArray110[local18] = aClass19Array1[local18].method214((byte) 3);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("91250, " + -351 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTPZRJZJ", name = "a", descriptor = "(IIZ)Lclient!NHEPCMLW;")
	public static Class3_Sub1_Sub3 method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass19Array1[arg1] == null) {
				return null;
			} else {
				@Pc(16) Class19 local16 = aClass19Array1[arg1];
				return local16.method215(arg0, 512);
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("39835, " + arg0 + ", " + arg1 + ", " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTPZRJZJ", name = "<init>", descriptor = "(Z)V")
	private Class19(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!KTPZRJZJ", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	private void method213(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < 10; local1++) {
				@Pc(6) int local6 = arg0.method274();
				if (local6 != 0) {
					arg0.anInt441--;
					this.aClass35Array1[local1] = new Class35();
					this.aClass35Array1[local1].method378(arg0);
				}
			}
			this.anInt400 = arg0.method276();
			this.anInt401 = arg0.method276();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("7085, " + false + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTPZRJZJ", name = "a", descriptor = "(B)I")
	private int method214(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass35Array1[local5] != null && this.aClass35Array1[local5].anInt569 / 20 < local3) {
					local3 = this.aClass35Array1[local5].anInt569 / 20;
				}
			}
			if (this.anInt400 < this.anInt401 && this.anInt400 / 20 < local3) {
				local3 = this.anInt400 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass35Array1[local58] != null) {
					this.aClass35Array1[local58].anInt569 -= local3 * 20;
				}
			}
			@Pc(85) boolean local85 = false;
			if (this.anInt400 < this.anInt401) {
				this.anInt400 -= local3 * 20;
				this.anInt401 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("98586, " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTPZRJZJ", name = "a", descriptor = "(II)Lclient!NHEPCMLW;")
	private Class3_Sub1_Sub3 method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.method216(arg0);
			aClass3_Sub1_Sub3_3.anInt441 = 0;
			aClass3_Sub1_Sub3_3.method268(1380533830);
			aClass3_Sub1_Sub3_3.method269(local3 + 36);
			aClass3_Sub1_Sub3_3.method268(1463899717);
			aClass3_Sub1_Sub3_3.method268(1718449184);
			aClass3_Sub1_Sub3_3.method269(16);
			aClass3_Sub1_Sub3_3.method266(1);
			aClass3_Sub1_Sub3_3.method266(1);
			aClass3_Sub1_Sub3_3.method269(22050);
			aClass3_Sub1_Sub3_3.method269(22050);
			aClass3_Sub1_Sub3_3.method266(1);
			aClass3_Sub1_Sub3_3.method266(8);
			aClass3_Sub1_Sub3_3.method268(1684108385);
			@Pc(56) boolean local56 = false;
			aClass3_Sub1_Sub3_3.method269(local3);
			aClass3_Sub1_Sub3_3.anInt441 += local3;
			return aClass3_Sub1_Sub3_3;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("29656, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KTPZRJZJ", name = "a", descriptor = "(I)I")
	private int method216(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass35Array1[local5] != null && this.aClass35Array1[local5].anInt568 + this.aClass35Array1[local5].anInt569 > local3) {
				local3 = this.aClass35Array1[local5].anInt568 + this.aClass35Array1[local5].anInt569;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = 22050 * local3 / 1000;
		@Pc(58) int local58 = 22050 * this.anInt400 / 1000;
		@Pc(65) int local65 = 22050 * this.anInt401 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray4[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass35Array1[local106] != null) {
				local123 = this.aClass35Array1[local106].anInt568 * 22050 / 1000;
				local133 = this.aClass35Array1[local106].anInt569 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass35Array1[local106].method376(local123, this.aClass35Array1[local106].anInt568);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray4[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray4[local133 + local123] = aByteArray4[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray4[local147 + local123] = aByteArray4[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
