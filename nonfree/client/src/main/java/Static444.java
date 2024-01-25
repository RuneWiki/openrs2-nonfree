import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
	public static int anInt8261;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_52 = new Class43();

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_85 = new Class257(3, 1);

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
	public static int anInt8258 = 0;

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_86 = new Class257(30, 7);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BLclient!kw;)[I")
	public static int[] method6825(@OriginalArg(1) Class8_Sub31 arg0) {
		@Pc(10) Class8_Sub8 local10 = new Class8_Sub8(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8562(10);
		local10.method8523(local13[0]);
		local10.method8523(local13[1]);
		local10.method8523(local13[2]);
		local10.method8523(local13[3]);
		for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
			local10.method8523((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8548((int) (Math.random() * 9.9999999E7D));
		local10.method8557(Static423.aBigInteger9, Static177.aBigInteger4);
		arg0.aClass8_Sub8_Sub2_1.method8532(local10.anInt10588, 0, local10.aByteArray107);
		return local13;
	}
}
