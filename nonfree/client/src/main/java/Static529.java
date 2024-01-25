import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!uv", name = "D", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7708(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!uv", name = "e", descriptor = "(III)V")
	public static void method7709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class6_Sub4_Sub6 local10 = Static68.method1408(14, arg0);
		local10.method3826();
		local10.anInt4403 = arg1;
	}

	@OriginalMember(owner = "client!uv", name = "f", descriptor = "(III)B")
	public static byte method7712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uv", name = "g", descriptor = "(III)V")
	public static void method7713(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = Static1.aClass82_1.method2292(Static222.aClass152_69.method4002(Static286.anInt5468));
		@Pc(28) int local28;
		for (@Pc(22) Class6_Sub42 local22 = (Class6_Sub42) Static207.aClass211_29.method5183(); local22 != null; local22 = (Class6_Sub42) Static207.aClass211_29.method5177()) {
			local28 = Static373.method5925(local22);
			if (local13 < local28) {
				local13 = local28;
			}
		}
		local13 += 8;
		local28 = Static205.anInt4369 * 16 + 21;
		@Pc(58) int local58 = arg0 - local13 / 2;
		if (Static228.anInt4744 < local58 + local13) {
			local58 = Static228.anInt4744 - local13;
		}
		if (local58 < 0) {
			local58 = 0;
		}
		@Pc(74) int local74 = arg1;
		if (Static180.anInt4051 < local28 + arg1) {
			local74 = Static180.anInt4051 - local28;
		}
		if (local74 < 0) {
			local74 = 0;
		}
		Static69.anInt1684 = local58;
		Static24.anInt8441 = local13;
		Static230.anInt4775 = local74;
		Static430.anInt868 = (Static28.aBoolean82 ? 26 : 22) + Static205.anInt4369 * 16;
		Static218.aBoolean366 = true;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljava/awt/Frame;BLclient!pe;)V")
	public static void method7714(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class246 arg1) {
		while (true) {
			@Pc(18) Class280 local18 = arg1.method6130(arg0);
			while (local18.anInt8467 == 0) {
				Static566.method8004(10L);
			}
			if (local18.anInt8467 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static566.method8004(100L);
		}
	}
}
