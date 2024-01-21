import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1122 = method2172("glow1:");

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public static int anInt3057 = 128;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[Z")
	public static boolean[] aBooleanArray12 = new boolean[112];

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "Lclient!cb;")
	public static Class10 aClass10_85 = new Class10();

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1123 = aClass77_1122;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1124 = aClass77_1122;

	@OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
	public static int anInt3064 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1125 = method2172("huffman");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[Lclient!sg;)Lclient!sg;")
	public static Class77 method2168(@OriginalArg(1) Class77[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static136.method2289(0, arg0, arg0.length);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;I)Lclient!sg;")
	public static Class77 method2172(@OriginalArg(0) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(14) int local14 = local2.length;
		@Pc(16) int local16 = 0;
		@Pc(20) Class77 local20 = new Class77();
		local20.aByteArray46 = new byte[local14];
		while (local16 < local14) {
			@Pc(32) int local32 = local2[local16++] & 0xFF;
			if (local32 <= 45 && local32 >= 40) {
				if (local16 >= local14) {
					break;
				}
				@Pc(68) int local68 = local2[local16++] & 0xFF;
				local20.aByteArray46[local20.anInt3606++] = (byte) (local68 + (local32 + -40) * 43 - 48);
			} else if (local32 != 0) {
				local20.aByteArray46[local20.anInt3606++] = (byte) local32;
			}
		}
		local20.method2517();
		return local20.method2500();
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!v;)V")
	public static void method2174(@OriginalArg(1) Class2_Sub2_Sub1_Sub6 arg0) {
		if (arg0.anInt4423 == 0) {
			arg0.anInt4387 = 1024;
		}
		@Pc(14) int local14 = arg0.anInt4396 - Static143.anInt3513;
		@Pc(25) int local25 = arg0.anInt4392 * 128 + arg0.anInt4409 * 64;
		arg0.anInt4400 += (local25 - arg0.anInt4400) / local14;
		arg0.anInt4378 = 0;
		if (arg0.anInt4423 == 1) {
			arg0.anInt4387 = 1536;
		}
		@Pc(60) int local60 = arg0.anInt4409 * 64 + arg0.anInt4377 * 128;
		arg0.anInt4385 += (local60 - arg0.anInt4385) / local14;
		if (arg0.anInt4423 == 2) {
			arg0.anInt4387 = 0;
		}
		if (arg0.anInt4423 == 3) {
			arg0.anInt4387 = 512;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)V")
	public static void method2175() {
		aClass10_85 = null;
		aClass77_1125 = null;
		aClass77_1124 = null;
		aClass77_1122 = null;
		aBooleanArray12 = null;
		aClass77_1123 = null;
	}
}
