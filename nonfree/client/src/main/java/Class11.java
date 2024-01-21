import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fc")
public final class Class11 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
	public static int anInt381;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "[Lclient!fc;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "B")
	private static byte aByte16 = 6;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Z")
	private static boolean aBoolean98 = true;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Ljava/lang/String;")
	public String aString18;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	public int anInt384;

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
	public int anInt385;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public int anInt386;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	public int anInt387;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
	public int anInt388;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
	public int anInt383 = -1;

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!ub;)V")
	public static void method260(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method516("flo.dat", null), aBoolean98);
			anInt381 = local9.method374();
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt381];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt381; local22++) {
				if (aClass11Array1[local22] == null) {
					aClass11Array1[local22] = new Class11();
				}
				aClass11Array1[local22].method261(aByte16, local9);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("64958, " + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!kb;)V")
	private void method261(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(10) int local10;
			if (arg0 == 6) {
				@Pc(6) boolean local6 = false;
			} else {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			while (true) {
				local10 = arg1.method372();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt382 = arg1.method376();
					this.method262(this.anInt382);
				} else if (local10 == 2) {
					this.anInt383 = arg1.method372();
				} else if (local10 == 3) {
					this.aBoolean99 = true;
				} else if (local10 == 5) {
					this.aBoolean100 = false;
				} else if (local10 == 6) {
					this.aString18 = arg1.method379();
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("89594, " + arg0 + ", " + arg1 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	private void method262(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(28) double local28 = local10;
			if (local19 < local10) {
				local28 = local19;
			}
			if (local26 < local28) {
				local28 = local26;
			}
			@Pc(42) double local42 = local10;
			if (local19 > local10) {
				local42 = local19;
			}
			if (local26 > local42) {
				local42 = local26;
			}
			@Pc(56) double local56 = 0.0D;
			@Pc(58) double local58 = 0.0D;
			@Pc(64) double local64 = (local28 + local42) / 2.0D;
			if (local28 != local42) {
				if (local64 < 0.5D) {
					local58 = (local42 - local28) / (local42 + local28);
				}
				if (local64 >= 0.5D) {
					local58 = (local42 - local28) / (2.0D - local42 - local28);
				}
				if (local10 == local42) {
					local56 = (local19 - local26) / (local42 - local28);
				} else if (local19 == local42) {
					local56 = (local26 - local10) / (local42 - local28) + 2.0D;
				} else if (local26 == local42) {
					local56 = (local10 - local19) / (local42 - local28) + 4.0D;
				}
			}
			local56 /= 6.0D;
			this.anInt384 = (int) (local56 * 256.0D);
			this.anInt385 = (int) (local58 * 256.0D);
			this.anInt386 = (int) (local64 * 256.0D);
			if (this.anInt385 < 0) {
				this.anInt385 = 0;
			} else if (this.anInt385 > 255) {
				this.anInt385 = 255;
			}
			if (this.anInt386 < 0) {
				this.anInt386 = 0;
			} else if (this.anInt386 > 255) {
				this.anInt386 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt388 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt388 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt388 < 1) {
				this.anInt388 = 1;
			}
			this.anInt387 = (int) (local56 * (double) this.anInt388);
		} catch (@Pc(240) RuntimeException local240) {
			signlink.reporterror("32893, " + ", " + arg0 + ", " + local240.toString());
			throw new RuntimeException();
		}
	}
}
