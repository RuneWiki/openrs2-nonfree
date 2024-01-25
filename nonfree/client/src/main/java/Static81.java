import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	public static final int anInt1946 = 4096;

	@OriginalMember(owner = "client!eb", name = "Ib", descriptor = "I")
	public static final int anInt1952 = Static58.method1271(2200);

	@OriginalMember(owner = "client!eb", name = "pc", descriptor = "I")
	public static final int anInt1960 = 4096;

	@OriginalMember(owner = "client!eb", name = "sc", descriptor = "I")
	public static int anInt1961 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!fg;[Lclient!eb;)Lclient!eb;")
	public static Class57_Sub1 method1737(@OriginalArg(0) Class30_Sub2 arg0, @OriginalArg(1) Class57_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class57_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class57_Sub1(arg0, arg1);
		}
	}
}
