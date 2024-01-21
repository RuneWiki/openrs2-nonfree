import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YOJCLTLA")
public final class Class48 {

	@OriginalMember(owner = "client!YOJCLTLA", name = "c", descriptor = "I")
	private static int anInt822;

	@OriginalMember(owner = "client!YOJCLTLA", name = "d", descriptor = "[Lclient!YOJCLTLA;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!YOJCLTLA", name = "e", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!YOJCLTLA", name = "f", descriptor = "I")
	public int anInt823;

	@OriginalMember(owner = "client!YOJCLTLA", name = "j", descriptor = "I")
	public int anInt825;

	@OriginalMember(owner = "client!YOJCLTLA", name = "k", descriptor = "I")
	public int anInt826;

	@OriginalMember(owner = "client!YOJCLTLA", name = "l", descriptor = "I")
	public int anInt827;

	@OriginalMember(owner = "client!YOJCLTLA", name = "m", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!YOJCLTLA", name = "n", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!YOJCLTLA", name = "o", descriptor = "I")
	public int anInt830;

	@OriginalMember(owner = "client!YOJCLTLA", name = "a", descriptor = "I")
	private int anInt821 = 22486;

	@OriginalMember(owner = "client!YOJCLTLA", name = "b", descriptor = "Z")
	private boolean aBoolean214 = false;

	@OriginalMember(owner = "client!YOJCLTLA", name = "g", descriptor = "I")
	public int anInt824 = -1;

	@OriginalMember(owner = "client!YOJCLTLA", name = "h", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!YOJCLTLA", name = "i", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!YOJCLTLA", name = "a", descriptor = "(Lclient!VSUYIIVA;I)V")
	public static void method559(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(12) Class1_Sub1_Sub2 local12 = new Class1_Sub1_Sub2(arg0.method539("flo.dat", null), 792);
			anInt822 = local12.method61();
			if (aClass48Array1 == null) {
				aClass48Array1 = new Class48[anInt822];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt822; local22++) {
				if (aClass48Array1[local22] == null) {
					aClass48Array1[local22] = new Class48();
				}
				aClass48Array1[local22].method560(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("78435, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOJCLTLA", name = "<init>", descriptor = "()V")
	private Class48() {
	}

	@OriginalMember(owner = "client!YOJCLTLA", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	private void method560(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			if (this.anInt821 != 22486) {
				this.anInt821 = 409;
			}
			while (true) {
				@Pc(11) int local11 = arg0.method59();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt823 = arg0.method63();
					this.method561(this.anInt823);
				} else if (local11 == 2) {
					this.anInt824 = arg0.method59();
				} else if (local11 == 3) {
					this.aBoolean215 = true;
				} else if (local11 == 5) {
					this.aBoolean216 = false;
				} else if (local11 == 6) {
					this.aString16 = arg0.method66();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt825;
					@Pc(71) int local71 = this.anInt826;
					@Pc(74) int local74 = this.anInt827;
					@Pc(77) int local77 = this.anInt828;
					@Pc(80) int local80 = arg0.method63();
					this.method561(local80);
					this.anInt825 = local68;
					this.anInt826 = local71;
					this.anInt827 = local74;
					this.anInt828 = local77;
					this.anInt829 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("27547, " + arg0 + ", " + 22486 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOJCLTLA", name = "a", descriptor = "(IB)V")
	private void method561(@OriginalArg(0) int arg0) {
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
			this.anInt825 = (int) (local56 * 256.0D);
			this.anInt826 = (int) (local58 * 256.0D);
			this.anInt827 = (int) (local64 * 256.0D);
			if (this.anInt826 < 0) {
				this.anInt826 = 0;
			} else if (this.anInt826 > 255) {
				this.anInt826 = 255;
			}
			if (this.anInt827 < 0) {
				this.anInt827 = 0;
			} else if (this.anInt827 > 255) {
				this.anInt827 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt829 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt829 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt829 < 1) {
				this.anInt829 = 1;
			}
			this.anInt828 = (int) (local56 * (double) this.anInt829);
			@Pc(250) int local250 = this.anInt825 + (int) (Math.random() * 16.0D) - 8;
			if (local250 < 0) {
				local250 = 0;
			} else if (local250 > 255) {
				local250 = 255;
			}
			@Pc(271) int local271 = this.anInt826 + (int) (Math.random() * 48.0D) - 24;
			if (local271 < 0) {
				local271 = 0;
			} else if (local271 > 255) {
				local271 = 255;
			}
			@Pc(292) int local292 = this.anInt827 + (int) (Math.random() * 48.0D) - 24;
			if (local292 < 0) {
				local292 = 0;
			} else if (local292 > 255) {
				local292 = 255;
			}
			this.anInt830 = this.method562(local250, local271, local292);
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("82202, " + arg0 + ", " + 5 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YOJCLTLA", name = "a", descriptor = "(III)I")
	private int method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
