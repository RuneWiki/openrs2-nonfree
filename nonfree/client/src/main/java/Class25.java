import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NSTEZBJV")
public final class Class25 {

	@OriginalMember(owner = "client!NSTEZBJV", name = "a", descriptor = "Z")
	private static boolean aBoolean110;

	@OriginalMember(owner = "client!NSTEZBJV", name = "b", descriptor = "I")
	private static int anInt319;

	@OriginalMember(owner = "client!NSTEZBJV", name = "c", descriptor = "[Lclient!NSTEZBJV;")
	public static Class25[] aClass25Array1;

	@OriginalMember(owner = "client!NSTEZBJV", name = "d", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!NSTEZBJV", name = "e", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!NSTEZBJV", name = "f", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!NSTEZBJV", name = "g", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!NSTEZBJV", name = "j", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!NSTEZBJV", name = "h", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!NSTEZBJV", name = "i", descriptor = "I")
	private int anInt323 = -1;

	@OriginalMember(owner = "client!NSTEZBJV", name = "k", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!NSTEZBJV", name = "a", descriptor = "(ZLclient!AKPFVPPG;)V")
	public static void method317(@OriginalArg(1) Class2 arg0) {
		try {
			@Pc(8) Class4_Sub1_Sub3 local8 = new Class4_Sub1_Sub3(arg0.method7("varbit.dat", null), (byte) 3);
			anInt319 = local8.method104();
			if (aClass25Array1 == null) {
				aClass25Array1 = new Class25[anInt319];
			}
			for (@Pc(26) int local26 = 0; local26 < anInt319; local26++) {
				if (aClass25Array1[local26] == null) {
					aClass25Array1[local26] = new Class25();
				}
				aClass25Array1[local26].method318(local26, local8);
				if (aClass25Array1[local26].aBoolean111) {
					Class14.aClass14Array1[aClass25Array1[local26].anInt320].aBoolean61 = true;
				}
			}
			if (local8.anInt101 != local8.aByteArray3.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("29294, " + true + ", " + arg0 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NSTEZBJV", name = "<init>", descriptor = "()V")
	private Class25() {
	}

	@OriginalMember(owner = "client!NSTEZBJV", name = "a", descriptor = "(ILclient!FTMSICIZ;I)V")
	private void method318(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg1.method102();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt320 = arg1.method104();
					this.anInt321 = arg1.method102();
					this.anInt322 = arg1.method102();
				} else if (local8 == 10) {
					this.aString4 = arg1.method109();
				} else if (local8 == 2) {
					this.aBoolean111 = true;
				} else if (local8 == 3) {
					this.anInt323 = arg1.method107();
				} else if (local8 == 4) {
					this.anInt324 = arg1.method107();
				} else if (local8 == 5) {
					this.aBoolean112 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("61735, " + arg0 + ", " + arg1 + ", " + -5817 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
