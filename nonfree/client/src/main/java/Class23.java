import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private static int anInt596;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	private static int anInt597;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
	private static int[] anIntArray194;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "B")
	private static byte aByte34 = 9;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Ljava/lang/String;")
	private String aString25;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	private int anInt598;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public int anInt600;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	private int anInt601;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Z")
	private boolean aBoolean134 = true;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method411(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(13) Class1_Sub3_Sub3 local13 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "varp.dat"));
			anInt597 = 0;
			anInt596 = local13.method393();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt596];
			}
			if (anIntArray194 == null) {
				anIntArray194 = new int[anInt596];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt596; local30++) {
				if (aClass23Array1[local30] == null) {
					aClass23Array1[local30] = new Class23();
				}
				aClass23Array1[local30].method412(local13, local30, aByte34);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("30717, " + -5880 + ", " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!kb;IB)V")
	private void method412(@OriginalArg(0) Class1_Sub3_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (arg2 == 9) {
				while (true) {
					@Pc(8) int local8 = arg0.method391();
					if (local8 == 0) {
						return;
					}
					if (local8 == 1) {
						this.anInt598 = arg0.method391();
					} else if (local8 == 2) {
						this.anInt599 = arg0.method391();
					} else if (local8 == 3) {
						this.aBoolean133 = true;
						anIntArray194[anInt597++] = arg1;
					} else if (local8 == 4) {
						this.aBoolean134 = false;
					} else if (local8 == 5) {
						this.anInt600 = arg0.method393();
					} else if (local8 == 6) {
						this.aBoolean135 = true;
					} else if (local8 == 7) {
						this.anInt601 = arg0.method396();
					} else if (local8 == 8) {
						this.aBoolean136 = true;
					} else if (local8 == 10) {
						this.aString25 = arg0.method398();
					} else {
						System.out.println("Error unrecognised config code: " + local8);
					}
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("8798, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}
}
