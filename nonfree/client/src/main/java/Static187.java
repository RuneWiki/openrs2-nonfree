import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!op;")
	public static final Class157 aClass157_1 = new Class157();

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "J")
	public static long aLong137 = 0L;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!ct;I)I")
	public static int method3508(@OriginalArg(0) Class30 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1154(Static102.anInt7003)) {
			local5++;
		}
		if (arg0.method1154(Static294.anInt5667)) {
			local5++;
		}
		if (arg0.method1154(Static37.anInt939)) {
			local5++;
		}
		if (arg0.method1154(Static7.anInt217)) {
			local5++;
		}
		if (arg0.method1154(Static282.anInt5488)) {
			local5++;
		}
		if (arg0.method1154(Static186.anInt3747)) {
			local5++;
		}
		if (arg0.method1154(Static254.anInt5165)) {
			local5++;
		}
		if (arg0.method1154(Static184.anInt3734)) {
			local5++;
		}
		if (arg0.method1154(Static164.anInt3439)) {
			local5++;
		}
		if (arg0.method1154(Static345.anInt6528)) {
			local5++;
		}
		if (arg0.method1154(Static157.anInt3251)) {
			local5++;
		}
		if (arg0.method1154(Static201.anInt4057)) {
			local5++;
		}
		if (arg0.method1154(Static5.anInt190)) {
			local5++;
		}
		if (arg0.method1154(Static233.anInt4717)) {
			local5++;
		}
		if (arg0.method1154(Static72.anInt1650)) {
			local5++;
		}
		if (arg0.method1154(Static229.anInt4641)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!gt;BLjava/awt/Frame;)V")
	public static void method3509(@OriginalArg(0) Class75 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class121 local6 = arg0.method2361(arg1);
			while (local6.anInt3693 == 0) {
				Static135.method2737(10L);
			}
			if (local6.anInt3693 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static135.method2737(100L);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!fp;B)V")
	public static void method3510(@OriginalArg(0) Class63 arg0) {
		arg0.method4566(0, 0, Static213.anInt4274, 350);
		arg0.method4653(0, 0, Static213.anInt4274, 350, Static221.anInt4462 << 24 | 0x332277, 1);
		@Pc(35) int local35;
		for (@Pc(25) int local25 = 0; local25 < 100; local25++) {
			@Pc(31) int local31 = Static12.anIntArray25[local25];
			local35 = Static16.anIntArray34[local25];
			arg0.method4653(local31, local35, 2, 2, Static247.anIntArray387[local25] << 24 | 0xFFFFFF, 1);
		}
		local35 = 350 / Static129.anInt2809;
		@Pc(78) int local78;
		if (Static13.anInt332 > 0) {
			local78 = 346 - Static129.anInt2809 - 4;
			@Pc(88) int local88 = local35 * local78 / (Static13.anInt332 + local35 - 1);
			@Pc(90) int local90 = 4;
			if (Static13.anInt332 > 1) {
				local90 = (Static13.anInt332 - Static24.anInt577 - 1) * (local78 + -local88) / (Static13.anInt332 - 1) + 4;
			}
			arg0.method4653(Static213.anInt4274 - 16, local90, 12, local88, Static221.anInt4462 << 24 | 0x332277, 2);
			for (@Pc(128) int local128 = Static24.anInt577; local128 < Static24.anInt577 + local35 && Static13.anInt332 > local128; local128++) {
				@Pc(137) String[] local137 = Static143.method2850('\b', Static282.aStringArray33[local128]);
				@Pc(144) int local144 = (Static213.anInt4274 - 24) / local137.length;
				for (@Pc(146) int local146 = 0; local146 < local137.length; local146++) {
					@Pc(155) int local155 = local146 * local144 + 8;
					arg0.method4566(local155, 0, local144 + local155 - 8, 350);
					Static24.aClass33_1.method6024(-16777216, 350 - Static129.anInt2809 * (local128 - Static24.anInt577) - Static323.anInt4857 - Static91.aClass80_20.anInt2611 - 2, local137[local146], -1, local155);
				}
			}
		}
		arg0.method4566(0, 0, Static213.anInt4274, 350);
		arg0.method4615(0, -1, Static213.anInt4274, 350 - Static323.anInt4857);
		Static340.aClass33_3.method6024(-16777216, 350 - Static64.aClass80_17.anInt2611 - 1, "--> " + Static268.aString50, -1, 10);
		local78 = -1;
		if (Static51.anInt1301 % 30 > 15) {
			local78 = 16777215;
		}
		arg0.method4644(Static64.aClass80_17.method2543("--> " + Static268.aString50.substring(0, Static188.anInt3801)) + 10, 12, local78, 350 - Static64.aClass80_17.anInt2611 - 11);
	}
}
