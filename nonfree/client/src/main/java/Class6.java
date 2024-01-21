import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CRSWMDQF")
public final class Class6 {

	@OriginalMember(owner = "client!CRSWMDQF", name = "b", descriptor = "Z")
	private static boolean aBoolean51;

	@OriginalMember(owner = "client!CRSWMDQF", name = "c", descriptor = "I")
	private static int anInt185;

	@OriginalMember(owner = "client!CRSWMDQF", name = "d", descriptor = "[Lclient!CRSWMDQF;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!CRSWMDQF", name = "p", descriptor = "Lclient!RYXFUVWJ;")
	public static Class31 aClass31_1 = new Class31(30, -268);

	@OriginalMember(owner = "client!CRSWMDQF", name = "e", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!CRSWMDQF", name = "f", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!CRSWMDQF", name = "h", descriptor = "Lclient!SPUHKLMC;")
	public Class33 aClass33_1;

	@OriginalMember(owner = "client!CRSWMDQF", name = "m", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!CRSWMDQF", name = "n", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!CRSWMDQF", name = "o", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "Z")
	private boolean aBoolean50 = false;

	@OriginalMember(owner = "client!CRSWMDQF", name = "g", descriptor = "I")
	private int anInt188 = -1;

	@OriginalMember(owner = "client!CRSWMDQF", name = "i", descriptor = "[I")
	private int[] anIntArray34 = new int[6];

	@OriginalMember(owner = "client!CRSWMDQF", name = "j", descriptor = "[I")
	private int[] anIntArray35 = new int[6];

	@OriginalMember(owner = "client!CRSWMDQF", name = "k", descriptor = "I")
	public int anInt189 = 128;

	@OriginalMember(owner = "client!CRSWMDQF", name = "l", descriptor = "I")
	public int anInt190 = 128;

	@OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "(ZLclient!VSQMPWOM;)V")
	public static void method192(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub2 local8 = new Class2_Sub1_Sub2(arg0.method489("spotanim.dat", null), -990);
			anInt185 = local8.method81();
			if (aClass6Array1 == null) {
				aClass6Array1 = new Class6[anInt185];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt185; local18++) {
				if (aClass6Array1[local18] == null) {
					aClass6Array1[local18] = new Class6();
				}
				aClass6Array1[local18].anInt186 = local18;
				aClass6Array1[local18].method193(local8);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("98549, " + true + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRSWMDQF", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "(BLclient!BFQIDHPO;)V")
	private void method193(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(15) int local15 = arg0.method79();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt187 = arg0.method81();
				} else if (local15 == 2) {
					this.anInt188 = arg0.method81();
					if (Class33.aClass33Array1 != null) {
						this.aClass33_1 = Class33.aClass33Array1[this.anInt188];
					}
				} else if (local15 == 4) {
					this.anInt189 = arg0.method81();
				} else if (local15 == 5) {
					this.anInt190 = arg0.method81();
				} else if (local15 == 6) {
					this.anInt191 = arg0.method81();
				} else if (local15 == 7) {
					this.anInt192 = arg0.method79();
				} else if (local15 == 8) {
					this.anInt193 = arg0.method79();
				} else if (local15 >= 40 && local15 < 50) {
					this.anIntArray34[local15 - 40] = arg0.method81();
				} else if (local15 >= 50 && local15 < 60) {
					this.anIntArray35[local15 - 50] = arg0.method81();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local15);
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("16811, " + -11 + ", " + arg0 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CRSWMDQF", name = "a", descriptor = "()Lclient!XBVYIDUH;")
	public Class2_Sub1_Sub1_Sub6 method194() {
		@Pc(6) Class2_Sub1_Sub1_Sub6 local6 = (Class2_Sub1_Sub1_Sub6) aClass31_1.method449((long) this.anInt186);
		if (local6 != null) {
			return local6;
		}
		local6 = Class2_Sub1_Sub1_Sub6.method512(this.anInt187);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray34[0] != 0) {
				local6.method526(this.anIntArray34[local20], this.anIntArray35[local20]);
			}
		}
		aClass31_1.method450(local6, (long) this.anInt186);
		return local6;
	}
}
