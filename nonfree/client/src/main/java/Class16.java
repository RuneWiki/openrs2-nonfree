import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JXKRPXFX")
public final class Class16 {

	@OriginalMember(owner = "client!JXKRPXFX", name = "d", descriptor = "I")
	private static int anInt180;

	@OriginalMember(owner = "client!JXKRPXFX", name = "e", descriptor = "[Lclient!JXKRPXFX;")
	public static Class16[] aClass16Array1;

	@OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "Z")
	private static boolean aBoolean70 = true;

	@OriginalMember(owner = "client!JXKRPXFX", name = "q", descriptor = "Lclient!FFRFJBIR;")
	public static Class7 aClass7_1 = new Class7(30, -2745);

	@OriginalMember(owner = "client!JXKRPXFX", name = "f", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!JXKRPXFX", name = "g", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!JXKRPXFX", name = "i", descriptor = "Lclient!PQTJDTHH;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!JXKRPXFX", name = "n", descriptor = "I")
	public int anInt186;

	@OriginalMember(owner = "client!JXKRPXFX", name = "o", descriptor = "I")
	public int anInt187;

	@OriginalMember(owner = "client!JXKRPXFX", name = "p", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!JXKRPXFX", name = "b", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!JXKRPXFX", name = "c", descriptor = "I")
	private int anInt179 = -254;

	@OriginalMember(owner = "client!JXKRPXFX", name = "h", descriptor = "I")
	private int anInt183 = -1;

	@OriginalMember(owner = "client!JXKRPXFX", name = "j", descriptor = "[I")
	private int[] anIntArray26 = new int[6];

	@OriginalMember(owner = "client!JXKRPXFX", name = "k", descriptor = "[I")
	private int[] anIntArray27 = new int[6];

	@OriginalMember(owner = "client!JXKRPXFX", name = "l", descriptor = "I")
	public int anInt184 = 128;

	@OriginalMember(owner = "client!JXKRPXFX", name = "m", descriptor = "I")
	public int anInt185 = 128;

	@OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "(ZLclient!AKPFVPPG;)V")
	public static void method213(@OriginalArg(1) Class2 arg0) {
		try {
			@Pc(16) Class4_Sub1_Sub3 local16 = new Class4_Sub1_Sub3(arg0.method7("spotanim.dat", null), (byte) 3);
			anInt180 = local16.method104();
			if (aClass16Array1 == null) {
				aClass16Array1 = new Class16[anInt180];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt180; local26++) {
				if (aClass16Array1[local26] == null) {
					aClass16Array1[local26] = new Class16();
				}
				aClass16Array1[local26].anInt181 = local26;
				aClass16Array1[local26].method214(local16);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("17038, " + true + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JXKRPXFX", name = "<init>", descriptor = "()V")
	private Class16() {
	}

	@OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	private void method214(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method102();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt182 = arg0.method104();
				} else if (local9 == 2) {
					this.anInt183 = arg0.method104();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt183];
					}
				} else if (local9 == 4) {
					this.anInt184 = arg0.method104();
				} else if (local9 == 5) {
					this.anInt185 = arg0.method104();
				} else if (local9 == 6) {
					this.anInt186 = arg0.method104();
				} else if (local9 == 7) {
					this.anInt187 = arg0.method102();
				} else if (local9 == 8) {
					this.anInt188 = arg0.method102();
				} else if (local9 >= 40 && local9 < 50) {
					this.anIntArray26[local9 - 40] = arg0.method104();
				} else if (local9 >= 50 && local9 < 60) {
					this.anIntArray27[local9 - 50] = arg0.method104();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local9);
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("20286, " + arg0 + ", " + 799 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JXKRPXFX", name = "a", descriptor = "()Lclient!KUGNQTGL;")
	public Class4_Sub1_Sub2_Sub3 method215() {
		@Pc(6) Class4_Sub1_Sub2_Sub3 local6 = (Class4_Sub1_Sub2_Sub3) aClass7_1.method85((long) this.anInt181);
		if (local6 != null) {
			return local6;
		}
		local6 = Class4_Sub1_Sub2_Sub3.method255(this.anInt182);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray26[0] != 0) {
				local6.method269(this.anIntArray26[local20], this.anIntArray27[local20]);
			}
		}
		aClass7_1.method86((long) this.anInt181, local6, this.aBoolean71);
		return local6;
	}
}
