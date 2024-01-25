import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "I")
	public static int anInt1169;

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "I")
	public static int anInt1163 = 0;

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "Lclient!aq;")
	public static final Class22 aClass22_5 = new Class22(64);

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)V")
	public static void method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(15, (long) 0);
		local9.method2486();
		local9.anInt2680 = arg1;
		local9.anInt2674 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Lclient!ol;I)Lclient!dn;")
	public static Class26_Sub3 method1140(@OriginalArg(0) Class2_Sub8 arg0) {
		return new Class26_Sub3(arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5174(), arg0.method5161(), arg0.method5161(), arg0.method5203());
	}
}
