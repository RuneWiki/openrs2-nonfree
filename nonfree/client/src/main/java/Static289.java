import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public static int anInt5058 = -2;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Lclient!jo;")
	public static Class132 method4074() {
		try {
			return (Class132) Class.forName("Class132_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(13) Throwable local13) {
			return null;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!wi;)I")
	public static int method4076(@OriginalArg(1) Class10_Sub45 arg0) {
		@Pc(12) String local12 = Static3.method3431(arg0);
		@Pc(14) int[] local14 = null;
		if (Static252.method3680(arg0.anInt7505)) {
			local14 = Static313.aClass272_2.method6068((int) arg0.aLong261).anIntArray131;
		} else if (arg0.anInt7506 != -1) {
			local14 = Static313.aClass272_2.method6068(arg0.anInt7506).anIntArray131;
		} else if (Static114.method1979(arg0.anInt7505)) {
			@Pc(91) Class10_Sub26 local91 = (Class10_Sub26) Static424.aClass167_33.method3709((long) arg0.aLong261);
			if (local91 != null) {
				@Pc(96) Class24_Sub3_Sub2_Sub1 local96 = local91.aClass24_Sub3_Sub2_Sub1_2;
				@Pc(99) Class222 local99 = local96.aClass222_1;
				if (local99.anIntArray613 != null) {
					local99 = local99.method4938(Static329.aClass201_9);
				}
				if (local99 != null) {
					local14 = local99.anIntArray615;
				}
			}
		} else if (Static380.method5132(arg0.anInt7505)) {
			@Pc(56) Class126 local56;
			if (arg0.anInt7505 == 1003) {
				local56 = Static342.aClass237_4.method5212((int) arg0.aLong261);
			} else {
				local56 = Static342.aClass237_4.method5212((int) (arg0.aLong261 >>> 32 & 0x7FFFFFFFL));
			}
			if (local56.anIntArray380 != null) {
				local56 = local56.method3009(Static329.aClass201_9);
			}
			if (local56 != null) {
				local14 = local56.anIntArray384;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static87.method1638(local14);
		}
		@Pc(139) int local139 = Static450.aClass79_10.method1980(Static271.aClass80Array14, local12);
		if (arg0.aBoolean494) {
			local139 += Static40.aClass80_3.YA() + 4;
		}
		return local139;
	}
}
