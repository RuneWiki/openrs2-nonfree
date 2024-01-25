import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!uk", name = "k", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_268 = new Class235(104, 10);

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public static int anInt8934 = -1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBZ)I")
	public static int method7300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class1_Sub25 local8 = Static189.method2917(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray327.length) {
			return local8.anIntArray327[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(BILjava/lang/String;ZLjava/lang/String;)V")
	public static void method7303(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		Static280.method3935(arg3, true, arg0, arg1, arg2, -1);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method7304(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(13) byte[] local13;
		if (arg2 > 0) {
			local13 = new byte[arg0];
			for (@Pc(15) int local15 = 0; local15 < arg0; local15++) {
				local13[local15] = arg1[arg2 + local15];
			}
		} else {
			local13 = arg1;
		}
		@Pc(37) Class147 local37 = new Class147();
		local37.method3261();
		local37.method3262((long) (arg0 * 8), local13);
		@Pc(56) byte[] local56 = new byte[64];
		local37.method3259(local56);
		return local56;
	}
}
