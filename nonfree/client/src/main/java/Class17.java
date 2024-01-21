import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JZNGGVQB")
public final class Class17 {

	@OriginalMember(owner = "client!JZNGGVQB", name = "d", descriptor = "I")
	private static int anInt270;

	@OriginalMember(owner = "client!JZNGGVQB", name = "e", descriptor = "[Lclient!JZNGGVQB;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "Z")
	private static boolean aBoolean58 = true;

	@OriginalMember(owner = "client!JZNGGVQB", name = "c", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!JZNGGVQB", name = "f", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!JZNGGVQB", name = "g", descriptor = "I")
	public int anInt271;

	@OriginalMember(owner = "client!JZNGGVQB", name = "k", descriptor = "I")
	public int anInt273;

	@OriginalMember(owner = "client!JZNGGVQB", name = "l", descriptor = "I")
	public int anInt274;

	@OriginalMember(owner = "client!JZNGGVQB", name = "m", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!JZNGGVQB", name = "n", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!JZNGGVQB", name = "o", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!JZNGGVQB", name = "p", descriptor = "I")
	public int anInt278;

	@OriginalMember(owner = "client!JZNGGVQB", name = "b", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!JZNGGVQB", name = "h", descriptor = "I")
	public int anInt272 = -1;

	@OriginalMember(owner = "client!JZNGGVQB", name = "i", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!JZNGGVQB", name = "j", descriptor = "Z")
	public boolean aBoolean61 = true;

	@OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(BLclient!SXKKBWPU;)V")
	public static void method124(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method364("flo.dat", null), -631);
			anInt270 = local8.method408();
			if (aClass17Array1 == null) {
				aClass17Array1 = new Class17[anInt270];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt270; local18++) {
				if (aClass17Array1[local18] == null) {
					aClass17Array1[local18] = new Class17();
				}
				aClass17Array1[local18].method125(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("49069, " + -109 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZNGGVQB", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	private void method125(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method406();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt271 = arg0.method410();
					this.method126(this.anInt271);
				} else if (local13 == 2) {
					this.anInt272 = arg0.method406();
				} else if (local13 == 3) {
					this.aBoolean60 = true;
				} else if (local13 == 5) {
					this.aBoolean61 = false;
				} else if (local13 == 6) {
					this.aString7 = arg0.method413();
				} else if (local13 == 7) {
					@Pc(70) int local70 = this.anInt273;
					@Pc(73) int local73 = this.anInt274;
					@Pc(76) int local76 = this.anInt275;
					@Pc(79) int local79 = this.anInt276;
					@Pc(82) int local82 = arg0.method410();
					this.method126(local82);
					this.anInt273 = local70;
					this.anInt274 = local73;
					this.anInt275 = local76;
					this.anInt276 = local79;
					this.anInt277 = local79;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("18152, " + 3 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(II)V")
	private void method126(@OriginalArg(0) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(31) double local31 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(44) double local44 = local15;
			if (local24 < local15) {
				local44 = local24;
			}
			if (local31 < local44) {
				local44 = local31;
			}
			@Pc(58) double local58 = local15;
			if (local24 > local15) {
				local58 = local24;
			}
			if (local31 > local58) {
				local58 = local31;
			}
			@Pc(72) double local72 = 0.0D;
			@Pc(74) double local74 = 0.0D;
			@Pc(80) double local80 = (local44 + local58) / 2.0D;
			if (local44 != local58) {
				if (local80 < 0.5D) {
					local74 = (local58 - local44) / (local58 + local44);
				}
				if (local80 >= 0.5D) {
					local74 = (local58 - local44) / (2.0D - local58 - local44);
				}
				if (local15 == local58) {
					local72 = (local24 - local31) / (local58 - local44);
				} else if (local24 == local58) {
					local72 = (local31 - local15) / (local58 - local44) + 2.0D;
				} else if (local31 == local58) {
					local72 = (local15 - local24) / (local58 - local44) + 4.0D;
				}
			}
			local72 /= 6.0D;
			this.anInt273 = (int) (local72 * 256.0D);
			this.anInt274 = (int) (local74 * 256.0D);
			this.anInt275 = (int) (local80 * 256.0D);
			if (this.anInt274 < 0) {
				this.anInt274 = 0;
			} else if (this.anInt274 > 255) {
				this.anInt274 = 255;
			}
			if (this.anInt275 < 0) {
				this.anInt275 = 0;
			} else if (this.anInt275 > 255) {
				this.anInt275 = 255;
			}
			if (local80 > 0.5D) {
				this.anInt277 = (int) ((1.0D - local80) * local74 * 512.0D);
			} else {
				this.anInt277 = (int) (local80 * local74 * 512.0D);
			}
			if (this.anInt277 < 1) {
				this.anInt277 = 1;
			}
			this.anInt276 = (int) (local72 * (double) this.anInt277);
			@Pc(255) int local255 = this.anInt273 + (int) (Math.random() * 16.0D) - 8;
			if (local255 < 0) {
				local255 = 0;
			} else if (local255 > 255) {
				local255 = 255;
			}
			@Pc(276) int local276 = this.anInt274 + (int) (Math.random() * 48.0D) - 24;
			if (local276 < 0) {
				local276 = 0;
			} else if (local276 > 255) {
				local276 = 255;
			}
			@Pc(297) int local297 = this.anInt275 + (int) (Math.random() * 48.0D) - 24;
			if (local297 < 0) {
				local297 = 0;
			} else if (local297 > 255) {
				local297 = 255;
			}
			this.anInt278 = this.method127(local255, local276, local297);
		} catch (@Pc(317) RuntimeException local317) {
			signlink.reporterror("71158, " + arg0 + ", " + 30405 + ", " + local317.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZNGGVQB", name = "a", descriptor = "(III)I")
	private int method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
