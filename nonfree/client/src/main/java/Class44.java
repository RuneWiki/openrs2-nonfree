import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XHDTVZNY")
public final class Class44 {

	@OriginalMember(owner = "client!XHDTVZNY", name = "a", descriptor = "I")
	private static int anInt776;

	@OriginalMember(owner = "client!XHDTVZNY", name = "b", descriptor = "[Lclient!XHDTVZNY;")
	public static Class44[] aClass44Array1;

	@OriginalMember(owner = "client!XHDTVZNY", name = "n", descriptor = "Lclient!HGKRJZKS;")
	public static Class18 aClass18_9 = new Class18(0, 30);

	@OriginalMember(owner = "client!XHDTVZNY", name = "c", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!XHDTVZNY", name = "d", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!XHDTVZNY", name = "f", descriptor = "Lclient!WLHKAARP;")
	public Class40 aClass40_1;

	@OriginalMember(owner = "client!XHDTVZNY", name = "k", descriptor = "I")
	public int anInt782;

	@OriginalMember(owner = "client!XHDTVZNY", name = "l", descriptor = "I")
	public int anInt783;

	@OriginalMember(owner = "client!XHDTVZNY", name = "m", descriptor = "I")
	public int anInt784;

	@OriginalMember(owner = "client!XHDTVZNY", name = "e", descriptor = "I")
	private int anInt779 = -1;

	@OriginalMember(owner = "client!XHDTVZNY", name = "g", descriptor = "[I")
	private int[] anIntArray185 = new int[6];

	@OriginalMember(owner = "client!XHDTVZNY", name = "h", descriptor = "[I")
	private int[] anIntArray186 = new int[6];

	@OriginalMember(owner = "client!XHDTVZNY", name = "i", descriptor = "I")
	public int anInt780 = 128;

	@OriginalMember(owner = "client!XHDTVZNY", name = "j", descriptor = "I")
	public int anInt781 = 128;

	@OriginalMember(owner = "client!XHDTVZNY", name = "a", descriptor = "(ZLclient!XRWUKRPO;)V")
	public static void method549(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(10) Class8_Sub1_Sub3 local10 = new Class8_Sub1_Sub3(arg0.method553("spotanim.dat", null), -49015);
			anInt776 = local10.method167();
			if (aClass44Array1 == null) {
				aClass44Array1 = new Class44[anInt776];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt776; local29++) {
				if (aClass44Array1[local29] == null) {
					aClass44Array1[local29] = new Class44();
				}
				aClass44Array1[local29].anInt777 = local29;
				aClass44Array1[local29].method550(local10);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("16309, " + false + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDTVZNY", name = "<init>", descriptor = "()V")
	private Class44() {
	}

	@OriginalMember(owner = "client!XHDTVZNY", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	private void method550(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method165();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt778 = arg0.method167();
				} else if (local11 == 2) {
					this.anInt779 = arg0.method167();
					if (Class40.aClass40Array1 != null) {
						this.aClass40_1 = Class40.aClass40Array1[this.anInt779];
					}
				} else if (local11 == 4) {
					this.anInt780 = arg0.method167();
				} else if (local11 == 5) {
					this.anInt781 = arg0.method167();
				} else if (local11 == 6) {
					this.anInt782 = arg0.method167();
				} else if (local11 == 7) {
					this.anInt783 = arg0.method165();
				} else if (local11 == 8) {
					this.anInt784 = arg0.method165();
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray185[local11 - 40] = arg0.method167();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray186[local11 - 50] = arg0.method167();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local11);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("31318, " + 8 + ", " + arg0 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XHDTVZNY", name = "a", descriptor = "()Lclient!VHYCWIPJ;")
	public Class8_Sub1_Sub2_Sub5 method551() {
		@Pc(6) Class8_Sub1_Sub2_Sub5 local6 = (Class8_Sub1_Sub2_Sub5) aClass18_9.method207((long) this.anInt777);
		if (local6 != null) {
			return local6;
		}
		local6 = Class8_Sub1_Sub2_Sub5.method463(this.anInt778);
		if (local6 == null) {
			return null;
		}
		for (@Pc(21) int local21 = 0; local21 < 6; local21++) {
			if (this.anIntArray185[0] != 0) {
				local6.method477(this.anIntArray185[local21], this.anIntArray186[local21]);
			}
		}
		aClass18_9.method208((long) this.anInt777, local6);
		return local6;
	}
}
