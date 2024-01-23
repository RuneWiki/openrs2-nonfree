import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fj", name = "Fc", descriptor = "[[Lclient!in;")
	public static Class71[][] aClass71ArrayArray1;

	@OriginalMember(owner = "client!fj", name = "Yc", descriptor = "Lclient!pn;")
	public static Class1_Sub2_Sub11 aClass1_Sub2_Sub11_8;

	@OriginalMember(owner = "client!fj", name = "wc", descriptor = "Ljava/lang/String;")
	public static String aString97 = "glow2:";

	@OriginalMember(owner = "client!fj", name = "Bc", descriptor = "Ljava/lang/String;")
	public static String aString98 = "Take";

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILclient!w;Lclient!w;)V")
	public static void method1350(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg1.aClass1_Sub2_69 != null) {
			arg1.method4347();
		}
		arg1.aClass1_Sub2_69 = arg0;
		arg1.aClass1_Sub2_68 = arg0.aClass1_Sub2_68;
		arg1.aClass1_Sub2_69.aClass1_Sub2_68 = arg1;
		arg1.aClass1_Sub2_68.aClass1_Sub2_69 = arg1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIII)V")
	public static void method1352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class1_Sub33 local12 = (Class1_Sub33) Static160.aClass70_9.method2075((long) arg2);
		if (local12 == null) {
			local12 = new Class1_Sub33();
			Static160.aClass70_9.method2084((long) arg2, local12);
		}
		if (local12.anIntArray505.length <= arg1) {
			@Pc(39) int[] local39 = new int[arg1 + 1];
			@Pc(44) int[] local44 = new int[arg1 + 1];
			@Pc(46) int local46;
			for (local46 = 0; local46 < local12.anIntArray505.length; local46++) {
				local39[local46] = local12.anIntArray505[local46];
				local44[local46] = local12.anIntArray507[local46];
			}
			for (local46 = local12.anIntArray505.length; local46 < arg1; local46++) {
				local39[local46] = -1;
				local44[local46] = 0;
			}
			local12.anIntArray505 = local39;
			local12.anIntArray507 = local44;
		}
		local12.anIntArray505[arg1] = arg3;
		local12.anIntArray507[arg1] = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZILclient!om;II)V")
	public static void method1354(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class125 arg3, @OriginalArg(4) int arg4) {
		if (Static103.anInt2427 >= 50 || (arg3 == null || arg3.anIntArrayArray19 == null || arg3.anIntArrayArray19.length <= arg0 || arg3.anIntArrayArray19[arg0] == null)) {
			return;
		}
		@Pc(45) int local45 = arg3.anIntArrayArray19[arg0][0];
		@Pc(49) int local49 = local45 >> 8;
		@Pc(55) int local55 = local45 >> 5 & 0x7;
		@Pc(72) int local72;
		if (arg3.anIntArrayArray19[arg0].length > 1) {
			local72 = (int) ((double) arg3.anIntArrayArray19[arg0].length * Math.random());
			if (local72 > 0) {
				local49 = arg3.anIntArrayArray19[arg0][local72];
			}
		}
		@Pc(85) int local85 = local45 & 0x1F;
		if (local85 == 0) {
			if (arg1) {
				Static242.method3712(local49, 255, 0, local55);
			}
		} else if (Static119.anInt2761 != 0) {
			Static252.anIntArray439[Static103.anInt2427] = local49;
			Static30.anIntArray298[Static103.anInt2427] = local55;
			local72 = (arg2 - 64) / 128;
			Static192.anIntArray355[Static103.anInt2427] = 0;
			Static59.aClass169Array5[Static103.anInt2427] = null;
			@Pc(133) int local133 = (arg4 - 64) / 128;
			Static23.anIntArray57[Static103.anInt2427] = 255;
			Static256.anIntArray443[Static103.anInt2427] = local85 + (local133 << 8) + (local72 << 16);
			Static103.anInt2427++;
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IB)V")
	public static void method1355(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static108.method1987(arg0)) {
			return;
		}
		@Pc(33) Class71[] local33 = aClass71ArrayArray1[arg0];
		for (@Pc(35) int local35 = 0; local35 < local33.length; local35++) {
			@Pc(47) Class71 local47 = local33[local35];
			if (local47.anObjectArray16 != null) {
				@Pc(56) Class1_Sub14 local56 = new Class1_Sub14();
				local56.anObjectArray1 = local47.anObjectArray16;
				local56.aClass71_8 = local47;
				Static127.method2188(2000000, local56);
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLclient!wa;)V")
	public static void method1356(@OriginalArg(1) Class175 arg0) {
		Static285.anInt5431 = 3;
		Static56.method1059(true);
		Static223.aBoolean343 = true;
		Static276.aBoolean217 = true;
		Static75.anInt1605 = 0;
		Static147.aBoolean236 = true;
		Static188.aBoolean295 = true;
		Static116.aBoolean450 = true;
		Static184.anInt3815 = 255;
		Static209.aBoolean321 = true;
		Static262.anInt5132 = 2;
		Static200.aBoolean310 = true;
		Static23.aBoolean37 = true;
		Static146.anInt3171 = 0;
		Static129.aBoolean213 = true;
		Static119.anInt2761 = 127;
		Static20.anInt381 = 0;
		Static127.anInt2836 = 127;
		@Pc(44) Class115 local44 = null;
		Static199.aBoolean308 = true;
		Static63.anInt1347 = 0;
		Static236.aBoolean353 = true;
		if (Static177.anInt3741 < 96) {
			Static235.method3619(0);
		} else {
			Static235.method3619(2);
		}
		Static219.aBoolean339 = false;
		Static134.aBoolean218 = false;
		Static83.aBoolean132 = true;
		Static296.anInt5585 = 0;
		Static214.anInt4259 = 0;
		Static19.aBoolean30 = false;
		Static108.anInt2518 = 0;
		try {
			@Pc(88) Class116 local88 = arg0.method4338("runescape");
			while (local88.anInt3812 == 0) {
				Static48.method934(1L);
			}
			if (local88.anInt3812 == 1) {
				local44 = (Class115) local88.anObject5;
				@Pc(106) int local106 = 0;
				@Pc(112) byte[] local112 = new byte[(int) local44.method3062()];
				while (local112.length > local106) {
					@Pc(127) int local127 = local44.method3064(local112.length - local106, local106, local112);
					if (local127 == -1) {
						throw new IOException("EOF");
					}
					local106 += local127;
				}
				Static61.method1098(new Class1_Sub11(local112));
			}
		} catch (@Pc(152) Exception local152) {
		}
		try {
			if (local44 != null) {
				local44.method3060();
			}
		} catch (@Pc(160) Exception local160) {
		}
	}
}
