import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GDBQCAOA")
public final class Class13 {

	@OriginalMember(owner = "client!GDBQCAOA", name = "a", descriptor = "I")
	private static int anInt240;

	@OriginalMember(owner = "client!GDBQCAOA", name = "b", descriptor = "[Lclient!GDBQCAOA;")
	public static Class13[] aClass13Array1;

	@OriginalMember(owner = "client!GDBQCAOA", name = "c", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!GDBQCAOA", name = "d", descriptor = "I")
	public int anInt241;

	@OriginalMember(owner = "client!GDBQCAOA", name = "e", descriptor = "I")
	public int anInt242;

	@OriginalMember(owner = "client!GDBQCAOA", name = "f", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!GDBQCAOA", name = "i", descriptor = "I")
	private int anInt245;

	@OriginalMember(owner = "client!GDBQCAOA", name = "g", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!GDBQCAOA", name = "h", descriptor = "I")
	private int anInt244 = -1;

	@OriginalMember(owner = "client!GDBQCAOA", name = "j", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!GDBQCAOA", name = "a", descriptor = "(ILclient!QDHHNYHL;)V")
	public static void method181(@OriginalArg(1) Class32 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub4 local8 = new Class4_Sub1_Sub4(5, arg0.method426("varbit.dat", null));
			anInt240 = local8.method357();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt240];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt240; local21++) {
				if (aClass13Array1[local21] == null) {
					aClass13Array1[local21] = new Class13();
				}
				aClass13Array1[local21].method182(local8, local21);
				if (aClass13Array1[local21].aBoolean74) {
					Class48.aClass48Array1[aClass13Array1[local21].anInt241].aBoolean208 = true;
				}
			}
			if (local8.anInt506 != local8.aByteArray10.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("14029, " + 0 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GDBQCAOA", name = "<init>", descriptor = "()V")
	private Class13() {
	}

	@OriginalMember(owner = "client!GDBQCAOA", name = "a", descriptor = "(BLclient!PGNBHFUF;I)V")
	private void method182(@OriginalArg(1) Class4_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method355();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt241 = arg0.method357();
					this.anInt242 = arg0.method355();
					this.anInt243 = arg0.method355();
				} else if (local8 == 10) {
					this.aString5 = arg0.method362();
				} else if (local8 == 2) {
					this.aBoolean74 = true;
				} else if (local8 == 3) {
					this.anInt244 = arg0.method360();
				} else if (local8 == 4) {
					this.anInt245 = arg0.method360();
				} else if (local8 == 5) {
					this.aBoolean75 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("94991, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
