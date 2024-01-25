import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ji", name = "Gb", descriptor = "Lclient!ni;")
	public static Class223 aClass223_138;

	@OriginalMember(owner = "client!ji", name = "X", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_175 = new Class73(114, 3);

	@OriginalMember(owner = "client!ji", name = "cb", descriptor = "I")
	public static int anInt10099 = -1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "(I)V")
	public static void method8233() {
		@Pc(13) Class6_Sub5_Sub19 local13 = Static348.method5721(0, 15);
		local13.method5174();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZII)Z")
	public static boolean method8258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
