import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZVWMVAWM")
public final class Class50 {

	@OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "I")
	private static int anInt792;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "b", descriptor = "[Lclient!ZVWMVAWM;")
	public static Class50[] aClass50Array1;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "c", descriptor = "Ljava/lang/String;")
	private String aString16;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "d", descriptor = "I")
	public int anInt793;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "h", descriptor = "I")
	public int anInt795;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "i", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "j", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "k", descriptor = "I")
	public int anInt798;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "l", descriptor = "I")
	public int anInt799;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "m", descriptor = "I")
	public int anInt800;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "e", descriptor = "I")
	public int anInt794 = -1;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "f", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "g", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(ZLclient!FXNTEMPE;)V")
	public static void method572(@OriginalArg(1) Class13 arg0) {
		try {
			@Pc(10) Class2_Sub1_Sub4 local10 = new Class2_Sub1_Sub4(arg0.method117("flo.dat", null), -46859);
			anInt792 = local10.method342();
			if (aClass50Array1 == null) {
				aClass50Array1 = new Class50[anInt792];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt792; local20++) {
				if (aClass50Array1[local20] == null) {
					aClass50Array1[local20] = new Class50();
				}
				aClass50Array1[local20].method573(local10);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("99183, " + true + ", " + arg0 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZVWMVAWM", name = "<init>", descriptor = "()V")
	private Class50() {
	}

	@OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(Lclient!RSWRPCHR;B)V")
	private void method573(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method340();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt793 = arg0.method344();
					this.method574(this.anInt793);
				} else if (local11 == 2) {
					this.anInt794 = arg0.method340();
				} else if (local11 == 3) {
					this.aBoolean215 = true;
				} else if (local11 == 5) {
					this.aBoolean216 = false;
				} else if (local11 == 6) {
					this.aString16 = arg0.method347();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt795;
					@Pc(71) int local71 = this.anInt796;
					@Pc(74) int local74 = this.anInt797;
					@Pc(77) int local77 = this.anInt798;
					@Pc(80) int local80 = arg0.method344();
					this.method574(local80);
					this.anInt795 = local68;
					this.anInt796 = local71;
					this.anInt797 = local74;
					this.anInt798 = local77;
					this.anInt799 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("28673, " + arg0 + ", " + 46 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(IZ)V")
	private void method574(@OriginalArg(0) int arg0) {
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
			this.anInt795 = (int) (local61 * 256.0D);
			this.anInt796 = (int) (local63 * 256.0D);
			this.anInt797 = (int) (local69 * 256.0D);
			if (this.anInt796 < 0) {
				this.anInt796 = 0;
			} else if (this.anInt796 > 255) {
				this.anInt796 = 255;
			}
			if (this.anInt797 < 0) {
				this.anInt797 = 0;
			} else if (this.anInt797 > 255) {
				this.anInt797 = 255;
			}
			if (local69 > 0.5D) {
				this.anInt799 = (int) ((1.0D - local69) * local63 * 512.0D);
			} else {
				this.anInt799 = (int) (local69 * local63 * 512.0D);
			}
			if (this.anInt799 < 1) {
				this.anInt799 = 1;
			}
			this.anInt798 = (int) (local61 * (double) this.anInt799);
			@Pc(244) int local244 = this.anInt795 + (int) (Math.random() * 16.0D) - 8;
			if (local244 < 0) {
				local244 = 0;
			} else if (local244 > 255) {
				local244 = 255;
			}
			@Pc(265) int local265 = this.anInt796 + (int) (Math.random() * 48.0D) - 24;
			if (local265 < 0) {
				local265 = 0;
			} else if (local265 > 255) {
				local265 = 255;
			}
			@Pc(286) int local286 = this.anInt797 + (int) (Math.random() * 48.0D) - 24;
			if (local286 < 0) {
				local286 = 0;
			} else if (local286 > 255) {
				local286 = 255;
			}
			this.anInt800 = this.method575(local244, local265, local286);
		} catch (@Pc(309) RuntimeException local309) {
			signlink.reporterror("17955, " + arg0 + ", " + false + ", " + local309.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZVWMVAWM", name = "a", descriptor = "(III)I")
	private int method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
