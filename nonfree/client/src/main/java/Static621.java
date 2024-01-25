import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static621 {

	@OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
	public static int anInt10151;

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "I")
	public static int anInt10146 = 0;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Z")
	public static boolean aBoolean731 = false;

	@OriginalMember(owner = "client!vs", name = "f", descriptor = "I")
	public static int anInt10148 = -1;

	@OriginalMember(owner = "client!vs", name = "i", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable7 = new Hashtable();

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([BZ)Lclient!pc;")
	public static Class2_Sub7_Sub13 method8624(@OriginalArg(0) byte[] arg0) {
		@Pc(7) Class2_Sub7_Sub13 local7 = new Class2_Sub7_Sub13();
		@Pc(12) Class2_Sub17 local12 = new Class2_Sub17(arg0);
		local12.anInt3378 = local12.aByteArray26.length - 2;
		@Pc(23) int local23 = local12.method2825();
		@Pc(34) int local34 = local12.aByteArray26.length - local23 - 12 - 2;
		local12.anInt3378 = local34;
		@Pc(41) int local41 = local12.method2881();
		local7.anInt7116 = local12.method2825();
		local7.anInt7115 = local12.method2825();
		local7.anInt7114 = local12.method2825();
		local7.anInt7117 = local12.method2825();
		@Pc(65) int local65 = local12.method2859();
		@Pc(76) int local76;
		@Pc(81) int local81;
		if (local65 > 0) {
			local7.aClass323Array1 = new Class323[local65];
			for (local76 = 0; local76 < local65; local76++) {
				local81 = local12.method2825();
				@Pc(88) Class323 local88 = new Class323(Static613.method8565(local81));
				local7.aClass323Array1[local76] = local88;
				while (local81-- > 0) {
					@Pc(98) int local98 = local12.method2881();
					@Pc(102) int local102 = local12.method2881();
					local88.method7477(new Class2_Sub41(local102), (long) local98);
				}
			}
		}
		local12.anInt3378 = 0;
		local7.aString59 = local12.method2844();
		local7.aStringArray41 = new String[local41];
		local7.anIntArray480 = new int[local41];
		local7.anIntArray479 = new int[local41];
		local76 = 0;
		while (local34 > local12.anInt3378) {
			local81 = local12.method2825();
			if (local81 == 3) {
				local7.aStringArray41[local76] = local12.method2833().intern();
			} else if (local81 >= 100 || local81 == 21 || local81 == 38 || local81 == 39) {
				local7.anIntArray479[local76] = local12.method2859();
			} else {
				local7.anIntArray479[local76] = local12.method2881();
			}
			local7.anIntArray480[local76++] = local81;
		}
		return local7;
	}
}
