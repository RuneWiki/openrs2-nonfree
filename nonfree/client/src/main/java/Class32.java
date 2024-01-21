import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QRIJREXW")
public final class Class32 {

	@OriginalMember(owner = "client!QRIJREXW", name = "c", descriptor = "I")
	private static int anInt607;

	@OriginalMember(owner = "client!QRIJREXW", name = "d", descriptor = "[Lclient!QRIJREXW;")
	public static Class32[] aClass32Array1;

	@OriginalMember(owner = "client!QRIJREXW", name = "b", descriptor = "Z")
	private static boolean aBoolean143 = true;

	@OriginalMember(owner = "client!QRIJREXW", name = "e", descriptor = "Ljava/lang/String;")
	private String aString12;

	@OriginalMember(owner = "client!QRIJREXW", name = "f", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!QRIJREXW", name = "j", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!QRIJREXW", name = "k", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!QRIJREXW", name = "l", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!QRIJREXW", name = "m", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!QRIJREXW", name = "n", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!QRIJREXW", name = "o", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!QRIJREXW", name = "g", descriptor = "I")
	public int anInt609 = -1;

	@OriginalMember(owner = "client!QRIJREXW", name = "h", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!QRIJREXW", name = "i", descriptor = "Z")
	public boolean aBoolean145 = true;

	@OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(Lclient!LKPVZAQN;I)V")
	public static void method388(@OriginalArg(0) Class22 arg0) {
		try {
			@Pc(16) Class3_Sub3_Sub4 local16 = new Class3_Sub3_Sub4((byte) -115, arg0.method207("flo.dat", null));
			anInt607 = local16.method470();
			if (aClass32Array1 == null) {
				aClass32Array1 = new Class32[anInt607];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt607; local26++) {
				if (aClass32Array1[local26] == null) {
					aClass32Array1[local26] = new Class32();
				}
				aClass32Array1[local26].method389(local16);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("40947, " + arg0 + ", " + 713 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRIJREXW", name = "<init>", descriptor = "()V")
	private Class32() {
	}

	@OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	private void method389(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			while (true) {
				@Pc(10) int local10 = arg0.method468();
				if (local10 == 0) {
					return;
				}
				if (local10 == 1) {
					this.anInt608 = arg0.method472();
					this.method390(this.anInt608);
				} else if (local10 == 2) {
					this.anInt609 = arg0.method468();
				} else if (local10 == 3) {
					this.aBoolean144 = true;
				} else if (local10 == 5) {
					this.aBoolean145 = false;
				} else if (local10 == 6) {
					this.aString12 = arg0.method475();
				} else if (local10 == 7) {
					@Pc(67) int local67 = this.anInt610;
					@Pc(70) int local70 = this.anInt611;
					@Pc(73) int local73 = this.anInt612;
					@Pc(76) int local76 = this.anInt613;
					@Pc(79) int local79 = arg0.method472();
					this.method390(local79);
					this.anInt610 = local67;
					this.anInt611 = local70;
					this.anInt612 = local73;
					this.anInt613 = local76;
					this.anInt614 = local76;
				} else {
					System.out.println("Error unrecognised config code: " + local10);
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("99317, " + arg0 + ", " + 767 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(ZI)V")
	private void method390(@OriginalArg(1) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(24) double local24 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(31) double local31 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(43) double local43 = local15;
			if (local24 < local15) {
				local43 = local24;
			}
			if (local31 < local43) {
				local43 = local31;
			}
			@Pc(57) double local57 = local15;
			if (local24 > local15) {
				local57 = local24;
			}
			if (local31 > local57) {
				local57 = local31;
			}
			@Pc(71) double local71 = 0.0D;
			@Pc(73) double local73 = 0.0D;
			@Pc(79) double local79 = (local43 + local57) / 2.0D;
			if (local43 != local57) {
				if (local79 < 0.5D) {
					local73 = (local57 - local43) / (local57 + local43);
				}
				if (local79 >= 0.5D) {
					local73 = (local57 - local43) / (2.0D - local57 - local43);
				}
				if (local15 == local57) {
					local71 = (local24 - local31) / (local57 - local43);
				} else if (local24 == local57) {
					local71 = (local31 - local15) / (local57 - local43) + 2.0D;
				} else if (local31 == local57) {
					local71 = (local15 - local24) / (local57 - local43) + 4.0D;
				}
			}
			local71 /= 6.0D;
			this.anInt610 = (int) (local71 * 256.0D);
			this.anInt611 = (int) (local73 * 256.0D);
			this.anInt612 = (int) (local79 * 256.0D);
			if (this.anInt611 < 0) {
				this.anInt611 = 0;
			} else if (this.anInt611 > 255) {
				this.anInt611 = 255;
			}
			if (this.anInt612 < 0) {
				this.anInt612 = 0;
			} else if (this.anInt612 > 255) {
				this.anInt612 = 255;
			}
			if (local79 > 0.5D) {
				this.anInt614 = (int) ((1.0D - local79) * local73 * 512.0D);
			} else {
				this.anInt614 = (int) (local79 * local73 * 512.0D);
			}
			if (this.anInt614 < 1) {
				this.anInt614 = 1;
			}
			this.anInt613 = (int) (local71 * (double) this.anInt614);
			@Pc(254) int local254 = this.anInt610 + (int) (Math.random() * 16.0D) - 8;
			if (local254 < 0) {
				local254 = 0;
			} else if (local254 > 255) {
				local254 = 255;
			}
			@Pc(275) int local275 = this.anInt611 + (int) (Math.random() * 48.0D) - 24;
			if (local275 < 0) {
				local275 = 0;
			} else if (local275 > 255) {
				local275 = 255;
			}
			@Pc(296) int local296 = this.anInt612 + (int) (Math.random() * 48.0D) - 24;
			if (local296 < 0) {
				local296 = 0;
			} else if (local296 > 255) {
				local296 = 255;
			}
			this.anInt615 = this.method391(local254, local275, local296);
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("23452, " + true + ", " + arg0 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QRIJREXW", name = "a", descriptor = "(III)I")
	private int method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
