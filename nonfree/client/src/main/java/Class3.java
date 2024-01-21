import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BUYMNSFH")
public final class Class3 {

	@OriginalMember(owner = "client!BUYMNSFH", name = "a", descriptor = "I")
	private static int anInt16;

	@OriginalMember(owner = "client!BUYMNSFH", name = "b", descriptor = "[Lclient!BUYMNSFH;")
	public static Class3[] aClass3Array1;

	@OriginalMember(owner = "client!BUYMNSFH", name = "c", descriptor = "Ljava/lang/String;")
	private String aString1;

	@OriginalMember(owner = "client!BUYMNSFH", name = "d", descriptor = "I")
	public int anInt17;

	@OriginalMember(owner = "client!BUYMNSFH", name = "e", descriptor = "I")
	public int anInt18;

	@OriginalMember(owner = "client!BUYMNSFH", name = "f", descriptor = "I")
	public int anInt19;

	@OriginalMember(owner = "client!BUYMNSFH", name = "i", descriptor = "I")
	private int anInt21;

	@OriginalMember(owner = "client!BUYMNSFH", name = "g", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!BUYMNSFH", name = "h", descriptor = "I")
	private int anInt20 = -1;

	@OriginalMember(owner = "client!BUYMNSFH", name = "a", descriptor = "(Lclient!MNPBQFWE;B)V")
	public static void method38(@OriginalArg(0) Class27 arg0) {
		try {
			@Pc(10) Class1_Sub1_Sub2 local10 = new Class1_Sub1_Sub2(false, arg0.method340("varbit.dat", null));
			anInt16 = local10.method24();
			if (aClass3Array1 == null) {
				aClass3Array1 = new Class3[anInt16];
			}
			for (@Pc(27) int local27 = 0; local27 < anInt16; local27++) {
				if (aClass3Array1[local27] == null) {
					aClass3Array1[local27] = new Class3();
				}
				aClass3Array1[local27].method39(local10, local27);
				if (aClass3Array1[local27].aBoolean13) {
					Class17.aClass17Array1[aClass3Array1[local27].anInt17].aBoolean92 = true;
				}
			}
			if (local10.anInt10 != local10.aByteArray1.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("30826, " + arg0 + ", " + 0 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BUYMNSFH", name = "<init>", descriptor = "()V")
	private Class3() {
	}

	@OriginalMember(owner = "client!BUYMNSFH", name = "a", descriptor = "(Lclient!BJPWOXRJ;II)V")
	private void method39(@OriginalArg(0) Class1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		try {
			while (true) {
				@Pc(13) int local13 = arg0.method22();
				if (local13 == 0) {
					return;
				}
				if (local13 == 1) {
					this.anInt17 = arg0.method24();
					this.anInt18 = arg0.method22();
					this.anInt19 = arg0.method22();
				} else if (local13 == 10) {
					this.aString1 = arg0.method29();
				} else if (local13 == 2) {
					this.aBoolean13 = true;
				} else if (local13 == 3) {
					this.anInt20 = arg0.method27();
				} else if (local13 == 4) {
					this.anInt21 = arg0.method27();
				} else {
					System.out.println("Error unrecognised config code: " + local13);
				}
			}
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("82911, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}
}
