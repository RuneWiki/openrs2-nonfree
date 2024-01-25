import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "[I")
	public static int[] anIntArray270;

	@OriginalMember(owner = "client!ii", name = "z", descriptor = "Z")
	public static boolean aBoolean186;

	@OriginalMember(owner = "client!ii", name = "x", descriptor = "Lclient!oo;")
	public static final Class181 aClass181_3 = new Class181("LIVE", 0);

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
	public static void method2510() {
		@Pc(7) Class266 local7 = null;
		try {
			@Pc(15) Class236 local15 = Static230.aClass61_4.method1456("3", false);
			while (local15.anInt6178 == 0) {
				Static214.method2089(1L);
			}
			if (local15.anInt6178 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class266) local15.anObject8;
			@Pc(51) byte[] local51 = new byte[(int) local7.method5673()];
			if (local51.length == 0) {
				Static133.aString26 = "";
				Static189.aString54 = "";
			} else {
				@Pc(72) int local72;
				for (@Pc(59) int local59 = 0; local59 < local51.length; local59 += local72) {
					local72 = local7.method5677(local59, local51, local51.length - local59);
					if (local72 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(98) Class7_Sub14 local98 = new Class7_Sub14(local51);
				@Pc(104) int local104 = local98.method3981();
				if (local104 > 50) {
					throw new RuntimeException("Bad length");
				}
				local98.anInt4989 = local104 + 1;
				if (!local98.method3978()) {
					throw new RuntimeException("Invalid CRC");
				}
				local98.anInt4989 = 1;
				@Pc(133) int local133 = local98.method3981();
				if (local133 != 0) {
					throw new RuntimeException("Invalid version " + local133);
				}
				Static189.aString54 = local98.method3992();
				Static133.aString26 = local98.method3992();
			}
		} catch (@Pc(165) Exception local165) {
			Static189.aString54 = "";
			Static133.aString26 = "";
		}
		try {
			if (local7 != null) {
				local7.method5674();
			}
		} catch (@Pc(178) Exception local178) {
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLclient!vd;IIII)Lclient!wq;")
	public static Class59_Sub3_Sub1 method2511(@OriginalArg(1) Class51_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean467 || Static217.method3066(arg4) && Static217.method3066(arg1)) {
			return new Class59_Sub3_Sub1(arg0, 3553, arg3, arg2, arg4, arg1, true);
		} else if (arg0.aBoolean442) {
			return new Class59_Sub3_Sub1(arg0, 34037, arg3, arg2, arg4, arg1, true);
		} else {
			return new Class59_Sub3_Sub1(arg0, arg3, arg2, arg4, arg1, Static444.method5654(arg4), Static444.method5654(arg1), true);
		}
	}
}
