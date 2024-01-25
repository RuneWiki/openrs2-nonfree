import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wf", name = "J", descriptor = "[I")
	public static int[] anIntArray837;

	@OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
	public static int anInt6595 = 0;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!ap;)V")
	public static void method5608(@OriginalArg(1) Class7_Sub3 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static134.aClass77_6 != null) {
			@Pc(20) int local20;
			try {
				Static134.aClass77_6.method1871(0L);
				Static134.aClass77_6.method1874(local8);
				for (local20 = 0; local20 < 24 && local8[local20] == 0; local20++) {
				}
				if (local20 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local20 = 0; local20 < 24; local20++) {
					local8[local20] = -1;
				}
			}
		}
		arg0.method2781(local8, 24);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method5609(@OriginalArg(0) Class89 arg0) {
		if (Static196.aClass74_30.method1795() == 0) {
			return;
		}
		@Pc(51) Class7_Sub34 local51;
		if (Static329.anInt6220 == 0 || Static329.anInt6220 == 2) {
			for (local51 = (Class7_Sub34) Static196.aClass74_30.method1793(); local51 != null; local51 = (Class7_Sub34) Static196.aClass74_30.method1798()) {
				Static35.method821(false, false, local51.anInt5534, arg0, local51.anInt5536, arg0, local51.anInt5533, Static36.aClass94_9, local51.anInt5530, local51.anInt5535, local51.aBoolean411 ? Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1 : null);
				local51.method5648();
			}
			Static183.method3347();
			return;
		}
		if (Static259.aClass89_7 == null) {
			@Pc(21) Canvas local21 = new Canvas();
			local21.setSize(36, 32);
			Static259.aClass89_7 = Static219.method3871(0, Static203.anInterface6_4, Static116.aClass21_4, local21, 0);
			Static302.aClass94_31 = Static259.aClass89_7.method5483(Static353.method2012(Static139.aClass180_36, Static199.anInt3921), Static358.method1303(Static312.aClass180_89, Static199.anInt3921));
		}
		for (local51 = (Class7_Sub34) Static196.aClass74_30.method1793(); local51 != null; local51 = (Class7_Sub34) Static196.aClass74_30.method1798()) {
			Static35.method821(false, false, local51.anInt5534, Static259.aClass89_7, local51.anInt5536, arg0, local51.anInt5533, Static302.aClass94_31, local51.anInt5530, local51.anInt5535, local51.aBoolean411 ? Static252.aClass22_Sub2_Sub1_Sub1_4.aClass214_1 : null);
			local51.method5648();
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([Ljava/lang/String;I[S)V")
	public static void method5611(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static97.method1989(arg0.length - 1, arg0, 0, arg1);
	}
}
