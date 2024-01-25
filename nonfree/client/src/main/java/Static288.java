import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!lca", name = "c", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray4;

	@OriginalMember(owner = "client!lca", name = "j", descriptor = "[Lclient!ui;")
	public static Class333[] aClass333Array4;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "J")
	public static long aLong130 = -1L;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "Lclient!faa;")
	public static final Class91 aClass91_22 = new Class91(32);

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "[Lclient!af;")
	public static final Class7[] aClass7Array1 = new Class7[6];

	@OriginalMember(owner = "client!lca", name = "i", descriptor = "[I")
	public static final int[] anIntArray304 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILclient!en;I)Lclient!ir;")
	public static Class1_Sub8_Sub6 method4333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2) {
		@Pc(10) int local10 = arg0 << 10 | arg2.anInt2516;
		@Pc(19) Class1_Sub8_Sub6 local19 = (Class1_Sub8_Sub6) Static319.aClass16_3.method471((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static220.aClass308_111.method6547(Static220.aClass308_111.method6548(local10));
		if (local31 == null) {
			local10 = arg2.anInt2516 | arg1 + 65536 << 10;
			local19 = (Class1_Sub8_Sub6) Static319.aClass16_3.method471((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static220.aClass308_111.method6547(Static220.aClass308_111.method6548(local10));
			if (local31 == null) {
				local10 = arg2.anInt2516 | 0x3FFFC00;
				local19 = (Class1_Sub8_Sub6) Static319.aClass16_3.method471((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static220.aClass308_111.method6547(Static220.aClass308_111.method6548(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static236.method7223(local31);
					} catch (@Pc(198) Exception local198) {
						throw new RuntimeException(local198.getMessage() + " S: " + local10);
					}
					local19.aClass84_3 = arg2;
					Static319.aClass16_3.method476((long) local10 << 16, local19);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static236.method7223(local31);
				} catch (@Pc(128) Exception local128) {
					throw new RuntimeException(local128.getMessage() + " S: " + local10);
				}
				local19.aClass84_3 = arg2;
				Static319.aClass16_3.method476((long) local10 << 16, local19);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static236.method7223(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass84_3 = arg2;
			Static319.aClass16_3.method476((long) local10 << 16, local19);
			return local19;
		}
	}
}
