import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BKJQHSVH")
public final class Class6 {

	@OriginalMember(owner = "client!BKJQHSVH", name = "c", descriptor = "I")
	private static int anInt28;

	@OriginalMember(owner = "client!BKJQHSVH", name = "d", descriptor = "[Lclient!BKJQHSVH;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!BKJQHSVH", name = "a", descriptor = "Z")
	private static boolean aBoolean25 = true;

	@OriginalMember(owner = "client!BKJQHSVH", name = "b", descriptor = "Z")
	private static boolean aBoolean26 = true;

	@OriginalMember(owner = "client!BKJQHSVH", name = "p", descriptor = "Lclient!DMOAMUBS;")
	public static Class12 aClass12_1 = new Class12(30, true);

	@OriginalMember(owner = "client!BKJQHSVH", name = "e", descriptor = "I")
	private int anInt29;

	@OriginalMember(owner = "client!BKJQHSVH", name = "f", descriptor = "I")
	private int anInt30;

	@OriginalMember(owner = "client!BKJQHSVH", name = "h", descriptor = "Lclient!MJVHTYCA;")
	public Class32 aClass32_2;

	@OriginalMember(owner = "client!BKJQHSVH", name = "m", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!BKJQHSVH", name = "n", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!BKJQHSVH", name = "o", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!BKJQHSVH", name = "g", descriptor = "I")
	private int anInt31 = -1;

	@OriginalMember(owner = "client!BKJQHSVH", name = "i", descriptor = "[I")
	private int[] anIntArray6 = new int[6];

	@OriginalMember(owner = "client!BKJQHSVH", name = "j", descriptor = "[I")
	private int[] anIntArray7 = new int[6];

	@OriginalMember(owner = "client!BKJQHSVH", name = "k", descriptor = "I")
	public int anInt32 = 128;

	@OriginalMember(owner = "client!BKJQHSVH", name = "l", descriptor = "I")
	public int anInt33 = 128;

	@OriginalMember(owner = "client!BKJQHSVH", name = "a", descriptor = "(ZLclient!MJLXHQTQ;)V")
	public static void method24(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg0.method227("spotanim.dat", null), -82);
			anInt28 = local8.method439();
			if (aClass6Array1 == null) {
				aClass6Array1 = new Class6[anInt28];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt28; local26++) {
				if (aClass6Array1[local26] == null) {
					aClass6Array1[local26] = new Class6();
				}
				aClass6Array1[local26].anInt29 = local26;
				aClass6Array1[local26].method25(aBoolean25, local8);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("86300, " + true + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKJQHSVH", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!BKJQHSVH", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	private void method25(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			if (!arg0) {
				aBoolean25 = !aBoolean25;
			}
			while (true) {
				while (true) {
					@Pc(12) int local12 = arg1.method437();
					if (local12 == 0) {
						return;
					}
					if (local12 == 1) {
						this.anInt30 = arg1.method439();
					} else if (local12 == 2) {
						this.anInt31 = arg1.method439();
						if (Class32.aClass32Array1 != null) {
							this.aClass32_2 = Class32.aClass32Array1[this.anInt31];
						}
					} else if (local12 == 4) {
						this.anInt32 = arg1.method439();
					} else if (local12 == 5) {
						this.anInt33 = arg1.method439();
					} else if (local12 == 6) {
						this.anInt34 = arg1.method439();
					} else if (local12 == 7) {
						this.anInt35 = arg1.method437();
					} else if (local12 == 8) {
						this.anInt36 = arg1.method437();
					} else if (local12 >= 40 && local12 < 50) {
						this.anIntArray6[local12 - 40] = arg1.method439();
					} else if (local12 >= 50 && local12 < 60) {
						this.anIntArray7[local12 - 50] = arg1.method439();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local12);
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("2325, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BKJQHSVH", name = "a", descriptor = "()Lclient!VYUQHOMO;")
	public Class5_Sub1_Sub1_Sub6 method26() {
		@Pc(6) Class5_Sub1_Sub1_Sub6 local6 = (Class5_Sub1_Sub1_Sub6) aClass12_1.method78((long) this.anInt29);
		if (local6 != null) {
			return local6;
		}
		local6 = Class5_Sub1_Sub1_Sub6.method377(this.anInt30);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray6[0] != 0) {
				local6.method391(this.anIntArray6[local20], this.anIntArray7[local20]);
			}
		}
		aClass12_1.method79((long) this.anInt29, local6);
		return local6;
	}
}
