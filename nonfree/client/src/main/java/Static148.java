import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "Z")
	public static boolean aBoolean221 = false;

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[50][];

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "([[BLclient!ct;I)V")
	public static void method2560(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class67_Sub1 arg1) {
		@Pc(21) int local21 = Static618.aByteArrayArray24.length;
		for (@Pc(23) int local23 = 0; local23 < local21; local23++) {
			@Pc(29) byte[] local29 = arg0[local23];
			if (local29 != null) {
				@Pc(42) int local42 = (Static442.anIntArray464[local23] >> 8) * 64 - Static417.anInt7047;
				@Pc(53) int local53 = (Static442.anIntArray464[local23] & 0xFF) * 64 - Static347.anInt7851;
				Static312.method4827();
				arg1.method1834(Static582.aClass16_12, local29, local42, local53, Static27.aClass198Array1);
			}
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		Static491.aClass167Array16[Static114.anInt2292++] = new Class167(4, arg0, arg2, arg4, arg4, arg2, arg1, arg5, arg5, arg1, arg3, arg3, arg6, arg6);
	}
}
