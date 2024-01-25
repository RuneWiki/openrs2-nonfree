import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
	public static int anInt5059;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_78 = new Class349(75, 18);

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "[I")
	public static final int[] anIntArray361 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public static void method4596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class2_Sub6_Sub12 local9 = Static636.method8647(7, (long) arg0);
		local9.method6239();
		local9.anInt6936 = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method4597(@OriginalArg(1) String arg0) {
		System.out.println("Error: " + Static353.method9848("%0a", arg0, "\n"));
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)V")
	public static void method4598() {
		@Pc(5) Class85 local5 = Static650.aClass85_66;
		synchronized (Static650.aClass85_66) {
			Static650.aClass85_66.method1742(5);
		}
		local5 = Static124.aClass85_15;
		synchronized (Static124.aClass85_15) {
			Static124.aClass85_15.method1742(5);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!fka;IZZ)V")
	public static void method4599(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt3020;
		@Pc(12) int local12 = (int) arg0.aLong352;
		arg0.method9872();
		if (arg2) {
			Static84.method1246(local8);
		}
		Static449.method6569(local8);
		@Pc(36) Class273 local36 = Static417.method6111(local12);
		if (local36 != null) {
			Static371.method5299(local36);
		}
		Static513.method7268();
		if (!arg1 && Static542.anInt8552 != -1) {
			Static627.method8472(Static542.anInt8552, 1);
		}
		@Pc(65) Class129 local65 = new Class129(Static463.aClass218_36);
		for (@Pc(70) Class2_Sub26 local70 = (Class2_Sub26) local65.method2682(); local70 != null; local70 = (Class2_Sub26) local65.method2681()) {
			if (!local70.method9871()) {
				local70 = (Class2_Sub26) local65.method2682();
				if (local70 == null) {
					return;
				}
			}
			if (local70.anInt3019 == 3) {
				@Pc(97) int local97 = (int) local70.aLong352;
				if (local97 >>> 16 == local8) {
					method4599(local70, arg1, true);
				}
			}
		}
	}
}
