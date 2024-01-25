import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!iga", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[8];

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)V")
	public static void method3633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg1 | (long) arg0 << 32, 19);
		local14.method2822();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)I")
	public static int method3634() {
		@Pc(12) int local12 = 0;
		@Pc(22) Field[] local22 = gn.class.getDeclaredFields();
		for (@Pc(26) int local26 = 0; local26 < local22.length; local26++) {
			@Pc(32) Field local32 = local22[local26];
			if (qa.class.isAssignableFrom(local32.getType())) {
				local12++;
			}
		}
		return local12 + 1;
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(Z)Lclient!so;")
	public static Class14_Sub29 method3635() {
		@Pc(8) Class14_Sub29 local8 = new Class14_Sub29(518);
		Static647.anIntArray809 = new int[4];
		Static647.anIntArray809[1] = (int) (Math.random() * 9.9999999E7D);
		Static647.anIntArray809[2] = (int) (Math.random() * 9.9999999E7D);
		Static647.anIntArray809[3] = (int) (Math.random() * 9.9999999E7D);
		Static647.anIntArray809[0] = (int) (Math.random() * 9.9999999E7D);
		local8.method5854(10);
		local8.method5861(Static647.anIntArray809[0]);
		local8.method5861(Static647.anIntArray809[1]);
		local8.method5861(Static647.anIntArray809[2]);
		local8.method5861(Static647.anIntArray809[3]);
		return local8;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIIIIIIILclient!ha;)V")
	public static void method3636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class137 arg7) {
		@Pc(16) Interface19 local16 = (Interface19) Static622.method8738(arg0, arg2, arg4);
		@Pc(25) Class203 local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(51) int local51;
		if (local16 != null) {
			local25 = Static511.aClass13_2.method86(local16.method9171());
			local31 = local16.method9174() & 0x3;
			local35 = local16.method9175();
			if (local25.anInt6019 == -1) {
				local51 = arg3;
				if (local25.anInt6045 > 0) {
					local51 = arg1;
				}
				if (local35 == 0 || local35 == 2) {
					if (local31 == 0) {
						arg7.method7947(arg5, 4, arg6, local51);
					} else if (local31 == 1) {
						arg7.method7891(4, arg6, local51, arg5);
					} else if (local31 == 2) {
						arg7.method7947(arg5 + 3, 4, arg6, local51);
					} else if (local31 == 3) {
						arg7.method7891(4, arg6 + 3, local51, arg5);
					}
				}
				if (local35 == 3) {
					if (local31 == 0) {
						arg7.method7869(arg5, 1, local51, arg6, 1);
					} else if (local31 == 1) {
						arg7.method7869(arg5 + 3, 1, local51, arg6, 1);
					} else if (local31 == 2) {
						arg7.method7869(arg5 + 3, 1, local51, arg6 + 3, 1);
					} else if (local31 == 3) {
						arg7.method7869(arg5, 1, local51, arg6 + 3, 1);
					}
				}
				if (local35 == 2) {
					if (local31 == 0) {
						arg7.method7891(4, arg6, local51, arg5);
					} else if (local31 == 1) {
						arg7.method7947(arg5 + 3, 4, arg6, local51);
					} else if (local31 == 2) {
						arg7.method7891(4, arg6 + 3, local51, arg5);
					} else if (local31 == 3) {
						arg7.method7947(arg5, 4, arg6, local51);
					}
				}
			} else {
				Static557.method7832(arg5, arg6, local25, arg7, local31);
			}
		}
		local16 = (Interface19) Static595.method8438(arg0, arg2, arg4, nq.class);
		if (local16 != null) {
			local25 = Static511.aClass13_2.method86(local16.method9171());
			local31 = local16.method9174() & 0x3;
			local35 = local16.method9175();
			if (local25.anInt6019 != -1) {
				Static557.method7832(arg5, arg6, local25, arg7, local31);
			} else if (local35 == 9) {
				local51 = -1118482;
				if (local25.anInt6045 > 0) {
					local51 = -1179648;
				}
				if (local31 == 0 || local31 == 2) {
					arg7.method7877(local51, arg6, arg6 + 3, arg5 + 3, arg5);
				} else {
					arg7.method7877(local51, arg6 + 3, arg6, arg5 + 3, arg5);
				}
			}
		}
		local16 = (Interface19) Static430.method6312(arg0, arg2, arg4);
		if (local16 == null) {
			return;
		}
		local25 = Static511.aClass13_2.method86(local16.method9171());
		local31 = local16.method9174() & 0x3;
		if (local25.anInt6019 != -1) {
			Static557.method7832(arg5, arg6, local25, arg7, local31);
			return;
		}
	}
}
