import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_41 = new Class163(16, -1);

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!of;")
	public static final Class174 aClass174_43 = new Class174("slide:", "gleiten:", "glissement:", "deslizamento:");

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
	public static int anInt1287 = 0;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	public static int anInt1288 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
	public static int method1262(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(24) int local24 = (local14 >>> 2 & 0x33333333) + (local14 & 0x33333333);
		@Pc(32) int local32 = (local24 >>> 4) + local24 & 0xF0F0F0F;
		@Pc(38) int local38 = local32 + (local32 >>> 8);
		@Pc(44) int local44 = local38 + (local38 >>> 16);
		return local44 & 0xFF;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIFIIF[BFILclient!ag;FIF)V")
	public static void method1263(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) byte[] arg3, @OriginalArg(7) float arg4, @OriginalArg(9) Class6 arg5, @OriginalArg(10) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static16.method322(arg1, arg4, local3, arg0, arg7, arg6, arg3, arg2, arg5);
			arg0 += 16384;
		}
	}
}
