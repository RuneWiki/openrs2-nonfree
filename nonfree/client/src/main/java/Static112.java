import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lclient!o;")
	public static Class49[] aClass49Array6;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	public static int anInt1900 = 100;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!pv;[I[IB[I)V")
	public static void method1552(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) int local9 = arg1[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg2[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg0.aClass185Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass185Array3[local19] = null;
					} else {
						@Pc(44) Class143 local44 = Static271.aClass219_4.method4752(local9);
						@Pc(47) int local47 = local44.anInt3772;
						@Pc(52) Class185 local52 = arg0.aClass185Array3[local19];
						if (local52 != null) {
							if (local52.anInt4811 == local9) {
								if (local47 == 0) {
									local52 = arg0.aClass185Array3[local19] = null;
								} else if (local47 == 1) {
									local52.anInt4809 = 0;
									local52.anInt4807 = 0;
									local52.anInt4806 = 1;
									local52.anInt4808 = 0;
									local52.anInt4804 = local17;
									Static340.method4406(false, local44, arg0.anInt7500, 0, arg0.anInt7502, arg0.aByte105);
								} else if (local47 == 2) {
									local52.anInt4807 = 0;
								}
							} else if (local44.anInt3783 >= Static271.aClass219_4.method4752(local52.anInt4811).anInt3783) {
								local52 = arg0.aClass185Array3[local19] = null;
							}
						}
						if (local52 == null) {
							local52 = arg0.aClass185Array3[local19] = new Class185();
							local52.anInt4806 = 1;
							local52.anInt4809 = 0;
							local52.anInt4808 = 0;
							local52.anInt4804 = local17;
							local52.anInt4807 = 0;
							local52.anInt4811 = local9;
							Static340.method4406(false, local44, arg0.anInt7500, 0, arg0.anInt7502, arg0.aByte105);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!fi;)Lclient!fi;")
	public static Class76 method1553(@OriginalArg(1) Class76 arg0) {
		@Pc(6) Class76 local6 = Static55.method891(arg0);
		if (local6 == null) {
			local6 = arg0.aClass76_5;
		}
		return local6;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z")
	public static boolean method1554(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}
}
