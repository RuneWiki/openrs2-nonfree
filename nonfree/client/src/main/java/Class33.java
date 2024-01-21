import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private static int anInt825;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40(30, 0);

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
	private int anInt826;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt827;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt831;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt832;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "Z")
	private boolean aBoolean204 = false;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt828 = -1;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
	private int[] anIntArray226 = new int[6];

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray227 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
	public int anInt829 = 128;

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt830 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLclient!xb;)V")
	public static void method514(@OriginalArg(1) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method659("spotanim.dat", null), (byte) 1);
			anInt825 = local8.method475();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt825];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt825; local18++) {
				if (aClass33Array1[local18] == null) {
					aClass33Array1[local18] = new Class33();
				}
				aClass33Array1[local18].anInt826 = local18;
				aClass33Array1[local18].method515((byte) 2, local8);
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("54074, " + false + ", " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!lb;)V")
	private void method515(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				while (true) {
					@Pc(19) int local19 = arg1.method473();
					if (local19 == 0) {
						return;
					}
					if (local19 == 1) {
						this.anInt827 = arg1.method475();
					} else if (local19 == 2) {
						this.anInt828 = arg1.method475();
						if (Class27.aClass27Array1 != null) {
							this.aClass27_2 = Class27.aClass27Array1[this.anInt828];
						}
					} else if (local19 == 4) {
						this.anInt829 = arg1.method475();
					} else if (local19 == 5) {
						this.anInt830 = arg1.method475();
					} else if (local19 == 6) {
						this.anInt831 = arg1.method475();
					} else if (local19 == 7) {
						this.anInt832 = arg1.method473();
					} else if (local19 == 8) {
						this.anInt833 = arg1.method473();
					} else if (local19 >= 40 && local19 < 50) {
						this.anIntArray226[local19 - 40] = arg1.method475();
					} else if (local19 >= 50 && local19 < 60) {
						this.anIntArray227[local19 - 50] = arg1.method475();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local19);
					}
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("50786, " + arg0 + ", " + arg1 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method516() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method584((long) this.anInt826);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method260(this.anInt827);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray226[0] != 0) {
				local6.method274(this.anIntArray226[local21], this.anIntArray227[local21]);
			}
		}
		aClass40_9.method585(201, (long) this.anInt826, local6);
		return local6;
	}
}
