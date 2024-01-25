import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "Lclient!bi;")
	public static Class31 aClass31_118;

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "Lclient!lt;")
	public static final Class215 aClass215_3 = new Class215("RC", 1);

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "Lclient!jw;")
	public static final Class183 aClass183_40 = new Class183(8);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I[B)Lclient!wm;")
	public static Class4_Sub7_Sub18 method7614(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class4_Sub7_Sub18 local9 = new Class4_Sub7_Sub18();
		@Pc(14) Class4_Sub9 local14 = new Class4_Sub9(arg0);
		local14.anInt7219 = local14.aByteArray97.length - 2;
		@Pc(25) int local25 = local14.method5982();
		@Pc(34) int local34 = local14.aByteArray97.length - local25 - 14;
		local14.anInt7219 = local34;
		@Pc(41) int local41 = local14.method6026();
		local9.anInt9701 = local14.method5982();
		local9.anInt9703 = local14.method5982();
		local9.anInt9708 = local14.method5982();
		local9.anInt9700 = local14.method5982();
		@Pc(70) int local70 = local14.method6015();
		@Pc(78) int local78;
		@Pc(84) int local84;
		if (local70 > 0) {
			local9.aClass183Array1 = new Class183[local70];
			for (local78 = 0; local78 < local70; local78++) {
				local84 = local14.method5982();
				@Pc(91) Class183 local91 = new Class183(Static514.method7261(local84));
				local9.aClass183Array1[local78] = local91;
				while (local84-- > 0) {
					@Pc(102) int local102 = local14.method6026();
					@Pc(108) int local108 = local14.method6026();
					local91.method4282((long) local102, new Class4_Sub33(local108));
				}
			}
		}
		local14.anInt7219 = 0;
		local9.aString98 = local14.method5987();
		local9.anIntArray718 = new int[local41];
		local9.anIntArray717 = new int[local41];
		local9.aStringArray39 = new String[local41];
		local78 = 0;
		while (local14.anInt7219 < local34) {
			local84 = local14.method5982();
			if (local84 == 3) {
				local9.aStringArray39[local78] = local14.method6010().intern();
			} else if (local84 >= 100 || local84 == 21 || local84 == 38 || local84 == 39) {
				local9.anIntArray718[local78] = local14.method6015();
			} else {
				local9.anIntArray718[local78] = local14.method6026();
			}
			local9.anIntArray717[local78++] = local84;
		}
		return local9;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)Z")
	public static boolean method7615() {
		try {
			@Pc(7) Class232 local7 = new Class232();
			@Pc(16) byte[] local16 = local7.method5024(Static435.aByteArray102);
			Static533.method7418(local16);
			return true;
		} catch (@Pc(23) Exception local23) {
			return false;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZ)V")
	public static void method7616(@OriginalArg(1) boolean arg0) {
		Static267.anInt5143 = 0;
		Static587.anInt2342 = 0;
		Static395.method5766();
		Static583.method7897(arg0);
		Static181.method3366();
		@Pc(18) boolean local18 = false;
		@Pc(26) int local26;
		for (@Pc(20) int local20 = 0; local20 < Static587.anInt2342; local20++) {
			local26 = Static519.anIntArray677[local20];
			@Pc(33) Class4_Sub50 local33 = (Class4_Sub50) Static106.aClass183_8.method4289((long) local26);
			@Pc(36) Class10_Sub1_Sub2_Sub1 local36 = local33.aClass10_Sub1_Sub2_Sub1_1;
			if (Static325.aBoolean431 && Static496.method7064(local26)) {
				Static31.method556();
			}
			if (local36.anInt8497 != Static237.anInt7561) {
				if (local36.aClass54_1.method1117()) {
					Static158.method3140(local36);
				}
				local36.method3531(null);
				local33.method8013();
				local18 = true;
			}
		}
		if (local18) {
			Static566.anInt9466 = Static106.aClass183_8.method4291();
			Static106.aClass183_8.method4284(Static161.aClass4_Sub50Array1);
		}
		if (Static487.aClass4_Sub9_Sub1_2.anInt7219 != Static474.anInt4412) {
			throw new RuntimeException("gnp1 pos:" + Static487.aClass4_Sub9_Sub1_2.anInt7219 + " psize:" + Static474.anInt4412);
		}
		for (local26 = 0; local26 < Static428.anInt7363; local26++) {
			if (Static106.aClass183_8.method4289((long) Static444.anIntArray617[local26]) == null) {
				throw new RuntimeException("gnp2 pos:" + local26 + " size:" + Static428.anInt7363);
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public static void method7617() {
		if (Static396.anInt6918 < 0) {
			return;
		}
		@Pc(13) long local13 = Static184.method3422();
		Static396.anInt6918 = (int) ((long) Static396.anInt6918 + Static125.aLong61 - local13);
		if (Static396.anInt6918 > 0) {
			@Pc(30) int local30 = (Static396.anInt6918 << 8) / Static572.anInt9517;
			@Pc(35) int local35 = 255 - local30;
			@Pc(40) float local40 = (float) local30 / 255.0F;
			Static32.anInt606 = ((Static237.aClass285_4.anInt7591 & 0xFF00) * local35 + (Static115.anInt2695 & 0xFF00) * local30 & 0xFF0000) + ((Static115.anInt2695 & 0xFF00FF) * local30 + (Static237.aClass285_4.anInt7591 & 0xFF00FF) * local35 & 0xFF00FF00) >>> 8;
			@Pc(77) float local77 = 1.0F - local40;
			Static530.anInt9010 = Static237.aClass285_4.anInt7590 * local35 + Static94.anInt2394 * local30 >> 8;
			Static549.aFloat196 = Static444.aFloat146 + (Static237.aClass285_4.aFloat152 - Static444.aFloat146) * local77;
			Static518.aFloat190 = Static466.aFloat159 + (Static237.aClass285_4.aFloat150 - Static466.aFloat159) * local77;
			Static460.aFloat157 = local77 * (Static237.aClass285_4.aFloat149 - Static269.aFloat96) + Static269.aFloat96;
			Static462.aFloat158 = local77 * (Static237.aClass285_4.aFloat147 - Static117.aFloat50) + Static117.aFloat50;
			Static404.aFloat142 = local77 * (Static237.aClass285_4.aFloat148 - Static367.aFloat166) + Static367.aFloat166;
			Static148.anInt7119 = (local35 * (Static237.aClass285_4.anInt7600 & 0xFF00FF) + local30 * (Static184.anInt3919 & 0xFF00FF) & 0xFF00FF00) + (local30 * (Static184.anInt3919 & 0xFF00) + (Static237.aClass285_4.anInt7600 & 0xFF00) * local35 & 0xFF0000) >>> 8;
			Static138.aFloat194 = (Static237.aClass285_4.aFloat151 - Static508.aFloat186) * local77 + Static508.aFloat186;
			if (Static237.aClass285_4.aClass75_4 != Static371.aClass75_3) {
				Static117.aClass75_1 = Static249.aClass66_9.method6775(Static371.aClass75_3, Static237.aClass285_4.aClass75_4, local77, Static117.aClass75_1);
			}
		} else {
			Static460.aFloat157 = Static237.aClass285_4.aFloat149;
			Static530.anInt9010 = Static237.aClass285_4.anInt7590;
			Static404.aFloat142 = Static237.aClass285_4.aFloat148;
			Static549.aFloat196 = Static237.aClass285_4.aFloat152;
			Static32.anInt606 = Static237.aClass285_4.anInt7591;
			Static518.aFloat190 = Static237.aClass285_4.aFloat150;
			Static396.anInt6918 = -1;
			Static117.aClass75_1 = Static237.aClass285_4.aClass75_4;
			Static148.anInt7119 = Static237.aClass285_4.anInt7600;
			Static138.aFloat194 = Static237.aClass285_4.aFloat151;
			Static462.aFloat158 = Static237.aClass285_4.aFloat147;
		}
		Static125.aLong61 = local13;
	}
}
