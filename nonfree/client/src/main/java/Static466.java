import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Lclient!ca;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_156 = new Class126(1, -2);

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
	public static int anInt7968 = 0;

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "[[B")
	public static final byte[][] aByteArrayArray19 = new byte[1000][];

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method6675(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class3_Sub44 local17 = Static275.method5689(Static305.aClass376_76, Static540.aClass282_4);
			local17.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(arg0));
			local17.aClass3_Sub17_Sub2_3.method4878(arg0);
			Static616.method8089(local17);
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)[Lclient!qn;")
	public static Class295[] method6677() {
		return new Class295[] { Static562.aClass295_4, Static344.aClass295_3, Static365.aClass295_2 };
	}
}
