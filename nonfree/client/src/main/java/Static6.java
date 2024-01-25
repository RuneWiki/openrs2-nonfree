import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
	public static final int anInt91 = Static357.method4688(2200);

	@OriginalMember(owner = "client!ag", name = "Fb", descriptor = "I")
	public static final int anInt95 = 4096;

	@OriginalMember(owner = "client!ag", name = "Vb", descriptor = "I")
	public static final int anInt99 = 4096;

	@OriginalMember(owner = "client!ag", name = "qc", descriptor = "I")
	public static int anInt102 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!wc;[Lclient!ag;)Lclient!ag;")
	public static Class8_Sub1 method115(@OriginalArg(0) Class117_Sub2 arg0, @OriginalArg(1) Class8_Sub1[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class8_Sub1 local3 = null;
		for (@Pc(5) int local5 = 0; local5 < arg1.length; local5++) {
			if (arg1[local5] != null) {
				local1++;
				local3 = arg1[local5];
			}
		}
		if (local1 == 1) {
			return local3;
		} else {
			return new Class8_Sub1(arg0, arg1);
		}
	}
}
