import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Lclient!va;")
	public static Class370 aClass370_1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "[Lclient!s;")
	public static Class159[] aClass159Array1;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_115 = new Class251(57, 3);

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public static int anInt4845 = 0;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public static int anInt4846 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public static void method4322(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (Static18.anInt243 == 1) {
			Static22.aClass144_1.method6942(arg0, arg1, Static673.anInt10975, Static35.anInt549);
		} else {
			Static22.aClass144_1.method6942(arg0, arg1, 0, 0);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B[[S[[F)[[S")
	public static short[][] method4323(@OriginalArg(1) short[][] arg0, @OriginalArg(2) float[][] arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg1.length; local1++) {
			for (@Pc(4) int local4 = 0; local4 < arg0[local1].length; local4++) {
				arg0[local1][local4] = (short) (int) (arg1[local1][local4] * 16383.0F);
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)I")
	public static int method4324() {
		return (int) (1000000000L / Static579.aLong295);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZIJIBZZIIIJ)V")
	public static void method4326(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) long arg11) {
		if (!Static455.aBoolean533 && Static638.anInt10454 < 500) {
			@Pc(20) int local20 = arg3 == -1 ? Static573.anInt9481 : arg3;
			@Pc(36) Class14_Sub2_Sub20 local36 = new Class14_Sub2_Sub20(arg1, arg0, local20, arg8, arg9, arg4, arg5, arg10, arg7, arg2, arg11, arg6);
			Static528.method7837(local36);
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I[S)[S")
	public static short[] method4327(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) short[] local19 = new short[arg0.length];
			Static691.method85(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "([BIIB)I")
	public static int method4328(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = -1;
		for (@Pc(7) int local7 = arg2; local7 < arg1; local7++) {
			local5 = local5 >>> 8 ^ Class281.anIntArray400[(local5 ^ arg0[local7]) & 0xFF];
		}
		return ~local5;
	}
}
