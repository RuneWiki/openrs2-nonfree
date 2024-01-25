import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!rda", name = "L", descriptor = "Lclient!dg;")
	public static final Class72 aClass72_10 = new Class72();

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(III)V")
	public static void method6263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class6_Sub5_Sub8 local8 = Static49.method760(16, arg0);
		local8.method3256();
		local8.anInt3740 = arg1;
	}
}
