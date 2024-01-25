import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mi", name = "F", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray22 = new String[100];

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "Z")
	public static boolean aBoolean318 = false;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)Z")
	public static boolean method4059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)V")
	public static void method4060(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(11, arg0);
		local8.method517();
	}
}
