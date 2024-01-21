import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private static int anInt802;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private static boolean aBoolean223 = true;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(30, (byte) 1);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt803;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt804;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt809;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt810;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt805 = -1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt806 = 128;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt807 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method521(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method666("spotanim.dat", null), (byte) -93);
			anInt802 = local8.method482();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt802];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt802; local26++) {
				if (aClass33Array1[local26] == null) {
					aClass33Array1[local26] = new Class33();
				}
				aClass33Array1[local26].anInt803 = local26;
				aClass33Array1[local26].method522(local8);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("69726, " + false + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method522(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method480();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt804 = arg0.method482();
				} else if (local13 == 2) {
					this.anInt805 = arg0.method482();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt805];
					}
				} else if (local13 == 4) {
					this.anInt806 = arg0.method482();
				} else if (local13 == 5) {
					this.anInt807 = arg0.method482();
				} else if (local13 == 6) {
					this.anInt808 = arg0.method482();
				} else if (local13 == 7) {
					this.anInt809 = arg0.method480();
				} else if (local13 == 8) {
					this.anInt810 = arg0.method480();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray229[local13 - 40] = arg0.method482();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray230[local13 - 50] = arg0.method482();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("28007, " + 210 + ", " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method523() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method591((long) this.anInt803);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method261(this.anInt804);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray229[0] != 0) {
				local6.method275(this.anIntArray229[local21], this.anIntArray230[local21]);
			}
		}
		aClass40_9.method592(local6, (long) this.anInt803);
		return local6;
	}
}
