import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_6 = new Class307(64);

	@OriginalMember(owner = "client!ce", name = "N", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!ce", name = "V", descriptor = "I")
	public static int anInt1272 = -1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!tn;)V")
	public static void method1306(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static209.aClass76_2 != null) {
			@Pc(22) int local22;
			try {
				Static209.aClass76_2.method2777(0L);
				Static209.aClass76_2.method2778(local8);
				for (local22 = 0; local22 < 24 && local8[local22] == 0; local22++) {
				}
				if (local22 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(44) Exception local44) {
				for (local22 = 0; local22 < 24; local22++) {
					local8[local22] = -1;
				}
			}
		}
		arg0.method8430(24, 0, local8);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZIZI)I")
	public static int method1309(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class3_Sub17 local10 = Static77.method3511(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(24) int local24 = 0; local24 < local10.anIntArray99.length; local24++) {
			if (local10.anIntArray99[local24] >= 0 && local10.anIntArray99[local24] < Static367.aClass281_1.anInt8448) {
				@Pc(52) Class237 local52 = Static367.aClass281_1.method6975(local10.anIntArray99[local24]);
				@Pc(62) int local62 = local52.method6074(arg2, Static513.aClass49_2.method1857(arg2).anInt5140);
				if (arg0) {
					local16 += local62 * local10.anIntArray98[local24];
				} else {
					local16 += local62;
				}
			}
		}
		return local16;
	}
}
