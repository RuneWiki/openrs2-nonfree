import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static678 {

	@OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
	public static int anInt10816 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	public static void method9304() {
		if (Static107.anInt1746 == 9) {
			Static21.method316(5);
		} else if (Static107.anInt1746 == 5 || Static107.anInt1746 == 6) {
			Static21.method316(3);
		} else if (Static107.anInt1746 == 12) {
			Static21.method316(3);
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[B)[B")
	public static byte[] method9305(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[32768];
		Static682.method799(arg1, arg0, local14, 0, 32768);
		return local14;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!ib;B)Lclient!rfa;")
	public static Class5_Sub1 method9309(@OriginalArg(0) Class5_Sub23 arg0) {
		arg0.method8529();
		@Pc(21) int local21 = arg0.method8529();
		@Pc(25) Class5_Sub1 local25 = Static524.method7583(local21);
		local25.anInt10698 = arg0.method8529();
		@Pc(34) int local34 = arg0.method8529();
		for (@Pc(36) int local36 = 0; local36 < local34; local36++) {
			@Pc(42) int local42 = arg0.method8529();
			local25.method9209(local42, arg0);
		}
		local25.method9204();
		return local25;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BII)V")
	public static void method9310(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static629.aFloat202 > Static629.aFloat203) {
			Static629.aFloat203 = (float) ((double) Static629.aFloat203 + (double) Static629.aFloat203 / 30.0D);
			if (Static629.aFloat203 > Static629.aFloat202) {
				Static629.aFloat203 = Static629.aFloat202;
			}
			Static122.method1709();
			Static629.anInt9759 = (int) Static629.aFloat203 >> 1;
			Static629.aByteArrayArrayArray18 = Static602.method8659(Static629.anInt9759);
		} else if (Static629.aFloat202 < Static629.aFloat203) {
			Static629.aFloat203 = (float) ((double) Static629.aFloat203 - (double) Static629.aFloat203 / 30.0D);
			if (Static629.aFloat202 > Static629.aFloat203) {
				Static629.aFloat203 = Static629.aFloat202;
			}
			Static122.method1709();
			Static629.anInt9759 = (int) Static629.aFloat203 >> 1;
			Static629.aByteArrayArrayArray18 = Static602.method8659(Static629.anInt9759);
		}
		if (Static436.anInt7489 != -1 && Static652.anInt10539 != -1) {
			@Pc(91) int local91 = Static436.anInt7489 - Static622.anInt10186;
			if (local91 < 2 || local91 > 2) {
				local91 /= 8;
			}
			@Pc(110) int local110 = Static652.anInt10539 - Static448.anInt7716;
			Static622.anInt10186 += local91;
			if (local110 < 2 || local110 > 2) {
				local110 /= 8;
			}
			Static448.anInt7716 -= -local110;
			if (local91 == 0 && local110 == 0) {
				Static652.anInt10539 = -1;
				Static436.anInt7489 = -1;
			}
			Static122.method1709();
		}
		if (Static31.anInt506 <= 0) {
			Static87.anInt1456 = -1;
			Static496.anInt8292 = -1;
		} else {
			Static333.anInt5936--;
			if (Static333.anInt5936 == 0) {
				Static333.anInt5936 = 100;
				Static31.anInt506--;
			}
		}
		if (!Static458.aBoolean593 || Static199.aClass102_64 == null) {
			return;
		}
		for (@Pc(201) Class5_Sub26 local201 = (Class5_Sub26) Static199.aClass102_64.method1916(); local201 != null; local201 = (Class5_Sub26) Static199.aClass102_64.method1915()) {
			@Pc(210) Class315 local210 = Static629.aClass33_4.method657(local201.aClass5_Sub8_1.anInt1429);
			if (local201.method4040(arg1, arg0)) {
				if (local210.aStringArray64 != null) {
					if (local210.aStringArray64[4] != null) {
						Static152.method2122(local210.anInt8900, (long) local201.aClass5_Sub8_1.anInt1429, false, (long) local201.aClass5_Sub8_1.anInt1429, local210.aStringArray64[4], 0, false, local210.aString117, -1, 1006, true, -1);
					}
					if (local210.aStringArray64[3] != null) {
						Static152.method2122(local210.anInt8900, (long) local201.aClass5_Sub8_1.anInt1429, false, (long) local201.aClass5_Sub8_1.anInt1429, local210.aStringArray64[3], 0, false, local210.aString117, -1, 1010, true, -1);
					}
					if (local210.aStringArray64[2] != null) {
						Static152.method2122(local210.anInt8900, (long) local201.aClass5_Sub8_1.anInt1429, false, (long) local201.aClass5_Sub8_1.anInt1429, local210.aStringArray64[2], 0, false, local210.aString117, -1, 1011, true, -1);
					}
					if (local210.aStringArray64[1] != null) {
						Static152.method2122(local210.anInt8900, (long) local201.aClass5_Sub8_1.anInt1429, false, (long) local201.aClass5_Sub8_1.anInt1429, local210.aStringArray64[1], 0, false, local210.aString117, -1, 1001, true, -1);
					}
					if (local210.aStringArray64[0] != null) {
						Static152.method2122(local210.anInt8900, (long) local201.aClass5_Sub8_1.anInt1429, false, (long) local201.aClass5_Sub8_1.anInt1429, local210.aStringArray64[0], 0, false, local210.aString117, -1, 1012, true, -1);
					}
				}
				if (!local201.aClass5_Sub8_1.aBoolean141) {
					local201.aClass5_Sub8_1.aBoolean141 = true;
					Static173.method2509(Static260.aClass354_8, local201.aClass5_Sub8_1.anInt1429, local210.anInt8900);
				}
				if (local201.aClass5_Sub8_1.aBoolean141) {
					Static173.method2509(Static390.aClass354_12, local201.aClass5_Sub8_1.anInt1429, local210.anInt8900);
				}
			} else if (local201.aClass5_Sub8_1.aBoolean141) {
				local201.aClass5_Sub8_1.aBoolean141 = false;
				Static173.method2509(Static274.aClass354_10, local201.aClass5_Sub8_1.anInt1429, local210.anInt8900);
			}
		}
	}
}
