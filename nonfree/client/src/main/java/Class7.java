import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CIVOPMKV")
public final class Class7 {

	@OriginalMember(owner = "client!CIVOPMKV", name = "c", descriptor = "I")
	private static int anInt120;

	@OriginalMember(owner = "client!CIVOPMKV", name = "d", descriptor = "[Lclient!CIVOPMKV;")
	public static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!CIVOPMKV", name = "a", descriptor = "I")
	private static int anInt118 = 8;

	@OriginalMember(owner = "client!CIVOPMKV", name = "b", descriptor = "I")
	private static int anInt119 = 25292;

	@OriginalMember(owner = "client!CIVOPMKV", name = "p", descriptor = "Lclient!WMYPWVZI;")
	public static Class43 aClass43_1 = new Class43(30, 267);

	@OriginalMember(owner = "client!CIVOPMKV", name = "e", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!CIVOPMKV", name = "f", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!CIVOPMKV", name = "h", descriptor = "Lclient!ZKWMIVTX;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!CIVOPMKV", name = "m", descriptor = "I")
	public int anInt126;

	@OriginalMember(owner = "client!CIVOPMKV", name = "n", descriptor = "I")
	public int anInt127;

	@OriginalMember(owner = "client!CIVOPMKV", name = "o", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!CIVOPMKV", name = "g", descriptor = "I")
	private int anInt123 = -1;

	@OriginalMember(owner = "client!CIVOPMKV", name = "i", descriptor = "[I")
	private int[] anIntArray19 = new int[6];

	@OriginalMember(owner = "client!CIVOPMKV", name = "j", descriptor = "[I")
	private int[] anIntArray20 = new int[6];

	@OriginalMember(owner = "client!CIVOPMKV", name = "k", descriptor = "I")
	public int anInt124 = 128;

	@OriginalMember(owner = "client!CIVOPMKV", name = "l", descriptor = "I")
	public int anInt125 = 128;

	@OriginalMember(owner = "client!CIVOPMKV", name = "a", descriptor = "(Lclient!BYZSQZUF;Z)V")
	public static void method67(@OriginalArg(0) Class5 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub3 local8 = new Class3_Sub1_Sub3(0, arg0.method66("spotanim.dat", null));
			anInt120 = local8.method148();
			if (aClass7Array1 == null) {
				aClass7Array1 = new Class7[anInt120];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt120; local22++) {
				if (aClass7Array1[local22] == null) {
					aClass7Array1[local22] = new Class7();
				}
				aClass7Array1[local22].anInt121 = local22;
				aClass7Array1[local22].method68(anInt118, local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("59413, " + arg0 + ", " + false + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CIVOPMKV", name = "<init>", descriptor = "()V")
	private Class7() {
	}

	@OriginalMember(owner = "client!CIVOPMKV", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	private void method68(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			@Pc(9) int local9;
			if (arg0 < 8 || arg0 > 8) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			while (true) {
				while (true) {
					local9 = arg1.method146();
					if (local9 == 0) {
						return;
					}
					if (local9 == 1) {
						this.anInt122 = arg1.method148();
					} else if (local9 == 2) {
						this.anInt123 = arg1.method148();
						if (Class49.aClass49Array1 != null) {
							this.aClass49_1 = Class49.aClass49Array1[this.anInt123];
						}
					} else if (local9 == 4) {
						this.anInt124 = arg1.method148();
					} else if (local9 == 5) {
						this.anInt125 = arg1.method148();
					} else if (local9 == 6) {
						this.anInt126 = arg1.method148();
					} else if (local9 == 7) {
						this.anInt127 = arg1.method146();
					} else if (local9 == 8) {
						this.anInt128 = arg1.method146();
					} else if (local9 >= 40 && local9 < 50) {
						this.anIntArray19[local9 - 40] = arg1.method148();
					} else if (local9 >= 50 && local9 < 60) {
						this.anIntArray20[local9 - 50] = arg1.method148();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local9);
					}
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("11130, " + arg0 + ", " + arg1 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CIVOPMKV", name = "a", descriptor = "()Lclient!YABPKWWG;")
	public Class3_Sub1_Sub2_Sub6 method69() {
		@Pc(6) Class3_Sub1_Sub2_Sub6 local6 = (Class3_Sub1_Sub2_Sub6) aClass43_1.method484((long) this.anInt121);
		if (local6 != null) {
			return local6;
		}
		local6 = Class3_Sub1_Sub2_Sub6.method510(this.anInt122);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray19[0] != 0) {
				local6.method524(this.anIntArray19[local21], this.anIntArray20[local21]);
			}
		}
		aClass43_1.method485((long) this.anInt121, local6);
		return local6;
	}
}
