import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MNHKFPQO")
public final class Class24 {

	@OriginalMember(owner = "client!MNHKFPQO", name = "b", descriptor = "I")
	private static int anInt473;

	@OriginalMember(owner = "client!MNHKFPQO", name = "c", descriptor = "I")
	private static int anInt474;

	@OriginalMember(owner = "client!MNHKFPQO", name = "d", descriptor = "[Lclient!MNHKFPQO;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!MNHKFPQO", name = "e", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!MNHKFPQO", name = "f", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!MNHKFPQO", name = "j", descriptor = "I")
	public int anInt477;

	@OriginalMember(owner = "client!MNHKFPQO", name = "k", descriptor = "I")
	public int anInt478;

	@OriginalMember(owner = "client!MNHKFPQO", name = "l", descriptor = "I")
	public int anInt479;

	@OriginalMember(owner = "client!MNHKFPQO", name = "m", descriptor = "I")
	public int anInt480;

	@OriginalMember(owner = "client!MNHKFPQO", name = "n", descriptor = "I")
	public int anInt481;

	@OriginalMember(owner = "client!MNHKFPQO", name = "o", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!MNHKFPQO", name = "g", descriptor = "I")
	public int anInt476 = -1;

	@OriginalMember(owner = "client!MNHKFPQO", name = "h", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!MNHKFPQO", name = "i", descriptor = "Z")
	public boolean aBoolean114 = true;

	@OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(ILclient!XTGLDHGX;)V")
	public static void method303(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg0.method484("flo.dat", null), 891);
			anInt474 = local12.method270();
			if (aClass24Array1 == null) {
				aClass24Array1 = new Class24[anInt474];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt474; local22++) {
				if (aClass24Array1[local22] == null) {
					aClass24Array1[local22] = new Class24();
				}
				aClass24Array1[local22].method304(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("44875, " + 0 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNHKFPQO", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(ZLclient!MBMGIXGO;)V")
	private void method304(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(14) int local14 = arg0.method268();
				if (local14 == 0) {
					return;
				}
				if (local14 == 1) {
					this.anInt475 = arg0.method272();
					this.method305(this.anInt475);
				} else if (local14 == 2) {
					this.anInt476 = arg0.method268();
				} else if (local14 == 3) {
					this.aBoolean113 = true;
				} else if (local14 == 5) {
					this.aBoolean114 = false;
				} else if (local14 == 6) {
					this.aString13 = arg0.method275();
				} else if (local14 == 7) {
					@Pc(71) int local71 = this.anInt477;
					@Pc(74) int local74 = this.anInt478;
					@Pc(77) int local77 = this.anInt479;
					@Pc(80) int local80 = this.anInt480;
					@Pc(83) int local83 = arg0.method272();
					this.method305(local83);
					this.anInt477 = local71;
					this.anInt478 = local74;
					this.anInt479 = local77;
					this.anInt480 = local80;
					this.anInt481 = local80;
				} else {
					System.out.println("Error unrecognised config code: " + local14);
				}
			}
		} catch (@Pc(115) RuntimeException local115) {
			signlink.reporterror("56322, " + true + ", " + arg0 + ", " + local115.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(II)V")
	private void method305(@OriginalArg(0) int arg0) {
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
			this.anInt477 = (int) (local56 * 256.0D);
			this.anInt478 = (int) (local58 * 256.0D);
			this.anInt479 = (int) (local64 * 256.0D);
			if (this.anInt478 < 0) {
				this.anInt478 = 0;
			} else if (this.anInt478 > 255) {
				this.anInt478 = 255;
			}
			if (this.anInt479 < 0) {
				this.anInt479 = 0;
			} else if (this.anInt479 > 255) {
				this.anInt479 = 255;
			}
			if (local64 > 0.5D) {
				this.anInt481 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt481 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt481 < 1) {
				this.anInt481 = 1;
			}
			this.anInt480 = (int) (local56 * (double) this.anInt481);
			@Pc(239) int local239 = this.anInt477 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt478 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(288) int local288 = this.anInt479 + (int) (Math.random() * 48.0D) - 24;
			if (local288 < 0) {
				local288 = 0;
			} else if (local288 > 255) {
				local288 = 255;
			}
			this.anInt482 = this.method306(local239, local260, local288);
		} catch (@Pc(308) RuntimeException local308) {
			signlink.reporterror("21687, " + arg0 + ", " + 9 + ", " + local308.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNHKFPQO", name = "a", descriptor = "(III)I")
	private int method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
