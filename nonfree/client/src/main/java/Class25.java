import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MUDLUUBC")
public final class Class25 {

	@OriginalMember(owner = "client!MUDLUUBC", name = "c", descriptor = "I")
	private static int anInt484;

	@OriginalMember(owner = "client!MUDLUUBC", name = "d", descriptor = "[Lclient!MUDLUUBC;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!MUDLUUBC", name = "b", descriptor = "Z")
	private static boolean aBoolean115 = true;

	@OriginalMember(owner = "client!MUDLUUBC", name = "p", descriptor = "Lclient!GCPOSBWX;")
	public static Class13 aClass13_7 = new Class13(false, 30);

	@OriginalMember(owner = "client!MUDLUUBC", name = "e", descriptor = "I")
	private int anInt485;

	@OriginalMember(owner = "client!MUDLUUBC", name = "f", descriptor = "I")
	private int anInt486;

	@OriginalMember(owner = "client!MUDLUUBC", name = "h", descriptor = "Lclient!LKGEGIEW;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!MUDLUUBC", name = "m", descriptor = "I")
	public int anInt490;

	@OriginalMember(owner = "client!MUDLUUBC", name = "n", descriptor = "I")
	public int anInt491;

	@OriginalMember(owner = "client!MUDLUUBC", name = "o", descriptor = "I")
	public int anInt492;

	@OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "I")
	private int anInt483 = 9;

	@OriginalMember(owner = "client!MUDLUUBC", name = "g", descriptor = "I")
	private int anInt487 = -1;

	@OriginalMember(owner = "client!MUDLUUBC", name = "i", descriptor = "[I")
	private int[] anIntArray82 = new int[6];

	@OriginalMember(owner = "client!MUDLUUBC", name = "j", descriptor = "[I")
	private int[] anIntArray83 = new int[6];

	@OriginalMember(owner = "client!MUDLUUBC", name = "k", descriptor = "I")
	public int anInt488 = 128;

	@OriginalMember(owner = "client!MUDLUUBC", name = "l", descriptor = "I")
	public int anInt489 = 128;

	@OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "(ILclient!XTGLDHGX;)V")
	public static void method307(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method484("spotanim.dat", null), 891);
			anInt484 = local8.method270();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt484];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt484; local26++) {
				if (aClass25Array1[local26] == null) {
					aClass25Array1[local26] = new Class25();
				}
				aClass25Array1[local26].anInt485 = local26;
				aClass25Array1[local26].method308(local8);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("33647, " + 0 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUDLUUBC", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "(ZLclient!MBMGIXGO;)V")
	private void method308(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method268();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt486 = arg0.method270();
				} else if (local10 == 2) {
					this.anInt487 = arg0.method270();
					if (Class22.aClass22Array1 != null) {
						this.aClass22_1 = Class22.aClass22Array1[this.anInt487];
					}
				} else if (local10 == 4) {
					this.anInt488 = arg0.method270();
				} else if (local10 == 5) {
					this.anInt489 = arg0.method270();
				} else if (local10 == 6) {
					this.anInt490 = arg0.method270();
				} else if (local10 == 7) {
					this.anInt491 = arg0.method268();
				} else if (local10 == 8) {
					this.anInt492 = arg0.method268();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray82[local10 - 40] = arg0.method270();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray83[local10 - 50] = arg0.method270();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("51394, " + true + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUDLUUBC", name = "a", descriptor = "()Lclient!ZKARKDQW;")
	public Class1_Sub1_Sub2_Sub6 method309() {
		@Pc(6) Class1_Sub1_Sub2_Sub6 local6 = (Class1_Sub1_Sub2_Sub6) aClass13_7.method176((long) this.anInt485);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub2_Sub6.method534(this.anInt483, this.anInt486);
		if (local6 == null) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
			if (this.anIntArray82[0] != 0) {
				local6.method548(this.anIntArray82[local22], this.anIntArray83[local22]);
			}
		}
		aClass13_7.method177(local6, (long) this.anInt485);
		return local6;
	}
}
