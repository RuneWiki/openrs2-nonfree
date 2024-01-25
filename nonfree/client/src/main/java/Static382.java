import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "[Lclient!pba;")
	public static Class13_Sub9[] aClass13_Sub9Array1;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "Lclient!iw;")
	public static Class160 aClass160_1;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(II)Lclient!ria;")
	public static Class302 method5115(@OriginalArg(1) int arg0) {
		@Pc(15) Class302 local15 = (Class302) Static33.aClass32_9.method630((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static640.aClass380_136.method8620(0, arg0);
		local15 = new Class302();
		if (local25 != null) {
			local15.method6852(new Class2_Sub22(local25), arg0);
		}
		Static33.aClass32_9.method629(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ck;")
	public static RuntimeException_Sub1 method5116(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString14 = local12.aString14 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
	public static void method5118() {
		Static568.method7795((long) Static262.anInt5597, Static192.aClass95_4);
		if (Static38.anInt777 != -1) {
			Static564.method7730(Static38.anInt777);
		}
		for (@Pc(26) int local26 = 0; local26 < Static385.anInt6044; local26++) {
			if (Static69.aBooleanArray25[local26]) {
				Static498.aBooleanArray144[local26] = true;
			}
			Static556.aBooleanArray182[local26] = Static69.aBooleanArray25[local26];
			Static69.aBooleanArray25[local26] = false;
		}
		Static170.anInt9509 = Static262.anInt5597;
		if (Static38.anInt777 != -1) {
			Static385.anInt6044 = 0;
			Static23.method426();
		}
		Static192.aClass95_4.la();
		Static170.method7975(Static192.aClass95_4);
		@Pc(67) int local67 = Static522.method7266();
		if (local67 == -1) {
			local67 = Static144.anInt2622;
		}
		if (local67 == -1) {
			local67 = Static473.anInt7592;
		}
		Static224.method3106(local67);
		Static544.anInt9305 = 0;
	}
}
