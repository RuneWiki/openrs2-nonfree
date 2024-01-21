import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UDCHKCCJ")
public final class Class40 {

	@OriginalMember(owner = "client!UDCHKCCJ", name = "a", descriptor = "Z")
	private static boolean aBoolean178;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "b", descriptor = "I")
	private static int anInt677;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "c", descriptor = "[Lclient!UDCHKCCJ;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "d", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "e", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "f", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "g", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "j", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "h", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "i", descriptor = "I")
	private int anInt681 = -1;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "k", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!UDCHKCCJ", name = "a", descriptor = "(BLclient!JUPFHAZZ;)V")
	public static void method531(@OriginalArg(1) Class21 arg0) {
		try {
			@Pc(17) Class2_Sub1_Sub4 local17 = new Class2_Sub1_Sub4(859, arg0.method275("varbit.dat", null));
			anInt677 = local17.method494();
			if (aClass40Array1 == null) {
				aClass40Array1 = new Class40[anInt677];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt677; local27++) {
				if (aClass40Array1[local27] == null) {
					aClass40Array1[local27] = new Class40();
				}
				aClass40Array1[local27].method532(local17, local27);
				if (aClass40Array1[local27].aBoolean179) {
					Class33.aClass33Array1[aClass40Array1[local27].anInt678].aBoolean138 = true;
				}
			}
			if (local17.anInt672 != local17.aByteArray17.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("5840, " + -3 + ", " + arg0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UDCHKCCJ", name = "<init>", descriptor = "()V")
	private Class40() {
	}

	@OriginalMember(owner = "client!UDCHKCCJ", name = "a", descriptor = "(Lclient!TKPFKOXP;II)V")
	private void method532(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method492();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt678 = arg0.method494();
					this.anInt679 = arg0.method492();
					this.anInt680 = arg0.method492();
				} else if (local13 == 10) {
					this.aString14 = arg0.method499();
				} else if (local13 == 2) {
					this.aBoolean179 = true;
				} else if (local13 == 3) {
					this.anInt681 = arg0.method497();
				} else if (local13 == 4) {
					this.anInt682 = arg0.method497();
				} else if (local13 == 5) {
					this.aBoolean180 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("48570, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
