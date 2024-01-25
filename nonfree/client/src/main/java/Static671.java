import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public static void method9090() {
		@Pc(9) int[] local9 = new int[Static340.aClass121_1.anInt3173];
		@Pc(11) int local11 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static340.aClass121_1.anInt3173; local19++) {
			@Pc(26) Class216 local26 = Static340.aClass121_1.method2647(local19);
			if (local26.anInt6092 >= 0 || local26.anInt6076 >= 0) {
				local9[local11++] = local19;
			}
		}
		Static619.anIntArray666 = new int[local11];
		for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
			Static619.anIntArray666[local47] = local9[local47];
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!pja;I)V")
	public static void method9094(@OriginalArg(0) Class6_Sub4_Sub12 arg0) {
		if (arg0 == null) {
			return;
		}
		Static31.aClass362_3.method8536(arg0);
		Static183.anInt3155++;
		@Pc(39) Class6_Sub4_Sub10 local39;
		if (arg0.aBoolean505 || "".equals(arg0.aString98)) {
			local39 = new Class6_Sub4_Sub10(arg0.aString98);
			Static305.anInt5201++;
		} else {
			@Pc(33) long local33 = arg0.aLong225;
			for (local39 = (Class6_Sub4_Sub10) Static472.aClass209_45.method5038(local33); local39 != null && !local39.aString71.equals(arg0.aString98); local39 = (Class6_Sub4_Sub10) Static472.aClass209_45.method5042()) {
			}
			if (local39 == null) {
				local39 = (Class6_Sub4_Sub10) Static653.aClass10_63.method373(local33);
				if (local39 != null && !local39.aString71.equals(arg0.aString98)) {
					local39 = null;
				}
				if (local39 == null) {
					local39 = new Class6_Sub4_Sub10(arg0.aString98);
				}
				Static472.aClass209_45.method5035(local33, local39);
				Static305.anInt5201++;
			}
		}
		if (local39.method4629(arg0)) {
			Static376.method5350(local39);
		}
	}
}
