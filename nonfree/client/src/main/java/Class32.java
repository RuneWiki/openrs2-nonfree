import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QUXKFXEA")
public final class Class32 {

	@OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "I")
	private static int anInt511;

	@OriginalMember(owner = "client!QUXKFXEA", name = "b", descriptor = "[Lclient!QUXKFXEA;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!QUXKFXEA", name = "n", descriptor = "Lclient!JGECYJMS;")
	public static Class15 aClass15_4 = new Class15(30, -11885);

	@OriginalMember(owner = "client!QUXKFXEA", name = "c", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!QUXKFXEA", name = "d", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!QUXKFXEA", name = "f", descriptor = "Lclient!LMDSPIVT;")
	public Class20 aClass20_2;

	@OriginalMember(owner = "client!QUXKFXEA", name = "k", descriptor = "I")
	public int anInt517;

	@OriginalMember(owner = "client!QUXKFXEA", name = "l", descriptor = "I")
	public int anInt518;

	@OriginalMember(owner = "client!QUXKFXEA", name = "m", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!QUXKFXEA", name = "e", descriptor = "I")
	private int anInt514 = -1;

	@OriginalMember(owner = "client!QUXKFXEA", name = "g", descriptor = "[I")
	private int[] anIntArray152 = new int[6];

	@OriginalMember(owner = "client!QUXKFXEA", name = "h", descriptor = "[I")
	private int[] anIntArray153 = new int[6];

	@OriginalMember(owner = "client!QUXKFXEA", name = "i", descriptor = "I")
	public int anInt515 = 128;

	@OriginalMember(owner = "client!QUXKFXEA", name = "j", descriptor = "I")
	public int anInt516 = 128;

	@OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "(BLclient!SXKKBWPU;)V")
	public static void method311(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method364("spotanim.dat", null), -631);
			anInt511 = local8.method408();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt511];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt511; local22++) {
				if (aClass32Array1[local22] == null) {
					aClass32Array1[local22] = new Class32();
				}
				aClass32Array1[local22].anInt512 = local22;
				aClass32Array1[local22].method312(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("48825, " + -109 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUXKFXEA", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	private void method312(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(17) int local17 = arg0.method406();
				if (local17 == 0) {
					return;
				}
				if (local17 == 1) {
					this.anInt513 = arg0.method408();
				} else if (local17 == 2) {
					this.anInt514 = arg0.method408();
					if (Class20.aClass20Array1 != null) {
						this.aClass20_2 = Class20.aClass20Array1[this.anInt514];
					}
				} else if (local17 == 4) {
					this.anInt515 = arg0.method408();
				} else if (local17 == 5) {
					this.anInt516 = arg0.method408();
				} else if (local17 == 6) {
					this.anInt517 = arg0.method408();
				} else if (local17 == 7) {
					this.anInt518 = arg0.method406();
				} else if (local17 == 8) {
					this.anInt519 = arg0.method406();
				} else if (local17 >= 40 && local17 < 50) {
					this.anIntArray152[local17 - 40] = arg0.method408();
				} else if (local17 >= 50 && local17 < 60) {
					this.anIntArray153[local17 - 50] = arg0.method408();
				} else {
					System.out.println("Error unrecognised spotanim config code: " + local17);
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("11926, " + 3 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QUXKFXEA", name = "a", descriptor = "()Lclient!KDWDYCIL;")
	public Class8_Sub1_Sub1_Sub3 method313() {
		@Pc(6) Class8_Sub1_Sub1_Sub3 local6 = (Class8_Sub1_Sub1_Sub3) aClass15_4.method116((long) this.anInt512);
		if (local6 != null) {
			return local6;
		}
		local6 = Class8_Sub1_Sub1_Sub3.method136(this.anInt513);
		if (local6 == null) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < 6; local20++) {
			if (this.anIntArray152[0] != 0) {
				local6.method150(this.anIntArray152[local20], this.anIntArray153[local20]);
			}
		}
		aClass15_4.method117((long) this.anInt512, 811, local6);
		return local6;
	}
}
