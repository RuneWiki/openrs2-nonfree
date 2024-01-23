import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
	public static int[] anIntArray382;

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "Lclient!o;")
	public static Class86 aClass86_17;

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public static volatile int anInt5001 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
	public static void method3742() {
		while (true) {
			if (Static194.aClass1_Sub26_Sub1_3.method3008(Static24.anInt450) >= 11) {
				@Pc(18) int local18 = Static194.aClass1_Sub26_Sub1_3.method3007(11);
				if (local18 != 2047) {
					@Pc(23) boolean local23 = false;
					if (Static198.aClass5_Sub5_Sub1Array1[local18] == null) {
						local23 = true;
						Static198.aClass5_Sub5_Sub1Array1[local18] = new Class5_Sub5_Sub1();
						if (Static29.aClass1_Sub26Array1[local18] != null) {
							Static198.aClass5_Sub5_Sub1Array1[local18].method1017(Static29.aClass1_Sub26Array1[local18]);
						}
					}
					Static16.anIntArray38[Static10.anInt285++] = local18;
					@Pc(59) Class5_Sub5_Sub1 local59 = Static198.aClass5_Sub5_Sub1Array1[local18];
					local59.anInt3009 = Static128.anInt2802;
					@Pc(69) int local69 = Static71.anIntArray150[Static194.aClass1_Sub26_Sub1_3.method3007(3)];
					if (local23) {
						local59.anInt2994 = local59.anInt3040 = local69;
					}
					@Pc(82) int local82 = Static194.aClass1_Sub26_Sub1_3.method3007(5);
					@Pc(87) int local87 = Static194.aClass1_Sub26_Sub1_3.method3007(5);
					@Pc(92) int local92 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
					if (local87 > 15) {
						local87 -= 32;
					}
					if (local92 == 1) {
						Static12.anIntArray35[Static189.anInt4167++] = local18;
					}
					@Pc(112) int local112 = Static194.aClass1_Sub26_Sub1_3.method3007(1);
					if (local82 > 15) {
						local82 -= 32;
					}
					local59.method2311(Static204.aClass5_Sub5_Sub1_2.anIntArray256[0] + local87, local112 == 1, Static204.aClass5_Sub5_Sub1_2.anIntArray260[0] + local82);
					continue;
				}
			}
			Static194.aClass1_Sub26_Sub1_3.method3001();
			return;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "([B[Lclient!jc;BZII)V")
	public static void method3744(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class60[] arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(14) Class1_Sub26 local14 = new Class1_Sub26(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method2996();
			if (local20 == 0) {
				return;
			}
			@Pc(27) int local27 = 0;
			local16 += local20;
			while (true) {
				@Pc(35) int local35 = local14.method2946();
				if (local35 == 0) {
					break;
				}
				local27 += local35 - 1;
				@Pc(47) int local47 = local27 & 0x3F;
				@Pc(53) int local53 = local27 >> 6 & 0x3F;
				@Pc(57) int local57 = local27 >> 12;
				@Pc(61) int local61 = local14.method2945();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(74) int local74 = local47 + arg2;
				@Pc(79) int local79 = local53 + arg3;
				if (local79 > 0 && local74 > 0 && local79 < 103 && local74 < 103) {
					@Pc(99) Class60 local99 = null;
					@Pc(103) int local103 = local57;
					if ((Static221.aByteArrayArrayArray14[1][local79][local74] & 0x2) == 2) {
						local103 = local57 - 1;
					}
					if (local103 >= 0) {
						local99 = arg1[local103];
					}
					Static202.method3237(local16, local99, local65, local57, local79, local69, local74, true, local57);
				}
			}
		}
	}
}
