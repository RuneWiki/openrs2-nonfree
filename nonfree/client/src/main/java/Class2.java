import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AIRUOZLB")
public final class Class2 {

	@OriginalMember(owner = "client!AIRUOZLB", name = "a", descriptor = "I")
	private static int anInt2;

	@OriginalMember(owner = "client!AIRUOZLB", name = "b", descriptor = "[Lclient!AIRUOZLB;")
	public static Class2[] aClass2Array1;

	@OriginalMember(owner = "client!AIRUOZLB", name = "c", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!AIRUOZLB", name = "d", descriptor = "I")
	public int anInt3;

	@OriginalMember(owner = "client!AIRUOZLB", name = "e", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!AIRUOZLB", name = "f", descriptor = "I")
	public int anInt5;

	@OriginalMember(owner = "client!AIRUOZLB", name = "i", descriptor = "I")
	private int anInt7;

	@OriginalMember(owner = "client!AIRUOZLB", name = "g", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!AIRUOZLB", name = "h", descriptor = "I")
	private int anInt6 = -1;

	@OriginalMember(owner = "client!AIRUOZLB", name = "a", descriptor = "(ILclient!HRXSNEYZ;)V")
	public static void method4(@OriginalArg(1) Class15 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub3 local8 = new Class1_Sub1_Sub3(arg0.method220("varbit.dat", null), 8);
			anInt2 = local8.method240();
			if (aClass2Array1 == null) {
				aClass2Array1 = new Class2[anInt2];
			}
			for (@Pc(21) int local21 = 0; local21 < anInt2; local21++) {
				if (aClass2Array1[local21] == null) {
					aClass2Array1[local21] = new Class2();
				}
				aClass2Array1[local21].method5(local21, local8);
				if (aClass2Array1[local21].aBoolean3) {
					Class12.aClass12Array1[aClass2Array1[local21].anInt3].aBoolean47 = true;
				}
			}
			if (local8.anInt352 != local8.aByteArray3.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("39518, " + 309 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AIRUOZLB", name = "<init>", descriptor = "()V")
	private Class2() {
	}

	@OriginalMember(owner = "client!AIRUOZLB", name = "a", descriptor = "(IILclient!JHKSAGUC;)V")
	private void method5(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub3 arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg1.method238();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt3 = arg1.method240();
					this.anInt4 = arg1.method238();
					this.anInt5 = arg1.method238();
				} else if (local13 == 10) {
					this.aString1 = arg1.method245();
				} else if (local13 == 2) {
					this.aBoolean3 = true;
				} else if (local13 == 3) {
					this.anInt6 = arg1.method243();
				} else if (local13 == 4) {
					this.anInt7 = arg1.method243();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("85583, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
