import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static538 {

	@OriginalMember(owner = "client!up", name = "e", descriptor = "I")
	public static int anInt8629;

	@OriginalMember(owner = "client!up", name = "b", descriptor = "Lclient!jd;")
	public static final Class158 aClass158_7 = new Class158();

	@OriginalMember(owner = "client!up", name = "f", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_169 = new Class56(18, -2);

	@OriginalMember(owner = "client!up", name = "g", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_170 = new Class56(105, 8);

	@OriginalMember(owner = "client!up", name = "h", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_95 = new Class303(28, -1);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BI)V")
	public static void method7178(@OriginalArg(1) int arg0) {
		Static570.anInt9273 = 2;
		Static61.anInt1462 = arg0;
		if (Static205.aString25 == null) {
			Static526.method7023(35);
		} else {
			@Pc(29) Class3_Sub11 local29 = new Class3_Sub11(Static90.method1710(Static414.method5927(Static205.aString25)));
			@Pc(33) long local33 = local29.method5226();
			Static576.aLong269 = local29.method5226();
			Static259.method3987(true, Static596.method7952(local33), "");
		}
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)I")
	public static int method7180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >>> 31;
		return (local13 + arg1) / arg0 - local13;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
	public static void method7181() {
		@Pc(1) Class6 local1 = Static220.aClass6_22;
		synchronized (Static220.aClass6_22) {
			Static220.aClass6_22.method102();
		}
		local1 = Static272.aClass6_29;
		synchronized (Static272.aClass6_29) {
			Static272.aClass6_29.method102();
		}
	}
}
