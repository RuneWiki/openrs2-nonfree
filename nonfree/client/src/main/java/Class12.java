import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FOXTQZWB")
public final class Class12 {

	@OriginalMember(owner = "client!FOXTQZWB", name = "b", descriptor = "I")
	private static int anInt127;

	@OriginalMember(owner = "client!FOXTQZWB", name = "c", descriptor = "[Lclient!FOXTQZWB;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!FOXTQZWB", name = "o", descriptor = "Lclient!QXKQGEKL;")
	public static Class36 aClass36_3 = new Class36(30, 5);

	@OriginalMember(owner = "client!FOXTQZWB", name = "d", descriptor = "I")
	private int anInt128;

	@OriginalMember(owner = "client!FOXTQZWB", name = "e", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!FOXTQZWB", name = "g", descriptor = "Lclient!KAIFCIAJ;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!FOXTQZWB", name = "l", descriptor = "I")
	public int anInt133;

	@OriginalMember(owner = "client!FOXTQZWB", name = "m", descriptor = "I")
	public int anInt134;

	@OriginalMember(owner = "client!FOXTQZWB", name = "n", descriptor = "I")
	public int anInt135;

	@OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "I")
	private int anInt126 = 1;

	@OriginalMember(owner = "client!FOXTQZWB", name = "f", descriptor = "I")
	private int anInt130 = -1;

	@OriginalMember(owner = "client!FOXTQZWB", name = "h", descriptor = "[I")
	private int[] anIntArray40 = new int[6];

	@OriginalMember(owner = "client!FOXTQZWB", name = "i", descriptor = "[I")
	private int[] anIntArray41 = new int[6];

	@OriginalMember(owner = "client!FOXTQZWB", name = "j", descriptor = "I")
	public int anInt131 = 128;

	@OriginalMember(owner = "client!FOXTQZWB", name = "k", descriptor = "I")
	public int anInt132 = 128;

	@OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "(BLclient!ESUFCMYV;)V")
	public static void method99(@OriginalArg(0) byte arg0, @OriginalArg(1) Class11 arg1) {
		try {
			@Pc(8) Class6_Sub1_Sub4 local8 = new Class6_Sub1_Sub4(arg1.method89("spotanim.dat", null), (byte) -17);
			anInt127 = local8.method413();
			if (aClass12Array1 == null) {
				aClass12Array1 = new Class12[anInt127];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt127; local18++) {
				if (aClass12Array1[local18] == null) {
					aClass12Array1[local18] = new Class12();
				}
				aClass12Array1[local18].anInt128 = local18;
				aClass12Array1[local18].method100(local8);
			}
			@Pc(50) boolean local50 = false;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("14580, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOXTQZWB", name = "<init>", descriptor = "()V")
	private Class12() {
	}

	@OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "(ILclient!RGCGKKUR;)V")
	private void method100(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method411();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt129 = arg0.method413();
				} else if (local10 == 2) {
					this.anInt130 = arg0.method413();
					if (Class21.aClass21Array1 != null) {
						this.aClass21_1 = Class21.aClass21Array1[this.anInt130];
					}
				} else if (local10 == 4) {
					this.anInt131 = arg0.method413();
				} else if (local10 == 5) {
					this.anInt132 = arg0.method413();
				} else if (local10 == 6) {
					this.anInt133 = arg0.method413();
				} else if (local10 == 7) {
					this.anInt134 = arg0.method411();
				} else if (local10 == 8) {
					this.anInt135 = arg0.method411();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray40[local10 - 40] = arg0.method413();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray41[local10 - 50] = arg0.method413();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("68741, " + 5 + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FOXTQZWB", name = "a", descriptor = "()Lclient!NGYJLUVS;")
	public Class6_Sub1_Sub2_Sub5 method101() {
		@Pc(6) Class6_Sub1_Sub2_Sub5 local6 = (Class6_Sub1_Sub2_Sub5) aClass36_3.method394((long) this.anInt128);
		if (local6 != null) {
			return local6;
		}
		local6 = Class6_Sub1_Sub2_Sub5.method228(this.anInt129);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray40[0] != 0) {
				local6.method242(this.anIntArray40[local20], this.anIntArray41[local20]);
			}
		}
		aClass36_3.method395((long) this.anInt128, local6);
		return local6;
	}
}
