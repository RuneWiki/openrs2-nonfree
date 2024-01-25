import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!kg", name = "q", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array31;

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
	public static int anInt3759;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "Lclient!ct;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Lclient!ec;")
	public static final Class62 aClass62_129 = new Class62("Hidden", "Versteckt", "Caché", "Oculto");

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Lclient!sd;")
	public static Class208 aClass208_103 = null;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
	public static int anInt3760 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLjava/awt/Component;)Lclient!hn;")
	public static Class98 method3287(@OriginalArg(1) Component arg0) {
		return new Class98_Sub1(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB[B)I")
	public static int method3291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg1; local14 < arg0; local14++) {
			local7 = local7 >>> 8 ^ Class2_Sub1_Sub5.anIntArray123[(arg2[local14] ^ local7) & 0xFF];
		}
		return ~local7;
	}
}
