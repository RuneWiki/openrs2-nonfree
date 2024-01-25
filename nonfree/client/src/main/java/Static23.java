import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
	public static int anInt526;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "[Lclient!lq;")
	public static Class123[] aClass123Array1;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString16;

	@OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
	public static int anInt530;

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "[I")
	public static final int[] anIntArray78 = new int[50];

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
	public static void method586() {
		for (@Pc(6) Class15_Sub5 local6 = (Class15_Sub5) Static293.aClass175_6.method4669(); local6 != null; local6 = (Class15_Sub5) Static293.aClass175_6.method4673()) {
			local6.method2865();
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)V")
	public static void method587(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class145 local7 = Static49.method1111(arg1);
		@Pc(10) int local10 = local7.anInt4270;
		@Pc(13) int local13 = local7.anInt4271;
		@Pc(16) int local16 = local7.anInt4268;
		@Pc(23) int local23 = Class176.anIntArray651[local16 - local13];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static267.method4671(local10, local23 & arg0 << local13 | ~local23 & Static197.anIntArray793[local10]);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!qj;I)V")
	public static void method588(@OriginalArg(0) Class165 arg0) {
		Static189.aClass165_58 = arg0;
		Static189.aClass165_58.method4499(35);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([BB)Lclient!vf;")
	public static Class1_Sub1_Sub20 method589(@OriginalArg(0) byte[] arg0) {
		@Pc(9) Class1_Sub1_Sub20 local9 = new Class1_Sub1_Sub20();
		@Pc(14) Class1_Sub7 local14 = new Class1_Sub7(arg0);
		local14.anInt3368 = local14.aByteArray58.length - 2;
		@Pc(25) int local25 = local14.method3115();
		@Pc(36) int local36 = local14.aByteArray58.length - local25 - 2 - 12;
		local14.anInt3368 = local36;
		@Pc(43) int local43 = local14.method3125();
		local9.anInt6267 = local14.method3115();
		local9.anInt6273 = local14.method3115();
		local9.anInt6269 = local14.method3115();
		local9.anInt6266 = local14.method3115();
		@Pc(74) int local74 = local14.method3141();
		@Pc(85) int local85;
		@Pc(91) int local91;
		if (local74 > 0) {
			local9.aClass26Array1 = new Class26[local74];
			for (local85 = 0; local85 < local74; local85++) {
				local91 = local14.method3115();
				@Pc(98) Class26 local98 = new Class26(Static339.method5608(local91));
				local9.aClass26Array1[local85] = local98;
				while (local91-- > 0) {
					@Pc(109) int local109 = local14.method3125();
					@Pc(113) int local113 = local14.method3125();
					local98.method877((long) local109, new Class1_Sub37(local113));
				}
			}
		}
		local14.anInt3368 = 0;
		local9.aString251 = local14.method3114();
		local9.anIntArray783 = new int[local43];
		local9.anIntArray782 = new int[local43];
		local9.aStringArray46 = new String[local43];
		local85 = 0;
		while (local14.anInt3368 < local36) {
			local91 = local14.method3115();
			if (local91 == 3) {
				local9.aStringArray46[local85] = local14.method3134().intern();
			} else if (local91 >= 100 || local91 == 21 || local91 == 38 || local91 == 39) {
				local9.anIntArray783[local85] = local14.method3141();
			} else {
				local9.anIntArray783[local85] = local14.method3125();
			}
			local9.anIntArray782[local85++] = local91;
		}
		return local9;
	}
}
