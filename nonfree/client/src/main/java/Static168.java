import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!vb", name = "db", descriptor = "Lclient!ie;")
	public static Class3_Sub14 aClass3_Sub14_1;

	@OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
	public static final int anInt3652 = 5063219;

	@OriginalMember(owner = "client!vb", name = "Y", descriptor = "Lclient!b;")
	public static Class7 aClass7_27 = new Class7(50);

	@OriginalMember(owner = "client!vb", name = "Z", descriptor = "I")
	public static int anInt3653 = 1;

	@OriginalMember(owner = "client!vb", name = "ab", descriptor = "I")
	public static volatile int anInt3654 = 0;

	@OriginalMember(owner = "client!vb", name = "bb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1974 = Static122.method531("p12_full");

	@OriginalMember(owner = "client!vb", name = "cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1975 = Static122.method531("null");

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)I")
	public static int method2641() {
		return Static41.anInt1005++;
	}

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
	public static void method2642() {
		aClass7_27 = null;
		aClass73_1975 = null;
		aClass73_1974 = null;
		aClass3_Sub14_1 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IJ)Lclient!sd;")
	public static Class73 method2643(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % (long) 37 == 0L) {
			return null;
		} else {
			@Pc(28) long local28 = arg0;
			@Pc(30) int local30 = 0;
			while (local28 != 0L) {
				local30++;
				local28 /= 37L;
			}
			@Pc(46) byte[] local46 = new byte[local30];
			while (arg0 != 0L) {
				@Pc(50) long local50 = arg0;
				arg0 /= 37L;
				local30--;
				local46[local30] = Static152.aByteArray41[(int) (local50 - arg0 * 37L)];
			}
			@Pc(75) Class73 local75 = new Class73();
			local75.aByteArray36 = local46;
			local75.anInt3356 = local46.length;
			return local75;
		}
	}
}
