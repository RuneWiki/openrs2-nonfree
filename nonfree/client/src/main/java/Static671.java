import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "[[B")
	public static byte[][] aByteArrayArray26;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_201 = new Class225(15, 8);

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "Lclient!jb;")
	public static Class2_Sub6_Sub7 aClass2_Sub6_Sub7_1 = null;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Z")
	public static boolean method9143(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method9146(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			local8[local17] = local17 + ": ";
			if (arg0 != null && arg0[local17] != null) {
				local8[local17] = local8[local17] + arg0[local17];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I")
	public static int method9147(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
