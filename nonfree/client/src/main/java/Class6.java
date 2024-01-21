import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BUIWQSXJ")
public final class Class6 {

	@OriginalMember(owner = "client!BUIWQSXJ", name = "d", descriptor = "I")
	private static int anInt30;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "e", descriptor = "[Lclient!BUIWQSXJ;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "a", descriptor = "I")
	private static int anInt27 = 974;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "q", descriptor = "Lclient!ZYLCKQCD;")
	public static Class49 aClass49_1 = new Class49((byte) -89, 30);

	@OriginalMember(owner = "client!BUIWQSXJ", name = "f", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "g", descriptor = "I")
	private int anInt32;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "i", descriptor = "Lclient!KIZBPSHZ;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "n", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "o", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "p", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "b", descriptor = "I")
	private int anInt28 = 262;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "c", descriptor = "I")
	private int anInt29 = 8;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "h", descriptor = "I")
	private int anInt33 = -1;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "j", descriptor = "[I")
	private int[] anIntArray7 = new int[6];

	@OriginalMember(owner = "client!BUIWQSXJ", name = "k", descriptor = "[I")
	private int[] anIntArray8 = new int[6];

	@OriginalMember(owner = "client!BUIWQSXJ", name = "l", descriptor = "I")
	public int anInt34 = 128;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "m", descriptor = "I")
	public int anInt35 = 128;

	@OriginalMember(owner = "client!BUIWQSXJ", name = "a", descriptor = "(ILclient!QDHHNYHL;)V")
	public static void method70(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub4 local8 = new Class4_Sub1_Sub4(5, arg0.method426("spotanim.dat", null));
			anInt30 = local8.method357();
			if (aClass6Array1 == null) {
				aClass6Array1 = new Class6[anInt30];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt30; local18++) {
				if (aClass6Array1[local18] == null) {
					aClass6Array1[local18] = new Class6();
				}
				aClass6Array1[local18].anInt31 = local18;
				aClass6Array1[local18].method71(local8, anInt27);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("55025, " + 0 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BUIWQSXJ", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!BUIWQSXJ", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	private void method71(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				this.anInt28 = -105;
			}
			while (true) {
				while (true) {
					@Pc(9) int local9 = arg0.method355();
					if (local9 == 0) {
						return;
					}
					if (local9 == 1) {
						this.anInt32 = arg0.method357();
					} else if (local9 == 2) {
						this.anInt33 = arg0.method357();
						if (Class21.aClass21Array1 != null) {
							this.aClass21_1 = Class21.aClass21Array1[this.anInt33];
						}
					} else if (local9 == 4) {
						this.anInt34 = arg0.method357();
					} else if (local9 == 5) {
						this.anInt35 = arg0.method357();
					} else if (local9 == 6) {
						this.anInt36 = arg0.method357();
					} else if (local9 == 7) {
						this.anInt37 = arg0.method355();
					} else if (local9 == 8) {
						this.anInt38 = arg0.method355();
					} else if (local9 >= 40 && local9 < 50) {
						this.anIntArray7[local9 - 40] = arg0.method357();
					} else if (local9 >= 50 && local9 < 60) {
						this.anIntArray8[local9 - 50] = arg0.method357();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + local9);
					}
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("74586, " + arg0 + ", " + arg1 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BUIWQSXJ", name = "a", descriptor = "()Lclient!POJFANDE;")
	public Class4_Sub1_Sub1_Sub4 method72() {
		@Pc(6) Class4_Sub1_Sub1_Sub4 local6 = (Class4_Sub1_Sub1_Sub4) aClass49_1.method570((long) this.anInt31);
		if (local6 != null) {
			return local6;
		}
		local6 = Class4_Sub1_Sub1_Sub4.method399(this.anInt32);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray7[0] != 0) {
				local6.method413(this.anIntArray7[local20], this.anIntArray8[local20]);
			}
		}
		aClass49_1.method571(local6, this.anInt29, (long) this.anInt31);
		return local6;
	}
}
