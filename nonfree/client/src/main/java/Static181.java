import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!j", name = "A", descriptor = "[I")
	public static final int[] anIntArray317 = new int[4];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!tl;)Lclient!ts;")
	public static Class43_Sub3 method2907(@OriginalArg(1) Class4_Sub30 arg0) {
		return new Class43_Sub3(arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4889(), arg0.method4887(), arg0.method4864());
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ch;")
	public static RuntimeException_Sub1 method2908(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString16 = local12.aString16 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
	public static void method2910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class4_Sub1_Sub8 local14 = Static416.method5456(arg1, 14);
		local14.method2762();
		local14.anInt3611 = arg0;
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)Lclient!rt;")
	public static Class4_Sub1_Sub16 method2911() {
		return Static137.aClass4_Sub1_Sub16_2;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method2912(@OriginalArg(0) Class30 arg0) {
		arg0.pa(0, 0, Static87.anInt1948, 350);
		arg0.NA(0, 0, Static87.anInt1948, 350, Static278.anInt7279 << 24 | 0x332277, 1);
		@Pc(31) int local31 = 350 / Static394.anInt6802;
		@Pc(43) int local43;
		if (Static130.anInt2598 > 0) {
			local43 = 346 - Static394.anInt6802 - 4;
			@Pc(54) int local54 = local43 * local31 / (local31 + Static130.anInt2598 - 1);
			@Pc(56) int local56 = 4;
			if (Static130.anInt2598 > 1) {
				local56 = (local43 - local54) * (-Static331.anInt5817 + -1 + Static130.anInt2598) / (Static130.anInt2598 - 1) + 4;
			}
			arg0.NA(Static87.anInt1948 - 16, local56, 12, local54, Static278.anInt7279 << 24 | 0x332277, 2);
			for (@Pc(93) int local93 = Static331.anInt5817; Static331.anInt5817 + local31 > local93 && Static130.anInt2598 > local93; local93++) {
				@Pc(102) String[] local102 = Static220.method4275('\b', Static76.aStringArray10[local93]);
				@Pc(111) int local111 = (Static87.anInt1948 - 8 - 16) / local102.length;
				for (@Pc(113) int local113 = 0; local113 < local102.length; local113++) {
					@Pc(122) int local122 = local111 * local113 + 8;
					arg0.pa(local122, 0, local111 + local122 - 8, 350);
					Static390.aClass105_7.method5600(local102[local113], -1, local122, -16777216, 350 - Static389.anInt6750 - Static254.aClass215_7.anInt6376 - Static394.anInt6802 * (-Static331.anInt5817 + local93) - 2);
				}
			}
		}
		arg0.pa(0, 0, Static87.anInt1948, 350);
		arg0.method4658(0, -1, 350 - Static389.anInt6750, Static87.anInt1948);
		Static245.aClass105_4.method5600("--> " + Static127.aString23, -1, 10, -16777216, 350 - Static266.aClass215_8.anInt6376 - 1);
		local43 = -1;
		if (Static175.anInt3261 % 30 > 15) {
			local43 = 16777215;
		}
		arg0.method4677(local43, 12, 350 - Static266.aClass215_8.anInt6376 - 11, 10 - -Static266.aClass215_8.method4976("--> " + Static127.aString23.substring(0, Static10.anInt350)));
	}
}
