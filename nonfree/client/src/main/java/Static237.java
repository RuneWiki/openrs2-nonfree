import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
	public static int anInt4718;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)I")
	public static int method4263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(17) double local17 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(25) double local25 = (local10 - local17) * Math.random() + local17;
		return (int) (Math.pow(2.0D, local25) + 0.5D);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)V")
	public static void method4264() {
		Static283.aClass271_28.method7181();
		Static544.anInt9515 = 0;
	}
}
