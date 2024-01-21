import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!lc")
public final class Class23 {

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
	private static int anInt736;

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "[Lclient!lc;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
	private static int anInt735 = 6771;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public int anInt737;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Ljava/lang/String;")
	private String aString26;

	@OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public int anInt741;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public int anInt742;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
	public int anInt743;

	@OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
	public int anInt744;

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public int anInt738 = -1;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
	public boolean aBoolean179 = true;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!yb;)V")
	public static void method485(@OriginalArg(1) Class48 arg0) {
		try {
			if (anInt735 == 6771) {
				@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg0.method689("flo.dat", null), true);
				anInt736 = local12.method505();
				if (aClass23Array1 == null) {
					aClass23Array1 = new Class23[anInt736];
				}
				for (@Pc(22) int local22 = 0; local22 < anInt736; local22++) {
					if (aClass23Array1[local22] == null) {
						aClass23Array1[local22] = new Class23();
					}
					aClass23Array1[local22].method486(local12);
				}
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("26214, " + 6771 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLclient!mb;)V")
	private void method486(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method503();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt737 = arg0.method507();
					this.method487(this.anInt737);
				} else if (local11 == 2) {
					this.anInt738 = arg0.method503();
				} else if (local11 == 3) {
					this.aBoolean178 = true;
				} else if (local11 == 5) {
					this.aBoolean179 = false;
				} else if (local11 == 6) {
					this.aString26 = arg0.method510();
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("86091, " + 44 + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
	private void method487(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(35) double local35 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(37) double local37 = local10;
			if (local19 < local10) {
				local37 = local19;
			}
			if (local35 < local37) {
				local37 = local35;
			}
			@Pc(51) double local51 = local10;
			if (local19 > local10) {
				local51 = local19;
			}
			if (local35 > local51) {
				local51 = local35;
			}
			@Pc(65) double local65 = 0.0D;
			@Pc(67) double local67 = 0.0D;
			@Pc(73) double local73 = (local37 + local51) / 2.0D;
			if (local37 != local51) {
				if (local73 < 0.5D) {
					local67 = (local51 - local37) / (local51 + local37);
				}
				if (local73 >= 0.5D) {
					local67 = (local51 - local37) / (2.0D - local51 - local37);
				}
				if (local10 == local51) {
					local65 = (local19 - local35) / (local51 - local37);
				} else if (local19 == local51) {
					local65 = (local35 - local10) / (local51 - local37) + 2.0D;
				} else if (local35 == local51) {
					local65 = (local10 - local19) / (local51 - local37) + 4.0D;
				}
			}
			local65 /= 6.0D;
			this.anInt739 = (int) (local65 * 256.0D);
			this.anInt740 = (int) (local67 * 256.0D);
			this.anInt741 = (int) (local73 * 256.0D);
			if (this.anInt740 < 0) {
				this.anInt740 = 0;
			} else if (this.anInt740 > 255) {
				this.anInt740 = 255;
			}
			if (this.anInt741 < 0) {
				this.anInt741 = 0;
			} else if (this.anInt741 > 255) {
				this.anInt741 = 255;
			}
			if (local73 > 0.5D) {
				this.anInt743 = (int) ((1.0D - local73) * local67 * 512.0D);
			} else {
				this.anInt743 = (int) (local73 * local67 * 512.0D);
			}
			if (this.anInt743 < 1) {
				this.anInt743 = 1;
			}
			this.anInt742 = (int) (local65 * (double) this.anInt743);
			@Pc(248) int local248 = this.anInt739 + (int) (Math.random() * 16.0D) - 8;
			if (local248 < 0) {
				local248 = 0;
			} else if (local248 > 255) {
				local248 = 255;
			}
			@Pc(269) int local269 = this.anInt740 + (int) (Math.random() * 48.0D) - 24;
			if (local269 < 0) {
				local269 = 0;
			} else if (local269 > 255) {
				local269 = 255;
			}
			@Pc(290) int local290 = this.anInt741 + (int) (Math.random() * 48.0D) - 24;
			if (local290 < 0) {
				local290 = 0;
			} else if (local290 > 255) {
				local290 = 255;
			}
			this.anInt744 = this.method488(local248, local269, local290);
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("45634, " + arg0 + ", " + -930 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)I")
	private int method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
