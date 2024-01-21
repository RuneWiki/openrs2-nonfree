import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private static int anInt821;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40((byte) 8, 30);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt822;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt823;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt824 = -1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt825 = 128;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt826 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method521(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("spotanim.dat", null), 58);
			anInt821 = local10.method482();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt821];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt821; local20++) {
				if (aClass33Array1[local20] == null) {
					aClass33Array1[local20] = new Class33();
				}
				aClass33Array1[local20].anInt822 = local20;
				aClass33Array1[local20].method522(local10, 913);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("28314, " + arg0 + ", " + -30 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lb;I)V")
	private void method522(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg0.method480();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt823 = arg0.method482();
					} else if (local8 == 2) {
						this.anInt824 = arg0.method482();
						if (Class27.aClass27Array1 != null) {
							this.aClass27_2 = Class27.aClass27Array1[this.anInt824];
						}
					} else if (local8 == 4) {
						this.anInt825 = arg0.method482();
					} else if (local8 == 5) {
						this.anInt826 = arg0.method482();
					} else if (local8 == 6) {
						this.anInt827 = arg0.method482();
					} else if (local8 == 7) {
						this.anInt828 = arg0.method480();
					} else if (local8 == 8) {
						this.anInt829 = arg0.method480();
					} else if (local8 >= 40 && local8 < 50) {
						this.anIntArray229[local8 - 40] = arg0.method482();
					} else if (local8 >= 50 && local8 < 60) {
						this.anIntArray230[local8 - 50] = arg0.method482();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local8);
					}
				}
			}
		} catch (@Pc(125) RuntimeException local125) {
			signlink.reporterror("92291, " + arg0 + ", " + arg1 + ", " + local125.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method523() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method591((long) this.anInt822);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method261(this.anInt823);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray229[0] != 0) {
				local6.method275(this.anIntArray229[local21], this.anIntArray230[local21]);
			}
		}
		aClass40_9.method592((long) this.anInt822, local6);
		return local6;
	}
}
