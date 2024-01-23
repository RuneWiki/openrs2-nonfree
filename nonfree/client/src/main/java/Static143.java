import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!lc", name = "H", descriptor = "Lclient!a;")
	public static Class1 aClass1_12 = new Class1();

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZZ)V")
	public static void method2540(@OriginalArg(1) boolean arg0) {
		Static117.method2159(Static30.anInt714, Static14.aFloat2, Static39.aFloat5, Static169.aFloat36);
		Static117.method2153(Static145.anInt3129, Static131.anInt2693, arg0);
		Static117.method2157((float) Static15.anInt356, (float) Static215.anInt4470, (float) Static63.anInt1425);
		Static117.method2154();
		Static258.aFloat52 = Static279.aFloat54;
		Static221.aClass2_Sub3_Sub12_5 = Static21.aClass2_Sub3_Sub12_1;
		Static258.aFloat53 = Static162.aFloat33;
		Static258.aFloat51 = Static71.aFloat17;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
	public static void method2541() {
		Static274.anInt5705++;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIZ)V")
	public static void method2542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static127.anInt2664 <= arg2 && Static290.anInt6021 >= arg2) {
			@Pc(16) int local16 = Static202.method3411(Static68.anInt1509, arg0, Static43.anInt1054);
			@Pc(22) int local22 = Static202.method3411(Static68.anInt1509, arg3, Static43.anInt1054);
			Static246.method4095(local16, local22, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
	public static void method2543(@OriginalArg(0) boolean arg0) {
		Static295.anInt6152 = 99;
		Static176.anIntArray303 = new int[104];
		@Pc(12) byte local12;
		if (arg0) {
			local12 = 1;
		} else {
			local12 = 4;
		}
		Static58.anIntArray100 = new int[104];
		Static57.aByteArrayArrayArray5 = new byte[local12][104][104];
		Static170.aByteArrayArrayArray11 = new byte[local12][105][105];
		Static170.anIntArray293 = new int[104];
		Static297.aByteArrayArrayArray17 = new byte[local12][104][104];
		Static25.aByteArrayArrayArray14 = new byte[local12][104][104];
		Static188.anIntArrayArrayArray9 = new int[local12][105][105];
		Static108.aByteArrayArrayArray7 = new byte[local12][104][104];
		Static287.anIntArray512 = new int[5];
		Static190.anIntArray355 = new int[104];
		Static33.anIntArray49 = new int[104];
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)Lclient!cn;")
	public static Class34 method2546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub31 local7 = Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(13) int local13 = 0; local13 < local7.anInt5708; local13++) {
			@Pc(22) Class34 local22 = local7.aClass34Array2[local13];
			if ((local22.aLong49 >> 29 & 0x3L) == 2L && local22.anInt894 == arg1 && local22.anInt897 == arg2) {
				return local22;
			}
		}
		return null;
	}
}
