import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dr", name = "E", descriptor = "[[Lclient!ee;")
	public static Class57[][] aClass57ArrayArray1;

	@OriginalMember(owner = "client!dr", name = "F", descriptor = "J")
	public static long aLong53;

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_45 = new Class163(10, 3);

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
	public static int anInt1390 = 0;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "Lclient!wi;")
	public static final Class268 aClass268_13 = new Class268(20);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!qq;[[BB)V")
	public static void method1398(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) byte[][] arg1) {
		@Pc(8) int local8 = Static127.aByteArrayArray11.length;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(35) int local35 = (Static127.anIntArray115[local17] >> 8) * 64 - Static59.anInt1127;
				@Pc(45) int local45 = (Static127.anIntArray115[local17] & 0xFF) * 64 - Static49.anInt873;
				Static44.method856();
				arg0.method4791(local35, Static413.aClass167_11, local23, Static250.aClass128Array1, local45);
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)V")
	public static void method1402(@OriginalArg(0) int arg0) {
		Static235.anInt4023 = -1;
		Static110.anInt1953 = 3;
		Static285.anInt5015 = 100;
		Static130.anInt2354 = arg0;
	}
}
