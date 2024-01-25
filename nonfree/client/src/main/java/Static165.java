import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "Lclient!un;")
	public static Class4_Sub11 aClass4_Sub11_2;

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
	public static int anInt3395 = 0;

	@OriginalMember(owner = "client!gga", name = "e", descriptor = "Z")
	public static final boolean aBoolean282 = false;

	@OriginalMember(owner = "client!gga", name = "f", descriptor = "[Lclient!ie;")
	public static final Class153[] aClass153Array1 = new Class153[100];

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BII[BIIIII)V")
	public static void method3012(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(23) int local23 = -(arg4 >> 2);
		@Pc(28) int local28 = -(arg4 & 0x3);
		for (@Pc(31) int local31 = -arg3; local31 < 0; local31++) {
			@Pc(39) int local39;
			for (@Pc(35) int local35 = local23; local35 < 0; local35++) {
				local39 = arg1++;
				arg2[local39] += arg0[arg5++];
				@Pc(51) int local51 = arg1++;
				arg2[local51] += arg0[arg5++];
				@Pc(63) int local63 = arg1++;
				arg2[local63] += arg0[arg5++];
				@Pc(75) int local75 = arg1++;
				arg2[local75] += arg0[arg5++];
			}
			for (@Pc(93) int local93 = local28; local93 < 0; local93++) {
				local39 = arg1++;
				arg2[local39] += arg0[arg5++];
			}
			arg1 += arg6;
			arg5 += arg7;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)I")
	public static int method3013() {
		return Static224.anInt4124;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
	public static void method3014() {
		if (Static569.anIntArray535 != null && Static239.anIntArray474 != null) {
			return;
		}
		Static239.anIntArray474 = new int[256];
		Static569.anIntArray535 = new int[256];
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(26) double local26 = (double) local17 / 255.0D * 6.283185307179586D;
			Static569.anIntArray535[local17] = (int) (Math.sin(local26) * 4096.0D);
			Static239.anIntArray474[local17] = (int) (Math.cos(local26) * 4096.0D);
		}
	}
}
