import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UAVNMKVJ")
public final class Class44 {

	@OriginalMember(owner = "client!UAVNMKVJ", name = "a", descriptor = "Z")
	private static boolean aBoolean156;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "b", descriptor = "I")
	private static int anInt722;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "c", descriptor = "[Lclient!UAVNMKVJ;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "o", descriptor = "Lclient!OOTLZHQB;")
	public static Class30 aClass30_9 = new Class30(30, 9);

	@OriginalMember(owner = "client!UAVNMKVJ", name = "d", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "e", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "g", descriptor = "Lclient!LCRVYGCP;")
	public Class23 aClass23_2;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "l", descriptor = "I")
	public int anInt728;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "m", descriptor = "I")
	public int anInt729;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "n", descriptor = "I")
	public int anInt730;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "f", descriptor = "I")
	private int anInt725 = -1;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "h", descriptor = "[I")
	private int[] anIntArray181 = new int[6];

	@OriginalMember(owner = "client!UAVNMKVJ", name = "i", descriptor = "[I")
	private int[] anIntArray182 = new int[6];

	@OriginalMember(owner = "client!UAVNMKVJ", name = "j", descriptor = "I")
	public int anInt726 = 128;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "k", descriptor = "I")
	public int anInt727 = 128;

	@OriginalMember(owner = "client!UAVNMKVJ", name = "a", descriptor = "(ILclient!HRXSNEYZ;)V")
	public static void method461(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method220("spotanim.dat", null), 8);
			anInt722 = local8.method240();
			if (aClass44Array1 == null) {
				aClass44Array1 = new Class44[anInt722];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt722; local18++) {
				if (aClass44Array1[local18] == null) {
					aClass44Array1[local18] = new Class44();
				}
				aClass44Array1[local18].anInt723 = local18;
				aClass44Array1[local18].method462(local8);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("6983, " + 309 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAVNMKVJ", name = "<init>", descriptor = "()V")
	private Class44() {
	}

	@OriginalMember(owner = "client!UAVNMKVJ", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	private void method462(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method238();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt724 = arg0.method240();
				} else if (local13 == 2) {
					this.anInt725 = arg0.method240();
					if (Class23.aClass23Array1 != null) {
						this.aClass23_2 = Class23.aClass23Array1[this.anInt725];
					}
				} else if (local13 == 4) {
					this.anInt726 = arg0.method240();
				} else if (local13 == 5) {
					this.anInt727 = arg0.method240();
				} else if (local13 == 6) {
					this.anInt728 = arg0.method240();
				} else if (local13 == 7) {
					this.anInt729 = arg0.method238();
				} else if (local13 == 8) {
					this.anInt730 = arg0.method238();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray181[local13 - 40] = arg0.method240();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray182[local13 - 50] = arg0.method240();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("93834, " + arg0 + ", " + 0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UAVNMKVJ", name = "a", descriptor = "()Lclient!RTQSBWRH;")
	public Class1_Sub1_Sub2_Sub6 method463() {
		@Pc(6) Class1_Sub1_Sub2_Sub6 local6 = (Class1_Sub1_Sub2_Sub6) aClass30_9.method329((long) this.anInt723);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub2_Sub6.method415(this.anInt724);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray181[0] != 0) {
				local6.method429(this.anIntArray181[local21], this.anIntArray182[local21]);
			}
		}
		aClass30_9.method330((long) this.anInt723, local6, (byte) 8);
		return local6;
	}
}
