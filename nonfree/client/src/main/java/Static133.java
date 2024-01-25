import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!sb;")
	public static Class219 aClass219_2;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "[Lclient!kn;")
	public static final Class135[] aClass135Array1 = new Class135[8];

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
	public static final int[] anIntArray159 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
	public static boolean method2050(@OriginalArg(0) int arg0) {
		if (arg0 == 21 || arg0 == 60 || arg0 == 51 || arg0 == 2 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 11 || arg0 == 1006;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ur;I)V")
	public static void method2051(@OriginalArg(0) Class34_Sub2 arg0) {
		@Pc(16) byte[] local16;
		if (Static131.anObject4 == null) {
			@Pc(9) Class42_Sub1_Sub1 local9 = new Class42_Sub1_Sub1();
			local16 = local9.method1036();
			Static131.anObject4 = Static316.method4271(local16);
		}
		if (Static72.anObject2 == null) {
			@Pc(31) Class42_Sub2_Sub1 local31 = new Class42_Sub2_Sub1();
			local16 = local31.method2868();
			Static72.anObject2 = Static316.method4271(local16);
		}
		@Pc(46) Class222 local46 = arg0.aClass222_1;
		if (local46.method4886() && Static110.anObject3 == null) {
			local16 = Static176.method941(16.0F, 4.0F, new Class166_Sub1(419684), 0.5F, 4.0F, 0.6F);
			Static110.anObject3 = Static316.method4271(local16);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILclient!ns;B)Lclient!bq;")
	public static Class27 method2053(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub5 arg1) {
		@Pc(7) Class27 local7;
		if (Static175.aClass27_2 == null) {
			local7 = new Class27();
		} else {
			local7 = Static175.aClass27_2;
			Static175.aClass27_2 = Static175.aClass27_2.aClass27_1;
			Static280.anInt4968--;
			local7.aClass27_1 = null;
		}
		local7.anInt686 = arg0;
		local7.aClass25_Sub5_1 = arg1;
		return local7;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIB)V")
	public static void method2055(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static359.aClass169ArrayArrayArray5 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 | arg0 << 28 | arg1 << 14);
		@Pc(25) Class1_Sub2 local25 = (Class1_Sub2) Static425.aClass199_179.method4387(local19);
		if (local25 == null) {
			Static311.method4238(arg0, arg2, arg1);
			return;
		}
		@Pc(45) Class1_Sub32 local45 = (Class1_Sub32) local25.aClass227_3.method4967();
		if (local45 == null) {
			Static311.method4238(arg0, arg2, arg1);
			return;
		}
		@Pc(59) Class25_Sub3_Sub1 local59 = (Class25_Sub3_Sub1) Static311.method4238(arg0, arg2, arg1);
		if (local59 == null) {
			local59 = new Class25_Sub3_Sub1();
		} else {
			local59.anInt1536 = local59.anInt1538 = -1;
		}
		local59.anInt1542 = local45.anInt4854;
		local59.anInt1543 = local45.anInt4852;
		label44: while (true) {
			@Pc(87) Class1_Sub32 local87 = (Class1_Sub32) local25.aClass227_3.method4973();
			if (local87 == null) {
				break;
			}
			if (local87.anInt4852 != local59.anInt1543) {
				local59.anInt1547 = local87.anInt4854;
				local59.anInt1536 = local87.anInt4852;
				while (true) {
					@Pc(108) Class1_Sub32 local108 = (Class1_Sub32) local25.aClass227_3.method4973();
					if (local108 == null) {
						break label44;
					}
					if (local59.anInt1543 != local108.anInt4852 && local59.anInt1536 != local108.anInt4852) {
						local59.anInt1541 = local108.anInt4854;
						local59.anInt1538 = local108.anInt4852;
					}
				}
			}
		}
		@Pc(148) int local148 = Static335.method4499(arg0, (arg2 << 7) + 64, (arg1 << 7) - -64);
		Static451.method5904(arg0, arg2, arg1, local148, local59);
	}
}
