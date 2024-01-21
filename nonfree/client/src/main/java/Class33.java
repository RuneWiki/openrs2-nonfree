import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SXDNVMNH")
public final class Class33 {

	@OriginalMember(owner = "client!SXDNVMNH", name = "a", descriptor = "I")
	private static int anInt649;

	@OriginalMember(owner = "client!SXDNVMNH", name = "b", descriptor = "[Lclient!SXDNVMNH;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!SXDNVMNH", name = "c", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!SXDNVMNH", name = "d", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!SXDNVMNH", name = "h", descriptor = "I")
	public int anInt652;

	@OriginalMember(owner = "client!SXDNVMNH", name = "i", descriptor = "I")
	public int anInt653;

	@OriginalMember(owner = "client!SXDNVMNH", name = "j", descriptor = "I")
	public int anInt654;

	@OriginalMember(owner = "client!SXDNVMNH", name = "k", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!SXDNVMNH", name = "l", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!SXDNVMNH", name = "m", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!SXDNVMNH", name = "e", descriptor = "I")
	public int anInt651 = -1;

	@OriginalMember(owner = "client!SXDNVMNH", name = "f", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!SXDNVMNH", name = "g", descriptor = "Z")
	public boolean aBoolean175 = true;

	@OriginalMember(owner = "client!SXDNVMNH", name = "a", descriptor = "(Lclient!GWOEELWB;B)V")
	public static void method457(@OriginalArg(0) Class13 arg0) {
		try {
			@Pc(12) Class3_Sub1_Sub2 local12 = new Class3_Sub1_Sub2(true, arg0.method140("flo.dat", null));
			anInt649 = local12.method202();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt649];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt649; local22++) {
				if (aClass33Array1[local22] == null) {
					aClass33Array1[local22] = new Class33();
				}
				aClass33Array1[local22].method458(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("80664, " + arg0 + ", " + 3 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXDNVMNH", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!SXDNVMNH", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	private void method458(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method200();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt650 = arg0.method204();
					this.method459(this.anInt650);
				} else if (local11 == 2) {
					this.anInt651 = arg0.method200();
				} else if (local11 == 3) {
					this.aBoolean174 = true;
				} else if (local11 == 5) {
					this.aBoolean175 = false;
				} else if (local11 == 6) {
					this.aString14 = arg0.method207();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt652;
					@Pc(71) int local71 = this.anInt653;
					@Pc(74) int local74 = this.anInt654;
					@Pc(77) int local77 = this.anInt655;
					@Pc(80) int local80 = arg0.method204();
					this.method459(local80);
					this.anInt652 = local68;
					this.anInt653 = local71;
					this.anInt654 = local74;
					this.anInt655 = local77;
					this.anInt656 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("30018, " + arg0 + ", " + 2 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXDNVMNH", name = "a", descriptor = "(II)V")
	private void method459(@OriginalArg(0) int arg0) {
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
			@Pc(59) double local59 = 0.0D;
			@Pc(61) double local61 = 0.0D;
			@Pc(67) double local67 = (local28 + local42) / 2.0D;
			if (local28 != local42) {
				if (local67 < 0.5D) {
					local61 = (local42 - local28) / (local42 + local28);
				}
				if (local67 >= 0.5D) {
					local61 = (local42 - local28) / (2.0D - local42 - local28);
				}
				if (local10 == local42) {
					local59 = (local19 - local26) / (local42 - local28);
				} else if (local19 == local42) {
					local59 = (local26 - local10) / (local42 - local28) + 2.0D;
				} else if (local26 == local42) {
					local59 = (local10 - local19) / (local42 - local28) + 4.0D;
				}
			}
			local59 /= 6.0D;
			this.anInt652 = (int) (local59 * 256.0D);
			this.anInt653 = (int) (local61 * 256.0D);
			this.anInt654 = (int) (local67 * 256.0D);
			if (this.anInt653 < 0) {
				this.anInt653 = 0;
			} else if (this.anInt653 > 255) {
				this.anInt653 = 255;
			}
			if (this.anInt654 < 0) {
				this.anInt654 = 0;
			} else if (this.anInt654 > 255) {
				this.anInt654 = 255;
			}
			if (local67 > 0.5D) {
				this.anInt656 = (int) ((1.0D - local67) * local61 * 512.0D);
			} else {
				this.anInt656 = (int) (local67 * local61 * 512.0D);
			}
			if (this.anInt656 < 1) {
				this.anInt656 = 1;
			}
			this.anInt655 = (int) (local59 * (double) this.anInt656);
			@Pc(242) int local242 = this.anInt652 + (int) (Math.random() * 16.0D) - 8;
			if (local242 < 0) {
				local242 = 0;
			} else if (local242 > 255) {
				local242 = 255;
			}
			@Pc(263) int local263 = this.anInt653 + (int) (Math.random() * 48.0D) - 24;
			if (local263 < 0) {
				local263 = 0;
			} else if (local263 > 255) {
				local263 = 255;
			}
			@Pc(284) int local284 = this.anInt654 + (int) (Math.random() * 48.0D) - 24;
			if (local284 < 0) {
				local284 = 0;
			} else if (local284 > 255) {
				local284 = 255;
			}
			this.anInt657 = this.method460(local242, local263, local284);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("24399, " + arg0 + ", " + 0 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXDNVMNH", name = "a", descriptor = "(III)I")
	private int method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
