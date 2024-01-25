import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
	public static int anInt2479;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
	public static int anInt2476 = 2;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IB)Lclient!sk;")
	public static Class188 method2405(@OriginalArg(0) int arg0) {
		@Pc(5) Class140 local5 = Static344.aClass140_169;
		@Pc(14) Class188 local14;
		synchronized (Static344.aClass140_169) {
			local14 = (Class188) Static344.aClass140_169.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(36) byte[] local36 = Static89.aClass165_32.method4508(Static55.method1205(arg0), Static16.method375(arg0));
		local14 = new Class188();
		local14.anInt5535 = arg0;
		if (local36 != null) {
			local14.method4905(new Class1_Sub7(local36));
		}
		local14.method4909();
		if (!Static96.aBoolean582 && local14.aBoolean474) {
			local14.aStringArray38 = null;
			local14.anIntArray695 = null;
		}
		if (local14.aBoolean480) {
			local14.aBoolean473 = false;
			local14.anInt5529 = 0;
		}
		@Pc(82) Class140 local82 = Static344.aClass140_169;
		synchronized (Static344.aClass140_169) {
			Static344.aClass140_169.method3817((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZIIIZIZILjava/lang/String;JLjava/lang/String;)V")
	public static void method2407(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) long arg8, @OriginalArg(10) String arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class1_Sub7 local30 = new Class1_Sub7(128);
		local30.method3108(10);
		local30.method3128((arg0 ? 4 : 0) | (arg3 ? 2 : 0) | (arg5 ? 1 : 0));
		local30.method3121(arg8);
		local30.method3098(local8[0]);
		local30.method3124(arg9);
		local30.method3098(local8[1]);
		local30.method3128(Static61.anInt1330);
		local30.method3108(arg4);
		local30.method3108(arg2);
		local30.method3098(local8[2]);
		local30.method3128(arg1);
		local30.method3128(arg6);
		local30.method3098(local8[3]);
		local30.method3092(Static82.aBigInteger1, Static152.aBigInteger2);
		@Pc(122) Class1_Sub7 local122 = new Class1_Sub7(350);
		local122.method3124(arg7);
		@Pc(137) int local137 = 8 - Static203.method3794(arg7) % 8;
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			local122.method3108((int) (Math.random() * 255.0D));
		}
		local122.method3111(local8);
		Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
		Static248.aClass1_Sub7_Sub1_2.method3108(22);
		Static248.aClass1_Sub7_Sub1_2.method3128(local122.anInt3368 + local30.anInt3368 + 2);
		Static248.aClass1_Sub7_Sub1_2.method3128(563);
		Static248.aClass1_Sub7_Sub1_2.method3146(local30.aByteArray58, local30.anInt3368);
		Static248.aClass1_Sub7_Sub1_2.method3146(local122.aByteArray58, local122.anInt3368);
		Static76.anInt1538 = 1;
		Static202.anInt4091 = -3;
		Static350.anInt6501 = 0;
		Static183.anInt3821 = 0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(BI)Lclient!e;")
	public static Class45 method2408(@OriginalArg(1) int arg0) {
		@Pc(5) Class140 local5 = Static326.aClass140_165;
		@Pc(14) Class45 local14;
		synchronized (Static326.aClass140_165) {
			local14 = (Class45) Static326.aClass140_165.method3816((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static108.aClass165_44.method4508(arg0, 32);
		local14 = new Class45();
		if (local30 != null) {
			local14.method1431(new Class1_Sub7(local30));
		}
		local14.method1428();
		@Pc(53) Class140 local53 = Static326.aClass140_165;
		synchronized (Static326.aClass140_165) {
			Static326.aClass140_165.method3817((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
	public static void method2409() {
		@Pc(1) Class140 local1 = Static50.aClass140_29;
		synchronized (Static50.aClass140_29) {
			Static50.aClass140_29.method3813();
		}
		local1 = Static234.aClass140_121;
		synchronized (Static234.aClass140_121) {
			Static234.aClass140_121.method3813();
		}
	}
}
