import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "Z")
	public static boolean aBoolean261 = false;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method2963(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = (local18 << 5) + arg0.charAt(local20) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "([[BBLclient!vc;)V")
	public static void method2964(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class200_Sub1 arg1) {
		@Pc(8) int local8 = Static263.aByteArrayArray16.length;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(16) byte[] local16 = arg0[local10];
			if (local16 != null) {
				@Pc(29) int local29 = (Static444.anIntArray613[local10] >> 8) * 64 - Static238.anInt4280;
				@Pc(40) int local40 = (Static444.anIntArray613[local10] & 0xFF) * 64 - Static371.anInt6936;
				Static491.method6549();
				arg1.method7411(local40, local16, local29, Static103.aClass39_3, Static207.aClass99Array1);
			}
		}
	}
}
