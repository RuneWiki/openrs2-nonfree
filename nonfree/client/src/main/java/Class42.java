import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VCTVXSNH")
public final class Class42 {

	@OriginalMember(owner = "client!VCTVXSNH", name = "b", descriptor = "I")
	private static int anInt747;

	@OriginalMember(owner = "client!VCTVXSNH", name = "c", descriptor = "[Lclient!VCTVXSNH;")
	public static Class42[] aClass42Array1;

	@OriginalMember(owner = "client!VCTVXSNH", name = "a", descriptor = "Z")
	private static boolean aBoolean203 = true;

	@OriginalMember(owner = "client!VCTVXSNH", name = "o", descriptor = "Lclient!AKUDQPZE;")
	public static Class1 aClass1_7 = new Class1((byte) 8, 30);

	@OriginalMember(owner = "client!VCTVXSNH", name = "d", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!VCTVXSNH", name = "e", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!VCTVXSNH", name = "g", descriptor = "Lclient!BZONLWPM;")
	public Class5 aClass5_1;

	@OriginalMember(owner = "client!VCTVXSNH", name = "l", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!VCTVXSNH", name = "m", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!VCTVXSNH", name = "n", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!VCTVXSNH", name = "f", descriptor = "I")
	private int anInt750 = -1;

	@OriginalMember(owner = "client!VCTVXSNH", name = "h", descriptor = "[I")
	private int[] anIntArray195 = new int[6];

	@OriginalMember(owner = "client!VCTVXSNH", name = "i", descriptor = "[I")
	private int[] anIntArray196 = new int[6];

	@OriginalMember(owner = "client!VCTVXSNH", name = "j", descriptor = "I")
	public int anInt751 = 128;

	@OriginalMember(owner = "client!VCTVXSNH", name = "k", descriptor = "I")
	public int anInt752 = 128;

	@OriginalMember(owner = "client!VCTVXSNH", name = "a", descriptor = "(ILclient!TKEGJSFV;)V")
	public static void method525(@OriginalArg(1) Class38 arg0) {
		try {
			@Pc(16) Class4_Sub1_Sub3 local16 = new Class4_Sub1_Sub3(arg0.method514("spotanim.dat", null), false);
			anInt747 = local16.method169();
			if (aClass42Array1 == null) {
				aClass42Array1 = new Class42[anInt747];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt747; local26++) {
				if (aClass42Array1[local26] == null) {
					aClass42Array1[local26] = new Class42();
				}
				aClass42Array1[local26].anInt748 = local26;
				aClass42Array1[local26].method526(local16);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("13199, " + 0 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTVXSNH", name = "<init>", descriptor = "()V")
	private Class42() {
	}

	@OriginalMember(owner = "client!VCTVXSNH", name = "a", descriptor = "(Lclient!EGCCHUZS;Z)V")
	private void method526(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method167();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt749 = arg0.method169();
				} else if (local13 == 2) {
					this.anInt750 = arg0.method169();
					if (Class5.aClass5Array1 != null) {
						this.aClass5_1 = Class5.aClass5Array1[this.anInt750];
					}
				} else if (local13 == 4) {
					this.anInt751 = arg0.method169();
				} else if (local13 == 5) {
					this.anInt752 = arg0.method169();
				} else if (local13 == 6) {
					this.anInt753 = arg0.method169();
				} else if (local13 == 7) {
					this.anInt754 = arg0.method167();
				} else if (local13 == 8) {
					this.anInt755 = arg0.method167();
				} else if (local13 >= 40 && local13 < 50) {
					this.anIntArray195[local13 - 40] = arg0.method169();
				} else if (local13 >= 50 && local13 < 60) {
					this.anIntArray196[local13 - 50] = arg0.method169();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local13);
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("53, " + arg0 + ", " + true + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VCTVXSNH", name = "a", descriptor = "()Lclient!IGXVZOHI;")
	public Class4_Sub1_Sub1_Sub3 method527() {
		@Pc(6) Class4_Sub1_Sub1_Sub3 local6 = (Class4_Sub1_Sub1_Sub3) aClass1_7.method1((long) this.anInt748);
		if (local6 != null) {
			return local6;
		}
		local6 = Class4_Sub1_Sub1_Sub3.method283(this.anInt749);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray195[0] != 0) {
				local6.method297(this.anIntArray195[local20], this.anIntArray196[local20]);
			}
		}
		aClass1_7.method2(local6, (long) this.anInt748);
		return local6;
	}
}
