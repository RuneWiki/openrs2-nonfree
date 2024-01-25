import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
	public static int anInt1950;

	@OriginalMember(owner = "client!ns", name = "f", descriptor = "Lclient!sc;")
	public static final Class208 aClass208_5 = new Class208();

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)I")
	public static int method1562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static159.anIntArray344[arg0 & 0x3] : Static81.anIntArray195[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II[BI)I")
	public static int method1575(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local12 = Class1_Sub2_Sub30.anIntArray562[(local12 ^ arg1[local14]) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}
}
