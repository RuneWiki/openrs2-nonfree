import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EBBSHPSJ")
public final class Class12 {

	@OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "I")
	private static int anInt100;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "b", descriptor = "[Lclient!EBBSHPSJ;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "n", descriptor = "Lclient!QASTZCLF;")
	public static Class33 aClass33_1 = new Class33(30, false);

	@OriginalMember(owner = "client!EBBSHPSJ", name = "c", descriptor = "I")
	private int anInt101;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "d", descriptor = "I")
	private int anInt102;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "f", descriptor = "Lclient!XTKQUJNF;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "k", descriptor = "I")
	public int anInt106;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "l", descriptor = "I")
	public int anInt107;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "m", descriptor = "I")
	public int anInt108;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "e", descriptor = "I")
	private int anInt103 = -1;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "g", descriptor = "[I")
	private int[] anIntArray35 = new int[6];

	@OriginalMember(owner = "client!EBBSHPSJ", name = "h", descriptor = "[I")
	private int[] anIntArray36 = new int[6];

	@OriginalMember(owner = "client!EBBSHPSJ", name = "i", descriptor = "I")
	public int anInt104 = 128;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "j", descriptor = "I")
	public int anInt105 = 128;

	@OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "(Lclient!AWEEREDT;I)V")
	public static void method73(@OriginalArg(0) Class2 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method14("spotanim.dat", null), 713);
			anInt100 = local8.method154();
			if (aClass12Array1 == null) {
				aClass12Array1 = new Class12[anInt100];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt100; local18++) {
				if (aClass12Array1[local18] == null) {
					aClass12Array1[local18] = new Class12();
				}
				aClass12Array1[local18].anInt101 = local18;
				aClass12Array1[local18].method74(local8);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("71435, " + arg0 + ", " + 0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBBSHPSJ", name = "<init>", descriptor = "()V")
	private Class12() {
	}

	@OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "(Lclient!IUVBENCV;B)V")
	private void method74(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method152();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt102 = arg0.method154();
				} else if (local11 == 2) {
					this.anInt103 = arg0.method154();
					if (Class46.aClass46Array1 != null) {
						this.aClass46_1 = Class46.aClass46Array1[this.anInt103];
					}
				} else if (local11 == 4) {
					this.anInt104 = arg0.method154();
				} else if (local11 == 5) {
					this.anInt105 = arg0.method154();
				} else if (local11 == 6) {
					this.anInt106 = arg0.method154();
				} else if (local11 == 7) {
					this.anInt107 = arg0.method152();
				} else if (local11 == 8) {
					this.anInt108 = arg0.method152();
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray35[local11 - 40] = arg0.method154();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray36[local11 - 50] = arg0.method154();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local11);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("90219, " + arg0 + ", " + 1 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EBBSHPSJ", name = "a", descriptor = "()Lclient!JJMVUSJJ;")
	public Class8_Sub1_Sub1_Sub5 method75() {
		@Pc(6) Class8_Sub1_Sub1_Sub5 local6 = (Class8_Sub1_Sub1_Sub5) aClass33_1.method367((long) this.anInt101);
		if (local6 != null) {
			return local6;
		}
		local6 = Class8_Sub1_Sub1_Sub5.method210(this.anInt102);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray35[0] != 0) {
				local6.method224(this.anIntArray35[local20], this.anIntArray36[local20]);
			}
		}
		aClass33_1.method368(local6, (long) this.anInt101);
		return local6;
	}
}
