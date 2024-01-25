import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!dc", name = "M", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "[I")
	public static final int[] anIntArray423 = new int[14];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)Z")
	public static boolean method3792(@OriginalArg(1) int arg0) {
		return arg0 == 6 || arg0 == 7 || arg0 == 8;
	}

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "(I)V")
	public static void method3794() {
		@Pc(12) Class177 local12 = null;
		try {
			@Pc(18) Class157 local18 = Static466.aClass102_4.method2388(true, "2");
			while (local18.anInt4742 == 0) {
				Static209.method3565(1L);
			}
			if (local18.anInt4742 == 1) {
				local12 = (Class177) local18.anObject12;
				@Pc(48) Class1_Sub6 local48 = new Class1_Sub6(Static329.anInt5976 * 6 + 3);
				local48.method3937(1);
				local48.method3919(Static329.anInt5976);
				for (@Pc(58) int local58 = 0; local58 < Static42.anIntArray119.length; local58++) {
					if (Static303.aBooleanArray39[local58]) {
						local48.method3919(local58);
						local48.method3948(Static42.anIntArray119[local58]);
					}
				}
				local12.method4408(local48.anInt4555, local48.aByteArray66, 0);
			}
		} catch (@Pc(91) Exception local91) {
		}
		try {
			if (local12 != null) {
				local12.method4411();
			}
		} catch (@Pc(100) Exception local100) {
		}
		Static226.aLong178 = Static60.method1119();
		Static47.aBoolean51 = false;
	}
}
