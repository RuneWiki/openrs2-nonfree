import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MIIGCDHS")
public final class Class24 {

	@OriginalMember(owner = "client!MIIGCDHS", name = "d", descriptor = "I")
	public static int anInt372;

	@OriginalMember(owner = "client!MIIGCDHS", name = "e", descriptor = "[Lclient!MIIGCDHS;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!MIIGCDHS", name = "c", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!MIIGCDHS", name = "g", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!MIIGCDHS", name = "b", descriptor = "I")
	private int anInt370 = 7;

	@OriginalMember(owner = "client!MIIGCDHS", name = "f", descriptor = "I")
	public int anInt373 = -1;

	@OriginalMember(owner = "client!MIIGCDHS", name = "h", descriptor = "[I")
	private int[] anIntArray87 = new int[6];

	@OriginalMember(owner = "client!MIIGCDHS", name = "i", descriptor = "[I")
	private int[] anIntArray88 = new int[6];

	@OriginalMember(owner = "client!MIIGCDHS", name = "j", descriptor = "[I")
	private int[] anIntArray89 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!MIIGCDHS", name = "k", descriptor = "Z")
	public boolean aBoolean99 = false;

	@OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(ZLclient!FXNTEMPE;)V")
	public static void method237(@OriginalArg(1) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(arg0.method117("idk.dat", null), -46859);
			anInt372 = local8.method342();
			if (aClass24Array1 == null) {
				aClass24Array1 = new Class24[anInt372];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt372; local21++) {
				if (aClass24Array1[local21] == null) {
					aClass24Array1[local21] = new Class24();
				}
				aClass24Array1[local21].method238(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("80341, " + true + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MIIGCDHS", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(Lclient!RSWRPCHR;B)V")
	private void method238(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method340();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt373 = arg0.method340();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method340();
					this.anIntArray86 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray86[local34] = arg0.method342();
					}
				} else if (local10 == 3) {
					this.aBoolean99 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray87[local10 - 40] = arg0.method342();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray88[local10 - 50] = arg0.method342();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray89[local10 - 60] = arg0.method342();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("95382, " + arg0 + ", " + 46 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(I)Z")
	public boolean method239(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 5) {
				throw new NullPointerException();
			} else if (this.anIntArray86 == null) {
				return true;
			} else {
				@Pc(13) boolean local13 = true;
				for (@Pc(15) int local15 = 0; local15 < this.anIntArray86.length; local15++) {
					if (!Class2_Sub1_Sub3_Sub5.method424(this.anIntArray86[local15])) {
						local13 = false;
					}
				}
				return local13;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("81813, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(Z)Lclient!WRJMHIDY;")
	public Class2_Sub1_Sub3_Sub5 method240(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt371 = 21;
			}
			if (this.anIntArray86 == null) {
				return null;
			}
			@Pc(16) Class2_Sub1_Sub3_Sub5[] local16 = new Class2_Sub1_Sub3_Sub5[this.anIntArray86.length];
			for (@Pc(18) int local18 = 0; local18 < this.anIntArray86.length; local18++) {
				local16[local18] = Class2_Sub1_Sub3_Sub5.method423(this.anIntArray86[local18]);
			}
			@Pc(42) Class2_Sub1_Sub3_Sub5 local42;
			if (local16.length == 1) {
				local42 = local16[0];
			} else {
				local42 = new Class2_Sub1_Sub3_Sub5(local16, local16.length, this.aBoolean98);
			}
			for (@Pc(55) int local55 = 0; local55 < 6 && this.anIntArray87[local55] != 0; local55++) {
				local42.method437(this.anIntArray87[local55], this.anIntArray88[local55]);
			}
			return local42;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("43988, " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MIIGCDHS", name = "b", descriptor = "(I)Z")
	public boolean method241() {
		try {
			@Pc(1) boolean local1 = true;
			for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
				if (this.anIntArray89[local9] != -1 && !Class2_Sub1_Sub3_Sub5.method424(this.anIntArray89[local9])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("58478, " + -986 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MIIGCDHS", name = "c", descriptor = "(I)Lclient!WRJMHIDY;")
	public Class2_Sub1_Sub3_Sub5 method242() {
		try {
			@Pc(4) Class2_Sub1_Sub3_Sub5[] local4 = new Class2_Sub1_Sub3_Sub5[5];
			@Pc(6) int local6 = 0;
			for (@Pc(13) int local13 = 0; local13 < 5; local13++) {
				if (this.anIntArray89[local13] != -1) {
					local4[local6++] = Class2_Sub1_Sub3_Sub5.method423(this.anIntArray89[local13]);
				}
			}
			@Pc(42) Class2_Sub1_Sub3_Sub5 local42 = new Class2_Sub1_Sub3_Sub5(local4, local6, this.aBoolean98);
			for (@Pc(44) int local44 = 0; local44 < 6 && this.anIntArray87[local44] != 0; local44++) {
				local42.method437(this.anIntArray87[local44], this.anIntArray88[local44]);
			}
			return local42;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("78872, " + -911 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
