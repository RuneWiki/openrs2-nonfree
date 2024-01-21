import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!ue", name = "B", descriptor = "J")
	public static long aLong134;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
	public static int anInt4253 = 0;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Lclient!ih;")
	public static final Class46 aClass46_12 = new Class46(260);

	@OriginalMember(owner = "client!ue", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1218 = Static81.method1507("RuneScape wird geladen )2 bitte warten)3)3)3");

	@OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
	public static int anInt4266 = 0;

	@OriginalMember(owner = "client!ue", name = "A", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1219 = Static81.method1507("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ue", name = "C", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1220 = Static81.method1507("<col=ff7000>");

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1221 = aClass24_1219;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIB)I")
	public static int method3266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(10) int local10 = arg0;
			arg0 = arg4;
			arg4 = local10;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg3;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg4;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public static void method3270() {
		try {
			if (Static91.anInt2111 == 1) {
				@Pc(10) int local10 = Static107.aClass1_Sub3_Sub4_1.method2864();
				if (local10 > 0 && Static107.aClass1_Sub3_Sub4_1.method2875()) {
					local10 -= Static103.anInt2312;
					if (local10 < 0) {
						local10 = 0;
					}
					Static107.aClass1_Sub3_Sub4_1.method2872(local10);
					return;
				}
				Static107.aClass1_Sub3_Sub4_1.method2888();
				Static107.aClass1_Sub3_Sub4_1.method2880();
				Static176.aClass14_32 = null;
				if (Static120.aClass69_29 == null) {
					Static91.anInt2111 = 0;
				} else {
					Static91.anInt2111 = 2;
				}
				Static163.aClass1_Sub19_1 = null;
			}
		} catch (@Pc(53) Exception local53) {
			local53.printStackTrace();
			Static107.aClass1_Sub3_Sub4_1.method2888();
			Static163.aClass1_Sub19_1 = null;
			Static120.aClass69_29 = null;
			Static176.aClass14_32 = null;
			Static91.anInt2111 = 0;
		}
	}
}
