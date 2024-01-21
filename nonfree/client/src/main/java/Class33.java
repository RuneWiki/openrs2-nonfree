import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private static int anInt800;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(30, 0);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt801;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt802;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt808;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private boolean aBoolean225 = true;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private int anInt799 = 848;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt803 = -1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray226 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
	private int[] anIntArray227 = new int[6];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt804 = 128;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt805 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method513(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("spotanim.dat", null));
			anInt800 = local10.method474();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt800];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt800; local29++) {
				if (aClass33Array1[local29] == null) {
					aClass33Array1[local29] = new Class33();
				}
				aClass33Array1[local29].anInt801 = local29;
				aClass33Array1[local29].method514(local10);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("53323, " + 645 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method514(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method472();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt802 = arg0.method474();
				} else if (local11 == 2) {
					this.anInt803 = arg0.method474();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt803];
					}
				} else if (local11 == 4) {
					this.anInt804 = arg0.method474();
				} else if (local11 == 5) {
					this.anInt805 = arg0.method474();
				} else if (local11 == 6) {
					this.anInt806 = arg0.method474();
				} else if (local11 == 7) {
					this.anInt807 = arg0.method472();
				} else if (local11 == 8) {
					this.anInt808 = arg0.method472();
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray226[local11 - 40] = arg0.method474();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray227[local11 - 50] = arg0.method474();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local11);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("28007, " + arg0 + ", " + -32477 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method515() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method583((long) this.anInt801);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method259(this.aBoolean225, this.anInt802);
		if (local6 == null) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
			if (this.anIntArray226[0] != 0) {
				local6.method273(this.anIntArray226[local22], this.anIntArray227[local22]);
			}
		}
		aClass40_9.method584((long) this.anInt801, local6, this.anInt799);
		return local6;
	}
}
