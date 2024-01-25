import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)[Lclient!lg;")
	public static Class146[] method5645() {
		return new Class146[] { Static437.aClass146_15, Static437.aClass146_16, Static375.aClass146_11, Static384.aClass146_12, Static18.aClass146_2, Static286.aClass146_7, Static126.aClass146_3, Static4.aClass146_1, Static455.aClass146_8, Static430.aClass146_14, Static395.aClass146_13, Static136.aClass146_4, Static371.aClass146_10, Static327.aClass146_9, Static445.aClass146_17 };
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)[Lclient!nq;")
	public static Class171[] method5651() {
		if (Static260.aClass171Array1 == null) {
			@Pc(11) Class171[] local11 = Static122.method1810(Static119.aClass138_7);
			@Pc(15) Class171[] local15 = new Class171[local11.length];
			@Pc(17) int local17 = 0;
			@Pc(69) int local69;
			@Pc(75) Class171 local75;
			label63: for (@Pc(19) int local19 = 0; local19 < local11.length; local19++) {
				@Pc(25) Class171 local25 = local11[local19];
				if ((local25.anInt4872 <= 0 || local25.anInt4872 >= 24) && local25.anInt4868 >= 800 && local25.anInt4869 >= 600 && (Static113.anInt5764 >= 96 || Static285.anInt7839 != 0 || local25.anInt4868 <= 1024 && local25.anInt4869 <= 768)) {
					for (local69 = 0; local69 < local17; local69++) {
						local75 = local15[local69];
						if (local75.anInt4868 == local25.anInt4868 && local75.anInt4869 == local25.anInt4869) {
							if (local75.anInt4872 < local25.anInt4872) {
								local15[local69] = local25;
							}
							continue label63;
						}
					}
					local15[local17] = local25;
					local17++;
				}
			}
			Static260.aClass171Array1 = new Class171[local17];
			Static460.method4214(local15, 0, Static260.aClass171Array1, 0, local17);
			@Pc(135) int[] local135 = new int[Static260.aClass171Array1.length];
			for (local69 = 0; local69 < Static260.aClass171Array1.length; local69++) {
				local75 = Static260.aClass171Array1[local69];
				local135[local69] = local75.anInt4869 * local75.anInt4868;
			}
			Static255.method3760(Static260.aClass171Array1, local135);
		}
		return Static260.aClass171Array1;
	}
}
