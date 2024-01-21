import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GMRGYXFL")
public final class Class16 {

	@OriginalMember(owner = "client!GMRGYXFL", name = "c", descriptor = "I")
	private static int anInt332;

	@OriginalMember(owner = "client!GMRGYXFL", name = "d", descriptor = "[Lclient!GMRGYXFL;")
	public static Class16[] aClass16Array1;

	@OriginalMember(owner = "client!GMRGYXFL", name = "a", descriptor = "B")
	private static byte aByte10 = -27;

	@OriginalMember(owner = "client!GMRGYXFL", name = "b", descriptor = "I")
	private static int anInt331 = 8;

	@OriginalMember(owner = "client!GMRGYXFL", name = "e", descriptor = "I")
	public int anInt333;

	@OriginalMember(owner = "client!GMRGYXFL", name = "f", descriptor = "[I")
	public int[] anIntArray78;

	@OriginalMember(owner = "client!GMRGYXFL", name = "g", descriptor = "[I")
	public int[] anIntArray79;

	@OriginalMember(owner = "client!GMRGYXFL", name = "h", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!GMRGYXFL", name = "j", descriptor = "[I")
	public int[] anIntArray81;

	@OriginalMember(owner = "client!GMRGYXFL", name = "s", descriptor = "I")
	private int anInt342;

	@OriginalMember(owner = "client!GMRGYXFL", name = "i", descriptor = "I")
	public int anInt334 = -1;

	@OriginalMember(owner = "client!GMRGYXFL", name = "k", descriptor = "Z")
	public boolean aBoolean72 = false;

	@OriginalMember(owner = "client!GMRGYXFL", name = "l", descriptor = "I")
	public int anInt335 = 5;

	@OriginalMember(owner = "client!GMRGYXFL", name = "m", descriptor = "I")
	public int anInt336 = -1;

	@OriginalMember(owner = "client!GMRGYXFL", name = "n", descriptor = "I")
	public int anInt337 = -1;

	@OriginalMember(owner = "client!GMRGYXFL", name = "o", descriptor = "I")
	public int anInt338 = 99;

	@OriginalMember(owner = "client!GMRGYXFL", name = "p", descriptor = "I")
	public int anInt339 = -1;

	@OriginalMember(owner = "client!GMRGYXFL", name = "q", descriptor = "I")
	public int anInt340 = -1;

	@OriginalMember(owner = "client!GMRGYXFL", name = "r", descriptor = "I")
	public int anInt341 = 2;

	@OriginalMember(owner = "client!GMRGYXFL", name = "a", descriptor = "(ILclient!QKFGLETG;)V")
	public static void method207(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("seq.dat", null));
			anInt332 = local8.method500();
			if (aClass16Array1 == null) {
				aClass16Array1 = new Class16[anInt332];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt332; local18++) {
				if (aClass16Array1[local18] == null) {
					aClass16Array1[local18] = new Class16();
				}
				aClass16Array1[local18].method209(aByte10, local8);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("42868, " + 0 + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GMRGYXFL", name = "<init>", descriptor = "()V")
	private Class16() {
	}

	@OriginalMember(owner = "client!GMRGYXFL", name = "a", descriptor = "(BI)I")
	public int method208(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anIntArray80[arg0];
			if (local4 == 0) {
				@Pc(18) Class40 local18 = Class40.method366(this.anIntArray78[arg0]);
				if (local18 != null) {
					local4 = this.anIntArray80[arg0] = local18.anInt649;
				}
			}
			if (local4 == 0) {
				local4 = 1;
			}
			return local4;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("57256, " + 110 + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GMRGYXFL", name = "a", descriptor = "(BLclient!XJCNBMKS;)V")
	private void method209(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			if (arg0 != aByte10) {
				throw new NullPointerException();
			}
			while (true) {
				while (true) {
					@Pc(11) int local11 = arg1.method498();
					if (local11 == 0) {
						if (this.anInt333 == 0) {
							this.anInt333 = 1;
							this.anIntArray78 = new int[1];
							this.anIntArray78[0] = -1;
							this.anIntArray79 = new int[1];
							this.anIntArray79[0] = -1;
							this.anIntArray80 = new int[1];
							this.anIntArray80[0] = -1;
						}
						if (this.anInt339 == -1) {
							if (this.anIntArray81 == null) {
								this.anInt339 = 0;
							} else {
								this.anInt339 = 2;
							}
						}
						if (this.anInt340 == -1) {
							if (this.anIntArray81 != null) {
								this.anInt340 = 2;
								return;
							}
							this.anInt340 = 0;
							return;
						}
						return;
					}
					@Pc(38) int local38;
					if (local11 == 1) {
						this.anInt333 = arg1.method498();
						this.anIntArray78 = new int[this.anInt333];
						this.anIntArray79 = new int[this.anInt333];
						this.anIntArray80 = new int[this.anInt333];
						for (local38 = 0; local38 < this.anInt333; local38++) {
							this.anIntArray78[local38] = arg1.method500();
							this.anIntArray79[local38] = arg1.method500();
							if (this.anIntArray79[local38] == 65535) {
								this.anIntArray79[local38] = -1;
							}
							this.anIntArray80[local38] = arg1.method500();
						}
					} else if (local11 == 2) {
						this.anInt334 = arg1.method500();
					} else if (local11 == 3) {
						local38 = arg1.method498();
						this.anIntArray81 = new int[local38 + 1];
						for (@Pc(99) int local99 = 0; local99 < local38; local99++) {
							this.anIntArray81[local99] = arg1.method498();
						}
						this.anIntArray81[local38] = 9999999;
					} else if (local11 == 4) {
						this.aBoolean72 = true;
					} else if (local11 == 5) {
						this.anInt335 = arg1.method498();
					} else if (local11 == 6) {
						this.anInt336 = arg1.method500();
					} else if (local11 == 7) {
						this.anInt337 = arg1.method500();
					} else if (local11 == 8) {
						this.anInt338 = arg1.method498();
					} else if (local11 == 9) {
						this.anInt339 = arg1.method498();
					} else if (local11 == 10) {
						this.anInt340 = arg1.method498();
					} else if (local11 == 11) {
						this.anInt341 = arg1.method498();
					} else if (local11 == 12) {
						this.anInt342 = arg1.method503();
					} else {
						System.out.println("Error unrecognised seq config code: " + local11);
					}
				}
			}
		} catch (@Pc(273) RuntimeException local273) {
			signlink.reporterror("92284, " + arg0 + ", " + arg1 + ", " + local273.toString());
			throw new RuntimeException();
		}
	}
}
