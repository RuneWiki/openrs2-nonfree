import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_181 = new Class186(78, -1);

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "Lclient!ui;")
	public static final Class369 aClass369_8 = new Class369();

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILjava/lang/String;B)V")
	public static void method8576(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(16) Class3_Sub4_Sub2 local16 = Static502.method7211(2, (long) arg0);
		local16.method630();
		local16.aString16 = arg1;
	}
}
