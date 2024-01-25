import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "F")
	public static float aFloat185;

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "Lclient!jn;")
	public static Class176 aClass176_74;

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	public static int anInt5748;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Z")
	public static final boolean aBoolean436 = false;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Lclient!rh;")
	public static Class1_Sub4_Sub5 method4859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass1_Sub4_Sub5_1;
	}
}
