import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "J")
	public static long aLong105 = 0L;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ud;)Lclient!gm;")
	public static Class133 method3261(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(12) Class133 local12 = new Class133();
		local12.anInt4054 = arg0.method6884();
		local12.aClass2_Sub5_Sub17_1 = Static249.aClass111_1.method2928(local12.anInt4054);
		return local12;
	}
}
