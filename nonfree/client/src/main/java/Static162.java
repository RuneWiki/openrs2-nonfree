import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Lclient!ji;")
	public static Class3_Sub3_Sub13 aClass3_Sub3_Sub13_3;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
	public static int anInt3002 = 0;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!hv", name = "p", descriptor = "Lclient!la;")
	public static final Class136 aClass136_79 = new Class136(88, 8);

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_84 = new Class163(82, 7);

	@OriginalMember(owner = "client!hv", name = "s", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([BIBI)Ljava/lang/String;")
	public static String method2548(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg1 + arg2;
		for (@Pc(21) int local21 = arg2; local21 < local14; local21++) {
			@Pc(29) int local29 = arg0[local21] & 0xFF;
			if (local29 >= 128) {
				if (local29 < 194) {
					throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local29);
				}
				@Pc(63) int local63;
				if (local29 < 224) {
					if (local14 <= local21 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local63 = arg0[local21] & 0xFF;
					if (local63 < 128 || local63 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) ((local29 & 0xFFFFFF3F) << 6 | local63 & 0xFFFFFF7F);
				} else if (local29 < 240) {
					if (local21 + 2 >= local14) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local21++;
					local63 = arg0[local21] & 0xFF;
					if (local63 < 128 || local63 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local21++;
					@Pc(132) int local132 = arg0[local21] & 0xFF;
					if (local132 < 128 || local132 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) ((local63 & 0xFFFFFF7F) << 6 | (local29 & 0xFFF1F) << 12 | local132 & 0xFFFFFF7F);
				} else if (local29 >= 244) {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local29);
				} else {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				}
			} else {
				local8[local10++] = (char) local29;
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)V")
	public static void method2549() {
		Static307.method4633(Static341.aClass163_145);
		Static243.aClass3_Sub25_Sub1_7.method4081(Static282.method3967());
		Static243.aClass3_Sub25_Sub1_7.method4123(Static310.anInt5307);
		Static243.aClass3_Sub25_Sub1_7.method4123(Static166.anInt3014);
		Static243.aClass3_Sub25_Sub1_7.method4081(Static39.aClass79_Sub1_1.anInt2145);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZIII)V")
	public static void method2550(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static163.method5702(arg3)) {
			Static343.method4798(-1, arg2, Static298.aClass82ArrayArray2[arg3], arg0, arg1);
		}
	}
}
