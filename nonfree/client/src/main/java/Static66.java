import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[Lclient!ne;)V")
	public static void method1648(@OriginalArg(0) int arg0, @OriginalArg(2) Class146[] arg1) {
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) Class146 local17 = arg1[local11];
			if (local17 != null) {
				if (local17.anInt4135 == 0) {
					if (local17.aClass146Array2 != null) {
						method1648(arg0, local17.aClass146Array2);
					}
					@Pc(41) Class14_Sub27 local41 = (Class14_Sub27) Static198.aClass25_20.method691((long) local17.anInt4214);
					if (local41 != null) {
						Static266.method4536(arg0, local41.anInt5186);
					}
				}
				@Pc(60) Class14_Sub15 local60;
				if (arg0 == 0 && local17.anObjectArray14 != null) {
					local60 = new Class14_Sub15();
					local60.anObjectArray3 = local17.anObjectArray14;
					local60.aClass146_22 = local17;
					Static10.method223(local60);
				}
				if (arg0 == 1 && local17.anObjectArray28 != null) {
					if (local17.anInt4126 >= 0) {
						@Pc(86) Class146 local86 = Static273.method4632(local17.anInt4214);
						if (local86 == null || local86.aClass146Array2 == null || local86.aClass146Array2.length <= local17.anInt4126 || local86.aClass146Array2[local17.anInt4126] != local17) {
							continue;
						}
					}
					local60 = new Class14_Sub15();
					local60.aClass146_22 = local17;
					local60.anObjectArray3 = local17.anObjectArray28;
					Static10.method223(local60);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)Z")
	public static boolean method1649() {
		@Pc(8) Class14_Sub23 local8 = (Class14_Sub23) Static95.aClass18_9.aClass14_17.aClass14_247;
		if (local8 == null || local8 == Static95.aClass18_9.aClass14_17) {
			return false;
		} else {
			if (local8.anInt4355 >= 2000) {
				local8.anInt4355 -= 2000;
			}
			return local8.anInt4355 == 1004;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB[B)I")
	public static int method1650(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static280.method5741(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class14_Sub2_Sub20 method1651(@OriginalArg(0) int arg0) {
		@Pc(15) Class14_Sub2_Sub20 local15 = (Class14_Sub2_Sub20) Static337.aClass178_9.method4772((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static159.aClass143_66.method3745(5, arg0);
		local15 = new Class14_Sub2_Sub20();
		if (local25 != null) {
			local15.method4674(new Class14_Sub4(local25));
		}
		Static337.aClass178_9.method4767(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)V")
	public static void method1652(@OriginalArg(1) int arg0) {
		@Pc(12) Class14_Sub2_Sub13 local12 = Static1.method5711(5, arg0);
		local12.method3539();
	}
}
