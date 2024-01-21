import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ee", name = "S", descriptor = "Lclient!db;")
	public static Class2_Sub2_Sub2_Sub1_Sub1 aClass2_Sub2_Sub2_Sub1_Sub1_1;

	@OriginalMember(owner = "client!ee", name = "ab", descriptor = "Lclient!oh;")
	public static Class11_Sub1 aClass11_Sub1_8;

	@OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lclient!vg;")
	public static Class85 aClass85_2 = null;

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "I")
	public static int anInt1028 = 0;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "Lclient!lf;")
	public static Class49 aClass49_519 = Static32.method683("(Z");

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "I")
	public static int anInt1030 = 0;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public static void method818() {
		aClass11_Sub1_8 = null;
		aClass49_519 = null;
		aClass85_2 = null;
		aClass2_Sub2_Sub2_Sub1_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ja;)V")
	public static void method819(@OriginalArg(1) Class2_Sub13 arg0) {
		if (Static29.aClass37_1 != null) {
			try {
				Static29.aClass37_1.method1158(0L);
				Static29.aClass37_1.method1155(arg0.aByteArray49, arg0.anInt3940, 24);
			} catch (@Pc(25) Exception local25) {
			}
		}
		arg0.anInt3940 += 24;
	}
}
