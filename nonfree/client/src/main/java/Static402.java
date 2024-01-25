import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "Lclient!o;")
	public static Class80 aClass80_23;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_93 = new Class27(63, -1);

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZLclient!nn;Ljava/lang/String;)I")
	public static int method5294(@OriginalArg(1) Class10_Sub8 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt2989;
		@Pc(10) byte[] local10 = Static394.method5229(arg1);
		arg0.method2467(local10.length);
		arg0.anInt2989 += Static379.aClass257_2.method5673(local10, arg0.anInt2989, arg0.aByteArray44, 0, local10.length);
		return arg0.anInt2989 - local6;
	}
}
