import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qc")
public final class Class35 {

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	private static int anInt841;

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "[Lclient!qc;")
	public static Class35[] aClass35Array1;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
	private static int anInt840 = 6771;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!s;")
	public static Class39 aClass39_9 = new Class39(30, false);

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
	private int anInt843;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!oc;")
	public Class29 aClass29_2;

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public int anInt849;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
	private int anInt844 = -1;

	@OriginalMember(owner = "client!qc", name = "i", descriptor = "[I")
	private int[] anIntArray241 = new int[6];

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "[I")
	private int[] anIntArray242 = new int[6];

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public int anInt845 = 128;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public int anInt846 = 128;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method544(@OriginalArg(1) Class48 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method689("spotanim.dat", null), true);
			anInt841 = local10.method505();
			@Pc(18) int local18;
			if (anInt840 != 6771) {
				for (local18 = 1; local18 > 0; local18++) {
				}
			}
			if (aClass35Array1 == null) {
				aClass35Array1 = new Class35[anInt841];
			}
			for (local18 = 0; local18 < anInt841; local18++) {
				if (aClass35Array1[local18] == null) {
					aClass35Array1[local18] = new Class35();
				}
				aClass35Array1[local18].anInt842 = local18;
				aClass35Array1[local18].method545(local10);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("94637, " + 6771 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
	private Class35() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!mb;)V")
	private void method545(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method503();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt843 = arg0.method505();
				} else if (local15 == 2) {
					this.anInt844 = arg0.method505();
					if (Class29.aClass29Array1 != null) {
						this.aClass29_2 = Class29.aClass29Array1[this.anInt844];
					}
				} else if (local15 == 4) {
					this.anInt845 = arg0.method505();
				} else if (local15 == 5) {
					this.anInt846 = arg0.method505();
				} else if (local15 == 6) {
					this.anInt847 = arg0.method505();
				} else if (local15 == 7) {
					this.anInt848 = arg0.method503();
				} else if (local15 == 8) {
					this.anInt849 = arg0.method503();
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray241[local15 - 40] = arg0.method505();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray242[local15 - 50] = arg0.method505();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local15);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("92322, " + 44 + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method546() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass39_9.method604((long) this.anInt842);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method256(this.anInt843, 196);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray241[0] != 0) {
				local6.method270(this.anIntArray241[local21], this.anIntArray242[local21]);
			}
		}
		aClass39_9.method605(local6, (long) this.anInt842);
		return local6;
	}
}
