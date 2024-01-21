import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OPHZBIVR")
public final class Class33 {

	@OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "I")
	private static int anInt497;

	@OriginalMember(owner = "client!OPHZBIVR", name = "b", descriptor = "[Lclient!OPHZBIVR;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!OPHZBIVR", name = "n", descriptor = "Lclient!NVDACYAH;")
	public static Class30 aClass30_6 = new Class30(false, 30);

	@OriginalMember(owner = "client!OPHZBIVR", name = "c", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!OPHZBIVR", name = "d", descriptor = "I")
	private int anInt499;

	@OriginalMember(owner = "client!OPHZBIVR", name = "f", descriptor = "Lclient!QBINVEVU;")
	public Class36 aClass36_1;

	@OriginalMember(owner = "client!OPHZBIVR", name = "k", descriptor = "I")
	public int anInt503;

	@OriginalMember(owner = "client!OPHZBIVR", name = "l", descriptor = "I")
	public int anInt504;

	@OriginalMember(owner = "client!OPHZBIVR", name = "m", descriptor = "I")
	public int anInt505;

	@OriginalMember(owner = "client!OPHZBIVR", name = "e", descriptor = "I")
	private int anInt500 = -1;

	@OriginalMember(owner = "client!OPHZBIVR", name = "g", descriptor = "[I")
	private int[] anIntArray119 = new int[6];

	@OriginalMember(owner = "client!OPHZBIVR", name = "h", descriptor = "[I")
	private int[] anIntArray120 = new int[6];

	@OriginalMember(owner = "client!OPHZBIVR", name = "i", descriptor = "I")
	public int anInt501 = 128;

	@OriginalMember(owner = "client!OPHZBIVR", name = "j", descriptor = "I")
	public int anInt502 = 128;

	@OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "(Lclient!NXFIIFAD;I)V")
	public static void method353(@OriginalArg(0) Class31 arg0) {
		try {
			@Pc(8) Class1_Sub2_Sub3 local8 = new Class1_Sub2_Sub3(arg0.method352("spotanim.dat", null), -670);
			anInt497 = local8.method309();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt497];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt497; local22++) {
				if (aClass33Array1[local22] == null) {
					aClass33Array1[local22] = new Class33();
				}
				aClass33Array1[local22].anInt498 = local22;
				aClass33Array1[local22].method354(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("56601, " + arg0 + ", " + 24570 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPHZBIVR", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	private void method354(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method307();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt499 = arg0.method309();
				} else if (local10 == 2) {
					this.anInt500 = arg0.method309();
					if (Class36.aClass36Array1 != null) {
						this.aClass36_1 = Class36.aClass36Array1[this.anInt500];
					}
				} else if (local10 == 4) {
					this.anInt501 = arg0.method309();
				} else if (local10 == 5) {
					this.anInt502 = arg0.method309();
				} else if (local10 == 6) {
					this.anInt503 = arg0.method309();
				} else if (local10 == 7) {
					this.anInt504 = arg0.method307();
				} else if (local10 == 8) {
					this.anInt505 = arg0.method307();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray119[local10 - 40] = arg0.method309();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray120[local10 - 50] = arg0.method309();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("18043, " + arg0 + ", " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OPHZBIVR", name = "a", descriptor = "()Lclient!IRLTEWJP;")
	public Class1_Sub2_Sub2_Sub3 method355() {
		@Pc(6) Class1_Sub2_Sub2_Sub3 local6 = (Class1_Sub2_Sub2_Sub3) aClass30_6.method348((long) this.anInt498);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub2_Sub2_Sub3.method196(this.anInt499);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray119[0] != 0) {
				local6.method210(this.anIntArray119[local20], this.anIntArray120[local20]);
			}
		}
		aClass30_6.method349((long) this.anInt498, local6);
		return local6;
	}
}
