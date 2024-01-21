import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OMGTLVPK")
public final class Class26 {

	@OriginalMember(owner = "client!OMGTLVPK", name = "b", descriptor = "I")
	private static int anInt324;

	@OriginalMember(owner = "client!OMGTLVPK", name = "c", descriptor = "[Lclient!OMGTLVPK;")
	public static Class26[] aClass26Array1;

	@OriginalMember(owner = "client!OMGTLVPK", name = "d", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!OMGTLVPK", name = "e", descriptor = "I")
	public int anInt325;

	@OriginalMember(owner = "client!OMGTLVPK", name = "i", descriptor = "I")
	public int anInt327;

	@OriginalMember(owner = "client!OMGTLVPK", name = "j", descriptor = "I")
	public int anInt328;

	@OriginalMember(owner = "client!OMGTLVPK", name = "k", descriptor = "I")
	public int anInt329;

	@OriginalMember(owner = "client!OMGTLVPK", name = "l", descriptor = "I")
	public int anInt330;

	@OriginalMember(owner = "client!OMGTLVPK", name = "m", descriptor = "I")
	public int anInt331;

	@OriginalMember(owner = "client!OMGTLVPK", name = "n", descriptor = "I")
	public int anInt332;

	@OriginalMember(owner = "client!OMGTLVPK", name = "f", descriptor = "I")
	public int anInt326 = -1;

	@OriginalMember(owner = "client!OMGTLVPK", name = "g", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!OMGTLVPK", name = "h", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(BLclient!RPFMUSNN;)V")
	public static void method299(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class3_Sub1_Sub4 local8 = new Class3_Sub1_Sub4((byte) -58, arg0.method341("flo.dat", null));
			anInt324 = local8.method460();
			if (aClass26Array1 == null) {
				aClass26Array1 = new Class26[anInt324];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt324; local27++) {
				if (aClass26Array1[local27] == null) {
					aClass26Array1[local27] = new Class26();
				}
				aClass26Array1[local27].method300(local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("17570, " + -114 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMGTLVPK", name = "<init>", descriptor = "()V")
	private Class26() {
	}

	@OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	private void method300(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method458();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt325 = arg0.method462();
					this.method301(this.anInt325);
				} else if (local14 == 2) {
					this.anInt326 = arg0.method458();
				} else if (local14 == 3) {
					this.aBoolean88 = true;
				} else if (local14 == 5) {
					this.aBoolean89 = false;
				} else if (local14 == 6) {
					this.aString5 = arg0.method465();
				} else if (local14 == 7) {
					@Pc(71) int local71 = this.anInt327;
					@Pc(74) int local74 = this.anInt328;
					@Pc(77) int local77 = this.anInt329;
					@Pc(80) int local80 = this.anInt330;
					@Pc(83) int local83 = arg0.method462();
					this.method301(local83);
					this.anInt327 = local71;
					this.anInt328 = local74;
					this.anInt329 = local77;
					this.anInt330 = local80;
					this.anInt331 = local80;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("49653, " + -934 + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(II)V")
	private void method301(@OriginalArg(1) int arg0) {
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
			this.anInt327 = (int) (local61 * 256.0D);
			this.anInt328 = (int) (local63 * 256.0D);
			this.anInt329 = (int) (local69 * 256.0D);
			if (this.anInt328 < 0) {
				this.anInt328 = 0;
			} else if (this.anInt328 > 255) {
				this.anInt328 = 255;
			}
			if (this.anInt329 < 0) {
				this.anInt329 = 0;
			} else if (this.anInt329 > 255) {
				this.anInt329 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt331 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt331 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt331 < 1) {
				this.anInt331 = 1;
			}
			this.anInt330 = (int) (local61 * (double) this.anInt331);
			@Pc(244) int local244 = this.anInt327 + (int) (Math.random() * 16.0D) - 8;
			if (local244 < 0) {
				local244 = 0;
			} else if (local244 > 255) {
				local244 = 255;
			}
			@Pc(265) int local265 = this.anInt328 + (int) (Math.random() * 48.0D) - 24;
			if (local265 < 0) {
				local265 = 0;
			} else if (local265 > 255) {
				local265 = 255;
			}
			@Pc(286) int local286 = this.anInt329 + (int) (Math.random() * 48.0D) - 24;
			if (local286 < 0) {
				local286 = 0;
			} else if (local286 > 255) {
				local286 = 255;
			}
			this.anInt332 = this.method302(local244, local265, local286);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("6069, " + -27076 + ", " + arg0 + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OMGTLVPK", name = "a", descriptor = "(III)I")
	private int method302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
