import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!ps", name = "zb", descriptor = "J")
	public static long aLong190;

	@OriginalMember(owner = "client!ps", name = "rb", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_92 = new Class154(71, 18);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(III)Z")
	public static boolean method5634(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBILclient!n;I)V")
	public static void method5636(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub32 arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) (arg1 << 14 | arg3 << 28 | arg0);
		@Pc(22) Class2_Sub6 local22 = (Class2_Sub6) Static531.aClass90_39.method1685(local16);
		if (local22 == null) {
			local22 = new Class2_Sub6();
			Static531.aClass90_39.method1684(local22, local16);
			local22.aClass70_1.method1269(arg2);
			return;
		}
		@Pc(45) Class164 local45 = Static466.aClass130_2.method2311(arg2.anInt5953);
		@Pc(48) int local48 = local45.anInt3834;
		if (local45.anInt3860 == 1) {
			local48 *= arg2.anInt5954 + 1;
		}
		for (@Pc(67) Class2_Sub32 local67 = (Class2_Sub32) local22.aClass70_1.method1264(); local67 != null; local67 = (Class2_Sub32) local22.aClass70_1.method1261()) {
			local45 = Static466.aClass130_2.method2311(local67.anInt5953);
			@Pc(78) int local78 = local45.anInt3834;
			if (local45.anInt3860 == 1) {
				local78 *= local67.anInt5954 + 1;
			}
			if (local48 > local78) {
				Static447.method5847(arg2, local67);
				return;
			}
		}
		local22.aClass70_1.method1269(arg2);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/net/Socket;IB)Lclient!pl;")
	public static Class124 method5638(@OriginalArg(0) Socket arg0) throws IOException {
		return new Class124_Sub1(arg0, 7500);
	}
}
