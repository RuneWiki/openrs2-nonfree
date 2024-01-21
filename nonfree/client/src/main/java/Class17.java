import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JYNIYSOU")
public final class Class17 {

	@OriginalMember(owner = "client!JYNIYSOU", name = "a", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!JYNIYSOU", name = "b", descriptor = "I")
	private static int anInt293;

	@OriginalMember(owner = "client!JYNIYSOU", name = "c", descriptor = "[Lclient!JYNIYSOU;")
	public static Class17[] aClass17Array1;

	@OriginalMember(owner = "client!JYNIYSOU", name = "d", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!JYNIYSOU", name = "e", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!JYNIYSOU", name = "f", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!JYNIYSOU", name = "g", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!JYNIYSOU", name = "j", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!JYNIYSOU", name = "h", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!JYNIYSOU", name = "i", descriptor = "I")
	private int anInt297 = -1;

	@OriginalMember(owner = "client!JYNIYSOU", name = "k", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!JYNIYSOU", name = "a", descriptor = "(Lclient!RSPRYUFS;I)V")
	public static void method159(@OriginalArg(0) Class37 arg0) {
		try {
			@Pc(8) Class6_Sub2_Sub3 local8 = new Class6_Sub2_Sub3(-587, arg0.method358("varbit.dat", null));
			anInt293 = local8.method264();
			if (aClass17Array1 == null) {
				aClass17Array1 = new Class17[anInt293];
			}
			for (@Pc(18) int local18 = 0; local18 < anInt293; local18++) {
				if (aClass17Array1[local18] == null) {
					aClass17Array1[local18] = new Class17();
				}
				aClass17Array1[local18].method160(local8, local18);
				if (aClass17Array1[local18].aBoolean87) {
					Class14.aClass14Array1[aClass17Array1[local18].anInt294].aBoolean67 = true;
				}
			}
			if (local8.anInt404 != local8.aByteArray9.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("73556, " + arg0 + ", " + -332 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JYNIYSOU", name = "<init>", descriptor = "()V")
	private Class17() {
	}

	@OriginalMember(owner = "client!JYNIYSOU", name = "a", descriptor = "(Lclient!NQUAUMDT;II)V")
	private void method160(@OriginalArg(0) Class6_Sub2_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(8) int local8 = arg0.method262();
				if (local8 == 0) {
					return;
				}
				if (local8 == 1) {
					this.anInt294 = arg0.method264();
					this.anInt295 = arg0.method262();
					this.anInt296 = arg0.method262();
				} else if (local8 == 10) {
					this.aString5 = arg0.method269();
				} else if (local8 == 2) {
					this.aBoolean87 = true;
				} else if (local8 == 3) {
					this.anInt297 = arg0.method267();
				} else if (local8 == 4) {
					this.anInt298 = arg0.method267();
				} else if (local8 == 5) {
					this.aBoolean88 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local8);
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("49300, " + arg0 + ", " + 29883 + ", " + arg1 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}
}
