import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MUUMFTDK")
public final class Class23 {

	@OriginalMember(owner = "client!MUUMFTDK", name = "a", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!MUUMFTDK", name = "b", descriptor = "I")
	private static int anInt389;

	@OriginalMember(owner = "client!MUUMFTDK", name = "c", descriptor = "[Lclient!MUUMFTDK;")
	public static Class23[] aClass23Array1;

	@OriginalMember(owner = "client!MUUMFTDK", name = "d", descriptor = "I")
	private static int anInt390;

	@OriginalMember(owner = "client!MUUMFTDK", name = "e", descriptor = "[I")
	private static int[] anIntArray131;

	@OriginalMember(owner = "client!MUUMFTDK", name = "f", descriptor = "Ljava/lang/String;")
	private String aString8;

	@OriginalMember(owner = "client!MUUMFTDK", name = "g", descriptor = "I")
	private int anInt391;

	@OriginalMember(owner = "client!MUUMFTDK", name = "h", descriptor = "I")
	private int anInt392;

	@OriginalMember(owner = "client!MUUMFTDK", name = "k", descriptor = "I")
	public int anInt393;

	@OriginalMember(owner = "client!MUUMFTDK", name = "m", descriptor = "I")
	private int anInt394;

	@OriginalMember(owner = "client!MUUMFTDK", name = "n", descriptor = "I")
	private int anInt395;

	@OriginalMember(owner = "client!MUUMFTDK", name = "i", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!MUUMFTDK", name = "j", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!MUUMFTDK", name = "l", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!MUUMFTDK", name = "o", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!MUUMFTDK", name = "p", descriptor = "I")
	private int anInt396 = -1;

	@OriginalMember(owner = "client!MUUMFTDK", name = "q", descriptor = "Z")
	private boolean aBoolean91 = true;

	@OriginalMember(owner = "client!MUUMFTDK", name = "a", descriptor = "(BLclient!SXKKBWPU;)V")
	public static void method232(@OriginalArg(1) Class35 arg0) {
		try {
			@Pc(8) Class8_Sub1_Sub3 local8 = new Class8_Sub1_Sub3(arg0.method364("varp.dat", null), -631);
			anInt390 = 0;
			anInt389 = local8.method408();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt389];
			}
			if (anIntArray131 == null) {
				anIntArray131 = new int[anInt389];
			}
			for (@Pc(25) int local25 = 0; local25 < anInt389; local25++) {
				if (aClass23Array1[local25] == null) {
					aClass23Array1[local25] = new Class23();
				}
				aClass23Array1[local25].method233(local25, local8);
			}
			if (local8.anInt620 != local8.aByteArray13.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("66663, " + -109 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MUUMFTDK", name = "<init>", descriptor = "()V")
	private Class23() {
	}

	@OriginalMember(owner = "client!MUUMFTDK", name = "a", descriptor = "(IILclient!TQYMAXSO;)V")
	private void method233(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method406();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt391 = arg1.method406();
				} else if (local13 == 2) {
					this.anInt392 = arg1.method406();
				} else if (local13 == 3) {
					this.aBoolean87 = true;
					anIntArray131[anInt390++] = arg0;
				} else if (local13 == 4) {
					this.aBoolean88 = false;
				} else if (local13 == 5) {
					this.anInt393 = arg1.method408();
				} else if (local13 == 6) {
					this.aBoolean89 = true;
				} else if (local13 == 7) {
					this.anInt394 = arg1.method411();
				} else if (local13 == 8) {
					this.anInt395 = 1;
					this.aBoolean90 = true;
				} else if (local13 == 10) {
					this.aString8 = arg1.method413();
				} else if (local13 == 11) {
					this.aBoolean90 = true;
				} else if (local13 == 12) {
					this.anInt396 = arg1.method411();
				} else if (local13 == 13) {
					this.anInt395 = 2;
					this.aBoolean90 = true;
				} else if (local13 == 14) {
					this.aBoolean91 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("37020, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}
}
