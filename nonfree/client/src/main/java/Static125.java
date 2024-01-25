import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "Lclient!td;")
	public static final Class233 aClass233_3 = new Class233("RC", 1);

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	public static int anInt2319 = -1;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
	public static int anInt2320 = -1;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
	public static void method1990() {
		if (Static61.anInt1460 < 0) {
			return;
		}
		@Pc(12) long local12 = Static27.method359();
		Static61.anInt1460 = (int) ((long) Static61.anInt1460 + Static397.aLong206 - local12);
		if (Static61.anInt1460 > 0) {
			@Pc(32) int local32 = (Static61.anInt1460 << 8) / Static288.anInt5049;
			@Pc(37) int local37 = 255 - local32;
			@Pc(42) float local42 = (float) local32 / 255.0F;
			@Pc(47) float local47 = 1.0F - local42;
			Static56.anInt1065 = (local32 * (Static346.anInt5943 & 0xFF00) + (Static119.aClass109_1.anInt2754 & 0xFF00) * local37 & 0xFF0000) + (local32 * (Static346.anInt5943 & 0xFF00FF) + local37 * (Static119.aClass109_1.anInt2754 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static176.anInt1041 = local37 * Static119.aClass109_1.anInt2745 + local32 * Static450.anInt7436 >> 8;
			Static287.aFloat64 = local47 * (Static119.aClass109_1.aFloat38 - Static226.aFloat57) + Static226.aFloat57;
			Static290.aFloat65 = (Static119.aClass109_1.aFloat34 - Static1.aFloat1) * local47 + Static1.aFloat1;
			Static62.aFloat14 = Static357.aFloat73 + local47 * (Static119.aClass109_1.aFloat36 - Static357.aFloat73);
			Static459.anInt7336 = ((Static289.anInt5059 & 0xFF00) * local32 + (Static119.aClass109_1.anInt2747 & 0xFF00) * local37 & 0xFF0000) + ((Static119.aClass109_1.anInt2747 & 0xFF00FF) * local37 + local32 * (Static289.anInt5059 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static149.aFloat29 = (Static119.aClass109_1.aFloat33 - Static415.aFloat81) * local47 + Static415.aFloat81;
			Static408.aFloat80 = local47 * (Static119.aClass109_1.aFloat35 - Static217.aFloat43) + Static217.aFloat43;
			Static442.aFloat104 = local47 * (Static119.aClass109_1.aFloat37 - Static236.aFloat59) + Static236.aFloat59;
			if (Static119.aClass109_1.aClass3_1 != Static392.aClass3_3) {
				Static456.aClass3_4 = Static383.aClass34_11.method5763(Static392.aClass3_3, Static119.aClass109_1.aClass3_1, local47, Static456.aClass3_4);
			}
		} else {
			Static442.aFloat104 = Static119.aClass109_1.aFloat37;
			Static176.anInt1041 = Static119.aClass109_1.anInt2745;
			Static62.aFloat14 = Static119.aClass109_1.aFloat36;
			Static149.aFloat29 = Static119.aClass109_1.aFloat33;
			Static408.aFloat80 = Static119.aClass109_1.aFloat35;
			Static287.aFloat64 = Static119.aClass109_1.aFloat38;
			Static456.aClass3_4 = Static119.aClass109_1.aClass3_1;
			Static290.aFloat65 = Static119.aClass109_1.aFloat34;
			Static61.anInt1460 = -1;
			Static459.anInt7336 = Static119.aClass109_1.anInt2747;
			Static56.anInt1065 = Static119.aClass109_1.anInt2754;
		}
		Static397.aLong206 = local12;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public static void method1992() {
		if (Static312.anInt5414 == 8) {
			Static203.method4783(4);
		} else if (Static312.anInt5414 == 4 || Static312.anInt5414 == 5) {
			Static203.method4783(2);
		} else if (Static312.anInt5414 == 11) {
			Static203.method4783(2);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!gp;I)I")
	public static int method1994(@OriginalArg(0) Class1_Sub19 arg0) {
		@Pc(7) String local7 = Static170.method2397(arg0);
		@Pc(9) int[] local9 = null;
		if (Static348.method4710(arg0.anInt2416)) {
			local9 = Static342.aClass155_2.method3548((int) arg0.aLong74).anIntArray301;
		} else if (arg0.anInt2417 != -1) {
			local9 = Static342.aClass155_2.method3548(arg0.anInt2417).anIntArray301;
		} else if (Static133.method2050(arg0.anInt2416)) {
			@Pc(89) Class25_Sub5_Sub1_Sub1 local89 = Static87.aClass25_Sub5_Sub1_Sub1Array6[(int) arg0.aLong74];
			if (local89 != null) {
				@Pc(94) Class54 local94 = local89.aClass54_1;
				if (local94.anIntArray67 != null) {
					local94 = local94.method1148(Static320.aClass249_2);
				}
				if (local94 != null) {
					local9 = local94.anIntArray68;
				}
			}
		} else if (Static385.method5050(arg0.anInt2416)) {
			@Pc(57) Class68 local57;
			if (arg0.anInt2416 == 1002) {
				local57 = Static341.aClass75_4.method1616((int) arg0.aLong74);
			} else {
				local57 = Static341.aClass75_4.method1616((int) (arg0.aLong74 >>> 32 & 0x7FFFFFFFL));
			}
			if (local57.anIntArray125 != null) {
				local57 = local57.method1535(Static320.aClass249_2);
			}
			if (local57 != null) {
				local9 = local57.anIntArray126;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static434.method5716(local9);
		}
		@Pc(135) int local135 = Static451.aClass89_10.method1987(local7, Static57.aClass6Array3);
		if (arg0.aBoolean274) {
			local135 += Static17.aClass6_5.YA() + 4;
		}
		return local135;
	}
}
