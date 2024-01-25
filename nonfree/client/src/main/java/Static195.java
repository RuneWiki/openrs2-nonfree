import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!iaa", name = "I", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_43 = new Class243(57, 4);

	@OriginalMember(owner = "client!iaa", name = "J", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_44 = new Class243(20, 6);

	@OriginalMember(owner = "client!iaa", name = "K", descriptor = "[[B")
	public static final byte[][] aByteArrayArray14 = new byte[1000][];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZZ)V")
	public static void method3163(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class2_Sub46 local10 = (Class2_Sub46) Static160.aClass249_18.method6527(); local10 != null; local10 = (Class2_Sub46) Static160.aClass249_18.method6525()) {
			if (local10.aClass2_Sub12_Sub3_4 != null) {
				Static288.aClass2_Sub12_Sub2_5.method2088(local10.aClass2_Sub12_Sub3_4);
				local10.aClass2_Sub12_Sub3_4 = null;
			}
			if (local10.aClass2_Sub12_Sub3_3 != null) {
				Static288.aClass2_Sub12_Sub2_5.method2088(local10.aClass2_Sub12_Sub3_3);
				local10.aClass2_Sub12_Sub3_3 = null;
			}
			local10.method7802();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class2_Sub46 local54 = (Class2_Sub46) Static286.aClass249_25.method6527(); local54 != null; local54 = (Class2_Sub46) Static286.aClass249_25.method6525()) {
			if (local54.aClass2_Sub12_Sub3_4 != null) {
				Static288.aClass2_Sub12_Sub2_5.method2088(local54.aClass2_Sub12_Sub3_4);
				local54.aClass2_Sub12_Sub3_4 = null;
			}
			local54.method7802();
		}
		for (@Pc(81) Class2_Sub46 local81 = (Class2_Sub46) Static92.aClass127_16.method3203(); local81 != null; local81 = (Class2_Sub46) Static92.aClass127_16.method3212()) {
			if (local81.aClass2_Sub12_Sub3_4 != null) {
				Static288.aClass2_Sub12_Sub2_5.method2088(local81.aClass2_Sub12_Sub3_4);
				local81.aClass2_Sub12_Sub3_4 = null;
			}
			local81.method7802();
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZIIZI)Lclient!br;")
	public static Class2_Sub9 method3168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.anInt832 = arg3;
		local7.anInt833 = arg0;
		Static110.aClass127_21.method3213(local7, (long) arg1);
		Static229.method3611(arg0);
		@Pc(26) Class310 local26 = Static111.method2143(arg1);
		if (local26 != null) {
			Static273.method4342(local26);
		}
		if (Static126.aClass310_16 != null) {
			Static273.method4342(Static126.aClass310_16);
			Static126.aClass310_16 = null;
		}
		Static113.method2229();
		if (local26 != null) {
			Static113.method2228(local26, !arg2);
		}
		if (!arg2) {
			Static258.method4039(arg0);
		}
		if (!arg2 && Static387.anInt7341 != -1) {
			Static363.method1117(1, Static387.anInt7341);
		}
		return local7;
	}
}
