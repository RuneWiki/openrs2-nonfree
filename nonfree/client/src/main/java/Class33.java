import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private static int anInt827;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt826 = -474;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(false, 30);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt828;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt830 = -1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray226 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray227 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt831 = 128;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt832 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method515(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method660("spotanim.dat", null), 185);
			anInt827 = local8.method476();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt827];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt827; local21++) {
				if (aClass33Array1[local21] == null) {
					aClass33Array1[local21] = new Class33();
				}
				aClass33Array1[local21].anInt828 = local21;
				aClass33Array1[local21].method516(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("38931, " + arg0 + ", " + -474 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lb;B)V")
	private void method516(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method474();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt829 = arg0.method476();
				} else if (local14 == 2) {
					this.anInt830 = arg0.method476();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt830];
					}
				} else if (local14 == 4) {
					this.anInt831 = arg0.method476();
				} else if (local14 == 5) {
					this.anInt832 = arg0.method476();
				} else if (local14 == 6) {
					this.anInt833 = arg0.method476();
				} else if (local14 == 7) {
					this.anInt834 = arg0.method474();
				} else if (local14 == 8) {
					this.anInt835 = arg0.method474();
				} else if (local14 >= 40 && local14 < 50) {
					this.anIntArray226[local14 - 40] = arg0.method476();
				} else if (local14 >= 50 && local14 < 60) {
					this.anIntArray227[local14 - 50] = arg0.method476();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local14);
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("86569, " + arg0 + ", " + 81 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method517() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method585((long) this.anInt828);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method260(this.anInt829);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray226[0] != 0) {
				local6.method274(this.anIntArray226[local21], this.anIntArray227[local21]);
			}
		}
		aClass40_9.method586(400, local6, (long) this.anInt828);
		return local6;
	}
}
