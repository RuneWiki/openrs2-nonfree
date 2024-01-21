import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NPCMYHWE")
public final class Class28 {

	@OriginalMember(owner = "client!NPCMYHWE", name = "a", descriptor = "Z")
	private static boolean aBoolean108;

	@OriginalMember(owner = "client!NPCMYHWE", name = "c", descriptor = "I")
	private static int anInt403;

	@OriginalMember(owner = "client!NPCMYHWE", name = "d", descriptor = "[Lclient!NPCMYHWE;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!NPCMYHWE", name = "e", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!NPCMYHWE", name = "f", descriptor = "I")
	public int anInt404;

	@OriginalMember(owner = "client!NPCMYHWE", name = "j", descriptor = "I")
	public int anInt406;

	@OriginalMember(owner = "client!NPCMYHWE", name = "k", descriptor = "I")
	public int anInt407;

	@OriginalMember(owner = "client!NPCMYHWE", name = "l", descriptor = "I")
	public int anInt408;

	@OriginalMember(owner = "client!NPCMYHWE", name = "m", descriptor = "I")
	public int anInt409;

	@OriginalMember(owner = "client!NPCMYHWE", name = "n", descriptor = "I")
	public int anInt410;

	@OriginalMember(owner = "client!NPCMYHWE", name = "o", descriptor = "I")
	public int anInt411;

	@OriginalMember(owner = "client!NPCMYHWE", name = "b", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!NPCMYHWE", name = "g", descriptor = "I")
	public int anInt405 = -1;

	@OriginalMember(owner = "client!NPCMYHWE", name = "h", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!NPCMYHWE", name = "i", descriptor = "Z")
	public boolean aBoolean111 = true;

	@OriginalMember(owner = "client!NPCMYHWE", name = "a", descriptor = "(ZLclient!XRWUKRPO;)V")
	public static void method335(@OriginalArg(1) Class45 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method553("flo.dat", null), -49015);
			anInt403 = local8.method167();
			if (aClass28Array1 == null) {
				aClass28Array1 = new Class28[anInt403];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt403; local26++) {
				if (aClass28Array1[local26] == null) {
					aClass28Array1[local26] = new Class28();
				}
				aClass28Array1[local26].method336((byte) 8, local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("94638, " + false + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPCMYHWE", name = "<init>", descriptor = "()V")
	private Class28() {
	}

	@OriginalMember(owner = "client!NPCMYHWE", name = "a", descriptor = "(BLclient!GLMIQHJI;)V")
	private void method336(@OriginalArg(0) byte arg0, @OriginalArg(1) Class8_Sub1_Sub3 arg1) {
		try {
			@Pc(6) boolean local6 = false;
			while (true) {
				@Pc(15) int local15 = arg1.method165();
				if (local15 == 0) {
					return;
				}
				if (local15 == 1) {
					this.anInt404 = arg1.method169();
					this.method337(this.anInt404, this.aBoolean109);
				} else if (local15 == 2) {
					this.anInt405 = arg1.method165();
				} else if (local15 == 3) {
					this.aBoolean110 = true;
				} else if (local15 == 5) {
					this.aBoolean111 = false;
				} else if (local15 == 6) {
					this.aString5 = arg1.method172();
				} else if (local15 == 7) {
					@Pc(73) int local73 = this.anInt406;
					@Pc(76) int local76 = this.anInt407;
					@Pc(79) int local79 = this.anInt408;
					@Pc(82) int local82 = this.anInt409;
					@Pc(85) int local85 = arg1.method169();
					this.method337(local85, this.aBoolean109);
					this.anInt406 = local73;
					this.anInt407 = local76;
					this.anInt408 = local79;
					this.anInt409 = local82;
					this.anInt410 = local82;
				} else {
					System.out.println("Error unrecognised config code: " + local15);
				}
			}
		} catch (@Pc(118) RuntimeException local118) {
			signlink.reporterror("55390, " + arg0 + ", " + arg1 + ", " + local118.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPCMYHWE", name = "a", descriptor = "(IZ)V")
	private void method337(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			if (!arg1) {
				@Pc(22) double local22 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
				@Pc(29) double local29 = (double) (arg0 & 0xFF) / 256.0D;
				@Pc(31) double local31 = local10;
				if (local22 < local10) {
					local31 = local22;
				}
				if (local29 < local31) {
					local31 = local29;
				}
				@Pc(45) double local45 = local10;
				if (local22 > local10) {
					local45 = local22;
				}
				if (local29 > local45) {
					local45 = local29;
				}
				@Pc(59) double local59 = 0.0D;
				@Pc(61) double local61 = 0.0D;
				@Pc(67) double local67 = (local31 + local45) / 2.0D;
				if (local31 != local45) {
					if (local67 < 0.5D) {
						local61 = (local45 - local31) / (local45 + local31);
					}
					if (local67 >= 0.5D) {
						local61 = (local45 - local31) / (2.0D - local45 - local31);
					}
					if (local10 == local45) {
						local59 = (local22 - local29) / (local45 - local31);
					} else if (local22 == local45) {
						local59 = (local29 - local10) / (local45 - local31) + 2.0D;
					} else if (local29 == local45) {
						local59 = (local10 - local22) / (local45 - local31) + 4.0D;
					}
				}
				local59 /= 6.0D;
				this.anInt406 = (int) (local59 * 256.0D);
				this.anInt407 = (int) (local61 * 256.0D);
				this.anInt408 = (int) (local67 * 256.0D);
				if (this.anInt407 < 0) {
					this.anInt407 = 0;
				} else if (this.anInt407 > 255) {
					this.anInt407 = 255;
				}
				if (this.anInt408 < 0) {
					this.anInt408 = 0;
				} else if (this.anInt408 > 255) {
					this.anInt408 = 255;
				}
				if (local67 > 0.5D) {
					this.anInt410 = (int) ((1.0D - local67) * local61 * 512.0D);
				} else {
					this.anInt410 = (int) (local67 * local61 * 512.0D);
				}
				if (this.anInt410 < 1) {
					this.anInt410 = 1;
				}
				this.anInt409 = (int) (local59 * (double) this.anInt410);
				@Pc(242) int local242 = this.anInt406 + (int) (Math.random() * 16.0D) - 8;
				if (local242 < 0) {
					local242 = 0;
				} else if (local242 > 255) {
					local242 = 255;
				}
				@Pc(263) int local263 = this.anInt407 + (int) (Math.random() * 48.0D) - 24;
				if (local263 < 0) {
					local263 = 0;
				} else if (local263 > 255) {
					local263 = 255;
				}
				@Pc(284) int local284 = this.anInt408 + (int) (Math.random() * 48.0D) - 24;
				if (local284 < 0) {
					local284 = 0;
				} else if (local284 > 255) {
					local284 = 255;
				}
				this.anInt411 = this.method338(local242, local263, local284);
			}
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("37341, " + arg0 + ", " + arg1 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NPCMYHWE", name = "a", descriptor = "(III)I")
	private int method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
