import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FBZMYCDC")
public final class Class11 {

	@OriginalMember(owner = "client!FBZMYCDC", name = "b", descriptor = "I")
	private static int anInt165;

	@OriginalMember(owner = "client!FBZMYCDC", name = "c", descriptor = "[Lclient!FBZMYCDC;")
	public static Class11[] aClass11Array1;

	@OriginalMember(owner = "client!FBZMYCDC", name = "d", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!FBZMYCDC", name = "e", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!FBZMYCDC", name = "i", descriptor = "I")
	public int anInt168;

	@OriginalMember(owner = "client!FBZMYCDC", name = "j", descriptor = "I")
	public int anInt169;

	@OriginalMember(owner = "client!FBZMYCDC", name = "k", descriptor = "I")
	public int anInt170;

	@OriginalMember(owner = "client!FBZMYCDC", name = "l", descriptor = "I")
	public int anInt171;

	@OriginalMember(owner = "client!FBZMYCDC", name = "m", descriptor = "I")
	public int anInt172;

	@OriginalMember(owner = "client!FBZMYCDC", name = "n", descriptor = "I")
	public int anInt173;

	@OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!FBZMYCDC", name = "f", descriptor = "I")
	public int anInt167 = -1;

	@OriginalMember(owner = "client!FBZMYCDC", name = "g", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!FBZMYCDC", name = "h", descriptor = "Z")
	public boolean aBoolean40 = true;

	@OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(BLclient!JUPFHAZZ;)V")
	public static void method74(@OriginalArg(1) Class21 arg0) {
		try {
			@Pc(20) Class2_Sub1_Sub4 local20 = new Class2_Sub1_Sub4(859, arg0.method275("flo.dat", null));
			anInt165 = local20.method494();
			if (aClass11Array1 == null) {
				aClass11Array1 = new Class11[anInt165];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt165; local30++) {
				if (aClass11Array1[local30] == null) {
					aClass11Array1[local30] = new Class11();
				}
				aClass11Array1[local30].method75(local20);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("12472, " + -3 + ", " + arg0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBZMYCDC", name = "<init>", descriptor = "()V")
	private Class11() {
	}

	@OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(Lclient!TKPFKOXP;B)V")
	private void method75(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			while (true) {
				@Pc(11) int local11 = arg0.method492();
				if (local11 == 0) {
					return;
				}
				if (local11 == 1) {
					this.anInt166 = arg0.method496();
					this.method76(this.anInt166);
				} else if (local11 == 2) {
					this.anInt167 = arg0.method492();
				} else if (local11 == 3) {
					this.aBoolean39 = true;
				} else if (local11 == 5) {
					this.aBoolean40 = false;
				} else if (local11 == 6) {
					this.aString2 = arg0.method499();
				} else if (local11 == 7) {
					@Pc(68) int local68 = this.anInt168;
					@Pc(71) int local71 = this.anInt169;
					@Pc(74) int local74 = this.anInt170;
					@Pc(77) int local77 = this.anInt171;
					@Pc(80) int local80 = arg0.method496();
					this.method76(local80);
					this.anInt168 = local68;
					this.anInt169 = local71;
					this.anInt170 = local74;
					this.anInt171 = local77;
					this.anInt172 = local77;
				} else {
					System.out.println("Error unrecognised config code: " + local11);
				}
			}
		} catch (@Pc(112) RuntimeException local112) {
			signlink.reporterror("86432, " + arg0 + ", " + 4 + ", " + local112.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(II)V")
	private void method76(@OriginalArg(1) int arg0) {
		try {
			if (arg0 == 16711935) {
				arg0 = 0;
			}
			@Pc(15) double local15 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
			@Pc(34) double local34 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
			@Pc(41) double local41 = (double) (arg0 & 0xFF) / 256.0D;
			@Pc(43) double local43 = local15;
			if (local34 < local15) {
				local43 = local34;
			}
			if (local41 < local43) {
				local43 = local41;
			}
			@Pc(57) double local57 = local15;
			if (local34 > local15) {
				local57 = local34;
			}
			if (local41 > local57) {
				local57 = local41;
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
					local71 = (local34 - local41) / (local57 - local43);
				} else if (local34 == local57) {
					local71 = (local41 - local15) / (local57 - local43) + 2.0D;
				} else if (local41 == local57) {
					local71 = (local15 - local34) / (local57 - local43) + 4.0D;
				}
			}
			local71 /= 6.0D;
			this.anInt168 = (int) (local71 * 256.0D);
			this.anInt169 = (int) (local73 * 256.0D);
			this.anInt170 = (int) (local79 * 256.0D);
			if (this.anInt169 < 0) {
				this.anInt169 = 0;
			} else if (this.anInt169 > 255) {
				this.anInt169 = 255;
			}
			if (this.anInt170 < 0) {
				this.anInt170 = 0;
			} else if (this.anInt170 > 255) {
				this.anInt170 = 255;
			}
			if (local79 > 0.5D) {
				this.anInt172 = (int) ((1.0D - local79) * local73 * 512.0D);
			} else {
				this.anInt172 = (int) (local79 * local73 * 512.0D);
			}
			if (this.anInt172 < 1) {
				this.anInt172 = 1;
			}
			this.anInt171 = (int) (local71 * (double) this.anInt172);
			@Pc(254) int local254 = this.anInt168 + (int) (Math.random() * 16.0D) - 8;
			if (local254 < 0) {
				local254 = 0;
			} else if (local254 > 255) {
				local254 = 255;
			}
			@Pc(275) int local275 = this.anInt169 + (int) (Math.random() * 48.0D) - 24;
			if (local275 < 0) {
				local275 = 0;
			} else if (local275 > 255) {
				local275 = 255;
			}
			@Pc(296) int local296 = this.anInt170 + (int) (Math.random() * 48.0D) - 24;
			if (local296 < 0) {
				local296 = 0;
			} else if (local296 > 255) {
				local296 = 255;
			}
			this.anInt173 = this.method77(local254, local275, local296);
		} catch (@Pc(316) RuntimeException local316) {
			signlink.reporterror("13657, " + 0 + ", " + arg0 + ", " + local316.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBZMYCDC", name = "a", descriptor = "(III)I")
	private int method77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
