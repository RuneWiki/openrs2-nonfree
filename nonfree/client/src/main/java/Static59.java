import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!cda", name = "S", descriptor = "Ljava/lang/Object;")
	public static Object anObject6;

	@OriginalMember(owner = "client!cda", name = "L", descriptor = "Lclient!ap;")
	public static final Class21 aClass21_1 = new Class21();

	@OriginalMember(owner = "client!cda", name = "R", descriptor = "[I")
	public static final int[] anIntArray44 = new int[50];

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(IIIIIIILclient!mea;ILclient!ja;II)V")
	public static void method1441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class201 arg7, @OriginalArg(9) Class154 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		Static465.anInt8090 = arg4;
		Static163.anInt1206 = arg10;
		Static170.anInt8905 = arg6;
		Static183.aClass201_8 = arg7;
		Static220.anInt4592 = arg1;
		Static577.anInt9990 = arg3;
		Static97.anInt2406 = arg0;
		Static520.aClass365_3 = null;
		Static475.aClass365_2 = null;
		Static481.aClass154_13 = arg8;
		Static198.anInt4278 = arg5;
		Static489.anInt9294 = arg2;
		Static203.aClass365_1 = null;
		Static60.anInt1603 = arg9;
		Static342.method4997();
		Static104.aBoolean182 = true;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Z)V")
	public static void method1444() {
		@Pc(13) int local13 = Static402.aByteArrayArray34.length;
		for (@Pc(15) int local15 = 0; local15 < local13; local15++) {
			if (Static402.aByteArrayArray34[local15] != null) {
				@Pc(23) int local23 = -1;
				for (@Pc(25) int local25 = 0; local25 < Static428.anInt7575; local25++) {
					if (Static178.anIntArray159[local15] == Static139.anIntArray277[local25]) {
						local23 = local25;
						break;
					}
				}
				if (local23 == -1) {
					Static139.anIntArray277[Static428.anInt7575] = Static178.anIntArray159[local15];
					local23 = Static428.anInt7575++;
				}
				@Pc(69) Class3_Sub26 local69 = new Class3_Sub26(Static402.aByteArrayArray34[local15]);
				@Pc(71) int local71 = 0;
				while (local69.anInt8703 < Static402.aByteArrayArray34[local15].length && local71 < 511 && Static60.anInt1599 < 1023) {
					@Pc(92) int local92 = local23 | local71++ << 6;
					@Pc(96) int local96 = local69.method6811();
					@Pc(100) int local100 = local96 >> 14;
					@Pc(106) int local106 = local96 >> 7 & 0x3F;
					@Pc(110) int local110 = local96 & 0x3F;
					@Pc(123) int local123 = (Static178.anIntArray159[local15] >> 8) * 64 + local106 - Static321.anInt5874;
					@Pc(135) int local135 = local110 + (Static178.anIntArray159[local15] & 0xFF) * 64 - Static137.anInt3293;
					@Pc(142) Class213 local142 = Static181.aClass60_1.method1797(local69.method6811());
					@Pc(149) Class3_Sub39 local149 = (Class3_Sub39) Static581.aClass297_39.method6531((long) local92);
					if (local149 == null && (local142.aByte81 & 0x1) > 0 && Static286.anInt5361 == local100 && local123 >= 0 && Static345.anInt6228 > local123 + local142.anInt6196 && local135 >= 0 && Static535.anInt9341 > local135 + local142.anInt6196) {
						@Pc(190) Class25_Sub2_Sub2_Sub5_Sub2 local190 = new Class25_Sub2_Sub2_Sub5_Sub2();
						local190.anInt8529 = local92;
						@Pc(198) Class3_Sub39 local198 = new Class3_Sub39(local190);
						Static581.aClass297_39.method6537((long) local92, local198);
						Static33.aClass3_Sub39Array1[Static238.anInt4737++] = local198;
						Static529.anIntArray535[Static60.anInt1599++] = local92;
						local190.anInt8550 = Static397.anInt6998;
						local190.method6690(local142);
						local190.method6673(local190.aClass213_1.anInt6196);
						local190.anInt8506 = local190.aClass213_1.anInt6186 << 3;
						local190.method6672(true, (local190.aClass213_1.aByte82 + 4 & 0xAF200007) << 11);
						local190.method6688(local190.method6668(), true, local123, local100, local135);
					}
				}
			}
		}
	}
}
