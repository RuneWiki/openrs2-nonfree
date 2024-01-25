import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static616 {

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
	public static int anInt10359;

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_123 = new Class257(55, 12);

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_149 = new Class71(53, 0);

	@OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
	public static int anInt10361 = 0;

	@OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
	public static int anInt10362 = -1;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIB)Z")
	public static boolean method8363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "([[BBLclient!fca;)V")
	public static void method8365(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class19_Sub1 arg1) {
		@Pc(12) int local12 = Static65.aByteArrayArray30.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(20) byte[] local20 = arg0[local14];
			if (local20 != null) {
				@Pc(32) int local32 = (Static170.anIntArray225[local14] >> 8) * 64 - Static628.anInt10493;
				@Pc(43) int local43 = (Static170.anIntArray225[local14] & 0xFF) * 64 - Static594.anInt10160;
				Static92.method2160();
				arg1.method3002(local32, Static171.aClass16_5, Static204.aClass48Array1, local20, local43);
			}
		}
	}
}
