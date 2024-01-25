import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "J")
	public static long aLong212;

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Lclient!il;")
	public static final Class144 aClass144_3 = new Class144();

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method6712(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 == '<' || local18 == '>') {
				local10 += 3;
			}
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(local10 + local8);
		for (@Pc(40) int local40 = 0; local40 < local8; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local46 == '<') {
				local38.append("<lt>");
			} else if (local46 == '>') {
				local38.append("<gt>");
			} else {
				local38.append(local46);
			}
		}
		return local38.toString();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZI)I")
	public static int method6713(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class6_Sub6 local10 = Static612.method8391(arg0, arg1);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray32.length; local32++) {
				if (arg2 == local10.anIntArray33[local32]) {
					local22 += local10.anIntArray32[local32];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "()V")
	public static void method6714() {
		for (@Pc(1) int local1 = 0; local1 < Static93.aClass188Array1.length; local1++) {
			Static93.aClass188Array1[local1].method5373();
		}
		Static93.aClass188Array1 = null;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!ha;IIII)V")
	public static void method6716(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if ((Static565.aClass4_30 == null || Static442.aClass4_20 == null || Static91.aClass4_9 == null) && Static436.aClass223_98.method5951(Static53.anInt1786) && Static436.aClass223_98.method5951(Static169.anInt3770) && Static436.aClass223_98.method5951(Static283.anInt8425)) {
			@Pc(38) Class331 local38 = Static655.method7892(Static436.aClass223_98, Static169.anInt3770, 0);
			Static442.aClass4_20 = arg1.method6121(local38, true);
			local38.method7898();
			Static396.aClass4_19 = arg1.method6121(local38, true);
			Static565.aClass4_30 = arg1.method6121(Static655.method7892(Static436.aClass223_98, Static53.anInt1786, 0), true);
			@Pc(63) Class331 local63 = Static655.method7892(Static436.aClass223_98, Static283.anInt8425, 0);
			Static91.aClass4_9 = arg1.method6121(local63, true);
			local63.method7898();
			Static624.aClass4_33 = arg1.method6121(local63, true);
		}
		if (Static565.aClass4_30 == null || Static442.aClass4_20 == null || Static91.aClass4_9 == null) {
			return;
		}
		@Pc(92) int local92 = (arg0 - Static91.aClass4_9.method7697() * 2) / Static565.aClass4_30.method7697();
		for (@Pc(94) int local94 = 0; local94 < local92; local94++) {
			Static565.aClass4_30.method7698(arg3 + Static91.aClass4_9.method7697() + Static565.aClass4_30.method7697() * local94, -Static565.aClass4_30.method7694() + arg2 + arg4);
		}
		@Pc(129) int local129 = (arg4 - Static91.aClass4_9.method7694() - 20) / Static442.aClass4_20.method7694();
		for (@Pc(131) int local131 = 0; local131 < local129; local131++) {
			Static442.aClass4_20.method7698(arg3, arg2 + Static442.aClass4_20.method7694() * local131 + 20);
			Static396.aClass4_19.method7698(arg0 + arg3 - Static396.aClass4_19.method7697(), local131 * Static442.aClass4_20.method7694() + 20 + arg2);
		}
		Static91.aClass4_9.method7698(arg3, arg2 + arg4 - Static91.aClass4_9.method7694());
		Static624.aClass4_33.method7698(arg0 + arg3 - Static91.aClass4_9.method7697(), arg2 - (-arg4 + Static91.aClass4_9.method7694()));
	}
}
