import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FGIDBWCJ")
public final class Class10 {

	@OriginalMember(owner = "client!FGIDBWCJ", name = "c", descriptor = "I")
	public static int anInt232;

	@OriginalMember(owner = "client!FGIDBWCJ", name = "d", descriptor = "[Lclient!FGIDBWCJ;")
	public static Class10[] aClass10Array1;

	@OriginalMember(owner = "client!FGIDBWCJ", name = "b", descriptor = "I")
	private static int anInt231 = 1;

	@OriginalMember(owner = "client!FGIDBWCJ", name = "f", descriptor = "[I")
	private int[] anIntArray36;

	@OriginalMember(owner = "client!FGIDBWCJ", name = "a", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!FGIDBWCJ", name = "e", descriptor = "I")
	public int anInt233 = -1;

	@OriginalMember(owner = "client!FGIDBWCJ", name = "g", descriptor = "[I")
	private int[] anIntArray37 = new int[6];

	@OriginalMember(owner = "client!FGIDBWCJ", name = "h", descriptor = "[I")
	private int[] anIntArray38 = new int[6];

	@OriginalMember(owner = "client!FGIDBWCJ", name = "i", descriptor = "[I")
	private int[] anIntArray39 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!FGIDBWCJ", name = "j", descriptor = "Z")
	public boolean aBoolean41 = false;

	@OriginalMember(owner = "client!FGIDBWCJ", name = "a", descriptor = "(Lclient!DTIATKJO;I)V")
	public static void method68(@OriginalArg(0) Class7 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub2 local8 = new Class3_Sub1_Sub2(-527, arg0.method30("idk.dat", null));
			anInt232 = local8.method91();
			if (aClass10Array1 == null) {
				aClass10Array1 = new Class10[anInt232];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt232; local26++) {
				if (aClass10Array1[local26] == null) {
					aClass10Array1[local26] = new Class10();
				}
				aClass10Array1[local26].method69(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("57150, " + arg0 + ", " + 1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGIDBWCJ", name = "<init>", descriptor = "()V")
	private Class10() {
	}

	@OriginalMember(owner = "client!FGIDBWCJ", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	private void method69(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method89();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt233 = arg0.method89();
				} else if (local10 == 2) {
					@Pc(28) int local28 = arg0.method89();
					this.anIntArray36 = new int[local28];
					for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
						this.anIntArray36[local34] = arg0.method91();
					}
				} else if (local10 == 3) {
					this.aBoolean41 = true;
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray37[local10 - 40] = arg0.method91();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray38[local10 - 50] = arg0.method91();
				} else if (local10 >= 60 && local10 < 70) {
					this.anIntArray39[local10 - 60] = arg0.method91();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("69819, " + arg0 + ", " + 0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGIDBWCJ", name = "a", descriptor = "(B)Z")
	public boolean method70() {
		try {
			if (this.anIntArray36 == null) {
				return true;
			}
			@Pc(18) boolean local18 = true;
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray36.length; local20++) {
				if (!Class3_Sub1_Sub1_Sub3.method322(this.anIntArray36[local20])) {
					local18 = false;
				}
			}
			return local18;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("83624, " + 6 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGIDBWCJ", name = "b", descriptor = "(B)Lclient!OQIGXOFQ;")
	public Class3_Sub1_Sub1_Sub3 method71() {
		try {
			if (this.anIntArray36 == null) {
				return null;
			}
			@Pc(22) Class3_Sub1_Sub1_Sub3[] local22 = new Class3_Sub1_Sub1_Sub3[this.anIntArray36.length];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray36.length; local24++) {
				local22[local24] = Class3_Sub1_Sub1_Sub3.method321(this.anIntArray36[local24]);
			}
			@Pc(48) Class3_Sub1_Sub1_Sub3 local48;
			if (local22.length == 1) {
				local48 = local22[0];
			} else {
				local48 = new Class3_Sub1_Sub1_Sub3(local22.length, -537, local22);
			}
			for (@Pc(60) int local60 = 0; local60 < 6 && this.anIntArray37[local60] != 0; local60++) {
				local48.method335(this.anIntArray37[local60], this.anIntArray38[local60]);
			}
			return local48;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("97650, " + 81 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGIDBWCJ", name = "a", descriptor = "(I)Z")
	public boolean method72(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) boolean local1 = true;
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
				if (this.anIntArray39[local7] != -1 && !Class3_Sub1_Sub1_Sub3.method322(this.anIntArray39[local7])) {
					local1 = false;
				}
			}
			return local1;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("22083, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGIDBWCJ", name = "a", descriptor = "(Z)Lclient!OQIGXOFQ;")
	public Class3_Sub1_Sub1_Sub3 method73(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(4) Class3_Sub1_Sub1_Sub3[] local4 = new Class3_Sub1_Sub1_Sub3[5];
			if (!arg0) {
				throw new NullPointerException();
			}
			@Pc(12) int local12 = 0;
			for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
				if (this.anIntArray39[local14] != -1) {
					local4[local12++] = Class3_Sub1_Sub1_Sub3.method321(this.anIntArray39[local14]);
				}
			}
			@Pc(42) Class3_Sub1_Sub1_Sub3 local42 = new Class3_Sub1_Sub1_Sub3(local12, -537, local4);
			for (@Pc(44) int local44 = 0; local44 < 6 && this.anIntArray37[local44] != 0; local44++) {
				local42.method335(this.anIntArray37[local44], this.anIntArray38[local44]);
			}
			return local42;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("57681, " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
