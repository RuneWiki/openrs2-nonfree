import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TFMGYYZY")
public final class Class41 {

	@OriginalMember(owner = "client!TFMGYYZY", name = "b", descriptor = "I")
	private static int anInt574;

	@OriginalMember(owner = "client!TFMGYYZY", name = "c", descriptor = "[Lclient!TFMGYYZY;")
	public static Class41[] aClass41Array1;

	@OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "I")
	private static int anInt573 = -254;

	@OriginalMember(owner = "client!TFMGYYZY", name = "d", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!TFMGYYZY", name = "e", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!TFMGYYZY", name = "i", descriptor = "I")
	public int anInt577;

	@OriginalMember(owner = "client!TFMGYYZY", name = "j", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!TFMGYYZY", name = "k", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!TFMGYYZY", name = "l", descriptor = "I")
	public int anInt580;

	@OriginalMember(owner = "client!TFMGYYZY", name = "m", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!TFMGYYZY", name = "n", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!TFMGYYZY", name = "f", descriptor = "I")
	public int anInt576 = -1;

	@OriginalMember(owner = "client!TFMGYYZY", name = "g", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!TFMGYYZY", name = "h", descriptor = "Z")
	public boolean aBoolean167 = true;

	@OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(ZLclient!AKPFVPPG;)V")
	public static void method401(@OriginalArg(1) Class2 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub3 local8 = new Class4_Sub1_Sub3(arg0.method7("flo.dat", null), (byte) 3);
			anInt574 = local8.method104();
			if (aClass41Array1 == null) {
				aClass41Array1 = new Class41[anInt574];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt574; local22++) {
				if (aClass41Array1[local22] == null) {
					aClass41Array1[local22] = new Class41();
				}
				aClass41Array1[local22].method402(local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("80965, " + true + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFMGYYZY", name = "<init>", descriptor = "()V")
	private Class41() {
	}

	@OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	private void method402(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method102();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt575 = arg0.method106();
					this.method403(this.anInt575);
				} else if (local13 == 2) {
					this.anInt576 = arg0.method102();
				} else if (local13 == 3) {
					this.aBoolean166 = true;
				} else if (local13 == 5) {
					this.aBoolean167 = false;
				} else if (local13 == 6) {
					this.aString13 = arg0.method109();
				} else if (local13 == 7) {
					@Pc(70) int local70 = this.anInt577;
					@Pc(73) int local73 = this.anInt578;
					@Pc(76) int local76 = this.anInt579;
					@Pc(79) int local79 = this.anInt580;
					@Pc(82) int local82 = arg0.method106();
					this.method403(local82);
					this.anInt577 = local70;
					this.anInt578 = local73;
					this.anInt579 = local76;
					this.anInt580 = local79;
					this.anInt581 = local79;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(114) RuntimeException local114) {
			signlink.reporterror("56681, " + arg0 + ", " + 799 + ", " + local114.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(IZ)V")
	private void method403(@OriginalArg(0) int arg0) {
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
			this.anInt577 = (int) (local61 * 256.0D);
			this.anInt578 = (int) (local63 * 256.0D);
			this.anInt579 = (int) (local69 * 256.0D);
			if (this.anInt578 < 0) {
				this.anInt578 = 0;
			} else if (this.anInt578 > 255) {
				this.anInt578 = 255;
			}
			if (this.anInt579 < 0) {
				this.anInt579 = 0;
			} else if (this.anInt579 > 255) {
				this.anInt579 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt581 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt581 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt581 < 1) {
				this.anInt581 = 1;
			}
			this.anInt580 = (int) (local61 * (double) this.anInt581);
			@Pc(248) int local248 = this.anInt577 + (int) (Math.random() * 16.0D) - 8;
			if (local248 < 0) {
				local248 = 0;
			} else if (local248 > 255) {
				local248 = 255;
			}
			@Pc(269) int local269 = this.anInt578 + (int) (Math.random() * 48.0D) - 24;
			if (local269 < 0) {
				local269 = 0;
			} else if (local269 > 255) {
				local269 = 255;
			}
			@Pc(290) int local290 = this.anInt579 + (int) (Math.random() * 48.0D) - 24;
			if (local290 < 0) {
				local290 = 0;
			} else if (local290 > 255) {
				local290 = 255;
			}
			this.anInt582 = this.method404(local248, local269, local290);
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("26497, " + arg0 + ", " + true + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TFMGYYZY", name = "a", descriptor = "(III)I")
	private int method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
