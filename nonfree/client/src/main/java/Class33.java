import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private static boolean aBoolean222;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private static int anInt816;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(30, true);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt818;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt824;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt819 = -1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt820 = 128;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt821 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method521(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub3 local10 = new Class1_Sub1_Sub3(arg0.method666("spotanim.dat", null), aBoolean222);
			anInt816 = local10.method482();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt816];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt816; local20++) {
				if (aClass33Array1[local20] == null) {
					aClass33Array1[local20] = new Class33();
				}
				aClass33Array1[local20].anInt817 = local20;
				aClass33Array1[local20].method522(local10);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("20139, " + arg0 + ", " + 5 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method522(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method480();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt818 = arg0.method482();
				} else if (local13 == 2) {
					this.anInt819 = arg0.method482();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt819];
					}
				} else if (local13 == 4) {
					this.anInt820 = arg0.method482();
				} else if (local13 == 5) {
					this.anInt821 = arg0.method482();
				} else if (local13 == 6) {
					this.anInt822 = arg0.method482();
				} else if (local13 == 7) {
					this.anInt823 = arg0.method480();
				} else if (local13 == 8) {
					this.anInt824 = arg0.method480();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray229[local13 - 40] = arg0.method482();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray230[local13 - 50] = arg0.method482();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("53428, " + false + ", " + arg0 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method523() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method591((long) this.anInt817);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method261((byte) 4, this.anInt818);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray229[0] != 0) {
				local6.method275(this.anIntArray229[local21], this.anIntArray230[local21]);
			}
		}
		aClass40_9.method592((long) this.anInt817, local6);
		return local6;
	}
}
