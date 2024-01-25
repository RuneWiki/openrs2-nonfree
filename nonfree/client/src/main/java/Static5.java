import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "Lclient!gaa;")
	public static Class102 aClass102_1;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "Lclient!rn;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "I")
	public static int anInt107 = 0;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "[S")
	public static short[] aShortArray2 = new short[256];

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
	public static int method240(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(28) int local28 = (local18 >>> 2 & 0x33333333) + (local18 & 0x33333333);
		@Pc(36) int local36 = (local28 >>> 4) + local28 & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Ljava/io/File;II)[B")
	public static byte[] method241(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg1];
			Static127.method3841(local6, arg0, arg1);
			return local6;
		} catch (@Pc(19) IOException local19) {
			return null;
		}
	}
}
