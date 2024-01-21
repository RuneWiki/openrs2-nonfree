import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!USQYPEQB")
public final class Class36 {

	@OriginalMember(owner = "client!USQYPEQB", name = "c", descriptor = "I")
	private static int anInt701;

	@OriginalMember(owner = "client!USQYPEQB", name = "d", descriptor = "[Lclient!USQYPEQB;")
	public static Class36[] aClass36Array1;

	@OriginalMember(owner = "client!USQYPEQB", name = "e", descriptor = "Ljava/lang/String;")
	private String aString15;

	@OriginalMember(owner = "client!USQYPEQB", name = "f", descriptor = "I")
	public int anInt702;

	@OriginalMember(owner = "client!USQYPEQB", name = "g", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!USQYPEQB", name = "h", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!USQYPEQB", name = "k", descriptor = "I")
	private int anInt706;

	@OriginalMember(owner = "client!USQYPEQB", name = "a", descriptor = "I")
	private int anInt700 = -585;

	@OriginalMember(owner = "client!USQYPEQB", name = "b", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!USQYPEQB", name = "i", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!USQYPEQB", name = "j", descriptor = "I")
	private int anInt705 = -1;

	@OriginalMember(owner = "client!USQYPEQB", name = "l", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!USQYPEQB", name = "a", descriptor = "(ZLclient!VSQMPWOM;)V")
	public static void method482(@OriginalArg(1) Class39 arg0) {
		try {
			@Pc(11) Class2_Sub1_Sub2 local11 = new Class2_Sub1_Sub2(arg0.method489("varbit.dat", null), -990);
			anInt701 = local11.method81();
			if (aClass36Array1 == null) {
				aClass36Array1 = new Class36[anInt701];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt701; local21++) {
				if (aClass36Array1[local21] == null) {
					aClass36Array1[local21] = new Class36();
				}
				aClass36Array1[local21].method483(local21, local11);
				if (aClass36Array1[local21].aBoolean173) {
					Class23.aClass23Array1[aClass36Array1[local21].anInt702].aBoolean113 = true;
				}
			}
			if (local11.anInt123 != local11.aByteArray1.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("84815, " + true + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!USQYPEQB", name = "<init>", descriptor = "()V")
	private Class36() {
	}

	@OriginalMember(owner = "client!USQYPEQB", name = "a", descriptor = "(ILclient!BFQIDHPO;I)V")
	private void method483(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub2 arg1) {
		try {
			while (true) {
				@Pc(16) int local16 = arg1.method79();
				if (local16 == 0) {
					return;
				}
				if (local16 == 1) {
					this.anInt702 = arg1.method81();
					this.anInt703 = arg1.method79();
					this.anInt704 = arg1.method79();
				} else if (local16 == 10) {
					this.aString15 = arg1.method86();
				} else if (local16 == 2) {
					this.aBoolean173 = true;
				} else if (local16 == 3) {
					this.anInt705 = arg1.method84();
				} else if (local16 == 4) {
					this.anInt706 = arg1.method84();
				} else if (local16 == 5) {
					this.aBoolean174 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local16);
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("54200, " + arg0 + ", " + arg1 + ", " + -585 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}
}
