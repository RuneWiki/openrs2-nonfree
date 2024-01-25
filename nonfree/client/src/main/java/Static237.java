import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Lclient!pu;")
	public static final Class266 aClass266_4 = new Class266(4, 19);

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
	public static int anInt4723 = -1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!dm;I)V")
	public static void method3926(@OriginalArg(0) Class78 arg0) {
		@Pc(7) Class78 local7 = Static505.method7154(arg0);
		@Pc(15) int local15;
		@Pc(12) int local12;
		if (local7 == null) {
			local12 = Static585.anInt9606;
			local15 = Static571.anInt9399;
		} else {
			local12 = local7.anInt1991;
			local15 = local7.anInt1964;
		}
		Static489.method7001(local15, local12, false, arg0);
		Static187.method3390(local15, local12, arg0);
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	public static void method3927() {
		Static180.aClass233_19.method5663();
	}
}
