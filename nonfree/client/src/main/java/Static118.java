import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_800 = Static181.method2795("Choose Option");

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "Lclient!qe;")
	public static Class83 aClass83_801 = aClass83_800;

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
	public static int anInt2709 = 0;

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
	public static int anInt2710 = 1;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_802 = Static181.method2795("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "[I")
	public static final int[] anIntArray268 = new int[25];

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_804 = Static181.method2795("Malformed login packet)3");

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!qe;")
	public static Class83 aClass83_803 = aClass83_804;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_12 = new Class19();

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	public static int anInt2711 = -1;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "[Lclient!c;")
	public static final Class14[] aClass14Array1 = new Class14[50];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_805 = Static181.method2795("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLjava/lang/String;)Lclient!qe;")
	public static Class83 method2063(@OriginalArg(1) String arg0) {
		@Pc(14) byte[] local14;
		try {
			local14 = arg0.getBytes("ISO-8859-1");
		} catch (@Pc(16) UnsupportedEncodingException local16) {
			local14 = arg0.getBytes();
		}
		@Pc(23) Class83 local23 = new Class83();
		local23.aByteArray36 = local14;
		local23.anInt3158 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.length; local31++) {
			if (local14[local31] != 0) {
				local14[local23.anInt3158++] = local14[local31];
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!eh;Lclient!qe;Lclient!qe;Z)[Lclient!lg;")
	public static Class2_Sub2_Sub17_Sub1[] method2065(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(2) Class83 arg2) {
		@Pc(8) int local8 = arg0.method870(arg1);
		@Pc(19) int local19 = arg0.method875(local8, arg2);
		return Static107.method2360(local19, arg0, local8);
	}
}
