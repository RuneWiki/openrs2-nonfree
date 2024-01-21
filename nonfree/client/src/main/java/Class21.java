import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kc")
public final class Class21 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	private static int anInt717;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[Lclient!kc;")
	public static Class21[] aClass21Array1;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private static int anInt716 = 11798;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Ljava/lang/String;")
	private String aString27;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt723;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public int anInt725;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt719 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	public boolean aBoolean174 = true;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!yb;Z)V")
	public static void method447(@OriginalArg(0) Class48 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method678("flo.dat", null), 337);
			anInt717 = local8.method500();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt717];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt717; local22++) {
				if (aClass21Array1[local22] == null) {
					aClass21Array1[local22] = new Class21();
				}
				aClass21Array1[local22].method448(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("60250, " + arg0 + ", " + true + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	private Class21() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!mb;)V")
	private void method448(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method498();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt718 = arg0.method502();
					this.method449((byte) 4, this.anInt718);
				} else if (local9 == 2) {
					this.anInt719 = arg0.method498();
				} else if (local9 == 3) {
					this.aBoolean173 = true;
				} else if (local9 == 5) {
					this.aBoolean174 = false;
				} else if (local9 == 6) {
					this.aString27 = arg0.method505();
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("19177, " + 0 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)V")
	private void method449(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(10) double local10 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg1 & 0xFF) / 256.0D;
			@Pc(28) double local28 = local10;
			if (local19 < local10) {
				local28 = local19;
			}
			if (local26 < local28) {
				local28 = local26;
			}
			@Pc(42) double local42 = local10;
			@Pc(47) boolean local47 = false;
			if (local19 > local10) {
				local42 = local19;
			}
			if (local26 > local42) {
				local42 = local26;
			}
			@Pc(64) double local64 = 0.0D;
			@Pc(66) double local66 = 0.0D;
			@Pc(72) double local72 = (local28 + local42) / 2.0D;
			if (local28 != local42) {
				if (local72 < 0.5D) {
					local66 = (local42 - local28) / (local42 + local28);
				}
				if (local72 >= 0.5D) {
					local66 = (local42 - local28) / (2.0D - local42 - local28);
				}
				if (local10 == local42) {
					local64 = (local19 - local26) / (local42 - local28);
				} else if (local19 == local42) {
					local64 = (local26 - local10) / (local42 - local28) + 2.0D;
				} else if (local26 == local42) {
					local64 = (local10 - local19) / (local42 - local28) + 4.0D;
				}
			}
			local64 /= 6.0D;
			this.anInt720 = (int) (local64 * 256.0D);
			this.anInt721 = (int) (local66 * 256.0D);
			this.anInt722 = (int) (local72 * 256.0D);
			if (this.anInt721 < 0) {
				this.anInt721 = 0;
			} else if (this.anInt721 > 255) {
				this.anInt721 = 255;
			}
			if (this.anInt722 < 0) {
				this.anInt722 = 0;
			} else if (this.anInt722 > 255) {
				this.anInt722 = 255;
			}
			if (local72 > 0.5D) {
				this.anInt724 = (int) ((1.0D - local72) * local66 * 512.0D);
			} else {
				this.anInt724 = (int) (local72 * local66 * 512.0D);
			}
			if (this.anInt724 < 1) {
				this.anInt724 = 1;
			}
			this.anInt723 = (int) (local64 * (double) this.anInt724);
			@Pc(247) int local247 = this.anInt720 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt721 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt722 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt725 = this.method450(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("3354, " + arg0 + ", " + arg1 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)I")
	private int method450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}
		if (arg2 > 192) {
			arg1 /= 2;
		}
		if (arg2 > 217) {
			arg1 /= 2;
		}
		if (arg2 > 243) {
			arg1 /= 2;
		}
		return (arg0 / 4 << 10) + (arg1 / 32 << 7) + arg2 / 2;
	}
}
