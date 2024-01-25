import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "Lclient!jj;")
	public static Class1_Sub25 aClass1_Sub25_3;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIFIZII)[[I")
	public static int[][] method6534(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub3_Sub2 local13 = new Class1_Sub3_Sub2();
		local13.anInt306 = 4;
		local13.anInt315 = 8;
		local13.aBoolean18 = false;
		local13.anInt313 = 3;
		local13.anInt309 = (int) (arg0 * 4096.0F);
		local13.method8197();
		Static338.method3566(64, 256);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method512(local9[local48], local48);
		}
		return local9;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IBIIIILclient!md;)V")
	public static void method6535(@OriginalArg(2) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class20_Sub1_Sub1 arg3) {
		Static538.method8167(arg0, arg2, arg3.aByte108, arg1, arg3.anInt8954, 0, arg3.anInt8949);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method6537(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1) {
		@Pc(8) String local8 = arg1.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg0 ? 32768 : 0;
		@Pc(30) int local30 = local19 + (arg0 ? Static221.aClass41_1.anInt1321 : Static221.aClass41_1.anInt1323);
		for (@Pc(32) int local32 = local19; local32 < local30; local32++) {
			@Pc(39) Class1_Sub2_Sub11 local39 = Static221.aClass41_1.method1404(local32);
			if (local39.aBoolean455 && local39.method5431().toLowerCase().indexOf(local8) != -1) {
				if (local13 >= 50) {
					Static219.anInt4316 = -1;
					Static517.aShortArray148 = null;
					return;
				}
				if (local11.length <= local13) {
					@Pc(74) short[] local74 = new short[local11.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local13; local76++) {
						local74[local76] = local11[local76];
					}
					local11 = local74;
				}
				local11[local13++] = (short) local32;
			}
		}
		Static315.anInt6002 = 0;
		Static517.aShortArray148 = local11;
		Static219.anInt4316 = local13;
		@Pc(118) String[] local118 = new String[Static219.anInt4316];
		for (@Pc(120) int local120 = 0; local120 < Static219.anInt4316; local120++) {
			local118[local120] = Static221.aClass41_1.method1404(local11[local120]).method5431();
		}
		Static42.method1219(local118, Static517.aShortArray148);
	}
}
