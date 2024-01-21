import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QFWUSXIS")
public final class Class32 {

	@OriginalMember(owner = "client!QFWUSXIS", name = "b", descriptor = "I")
	private static int anInt446;

	@OriginalMember(owner = "client!QFWUSXIS", name = "c", descriptor = "[Lclient!QFWUSXIS;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!QFWUSXIS", name = "d", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!QFWUSXIS", name = "e", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!QFWUSXIS", name = "i", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!QFWUSXIS", name = "j", descriptor = "I")
	public int anInt450;

	@OriginalMember(owner = "client!QFWUSXIS", name = "k", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!QFWUSXIS", name = "l", descriptor = "I")
	public int anInt452;

	@OriginalMember(owner = "client!QFWUSXIS", name = "m", descriptor = "I")
	public int anInt453;

	@OriginalMember(owner = "client!QFWUSXIS", name = "n", descriptor = "I")
	public int anInt454;

	@OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "I")
	private int anInt445 = -16070;

	@OriginalMember(owner = "client!QFWUSXIS", name = "f", descriptor = "I")
	public int anInt448 = -1;

	@OriginalMember(owner = "client!QFWUSXIS", name = "g", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!QFWUSXIS", name = "h", descriptor = "Z")
	public boolean aBoolean142 = true;

	@OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(Lclient!RSPRYUFS;I)V")
	public static void method343(@OriginalArg(0) Class37 arg0) {
		try {
			@Pc(10) Class6_Sub2_Sub3 local10 = new Class6_Sub2_Sub3(-587, arg0.method358("flo.dat", null));
			anInt446 = local10.method264();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt446];
			}
			for (@Pc(29) int local29 = 0; local29 < anInt446; local29++) {
				if (aClass32Array1[local29] == null) {
					aClass32Array1[local29] = new Class32();
				}
				aClass32Array1[local29].method344(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("55456, " + arg0 + ", " + -332 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QFWUSXIS", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	private void method344(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method262();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt447 = arg0.method266();
					this.method345(this.anInt447);
				} else if (local11 == 2) {
					this.anInt448 = arg0.method262();
				} else if (local11 == 3) {
					this.aBoolean141 = true;
				} else if (local11 == 5) {
					this.aBoolean142 = false;
				} else if (local11 == 6) {
					this.aString8 = arg0.method269();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt449;
					@Pc(71) int local71 = this.anInt450;
					@Pc(74) int local74 = this.anInt451;
					@Pc(77) int local77 = this.anInt452;
					@Pc(80) int local80 = arg0.method266();
					this.method345(local80);
					this.anInt449 = local68;
					this.anInt450 = local71;
					this.anInt451 = local74;
					this.anInt452 = local77;
					this.anInt453 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("18201, " + 6 + ", " + arg0 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(IZ)V")
	private void method345(@OriginalArg(0) int arg0) {
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
			this.anInt449 = (int) (local61 * 256.0D);
			this.anInt450 = (int) (local63 * 256.0D);
			this.anInt451 = (int) (local69 * 256.0D);
			if (this.anInt450 < 0) {
				this.anInt450 = 0;
			} else if (this.anInt450 > 255) {
				this.anInt450 = 255;
			}
			if (this.anInt451 < 0) {
				this.anInt451 = 0;
			} else if (this.anInt451 > 255) {
				this.anInt451 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt453 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt453 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt453 < 1) {
				this.anInt453 = 1;
			}
			this.anInt452 = (int) (local61 * (double) this.anInt453);
			@Pc(244) int local244 = this.anInt449 + (int) (Math.random() * 16.0D) - 8;
			if (local244 < 0) {
				local244 = 0;
			} else if (local244 > 255) {
				local244 = 255;
			}
			@Pc(265) int local265 = this.anInt450 + (int) (Math.random() * 48.0D) - 24;
			if (local265 < 0) {
				local265 = 0;
			} else if (local265 > 255) {
				local265 = 255;
			}
			@Pc(291) int local291 = this.anInt451 + (int) (Math.random() * 48.0D) - 24;
			if (local291 < 0) {
				local291 = 0;
			} else if (local291 > 255) {
				local291 = 255;
			}
			this.anInt454 = this.method346(local244, local265, local291);
		} catch (@Pc(311) RuntimeException local311) {
			signlink.reporterror("36750, " + arg0 + ", " + false + ", " + local311.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QFWUSXIS", name = "a", descriptor = "(III)I")
	private int method346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
