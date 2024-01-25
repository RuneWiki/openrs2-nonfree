import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eia", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!eia", name = "g", descriptor = "I")
	public static int anInt2727 = -1;

	@OriginalMember(owner = "client!eia", name = "n", descriptor = "Lclient!tm;")
	public static final Class338 aClass338_72 = new Class338();

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(II)V")
	public static void method2509(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(1, (long) arg0);
		local9.method2194();
	}
}
