import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)Lclient!jg;")
	public static Class2_Sub33 method5017() {
		if (Static331.aClass271_65 == null || Static567.aClass370_1 == null) {
			return null;
		}
		for (@Pc(14) Class2_Sub33 local14 = (Class2_Sub33) Static567.aClass370_1.method9305(); local14 != null; local14 = (Class2_Sub33) Static567.aClass370_1.method9305()) {
			@Pc(25) Class218 local25 = Static331.aClass5_4.method94(local14.anInt5215);
			if (local25 != null && local25.aBoolean506 && local25.method6003(Static331.anInterface15_2)) {
				return local14;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5018(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static630.method7149("%0a", "\n", arg0));
	}
}
