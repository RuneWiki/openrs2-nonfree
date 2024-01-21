import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OKJTNJLE")
public final class Class28 {

	@OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "I")
	private static int anInt347;

	@OriginalMember(owner = "client!OKJTNJLE", name = "b", descriptor = "[Lclient!OKJTNJLE;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!OKJTNJLE", name = "n", descriptor = "Lclient!YITKGHWB;")
	public static Class46 aClass46_6 = new Class46(30, (byte) 6);

	@OriginalMember(owner = "client!OKJTNJLE", name = "c", descriptor = "I")
	private int anInt348;

	@OriginalMember(owner = "client!OKJTNJLE", name = "d", descriptor = "I")
	private int anInt349;

	@OriginalMember(owner = "client!OKJTNJLE", name = "f", descriptor = "Lclient!BKDXLPEF;")
	public Class2 aClass2_2;

	@OriginalMember(owner = "client!OKJTNJLE", name = "k", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!OKJTNJLE", name = "l", descriptor = "I")
	public int anInt354;

	@OriginalMember(owner = "client!OKJTNJLE", name = "m", descriptor = "I")
	public int anInt355;

	@OriginalMember(owner = "client!OKJTNJLE", name = "e", descriptor = "I")
	private int anInt350 = -1;

	@OriginalMember(owner = "client!OKJTNJLE", name = "g", descriptor = "[I")
	private int[] anIntArray117 = new int[6];

	@OriginalMember(owner = "client!OKJTNJLE", name = "h", descriptor = "[I")
	private int[] anIntArray118 = new int[6];

	@OriginalMember(owner = "client!OKJTNJLE", name = "i", descriptor = "I")
	public int anInt351 = 128;

	@OriginalMember(owner = "client!OKJTNJLE", name = "j", descriptor = "I")
	public int anInt352 = 128;

	@OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "(BLclient!XOJZVVDK;)V")
	public static void method186(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(12) Class6_Sub1_Sub4 local12 = new Class6_Sub1_Sub4(888, arg0.method518("spotanim.dat", (byte[]) null));
			anInt347 = local12.method241();
			if (aClass28Array1 == null) {
				aClass28Array1 = new Class28[anInt347];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt347; local22++) {
				if (aClass28Array1[local22] == null) {
					aClass28Array1[local22] = new Class28();
				}
				aClass28Array1[local22].anInt348 = local22;
				aClass28Array1[local22].method187(local12);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("8280, " + -82 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKJTNJLE", name = "<init>", descriptor = "()V")
	private Class28() {
	}

	@OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	private void method187(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method239();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt349 = arg0.method241();
				} else if (local13 == 2) {
					this.anInt350 = arg0.method241();
					if (Class2.aClass2Array1 != null) {
						this.aClass2_2 = Class2.aClass2Array1[this.anInt350];
					}
				} else if (local13 == 4) {
					this.anInt351 = arg0.method241();
				} else if (local13 == 5) {
					this.anInt352 = arg0.method241();
				} else if (local13 == 6) {
					this.anInt353 = arg0.method241();
				} else if (local13 == 7) {
					this.anInt354 = arg0.method239();
				} else if (local13 == 8) {
					this.anInt355 = arg0.method239();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray117[local13 - 40] = arg0.method241();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray118[local13 - 50] = arg0.method241();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("30123, " + arg0 + ", " + false + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKJTNJLE", name = "a", descriptor = "()Lclient!FLXAIVEA;")
	public Class6_Sub1_Sub2_Sub2 method188() {
		@Pc(6) Class6_Sub1_Sub2_Sub2 local6 = (Class6_Sub1_Sub2_Sub2) aClass46_6.method529((long) this.anInt348);
		if (local6 != null) {
			return local6;
		}
		local6 = Class6_Sub1_Sub2_Sub2.method86(this.anInt349);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray117[0] != 0) {
				local6.method100(this.anIntArray117[local20], this.anIntArray118[local20]);
			}
		}
		aClass46_6.method530(local6, (long) this.anInt348);
		return local6;
	}
}
