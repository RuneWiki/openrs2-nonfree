import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array1;

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!fg;")
	public static Class108 aClass108_1;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_1 = new Class168(0, 4);

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "[Lclient!tga;")
	public static final Class336[] aClass336Array1 = new Class336[2048];

	@OriginalMember(owner = "client!ad", name = "r", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_3 = new Class118(16);

	@OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
	public static int anInt74 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method96(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class2_Sub2_Sub4 local16 = Static566.method7763(arg1, 12);
		local16.method662();
		local16.anInt823 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)Z")
	public static boolean method97(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB[B)[B")
	public static byte[] method98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(10) byte[] local10;
		if (arg1 > 0) {
			local10 = new byte[arg0];
			for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
				local10[local12] = arg2[arg1 + local12];
			}
		} else {
			local10 = arg2;
		}
		@Pc(38) Class281 local38 = new Class281();
		local38.method6246();
		local38.method6245(local10, (long) (arg0 * 8));
		@Pc(57) byte[] local57 = new byte[64];
		local38.method6247(local57);
		return local57;
	}
}
