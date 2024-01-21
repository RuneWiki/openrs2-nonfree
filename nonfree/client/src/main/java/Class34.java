import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QXFWPOFL")
public final class Class34 {

	@OriginalMember(owner = "client!QXFWPOFL", name = "b", descriptor = "I")
	private static int anInt560;

	@OriginalMember(owner = "client!QXFWPOFL", name = "c", descriptor = "[Lclient!QXFWPOFL;")
	public static Class34[] aClass34Array1;

	@OriginalMember(owner = "client!QXFWPOFL", name = "a", descriptor = "Z")
	private static boolean aBoolean143 = true;

	@OriginalMember(owner = "client!QXFWPOFL", name = "d", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!QXFWPOFL", name = "e", descriptor = "I")
	public int anInt561;

	@OriginalMember(owner = "client!QXFWPOFL", name = "i", descriptor = "I")
	public int anInt563;

	@OriginalMember(owner = "client!QXFWPOFL", name = "j", descriptor = "I")
	public int anInt564;

	@OriginalMember(owner = "client!QXFWPOFL", name = "k", descriptor = "I")
	public int anInt565;

	@OriginalMember(owner = "client!QXFWPOFL", name = "l", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!QXFWPOFL", name = "m", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!QXFWPOFL", name = "n", descriptor = "I")
	public int anInt568;

	@OriginalMember(owner = "client!QXFWPOFL", name = "f", descriptor = "I")
	public int anInt562 = -1;

	@OriginalMember(owner = "client!QXFWPOFL", name = "g", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!QXFWPOFL", name = "h", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!QXFWPOFL", name = "a", descriptor = "(ILclient!TXPLZUUI;)V")
	public static void method380(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg1.method464("flo.dat", null), 0);
			anInt560 = local8.method242();
			if (aClass34Array1 == null) {
				aClass34Array1 = new Class34[anInt560];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt560; local18++) {
				if (aClass34Array1[local18] == null) {
					aClass34Array1[local18] = new Class34();
				}
				aClass34Array1[local18].method381(local8, aBoolean143);
			}
			if (arg0 == 3) {
				;
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("40039, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QXFWPOFL", name = "<init>", descriptor = "()V")
	private Class34() {
	}

	@OriginalMember(owner = "client!QXFWPOFL", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	private void method381(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (!arg1) {
				throw new NullPointerException();
			}
			while (true) {
				@Pc(10) int local10 = arg0.method240();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt561 = arg0.method244();
					this.method382(this.anInt561, (byte) 8);
				} else if (local10 == 2) {
					this.anInt562 = arg0.method240();
				} else if (local10 == 3) {
					this.aBoolean144 = true;
				} else if (local10 == 5) {
					this.aBoolean145 = false;
				} else if (local10 == 6) {
					this.aString9 = arg0.method247();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt563;
					@Pc(70) int local70 = this.anInt564;
					@Pc(73) int local73 = this.anInt565;
					@Pc(76) int local76 = this.anInt566;
					@Pc(79) int local79 = arg0.method244();
					this.method382(local79, (byte) 8);
					this.anInt563 = local67;
					this.anInt564 = local70;
					this.anInt565 = local73;
					this.anInt566 = local76;
					this.anInt567 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("78373, " + arg0 + ", " + arg1 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QXFWPOFL", name = "a", descriptor = "(IB)V")
	private void method382(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) double local18 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(27) double local27 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(34) double local34 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(36) double local36 = local18;
			if (local27 < local18) {
				local36 = local27;
			}
			if (local34 < local36) {
				local36 = local34;
			}
			@Pc(50) double local50 = local18;
			if (local27 > local18) {
				local50 = local27;
			}
			if (local34 > local50) {
				local50 = local34;
			}
			@Pc(64) double local64 = 0.0D;
			@Pc(66) double local66 = 0.0D;
			@Pc(72) double local72 = (local36 + local50) / 2.0D;
			if (local36 != local50) {
				if (local72 < 0.5D) {
					local66 = (local50 - local36) / (local50 + local36);
				}
				if (local72 >= 0.5D) {
					local66 = (local50 - local36) / (2.0D - local50 - local36);
				}
				if (local18 == local50) {
					local64 = (local27 - local34) / (local50 - local36);
				} else if (local27 == local50) {
					local64 = (local34 - local18) / (local50 - local36) + 2.0D;
				} else if (local34 == local50) {
					local64 = (local18 - local27) / (local50 - local36) + 4.0D;
				}
			}
			local64 /= 6.0D;
			this.anInt563 = (int) (local64 * 256.0D);
			this.anInt564 = (int) (local66 * 256.0D);
			this.anInt565 = (int) (local72 * 256.0D);
			if (this.anInt564 < 0) {
				this.anInt564 = 0;
			} else if (this.anInt564 > 255) {
				this.anInt564 = 255;
			}
			if (this.anInt565 < 0) {
				this.anInt565 = 0;
			} else if (this.anInt565 > 255) {
				this.anInt565 = 255;
			}
			if (local72 > 0.5D) {
				this.anInt567 = (int) ((1.0D - local72) * local66 * 512.0D);
			} else {
				this.anInt567 = (int) (local72 * local66 * 512.0D);
			}
			if (this.anInt567 < 1) {
				this.anInt567 = 1;
			}
			this.anInt566 = (int) (local64 * (double) this.anInt567);
			@Pc(247) int local247 = this.anInt563 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt564 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt565 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt568 = this.method383(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("35593, " + arg0 + ", " + arg1 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QXFWPOFL", name = "a", descriptor = "(III)I")
	private int method383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
