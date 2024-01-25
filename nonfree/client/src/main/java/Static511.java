import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "[I")
	public static int[] anIntArray547;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!aea;")
	public static Class8 aClass8_1;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "Lclient!mr;")
	public static final Class223 aClass223_55 = new Class223();

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!qk;")
	public static Class279 aClass279_17 = null;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public static final int anInt8835 = 1400;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
	public static int method7625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static241.aByteArrayArray12 == null ? 0 : Static241.aByteArrayArray12[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
	public static void method7629(@OriginalArg(1) boolean arg0) {
		@Pc(5) int local5 = Static566.anInt9413;
		@Pc(7) int local7 = Static55.anInt1555;
		if (arg0 && Static279.aBoolean329) {
			local5 <<= 0x1;
			local7 = -local5;
		}
		Static323.aClass5_9.f(local7, local5);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!sl;I)Lclient!pia;")
	public static Class25_Sub1 method7630(@OriginalArg(0) Class3_Sub3 arg0) {
		@Pc(7) Class25 local7 = Static75.method1779(arg0);
		@Pc(11) int local11 = arg0.method4247();
		return new Class25_Sub1(local7.anInt7822, local7.aClass83_9, local7.aClass50_10, local7.anInt7824, local7.anInt7821, local11);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public static void method7631() {
		if (Static246.anIntArray241 != null && Static587.anIntArray621 != null) {
			return;
		}
		Static587.anIntArray621 = new int[256];
		Static246.anIntArray241 = new int[256];
		for (@Pc(18) int local18 = 0; local18 < 256; local18++) {
			@Pc(27) double local27 = (double) local18 / 255.0D * 6.283185307179586D;
			Static246.anIntArray241[local18] = (int) (Math.sin(local27) * 4096.0D);
			Static587.anIntArray621[local18] = (int) (Math.cos(local27) * 4096.0D);
		}
	}
}
