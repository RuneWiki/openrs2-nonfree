import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pc")
public final class Class33 {

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	private static int anInt840;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "[Lclient!pc;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
	private static int anInt838 = 1000;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "Lclient!s;")
	public static Class40 aClass40_9 = new Class40((byte) 113, 30);

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "Lclient!nc;")
	public Class27 aClass27_2;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
	public int anInt846;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
	public int anInt847;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public int anInt848;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
	private int anInt839 = -22323;

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	private int anInt843 = -1;

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[I")
	private int[] anIntArray229 = new int[6];

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "[I")
	private int[] anIntArray230 = new int[6];

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
	public int anInt844 = 128;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public int anInt845 = 128;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!xb;I)V")
	public static void method521(@OriginalArg(0) Class47 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(anInt838, arg0.method666("spotanim.dat", null));
			anInt840 = local8.method482();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt840];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt840; local18++) {
				if (aClass33Array1[local18] == null) {
					aClass33Array1[local18] = new Class33();
				}
				aClass33Array1[local18].anInt841 = local18;
				aClass33Array1[local18].method522(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("60301, " + arg0 + ", " + 0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!lb;)V")
	private void method522(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method480();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt842 = arg0.method482();
				} else if (local9 == 2) {
					this.anInt843 = arg0.method482();
					if (Class27.aClass27Array1 != null) {
						this.aClass27_2 = Class27.aClass27Array1[this.anInt843];
					}
				} else if (local9 == 4) {
					this.anInt844 = arg0.method482();
				} else if (local9 == 5) {
					this.anInt845 = arg0.method482();
				} else if (local9 == 6) {
					this.anInt846 = arg0.method482();
				} else if (local9 == 7) {
					this.anInt847 = arg0.method480();
				} else if (local9 == 8) {
					this.anInt848 = arg0.method480();
				} else if (local9 >= 40 && local9 < 50) {
					this.anIntArray229[local9 - 40] = arg0.method482();
				} else if (local9 >= 50 && local9 < 60) {
					this.anIntArray230[local9 - 50] = arg0.method482();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local9);
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("30076, " + 8 + ", " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "()Lclient!eb;")
	public Class1_Sub1_Sub1_Sub5 method523() {
		@Pc(6) Class1_Sub1_Sub1_Sub5 local6 = (Class1_Sub1_Sub1_Sub5) aClass40_9.method591((long) this.anInt841);
		if (local6 != null) {
			return local6;
		}
		local6 = Class1_Sub1_Sub1_Sub5.method261(this.anInt842, this.anInt839);
		if (local6 == null) {
			return null;
		}
		for (@Pc(22) int local22 = 0; local22 < 6; local22++) {
			if (this.anIntArray229[0] != 0) {
				local6.method275(this.anIntArray229[local22], this.anIntArray230[local22]);
			}
		}
		aClass40_9.method592((long) this.anInt841, local6);
		return local6;
	}
}
