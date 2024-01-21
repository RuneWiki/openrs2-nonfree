import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LZWYDZNA")
public final class Class24 {

	@OriginalMember(owner = "client!LZWYDZNA", name = "c", descriptor = "I")
	private static int anInt422;

	@OriginalMember(owner = "client!LZWYDZNA", name = "d", descriptor = "[Lclient!LZWYDZNA;")
	public static Class24[] aClass24Array1;

	@OriginalMember(owner = "client!LZWYDZNA", name = "e", descriptor = "I")
	private static int anInt423;

	@OriginalMember(owner = "client!LZWYDZNA", name = "f", descriptor = "[I")
	private static int[] anIntArray115;

	@OriginalMember(owner = "client!LZWYDZNA", name = "g", descriptor = "Ljava/lang/String;")
	private String aString11;

	@OriginalMember(owner = "client!LZWYDZNA", name = "h", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!LZWYDZNA", name = "i", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!LZWYDZNA", name = "l", descriptor = "I")
	public int anInt426;

	@OriginalMember(owner = "client!LZWYDZNA", name = "n", descriptor = "I")
	private int anInt427;

	@OriginalMember(owner = "client!LZWYDZNA", name = "o", descriptor = "I")
	private int anInt428;

	@OriginalMember(owner = "client!LZWYDZNA", name = "b", descriptor = "I")
	private int anInt421 = 368;

	@OriginalMember(owner = "client!LZWYDZNA", name = "j", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!LZWYDZNA", name = "k", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!LZWYDZNA", name = "m", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!LZWYDZNA", name = "p", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!LZWYDZNA", name = "q", descriptor = "I")
	private int anInt429 = -1;

	@OriginalMember(owner = "client!LZWYDZNA", name = "r", descriptor = "Z")
	private boolean aBoolean106 = true;

	static {
		aBoolean101 = true;
	}

	@OriginalMember(owner = "client!LZWYDZNA", name = "a", descriptor = "(ILclient!INOFEYKQ;)V")
	public static void method258(@OriginalArg(1) Class14 arg0) {
		try {
			@Pc(10) Class3_Sub1_Sub3 local10 = new Class3_Sub1_Sub3((byte) -103, arg0.method202("varp.dat", (byte[]) null));
			anInt423 = 0;
			anInt422 = local10.method276();
			if (aClass24Array1 == null) {
				aClass24Array1 = new Class24[anInt422];
			}
			if (anIntArray115 == null) {
				anIntArray115 = new int[anInt422];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt422; local27++) {
				if (aClass24Array1[local27] == null) {
					aClass24Array1[local27] = new Class24();
				}
				aClass24Array1[local27].method259(local10, local27);
			}
			if (local10.anInt441 != local10.aByteArray5.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("28383, " + -351 + ", " + arg0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LZWYDZNA", name = "<init>", descriptor = "()V")
	private Class24() {
	}

	@OriginalMember(owner = "client!LZWYDZNA", name = "a", descriptor = "(ILclient!NHEPCMLW;I)V")
	private void method259(@OriginalArg(1) Class3_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg0.method274();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt424 = arg0.method274();
				} else if (local9 == 2) {
					this.anInt425 = arg0.method274();
				} else if (local9 == 3) {
					this.aBoolean102 = true;
					anIntArray115[anInt423++] = arg1;
				} else if (local9 == 4) {
					this.aBoolean103 = false;
				} else if (local9 == 5) {
					this.anInt426 = arg0.method276();
				} else if (local9 == 6) {
					this.aBoolean104 = true;
				} else if (local9 == 7) {
					this.anInt427 = arg0.method279();
				} else if (local9 == 8) {
					this.anInt428 = 1;
					this.aBoolean105 = true;
				} else if (local9 == 10) {
					this.aString11 = arg0.method281();
				} else if (local9 == 11) {
					this.aBoolean105 = true;
				} else if (local9 == 12) {
					this.anInt429 = arg0.method279();
				} else if (local9 == 13) {
					this.anInt428 = 2;
					this.aBoolean105 = true;
				} else if (local9 == 14) {
					this.aBoolean106 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("4281, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
