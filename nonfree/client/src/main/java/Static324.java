import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "I")
	public static int anInt6183 = -50;

	@OriginalMember(owner = "client!lp", name = "e", descriptor = "Z")
	public static final boolean aBoolean414 = true;

	@OriginalMember(owner = "client!lp", name = "m", descriptor = "Lclient!ada;")
	public static final Class8 aClass8_31 = new Class8();

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "[I")
	public static final int[] anIntArray365 = new int[8];

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZII)Z")
	public static boolean method5379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V")
	public static void method5383() {
		@Pc(12) Class81[] local12 = Class100_Sub1.aClass81Array3;
		synchronized (Class100_Sub1.aClass81Array3) {
			for (@Pc(16) int local16 = 0; local16 < Class100_Sub1.aClass81Array3.length; local16++) {
				Class100_Sub1.aClass81Array3[local16] = new Class81();
				Static317.anIntArray361[local16] = 0;
			}
		}
	}
}
