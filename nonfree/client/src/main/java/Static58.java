import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!caa", name = "G", descriptor = "[Lclient!dia;")
	public static Class75[] aClass75Array1;

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_2 = new Class48(0, Static573.aClass345_18, Static573.aClass345_18, 0, 1);

	@OriginalMember(owner = "client!caa", name = "m", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_3 = new Class48(1, Static573.aClass345_18, 2);

	@OriginalMember(owner = "client!caa", name = "n", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_4 = new Class48(2, Static573.aClass345_18, Static573.aClass345_18, 2, 3);

	@OriginalMember(owner = "client!caa", name = "o", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_5 = new Class48(3, Static573.aClass345_18, 3);

	@OriginalMember(owner = "client!caa", name = "p", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_6 = new Class48(4, Static573.aClass345_18, Static573.aClass345_18, 3, 4);

	@OriginalMember(owner = "client!caa", name = "q", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_7 = new Class48(5, Static573.aClass345_18, 4);

	@OriginalMember(owner = "client!caa", name = "r", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_8 = new Class48(6, Static573.aClass345_18, 4);

	@OriginalMember(owner = "client!caa", name = "s", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_9 = new Class48(7, Static573.aClass345_18, Static573.aClass345_18, 4, 5);

	@OriginalMember(owner = "client!caa", name = "t", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_10 = new Class48(8, Static573.aClass345_18, Static573.aClass345_18, 5, 98, true, true);

	@OriginalMember(owner = "client!caa", name = "u", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_11 = new Class48(9, Static573.aClass345_18, 99);

	@OriginalMember(owner = "client!caa", name = "v", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_12 = new Class48(10, Static573.aClass345_18, 100);

	@OriginalMember(owner = "client!caa", name = "w", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_13 = new Class48(11, Static573.aClass345_19, Static573.aClass345_19, 0, 92, true, true);

	@OriginalMember(owner = "client!caa", name = "x", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_14 = new Class48(12, Static573.aClass345_19, Static573.aClass345_19, 92, 92);

	@OriginalMember(owner = "client!caa", name = "y", descriptor = "Lclient!caa;")
	private static final Class48 aClass48_15 = new Class48(13, Static573.aClass345_19, Static573.aClass345_19, 92, 93);

	@OriginalMember(owner = "client!caa", name = "z", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_16 = new Class48(14, Static573.aClass345_19, Static573.aClass345_19, 94, 95);

	@OriginalMember(owner = "client!caa", name = "A", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_17 = new Class48(15, Static573.aClass345_19, Static573.aClass345_19, 96, 97);

	@OriginalMember(owner = "client!caa", name = "B", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_18 = new Class48(16, Static573.aClass345_19, 97);

	@OriginalMember(owner = "client!caa", name = "C", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_19 = new Class48(17, Static573.aClass345_19, 97);

	@OriginalMember(owner = "client!caa", name = "D", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_20 = new Class48(18, Static573.aClass345_19, 100);

	@OriginalMember(owner = "client!caa", name = "E", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_21 = new Class48(19, Static573.aClass345_19, 100);

	@OriginalMember(owner = "client!caa", name = "F", descriptor = "Lclient!caa;")
	public static final Class48 aClass48_22 = new Class48(20, Static573.aClass345_19, 100);

	@OriginalMember(owner = "client!caa", name = "H", descriptor = "I")
	public static int anInt1440 = 1;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I[S)[S")
	public static short[] method1307(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static650.method2271(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)[Lclient!caa;")
	public static Class48[] method1310() {
		return new Class48[] { aClass48_2, aClass48_3, aClass48_4, aClass48_5, aClass48_6, aClass48_7, aClass48_8, aClass48_9, aClass48_10, aClass48_11, aClass48_12, aClass48_13, aClass48_14, aClass48_15, aClass48_16, aClass48_17, aClass48_18, aClass48_19, aClass48_20, aClass48_21, aClass48_22 };
	}
}
