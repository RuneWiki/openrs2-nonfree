import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public static int anInt5727;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Lclient!kca;")
	public static Class189 aClass189_6;

	@OriginalMember(owner = "client!li", name = "t", descriptor = "[I")
	public static int[] anIntArray470;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "Lclient!cu;")
	public static final Class61 aClass61_74 = new Class61(1, -1);

	@OriginalMember(owner = "client!li", name = "o", descriptor = "I")
	public static int anInt5730 = 0;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[200];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method4872(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(3, arg0);
		local8.method3066();
		local8.aString29 = arg1;
	}
}
