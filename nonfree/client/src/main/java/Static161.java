import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "Z")
	public static boolean aBoolean31;

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "F")
	public static float aFloat18;

	@OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
	public static int anInt566;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method522() {
		Static573.aStringArray70 = new String[500];
		Static40.anInt544 = Static238.aClass114_9.anInt3289 + Static238.aClass114_9.anInt3291 + 2;
		Static203.anInt3845 = Static314.aClass114_11.anInt3291 + Static314.aClass114_11.anInt3289 + 2;
		for (@Pc(25) int local25 = 0; local25 < Static573.aStringArray70.length; local25++) {
			Static573.aStringArray70[local25] = "";
		}
		Static82.method1376(Static590.aClass364_5.method8334(Static154.anInt3181));
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg0 < 512 || arg2 < 512 || arg0 > Static428.anInt8046 * 512 - 1024 || (Static119.anInt2717 - 2) * 512 < arg2) {
			Static258.anIntArray241[0] = Static258.anIntArray241[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static501.method5641(arg0, arg5, arg2) - arg3;
		Static267.aClass8_3.U(arg4, 0, 0);
		Static440.aClass44_12.method4999(Static267.aClass8_3);
		Static440.aClass44_12.AA(arg0, local44, arg2, Static258.anIntArray241);
		Static267.aClass8_3.U(-arg4, 0, 0);
		Static440.aClass44_12.method4999(Static267.aClass8_3);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIZLclient!qo;)V")
	public static void method525(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class4_Sub37 arg2) {
		@Pc(8) int local8 = arg2.anInt8141;
		@Pc(12) int local12 = (int) arg2.aLong268;
		arg2.method8379();
		if (arg1) {
			Static520.method7609(local8);
		}
		Static462.method7038(local8);
		@Pc(32) Class225 local32 = Static490.method7272(local12);
		if (local32 != null) {
			Static92.method2100(local32);
		}
		Static446.method6890();
		if (!arg0 && Static332.anInt6370 != -1) {
			Static228.method3612(1, Static332.anInt6370);
		}
		@Pc(53) Class204 local53 = new Class204(Static189.aClass350_14);
		for (@Pc(58) Class4_Sub37 local58 = (Class4_Sub37) local53.method5146(); local58 != null; local58 = (Class4_Sub37) local53.method5144()) {
			if (!local58.method8381()) {
				local58 = (Class4_Sub37) local53.method5146();
				if (local58 == null) {
					return;
				}
			}
			if (local58.anInt8142 == 3) {
				@Pc(80) int local80 = (int) local58.aLong268;
				if (local80 >>> 16 == local8) {
					method525(arg0, true, local58);
				}
			}
		}
	}
}
