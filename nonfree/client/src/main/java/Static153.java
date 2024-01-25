import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!ema", name = "j", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray2;

	@OriginalMember(owner = "client!ema", name = "c", descriptor = "Z")
	public static boolean aBoolean230;

	@OriginalMember(owner = "client!ema", name = "d", descriptor = "I")
	public static int anInt2819 = -1;

	@OriginalMember(owner = "client!ema", name = "a", descriptor = "(BLclient!nl;II)Lclient!qm;")
	public static Class3_Sub4_Sub18 method2450(@OriginalArg(1) Class258 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt7564 | arg1 << 10;
		@Pc(19) Class3_Sub4_Sub18 local19 = (Class3_Sub4_Sub18) Static567.aClass13_3.method324((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(32) byte[] local32 = Static300.aClass221_87.method5077(Static300.aClass221_87.method5081(local10));
		if (local32 == null) {
			local10 = arg0.anInt7564 | arg2 + 65536 << 10;
			local19 = (Class3_Sub4_Sub18) Static567.aClass13_3.method324((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local32 = Static300.aClass221_87.method5077(Static300.aClass221_87.method5081(local10));
			if (local32 == null) {
				local10 = arg0.anInt7564 | 0x3FFFC00;
				local19 = (Class3_Sub4_Sub18) Static567.aClass13_3.method324((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local32 = Static300.aClass221_87.method5077(Static300.aClass221_87.method5081(local10));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static476.method6993(local32);
					} catch (@Pc(213) Exception local213) {
						throw new RuntimeException(local213.getMessage() + " S: " + local10);
					}
					local19.aClass258_13 = arg0;
					Static567.aClass13_3.method322(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static476.method6993(local32);
				} catch (@Pc(131) Exception local131) {
					throw new RuntimeException(local131.getMessage() + " S: " + local10);
				}
				local19.aClass258_13 = arg0;
				Static567.aClass13_3.method322(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local32.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static476.method6993(local32);
			} catch (@Pc(51) Exception local51) {
				throw new RuntimeException(local51.getMessage() + " S: " + local10);
			}
			local19.aClass258_13 = arg0;
			Static567.aClass13_3.method322(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!ema", name = "b", descriptor = "(II)V")
	public static void method2451(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub4_Sub2 local9 = Static502.method7211(11, (long) arg0);
		local9.method627();
	}
}
