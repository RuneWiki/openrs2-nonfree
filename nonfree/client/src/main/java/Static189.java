import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
	public static int anInt3543;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
	public static void method2916() {
		Static136.aClass222_14.method4422();
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBZ)Lclient!ib;")
	public static Class1_Sub25 method2917(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(17) long local17 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
		return (Class1_Sub25) Static15.aClass187_1.method3797(local17);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I")
	public static int method2919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static114.anIntArrayArray59 == null ? 0 : Static114.anIntArrayArray59[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	public static void method2921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class1_Sub6_Sub16 local15 = Static212.method3332(6, arg1);
		local15.method6594();
		local15.anInt8204 = arg0;
	}
}
