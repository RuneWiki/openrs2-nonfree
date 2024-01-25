import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
	public static int anInt8479;

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "J")
	public static long aLong227;

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "[J")
	public static long[] aLongArray18;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_212 = new Class160(128, 4);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method7394() {
		Static119.aClass317_13.method7873();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!rg;Z)Lclient!ep;")
	public static Class14_Sub17 method7395(@OriginalArg(0) int arg0, @OriginalArg(1) Class310 arg1) {
		@Pc(8) byte[] local8 = arg1.method7795(arg0);
		return local8 == null ? null : new Class14_Sub17(local8);
	}
}
