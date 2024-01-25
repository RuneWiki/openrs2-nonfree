import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Lclient!cq;")
	public static Class43 aClass43_5 = null;

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IBII)I")
	public static int method2512(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + (((arg1 & 0xFF) >> 2 << 10) + (arg0 >> 5 << 7));
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)Lclient!jq;")
	public static Class3_Sub26 method2516() {
		if (Static144.aClass243_33 == null || Static55.aClass40_1 == null) {
			return null;
		}
		for (@Pc(19) Class3_Sub26 local19 = (Class3_Sub26) Static55.aClass40_1.method1126(); local19 != null; local19 = (Class3_Sub26) Static55.aClass40_1.method1126()) {
			@Pc(26) Class90 local26 = Static144.aClass171_4.method3940(local19.anInt3892);
			if (local26 != null && local26.aBoolean239 && local26.method2034(Static144.anInterface9_2)) {
				return local19;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2520(@OriginalArg(0) String arg0) {
		Static301.method1894(0, 0, arg0, "", "");
	}
}
