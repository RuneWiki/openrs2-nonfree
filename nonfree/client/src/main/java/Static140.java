import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	public static int anInt3201;

	@OriginalMember(owner = "client!kc", name = "ib", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
	public static int anInt3192 = 0;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "Lclient!ji;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_2 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method2324() {
		if (Static27.aFloat44 < 128.0F) {
			Static27.aFloat44 = 128.0F;
		}
		while (Static62.aFloat16 >= 2048.0F) {
			Static62.aFloat16 -= 2048.0F;
		}
		if (Static27.aFloat44 > 383.0F) {
			Static27.aFloat44 = 383.0F;
		}
		while (Static62.aFloat16 < 0.0F) {
			Static62.aFloat16 += 2048.0F;
		}
		@Pc(49) int local49 = Static28.anInt741 >> 7;
		@Pc(53) int local53 = Static315.anInt6303 >> 7;
		@Pc(59) int local59 = Static93.method1576(Static315.anInt6303, Static28.anInt741, Static185.anInt4085);
		@Pc(61) int local61 = 0;
		@Pc(79) int local79;
		if (local49 > 3 && local53 > 3 && local49 < 100 && local53 < 100) {
			for (local79 = local49 - 4; local79 <= local49 + 4; local79++) {
				for (@Pc(88) int local88 = local53 - 4; local88 <= local53 + 4; local88++) {
					@Pc(99) int local99 = Static185.anInt4085;
					if (local99 < 3 && (Static303.aByteArrayArrayArray19[1][local79][local88] & 0x2) == 2) {
						local99++;
					}
					@Pc(137) int local137 = (Static290.aByteArrayArrayArray17[local99][local79][local88] & 0xFF) * 8 + local59 - Static46.anIntArrayArrayArray1[local99][local79][local88];
					if (local137 > local61) {
						local61 = local137;
					}
				}
			}
		}
		local79 = local61 * 192;
		if (local79 > 98048) {
			local79 = 98048;
		}
		if (local79 < 32768) {
			local79 = 32768;
		}
		if (local79 > Static115.anInt2485) {
			Static115.anInt2485 += (local79 - Static115.anInt2485) / 24;
		} else if (local79 < Static115.anInt2485) {
			Static115.anInt2485 += (local79 - Static115.anInt2485) / 80;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!sl;)V")
	public static void method2329(@OriginalArg(1) Class1_Sub27 arg0) {
		Static84.method1462(200000, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!th;ILclient!th;)V")
	public static void method2333(@OriginalArg(0) Class168 arg0, @OriginalArg(2) Class168 arg1) {
		Static222.aClass168_161 = arg1;
		Static35.aClass168_28 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZII)V")
	public static void method2341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static170.anInt3814 <= arg2 && arg2 <= Static310.anInt6206) {
			@Pc(30) int local30 = Static131.method2259(Static90.anInt2088, arg0, Static206.anInt4449);
			@Pc(36) int local36 = Static131.method2259(Static90.anInt2088, arg3, Static206.anInt4449);
			Static158.method1923(arg1, local36, arg2, local30);
		}
	}
}
