import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public static int anInt3503;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "Lclient!ic;")
	public static Class4_Sub21 aClass4_Sub21_2;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "Lclient!qo;")
	public static final Class196 aClass196_17 = new Class196(32);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZI)V")
	public static void method2710(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			Static16.aClass30_11 = Static316.method4691(Static126.aClass67_Sub1_1.anInt5848 * 2, Static222.anInterface10_6, Static89.aClass114_3, Static248.aCanvas5, arg1);
		} else {
			if (arg0) {
				Static16.aClass30_11 = Static316.method4691(0, Static222.anInterface10_6, Static89.aClass114_3, Static248.aCanvas5, 0);
				Static16.aClass30_11.M(0);
				@Pc(36) Class215 local36 = Static437.method5652(Static68.anInt4584, Static439.aClass166_293);
				@Pc(45) Class105 local45 = Static16.aClass30_11.method4690(local36, Static464.method4784(Static149.aClass166_105, Static68.anInt4584));
				Static309.method4260(local45, Static104.aClass242_28.method5320(Static139.anInt2670), true);
				Static16.aClass30_11.method4704();
				Static244.method3362();
				Static16.aClass30_11.method4695();
			}
			try {
				Static16.aClass30_11 = Static316.method4691(Static126.aClass67_Sub1_1.anInt5848 * 2, Static222.anInterface10_6, Static89.aClass114_3, Static248.aCanvas5, arg1);
				if (Static16.aClass30_11.method4639()) {
					@Pc(78) Class4_Sub27 local78 = Static16.aClass30_11.method4647();
					Static16.aClass30_11.method4699(local78);
				}
			} catch (@Pc(83) Throwable local83) {
				Static16.aClass30_11 = Static316.method4691(0, Static222.anInterface10_6, Static89.aClass114_3, Static248.aCanvas5, 0);
				arg1 = 0;
			}
		}
		Static286.anInt5207 = arg1;
		Static180.method2644();
		if (!Static16.aClass30_11.method4643()) {
			Static11.anInt379 = 1;
		}
		Static16.aClass30_11.method4675(Static11.anInt379);
		Static16.aClass30_11.method4673(0);
		Static16.aClass30_11.na(8);
		Static248.aClass116_3 = Static16.aClass30_11.method4632();
		Static374.aClass116_4 = Static16.aClass30_11.method4632();
		Static21.method447();
		Static16.aClass30_11.method4646(!Static126.aClass67_Sub1_1.aBoolean392);
		if (Static16.aClass30_11.method4680()) {
			Static415.method5436(Static126.aClass67_Sub1_1.aBoolean398);
		}
		Static373.method5102(Static16.aClass30_11, Static190.anInt3697 >> 3, Static126.anInt2569 >> 3);
		Static429.method5520();
		Static120.aBoolean189 = false;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)I")
	public static int method2711(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(41) int local41 = local28 | local28 >>> 16;
		return local41 + 1;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[B)I")
	public static int method2712(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static331.method4495(0, arg0, arg1);
	}
}
