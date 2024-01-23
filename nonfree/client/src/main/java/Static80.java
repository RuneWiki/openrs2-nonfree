import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/Object;BLclient!jh;)V")
	public static void method1356(@OriginalArg(0) Object arg0, @OriginalArg(2) Class84 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < 50 && arg1.anEventQueue1.peekEvent() != null; local13++) {
			Static275.method4233(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!ak;B)V")
	public static void method1357(@OriginalArg(0) Class7 arg0) {
		Static170.anInt3126 = arg0.method264("p11_full");
		Static47.anInt5870 = arg0.method264("p12_full");
		Static152.anInt2815 = arg0.method264("b12_full");
		Static173.anInt3185 = arg0.method264("mapfunction");
		Static197.anInt3815 = arg0.method264("hitmarks");
		Static44.anInt992 = arg0.method264("hitbar_default");
		Static49.anInt1061 = arg0.method264("headicons_pk");
		Static196.anInt3779 = arg0.method264("headicons_prayer");
		Static126.anInt2417 = arg0.method264("hint_headicons");
		Static273.anInt5454 = arg0.method264("hint_mapmarkers");
		Static244.anInt5022 = arg0.method264("mapflag");
		Static36.anInt4786 = arg0.method264("cross");
		Static14.anInt370 = arg0.method264("mapdots");
		Static291.anInt5792 = arg0.method264("scrollbar");
		Static174.anInt3208 = arg0.method264("name_icons");
		Static289.anInt5741 = arg0.method264("floorshadows");
		Static119.anInt4991 = arg0.method264("compass");
		Static81.anInt1617 = arg0.method264("hint_mapedge");
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method1358(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static2.method60(arg1, arg0);
		@Pc(12) int local12 = 0;
		@Pc(17) String[] local17 = new String[local10 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(32) int local32;
			for (local32 = local19; arg0.charAt(local32) != arg1; local32++) {
			}
			local17[local12++] = arg0.substring(local19, local32);
			local19 = local32 + 1;
		}
		local17[local10] = arg0.substring(local19);
		return local17;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)V")
	public static void method1360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < Static47.anInt5867; local3++) {
			@Pc(14) Class182 local14 = Static106.method1680(local3);
			if (local14 != null) {
				@Pc(19) int local19 = local14.anInt5922;
				if (local19 >= 0 && !Static208.anInterface4_1.method990(local19)) {
					local19 = -1;
				}
				@Pc(49) int local49;
				@Pc(54) int local54;
				@Pc(60) int local60;
				@Pc(87) int local87;
				if (local14.anInt5918 >= 0) {
					local54 = local14.anInt5918;
					local60 = arg1 + (local54 & 0x7F);
					if (local60 < 0) {
						local60 = 0;
					} else if (local60 > 127) {
						local60 = 127;
					}
					local87 = local60 + (local54 & 0x380) + (local54 - -arg0 & 0xFC00);
					local49 = Static208.anIntArray476[Static189.method2841(96, local87)];
				} else if (local19 >= 0) {
					local49 = Static208.anIntArray476[Static189.method2841(96, Static208.anInterface4_1.method991(local19))];
				} else if (local14.anInt5910 == -1) {
					local49 = -1;
				} else {
					local54 = local14.anInt5910;
					local60 = arg1 + (local54 & 0x7F);
					if (local60 < 0) {
						local60 = 0;
					} else if (local60 > 127) {
						local60 = 127;
					}
					local87 = (arg0 + local54 & 0xFC00) + ((local54 & 0x380) + local60);
					local49 = Static208.anIntArray476[Static189.method2841(96, local87)];
				}
				Static163.anIntArray529[local3 + 1] = local49;
			}
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!ak;ILclient!ak;)V")
	public static void method1361(@OriginalArg(0) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static271.aClass7_217 = arg0;
		Static167.aClass7_137 = arg1;
		@Pc(10) int local10 = (int) (Math.random() * 21.0D) - 10;
		Static167.aClass7_137.method265(34);
		@Pc(30) int local30 = (int) (Math.random() * 21.0D) - 10;
		@Pc(37) int local37 = (int) (Math.random() * 41.0D) - 20;
		@Pc(44) int local44 = (int) (Math.random() * 21.0D) - 10;
		Static8.anInt240 = local37 + local10;
		Static1.anInt8 = local37 + local30;
		Static25.anInt2863 = local37 + local44;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public static void method1362() {
		Static133.aClass31_21.method855();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public static void method1363(@OriginalArg(1) int arg0) {
		@Pc(4) Class1_Sub2_Sub11 local4 = Static163.method3579(7, arg0);
		local4.method1853();
	}
}
