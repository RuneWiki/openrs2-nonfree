import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public static int anInt2813;

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!cd;")
	public static Class15 aClass15_8;

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!pc;")
	public static Class77 aClass77_75;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_828 = Static181.method2795("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_831 = Static181.method2795("white:");

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!qe;")
	public static Class83 aClass83_829 = aClass83_831;

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_830 = aClass83_831;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
	public static int anInt2815 = 0;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ra;II)Lclient!qe;")
	public static Class83 method2164(@OriginalArg(0) Class2_Sub3 arg0) {
		try {
			@Pc(12) Class83 local12 = new Class83();
			local12.anInt3158 = arg0.method232();
			if (local12.anInt3158 > 32767) {
				local12.anInt3158 = 32767;
			}
			local12.aByteArray36 = new byte[local12.anInt3158];
			arg0.anInt340 += Static161.aClass55_2.method1691(0, local12.aByteArray36, local12.anInt3158, arg0.anInt340, arg0.aByteArray2);
			return local12;
		} catch (@Pc(53) Exception local53) {
			return Static102.aClass83_682;
		}
	}
}
