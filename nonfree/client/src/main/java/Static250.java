import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_84 = new Class44(93, 6);

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)V")
	public static void method3680() {
		@Pc(1) Class264 local1 = Static324.aClass264_38;
		synchronized (Static324.aClass264_38) {
			Static324.aClass264_38.method6368();
		}
		local1 = Static263.aClass264_31;
		synchronized (Static263.aClass264_31) {
			Static263.aClass264_31.method6368();
		}
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ie;")
	public static Class158 method3681(@OriginalArg(0) Class137 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class185 local9 = Static109.method1910(arg1, arg0, true);
		return local9 == null ? null : local9.aClass158_8;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(II)I")
	public static int method3682(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(IIZ)Lclient!sw;")
	public static Class14_Sub50 method3683(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) long local12 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class14_Sub50) Static602.aClass187_78.method4078(local12);
	}
}
