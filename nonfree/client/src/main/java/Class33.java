import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RGMKWKCG")
public final class Class33 {

	@OriginalMember(owner = "client!RGMKWKCG", name = "a", descriptor = "I")
	private static int anInt520;

	@OriginalMember(owner = "client!RGMKWKCG", name = "b", descriptor = "I")
	private static int anInt521;

	@OriginalMember(owner = "client!RGMKWKCG", name = "c", descriptor = "[Lclient!RGMKWKCG;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!RGMKWKCG", name = "d", descriptor = "I")
	private static int anInt522;

	@OriginalMember(owner = "client!RGMKWKCG", name = "e", descriptor = "[I")
	private static int[] anIntArray157;

	@OriginalMember(owner = "client!RGMKWKCG", name = "f", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!RGMKWKCG", name = "g", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!RGMKWKCG", name = "h", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!RGMKWKCG", name = "k", descriptor = "I")
	public int anInt525;

	@OriginalMember(owner = "client!RGMKWKCG", name = "m", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!RGMKWKCG", name = "n", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!RGMKWKCG", name = "i", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!RGMKWKCG", name = "j", descriptor = "Z")
	private boolean aBoolean136 = true;

	@OriginalMember(owner = "client!RGMKWKCG", name = "l", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!RGMKWKCG", name = "o", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!RGMKWKCG", name = "p", descriptor = "I")
	private int anInt528 = -1;

	@OriginalMember(owner = "client!RGMKWKCG", name = "q", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!RGMKWKCG", name = "a", descriptor = "(BLclient!JUPFHAZZ;)V")
	public static void method426(@OriginalArg(1) Class21 arg0) {
		try {
			@Pc(8) Class2_Sub1_Sub4 local8 = new Class2_Sub1_Sub4(859, arg0.method275("varp.dat", null));
			anInt522 = 0;
			anInt521 = local8.method494();
			if (aClass33Array1 == null) {
				aClass33Array1 = new Class33[anInt521];
			}
			if (anIntArray157 == null) {
				anIntArray157 = new int[anInt521];
			}
			for (@Pc(30) int local30 = 0; local30 < anInt521; local30++) {
				if (aClass33Array1[local30] == null) {
					aClass33Array1[local30] = new Class33();
				}
				aClass33Array1[local30].method427(local8, local30);
			}
			if (local8.anInt672 != local8.aByteArray17.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("32571, " + -3 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGMKWKCG", name = "<init>", descriptor = "()V")
	private Class33() {
	}

	@OriginalMember(owner = "client!RGMKWKCG", name = "a", descriptor = "(Lclient!TKPFKOXP;II)V")
	private void method427(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method492();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt523 = arg0.method492();
				} else if (local13 == 2) {
					this.anInt524 = arg0.method492();
				} else if (local13 == 3) {
					this.aBoolean135 = true;
					anIntArray157[anInt522++] = arg1;
				} else if (local13 == 4) {
					this.aBoolean136 = false;
				} else if (local13 == 5) {
					this.anInt525 = arg0.method494();
				} else if (local13 == 6) {
					this.aBoolean137 = true;
				} else if (local13 == 7) {
					this.anInt526 = arg0.method497();
				} else if (local13 == 8) {
					this.anInt527 = 1;
					this.aBoolean138 = true;
				} else if (local13 == 10) {
					this.aString9 = arg0.method499();
				} else if (local13 == 11) {
					this.aBoolean138 = true;
				} else if (local13 == 12) {
					this.anInt528 = arg0.method497();
				} else if (local13 == 13) {
					this.anInt527 = 2;
					this.aBoolean138 = true;
				} else if (local13 == 14) {
					this.aBoolean139 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("55106, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}
}
