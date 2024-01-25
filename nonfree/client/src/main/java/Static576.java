import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static576 {

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "Lclient!dga;")
	public static Class73_Sub1 aClass73_Sub1_2;

	@OriginalMember(owner = "client!ti", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString111 = null;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!aj;Lclient!aj;Lclient!aj;ILclient!aj;)V")
	public static void method8131(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(4) Class15 arg3) {
		Static322.aClass15_85 = arg2;
		Static306.aClass15_81 = arg3;
		Static250.aClass15_70 = arg1;
		Static489.aClass260ArrayArray3 = new Class260[Static322.aClass15_85.method516()][];
		Static509.aBooleanArray39 = new boolean[Static322.aClass15_85.method516()];
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!wp;I)I")
	public static int method8133(@OriginalArg(0) Class28_Sub1_Sub1_Sub1_Sub2 arg0) {
		@Pc(8) Class300 local8 = arg0.aClass300_1;
		if (local8.anIntArray696 != null) {
			local8 = local8.method7258(Static131.aClass66_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(31) int local31 = local8.anInt8294;
		@Pc(35) Class359 local35 = arg0.method9315();
		if (arg0.anInt10749 == -1 || arg0.aBoolean820) {
			local31 = local8.anInt8322;
		} else if (arg0.anInt10749 == local35.anInt10008 || local35.anInt9990 == arg0.anInt10749 || local35.anInt9984 == arg0.anInt10749 || local35.anInt9986 == arg0.anInt10749) {
			local31 = local8.anInt8308;
		} else if (local35.anInt9966 == arg0.anInt10749 || arg0.anInt10749 == local35.anInt9974 || arg0.anInt10749 == local35.anInt9976 || arg0.anInt10749 == local35.anInt9997) {
			local31 = local8.anInt8302;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Lclient!sca;")
	public static Class314 method8134(@OriginalArg(0) int arg0) {
		@Pc(8) Class314[] local8 = Static207.method3654();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(24) Class314 local24 = local8[local10];
			if (local24.anInt8926 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public static void method8135(@OriginalArg(0) int arg0) {
		Static47.anInt1077 = arg0;
	}
}
