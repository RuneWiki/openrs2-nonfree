import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	public static int anInt62;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[Lclient!cc;")
	public static Class5[] aClass5Array1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	public int anInt66;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	public int anInt67;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
	public int anInt68;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	public int anInt69;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
	public int anInt64 = -1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Z")
	public boolean aBoolean25 = true;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!ub;)V")
	public static void method51(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(9) Class1_Sub3_Sub3 local9 = new Class1_Sub3_Sub3(arg0.method479((byte) 6, null, "flo.dat"), 4);
			anInt62 = local9.method382();
			if (aClass5Array1 == null) {
				aClass5Array1 = new Class5[anInt62];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt62; local22++) {
				if (aClass5Array1[local22] == null) {
					aClass5Array1[local22] = new Class5();
				}
				aClass5Array1[local22].method52(213, local9);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("72336, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	private Class5() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILclient!kb;)V")
	private void method52(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub3 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(8) int local8 = arg1.method380();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt63 = arg1.method384();
					this.method53(this.anInt63);
				} else if (local8 == 2) {
					this.anInt64 = arg1.method380();
				} else if (local8 == 3) {
					this.aBoolean24 = true;
				} else if (local8 == 5) {
					this.aBoolean25 = false;
				} else if (local8 == 6) {
					this.aString1 = arg1.method387();
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("46747, " + arg0 + ", " + arg1 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BI)V")
	private void method53(@OriginalArg(1) int arg0) {
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
			this.anInt65 = (int) (local56 * 256.0D);
			this.anInt66 = (int) (local58 * 256.0D);
			this.anInt67 = (int) (local64 * 256.0D);
			if (this.anInt66 < 0) {
				this.anInt66 = 0;
			} else if (this.anInt66 > 255) {
				this.anInt66 = 255;
			}
			if (this.anInt67 < 0) {
				this.anInt67 = 0;
			} else if (this.anInt67 > 255) {
				this.anInt67 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt69 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt69 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt69 < 1) {
				this.anInt69 = 1;
			}
			this.anInt68 = (int) (local56 * (double) this.anInt69);
		} catch (@Pc(235) RuntimeException local235) {
			signlink.reporterror("65232, " + 8 + ", " + arg0 + ", " + local235.toString());
			throw new RuntimeException();
		}
	}
}
