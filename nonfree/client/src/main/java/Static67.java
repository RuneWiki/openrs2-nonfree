import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt1556;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_51 = new Class92(5, 3);

	@OriginalMember(owner = "client!db", name = "V", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_55 = new Class175("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!db", name = "W", descriptor = "[F")
	public static final float[] aFloatArray11 = new float[16];

	@OriginalMember(owner = "client!db", name = "ib", descriptor = "[I")
	public static final int[] anIntArray131 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!db", name = "mb", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_52 = new Class92(29, 16);

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!bt;)V")
	public static void method1286(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(11) byte[] local11 = new byte[24];
		if (Static139.aClass240_5 != null) {
			@Pc(23) int local23;
			try {
				Static139.aClass240_5.method5504(0L);
				Static139.aClass240_5.method5501(local11);
				for (local23 = 0; local23 < 24 && local11[local23] == 0; local23++) {
				}
				if (local23 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(43) Exception local43) {
				for (local23 = 0; local23 < 24; local23++) {
					local11[local23] = -1;
				}
			}
		}
		arg0.method6026(24, local11);
	}
}
