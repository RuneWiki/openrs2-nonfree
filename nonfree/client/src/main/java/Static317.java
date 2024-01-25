import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "Z")
	public static boolean aBoolean440 = true;

	@OriginalMember(owner = "client!mfa", name = "n", descriptor = "J")
	public static long aLong149 = -1L;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)Z")
	public static boolean method4952(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static428.method6089(arg1, arg0)) {
			return Static314.method4912(arg0, arg1) | (arg1 & 0x9000) != 0 | Static30.method469(arg0, arg1) ? true : (arg0 & 0x37) == 0 & (Static24.method349(arg0, arg1) | (arg1 & 0x2000) != 0 | Static249.method3892(arg0, arg1));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)V")
	public static void method4953() {
		for (@Pc(10) int local10 = 0; local10 < Static314.anInt6059; local10++) {
			@Pc(16) int local16 = Static380.anIntArray494[local10];
			@Pc(24) Class15_Sub2_Sub4_Sub1 local24 = ((Class6_Sub49) Static251.aClass234_29.method5464((long) local16)).aClass15_Sub2_Sub4_Sub1_2;
			@Pc(28) int local28 = Static429.aClass6_Sub12_Sub2_2.method6019();
			if ((local28 & 0x40) != 0) {
				local28 += Static429.aClass6_Sub12_Sub2_2.method6019() << 8;
			}
			@Pc(48) int local48;
			@Pc(52) int local52;
			if ((local28 & 0x8) != 0) {
				local48 = Static429.aClass6_Sub12_Sub2_2.method6034();
				local52 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local24.method7127(Static363.anInt6671, local52, local48);
				local24.anInt8987 = Static363.anInt6671 + 300;
				local24.anInt8938 = Static429.aClass6_Sub12_Sub2_2.method6027();
			}
			if ((local28 & 0x200) != 0) {
				local48 = Static429.aClass6_Sub12_Sub2_2.method6044();
				local24.anInt8920 = Static429.aClass6_Sub12_Sub2_2.method6027();
				local24.anInt8937 = Static429.aClass6_Sub12_Sub2_2.method6019();
				local24.aBoolean578 = (local48 & 0x8000) != 0;
				local24.anInt8950 = local48 & 0x7FFF;
				local24.anInt8962 = local24.anInt8950 + Static363.anInt6671 + local24.anInt8920;
			}
			if ((local28 & 0x2) != 0) {
				local48 = Static429.aClass6_Sub12_Sub2_2.method6048();
				if (local48 == 65535) {
					local48 = -1;
				}
				local52 = Static429.aClass6_Sub12_Sub2_2.method6014();
				Static498.method6895(local52, local48, local24);
			}
			if ((local28 & 0x1) != 0) {
				local24.anInt8927 = Static429.aClass6_Sub12_Sub2_2.method6057();
				if (local24.anInt8927 == 65535) {
					local24.anInt8927 = -1;
				}
			}
			if ((local28 & 0x2000) != 0) {
				local48 = Static429.aClass6_Sub12_Sub2_2.method6034();
				local52 = Static429.aClass6_Sub12_Sub2_2.method6014();
				local24.method7127(Static363.anInt6671, local52, local48);
			}
			if ((local28 & 0x20) != 0) {
				local24.anInt5186 = Static429.aClass6_Sub12_Sub2_2.method6055();
				local24.anInt5183 = Static429.aClass6_Sub12_Sub2_2.method6055();
			}
			if ((local28 & 0x800) != 0) {
				local24.aByte99 = Static429.aClass6_Sub12_Sub2_2.method6049();
				local24.aByte102 = Static429.aClass6_Sub12_Sub2_2.method6013();
				local24.aByte101 = Static429.aClass6_Sub12_Sub2_2.method6051();
				local24.aByte100 = (byte) Static429.aClass6_Sub12_Sub2_2.method6027();
				local24.anInt8963 = Static363.anInt6671 + Static429.aClass6_Sub12_Sub2_2.method6057();
				local24.anInt8988 = Static363.anInt6671 + Static429.aClass6_Sub12_Sub2_2.method6055();
			}
			if ((local28 & 0x4) != 0) {
				if (local24.aClass88_1.method1942()) {
					Static32.method512(local24);
				}
				local24.method4297(Static119.aClass226_4.method5369(Static429.aClass6_Sub12_Sub2_2.method6055()));
				local24.method7134(local24.aClass88_1.anInt2171);
				local24.anInt8930 = local24.aClass88_1.anInt2144 << 3;
				if (local24.aClass88_1.method1942()) {
					Static90.method4176(null, 0, null, local24.anIntArray638[0], local24.aByte98, local24, local24.anIntArray637[0]);
				}
			}
			if ((local28 & 0x10) != 0) {
				local24.aString81 = Static429.aClass6_Sub12_Sub2_2.method6040();
				local24.anInt8994 = 100;
			}
			@Pc(334) int local334;
			if ((local28 & 0x80) != 0) {
				local48 = Static429.aClass6_Sub12_Sub2_2.method6055();
				if (local48 == 65535) {
					local48 = -1;
				}
				local52 = Static429.aClass6_Sub12_Sub2_2.method5998();
				local334 = Static429.aClass6_Sub12_Sub2_2.method6011();
				local24.method7139(false, local52, local334, local48);
			}
			if ((local28 & 0x1000) != 0) {
				local48 = Static429.aClass6_Sub12_Sub2_2.method6019();
				@Pc(355) int[] local355 = new int[local48];
				@Pc(358) int[] local358 = new int[local48];
				@Pc(361) int[] local361 = new int[local48];
				for (@Pc(363) int local363 = 0; local363 < local48; local363++) {
					@Pc(371) int local371 = Static429.aClass6_Sub12_Sub2_2.method6055();
					if (local371 == 65535) {
						local371 = -1;
					}
					local355[local363] = local371;
					local358[local363] = Static429.aClass6_Sub12_Sub2_2.method6014();
					local361[local363] = Static429.aClass6_Sub12_Sub2_2.method6057();
				}
				Static168.method2675(local358, local361, local355, local24);
			}
			if ((local28 & 0x400) != 0) {
				local24.lb = Static429.aClass6_Sub12_Sub2_2.method6013();
				local24.anInt8942 = Static429.aClass6_Sub12_Sub2_2.method6051();
				local24.anInt8939 = Static429.aClass6_Sub12_Sub2_2.method6051();
				local24.anInt8977 = Static429.aClass6_Sub12_Sub2_2.method6051();
				local24.anInt8991 = Static429.aClass6_Sub12_Sub2_2.method6057() + Static363.anInt6671;
				local24.anInt8961 = Static429.aClass6_Sub12_Sub2_2.method6055() + Static363.anInt6671;
				local24.anInt8986 = Static429.aClass6_Sub12_Sub2_2.method6011();
				local24.anInt8997 = 0;
				local24.anInt8939 += local24.anIntArray638[0];
				local24.lb += local24.anIntArray638[0];
				local24.anInt8998 = 1;
				local24.anInt8977 += local24.anIntArray637[0];
				local24.anInt8942 += local24.anIntArray637[0];
			}
			if ((local28 & 0x100) != 0) {
				local48 = Static429.aClass6_Sub12_Sub2_2.method6048();
				local52 = Static429.aClass6_Sub12_Sub2_2.method5998();
				if (local48 == 65535) {
					local48 = -1;
				}
				local334 = Static429.aClass6_Sub12_Sub2_2.method6011();
				local24.method7139(true, local52, local334, local48);
			}
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!va;I)V")
	public static void method4954(@OriginalArg(0) int arg0, @OriginalArg(1) Class15_Sub2_Sub4 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt8991 > Static363.anInt6671) {
			Static260.method3992(arg1);
		} else if (arg1.anInt8961 < Static363.anInt6671) {
			Static487.method6845(false, arg1);
			local9 = Static582.anInt8001;
			local7 = Static245.anInt4517;
		} else {
			Static525.method7202(arg1);
		}
		if (arg1.anInt8911 < 512 || arg1.anInt8913 < 512 || arg1.anInt8911 >= Static18.anInt5706 * 512 - 512 || arg1.anInt8913 >= (Static80.anInt1367 - 1) * 512) {
			local9 = 0;
			arg1.anInt8968 = -1;
			arg1.anInt8991 = 0;
			arg1.anInt8932 = -1;
			arg1.anInt8961 = 0;
			arg1.anInt8947 = -1;
			local7 = -1;
			arg1.anInt8911 = arg1.anIntArray638[0] * 512 + arg1.method7135() * 256;
			arg1.anInt8913 = arg1.anIntArray637[0] * 512 + arg1.method7135() * 256;
			arg1.method7140();
		}
		if (arg1 == Static461.aClass15_Sub2_Sub4_Sub2_2 && (arg1.anInt8911 < 6144 || arg1.anInt8913 < 6144 || arg1.anInt8911 >= (Static18.anInt5706 - 12) * 512 || Static80.anInt1367 * 512 - 6144 <= arg1.anInt8913)) {
			arg1.anInt8961 = 0;
			local7 = -1;
			arg1.anInt8947 = -1;
			arg1.anInt8991 = 0;
			local9 = 0;
			arg1.anInt8932 = -1;
			arg1.anInt8968 = -1;
			arg1.anInt8911 = arg1.anIntArray638[0] * 512 + arg1.method7135() * 256;
			arg1.anInt8913 = arg1.anIntArray637[0] * 512 + arg1.method7135() * 256;
			arg1.method7140();
		}
		@Pc(219) int local219 = Static143.method2345(arg1);
		Static100.method1446(arg1, local7, local219, local9);
		Static243.method3795(arg1);
	}
}
