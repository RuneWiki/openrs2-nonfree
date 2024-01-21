import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BCUFZZFO")
public final class Class4 {

	@OriginalMember(owner = "client!BCUFZZFO", name = "a", descriptor = "I")
	private static int anInt15;

	@OriginalMember(owner = "client!BCUFZZFO", name = "b", descriptor = "[Lclient!BCUFZZFO;")
	public static Class4[] aClass4Array1;

	@OriginalMember(owner = "client!BCUFZZFO", name = "c", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!BCUFZZFO", name = "d", descriptor = "I")
	public int anInt16;

	@OriginalMember(owner = "client!BCUFZZFO", name = "e", descriptor = "I")
	public int anInt17;

	@OriginalMember(owner = "client!BCUFZZFO", name = "f", descriptor = "I")
	public int anInt18;

	@OriginalMember(owner = "client!BCUFZZFO", name = "i", descriptor = "I")
	private int anInt20;

	@OriginalMember(owner = "client!BCUFZZFO", name = "g", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!BCUFZZFO", name = "h", descriptor = "I")
	private int anInt19 = -1;

	@OriginalMember(owner = "client!BCUFZZFO", name = "j", descriptor = "Z")
	private boolean aBoolean3 = true;

	@OriginalMember(owner = "client!BCUFZZFO", name = "a", descriptor = "(ILclient!TXPLZUUI;)V")
	public static void method6(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1) {
		try {
			@Pc(8) Class5_Sub1_Sub4 local8 = new Class5_Sub1_Sub4(arg1.method464("varbit.dat", null), 0);
			if (arg0 == 3) {
				anInt15 = local8.method242();
				if (aClass4Array1 == null) {
					aClass4Array1 = new Class4[anInt15];
				}
				for (@Pc(22) int local22 = 0; local22 < anInt15; local22++) {
					if (aClass4Array1[local22] == null) {
						aClass4Array1[local22] = new Class4();
					}
					aClass4Array1[local22].method7(local22, local8);
					if (aClass4Array1[local22].aBoolean2) {
						Class48.aClass48Array1[aClass4Array1[local22].anInt16].aBoolean192 = true;
					}
				}
				if (local8.anInt429 != local8.aByteArray16.length) {
					System.out.println("varbit load mismatch");
				}
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("48274, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BCUFZZFO", name = "<init>", descriptor = "()V")
	private Class4() {
	}

	@OriginalMember(owner = "client!BCUFZZFO", name = "a", descriptor = "(ILclient!PKHWFJLM;I)V")
	private void method7(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method240();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt16 = arg1.method242();
					this.anInt17 = arg1.method240();
					this.anInt18 = arg1.method240();
				} else if (local13 == 10) {
					this.aString1 = arg1.method247();
				} else if (local13 == 2) {
					this.aBoolean2 = true;
				} else if (local13 == 3) {
					this.anInt19 = arg1.method245();
				} else if (local13 == 4) {
					this.anInt20 = arg1.method245();
				} else if (local13 == 5) {
					this.aBoolean3 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("61159, " + arg0 + ", " + arg1 + ", " + -376 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}
}
