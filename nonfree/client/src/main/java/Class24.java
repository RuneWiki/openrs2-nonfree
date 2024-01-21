import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LDSGOGGM")
public final class Class24 {

	@OriginalMember(owner = "client!LDSGOGGM", name = "b", descriptor = "I")
	private static int anInt320;

	@OriginalMember(owner = "client!LDSGOGGM", name = "c", descriptor = "[Lclient!LDSGOGGM;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "I")
	private static int anInt319 = 34;

	@OriginalMember(owner = "client!LDSGOGGM", name = "d", descriptor = "Ljava/lang/String;")
	private String aString10;

	@OriginalMember(owner = "client!LDSGOGGM", name = "e", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!LDSGOGGM", name = "i", descriptor = "I")
	public int anInt323;

	@OriginalMember(owner = "client!LDSGOGGM", name = "j", descriptor = "I")
	public int anInt324;

	@OriginalMember(owner = "client!LDSGOGGM", name = "k", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!LDSGOGGM", name = "l", descriptor = "I")
	public int anInt326;

	@OriginalMember(owner = "client!LDSGOGGM", name = "m", descriptor = "I")
	public int anInt327;

	@OriginalMember(owner = "client!LDSGOGGM", name = "n", descriptor = "I")
	public int anInt328;

	@OriginalMember(owner = "client!LDSGOGGM", name = "f", descriptor = "I")
	public int anInt322 = -1;

	@OriginalMember(owner = "client!LDSGOGGM", name = "g", descriptor = "Z")
	private boolean aBoolean82 = false;

	@OriginalMember(owner = "client!LDSGOGGM", name = "h", descriptor = "Z")
	public boolean aBoolean83 = true;

	@OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(BLclient!XOJZVVDK;)V")
	public static void method157(@OriginalArg(1) Class43 arg0) {
		try {
			@Pc(8) Class6_Sub1_Sub4 local8 = new Class6_Sub1_Sub4(888, arg0.method518("flo.dat", (byte[]) null));
			anInt320 = local8.method241();
			if (aClass24Array1 == null) {
				aClass24Array1 = new Class24[anInt320];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt320; local18++) {
				if (aClass24Array1[local18] == null) {
					aClass24Array1[local18] = new Class24();
				}
				aClass24Array1[local18].method158(local8);
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("9564, " + -82 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDSGOGGM", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(Lclient!PQBRPYKE;Z)V")
	private void method158(@OriginalArg(0) Class6_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method239();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt321 = arg0.method243();
					this.method159(this.anInt321);
				} else if (local10 == 2) {
					this.anInt322 = arg0.method239();
				} else if (local10 == 3) {
					this.aBoolean82 = true;
				} else if (local10 == 5) {
					this.aBoolean83 = false;
				} else if (local10 == 6) {
					this.aString10 = arg0.method246();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt323;
					@Pc(70) int local70 = this.anInt324;
					@Pc(73) int local73 = this.anInt325;
					@Pc(76) int local76 = this.anInt326;
					@Pc(79) int local79 = arg0.method243();
					this.method159(local79);
					this.anInt323 = local67;
					this.anInt324 = local70;
					this.anInt325 = local73;
					this.anInt326 = local76;
					this.anInt327 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("22704, " + arg0 + ", " + false + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(BI)V")
	private void method159(@OriginalArg(1) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
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
					local64 = 2.0D + (local34 - local18) / (local50 - local36);
				} else if (local34 == local50) {
					local64 = 4.0D + (local18 - local27) / (local50 - local36);
				}
			}
			local64 /= 6.0D;
			this.anInt323 = (int) (local64 * 256.0D);
			this.anInt324 = (int) (local66 * 256.0D);
			this.anInt325 = (int) (local72 * 256.0D);
			if (this.anInt324 < 0) {
				this.anInt324 = 0;
			} else if (this.anInt324 > 255) {
				this.anInt324 = 255;
			}
			if (this.anInt325 < 0) {
				this.anInt325 = 0;
			} else if (this.anInt325 > 255) {
				this.anInt325 = 255;
			}
			if (local72 > 0.5D) {
				this.anInt327 = (int) ((1.0D - local72) * local66 * 512.0D);
			} else {
				this.anInt327 = (int) (local72 * local66 * 512.0D);
			}
			if (this.anInt327 < 1) {
				this.anInt327 = 1;
			}
			this.anInt326 = (int) (local64 * (double) this.anInt327);
			@Pc(247) int local247 = this.anInt323 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt324 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt325 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt328 = this.method160(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("53243, " + 0 + ", " + arg0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDSGOGGM", name = "a", descriptor = "(III)I")
	private int method160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
