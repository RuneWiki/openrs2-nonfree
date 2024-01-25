import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
	public static int anInt5014;

	@OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
	public static int anInt5015;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_89 = new Class319(22, 7);

	@OriginalMember(owner = "client!kda", name = "h", descriptor = "Z")
	public static boolean aBoolean381 = false;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method4192(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(13) int local13 = local8.length() - 3; local13 > 0; local13 -= 3) {
			local8 = local8.substring(0, local13) + "," + local8.substring(local13);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static103.aClass77_35.method1864(Static562.anInt9127) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static103.aClass77_37.method1864(Static562.anInt9127) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I")
	public static int method4195(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local12 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local12 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local12 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			arg0 >>>= 0x2;
			local12 += 2;
		}
		if (arg0 >= 1) {
			local12++;
			arg0 >>>= 0x1;
		}
		return arg0 + local12;
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILclient!lt;)V")
	public static void method4196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class20_Sub2_Sub3 arg3) {
		@Pc(4) Class293 local4 = Static528.method7221(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass20_Sub2_Sub3_1 = arg3;
		@Pc(16) int local16 = Static20.aClass17Array1 == Static499.aClass17Array3 ? 1 : 0;
		if (arg3.method7249()) {
			if (arg3.method7256()) {
				Static386.aClass20_Sub2ArrayArray3[local16][Static288.anIntArray327[local16]++] = arg3;
				return;
			}
			Static166.aClass20_Sub2ArrayArray1[local16][Static464.anIntArray526[local16]++] = arg3;
			return;
		}
		Static379.aClass20_Sub2ArrayArray2[local16][Static431.anIntArray499[local16]++] = arg3;
	}
}
