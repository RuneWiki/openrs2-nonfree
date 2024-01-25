import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_184 = new Class221(17, -1);

	@OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
	public static int anInt5561 = 0;

	@OriginalMember(owner = "client!qi", name = "C", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Lclient!wo;")
	public static Class223 method4684(@OriginalArg(0) int arg0) {
		@Pc(5) Class107 local5 = Static258.aClass107_36;
		@Pc(14) Class223 local14;
		synchronized (Static258.aClass107_36) {
			local14 = (Class223) Static258.aClass107_36.method3021((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(35) byte[] local35 = Static8.aClass104_6.method2756(3, arg0);
		local14 = new Class223();
		if (local35 != null) {
			local14.method5802(new Class2_Sub12(local35));
		}
		@Pc(50) Class107 local50 = Static258.aClass107_36;
		synchronized (Static258.aClass107_36) {
			Static258.aClass107_36.method3018((long) arg0, local14);
			return local14;
		}
	}
}
