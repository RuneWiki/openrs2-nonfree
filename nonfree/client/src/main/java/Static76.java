import java.awt.Canvas;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!cr", name = "i", descriptor = "J")
	public static long aLong87;

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "[I")
	public static final int[] anIntArray106 = new int[4];

	@OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
	public static int anInt1848 = -1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)I")
	public static int method1621() {
		@Pc(7) Class12 local7 = Static136.aClass12_8;
		@Pc(9) boolean local9 = false;
		if (Static375.anInt6609 != 0) {
			@Pc(15) Canvas local15 = new Canvas();
			local15.setSize(100, 100);
			local9 = true;
			local7 = Static447.method6466(0, local15, null, 0, null);
		}
		@Pc(32) long local32 = Static255.method4035();
		for (@Pc(34) int local34 = 0; local34 < 10000; local34++) {
			local7.method6433();
		}
		@Pc(59) int local59 = (int) (Static255.method4035() - local32);
		local7.method6418(100, 0, 0, 100, -16777216);
		if (local9) {
			local7.method6465();
		}
		return local59;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!gs;")
	public static Class75 method1623(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class75_Sub1(arg0, 7500);
	}
}
