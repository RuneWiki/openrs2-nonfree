import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public static int anInt2153;

	@OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
	public static int anInt2167;

	@OriginalMember(owner = "client!jc", name = "B", descriptor = "Lclient!jh;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "Z")
	public static boolean aBoolean195 = true;

	@OriginalMember(owner = "client!jc", name = "w", descriptor = "Lclient!nk;")
	public static Class85 aClass85_3 = new Class85();

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
	public static int[] anIntArray217 = new int[5];

	@OriginalMember(owner = "client!jc", name = "A", descriptor = "Lclient!sc;")
	public static Class107 aClass107_594 = Static231.method3737("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
	public static int anInt2168 = 0;

	@OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
	public static int anInt2169 = 1;

	@OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
	public static int anInt2170 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!jb;ZIZLclient!jb;)Lclient!cc;")
	public static Class1_Sub2_Sub3 method1673(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class28 arg2) {
		@Pc(3) boolean local3 = true;
		@Pc(8) int[] local8 = arg0.method830(arg1);
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(20) byte[] local20 = arg0.method821(local8[local10], arg1);
			if (local20 == null) {
				local3 = false;
			} else {
				@Pc(40) int local40 = (local20[0] & 0xFF) << 8 | local20[1] & 0xFF;
				@Pc(56) byte[] local56 = arg2.method821(0, local40);
				if (local56 == null) {
					local3 = false;
				}
			}
		}
		if (!local3) {
			return null;
		}
		try {
			return new Class1_Sub2_Sub3(arg0, arg2, arg1, false);
		} catch (@Pc(82) Exception local82) {
			return null;
		}
	}
}
