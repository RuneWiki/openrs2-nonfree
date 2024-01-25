import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
	public static int anInt9411;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_14 = new Class352(4, 1, 1, 1);

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "[[B")
	public static final byte[][] aByteArrayArray45 = new byte[1000][];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BJ)V")
	public static void method7777(@OriginalArg(1) long arg0) {
		if (Static486.aClass58ArrayArrayArray2 != null) {
			if (Static378.anInt6935 == 1 || Static378.anInt6935 == 5) {
				Static451.method6546(arg0);
			} else if (Static378.anInt6935 == 4) {
				Static568.method8167(arg0);
			}
		}
		Static184.method2922(Static677.aClass137_47, (long) Static87.anInt1951);
		if (Static563.anInt9769 != -1) {
			Static568.method8170(Static563.anInt9769);
		}
		for (@Pc(39) int local39 = 0; local39 < Static599.anInt6161; local39++) {
			if (Static446.aBooleanArray18[local39]) {
				Static337.aBooleanArray16[local39] = true;
			}
			Static50.aBooleanArray4[local39] = Static446.aBooleanArray18[local39];
			Static446.aBooleanArray18[local39] = false;
		}
		Static624.anInt10508 = Static87.anInt1951;
		Static369.method5533((Class230) null, -1, -1);
		Static320.method5063((Class230) null, -1, -1);
		if (Static563.anInt9769 != -1) {
			Static599.anInt6161 = 0;
			Static577.method8246();
		}
		Static677.aClass137_47.la();
		Static485.method6448(Static677.aClass137_47);
		@Pc(102) int local102 = Static251.method3687();
		if (local102 == -1) {
			local102 = Static416.anInt7542;
		}
		if (local102 == -1) {
			local102 = Static139.anInt2651;
		}
		Static543.method7677(local102);
		@Pc(122) int local122 = Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.method2422() << 8;
		Static513.method7466(local122 + Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt11002, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.aByte146, Static475.anInt8259, Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2.anInt10998 + local122);
		Static475.anInt8259 = 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI)V")
	public static void method7778(@OriginalArg(0) boolean arg0) {
		Static91.method1715(Static639.anInt10685, Static563.anInt9769, arg0, Static561.anInt9759);
	}
}
