import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TYXORIIC")
public final class Class39 {

	@OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "I")
	private static int anInt555;

	@OriginalMember(owner = "client!TYXORIIC", name = "b", descriptor = "[Lclient!TYXORIIC;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!TYXORIIC", name = "n", descriptor = "Lclient!DSCQIAPU;")
	public static Class7 aClass7_8 = new Class7(401, 30);

	@OriginalMember(owner = "client!TYXORIIC", name = "c", descriptor = "I")
	private int anInt556;

	@OriginalMember(owner = "client!TYXORIIC", name = "d", descriptor = "I")
	private int anInt557;

	@OriginalMember(owner = "client!TYXORIIC", name = "f", descriptor = "Lclient!PVVHTYPN;")
	public Class30 aClass30_2;

	@OriginalMember(owner = "client!TYXORIIC", name = "k", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!TYXORIIC", name = "l", descriptor = "I")
	public int anInt562;

	@OriginalMember(owner = "client!TYXORIIC", name = "m", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!TYXORIIC", name = "e", descriptor = "I")
	private int anInt558 = -1;

	@OriginalMember(owner = "client!TYXORIIC", name = "g", descriptor = "[I")
	private int[] anIntArray122 = new int[6];

	@OriginalMember(owner = "client!TYXORIIC", name = "h", descriptor = "[I")
	private int[] anIntArray123 = new int[6];

	@OriginalMember(owner = "client!TYXORIIC", name = "i", descriptor = "I")
	public int anInt559 = 128;

	@OriginalMember(owner = "client!TYXORIIC", name = "j", descriptor = "I")
	public int anInt560 = 128;

	@OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "(BLclient!RPFMUSNN;)V")
	public static void method375(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(12) Class3_Sub1_Sub4 local12 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("spotanim.dat", null));
			anInt555 = local12.method460();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt555];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt555; local22++) {
				if (aClass39Array1[local22] == null) {
					aClass39Array1[local22] = new Class39();
				}
				aClass39Array1[local22].anInt556 = local22;
				aClass39Array1[local22].method376(local12);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("27934, " + -114 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYXORIIC", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	private void method376(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(12) int local12 = arg0.method458();
				if (local12 == 0) {
					return;
				}
				if (local12 == 1) {
					this.anInt557 = arg0.method460();
				} else if (local12 == 2) {
					this.anInt558 = arg0.method460();
					if (Class30.aClass30Array1 != null) {
						this.aClass30_2 = Class30.aClass30Array1[this.anInt558];
					}
				} else if (local12 == 4) {
					this.anInt559 = arg0.method460();
				} else if (local12 == 5) {
					this.anInt560 = arg0.method460();
				} else if (local12 == 6) {
					this.anInt561 = arg0.method460();
				} else if (local12 == 7) {
					this.anInt562 = arg0.method458();
				} else if (local12 == 8) {
					this.anInt563 = arg0.method458();
				} else if (local12 >= 40 && local12 < 50) {
					this.anIntArray122[local12 - 40] = arg0.method460();
				} else if (local12 >= 50 && local12 < 60) {
					this.anIntArray123[local12 - 50] = arg0.method460();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local12);
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("52766, " + -934 + ", " + arg0 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYXORIIC", name = "a", descriptor = "()Lclient!UNLYQRUD;")
	public Class3_Sub1_Sub1_Sub5 method377() {
		@Pc(6) Class3_Sub1_Sub1_Sub5 local6 = (Class3_Sub1_Sub1_Sub5) aClass7_8.method65((long) this.anInt556);
		if (local6 != null) {
			return local6;
		}
		local6 = Class3_Sub1_Sub1_Sub5.method396(this.anInt557);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray122[0] != 0) {
				local6.method410(this.anIntArray122[local20], this.anIntArray123[local20]);
			}
		}
		aClass7_8.method66(local6, (long) this.anInt556);
		return local6;
	}
}
