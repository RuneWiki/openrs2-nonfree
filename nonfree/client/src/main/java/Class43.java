import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WDDURNZH")
public final class Class43 {

	@OriginalMember(owner = "client!WDDURNZH", name = "b", descriptor = "I")
	private static int anInt755;

	@OriginalMember(owner = "client!WDDURNZH", name = "c", descriptor = "Z")
	private static boolean aBoolean188;

	@OriginalMember(owner = "client!WDDURNZH", name = "d", descriptor = "I")
	private static int anInt756;

	@OriginalMember(owner = "client!WDDURNZH", name = "e", descriptor = "[Lclient!WDDURNZH;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!WDDURNZH", name = "f", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!WDDURNZH", name = "g", descriptor = "I")
	public int anInt757;

	@OriginalMember(owner = "client!WDDURNZH", name = "k", descriptor = "I")
	public int anInt759;

	@OriginalMember(owner = "client!WDDURNZH", name = "l", descriptor = "I")
	public int anInt760;

	@OriginalMember(owner = "client!WDDURNZH", name = "m", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!WDDURNZH", name = "n", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!WDDURNZH", name = "o", descriptor = "I")
	public int anInt763;

	@OriginalMember(owner = "client!WDDURNZH", name = "p", descriptor = "I")
	public int anInt764;

	@OriginalMember(owner = "client!WDDURNZH", name = "a", descriptor = "I")
	private int anInt754 = 16191;

	@OriginalMember(owner = "client!WDDURNZH", name = "h", descriptor = "I")
	public int anInt758 = -1;

	@OriginalMember(owner = "client!WDDURNZH", name = "i", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!WDDURNZH", name = "j", descriptor = "Z")
	public boolean aBoolean190 = true;

	@OriginalMember(owner = "client!WDDURNZH", name = "a", descriptor = "(ILclient!SPZBTZXL;)V")
	public static void method537(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method491("flo.dat", null), anInt755);
			anInt756 = local8.method361();
			if (aClass43Array1 == null) {
				aClass43Array1 = new Class43[anInt756];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt756; local26++) {
				if (aClass43Array1[local26] == null) {
					aClass43Array1[local26] = new Class43();
				}
				aClass43Array1[local26].method538(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("66118, " + 68 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WDDURNZH", name = "<init>", descriptor = "()V")
	private Class43() {
	}

	@OriginalMember(owner = "client!WDDURNZH", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	private void method538(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			if (this.anInt754 != 16191) {
				aBoolean188 = !aBoolean188;
			}
			while (true) {
				@Pc(14) int local14 = arg0.method359();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt757 = arg0.method363();
					this.method539(this.anInt757);
				} else if (local14 == 2) {
					this.anInt758 = arg0.method359();
				} else if (local14 == 3) {
					this.aBoolean189 = true;
				} else if (local14 == 5) {
					this.aBoolean190 = false;
				} else if (local14 == 6) {
					this.aString15 = arg0.method366();
				} else if (local14 == 7) {
					@Pc(71) int local71 = this.anInt759;
					@Pc(74) int local74 = this.anInt760;
					@Pc(77) int local77 = this.anInt761;
					@Pc(80) int local80 = this.anInt762;
					@Pc(83) int local83 = arg0.method363();
					this.method539(local83);
					this.anInt759 = local71;
					this.anInt760 = local74;
					this.anInt761 = local77;
					this.anInt762 = local80;
					this.anInt763 = local80;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("29173, " + arg0 + ", " + 16191 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WDDURNZH", name = "a", descriptor = "(IZ)V")
	private void method539(@OriginalArg(0) int arg0) {
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
			@Pc(45) double local45 = local10;
			if (local19 > local10) {
				local45 = local19;
			}
			if (local26 > local45) {
				local45 = local26;
			}
			@Pc(59) double local59 = 0.0D;
			@Pc(61) double local61 = 0.0D;
			@Pc(67) double local67 = (local28 + local45) / 2.0D;
			if (local28 != local45) {
				if (local67 < 0.5D) {
					local61 = (local45 - local28) / (local45 + local28);
				}
				if (local67 >= 0.5D) {
					local61 = (local45 - local28) / (2.0D - local45 - local28);
				}
				if (local10 == local45) {
					local59 = (local19 - local26) / (local45 - local28);
				} else if (local19 == local45) {
					local59 = (local26 - local10) / (local45 - local28) + 2.0D;
				} else if (local26 == local45) {
					local59 = (local10 - local19) / (local45 - local28) + 4.0D;
				}
			}
			local59 /= 6.0D;
			this.anInt759 = (int) (local59 * 256.0D);
			this.anInt760 = (int) (local61 * 256.0D);
			this.anInt761 = (int) (local67 * 256.0D);
			if (this.anInt760 < 0) {
				this.anInt760 = 0;
			} else if (this.anInt760 > 255) {
				this.anInt760 = 255;
			}
			if (this.anInt761 < 0) {
				this.anInt761 = 0;
			} else if (this.anInt761 > 255) {
				this.anInt761 = 255;
			}
			if (local67 > 0.5D) {
				this.anInt763 = (int) ((1.0D - local67) * local61 * 512.0D);
			} else {
				this.anInt763 = (int) (local67 * local61 * 512.0D);
			}
			if (this.anInt763 < 1) {
				this.anInt763 = 1;
			}
			this.anInt762 = (int) (local59 * (double) this.anInt763);
			@Pc(242) int local242 = this.anInt759 + (int) (Math.random() * 16.0D) - 8;
			if (local242 < 0) {
				local242 = 0;
			} else if (local242 > 255) {
				local242 = 255;
			}
			@Pc(263) int local263 = this.anInt760 + (int) (Math.random() * 48.0D) - 24;
			if (local263 < 0) {
				local263 = 0;
			} else if (local263 > 255) {
				local263 = 255;
			}
			@Pc(284) int local284 = this.anInt761 + (int) (Math.random() * 48.0D) - 24;
			if (local284 < 0) {
				local284 = 0;
			} else if (local284 > 255) {
				local284 = 255;
			}
			this.anInt764 = this.method540(local242, local263, local284);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("76758, " + arg0 + ", " + true + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WDDURNZH", name = "a", descriptor = "(III)I")
	private int method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
