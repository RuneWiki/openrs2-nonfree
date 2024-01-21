import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GQFZPMGS")
public final class Class12 {

	@OriginalMember(owner = "client!GQFZPMGS", name = "c", descriptor = "I")
	private static int anInt214;

	@OriginalMember(owner = "client!GQFZPMGS", name = "d", descriptor = "[Lclient!GQFZPMGS;")
	public static Class12[] aClass12Array1;

	@OriginalMember(owner = "client!GQFZPMGS", name = "a", descriptor = "I")
	private static int anInt213 = 8;

	@OriginalMember(owner = "client!GQFZPMGS", name = "e", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!GQFZPMGS", name = "f", descriptor = "I")
	public int anInt215;

	@OriginalMember(owner = "client!GQFZPMGS", name = "j", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!GQFZPMGS", name = "k", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!GQFZPMGS", name = "l", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!GQFZPMGS", name = "m", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!GQFZPMGS", name = "n", descriptor = "I")
	public int anInt221;

	@OriginalMember(owner = "client!GQFZPMGS", name = "o", descriptor = "I")
	public int anInt222;

	@OriginalMember(owner = "client!GQFZPMGS", name = "b", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!GQFZPMGS", name = "g", descriptor = "I")
	public int anInt216 = -1;

	@OriginalMember(owner = "client!GQFZPMGS", name = "h", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!GQFZPMGS", name = "i", descriptor = "Z")
	public boolean aBoolean63 = true;

	@OriginalMember(owner = "client!GQFZPMGS", name = "a", descriptor = "(Lclient!BYZSQZUF;Z)V")
	public static void method117(@OriginalArg(0) Class5 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub3 local8 = new Class3_Sub1_Sub3(0, arg0.method66("flo.dat", null));
			anInt214 = local8.method148();
			if (aClass12Array1 == null) {
				aClass12Array1 = new Class12[anInt214];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt214; local21++) {
				if (aClass12Array1[local21] == null) {
					aClass12Array1[local21] = new Class12();
				}
				aClass12Array1[local21].method118(anInt213, local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("33008, " + arg0 + ", " + false + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQFZPMGS", name = "<init>", descriptor = "()V")
	private Class12() {
	}

	@OriginalMember(owner = "client!GQFZPMGS", name = "a", descriptor = "(ILclient!IMUIZRAF;)V")
	private void method118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3 arg1) {
		try {
			if (arg0 < 8 || arg0 > 8) {
				this.aBoolean61 = !this.aBoolean61;
			}
			while (true) {
				@Pc(18) int local18 = arg1.method146();
				if (local18 == 0) {
					return;
				}
				if (local18 == 1) {
					this.anInt215 = arg1.method150();
					this.method119(this.anInt215);
				} else if (local18 == 2) {
					this.anInt216 = arg1.method146();
				} else if (local18 == 3) {
					this.aBoolean62 = true;
				} else if (local18 == 5) {
					this.aBoolean63 = false;
				} else if (local18 == 6) {
					this.aString3 = arg1.method153();
				} else if (local18 == 7) {
					@Pc(75) int local75 = this.anInt217;
					@Pc(78) int local78 = this.anInt218;
					@Pc(81) int local81 = this.anInt219;
					@Pc(84) int local84 = this.anInt220;
					@Pc(87) int local87 = arg1.method150();
					this.method119(local87);
					this.anInt217 = local75;
					this.anInt218 = local78;
					this.anInt219 = local81;
					this.anInt220 = local84;
					this.anInt221 = local84;
				} else {
					System.out.println("Error unrecognised config code: " + local18);
				}
			}
		} catch (@Pc(119) RuntimeException local119) {
			signlink.reporterror("46032, " + arg0 + ", " + arg1 + ", " + local119.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQFZPMGS", name = "a", descriptor = "(II)V")
	private void method119(@OriginalArg(0) int arg0) {
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
			this.anInt217 = (int) (local56 * 256.0D);
			this.anInt218 = (int) (local58 * 256.0D);
			this.anInt219 = (int) (local64 * 256.0D);
			if (this.anInt218 < 0) {
				this.anInt218 = 0;
			} else if (this.anInt218 > 255) {
				this.anInt218 = 255;
			}
			if (this.anInt219 < 0) {
				this.anInt219 = 0;
			} else if (this.anInt219 > 255) {
				this.anInt219 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt221 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt221 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt221 < 1) {
				this.anInt221 = 1;
			}
			this.anInt220 = (int) (local56 * (double) this.anInt221);
			@Pc(253) int local253 = this.anInt217 + (int) (Math.random() * 16.0D) - 8;
			if (local253 < 0) {
				local253 = 0;
			} else if (local253 > 255) {
				local253 = 255;
			}
			@Pc(274) int local274 = this.anInt218 + (int) (Math.random() * 48.0D) - 24;
			if (local274 < 0) {
				local274 = 0;
			} else if (local274 > 255) {
				local274 = 255;
			}
			@Pc(295) int local295 = this.anInt219 + (int) (Math.random() * 48.0D) - 24;
			if (local295 < 0) {
				local295 = 0;
			} else if (local295 > 255) {
				local295 = 255;
			}
			this.anInt222 = this.method120(local253, local274, local295);
		} catch (@Pc(315) RuntimeException local315) {
			signlink.reporterror("26624, " + arg0 + ", " + 4 + ", " + local315.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQFZPMGS", name = "a", descriptor = "(III)I")
	private int method120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
