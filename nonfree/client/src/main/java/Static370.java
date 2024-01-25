import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "Z")
	public static boolean aBoolean536;

	@OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
	public static int anInt7342 = 0;

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[200];

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIBII)V")
	public static void method6239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg3, 8);
		local8.method3088();
		local8.anInt3368 = arg1;
		local8.anInt3366 = arg0;
		local8.anInt3367 = arg2;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z")
	public static boolean method6241(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IBIII)I")
	public static int method6242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) int local16 = 65536 - Class177.anIntArray360[arg2 * 8192 / arg1] >> 1;
		return (local16 * arg0 >> 16) + (arg3 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(IC)Z")
	public static boolean method6243(@OriginalArg(1) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(37) char[] local37 = Static244.aCharArray1;
			for (@Pc(39) int local39 = 0; local39 < local37.length; local39++) {
				@Pc(45) char local45 = local37[local39];
				if (local45 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "([[BILclient!vaa;)V")
	public static void method6244(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class322_Sub1 arg1) {
		@Pc(8) int local8 = Static123.aByteArrayArray10.length;
		for (@Pc(14) int local14 = 0; local14 < local8; local14++) {
			@Pc(20) byte[] local20 = arg0[local14];
			if (local20 != null) {
				@Pc(33) int local33 = (Static431.anIntArray533[local14] >> 8) * 64 - Static84.anInt2565;
				@Pc(43) int local43 = (Static431.anIntArray533[local14] & 0xFF) * 64 - Static32.anInt723;
				Static293.method5263();
				arg1.method8712(local20, Static55.aClass104Array3, local43, Static186.aClass20_4, local33);
			}
		}
	}
}
