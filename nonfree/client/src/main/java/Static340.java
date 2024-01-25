import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method5290(@OriginalArg(0) int arg0) {
		@Pc(16) byte[] local16;
		if (arg0 == 100 && Static343.anInt6386 > 0) {
			local16 = Static361.aByteArrayArray37[--Static343.anInt6386];
			Static361.aByteArrayArray37[Static343.anInt6386] = null;
			return local16;
		} else if (arg0 == 5000 && Static224.anInt4179 > 0) {
			local16 = Static467.aByteArrayArray43[--Static224.anInt4179];
			Static467.aByteArrayArray43[Static224.anInt4179] = null;
			return local16;
		} else if (arg0 == 30000 && Static273.anInt5365 > 0) {
			local16 = Static109.aByteArrayArray12[--Static273.anInt5365];
			Static109.aByteArrayArray12[Static273.anInt5365] = null;
			return local16;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5291(@OriginalArg(1) String arg0) {
		Static328.method5200("", 0, 0, arg0, "");
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
	public static void method5292() {
		if (Static354.aBoolean473) {
			return;
		}
		Static474.aBoolean196 = true;
		if (Static300.aClass5_Sub28_Sub1_1.aBoolean334) {
			Static535.aFloat364 = (int) Static535.aFloat364 + 47 & 0xFFFFFFF0;
		} else {
			Static19.aFloat319 += (12.0F - Static19.aFloat319) / 2.0F;
		}
		Static354.aBoolean473 = true;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIII)V")
	public static void method5293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) int local16 = 0; local16 < Static423.anInt7490; local16++) {
			@Pc(22) Rectangle local22 = Class192.aRectangleArray3[local16];
			if (local22.width + local22.x > arg2 && local22.x < arg2 + arg3 && local22.height + local22.y > arg0 && local22.y < arg1 + arg0) {
				Static345.aBooleanArray24[local16] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Z)V")
	public static void method5294() {
		if (Static480.anIntArray648 != null && Static20.anIntArray25 != null) {
			return;
		}
		Static20.anIntArray25 = new int[256];
		Static480.anIntArray648 = new int[256];
		for (@Pc(23) int local23 = 0; local23 < 256; local23++) {
			@Pc(32) double local32 = (double) local23 / 255.0D * 6.283185307179586D;
			Static480.anIntArray648[local23] = (int) (Math.sin(local32) * 4096.0D);
			Static20.anIntArray25[local23] = (int) (Math.cos(local32) * 4096.0D);
		}
	}
}
