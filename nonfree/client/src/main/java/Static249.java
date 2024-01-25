import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_129 = new Class140(500);

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
	public static int anInt4825 = 0;

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "[S")
	public static final short[] aShortArray88 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)Lclient!ie;")
	public static Class91 method4440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class91 local7 = new Class91();
		local7.anInt2685 = -1;
		local7.anInt2692 = -1;
		local7.anInt2693 = arg0 + 6;
		local7.anInt2680 = arg1 + 1 + 5;
		local7.anIntArrayArray27 = new int[local7.anInt2693][local7.anInt2680];
		local7.method2594();
		return local7;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method4441() {
		if (Static51.anInt5048 == 0) {
			return;
		}
		try {
			if (++Static193.anInt3949 > 1500) {
				if (Static153.aClass158_2 != null) {
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
				}
				if (Static100.anInt2076 >= 1) {
					Static51.anInt5048 = 0;
					Static82.anInt1642 = -5;
					return;
				}
				Static193.anInt3949 = 0;
				if (Static223.anInt4433 == Static194.anInt3960) {
					Static194.anInt3960 = Static102.anInt2099;
				} else {
					Static194.anInt3960 = Static223.anInt4433;
				}
				Static51.anInt5048 = 1;
				Static100.anInt2076++;
			}
			if (Static51.anInt5048 == 1) {
				Static59.aClass134_1 = Static180.aClass110_6.method3357(Static148.aString201, Static194.anInt3960);
				Static51.anInt5048 = 2;
			}
			@Pc(117) int local117;
			if (Static51.anInt5048 == 2) {
				if (Static59.aClass134_1.anInt4033 == 2) {
					throw new IOException();
				}
				if (Static59.aClass134_1.anInt4033 != 1) {
					return;
				}
				Static153.aClass158_2 = new Class158((Socket) Static59.aClass134_1.anObject6, Static180.aClass110_6);
				Static59.aClass134_1 = null;
				Static153.aClass158_2.method4325(Static248.aClass1_Sub7_Sub1_2.aByteArray58, Static248.aClass1_Sub7_Sub1_2.anInt3368);
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				local117 = Static153.aClass158_2.method4337();
				if (Static210.aClass174_2 != null) {
					Static210.aClass174_2.method5520();
				}
				if (Static108.aClass174_1 != null) {
					Static108.aClass174_1.method5520();
				}
				if (local117 != 101) {
					Static82.anInt1642 = local117;
					Static51.anInt5048 = 0;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
					return;
				}
				Static51.anInt5048 = 3;
			}
			if (Static51.anInt5048 == 3 && Static153.aClass158_2.method4326() >= 2) {
				local117 = Static153.aClass158_2.method4337() << 8 | Static153.aClass158_2.method4337();
				Static41.method981(local117);
				if (Static232.anInt6331 == -1) {
					Static51.anInt5048 = 0;
					Static82.anInt1642 = 6;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
				} else {
					Static51.anInt5048 = 0;
					Static153.aClass158_2.method4339();
					Static153.aClass158_2 = null;
					Static138.method2659();
				}
			}
		} catch (@Pc(200) IOException local200) {
			if (Static153.aClass158_2 != null) {
				Static153.aClass158_2.method4339();
				Static153.aClass158_2 = null;
			}
			if (Static100.anInt2076 >= 1) {
				Static82.anInt1642 = -4;
				Static51.anInt5048 = 0;
			} else {
				if (Static194.anInt3960 == Static223.anInt4433) {
					Static194.anInt3960 = Static102.anInt2099;
				} else {
					Static194.anInt3960 = Static223.anInt4433;
				}
				Static51.anInt5048 = 1;
				Static193.anInt3949 = 0;
				Static100.anInt2076++;
			}
		}
	}
}
