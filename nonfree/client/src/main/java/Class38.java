import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UFJMYAXC")
public final class Class38 {

	@OriginalMember(owner = "client!UFJMYAXC", name = "c", descriptor = "I")
	private static int anInt608;

	@OriginalMember(owner = "client!UFJMYAXC", name = "d", descriptor = "[Lclient!UFJMYAXC;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!UFJMYAXC", name = "a", descriptor = "I")
	private static int anInt607 = 974;

	@OriginalMember(owner = "client!UFJMYAXC", name = "b", descriptor = "Z")
	private static boolean aBoolean161 = true;

	@OriginalMember(owner = "client!UFJMYAXC", name = "e", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!UFJMYAXC", name = "f", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!UFJMYAXC", name = "j", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!UFJMYAXC", name = "k", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!UFJMYAXC", name = "l", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!UFJMYAXC", name = "m", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!UFJMYAXC", name = "n", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!UFJMYAXC", name = "o", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!UFJMYAXC", name = "g", descriptor = "I")
	public int anInt610 = -1;

	@OriginalMember(owner = "client!UFJMYAXC", name = "h", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!UFJMYAXC", name = "i", descriptor = "Z")
	public boolean aBoolean163 = true;

	@OriginalMember(owner = "client!UFJMYAXC", name = "a", descriptor = "(ILclient!QDHHNYHL;)V")
	public static void method474(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub4 local8 = new Class4_Sub1_Sub4(5, arg0.method426("flo.dat", null));
			anInt608 = local8.method357();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt608];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt608; local26++) {
				if (aClass38Array1[local26] == null) {
					aClass38Array1[local26] = new Class38();
				}
				aClass38Array1[local26].method475(local8, anInt607);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("74737, " + 0 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFJMYAXC", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!UFJMYAXC", name = "a", descriptor = "(Lclient!PGNBHFUF;I)V")
	private void method475(@OriginalArg(0) Class4_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			while (true) {
				@Pc(10) int local10 = arg0.method355();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt609 = arg0.method359();
					this.method476(this.anInt609);
				} else if (local10 == 2) {
					this.anInt610 = arg0.method355();
				} else if (local10 == 3) {
					this.aBoolean162 = true;
				} else if (local10 == 5) {
					this.aBoolean163 = false;
				} else if (local10 == 6) {
					this.aString12 = arg0.method362();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt611;
					@Pc(70) int local70 = this.anInt612;
					@Pc(73) int local73 = this.anInt613;
					@Pc(76) int local76 = this.anInt614;
					@Pc(79) int local79 = arg0.method359();
					this.method476(local79);
					this.anInt611 = local67;
					this.anInt612 = local70;
					this.anInt613 = local73;
					this.anInt614 = local76;
					this.anInt615 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("29290, " + arg0 + ", " + arg1 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFJMYAXC", name = "a", descriptor = "(II)V")
	private void method476(@OriginalArg(0) int arg0) {
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
			@Pc(61) double local61 = 0.0D;
			@Pc(63) double local63 = 0.0D;
			@Pc(69) double local69 = (local33 + local47) / 2.0D;
			if (local33 != local47) {
				if (local69 < 0.5D) {
					local63 = (local47 - local33) / (local47 + local33);
				}
				if (local69 >= 0.5D) {
					local63 = (local47 - local33) / (2.0D - local47 - local33);
				}
				if (local15 == local47) {
					local61 = (local24 - local31) / (local47 - local33);
				} else if (local24 == local47) {
					local61 = (local31 - local15) / (local47 - local33) + 2.0D;
				} else if (local31 == local47) {
					local61 = (local15 - local24) / (local47 - local33) + 4.0D;
				}
			}
			local61 /= 6.0D;
			this.anInt611 = (int) (local61 * 256.0D);
			this.anInt612 = (int) (local63 * 256.0D);
			this.anInt613 = (int) (local69 * 256.0D);
			if (this.anInt612 < 0) {
				this.anInt612 = 0;
			} else if (this.anInt612 > 255) {
				this.anInt612 = 255;
			}
			if (this.anInt613 < 0) {
				this.anInt613 = 0;
			} else if (this.anInt613 > 255) {
				this.anInt613 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt615 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt615 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt615 < 1) {
				this.anInt615 = 1;
			}
			this.anInt614 = (int) (local61 * (double) this.anInt615);
			@Pc(247) int local247 = this.anInt611 + (int) (Math.random() * 16.0D) - 8;
			if (local247 < 0) {
				local247 = 0;
			} else if (local247 > 255) {
				local247 = 255;
			}
			@Pc(268) int local268 = this.anInt612 + (int) (Math.random() * 48.0D) - 24;
			if (local268 < 0) {
				local268 = 0;
			} else if (local268 > 255) {
				local268 = 255;
			}
			@Pc(289) int local289 = this.anInt613 + (int) (Math.random() * 48.0D) - 24;
			if (local289 < 0) {
				local289 = 0;
			} else if (local289 > 255) {
				local289 = 255;
			}
			this.anInt616 = this.method477(local247, local268, local289);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("12197, " + arg0 + ", " + 0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UFJMYAXC", name = "a", descriptor = "(III)I")
	private int method477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
