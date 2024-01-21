import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private static int anInt815;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40((byte) 7, 30);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt816;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt817;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private boolean aBoolean220 = false;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "B")
	private byte aByte48 = 4;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt818 = -1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray228 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt819 = 128;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt820 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method517(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method662("spotanim.dat", null), 15787);
			anInt815 = local8.method478();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt815];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt815; local21++) {
				if (aClass33Array1[local21] == null) {
					aClass33Array1[local21] = new Class33();
				}
				aClass33Array1[local21].anInt816 = local21;
				aClass33Array1[local21].method518(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("58052, " + true + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!lb;)V")
	private void method518(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method476();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt817 = arg0.method478();
				} else if (local10 == 2) {
					this.anInt818 = arg0.method478();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt818];
					}
				} else if (local10 == 4) {
					this.anInt819 = arg0.method478();
				} else if (local10 == 5) {
					this.anInt820 = arg0.method478();
				} else if (local10 == 6) {
					this.anInt821 = arg0.method478();
				} else if (local10 == 7) {
					this.anInt822 = arg0.method476();
				} else if (local10 == 8) {
					this.anInt823 = arg0.method476();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray228[local10 - 40] = arg0.method478();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray229[local10 - 50] = arg0.method478();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("87905, " + false + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method519() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method587((long) this.anInt816);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method260(this.anInt817, this.aByte48);
		if (local6 == null) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
			if (this.anIntArray228[0] != 0) {
				local6.method274(this.anIntArray228[local22], this.anIntArray229[local22]);
			}
		}
		aClass40_9.method588((long) this.anInt816, local6);
		return local6;
	}
}
