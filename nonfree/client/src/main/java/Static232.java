import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public static int anInt4617 = -1;

	@OriginalMember(owner = "client!ol", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString290 = "Please remove ";

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BIIIZI)V")
	public static void method4059(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		if (arg3) {
			Static300.method4855();
		}
		if (Static342.aFrame2 != null && (arg0 != 3 || arg4 != Static345.anInt6528 || arg2 != Static227.anInt6305)) {
			Static234.method4076(Static116.aClass21_4, Static342.aFrame2);
			Static342.aFrame2 = null;
		}
		if (arg0 == 3 && Static342.aFrame2 == null) {
			Static342.aFrame2 = Static270.method4498(0, arg2, Static116.aClass21_4, arg4);
			if (Static342.aFrame2 != null) {
				Static345.anInt6528 = arg4;
				Static227.anInt6305 = arg2;
				Static244.method4220(Static116.aClass21_4);
			}
		}
		if (arg0 == 3 && Static342.aFrame2 == null) {
			method4059(Static6.anInt126, arg1, -1, true, -1);
			return;
		}
		@Pc(79) Container local79;
		@Pc(99) Insets local99;
		if (Static342.aFrame2 != null) {
			Static200.anInt3944 = arg4;
			local79 = Static342.aFrame2;
			Static276.anInt5460 = arg2;
		} else if (Static212.aFrame1 == null) {
			local79 = Static116.aClass21_4.anApplet1;
			Static200.anInt3944 = local79.getSize().width;
			Static276.anInt5460 = local79.getSize().height;
		} else {
			local99 = Static212.aFrame1.getInsets();
			Static200.anInt3944 = Static212.aFrame1.getSize().width - local99.left - local99.right;
			@Pc(120) int local120 = local99.top + local99.bottom;
			Static276.anInt5460 = Static212.aFrame1.getSize().height - local120;
			local79 = Static212.aFrame1;
		}
		@Pc(143) int local143;
		if (arg0 == 1) {
			Static214.anInt4266 = 503;
			Static128.anInt2823 = 765;
			Static107.anInt1503 = (Static200.anInt3944 - 765) / 2;
			Static314.anInt6029 = 0;
		} else if (Static194.anInt1874 < 96 && Static329.anInt6220 == 0) {
			local143 = Static200.anInt3944 > 1024 ? 1024 : Static200.anInt3944;
			Static128.anInt2823 = local143;
			Static107.anInt1503 = (Static200.anInt3944 - local143) / 2;
			@Pc(159) int local159 = Static276.anInt5460 > 768 ? 768 : Static276.anInt5460;
			Static314.anInt6029 = 0;
			Static214.anInt4266 = local159;
		} else {
			Static107.anInt1503 = 0;
			Static128.anInt2823 = Static200.anInt3944;
			Static314.anInt6029 = 0;
			Static214.anInt4266 = Static276.anInt5460;
		}
		if (Static151.anInt3239 != 0) {
			@Pc(201) boolean local201;
			if (Static128.anInt2823 < 1024 && Static214.anInt4266 < 768) {
				local201 = true;
			} else {
				local201 = false;
			}
		}
		if (arg3) {
			Static244.method4219(Static329.anInt6220);
		} else {
			Static269.aCanvas4.setSize(Static128.anInt2823, Static214.anInt4266);
			if (Static128.aClass89_3 != null) {
				Static128.aClass89_3.method5434();
			}
			if (local79 == Static212.aFrame1) {
				local99 = Static212.aFrame1.getInsets();
				Static269.aCanvas4.setLocation(local99.left + Static107.anInt1503, Static314.anInt6029 + local99.top);
			} else {
				Static269.aCanvas4.setLocation(Static107.anInt1503, Static314.anInt6029);
			}
		}
		if (arg0 >= 2) {
			Static166.aBoolean255 = true;
		} else {
			Static166.aBoolean255 = false;
		}
		if (Static161.anInt3337 != -1) {
			Static341.method5541(true);
		}
		if (Static193.aClass61_1 != null && (Static85.anInt2215 == 30 || Static85.anInt2215 == 25)) {
			Static316.method5130();
		}
		for (local143 = 0; local143 < 100; local143++) {
			Static276.aBooleanArray27[local143] = true;
		}
		Static33.aBoolean54 = true;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[Lclient!bi;I)V")
	public static void method4066(@OriginalArg(0) int arg0, @OriginalArg(1) Class26[] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			@Pc(6) Class26 local6 = arg1[local1];
			if (local6 != null) {
				if (local6.anInt520 == 0) {
					if (local6.aClass26Array1 != null) {
						method4066(arg0, local6.aClass26Array1);
					}
					@Pc(30) Class7_Sub17 local30 = (Class7_Sub17) Static247.aClass10_40.method163((long) local6.anInt492);
					if (local30 != null) {
						Static325.method5214(arg0, local30.anInt3252);
					}
				}
				@Pc(46) Class7_Sub25 local46;
				if (arg0 == 0 && local6.anObjectArray25 != null) {
					local46 = new Class7_Sub25();
					local46.aClass26_22 = local6;
					local46.anObjectArray34 = local6.anObjectArray25;
					Static83.method1766(local46);
				}
				if (arg0 == 1 && local6.anObjectArray15 != null) {
					if (local6.anInt550 >= 0) {
						@Pc(74) Class26 local74 = Static245.method4231(local6.anInt492);
						if (local74 == null || local74.aClass26Array1 == null || local6.anInt550 >= local74.aClass26Array1.length || local74.aClass26Array1[local6.anInt550] != local6) {
							continue;
						}
					}
					local46 = new Class7_Sub25();
					local46.anObjectArray34 = local6.anObjectArray15;
					local46.aClass26_22 = local6;
					Static83.method1766(local46);
				}
			}
		}
	}
}
