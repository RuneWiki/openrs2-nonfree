import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UMMMVDGS")
public final class Class39 {

	@OriginalMember(owner = "client!UMMMVDGS", name = "b", descriptor = "I")
	private static int anInt613;

	@OriginalMember(owner = "client!UMMMVDGS", name = "c", descriptor = "[Lclient!UMMMVDGS;")
	public static Class39[] aClass39Array1;

	@OriginalMember(owner = "client!UMMMVDGS", name = "d", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!UMMMVDGS", name = "e", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!UMMMVDGS", name = "i", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!UMMMVDGS", name = "j", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!UMMMVDGS", name = "k", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!UMMMVDGS", name = "l", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!UMMMVDGS", name = "m", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!UMMMVDGS", name = "n", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!UMMMVDGS", name = "f", descriptor = "I")
	public int anInt615 = -1;

	@OriginalMember(owner = "client!UMMMVDGS", name = "g", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!UMMMVDGS", name = "h", descriptor = "Z")
	public boolean aBoolean155 = true;

	static {
		aBoolean153 = true;
	}

	@OriginalMember(owner = "client!UMMMVDGS", name = "a", descriptor = "(ILclient!INOFEYKQ;)V")
	public static void method441(@OriginalArg(1) Class14 arg0) {
		try {
			@Pc(20) Class3_Sub1_Sub3 local20 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("flo.dat", (byte[]) null));
			anInt613 = local20.method276();
			if (aClass39Array1 == null) {
				aClass39Array1 = new Class39[anInt613];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt613; local30++) {
				if (aClass39Array1[local30] == null) {
					aClass39Array1[local30] = new Class39();
				}
				aClass39Array1[local30].method442(local20);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("27267, " + -351 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMMMVDGS", name = "<init>", descriptor = "()V")
	private Class39() {
	}

	@OriginalMember(owner = "client!UMMMVDGS", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	private void method442(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method274();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt614 = arg0.method278();
					this.method443(this.anInt614);
				} else if (local10 == 2) {
					this.anInt615 = arg0.method274();
				} else if (local10 == 3) {
					this.aBoolean154 = true;
				} else if (local10 == 5) {
					this.aBoolean155 = false;
				} else if (local10 == 6) {
					this.aString14 = arg0.method281();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt616;
					@Pc(70) int local70 = this.anInt617;
					@Pc(73) int local73 = this.anInt618;
					@Pc(76) int local76 = this.anInt619;
					@Pc(79) int local79 = arg0.method278();
					this.method443(local79);
					this.anInt616 = local67;
					this.anInt617 = local70;
					this.anInt618 = local73;
					this.anInt619 = local76;
					this.anInt620 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("4312, " + false + ", " + arg0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMMMVDGS", name = "a", descriptor = "(ZI)V")
	private void method443(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(31) double local31 = local10;
			if (local19 < local10) {
				local31 = local19;
			}
			if (local26 < local31) {
				local31 = local26;
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
			@Pc(67) double local67 = (local31 + local45) / 2.0D;
			if (local31 != local45) {
				if (local67 < 0.5D) {
					local61 = (local45 - local31) / (local45 + local31);
				}
				if (local67 >= 0.5D) {
					local61 = (local45 - local31) / (2.0D - local45 - local31);
				}
				if (local10 == local45) {
					local59 = (local19 - local26) / (local45 - local31);
				} else if (local19 == local45) {
					local59 = (local26 - local10) / (local45 - local31) + 2.0D;
				} else if (local26 == local45) {
					local59 = (local10 - local19) / (local45 - local31) + 4.0D;
				}
			}
			local59 /= 6.0D;
			this.anInt616 = (int) (local59 * 256.0D);
			this.anInt617 = (int) (local61 * 256.0D);
			this.anInt618 = (int) (local67 * 256.0D);
			if (this.anInt617 < 0) {
				this.anInt617 = 0;
			} else if (this.anInt617 > 255) {
				this.anInt617 = 255;
			}
			if (this.anInt618 < 0) {
				this.anInt618 = 0;
			} else if (this.anInt618 > 255) {
				this.anInt618 = 255;
			}
			if (local67 > 0.5D) {
				this.anInt620 = (int) ((1.0D - local67) * local61 * 512.0D);
			} else {
				this.anInt620 = (int) (local67 * local61 * 512.0D);
			}
			if (this.anInt620 < 1) {
				this.anInt620 = 1;
			}
			this.anInt619 = (int) (local59 * (double) this.anInt620);
			@Pc(242) int local242 = this.anInt616 + (int) (Math.random() * 16.0D) - 8;
			if (local242 < 0) {
				local242 = 0;
			} else if (local242 > 255) {
				local242 = 255;
			}
			@Pc(263) int local263 = this.anInt617 + (int) (Math.random() * 48.0D) - 24;
			if (local263 < 0) {
				local263 = 0;
			} else if (local263 > 255) {
				local263 = 255;
			}
			@Pc(284) int local284 = this.anInt618 + (int) (Math.random() * 48.0D) - 24;
			if (local284 < 0) {
				local284 = 0;
			} else if (local284 > 255) {
				local284 = 255;
			}
			this.anInt621 = this.method444(local242, local263, local284);
		} catch (@Pc(304) RuntimeException local304) {
			signlink.reporterror("1504, " + true + ", " + arg0 + ", " + local304.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UMMMVDGS", name = "a", descriptor = "(III)I")
	private int method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
