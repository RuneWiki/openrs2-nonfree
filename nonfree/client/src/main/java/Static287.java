import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!si", name = "n", descriptor = "Lclient!bo;")
	public static Class30 aClass30_7;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray64 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!si", name = "q", descriptor = "J")
	public static long aLong173 = 0L;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BZILclient!pg;Lclient!pg;)I")
	public static int method4783(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class157_Sub1 arg2, @OriginalArg(4) Class157_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg1 == 1) {
			local11 = arg3.anInt4794;
			local14 = arg2.anInt4794;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg1 == 2) {
			return Static2.method7(arg2.method4215().aString48, Static230.anInt4634, arg3.method4215().aString48);
		} else if (arg1 == 3) {
			if (arg3.aString44.equals("-")) {
				if (arg2.aString44.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString44.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static2.method7(arg2.aString44, Static230.anInt4634, arg3.aString44);
			}
		} else if (arg1 == 4) {
			if (arg3.method4207()) {
				return arg2.method4207() ? 0 : 1;
			} else if (arg2.method4207()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg3.method4213()) {
				return arg2.method4213() ? 0 : 1;
			} else if (arg2.method4213()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg3.method4206()) {
				return arg2.method4206() ? 0 : 1;
			} else if (arg2.method4206()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg3.method4210()) {
				return arg2.method4210() ? 0 : 1;
			} else if (arg2.method4210()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local11 = arg3.anInt4798;
			local14 = arg2.anInt4798;
			if (arg0) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local11 == 1000) {
					local11 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg3.anInt4799 - arg2.anInt4799;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!nq;ILclient!uo;)V")
	public static void method4785(@OriginalArg(0) Class144 arg0, @OriginalArg(2) Class129 arg1) {
		if (Static27.aBoolean30) {
			return;
		}
		arg1.method4930(0);
		Static244.aClass97_16 = arg1.method5018(Static368.method2865(arg0, Static163.anInt3076));
		Static244.aClass97_16.method5555((Static164.anInt3090 - Static244.aClass97_16.method5542()) / 2, (Static79.anInt5259 - Static244.aClass97_16.method5557()) / 2);
		Static21.aClass97_11 = arg1.method5018(Static368.method2865(arg0, Static58.anInt1091));
		Static21.aClass97_11.method5555((Static164.anInt3090 - Static21.aClass97_11.method5542()) / 2, 18);
		Static27.aBoolean30 = true;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I")
	public static int method4786() {
		@Pc(7) Class129 local7 = Static107.aClass129_4;
		@Pc(9) boolean local9 = false;
		if (Static74.anInt1413 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static326.method4946(local15, null, 0, null, 0);
		}
		@Pc(32) long local32 = Static268.method4627();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method5011();
		}
		@Pc(58) int local58 = (int) (Static268.method4627() - local32);
		local7.method4941(0, 0, 100, -16777216, 100);
		if (local9) {
			local7.method5010();
		}
		return local58;
	}
}
