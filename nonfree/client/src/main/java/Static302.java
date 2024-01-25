import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
	public static int[] anIntArray529;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "Lclient!mo;")
	public static Class143 aClass143_105;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
	public static boolean aBoolean409 = false;

	@OriginalMember(owner = "client!td", name = "n", descriptor = "I")
	public static int anInt5838 = 0;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	public static int anInt5839 = 0;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "I")
	public static int anInt5842 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
	public static int method5296() {
		try {
			if (Static187.anInt3857 == 0) {
				if (Static210.aLong123 > Static168.method3300() - 5000L) {
					return 0;
				}
				Static245.aClass205_8 = Static105.aClass15_2.method284(Static274.aString196, Static164.anInt3456);
				Static36.aLong29 = Static168.method3300();
				Static187.anInt3857 = 1;
			}
			if (Static168.method3300() > Static36.aLong29 + 30000L) {
				return Static88.method2110(1000);
			}
			@Pc(82) int local82;
			@Pc(119) int local119;
			if (Static187.anInt3857 == 1) {
				if (Static245.aClass205_8.anInt6370 == 2) {
					return Static88.method2110(1001);
				}
				if (Static245.aClass205_8.anInt6370 != 1) {
					return -1;
				}
				Static138.aClass159_3 = new Class159((Socket) Static245.aClass205_8.anObject7, Static105.aClass15_2);
				Static245.aClass205_8 = null;
				local82 = 0;
				Static164.aClass14_Sub4_Sub2_3.anInt2637 = 0;
				if (Static232.aBoolean154) {
					local82 = Static297.anInt5710;
				}
				Static164.aClass14_Sub4_Sub2_3.method2538(23);
				Static164.aClass14_Sub4_Sub2_3.method2541(local82);
				Static138.aClass159_3.method4082(Static164.aClass14_Sub4_Sub2_3.aByteArray74, Static164.aClass14_Sub4_Sub2_3.anInt2637);
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				local119 = Static138.aClass159_3.method4086();
				if (Static115.aClass26_7 != null) {
					Static115.aClass26_7.method4220();
				}
				if (Static311.aClass26_12 != null) {
					Static311.aClass26_12.method4220();
				}
				if (local119 != 0) {
					return Static88.method2110(local119);
				}
				Static187.anInt3857 = 2;
			}
			if (Static187.anInt3857 == 2) {
				if (Static138.aClass159_3.method4083() < 2) {
					return -1;
				}
				Static180.anInt3713 = Static138.aClass159_3.method4086();
				Static180.anInt3713 <<= 0x8;
				Static180.anInt3713 += Static138.aClass159_3.method4086();
				Static187.anInt3857 = 3;
				Static197.anInt4000 = 0;
				Static331.aByteArray201 = new byte[Static180.anInt3713];
			}
			if (Static187.anInt3857 != 3) {
				return -1;
			}
			local82 = Static138.aClass159_3.method4083();
			if (local82 < 1) {
				return -1;
			}
			if (Static180.anInt3713 - Static197.anInt4000 < local82) {
				local82 = Static180.anInt3713 - Static197.anInt4000;
			}
			Static138.aClass159_3.method4084(Static331.aByteArray201, local82, Static197.anInt4000);
			Static197.anInt4000 += local82;
			if (Static180.anInt3713 > Static197.anInt4000) {
				return -1;
			} else if (Static5.method4039(Static331.aByteArray201)) {
				Static337.aClass6_Sub1Array1 = new Class6_Sub1[Static232.anInt2216];
				local119 = 0;
				for (@Pc(227) int local227 = Static206.anInt6742; local227 <= Static237.anInt4637; local227++) {
					@Pc(233) Class6_Sub1 local233 = Static105.method2287(local227);
					if (local233 != null) {
						Static337.aClass6_Sub1Array1[local119++] = local233;
					}
				}
				Static174.aClass14_Sub30_1 = null;
				Static182.anInt3784 = 0;
				Static138.aClass159_3.method4079();
				Static138.aClass159_3 = null;
				Static48.anInt1218 = 0;
				Static187.anInt3857 = 0;
				Static331.aByteArray201 = null;
				Static210.aLong123 = Static168.method3300();
				return 0;
			} else {
				return Static88.method2110(1002);
			}
		} catch (@Pc(265) IOException local265) {
			return Static88.method2110(1003);
		}
	}
}
