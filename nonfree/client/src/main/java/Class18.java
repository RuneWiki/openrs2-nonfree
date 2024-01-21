import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HUPZKMWH")
public final class Class18 {

	@OriginalMember(owner = "client!HUPZKMWH", name = "c", descriptor = "I")
	private static int anInt272;

	@OriginalMember(owner = "client!HUPZKMWH", name = "d", descriptor = "[Lclient!HUPZKMWH;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!HUPZKMWH", name = "a", descriptor = "Z")
	private static boolean aBoolean88 = true;

	@OriginalMember(owner = "client!HUPZKMWH", name = "b", descriptor = "I")
	private static int anInt271 = -12;

	@OriginalMember(owner = "client!HUPZKMWH", name = "e", descriptor = "Ljava/lang/String;")
	private String aString5;

	@OriginalMember(owner = "client!HUPZKMWH", name = "f", descriptor = "I")
	public int anInt273;

	@OriginalMember(owner = "client!HUPZKMWH", name = "g", descriptor = "I")
	public int anInt274;

	@OriginalMember(owner = "client!HUPZKMWH", name = "h", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!HUPZKMWH", name = "k", descriptor = "I")
	private int anInt277;

	@OriginalMember(owner = "client!HUPZKMWH", name = "i", descriptor = "Z")
	private boolean aBoolean89 = false;

	@OriginalMember(owner = "client!HUPZKMWH", name = "j", descriptor = "I")
	private int anInt276 = -1;

	@OriginalMember(owner = "client!HUPZKMWH", name = "l", descriptor = "Z")
	private boolean aBoolean90 = true;

	@OriginalMember(owner = "client!HUPZKMWH", name = "a", descriptor = "(ZLclient!MJLXHQTQ;)V")
	public static void method131(@OriginalArg(1) Class31 arg0) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg0.method227("varbit.dat", null), -82);
			anInt272 = local8.method439();
			if (aClass18Array1 == null) {
				aClass18Array1 = new Class18[anInt272];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt272; local22++) {
				if (aClass18Array1[local22] == null) {
					aClass18Array1[local22] = new Class18();
				}
				aClass18Array1[local22].method132(local22, local8);
				if (aClass18Array1[local22].aBoolean89) {
					Class25.aClass25Array1[aClass18Array1[local22].anInt273].aBoolean117 = true;
				}
			}
			if (local8.anInt755 != local8.aByteArray20.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("19296, " + true + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HUPZKMWH", name = "<init>", descriptor = "()V")
	private Class18() {
	}

	@OriginalMember(owner = "client!HUPZKMWH", name = "a", descriptor = "(IILclient!XGRGMPUQ;)V")
	private void method132(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg1.method437();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt273 = arg1.method439();
					this.anInt274 = arg1.method437();
					this.anInt275 = arg1.method437();
				} else if (local7 == 10) {
					this.aString5 = arg1.method444();
				} else if (local7 == 2) {
					this.aBoolean89 = true;
				} else if (local7 == 3) {
					this.anInt276 = arg1.method442();
				} else if (local7 == 4) {
					this.anInt277 = arg1.method442();
				} else if (local7 == 5) {
					this.aBoolean90 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("37343, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
