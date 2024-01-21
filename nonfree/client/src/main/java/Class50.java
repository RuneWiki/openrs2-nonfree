import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZWYXHQWS")
public final class Class50 {

	@OriginalMember(owner = "client!ZWYXHQWS", name = "c", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!ZWYXHQWS", name = "d", descriptor = "[Lclient!ZWYXHQWS;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!ZWYXHQWS", name = "f", descriptor = "[I")
	private int[] anIntArray206;

	@OriginalMember(owner = "client!ZWYXHQWS", name = "a", descriptor = "I")
	private int anInt814 = 47202;

	@OriginalMember(owner = "client!ZWYXHQWS", name = "b", descriptor = "Z")
	private boolean aBoolean227 = false;

	@OriginalMember(owner = "client!ZWYXHQWS", name = "e", descriptor = "I")
	public int anInt816 = -1;

	@OriginalMember(owner = "client!ZWYXHQWS", name = "g", descriptor = "[I")
	private int[] anIntArray207 = new int[6];

	@OriginalMember(owner = "client!ZWYXHQWS", name = "h", descriptor = "[I")
	private int[] anIntArray208 = new int[6];

	@OriginalMember(owner = "client!ZWYXHQWS", name = "i", descriptor = "[I")
	private int[] anIntArray209 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ZWYXHQWS", name = "j", descriptor = "Z")
	public boolean aBoolean228 = false;

	@OriginalMember(owner = "client!ZWYXHQWS", name = "a", descriptor = "(ILclient!TKEGJSFV;)V")
	public static void method567(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(11) Class4_Sub1_Sub3 local11 = new Class4_Sub1_Sub3(arg0.method514("idk.dat", null), false);
			anInt815 = local11.method169();
			if (aClass50Array1 == null) {
				aClass50Array1 = new Class50[anInt815];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt815; local21++) {
				if (aClass50Array1[local21] == null) {
					aClass50Array1[local21] = new Class50();
				}
				aClass50Array1[local21].method568(local11);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("28154, " + 0 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWYXHQWS", name = "<init>", descriptor = "()V")
	private Class50() {
	}

	@OriginalMember(owner = "client!ZWYXHQWS", name = "a", descriptor = "(Lclient!EGCCHUZS;Z)V")
	private void method568(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method167();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt816 = arg0.method167();
				} else if (local9 == 2) {
					@Pc(27) int local27 = arg0.method167();
					this.anIntArray206 = new int[local27];
					for (@Pc(33) int local33 = 0; local33 < local27; local33++) {
						this.anIntArray206[local33] = arg0.method169();
					}
				} else if (local9 == 3) {
					this.aBoolean228 = true;
				} else if (local9 >= 40 && local9 < 50) {
					this.anIntArray207[local9 - 40] = arg0.method169();
				} else if (local9 >= 50 && local9 < 60) {
					this.anIntArray208[local9 - 50] = arg0.method169();
				} else if (local9 >= 60 && local9 < 70) {
					this.anIntArray209[local9 - 60] = arg0.method169();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("61242, " + arg0 + ", " + true + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWYXHQWS", name = "a", descriptor = "(B)Z")
	public boolean method569() {
		try {
			if (this.anIntArray206 == null) {
				return true;
			}
			@Pc(6) boolean local6 = true;
			for (@Pc(15) int local15 = 0; local15 < this.anIntArray206.length; local15++) {
				if (!Class4_Sub1_Sub1_Sub3.method284(this.anIntArray206[local15])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("72281, " + 108 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWYXHQWS", name = "b", descriptor = "(B)Lclient!IGXVZOHI;")
	public Class4_Sub1_Sub1_Sub3 method570(@OriginalArg(0) byte arg0) {
		try {
			if (this.anIntArray206 == null) {
				return null;
			}
			@Pc(11) Class4_Sub1_Sub1_Sub3[] local11 = new Class4_Sub1_Sub1_Sub3[this.anIntArray206.length];
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray206.length; local13++) {
				local11[local13] = Class4_Sub1_Sub1_Sub3.method283(this.anIntArray206[local13]);
			}
			@Pc(37) Class4_Sub1_Sub1_Sub3 local37;
			if (local11.length == 1) {
				local37 = local11[0];
			} else {
				local37 = new Class4_Sub1_Sub1_Sub3(true, local11.length, local11);
			}
			for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray207[local49] != 0; local49++) {
				local37.method297(this.anIntArray207[local49], this.anIntArray208[local49]);
			}
			if (arg0 == 5) {
				@Pc(75) boolean local75 = false;
			} else {
				this.aBoolean227 = !this.aBoolean227;
			}
			return local37;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("60951, " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWYXHQWS", name = "a", descriptor = "(Z)Z")
	public boolean method571() {
		try {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
				if (this.anIntArray209[local8] != -1 && !Class4_Sub1_Sub1_Sub3.method284(this.anIntArray209[local8])) {
					local6 = false;
				}
			}
			return local6;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("49651, " + true + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZWYXHQWS", name = "b", descriptor = "(Z)Lclient!IGXVZOHI;")
	public Class4_Sub1_Sub1_Sub3 method572() {
		try {
			@Pc(4) Class4_Sub1_Sub1_Sub3[] local4 = new Class4_Sub1_Sub1_Sub3[5];
			@Pc(6) int local6 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray209[local14] != -1) {
					local4[local6++] = Class4_Sub1_Sub1_Sub3.method283(this.anIntArray209[local14]);
				}
			}
			@Pc(42) Class4_Sub1_Sub1_Sub3 local42 = new Class4_Sub1_Sub1_Sub3(true, local6, local4);
			for (@Pc(44) int local44 = 0; local44 < 6 && this.anIntArray207[local44] != 0; local44++) {
				local42.method297(this.anIntArray207[local44], this.anIntArray208[local44]);
			}
			return local42;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("22350, " + true + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
