import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PNPNYEVW")
public final class Class31 {

	@OriginalMember(owner = "client!PNPNYEVW", name = "b", descriptor = "I")
	private static int anInt480;

	@OriginalMember(owner = "client!PNPNYEVW", name = "c", descriptor = "[Lclient!PNPNYEVW;")
	public static Class31[] aClass31Array1;

	@OriginalMember(owner = "client!PNPNYEVW", name = "a", descriptor = "I")
	private static int anInt479 = -44493;

	@OriginalMember(owner = "client!PNPNYEVW", name = "d", descriptor = "I")
	public int anInt481;

	@OriginalMember(owner = "client!PNPNYEVW", name = "e", descriptor = "[I")
	public int[] anIntArray126;

	@OriginalMember(owner = "client!PNPNYEVW", name = "f", descriptor = "[I")
	public int[] anIntArray127;

	@OriginalMember(owner = "client!PNPNYEVW", name = "g", descriptor = "[I")
	private int[] anIntArray128;

	@OriginalMember(owner = "client!PNPNYEVW", name = "i", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!PNPNYEVW", name = "r", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!PNPNYEVW", name = "h", descriptor = "I")
	public int anInt482 = -1;

	@OriginalMember(owner = "client!PNPNYEVW", name = "j", descriptor = "Z")
	public boolean aBoolean133 = false;

	@OriginalMember(owner = "client!PNPNYEVW", name = "k", descriptor = "I")
	public int anInt483 = 5;

	@OriginalMember(owner = "client!PNPNYEVW", name = "l", descriptor = "I")
	public int anInt484 = -1;

	@OriginalMember(owner = "client!PNPNYEVW", name = "m", descriptor = "I")
	public int anInt485 = -1;

	@OriginalMember(owner = "client!PNPNYEVW", name = "n", descriptor = "I")
	public int anInt486 = 99;

	@OriginalMember(owner = "client!PNPNYEVW", name = "o", descriptor = "I")
	public int anInt487 = -1;

	@OriginalMember(owner = "client!PNPNYEVW", name = "p", descriptor = "I")
	public int anInt488 = -1;

	@OriginalMember(owner = "client!PNPNYEVW", name = "q", descriptor = "I")
	public int anInt489 = 2;

	@OriginalMember(owner = "client!PNPNYEVW", name = "a", descriptor = "(ILclient!INOFEYKQ;)V")
	public static void method339(@OriginalArg(1) Class14 arg0) {
		try {
			@Pc(10) Class3_Sub1_Sub3 local10 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("seq.dat", (byte[]) null));
			anInt480 = local10.method276();
			if (aClass31Array1 == null) {
				aClass31Array1 = new Class31[anInt480];
			}
			for (@Pc(20) int local20 = 0; local20 < anInt480; local20++) {
				if (aClass31Array1[local20] == null) {
					aClass31Array1[local20] = new Class31();
				}
				aClass31Array1[local20].method341(local10);
			}
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("93131, " + -351 + ", " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PNPNYEVW", name = "<init>", descriptor = "()V")
	private Class31() {
	}

	@OriginalMember(owner = "client!PNPNYEVW", name = "a", descriptor = "(II)I")
	public int method340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 < 9 || arg1 > 9) {
				return 1;
			}
			@Pc(12) int local12 = this.anIntArray128[arg0];
			if (local12 == 0) {
				@Pc(20) Class18 local20 = Class18.method209(this.anIntArray126[arg0]);
				if (local20 != null) {
					local12 = this.anIntArray128[arg0] = local20.anInt396;
				}
			}
			if (local12 == 0) {
				local12 = 1;
			}
			return local12;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("48918, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PNPNYEVW", name = "a", descriptor = "(ZLclient!NHEPCMLW;)V")
	private void method341(@OriginalArg(1) Class3_Sub1_Sub3 arg0) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method274();
				if (local13 == 0) {
					if (this.anInt481 == 0) {
						this.anInt481 = 1;
						this.anIntArray126 = new int[1];
						this.anIntArray126[0] = -1;
						this.anIntArray127 = new int[1];
						this.anIntArray127[0] = -1;
						this.anIntArray128 = new int[1];
						this.anIntArray128[0] = -1;
					}
					if (this.anInt487 == -1) {
						if (this.anIntArray129 == null) {
							this.anInt487 = 0;
						} else {
							this.anInt487 = 2;
						}
					}
					if (this.anInt488 == -1) {
						if (this.anIntArray129 != null) {
							this.anInt488 = 2;
							return;
						}
						this.anInt488 = 0;
						return;
					}
					return;
				}
				@Pc(40) int local40;
				if (local13 == 1) {
					this.anInt481 = arg0.method274();
					this.anIntArray126 = new int[this.anInt481];
					this.anIntArray127 = new int[this.anInt481];
					this.anIntArray128 = new int[this.anInt481];
					for (local40 = 0; local40 < this.anInt481; local40++) {
						this.anIntArray126[local40] = arg0.method276();
						this.anIntArray127[local40] = arg0.method276();
						if (this.anIntArray127[local40] == 65535) {
							this.anIntArray127[local40] = -1;
						}
						this.anIntArray128[local40] = arg0.method276();
					}
				} else if (local13 == 2) {
					this.anInt482 = arg0.method276();
				} else if (local13 == 3) {
					local40 = arg0.method274();
					this.anIntArray129 = new int[local40 + 1];
					for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
						this.anIntArray129[local101] = arg0.method274();
					}
					this.anIntArray129[local40] = 9999999;
				} else if (local13 == 4) {
					this.aBoolean133 = true;
				} else if (local13 == 5) {
					this.anInt483 = arg0.method274();
				} else if (local13 == 6) {
					this.anInt484 = arg0.method276();
				} else if (local13 == 7) {
					this.anInt485 = arg0.method276();
				} else if (local13 == 8) {
					this.anInt486 = arg0.method274();
				} else if (local13 == 9) {
					this.anInt487 = arg0.method274();
				} else if (local13 == 10) {
					this.anInt488 = arg0.method274();
				} else if (local13 == 11) {
					this.anInt489 = arg0.method274();
				} else if (local13 == 12) {
					this.anInt490 = arg0.method279();
				} else {
					System.out.println("Error unrecognised seq config code: " + local13);
				}
			}
		} catch (@Pc(275) RuntimeException local275) {
			signlink.reporterror("84228, " + false + ", " + arg0 + ", " + local275.toString());
			throw new RuntimeException();
		}
	}
}
