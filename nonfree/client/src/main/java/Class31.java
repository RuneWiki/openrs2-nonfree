import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QDVRTZST")
public final class Class31 {

	@OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "I")
	private static int anInt629;

	@OriginalMember(owner = "client!QDVRTZST", name = "b", descriptor = "[Lclient!QDVRTZST;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!QDVRTZST", name = "c", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!QDVRTZST", name = "d", descriptor = "I")
	public int anInt630;

	@OriginalMember(owner = "client!QDVRTZST", name = "h", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!QDVRTZST", name = "i", descriptor = "I")
	public int anInt633;

	@OriginalMember(owner = "client!QDVRTZST", name = "j", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!QDVRTZST", name = "k", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!QDVRTZST", name = "l", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!QDVRTZST", name = "m", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!QDVRTZST", name = "e", descriptor = "I")
	public int anInt631 = -1;

	@OriginalMember(owner = "client!QDVRTZST", name = "f", descriptor = "Z")
	private boolean aBoolean130 = false;

	@OriginalMember(owner = "client!QDVRTZST", name = "g", descriptor = "Z")
	public boolean aBoolean131 = true;

	@OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(BLclient!IEMHZJLX;)V")
	public static void method427(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(0, arg0.method181("flo.dat", null));
			anInt629 = local8.method296();
			if (aClass31Array1 == null) {
				aClass31Array1 = new Class31[anInt629];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt629; local18++) {
				if (aClass31Array1[local18] == null) {
					aClass31Array1[local18] = new Class31();
				}
				aClass31Array1[local18].method428(local8);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("23724, " + 8 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QDVRTZST", name = "<init>", descriptor = "()V")
	private Class31() {
	}

	@OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	private void method428(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method294();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt630 = arg0.method298();
					this.method429(this.anInt630);
				} else if (local13 == 2) {
					this.anInt631 = arg0.method294();
				} else if (local13 == 3) {
					this.aBoolean130 = true;
				} else if (local13 == 5) {
					this.aBoolean131 = false;
				} else if (local13 == 6) {
					this.aString13 = arg0.method301();
				} else if (local13 == 7) {
					@Pc(70) int local70 = this.anInt632;
					@Pc(73) int local73 = this.anInt633;
					@Pc(76) int local76 = this.anInt634;
					@Pc(79) int local79 = this.anInt635;
					@Pc(82) int local82 = arg0.method298();
					this.method429(local82);
					this.anInt632 = local70;
					this.anInt633 = local73;
					this.anInt634 = local76;
					this.anInt635 = local79;
					this.anInt636 = local79;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("53652, " + 403 + ", " + arg0 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(IZ)V")
	private void method429(@OriginalArg(0) int arg0) {
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
			this.anInt632 = (int) (local61 * 256.0D);
			this.anInt633 = (int) (local63 * 256.0D);
			this.anInt634 = (int) (local69 * 256.0D);
			if (this.anInt633 < 0) {
				this.anInt633 = 0;
			} else if (this.anInt633 > 255) {
				this.anInt633 = 255;
			}
			if (this.anInt634 < 0) {
				this.anInt634 = 0;
			} else if (this.anInt634 > 255) {
				this.anInt634 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt636 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt636 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt636 < 1) {
				this.anInt636 = 1;
			}
			this.anInt635 = (int) (local61 * (double) this.anInt636);
			@Pc(244) int local244 = this.anInt632 + (int) (Math.random() * 16.0D) - 8;
			if (local244 < 0) {
				local244 = 0;
			} else if (local244 > 255) {
				local244 = 255;
			}
			@Pc(265) int local265 = this.anInt633 + (int) (Math.random() * 48.0D) - 24;
			if (local265 < 0) {
				local265 = 0;
			} else if (local265 > 255) {
				local265 = 255;
			}
			@Pc(286) int local286 = this.anInt634 + (int) (Math.random() * 48.0D) - 24;
			if (local286 < 0) {
				local286 = 0;
			} else if (local286 > 255) {
				local286 = 255;
			}
			this.anInt637 = this.method430(local244, local265, local286);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("38671, " + arg0 + ", " + true + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QDVRTZST", name = "a", descriptor = "(III)I")
	private int method430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
