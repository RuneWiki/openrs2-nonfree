import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray30;

	@OriginalMember(owner = "client!pw", name = "v", descriptor = "Lclient!hk;")
	public static Class5_Sub14_Sub4 aClass5_Sub14_Sub4_25;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "Lclient!ks;")
	public static final Class209 aClass209_10 = new Class209("", 17);

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "[I")
	public static final int[] anIntArray450 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "Z")
	public static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "Z")
	public static boolean aBoolean586 = false;

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "I")
	public static int anInt8094 = -1;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZILjava/io/File;)[B")
	public static byte[] method6868(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) byte[] local11 = new byte[arg0];
			Static235.method3370(arg1, arg0, local11);
			return local11;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIIIZB)V")
	public static void method6869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(19) int local19 = arg0 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(43) int local43 = Static672.aShort117 + local19 * (Static88.aShort25 - Static672.aShort117) / 100;
		if (local43 < Static305.aShort67) {
			local43 = Static305.aShort67;
		} else if (Static247.aShort50 < local43) {
			local43 = Static247.aShort50;
		}
		@Pc(64) int local64 = arg0 * 512 * local43 / (arg3 * 334);
		@Pc(98) int local98;
		@Pc(105) int local105;
		@Pc(73) short local73;
		if (Static284.aShort55 > local64) {
			local73 = Static284.aShort55;
			local43 = arg3 * 334 * local73 / (arg0 * 512);
			if (local43 > Static247.aShort50) {
				local43 = Static247.aShort50;
				local98 = arg0 * 512 * local43 / (local73 * 334);
				local105 = (arg3 - local98) / 2;
				if (arg4) {
					Static563.aClass143_13.la();
					Static563.aClass143_13.method6252(arg2, arg1, -16777216, arg0, local105);
					Static563.aClass143_13.method6252(arg2, arg3 + arg1 - local105, -16777216, arg0, local105);
				}
				arg3 -= local105 * 2;
				arg1 += local105;
			}
		} else if (Static317.aShort76 < local64) {
			local73 = Static317.aShort76;
			local43 = arg3 * 334 * local73 / (arg0 * 512);
			if (local43 < Static305.aShort67) {
				local43 = Static305.aShort67;
				local98 = arg3 * 334 * local73 / (local43 * 512);
				local105 = (arg0 - local98) / 2;
				if (arg4) {
					Static563.aClass143_13.la();
					Static563.aClass143_13.method6252(arg2, arg1, -16777216, local105, arg3);
					Static563.aClass143_13.method6252(arg0 + arg2 - local105, arg1, -16777216, local105, arg3);
				}
				arg0 -= local105 * 2;
				arg2 += local105;
			}
		}
		Static398.anInt6905 = (short) arg0;
		Static520.anInt8703 = arg2;
		Static452.anInt7902 = (short) arg3;
		Static454.anInt7909 = local43 * arg0 / 334;
		Static490.anInt8423 = arg1;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)V")
	public static void method6872() {
		@Pc(5) Class265 local5 = Static168.aClass265_9;
		synchronized (Static168.aClass265_9) {
			Static168.aClass265_9.method6570(5);
		}
		local5 = Static360.aClass265_36;
		synchronized (Static360.aClass265_36) {
			Static360.aClass265_36.method6570(5);
		}
	}
}
