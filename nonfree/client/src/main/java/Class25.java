import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PQRCEBTR")
public final class Class25 {

	@OriginalMember(owner = "client!PQRCEBTR", name = "a", descriptor = "I")
	private static int anInt574;

	@OriginalMember(owner = "client!PQRCEBTR", name = "b", descriptor = "[Lclient!PQRCEBTR;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!PQRCEBTR", name = "c", descriptor = "Ljava/lang/String;")
	private String aString13;

	@OriginalMember(owner = "client!PQRCEBTR", name = "d", descriptor = "I")
	public int anInt575;

	@OriginalMember(owner = "client!PQRCEBTR", name = "h", descriptor = "I")
	public int anInt577;

	@OriginalMember(owner = "client!PQRCEBTR", name = "i", descriptor = "I")
	public int anInt578;

	@OriginalMember(owner = "client!PQRCEBTR", name = "j", descriptor = "I")
	public int anInt579;

	@OriginalMember(owner = "client!PQRCEBTR", name = "k", descriptor = "I")
	public int anInt580;

	@OriginalMember(owner = "client!PQRCEBTR", name = "l", descriptor = "I")
	public int anInt581;

	@OriginalMember(owner = "client!PQRCEBTR", name = "m", descriptor = "I")
	public int anInt582;

	@OriginalMember(owner = "client!PQRCEBTR", name = "e", descriptor = "I")
	public int anInt576 = -1;

	@OriginalMember(owner = "client!PQRCEBTR", name = "f", descriptor = "Z")
	private boolean aBoolean132 = false;

	@OriginalMember(owner = "client!PQRCEBTR", name = "g", descriptor = "Z")
	public boolean aBoolean133 = true;

	@OriginalMember(owner = "client!PQRCEBTR", name = "a", descriptor = "(Lclient!DTIATKJO;I)V")
	public static void method372(@OriginalArg(0) Class7 arg0) {
		try {
			@Pc(12) Class3_Sub1_Sub2 local12 = new Class3_Sub1_Sub2(-527, arg0.method30("flo.dat", null));
			anInt574 = local12.method91();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt574];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt574; local22++) {
				if (aClass25Array1[local22] == null) {
					aClass25Array1[local22] = new Class25();
				}
				aClass25Array1[local22].method373(local12);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("4683, " + arg0 + ", " + 1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQRCEBTR", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!PQRCEBTR", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	private void method373(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method89();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt575 = arg0.method93();
					this.method374(this.anInt575);
				} else if (local10 == 2) {
					this.anInt576 = arg0.method89();
				} else if (local10 == 3) {
					this.aBoolean132 = true;
				} else if (local10 == 5) {
					this.aBoolean133 = false;
				} else if (local10 == 6) {
					this.aString13 = arg0.method96();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt577;
					@Pc(70) int local70 = this.anInt578;
					@Pc(73) int local73 = this.anInt579;
					@Pc(76) int local76 = this.anInt580;
					@Pc(79) int local79 = arg0.method93();
					this.method374(local79);
					this.anInt577 = local67;
					this.anInt578 = local70;
					this.anInt579 = local73;
					this.anInt580 = local76;
					this.anInt581 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("33091, " + arg0 + ", " + 0 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQRCEBTR", name = "a", descriptor = "(II)V")
	private void method374(@OriginalArg(1) int arg0) {
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
			this.anInt577 = (int) (local56 * 256.0D);
			this.anInt578 = (int) (local58 * 256.0D);
			this.anInt579 = (int) (local64 * 256.0D);
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
			if (local64 > 0.5D) {
				this.anInt581 = (int) ((1.0D - local64) * local58 * 512.0D);
			} else {
				this.anInt581 = (int) (local64 * local58 * 512.0D);
			}
			if (this.anInt581 < 1) {
				this.anInt581 = 1;
			}
			this.anInt580 = (int) (local56 * (double) this.anInt581);
			@Pc(239) int local239 = this.anInt577 + (int) (Math.random() * 16.0D) - 8;
			if (local239 < 0) {
				local239 = 0;
			} else if (local239 > 255) {
				local239 = 255;
			}
			@Pc(260) int local260 = this.anInt578 + (int) (Math.random() * 48.0D) - 24;
			if (local260 < 0) {
				local260 = 0;
			} else if (local260 > 255) {
				local260 = 255;
			}
			@Pc(285) int local285 = this.anInt579 + (int) (Math.random() * 48.0D) - 24;
			if (local285 < 0) {
				local285 = 0;
			} else if (local285 > 255) {
				local285 = 255;
			}
			this.anInt582 = this.method375(local239, local260, local285);
		} catch (@Pc(305) RuntimeException local305) {
			signlink.reporterror("6660, " + -4146 + ", " + arg0 + ", " + local305.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PQRCEBTR", name = "a", descriptor = "(III)I")
	private int method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
