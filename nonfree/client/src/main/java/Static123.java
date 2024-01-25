import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!dma", name = "c", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_37 = new Class225(8, 0);

	@OriginalMember(owner = "client!dma", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method1822(@OriginalArg(1) String arg0) {
		if (Static56.aClass143Array1 == null) {
			return;
		}
		@Pc(14) Class221 local14 = Static87.method1292();
		@Pc(20) Class2_Sub33 local20 = Static592.method8154(Static660.aClass349_147, local14.aClass48_1);
		local20.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(arg0));
		local20.aClass2_Sub20_Sub2_1.method8541(arg0);
		local14.method5173(local20);
	}
}
