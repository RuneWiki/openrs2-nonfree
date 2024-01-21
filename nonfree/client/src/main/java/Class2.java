import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BYUDODIR")
public final class Class2 {

	@OriginalMember(owner = "client!BYUDODIR", name = "a", descriptor = "I")
	private static int anInt25;

	@OriginalMember(owner = "client!BYUDODIR", name = "b", descriptor = "[Lclient!BYUDODIR;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!BYUDODIR", name = "n", descriptor = "Lclient!VNWSQIXW;")
	public static Class35 aClass35_1 = new Class35(30, (byte) 8);

	@OriginalMember(owner = "client!BYUDODIR", name = "c", descriptor = "I")
	private int anInt26;

	@OriginalMember(owner = "client!BYUDODIR", name = "d", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!BYUDODIR", name = "f", descriptor = "Lclient!VYCKCNXO;")
	public Class39 aClass39_1;

	@OriginalMember(owner = "client!BYUDODIR", name = "k", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!BYUDODIR", name = "l", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!BYUDODIR", name = "m", descriptor = "I")
	public int anInt33;

	@OriginalMember(owner = "client!BYUDODIR", name = "e", descriptor = "I")
	private int anInt28 = -1;

	@OriginalMember(owner = "client!BYUDODIR", name = "g", descriptor = "[I")
	private int[] anIntArray3 = new int[6];

	@OriginalMember(owner = "client!BYUDODIR", name = "h", descriptor = "[I")
	private int[] anIntArray4 = new int[6];

	@OriginalMember(owner = "client!BYUDODIR", name = "i", descriptor = "I")
	public int anInt29 = 128;

	@OriginalMember(owner = "client!BYUDODIR", name = "j", descriptor = "I")
	public int anInt30 = 128;

	@OriginalMember(owner = "client!BYUDODIR", name = "a", descriptor = "(Lclient!DTIATKJO;I)V")
	public static void method16(@OriginalArg(0) Class7 arg0) {
		try {
			@Pc(10) Class3_Sub1_Sub2 local10 = new Class3_Sub1_Sub2(-527, arg0.method30("spotanim.dat", null));
			anInt25 = local10.method91();
			if (aClass2Array1 == null) {
				aClass2Array1 = new Class2[anInt25];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt25; local20++) {
				if (aClass2Array1[local20] == null) {
					aClass2Array1[local20] = new Class2();
				}
				aClass2Array1[local20].anInt26 = local20;
				aClass2Array1[local20].method17(local10);
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("72428, " + arg0 + ", " + 1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BYUDODIR", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!BYUDODIR", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	private void method17(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method89();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt27 = arg0.method91();
				} else if (local10 == 2) {
					this.anInt28 = arg0.method91();
					if (Class39.aClass39Array1 != null) {
						this.aClass39_1 = Class39.aClass39Array1[this.anInt28];
					}
				} else if (local10 == 4) {
					this.anInt29 = arg0.method91();
				} else if (local10 == 5) {
					this.anInt30 = arg0.method91();
				} else if (local10 == 6) {
					this.anInt31 = arg0.method91();
				} else if (local10 == 7) {
					this.anInt32 = arg0.method89();
				} else if (local10 == 8) {
					this.anInt33 = arg0.method89();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray3[local10 - 40] = arg0.method91();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray4[local10 - 50] = arg0.method91();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("19274, " + arg0 + ", " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BYUDODIR", name = "a", descriptor = "()Lclient!OQIGXOFQ;")
	public Class3_Sub1_Sub1_Sub3 method18() {
		@Pc(6) Class3_Sub1_Sub1_Sub3 local6 = (Class3_Sub1_Sub1_Sub3) aClass35_1.method474((long) this.anInt26);
		if (local6 != null) {
			return local6;
		}
		local6 = Class3_Sub1_Sub1_Sub3.method321(this.anInt27);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray3[0] != 0) {
				local6.method335(this.anIntArray3[local20], this.anIntArray4[local20]);
			}
		}
		aClass35_1.method475((long) this.anInt26, local6);
		return local6;
	}
}
