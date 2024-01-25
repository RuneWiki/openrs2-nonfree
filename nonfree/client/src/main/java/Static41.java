import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bga", name = "Jh", descriptor = "Lclient!oaa;")
	public static final Class234 aClass234_3 = new Class234(15, 0, 1, 0);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method1585(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg1, 2);
		local8.method3088();
		local8.aString27 = arg0;
	}
}
