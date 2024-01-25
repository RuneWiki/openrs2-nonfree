import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dga", name = "ub", descriptor = "I")
	public static int anInt1683;

	@OriginalMember(owner = "client!dga", name = "R", descriptor = "Lclient!la;")
	public static Class208 aClass208_17;

	@OriginalMember(owner = "client!dga", name = "V", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!dga", name = "gb", descriptor = "Lclient!eu;")
	public static final Class114 aClass114_6 = new Class114(1);

	@OriginalMember(owner = "client!dga", name = "a", descriptor = "(BII)I")
	public static int method1522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(25) double local25 = local17 + Math.random() * (local10 - local17);
		return (int) (Math.pow(2.0D, local25) + 0.5D);
	}

	@OriginalMember(owner = "client!dga", name = "b", descriptor = "(II)I")
	public static int method1524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return aShortArrayArray3 == null ? 0 : aShortArrayArray3[arg0][arg1] & 0xFFFF;
	}
}
