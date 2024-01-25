import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ee", name = "E", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[I")
	public static final int[] anIntArray892 = new int[2048];

	@OriginalMember(owner = "client!ee", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString54 = null;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIFIZI)[I")
	public static int[] method4060(@OriginalArg(4) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub4_Sub22 local10 = new Class2_Sub4_Sub22();
		local10.anInt4216 = (int) (arg0 * 4096.0F);
		local10.anInt4226 = 8;
		local10.anInt4221 = 8;
		local10.anInt4227 = 35;
		local10.aBoolean327 = true;
		local10.anInt4220 = 4;
		local10.method5596();
		Static176.method3101(2048, 1);
		local10.method3836(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BC)Z")
	public static boolean method4061(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!ij;)V")
	public static void method4065(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1) {
		Static350.aClass107Array4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIZ)Lclient!aa;")
	public static Class2_Sub1 method4067(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) long local12 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class2_Sub1) Static141.aClass246_7.method5613(local12);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
	public static void method4068() {
		for (@Pc(7) int local7 = 0; local7 < Static96.aByteArrayArrayArray8.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static96.aByteArrayArrayArray8[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static96.aByteArrayArrayArray8[0][0].length; local15++) {
					Static96.aByteArrayArrayArray8[local7][local11][local15] = 0;
				}
			}
		}
	}
}
