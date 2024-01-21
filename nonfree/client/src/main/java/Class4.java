import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BZLQCUPI")
public final class Class4 {

	@OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "I")
	private static int anInt40;

	@OriginalMember(owner = "client!BZLQCUPI", name = "b", descriptor = "[Lclient!BZLQCUPI;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!BZLQCUPI", name = "n", descriptor = "Lclient!THJKANXW;")
	public static Class36 aClass36_1 = new Class36(30, false);

	@OriginalMember(owner = "client!BZLQCUPI", name = "c", descriptor = "I")
	private int anInt41;

	@OriginalMember(owner = "client!BZLQCUPI", name = "d", descriptor = "I")
	private int anInt42;

	@OriginalMember(owner = "client!BZLQCUPI", name = "f", descriptor = "Lclient!EHYLCNJX;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!BZLQCUPI", name = "k", descriptor = "I")
	public int anInt46;

	@OriginalMember(owner = "client!BZLQCUPI", name = "l", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!BZLQCUPI", name = "m", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!BZLQCUPI", name = "e", descriptor = "I")
	private int anInt43 = -1;

	@OriginalMember(owner = "client!BZLQCUPI", name = "g", descriptor = "[I")
	private int[] anIntArray1 = new int[6];

	@OriginalMember(owner = "client!BZLQCUPI", name = "h", descriptor = "[I")
	private int[] anIntArray2 = new int[6];

	@OriginalMember(owner = "client!BZLQCUPI", name = "i", descriptor = "I")
	public int anInt44 = 128;

	@OriginalMember(owner = "client!BZLQCUPI", name = "j", descriptor = "I")
	public int anInt45 = 128;

	@OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "(Lclient!FUZJMGZB;I)V")
	public static void method17(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub3 local8 = new Class2_Sub1_Sub3((byte) 114, arg0.method186("spotanim.dat", null));
			anInt40 = local8.method269();
			if (aClass4Array1 == null) {
				aClass4Array1 = new Class4[anInt40];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt40; local25++) {
				if (aClass4Array1[local25] == null) {
					aClass4Array1[local25] = new Class4();
				}
				aClass4Array1[local25].anInt41 = local25;
				aClass4Array1[local25].method18(local8);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("84813, " + arg0 + ", " + 5 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BZLQCUPI", name = "<init>", descriptor = "()V")
	private Class4() {
	}

	@OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	private void method18(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method267();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt42 = arg0.method269();
				} else if (local11 == 2) {
					this.anInt43 = arg0.method269();
					if (Class10.aClass10Array1 != null) {
						this.aClass10_1 = Class10.aClass10Array1[this.anInt43];
					}
				} else if (local11 == 4) {
					this.anInt44 = arg0.method269();
				} else if (local11 == 5) {
					this.anInt45 = arg0.method269();
				} else if (local11 == 6) {
					this.anInt46 = arg0.method269();
				} else if (local11 == 7) {
					this.anInt47 = arg0.method267();
				} else if (local11 == 8) {
					this.anInt48 = arg0.method267();
				} else if (local11 >= 40 && local11 < 50) {
					this.anIntArray1[local11 - 40] = arg0.method269();
				} else if (local11 >= 50 && local11 < 60) {
					this.anIntArray2[local11 - 50] = arg0.method269();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local11);
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("22763, " + arg0 + ", " + 59 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BZLQCUPI", name = "a", descriptor = "()Lclient!CYPZUKMB;")
	public Class2_Sub1_Sub1_Sub2 method19() {
		@Pc(6) Class2_Sub1_Sub1_Sub2 local6 = (Class2_Sub1_Sub1_Sub2) aClass36_1.method456((long) this.anInt41);
		if (local6 != null) {
			return local6;
		}
		local6 = Class2_Sub1_Sub1_Sub2.method91(this.anInt42);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray1[0] != 0) {
				local6.method105(this.anIntArray1[local20], this.anIntArray2[local20]);
			}
		}
		aClass36_1.method457((long) this.anInt41, local6);
		return local6;
	}
}
