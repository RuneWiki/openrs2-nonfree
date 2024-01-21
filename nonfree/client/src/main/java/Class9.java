import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GQWQHTHS")
public final class Class9 {

	@OriginalMember(owner = "client!GQWQHTHS", name = "b", descriptor = "I")
	private static int anInt87;

	@OriginalMember(owner = "client!GQWQHTHS", name = "c", descriptor = "[Lclient!GQWQHTHS;")
	public static Class9[] aClass9Array1;

	@OriginalMember(owner = "client!GQWQHTHS", name = "a", descriptor = "I")
	private int anInt86;

	@OriginalMember(owner = "client!GQWQHTHS", name = "d", descriptor = "Ljava/lang/String;")
	private String aString2;

	@OriginalMember(owner = "client!GQWQHTHS", name = "e", descriptor = "I")
	public int anInt88;

	@OriginalMember(owner = "client!GQWQHTHS", name = "f", descriptor = "I")
	public int anInt89;

	@OriginalMember(owner = "client!GQWQHTHS", name = "g", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!GQWQHTHS", name = "j", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!GQWQHTHS", name = "h", descriptor = "Z")
	private boolean aBoolean23 = false;

	@OriginalMember(owner = "client!GQWQHTHS", name = "i", descriptor = "I")
	private int anInt91 = -1;

	@OriginalMember(owner = "client!GQWQHTHS", name = "k", descriptor = "Z")
	private boolean aBoolean24 = true;

	@OriginalMember(owner = "client!GQWQHTHS", name = "a", descriptor = "(Lclient!WEMOPWVJ;I)V")
	public static void method51(@OriginalArg(0) Class43 arg0) {
		try {
			@Pc(8) Class1_Sub1_Sub4 local8 = new Class1_Sub1_Sub4(arg0.method515("varbit.dat", null), true);
			anInt87 = local8.method407();
			if (aClass9Array1 == null) {
				aClass9Array1 = new Class9[anInt87];
			}
			for (@Pc(22) int local22 = 0; local22 < anInt87; local22++) {
				if (aClass9Array1[local22] == null) {
					aClass9Array1[local22] = new Class9();
				}
				aClass9Array1[local22].method52(local22, local8);
				if (aClass9Array1[local22].aBoolean23) {
					Class17.aClass17Array1[aClass9Array1[local22].anInt88].aBoolean50 = true;
				}
			}
			if (local8.anInt624 != local8.aByteArray16.length) {
				System.out.println("varbit load mismatch");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("56812, " + arg0 + ", " + 24414 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQWQHTHS", name = "<init>", descriptor = "()V")
	private Class9() {
	}

	@OriginalMember(owner = "client!GQWQHTHS", name = "a", descriptor = "(IZLclient!SVWJKJVI;)V")
	private void method52(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub4 arg1) {
		try {
			while (true) {
				@Pc(9) int local9 = arg1.method405();
				if (local9 == 0) {
					return;
				}
				if (local9 == 1) {
					this.anInt88 = arg1.method407();
					this.anInt89 = arg1.method405();
					this.anInt90 = arg1.method405();
				} else if (local9 == 10) {
					this.aString2 = arg1.method412();
				} else if (local9 == 2) {
					this.aBoolean23 = true;
				} else if (local9 == 3) {
					this.anInt91 = arg1.method410();
				} else if (local9 == 4) {
					this.anInt92 = arg1.method410();
				} else if (local9 == 5) {
					this.aBoolean24 = false;
				} else {
					System.out.println("Error unrecognised config code: " + local9);
				}
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("92305, " + arg0 + ", " + false + ", " + arg1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}
}
