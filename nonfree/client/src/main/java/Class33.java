import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private static boolean aBoolean209;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private static int anInt826;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(-739, 30);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt832;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "Z")
	private boolean aBoolean210 = true;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt829 = -1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt830 = 128;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt831 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!xb;)V")
	public static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) Class47 arg1) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg1.method666("spotanim.dat", null), -26728);
			anInt826 = local8.method482();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt826];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt826; local18++) {
				if (aClass33Array1[local18] == null) {
					aClass33Array1[local18] = new Class33();
				}
				aClass33Array1[local18].anInt827 = local18;
				aClass33Array1[local18].method522(local8);
			}
			if (arg0 != 0) {
				aBoolean209 = !aBoolean209;
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("2768, " + arg0 + ", " + arg1 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method522(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method480();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt828 = arg0.method482();
				} else if (local15 == 2) {
					this.anInt829 = arg0.method482();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt829];
					}
				} else if (local15 == 4) {
					this.anInt830 = arg0.method482();
				} else if (local15 == 5) {
					this.anInt831 = arg0.method482();
				} else if (local15 == 6) {
					this.anInt832 = arg0.method482();
				} else if (local15 == 7) {
					this.anInt833 = arg0.method480();
				} else if (local15 == 8) {
					this.anInt834 = arg0.method480();
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray229[local15 - 40] = arg0.method482();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray230[local15 - 50] = arg0.method482();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local15);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("74146, " + arg0 + ", " + 8 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method523() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method591((long) this.anInt827);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method261(this.anInt828);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray229[0] != 0) {
				local6.method275(this.anIntArray229[local21], this.anIntArray230[local21]);
			}
		}
		aClass40_9.method592((long) this.anInt827, local6);
		return local6;
	}
}
