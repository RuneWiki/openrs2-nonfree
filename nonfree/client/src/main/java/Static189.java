import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt3967 = 0;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public static int anInt3968 = -1;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public static int anInt3970 = 1;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!jm;")
	public static Class3_Sub7_Sub10 method3407(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub7_Sub10 local10 = (Class3_Sub7_Sub10) Static128.aClass188_5.method5061((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static203.aClass100_85.method2319(19, arg0);
		local10 = new Class3_Sub7_Sub10();
		if (local20 != null) {
			local10.method2463(new Class3_Sub4(local20));
		}
		Static128.aClass188_5.method5063(local10, (long) arg0);
		return local10;
	}
}
