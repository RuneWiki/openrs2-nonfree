import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UGHJOVKI")
public final class Class45 {

	@OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "I")
	private static int anInt750;

	@OriginalMember(owner = "client!UGHJOVKI", name = "b", descriptor = "[Lclient!UGHJOVKI;")
	public static Class45[] aClass45Array1;

	@OriginalMember(owner = "client!UGHJOVKI", name = "c", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!UGHJOVKI", name = "d", descriptor = "I")
	public int anInt751;

	@OriginalMember(owner = "client!UGHJOVKI", name = "h", descriptor = "I")
	public int anInt753;

	@OriginalMember(owner = "client!UGHJOVKI", name = "i", descriptor = "I")
	public int anInt754;

	@OriginalMember(owner = "client!UGHJOVKI", name = "j", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!UGHJOVKI", name = "k", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!UGHJOVKI", name = "l", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!UGHJOVKI", name = "m", descriptor = "I")
	public int anInt758;

	@OriginalMember(owner = "client!UGHJOVKI", name = "e", descriptor = "I")
	public int anInt752 = -1;

	@OriginalMember(owner = "client!UGHJOVKI", name = "f", descriptor = "Z")
	private boolean aBoolean197 = false;

	@OriginalMember(owner = "client!UGHJOVKI", name = "g", descriptor = "Z")
	public boolean aBoolean198 = true;

	@OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(BLclient!ESUFCMYV;)V")
	public static void method507(@OriginalArg(1) Class11 arg0) {
		try {
			@Pc(8) Class6_Sub1_Sub4 local8 = new Class6_Sub1_Sub4(arg0.method89("flo.dat", null), (byte) -17);
			anInt750 = local8.method413();
			if (aClass45Array1 == null) {
				aClass45Array1 = new Class45[anInt750];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt750; local22++) {
				if (aClass45Array1[local22] == null) {
					aClass45Array1[local22] = new Class45();
				}
				aClass45Array1[local22].method508(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("89290, " + 6 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGHJOVKI", name = "<init>", descriptor = "()V")
	private Class45() {
	}

	@OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(ILclient!RGCGKKUR;)V")
	private void method508(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method411();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt751 = arg0.method415();
					this.method509(this.anInt751);
				} else if (local14 == 2) {
					this.anInt752 = arg0.method411();
				} else if (local14 == 3) {
					this.aBoolean197 = true;
				} else if (local14 == 5) {
					this.aBoolean198 = false;
				} else if (local14 == 6) {
					this.aString15 = arg0.method418();
				} else if (local14 == 7) {
					@Pc(71) int local71 = this.anInt753;
					@Pc(74) int local74 = this.anInt754;
					@Pc(77) int local77 = this.anInt755;
					@Pc(80) int local80 = this.anInt756;
					@Pc(83) int local83 = arg0.method415();
					this.method509(local83);
					this.anInt753 = local71;
					this.anInt754 = local74;
					this.anInt755 = local77;
					this.anInt756 = local80;
					this.anInt757 = local80;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("92551, " + 5 + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(II)V")
	private void method509(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(31) double local31 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(33) double local33 = local15;
			if (local24 < local15) {
				local33 = local24;
			}
			if (local31 < local33) {
				local33 = local31;
			}
			@Pc(47) double local47 = local15;
			if (local24 > local15) {
				local47 = local24;
			}
			if (local31 > local47) {
				local47 = local31;
			}
			@Pc(64) double local64 = 0.0D;
			@Pc(66) double local66 = 0.0D;
			@Pc(72) double local72 = (local33 + local47) / 2.0D;
			if (local33 != local47) {
				if (local72 < 0.5D) {
					local66 = (local47 - local33) / (local47 + local33);
				}
				if (local72 >= 0.5D) {
					local66 = (local47 - local33) / (2.0D - local47 - local33);
				}
				if (local15 == local47) {
					local64 = (local24 - local31) / (local47 - local33);
				} else if (local24 == local47) {
					local64 = (local31 - local15) / (local47 - local33) + 2.0D;
				} else if (local31 == local47) {
					local64 = (local15 - local24) / (local47 - local33) + 4.0D;
				}
			}
			local64 /= 6.0D;
			this.anInt753 = (int) (local64 * 256.0D);
			this.anInt754 = (int) (local66 * 256.0D);
			this.anInt755 = (int) (local72 * 256.0D);
			if (this.anInt754 < 0) {
				this.anInt754 = 0;
			} else if (this.anInt754 > 255) {
				this.anInt754 = 255;
			}
			if (this.anInt755 < 0) {
				this.anInt755 = 0;
			} else if (this.anInt755 > 255) {
				this.anInt755 = 255;
			}
			if (local72 > 0.5D) {
				this.anInt757 = (int) ((1.0D - local72) * local66 * 512.0D);
			} else {
				this.anInt757 = (int) (local72 * local66 * 512.0D);
			}
			if (this.anInt757 < 1) {
				this.anInt757 = 1;
			}
			this.anInt756 = (int) (local64 * (double) this.anInt757);
			@Pc(247) int local247 = this.anInt753 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt754 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt755 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt758 = this.method510(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("83991, " + arg0 + ", " + 548 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UGHJOVKI", name = "a", descriptor = "(III)I")
	private int method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
