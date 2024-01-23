import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "Lclient!si;")
	public static Class157 aClass157_17;

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Z")
	public static boolean aBoolean475 = false;

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
	public static int anInt4996 = 0;

	@OriginalMember(owner = "client!tl", name = "e", descriptor = "S")
	public static short aShort48 = 32767;

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "Z")
	public static boolean aBoolean476 = true;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
	public static void method4174() {
		Static261.method4039(false);
		System.gc();
		Static197.method3406(25);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZI)Lclient!qn;")
	public static Class1_Sub5_Sub19 method4175(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub5_Sub19 local10 = (Class1_Sub5_Sub19) Static289.aClass112_12.method2951((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27;
		if (arg0 < 32768) {
			local27 = Static312.aClass119_95.method3235(arg0, 1);
		} else {
			local27 = Static201.aClass119_71.method3235(arg0 & 0x7FFF, 1);
		}
		local10 = new Class1_Sub5_Sub19();
		if (local27 != null) {
			local10.method3704(new Class1_Sub13(local27));
		}
		if (arg0 >= 32768) {
			local10.method3714();
		}
		Static289.aClass112_12.method2950((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	public static void method4177() {
		for (@Pc(7) int local7 = 0; local7 < Static125.anInt2513; local7++) {
			@Pc(22) int local22 = Static18.anIntArray36[local7];
			@Pc(26) Class11_Sub4_Sub2 local26 = Static138.aClass11_Sub4_Sub2Array2[local22];
			@Pc(30) int local30 = Static10.aClass1_Sub13_Sub1_117.method1853();
			if ((local30 & 0x80) != 0) {
				local30 += Static10.aClass1_Sub13_Sub1_117.method1853() << 8;
			}
			if ((local30 & 0x8) != 0) {
				local26.aString130 = Static10.aClass1_Sub13_Sub1_117.method1827();
				local26.anInt3809 = 100;
			}
			@Pc(65) int local65;
			@Pc(69) int local69;
			if ((local30 & 0x20) != 0) {
				local65 = Static10.aClass1_Sub13_Sub1_117.method1867();
				local69 = Static10.aClass1_Sub13_Sub1_117.method1849();
				local26.method3345(Static167.anInt637, local65, local69);
			}
			if ((local30 & 0x2) != 0) {
				if (local26.aClass183_1.method4524()) {
					Static47.method897(local26);
				}
				local26.method3365(Static275.method4210(Static10.aClass1_Sub13_Sub1_117.method1879()));
				local26.method3352(local26.aClass183_1.anInt5436);
				local26.anInt3803 = local26.aClass183_1.anInt5425;
				local26.anInt3813 = local26.aClass183_1.anInt5442;
				if (local26.aClass183_1.method4524()) {
					Static219.method3547(local26.anIntArray406[0], local26.anIntArray407[0], local26, Static132.anInt2608, 0, null, null);
				}
			}
			if ((local30 & 0x4) != 0) {
				local65 = Static10.aClass1_Sub13_Sub1_117.method1844();
				local69 = Static10.aClass1_Sub13_Sub1_117.method1834();
				if (local65 == 65535) {
					local65 = -1;
				}
				@Pc(155) boolean local155 = true;
				if (local65 != -1 && local26.anInt3857 != -1 && Static107.method2016(Static226.method3632(local65).anInt518).anInt4608 < Static107.method2016(Static226.method3632(local26.anInt3857).anInt518).anInt4608) {
					local155 = false;
				}
				if (local155) {
					local26.anInt3801 = 1;
					local26.anInt3805 = local69 >> 16;
					local26.anInt3795 = 0;
					local26.anInt3857 = local65;
					local26.anInt3788 = 0;
					local26.anInt3851 = Static167.anInt637 + (local69 & 0xFFFF);
					if (local26.anInt3851 > Static167.anInt637) {
						local26.anInt3788 = -1;
					}
					if (local26.anInt3857 != -1 && local26.anInt3851 == Static167.anInt637) {
						@Pc(240) int local240 = Static226.method3632(local26.anInt3857).anInt518;
						if (local240 != -1) {
							@Pc(247) Class152 local247 = Static107.method2016(local240);
							if (local247 != null && local247.anIntArray509 != null) {
								Static291.method4385(local247, false, local26.anInt3856, local26.anInt3865, 0);
							}
						}
					}
				}
			}
			if ((local30 & 0x40) != 0) {
				local65 = Static10.aClass1_Sub13_Sub1_117.method1870();
				if (local65 == 65535) {
					local65 = -1;
				}
				local69 = Static10.aClass1_Sub13_Sub1_117.method1845();
				Static246.method3874(local69, local26, local65);
			}
			if ((local30 & 0x1) != 0) {
				local26.anInt3784 = Static10.aClass1_Sub13_Sub1_117.method1844();
				if (local26.anInt3784 == 65535) {
					local26.anInt3784 = -1;
				}
			}
			if ((local30 & 0x100) != 0) {
				local65 = Static10.aClass1_Sub13_Sub1_117.method1849();
				@Pc(325) int[] local325 = new int[local65];
				@Pc(328) int[] local328 = new int[local65];
				@Pc(331) int[] local331 = new int[local65];
				for (@Pc(333) int local333 = 0; local333 < local65; local333++) {
					@Pc(340) int local340 = Static10.aClass1_Sub13_Sub1_117.method1844();
					if (local340 == 65535) {
						local340 = -1;
					}
					local325[local333] = local340;
					local328[local333] = Static10.aClass1_Sub13_Sub1_117.method1853();
					local331[local333] = Static10.aClass1_Sub13_Sub1_117.method1870();
				}
				Static51.method942(local331, local328, local26, local325);
			}
			if ((local30 & 0x200) != 0) {
				local26.anInt3816 = Static10.aClass1_Sub13_Sub1_117.method1856();
				local26.anInt3790 = Static10.aClass1_Sub13_Sub1_117.method1870();
			}
			if ((local30 & 0x10) != 0) {
				local65 = Static10.aClass1_Sub13_Sub1_117.method1853();
				local69 = Static10.aClass1_Sub13_Sub1_117.method1867();
				local26.method3345(Static167.anInt637, local65, local69);
				local26.anInt3791 = Static167.anInt637 + 300;
				local26.anInt3854 = Static10.aClass1_Sub13_Sub1_117.method1845();
			}
		}
	}
}
