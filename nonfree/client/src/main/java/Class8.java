import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ECJPTPHH")
public final class Class8 {

	@OriginalMember(owner = "client!ECJPTPHH", name = "d", descriptor = "I")
	private static int anInt74;

	@OriginalMember(owner = "client!ECJPTPHH", name = "e", descriptor = "[Lclient!ECJPTPHH;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!ECJPTPHH", name = "a", descriptor = "Z")
	private static boolean aBoolean28 = true;

	@OriginalMember(owner = "client!ECJPTPHH", name = "f", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!ECJPTPHH", name = "g", descriptor = "I")
	public int anInt75;

	@OriginalMember(owner = "client!ECJPTPHH", name = "k", descriptor = "I")
	public int anInt77;

	@OriginalMember(owner = "client!ECJPTPHH", name = "l", descriptor = "I")
	public int anInt78;

	@OriginalMember(owner = "client!ECJPTPHH", name = "m", descriptor = "I")
	public int anInt79;

	@OriginalMember(owner = "client!ECJPTPHH", name = "n", descriptor = "I")
	public int anInt80;

	@OriginalMember(owner = "client!ECJPTPHH", name = "o", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!ECJPTPHH", name = "p", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!ECJPTPHH", name = "b", descriptor = "I")
	private int anInt72 = 44344;

	@OriginalMember(owner = "client!ECJPTPHH", name = "c", descriptor = "I")
	private int anInt73 = 974;

	@OriginalMember(owner = "client!ECJPTPHH", name = "h", descriptor = "I")
	public int anInt76 = -1;

	@OriginalMember(owner = "client!ECJPTPHH", name = "i", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!ECJPTPHH", name = "j", descriptor = "Z")
	public boolean aBoolean30 = true;

	@OriginalMember(owner = "client!ECJPTPHH", name = "a", descriptor = "(ILclient!RVLWVPJQ;)V")
	public static void method48(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(8) Class6_Sub2_Sub3 local8 = new Class6_Sub2_Sub3(741, arg0.method381("flo.dat", null));
			anInt74 = local8.method404();
			if (aClass8Array1 == null) {
				aClass8Array1 = new Class8[anInt74];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt74; local26++) {
				if (aClass8Array1[local26] == null) {
					aClass8Array1[local26] = new Class8();
				}
				aClass8Array1[local26].method49(local8);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("51314, " + 0 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ECJPTPHH", name = "<init>", descriptor = "()V")
	private Class8() {
	}

	@OriginalMember(owner = "client!ECJPTPHH", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	private void method49(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method402();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt75 = arg0.method406();
					this.method50(this.anInt75);
				} else if (local14 == 2) {
					this.anInt76 = arg0.method402();
				} else if (local14 == 3) {
					this.aBoolean29 = true;
				} else if (local14 == 5) {
					this.aBoolean30 = false;
				} else if (local14 == 6) {
					this.aString2 = arg0.method409();
				} else if (local14 == 7) {
					@Pc(71) int local71 = this.anInt77;
					@Pc(74) int local74 = this.anInt78;
					@Pc(77) int local77 = this.anInt79;
					@Pc(80) int local80 = this.anInt80;
					@Pc(83) int local83 = arg0.method406();
					this.method50(local83);
					this.anInt77 = local71;
					this.anInt78 = local74;
					this.anInt79 = local77;
					this.anInt80 = local80;
					this.anInt81 = local80;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("75426, " + -7321 + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ECJPTPHH", name = "a", descriptor = "(II)V")
	private void method50(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(19) double local19 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(26) double local26 = (double) (arg0 & 0xFF) / 256.0D;
			if (this.anInt72 != 44344) {
				this.anInt73 = -246;
			}
			@Pc(35) double local35 = local10;
			if (local19 < local10) {
				local35 = local19;
			}
			if (local26 < local35) {
				local35 = local26;
			}
			@Pc(49) double local49 = local10;
			if (local19 > local10) {
				local49 = local19;
			}
			if (local26 > local49) {
				local49 = local26;
			}
			@Pc(63) double local63 = 0.0D;
			@Pc(65) double local65 = 0.0D;
			@Pc(71) double local71 = (local35 + local49) / 2.0D;
			if (local35 != local49) {
				if (local71 < 0.5D) {
					local65 = (local49 - local35) / (local49 + local35);
				}
				if (local71 >= 0.5D) {
					local65 = (local49 - local35) / (2.0D - local49 - local35);
				}
				if (local10 == local49) {
					local63 = (local19 - local26) / (local49 - local35);
				} else if (local19 == local49) {
					local63 = (local26 - local10) / (local49 - local35) + 2.0D;
				} else if (local26 == local49) {
					local63 = (local10 - local19) / (local49 - local35) + 4.0D;
				}
			}
			local63 /= 6.0D;
			this.anInt77 = (int) (local63 * 256.0D);
			this.anInt78 = (int) (local65 * 256.0D);
			this.anInt79 = (int) (local71 * 256.0D);
			if (this.anInt78 < 0) {
				this.anInt78 = 0;
			} else if (this.anInt78 > 255) {
				this.anInt78 = 255;
			}
			if (this.anInt79 < 0) {
				this.anInt79 = 0;
			} else if (this.anInt79 > 255) {
				this.anInt79 = 255;
			}
			if (local71 > 0.5D) {
				this.anInt81 = (int) ((1.0D - local71) * local65 * 512.0D);
			} else {
				this.anInt81 = (int) (local71 * local65 * 512.0D);
			}
			if (this.anInt81 < 1) {
				this.anInt81 = 1;
			}
			this.anInt80 = (int) (local63 * (double) this.anInt81);
			@Pc(246) int local246 = this.anInt77 + (int) (Math.random() * 16.0D) - 8;
			if (local246 < 0) {
				local246 = 0;
			} else if (local246 > 255) {
				local246 = 255;
			}
			@Pc(267) int local267 = this.anInt78 + (int) (Math.random() * 48.0D) - 24;
			if (local267 < 0) {
				local267 = 0;
			} else if (local267 > 255) {
				local267 = 255;
			}
			@Pc(288) int local288 = this.anInt79 + (int) (Math.random() * 48.0D) - 24;
			if (local288 < 0) {
				local288 = 0;
			} else if (local288 > 255) {
				local288 = 255;
			}
			this.anInt82 = this.method51(local246, local267, local288);
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("91288, " + arg0 + ", " + 44344 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ECJPTPHH", name = "a", descriptor = "(III)I")
	private int method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
