import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JZFUUSFN")
public final class Class19 {

	@OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "Z")
	private static boolean aBoolean82;

	@OriginalMember(owner = "client!JZFUUSFN", name = "b", descriptor = "I")
	private static int anInt410;

	@OriginalMember(owner = "client!JZFUUSFN", name = "c", descriptor = "[Lclient!JZFUUSFN;")
	public static Class19[] aClass19Array1;

	@OriginalMember(owner = "client!JZFUUSFN", name = "d", descriptor = "I")
	public int anInt411;

	@OriginalMember(owner = "client!JZFUUSFN", name = "e", descriptor = "[I")
	public int[] anIntArray82;

	@OriginalMember(owner = "client!JZFUUSFN", name = "f", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!JZFUUSFN", name = "g", descriptor = "[I")
	private int[] anIntArray84;

	@OriginalMember(owner = "client!JZFUUSFN", name = "i", descriptor = "[I")
	public int[] anIntArray85;

	@OriginalMember(owner = "client!JZFUUSFN", name = "r", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!JZFUUSFN", name = "h", descriptor = "I")
	public int anInt412 = -1;

	@OriginalMember(owner = "client!JZFUUSFN", name = "j", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!JZFUUSFN", name = "k", descriptor = "I")
	public int anInt413 = 5;

	@OriginalMember(owner = "client!JZFUUSFN", name = "l", descriptor = "I")
	public int anInt414 = -1;

	@OriginalMember(owner = "client!JZFUUSFN", name = "m", descriptor = "I")
	public int anInt415 = -1;

	@OriginalMember(owner = "client!JZFUUSFN", name = "n", descriptor = "I")
	public int anInt416 = 99;

	@OriginalMember(owner = "client!JZFUUSFN", name = "o", descriptor = "I")
	public int anInt417 = -1;

	@OriginalMember(owner = "client!JZFUUSFN", name = "p", descriptor = "I")
	public int anInt418 = -1;

	@OriginalMember(owner = "client!JZFUUSFN", name = "q", descriptor = "I")
	public int anInt419 = 2;

	@OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "(BLclient!IEMHZJLX;)V")
	public static void method242(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(0, arg0.method181("seq.dat", null));
			anInt410 = local8.method296();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt410];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt410; local27++) {
				if (aClass19Array1[local27] == null) {
					aClass19Array1[local27] = new Class19();
				}
				aClass19Array1[local27].method244(403, local8);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("99415, " + 8 + ", " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZFUUSFN", name = "<init>", descriptor = "()V")
	private Class19() {
	}

	@OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "(II)I")
	public int method243(@OriginalArg(1) int arg0) {
		try {
			@Pc(9) int local9 = this.anIntArray84[arg0];
			if (local9 == 0) {
				@Pc(17) Class49 local17 = Class49.method572(this.anIntArray82[arg0]);
				if (local17 != null) {
					local9 = this.anIntArray84[arg0] = local17.anInt801;
				}
			}
			if (local9 == 0) {
				local9 = 1;
			}
			return local9;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("96188, " + 6 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZFUUSFN", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	private void method244(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub4 arg1) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				while (true) {
					@Pc(8) int local8 = arg1.method294();
					if (local8 == 0) {
						if (this.anInt411 == 0) {
							this.anInt411 = 1;
							this.anIntArray82 = new int[1];
							this.anIntArray82[0] = -1;
							this.anIntArray83 = new int[1];
							this.anIntArray83[0] = -1;
							this.anIntArray84 = new int[1];
							this.anIntArray84[0] = -1;
						}
						if (this.anInt417 == -1) {
							if (this.anIntArray85 == null) {
								this.anInt417 = 0;
							} else {
								this.anInt417 = 2;
							}
						}
						if (this.anInt418 == -1) {
							if (this.anIntArray85 != null) {
								this.anInt418 = 2;
								return;
							}
							this.anInt418 = 0;
							return;
						}
						return;
					}
					@Pc(35) int local35;
					if (local8 == 1) {
						this.anInt411 = arg1.method294();
						this.anIntArray82 = new int[this.anInt411];
						this.anIntArray83 = new int[this.anInt411];
						this.anIntArray84 = new int[this.anInt411];
						for (local35 = 0; local35 < this.anInt411; local35++) {
							this.anIntArray82[local35] = arg1.method296();
							this.anIntArray83[local35] = arg1.method296();
							if (this.anIntArray83[local35] == 65535) {
								this.anIntArray83[local35] = -1;
							}
							this.anIntArray84[local35] = arg1.method296();
						}
					} else if (local8 == 2) {
						this.anInt412 = arg1.method296();
					} else if (local8 == 3) {
						local35 = arg1.method294();
						this.anIntArray85 = new int[local35 + 1];
						for (@Pc(96) int local96 = 0; local96 < local35; local96++) {
							this.anIntArray85[local96] = arg1.method294();
						}
						this.anIntArray85[local35] = 9999999;
					} else if (local8 == 4) {
						this.aBoolean83 = true;
					} else if (local8 == 5) {
						this.anInt413 = arg1.method294();
					} else if (local8 == 6) {
						this.anInt414 = arg1.method296();
					} else if (local8 == 7) {
						this.anInt415 = arg1.method296();
					} else if (local8 == 8) {
						this.anInt416 = arg1.method294();
					} else if (local8 == 9) {
						this.anInt417 = arg1.method294();
					} else if (local8 == 10) {
						this.anInt418 = arg1.method294();
					} else if (local8 == 11) {
						this.anInt419 = arg1.method294();
					} else if (local8 == 12) {
						this.anInt420 = arg1.method299();
					} else {
						System.out.println("Error unrecognised seq config code: " + local8);
					}
				}
			}
		} catch (@Pc(270) RuntimeException local270) {
			signlink.reporterror("28194, " + arg0 + ", " + arg1 + ", " + local270.toString());
			throw new RuntimeException();
		}
	}
}
