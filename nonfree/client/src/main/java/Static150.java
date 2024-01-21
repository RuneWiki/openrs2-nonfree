import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1248 = Static170.method3101(" ");

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
	public static int anInt3718 = 0;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	public static void method2830() {
		aBigInteger2 = null;
		aClass28_1248 = null;
		aLongArray7 = null;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)[Lclient!dh;")
	public static Class3_Sub2_Sub2_Sub3[] method2831() {
		@Pc(6) Class3_Sub2_Sub2_Sub3[] local6 = new Class3_Sub2_Sub2_Sub3[Static85.anInt2511];
		for (@Pc(8) int local8 = 0; local8 < Static85.anInt2511; local8++) {
			@Pc(13) Class3_Sub2_Sub2_Sub3 local13 = new Class3_Sub2_Sub2_Sub3();
			local13.anInt1010 = Static172.anInt4139;
			local13.anInt1015 = Static114.anInt2920;
			local13.anInt1012 = Static59.anIntArray293[local8];
			local13.anInt1011 = Static173.anIntArray690[local8];
			local13.anInt1013 = Static83.anIntArray394[local8];
			local13.anInt1014 = Static95.anIntArray452[local8];
			local13.anIntArray187 = Static55.anIntArray272;
			local13.aByteArray12 = Static59.aByteArrayArray41[local8];
			local6[local8] = local13;
		}
		Static82.method1880();
		return local6;
	}
}
