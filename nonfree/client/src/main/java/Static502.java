import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!qv", name = "F", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
	public static int anInt8445;

	@OriginalMember(owner = "client!qv", name = "S", descriptor = "I")
	public static int anInt8448;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIII)V")
	public static void method7144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg3 * arg3;
		@Pc(25) int local25 = arg1 * arg1;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg1 << 1;
		@Pc(46) int local46 = (1 - local37) * local21 + local29;
		@Pc(55) int local55 = local25 - (local37 - 1) * local33;
		@Pc(59) int local59 = local21 << 2;
		@Pc(63) int local63 = local25 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = local33 * ((arg1 << 1) - 3);
		@Pc(85) int local85 = local63;
		@Pc(91) int local91 = (arg1 - 1) * local59;
		Static526.method7369(Static299.anIntArrayArray58[arg4], arg3 + arg2, -arg3 + arg2, arg0);
		while (local17 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local55 += local85;
					local46 += local71;
					local85 += local63;
					local71 += local63;
					local15++;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local46 += local71;
				local15++;
				local85 += local63;
				local71 += local63;
			}
			local46 += -local91;
			local55 += -local79;
			local79 -= local59;
			local91 -= local59;
			local17--;
			@Pc(178) int local178 = arg4 - local17;
			@Pc(182) int local182 = arg4 + local17;
			@Pc(187) int local187 = arg2 + local15;
			@Pc(192) int local192 = arg2 - local15;
			Static526.method7369(Static299.anIntArrayArray58[local178], local187, local192, arg0);
			Static526.method7369(Static299.anIntArrayArray58[local182], local187, local192, arg0);
		}
	}

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "(III)Lclient!dm;")
	public static Class85 method7146(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class247 local7 = Static332.aClass247ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass85_3;
	}

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)V")
	public static void method7148() {
		@Pc(7) client local7 = Static487.aClient1;
		synchronized (Static487.aClient1) {
			if (Static153.aFrame3 == null) {
				@Pc(30) Container local30;
				if (Static90.aFrame2 != null) {
					local30 = Static90.aFrame2;
				} else if (Static287.anApplet2 == null) {
					local30 = Static287.anApplet_Sub1_1;
				} else {
					local30 = Static287.anApplet2;
				}
				Static83.anInt1901 = local30.getSize().width;
				Static597.anInt9407 = local30.getSize().height;
				@Pc(52) Insets local52;
				if (local30 == Static90.aFrame2) {
					local52 = Static90.aFrame2.getInsets();
					Static597.anInt9407 -= local52.bottom + local52.top;
					Static83.anInt1901 -= local52.right + local52.left;
				}
				if (Static545.method7549() == 1) {
					Static483.anInt8181 = Static581.anInt9218;
					Static654.anInt10064 = Static507.anInt8484;
					Static40.anInt1166 = 0;
					Static225.anInt4116 = (Static83.anInt1901 - Static507.anInt8484) / 2;
				} else {
					Static268.method4280();
				}
				if (Static229.aClass309_8 != Static216.aClass309_6) {
					@Pc(100) boolean local100;
					if (Static654.anInt10064 < 1024 && Static483.anInt8181 < 768) {
						local100 = true;
					} else {
						local100 = false;
					}
				}
				Static469.aCanvas11.setSize(Static654.anInt10064, Static483.anInt8181);
				if (Static582.aClass16_12 != null) {
					if (Static649.aBoolean735) {
						Static359.method5385(Static469.aCanvas11);
					} else {
						Static582.aClass16_12.method8118(Static469.aCanvas11, Static654.anInt10064, Static483.anInt8181);
					}
				}
				if (Static90.aFrame2 == local30) {
					local52 = Static90.aFrame2.getInsets();
					Static469.aCanvas11.setLocation(local52.left + Static225.anInt4116, Static40.anInt1166 + local52.top);
				} else {
					Static469.aCanvas11.setLocation(Static225.anInt4116, Static40.anInt1166);
				}
				if (Static277.anInt5201 != -1) {
					Static345.method5204(true);
				}
				Static468.method7635();
			}
		}
	}
}
