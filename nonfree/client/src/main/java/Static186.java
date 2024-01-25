import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_56 = new Class156();

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "[Lclient!ou;")
	public static final Class185[] aClass185Array5 = new Class185[8];

	@OriginalMember(owner = "client!jd", name = "o", descriptor = "Lclient!de;")
	public static final Class50 aClass50_28 = new Class50(9, 0, 4, 1);

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
	public static void method5101() {
		for (@Pc(10) Class2_Sub35 local10 = (Class2_Sub35) Static111.aClass156_12.method3155(); local10 != null; local10 = (Class2_Sub35) Static111.aClass156_12.method3150()) {
			if (local10.aBoolean324) {
				local10.method3719();
			}
		}
		for (@Pc(34) Class2_Sub35 local34 = (Class2_Sub35) Static289.aClass156_36.method3155(); local34 != null; local34 = (Class2_Sub35) Static289.aClass156_36.method3150()) {
			if (local34.aBoolean324) {
				local34.method3719();
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method5106(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static444.anInt7132;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class144 local22 = Static19.aClass96_1.method2091(arg0[local13]);
			if (local22.anInt3700 != -1) {
				@Pc(35) Class13 local35 = (Class13) Static88.aClass132_9.method2701((long) local22.anInt3700);
				if (local35 == null) {
					@Pc(43) Class17 local43 = Static461.method262(Static103.aClass54_28, local22.anInt3700, 0);
					if (local43 != null) {
						local35 = Static82.aClass163_1.method5549(local43);
						Static88.aClass132_9.method2711(local35, (long) local22.anInt3700);
					}
				}
				if (local35 != null) {
					Static271.aClass13Array14[local11] = local35;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public static void method5110() {
		Static420.aClass163_11.Q(Static229.anInt3736, Static2.aClass148_Sub1_1.aBoolean248 ? Static153.anInt2663 + 256 << 0 : -1, 256);
	}
}
