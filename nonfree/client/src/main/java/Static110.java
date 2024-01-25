import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
	public static int anInt2281;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "[[S")
	public static final short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!sn;")
	public static final Class223 aClass223_3 = new Class223("WIP", 2);

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
	public static int anInt2286 = -1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
	public static int method1687() {
		try {
			if (Static408.anInt7082 == 0) {
				if (Static208.method3182() - 5000L < Static14.aLong15) {
					return 0;
				}
				Static105.aClass128_1 = Static303.aClass131_4.method3068(Static11.anInt311, Static78.aString16);
				Static337.aLong163 = Static208.method3182();
				Static408.anInt7082 = 1;
			}
			if (Static337.aLong163 + 30000L < Static208.method3182()) {
				return Static433.method5835(1000);
			}
			@Pc(74) int local74;
			@Pc(104) int local104;
			if (Static408.anInt7082 == 1) {
				if (Static105.aClass128_1.anInt3727 == 2) {
					return Static433.method5835(1001);
				}
				if (Static105.aClass128_1.anInt3727 != 1) {
					return -1;
				}
				Static423.aClass199_11 = new Class199((Socket) Static105.aClass128_1.anObject4, Static303.aClass131_4);
				Static105.aClass128_1 = null;
				local74 = 0;
				if (Static293.aBoolean500) {
					local74 = Static383.anInt6790;
				}
				Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
				Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_9.anInt7355);
				Static98.aClass2_Sub20_Sub1_1.method3713(local74);
				Static423.aClass199_11.method4484(Static98.aClass2_Sub20_Sub1_1.aByteArray136, Static98.aClass2_Sub20_Sub1_1.anInt4608);
				Static347.method4871();
				local104 = Static423.aClass199_11.method4491();
				Static347.method4871();
				if (local104 != 0) {
					return Static433.method5835(local104);
				}
				Static408.anInt7082 = 2;
			}
			if (Static408.anInt7082 == 2) {
				if (Static423.aClass199_11.method4483() < 2) {
					return -1;
				}
				Static406.anInt7049 = Static423.aClass199_11.method4491();
				Static406.anInt7049 <<= 0x8;
				Static406.anInt7049 += Static423.aClass199_11.method4491();
				Static408.anInt7082 = 3;
				Static65.aByteArray222 = new byte[Static406.anInt7049];
				Static425.anInt5534 = 0;
			}
			if (Static408.anInt7082 != 3) {
				return -1;
			}
			local74 = Static423.aClass199_11.method4483();
			if (local74 < 1) {
				return -1;
			}
			if (local74 > Static406.anInt7049 - Static425.anInt5534) {
				local74 = Static406.anInt7049 - Static425.anInt5534;
			}
			Static423.aClass199_11.method4488(local74, Static65.aByteArray222, Static425.anInt5534);
			Static425.anInt5534 += local74;
			if (Static406.anInt7049 > Static425.anInt5534) {
				return -1;
			} else if (Static340.method4783(Static65.aByteArray222)) {
				Static393.aClass23_Sub1Array2 = new Class23_Sub1[Static114.anInt2337];
				local104 = 0;
				for (@Pc(202) int local202 = Static270.anInt4971; local202 <= Static220.anInt4212; local202++) {
					@Pc(208) Class23_Sub1 local208 = Static450.method6078(local202);
					if (local208 != null) {
						Static393.aClass23_Sub1Array2[local104++] = local208;
					}
				}
				Static128.aClass2_Sub29_1 = null;
				Static340.anInt5989 = 0;
				Static423.aClass199_11.method4490();
				Static408.anInt7082 = 0;
				Static306.anInt5407 = 0;
				Static65.aByteArray222 = null;
				Static423.aClass199_11 = null;
				Static14.aLong15 = Static208.method3182();
				return 0;
			} else {
				return Static433.method5835(1002);
			}
		} catch (@Pc(240) IOException local240) {
			return Static433.method5835(1003);
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIII)I")
	public static int method1689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class184.anIntArray350[arg0 * 8192 / arg3] >> 1;
		return (arg2 * (65536 - local15) >> 16) + (arg1 * local15 >> 16);
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(BI)V")
	public static void method1690(@OriginalArg(1) int arg0) {
		Static452.anInt7845 = -1;
		Static67.anInt1777 = arg0;
		Static168.anInt3256 = -1;
		Static39.method728();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([J[Ljava/lang/Object;III)V")
	public static void method1691(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg2 + arg3) / 2;
		@Pc(21) int local21 = arg2;
		@Pc(25) long local25 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local25;
		@Pc(39) Object local39 = arg1[local19];
		arg1[local19] = arg1[arg3];
		arg1[arg3] = local39;
		@Pc(59) int local59 = ~local25 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg2; local61 < arg3; local61++) {
			if (local25 + (long) (local61 & local59) > arg0[local61]) {
				@Pc(82) long local82 = arg0[local61];
				arg0[local61] = arg0[local21];
				arg0[local21] = local82;
				@Pc(96) Object local96 = arg1[local61];
				arg1[local61] = arg1[local21];
				arg1[local21++] = local96;
			}
		}
		arg0[arg3] = arg0[local21];
		arg0[local21] = local25;
		arg1[arg3] = arg1[local21];
		arg1[local21] = local39;
		method1691(arg0, arg1, arg2, local21 - 1);
		method1691(arg0, arg1, local21 + 1, arg3);
	}
}
