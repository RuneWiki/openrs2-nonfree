import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
	public static int anInt1624;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	public static int anInt1629;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "Lclient!cr;")
	public static Class44 aClass44_2;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[200];

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_22 = new Class183(57, 7);

	@OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
	public static int anInt1627 = 0;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	public static int anInt1628 = 1;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "Lclient!jt;")
	public static Class2_Sub22 aClass2_Sub22_1 = null;

	@OriginalMember(owner = "client!dn", name = "l", descriptor = "[I")
	public static final int[] anIntArray121 = new int[100];

	@OriginalMember(owner = "client!dn", name = "m", descriptor = "Z")
	public static boolean aBoolean126 = true;

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!kd;Lclient!vt;I)V")
	public static void method1286(@OriginalArg(0) int arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) Class2_Sub24 arg2) {
		@Pc(9) Class2_Sub28 local9 = new Class2_Sub28();
		local9.anInt4485 = arg2.method5732();
		local9.anInt4484 = arg2.method5776();
		local9.aByteArrayArrayArray15 = new byte[local9.anInt4485][][];
		local9.anIntArray334 = new int[local9.anInt4485];
		local9.aClass86Array2 = new Class86[local9.anInt4485];
		local9.aClass86Array1 = new Class86[local9.anInt4485];
		local9.anIntArray333 = new int[local9.anInt4485];
		local9.anIntArray332 = new int[local9.anInt4485];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt4485; local51++) {
			try {
				@Pc(57) int local57 = arg2.method5732();
				@Pc(71) String local71;
				@Pc(75) String local75;
				@Pc(77) int local77;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local71 = arg2.method5744();
					local75 = arg2.method5744();
					local77 = 0;
					if (local57 == 1) {
						local77 = arg2.method5776();
					}
					local9.anIntArray334[local51] = local57;
					local9.anIntArray332[local51] = local77;
					local9.aClass86Array2[local51] = arg1.method3257(Static237.method4218(local71), local75);
				} else if (local57 == 3 || local57 == 4) {
					local71 = arg2.method5744();
					local75 = arg2.method5744();
					local77 = arg2.method5732();
					@Pc(130) String[] local130 = new String[local77];
					for (@Pc(132) int local132 = 0; local132 < local77; local132++) {
						local130[local132] = arg2.method5744();
					}
					@Pc(147) byte[][] local147 = new byte[local77][];
					@Pc(158) int local158;
					if (local57 == 3) {
						for (@Pc(152) int local152 = 0; local152 < local77; local152++) {
							local158 = arg2.method5776();
							local147[local152] = new byte[local158];
							arg2.method5756(local147[local152], local158);
						}
					}
					local9.anIntArray334[local51] = local57;
					@Pc(187) Class[] local187 = new Class[local77];
					for (local158 = 0; local158 < local77; local158++) {
						local187[local158] = Static237.method4218(local130[local158]);
					}
					local9.aClass86Array1[local51] = arg1.method3258(Static237.method4218(local71), local75, local187);
					local9.aByteArrayArrayArray15[local51] = local147;
				}
			} catch (@Pc(222) ClassNotFoundException local222) {
				local9.anIntArray333[local51] = -1;
			} catch (@Pc(229) SecurityException local229) {
				local9.anIntArray333[local51] = -2;
			} catch (@Pc(236) NullPointerException local236) {
				local9.anIntArray333[local51] = -3;
			} catch (@Pc(243) Exception local243) {
				local9.anIntArray333[local51] = -4;
			} catch (@Pc(250) Throwable local250) {
				local9.anIntArray333[local51] = -5;
			}
		}
		Static100.aClass238_7.method5796(local9);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lclient!ab;III)V")
	public static void method1287(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class8 local14 = arg0.method45(Static383.aClass48_9);
		if (local14 == null) {
			return;
		}
		Static383.aClass48_9.method2496(arg2, arg1, arg2 + arg0.anInt64, arg1 - -arg0.anInt116);
		if (Static55.anInt1202 < 3) {
			Static190.aClass27_12.method5330((float) arg0.anInt64 / 2.0F + (float) arg2, (float) arg0.anInt116 / 2.0F + (float) arg1, ((int) -Static350.aFloat74 & 0x3FFF) << 2, local14, arg2, arg1);
		} else {
			Static383.aClass48_9.method2513(local14, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public static void method1288() {
		if (Static42.aClass89_1 != null) {
			Static42.aClass89_1.method5863();
		}
		if (Static157.aClass89_2 != null) {
			Static157.aClass89_2.method5863();
		}
		Static1.method6018(Static41.aBoolean51);
		Static42.aClass89_1 = Static390.method6112(0, 22050, Static343.aCanvas5, Static154.aClass123_2);
		Static42.aClass89_1.method5864(Static310.aClass2_Sub11_Sub1_3);
		Static157.aClass89_2 = Static390.method6112(1, 2048, Static343.aCanvas5, Static154.aClass123_2);
		Static157.aClass89_2.method5864(Static192.aClass2_Sub11_Sub4_1);
	}
}
