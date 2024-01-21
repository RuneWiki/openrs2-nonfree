import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NEDSEYSI")
public final class Class28 {

	@OriginalMember(owner = "client!NEDSEYSI", name = "c", descriptor = "I")
	private static int anInt459;

	@OriginalMember(owner = "client!NEDSEYSI", name = "d", descriptor = "[Lclient!NEDSEYSI;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!NEDSEYSI", name = "b", descriptor = "I")
	private static int anInt458 = 4;

	@OriginalMember(owner = "client!NEDSEYSI", name = "e", descriptor = "Ljava/lang/String;")
	private String aString7;

	@OriginalMember(owner = "client!NEDSEYSI", name = "f", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!NEDSEYSI", name = "j", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!NEDSEYSI", name = "k", descriptor = "I")
	public int anInt463;

	@OriginalMember(owner = "client!NEDSEYSI", name = "l", descriptor = "I")
	public int anInt464;

	@OriginalMember(owner = "client!NEDSEYSI", name = "m", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!NEDSEYSI", name = "n", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!NEDSEYSI", name = "o", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!NEDSEYSI", name = "a", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!NEDSEYSI", name = "g", descriptor = "I")
	public int anInt461 = -1;

	@OriginalMember(owner = "client!NEDSEYSI", name = "h", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!NEDSEYSI", name = "i", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!NEDSEYSI", name = "a", descriptor = "(ILclient!HRXSNEYZ;)V")
	public static void method315(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg0.method220("flo.dat", null), 8);
			anInt459 = local12.method240();
			if (aClass28Array1 == null) {
				aClass28Array1 = new Class28[anInt459];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt459; local22++) {
				if (aClass28Array1[local22] == null) {
					aClass28Array1[local22] = new Class28();
				}
				aClass28Array1[local22].method316(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("93991, " + 309 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEDSEYSI", name = "<init>", descriptor = "()V")
	private Class28() {
	}

	@OriginalMember(owner = "client!NEDSEYSI", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	private void method316(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method238();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt460 = arg0.method242();
					this.method317(this.anInt460);
				} else if (local10 == 2) {
					this.anInt461 = arg0.method238();
				} else if (local10 == 3) {
					this.aBoolean98 = true;
				} else if (local10 == 5) {
					this.aBoolean99 = false;
				} else if (local10 == 6) {
					this.aString7 = arg0.method245();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt462;
					@Pc(70) int local70 = this.anInt463;
					@Pc(73) int local73 = this.anInt464;
					@Pc(76) int local76 = this.anInt465;
					@Pc(79) int local79 = arg0.method242();
					this.method317(local79);
					this.anInt462 = local67;
					this.anInt463 = local70;
					this.anInt464 = local73;
					this.anInt465 = local76;
					this.anInt466 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("98387, " + arg0 + ", " + 0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEDSEYSI", name = "a", descriptor = "(II)V")
	private void method317(@OriginalArg(0) int arg0) {
		try {
			@Pc(21) double local21 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(30) double local30 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(37) double local37 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(39) double local39 = local21;
			if (local30 < local21) {
				local39 = local30;
			}
			if (local37 < local39) {
				local39 = local37;
			}
			@Pc(53) double local53 = local21;
			if (local30 > local21) {
				local53 = local30;
			}
			if (local37 > local53) {
				local53 = local37;
			}
			@Pc(67) double local67 = 0.0D;
			@Pc(69) double local69 = 0.0D;
			@Pc(75) double local75 = (local39 + local53) / 2.0D;
			if (local39 != local53) {
				if (local75 < 0.5D) {
					local69 = (local53 - local39) / (local53 + local39);
				}
				if (local75 >= 0.5D) {
					local69 = (local53 - local39) / (2.0D - local53 - local39);
				}
				if (local21 == local53) {
					local67 = (local30 - local37) / (local53 - local39);
				} else if (local30 == local53) {
					local67 = (local37 - local21) / (local53 - local39) + 2.0D;
				} else if (local37 == local53) {
					local67 = (local21 - local30) / (local53 - local39) + 4.0D;
				}
			}
			local67 /= 6.0D;
			this.anInt462 = (int) (local67 * 256.0D);
			this.anInt463 = (int) (local69 * 256.0D);
			this.anInt464 = (int) (local75 * 256.0D);
			if (this.anInt463 < 0) {
				this.anInt463 = 0;
			} else if (this.anInt463 > 255) {
				this.anInt463 = 255;
			}
			if (this.anInt464 < 0) {
				this.anInt464 = 0;
			} else if (this.anInt464 > 255) {
				this.anInt464 = 255;
			}
			if (local75 > 0.5D) {
				this.anInt466 = (int) ((1.0D - local75) * local69 * 512.0D);
			} else {
				this.anInt466 = (int) (local75 * local69 * 512.0D);
			}
			if (this.anInt466 < 1) {
				this.anInt466 = 1;
			}
			this.anInt465 = (int) (local67 * (double) this.anInt466);
			@Pc(250) int local250 = this.anInt462 + (int) (Math.random() * 16.0D) - 8;
			if (local250 < 0) {
				local250 = 0;
			} else if (local250 > 255) {
				local250 = 255;
			}
			@Pc(271) int local271 = this.anInt463 + (int) (Math.random() * 48.0D) - 24;
			if (local271 < 0) {
				local271 = 0;
			} else if (local271 > 255) {
				local271 = 255;
			}
			@Pc(292) int local292 = this.anInt464 + (int) (Math.random() * 48.0D) - 24;
			if (local292 < 0) {
				local292 = 0;
			} else if (local292 > 255) {
				local292 = 255;
			}
			this.anInt467 = this.method318(local250, local271, local292);
		} catch (@Pc(312) RuntimeException local312) {
			signlink.reporterror("27998, " + arg0 + ", " + -38024 + ", " + local312.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NEDSEYSI", name = "a", descriptor = "(III)I")
	private int method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
