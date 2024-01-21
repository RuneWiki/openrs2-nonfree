import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SXYSOXTR")
public final class Class38 {

	@OriginalMember(owner = "client!SXYSOXTR", name = "a", descriptor = "I")
	private static int anInt675;

	@OriginalMember(owner = "client!SXYSOXTR", name = "b", descriptor = "I")
	private static int anInt676;

	@OriginalMember(owner = "client!SXYSOXTR", name = "c", descriptor = "[Lclient!SXYSOXTR;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!SXYSOXTR", name = "d", descriptor = "Ljava/lang/String;")
	private String aString14;

	@OriginalMember(owner = "client!SXYSOXTR", name = "e", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!SXYSOXTR", name = "f", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!SXYSOXTR", name = "g", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!SXYSOXTR", name = "j", descriptor = "I")
	private int anInt681;

	@OriginalMember(owner = "client!SXYSOXTR", name = "h", descriptor = "Z")
	private boolean aBoolean171 = false;

	@OriginalMember(owner = "client!SXYSOXTR", name = "i", descriptor = "I")
	private int anInt680 = -1;

	@OriginalMember(owner = "client!SXYSOXTR", name = "a", descriptor = "(ILclient!XTGLDHGX;)V")
	public static void method463(@OriginalArg(1) Class44 arg0) {
		try {
			@Pc(12) Class1_Sub1_Sub3 local12 = new Class1_Sub1_Sub3(arg0.method484("varbit.dat", null), 891);
			anInt676 = local12.method270();
			if (aClass38Array1 == null) {
				aClass38Array1 = new Class38[anInt676];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt676; local22++) {
				if (aClass38Array1[local22] == null) {
					aClass38Array1[local22] = new Class38();
				}
				aClass38Array1[local22].method464(local12, local22);
				if (aClass38Array1[local22].aBoolean171) {
					Class42.aClass42Array1[aClass38Array1[local22].anInt677].aBoolean178 = true;
				}
			}
			if (local12.anInt468 != local12.aByteArray10.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("95423, " + 0 + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXYSOXTR", name = "<init>", descriptor = "()V")
	private Class38() {
	}

	@OriginalMember(owner = "client!SXYSOXTR", name = "a", descriptor = "(Lclient!MBMGIXGO;ZI)V")
	private void method464(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(7) int local7 = arg0.method268();
				if (local7 == 0) {
					return;
				}
				if (local7 == 1) {
					this.anInt677 = arg0.method270();
					this.anInt678 = arg0.method268();
					this.anInt679 = arg0.method268();
				} else if (local7 == 10) {
					this.aString14 = arg0.method275();
				} else if (local7 == 2) {
					this.aBoolean171 = true;
				} else if (local7 == 3) {
					this.anInt680 = arg0.method273();
				} else if (local7 == 4) {
					this.anInt681 = arg0.method273();
				} else {
					System.out.println("Error unrecognised config code: " + local7);
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("71039, " + arg0 + ", " + false + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
