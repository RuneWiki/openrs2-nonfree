import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!nd", name = "M", descriptor = "Lclient!vh;")
	public static Class187 aClass187_96 = new Class187(64);

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(IIII)I")
	public static int method3029(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) int local20 = Static215.anIntArray340[Static58.method1051(arg1, arg2)];
		if (arg0 > 0) {
			@Pc(29) int local29 = Static215.anInterface5_1.method778(arg0 & 0xFFFF);
			@Pc(47) int local47;
			@Pc(72) int local72;
			if (local29 != 0) {
				if (arg2 < 0) {
					local47 = 0;
				} else if (arg2 > 127) {
					local47 = 16777215;
				} else {
					local47 = arg2 * 131586;
				}
				if (local29 == 256) {
					local20 = local47;
				} else {
					local72 = 256 - local29;
					local20 = ((local47 & 0xFF00) * local29 + local72 * (local20 & 0xFF00) & 0xFF0000) + (local72 * (local20 & 0xFF00FF) + local29 * (local47 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local47 = Static215.anInterface5_1.method784(arg0 & 0xFFFF);
			if (local47 != 0) {
				local47 += 256;
				@Pc(123) int local123 = local47 * (local20 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local72 = (local20 >> 8 & 0xFF) * local47;
				@Pc(144) int local144 = (local20 & 0xFF) * local47;
				if (local72 > 65535) {
					local72 = 65535;
				}
				if (local144 > 65535) {
					local144 = 65535;
				}
				local20 = (local72 & 0xFF00) + ((local123 & 0x5700FF00) << 8) + (local144 >> 8);
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)Lclient!oe;")
	public static Class128 method3030(@OriginalArg(1) int arg0) {
		@Pc(10) Class128 local10 = (Class128) Static70.aClass187_45.method4527((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static129.aClass121_60.method3115(4, arg0);
		local10 = new Class128();
		if (local27 != null) {
			local10.method3234(new Class1_Sub14(local27), arg0);
		}
		Static70.aClass187_45.method4524((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	public static void method3031() {
		@Pc(9) Container local9;
		if (Static275.aFrame2 != null) {
			local9 = Static275.aFrame2;
		} else if (Static197.aFrame1 == null) {
			local9 = Static26.aClass154_1.anApplet1;
		} else {
			local9 = Static197.aFrame1;
		}
		Static171.anInt3365 = local9.getSize().width;
		Static132.anInt3685 = local9.getSize().height;
		@Pc(35) Insets local35;
		if (local9 == Static197.aFrame1) {
			local35 = Static197.aFrame1.getInsets();
			Static171.anInt3365 -= local35.right + local35.left;
			Static132.anInt3685 -= local35.top + local35.bottom;
		}
		if (Static228.method3541() >= 2) {
			Static103.anInt2068 = 0;
			Static120.anInt2505 = Static132.anInt3685;
			Static292.anInt5236 = Static171.anInt3365;
			Static209.anInt3975 = 0;
		} else {
			Static103.anInt2068 = (Static171.anInt3365 - 765) / 2;
			Static292.anInt5236 = 765;
			Static209.anInt3975 = 0;
			Static120.anInt2505 = 503;
		}
		if (Static156.aBoolean211) {
			Static156.method2663(Static292.anInt5236, Static120.anInt2505);
		}
		Static127.aCanvas1.setSize(Static292.anInt5236, Static120.anInt2505);
		if (local9 == Static197.aFrame1) {
			local35 = Static197.aFrame1.getInsets();
			Static127.aCanvas1.setLocation(local35.left + Static103.anInt2068, local35.top + Static209.anInt3975);
		} else {
			Static127.aCanvas1.setLocation(Static103.anInt2068, Static209.anInt3975);
		}
		if (Static270.anInt4897 != -1) {
			Static113.method2024(true);
		}
		Static13.method176();
	}
}
