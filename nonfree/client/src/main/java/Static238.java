import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!iia", name = "z", descriptor = "[Lclient!nr;")
	public static Class228[] aClass228Array1;

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(Z)V")
	public static void method4143() {
		@Pc(7) Class171 local7 = null;
		try {
			local7 = Static177.method3227("2");
			@Pc(20) Class6_Sub40 local20 = new Class6_Sub40(Static420.anInt7697 * 6 + 3);
			local20.method8589(1);
			local20.method8561(Static420.anInt7697);
			for (@Pc(30) int local30 = 0; local30 < Static522.anIntArray557.length; local30++) {
				if (Static211.aBooleanArray25[local30]) {
					local20.method8561(local30);
					local20.method8554(Static522.anIntArray557[local30]);
				}
			}
			local7.method4937(local20.aByteArray113, 0, local20.anInt10169);
		} catch (@Pc(61) Exception local61) {
		}
		try {
			if (local7 != null) {
				local7.method4934();
			}
		} catch (@Pc(68) Exception local68) {
		}
		Static603.aLong264 = Static32.method595();
		Static318.aBoolean410 = false;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIIIBLclient!ha;I)Lclient!ka;")
	public static Class24 method4144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) long local11 = (long) arg5;
		@Pc(17) Class24 local17 = (Class24) Static560.aClass166_55.method4805(local11);
		if (local17 == null) {
			@Pc(27) Class64 local27 = Static84.method1447(Static70.aClass353_13, arg5);
			if (local27 == null) {
				return null;
			}
			if (local27.anInt1991 < 13) {
				local27.method1647();
			}
			local17 = arg4.method8770(local27, 2055, Static40.anInt810, 64, 768);
			Static560.aClass166_55.method4803(local17, local11);
		}
		local17 = local17.method6850((byte) 2, 2055, true);
		if (arg1 != 0) {
			local17.a(arg1);
		}
		if (arg3 != 0) {
			local17.FA(arg3);
		}
		if (arg0 != 0) {
			local17.VA(arg0);
		}
		if (arg2 != 0) {
			local17.H(0, arg2, 0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(II)Z")
	public static boolean method4146(@OriginalArg(1) int arg0) {
		if (arg0 == 51 || arg0 == 23 || arg0 == 45 || arg0 == 49 || arg0 == 57) {
			return true;
		} else {
			return arg0 == 2 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!iia", name = "a", descriptor = "(IIIBIII)V")
	public static void method4147(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class19[] local3 = Static325.aClass19Array1;
		for (@Pc(12) int local12 = 0; local12 < local3.length; local12++) {
			@Pc(18) Class19 local18 = local3[local12];
			if (local18 != null && local18.anInt332 == 2) {
				Static269.method4785(arg2 >> 1, local18.anInt333, local18.anInt336, arg0 >> 1, local18.anInt339, local18.anInt335 * 2);
				if (Static258.anIntArray298[0] > -1 && Static113.anInt2243 % 20 < 10) {
					@Pc(64) Class32 local64 = Static30.aClass32Array11[local18.anInt334];
					@Pc(73) int local73 = arg3 + Static258.anIntArray298[0] - 12;
					@Pc(81) int local81 = Static258.anIntArray298[1] + arg1 - 28;
					local64.method5071(local73, local81);
					Static347.method5621(local81 + local64.method5079(), local64.method5080() + local73, local81, local73);
				}
			}
		}
	}
}
