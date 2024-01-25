import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!g", name = "C", descriptor = "I")
	public static int anInt985;

	@OriginalMember(owner = "client!g", name = "E", descriptor = "I")
	public static int anInt987 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIZ)Lclient!sm;")
	public static Class3_Sub45 method826(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(19) long local19 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub45) Static444.aClass354_35.method7689(local19);
	}
}
