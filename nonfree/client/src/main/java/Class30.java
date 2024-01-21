import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NYAYDXBO")
public final class Class30 {

	@OriginalMember(owner = "client!NYAYDXBO", name = "a", descriptor = "I")
	private static int anInt484;

	@OriginalMember(owner = "client!NYAYDXBO", name = "b", descriptor = "[Lclient!NYAYDXBO;")
	public static Class30[] aClass30Array1;

	@OriginalMember(owner = "client!NYAYDXBO", name = "c", descriptor = "I")
	private static int anInt485;

	@OriginalMember(owner = "client!NYAYDXBO", name = "d", descriptor = "[I")
	private static int[] anIntArray135;

	@OriginalMember(owner = "client!NYAYDXBO", name = "e", descriptor = "Ljava/lang/String;")
	private String aString6;

	@OriginalMember(owner = "client!NYAYDXBO", name = "f", descriptor = "I")
	private int anInt486;

	@OriginalMember(owner = "client!NYAYDXBO", name = "g", descriptor = "I")
	private int anInt487;

	@OriginalMember(owner = "client!NYAYDXBO", name = "j", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!NYAYDXBO", name = "l", descriptor = "I")
	private int anInt489;

	@OriginalMember(owner = "client!NYAYDXBO", name = "m", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!NYAYDXBO", name = "h", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!NYAYDXBO", name = "i", descriptor = "Z")
	private boolean aBoolean98 = true;

	@OriginalMember(owner = "client!NYAYDXBO", name = "k", descriptor = "Z")
	private boolean aBoolean99 = false;

	@OriginalMember(owner = "client!NYAYDXBO", name = "n", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!NYAYDXBO", name = "o", descriptor = "I")
	private int anInt491 = -1;

	@OriginalMember(owner = "client!NYAYDXBO", name = "a", descriptor = "(ILclient!QKFGLETG;)V")
	public static void method295(@OriginalArg(1) Class36 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("varp.dat", null));
			anInt485 = 0;
			anInt484 = local8.method500();
			if (aClass30Array1 == null) {
				aClass30Array1 = new Class30[anInt484];
			}
			if (anIntArray135 == null) {
				anIntArray135 = new int[anInt484];
			}
			for (@Pc(28) int local28 = 0; local28 < anInt484; local28++) {
				if (aClass30Array1[local28] == null) {
					aClass30Array1[local28] = new Class30();
				}
				aClass30Array1[local28].method296(local8, local28, 857);
			}
			if (local8.anInt806 != local8.aByteArray19.length) {
				System.out.println("varptype load mismatch");
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("17015, " + 0 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NYAYDXBO", name = "<init>", descriptor = "()V")
	private Class30() {
	}

	@OriginalMember(owner = "client!NYAYDXBO", name = "a", descriptor = "(Lclient!XJCNBMKS;II)V")
	private void method296(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(5) boolean local5 = false;
			while (true) {
				@Pc(8) int local8 = arg0.method498();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt486 = arg0.method498();
				} else if (local8 == 2) {
					this.anInt487 = arg0.method498();
				} else if (local8 == 3) {
					this.aBoolean97 = true;
					anIntArray135[anInt485++] = arg1;
				} else if (local8 == 4) {
					this.aBoolean98 = false;
				} else if (local8 == 5) {
					this.anInt488 = arg0.method500();
				} else if (local8 == 6) {
					this.aBoolean99 = true;
				} else if (local8 == 7) {
					this.anInt489 = arg0.method503();
				} else if (local8 == 8) {
					this.anInt490 = 1;
					this.aBoolean100 = true;
				} else if (local8 == 10) {
					this.aString6 = arg0.method505();
				} else if (local8 == 11) {
					this.aBoolean100 = true;
				} else if (local8 == 12) {
					this.anInt491 = arg0.method503();
				} else if (local8 == 13) {
					this.anInt490 = 2;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("59552, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}
}
