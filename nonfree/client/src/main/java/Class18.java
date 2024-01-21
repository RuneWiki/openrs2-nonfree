import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JFFNRVFW")
public final class Class18 {

	@OriginalMember(owner = "client!JFFNRVFW", name = "a", descriptor = "I")
	private static int anInt317;

	@OriginalMember(owner = "client!JFFNRVFW", name = "c", descriptor = "I")
	private static int anInt319;

	@OriginalMember(owner = "client!JFFNRVFW", name = "d", descriptor = "[Lclient!JFFNRVFW;")
	public static Class18[] aClass18Array1;

	@OriginalMember(owner = "client!JFFNRVFW", name = "e", descriptor = "Ljava/lang/String;")
	private String aString9;

	@OriginalMember(owner = "client!JFFNRVFW", name = "f", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!JFFNRVFW", name = "g", descriptor = "I")
	public int anInt321;

	@OriginalMember(owner = "client!JFFNRVFW", name = "h", descriptor = "I")
	public int anInt322;

	@OriginalMember(owner = "client!JFFNRVFW", name = "k", descriptor = "I")
	private int anInt324;

	@OriginalMember(owner = "client!JFFNRVFW", name = "b", descriptor = "I")
	private int anInt318 = 635;

	@OriginalMember(owner = "client!JFFNRVFW", name = "i", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!JFFNRVFW", name = "j", descriptor = "I")
	private int anInt323 = -1;

	@OriginalMember(owner = "client!JFFNRVFW", name = "l", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!JFFNRVFW", name = "a", descriptor = "(ZLclient!FXNTEMPE;)V")
	public static void method190(@OriginalArg(1) Class13 arg0) {
		try {
			@Pc(12) Class2_Sub1_Sub4 local12 = new Class2_Sub1_Sub4(arg0.method117("varbit.dat", null), -46859);
			anInt319 = local12.method342();
			if (aClass18Array1 == null) {
				aClass18Array1 = new Class18[anInt319];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt319; local22++) {
				if (aClass18Array1[local22] == null) {
					aClass18Array1[local22] = new Class18();
				}
				aClass18Array1[local22].method191(local22, local12);
				if (aClass18Array1[local22].aBoolean81) {
					Class42.aClass42Array1[aClass18Array1[local22].anInt320].aBoolean177 = true;
				}
			}
			if (local12.anInt556 != local12.aByteArray17.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("83454, " + true + ", " + arg0 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JFFNRVFW", name = "<init>", descriptor = "()V")
	private Class18() {
	}

	@OriginalMember(owner = "client!JFFNRVFW", name = "a", descriptor = "(IILclient!RSWRPCHR;)V")
	private void method191(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method340();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt320 = arg1.method342();
					this.anInt321 = arg1.method340();
					this.anInt322 = arg1.method340();
				} else if (local13 == 10) {
					this.aString9 = arg1.method347();
				} else if (local13 == 2) {
					this.aBoolean81 = true;
				} else if (local13 == 3) {
					this.anInt323 = arg1.method345();
				} else if (local13 == 4) {
					this.anInt324 = arg1.method345();
				} else if (local13 == 5) {
					this.aBoolean82 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("57681, " + arg0 + ", " + 635 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
