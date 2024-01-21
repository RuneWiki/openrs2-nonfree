import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FXNZCBPL")
public final class Class6 {

	@OriginalMember(owner = "client!FXNZCBPL", name = "b", descriptor = "I")
	private static int anInt117;

	@OriginalMember(owner = "client!FXNZCBPL", name = "c", descriptor = "[Lclient!FXNZCBPL;")
	public static Class6[] aClass6Array1;

	@OriginalMember(owner = "client!FXNZCBPL", name = "o", descriptor = "Lclient!ZPNSJLZE;")
	public static Class49 aClass49_1 = new Class49(30, false);

	@OriginalMember(owner = "client!FXNZCBPL", name = "a", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!FXNZCBPL", name = "d", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!FXNZCBPL", name = "e", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!FXNZCBPL", name = "g", descriptor = "Lclient!PNPNYEVW;")
	public Class31 aClass31_2;

	@OriginalMember(owner = "client!FXNZCBPL", name = "l", descriptor = "I")
	public int anInt123;

	@OriginalMember(owner = "client!FXNZCBPL", name = "m", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!FXNZCBPL", name = "n", descriptor = "I")
	public int anInt125;

	@OriginalMember(owner = "client!FXNZCBPL", name = "f", descriptor = "I")
	private int anInt120 = -1;

	@OriginalMember(owner = "client!FXNZCBPL", name = "h", descriptor = "[I")
	private int[] anIntArray48 = new int[6];

	@OriginalMember(owner = "client!FXNZCBPL", name = "i", descriptor = "[I")
	private int[] anIntArray49 = new int[6];

	@OriginalMember(owner = "client!FXNZCBPL", name = "j", descriptor = "I")
	public int anInt121 = 128;

	@OriginalMember(owner = "client!FXNZCBPL", name = "k", descriptor = "I")
	public int anInt122 = 128;

	@OriginalMember(owner = "client!FXNZCBPL", name = "a", descriptor = "(ILclient!INOFEYKQ;)V")
	public static void method80(@OriginalArg(1) Class14 arg0) {
		try {
			@Pc(10) Class3_Sub1_Sub3 local10 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("spotanim.dat", (byte[]) null));
			anInt117 = local10.method276();
			if (aClass6Array1 == null) {
				aClass6Array1 = new Class6[anInt117];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt117; local20++) {
				if (aClass6Array1[local20] == null) {
					aClass6Array1[local20] = new Class6();
				}
				aClass6Array1[local20].anInt118 = local20;
				aClass6Array1[local20].method81(local10);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("25937, " + -351 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FXNZCBPL", name = "<init>", descriptor = "()V")
	private Class6() {
	}

	@OriginalMember(owner = "client!FXNZCBPL", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	private void method81(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method274();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt119 = arg0.method276();
				} else if (local10 == 2) {
					this.anInt120 = arg0.method276();
					if (Class31.aClass31Array1 != null) {
						this.aClass31_2 = Class31.aClass31Array1[this.anInt120];
					}
				} else if (local10 == 4) {
					this.anInt121 = arg0.method276();
				} else if (local10 == 5) {
					this.anInt122 = arg0.method276();
				} else if (local10 == 6) {
					this.anInt123 = arg0.method276();
				} else if (local10 == 7) {
					this.anInt124 = arg0.method274();
				} else if (local10 == 8) {
					this.anInt125 = arg0.method274();
				} else if (local10 >= 40 && local10 < 50) {
					this.anIntArray48[local10 - 40] = arg0.method276();
				} else if (local10 >= 50 && local10 < 60) {
					this.anIntArray49[local10 - 50] = arg0.method276();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local10);
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("16256, " + false + ", " + arg0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FXNZCBPL", name = "a", descriptor = "()Lclient!CSGBDGDY;")
	public Class3_Sub1_Sub1_Sub1 method82() {
		@Pc(6) Class3_Sub1_Sub1_Sub1 local6 = (Class3_Sub1_Sub1_Sub1) aClass49_1.method542((long) this.anInt118);
		if (local6 != null) {
			return local6;
		}
		local6 = Class3_Sub1_Sub1_Sub1.method33(this.anInt119);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray48[0] != 0) {
				local6.method47(this.anIntArray48[local20], this.anIntArray49[local20]);
			}
		}
		aClass49_1.method543(local6, this.anInt116, (long) this.anInt118);
		return local6;
	}
}
