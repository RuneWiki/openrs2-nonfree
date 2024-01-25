import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
	public static int[] anIntArray662;

	@OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
	public static int anInt10168;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	public static int anInt10169;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_20 = new Class376(4);

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_16 = new Class376(1);

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_13 = new Class376(1);

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_14 = new Class376(2);

	@OriginalMember(owner = "client!wq", name = "g", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_15 = new Class376(4);

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_17 = new Class376(2);

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_18 = new Class376(4);

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!wq;")
	public static final Class376 aClass376_19 = new Class376(2);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)I")
	public static int method8710(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
	public static void method8712() {
		Static293.anInt5180 = Static256.aClass282_7.anInt8306 + Static256.aClass282_7.anInt8303 + 2;
		Static324.anInt8110 = Static489.aClass282_12.anInt8306 + Static489.aClass282_12.anInt8303 + 2;
		Static402.aStringArray27 = new String[500];
		for (@Pc(30) int local30 = 0; local30 < Static402.aStringArray27.length; local30++) {
			Static402.aStringArray27[local30] = "";
		}
		Static410.method6501(Static59.aClass43_1.method1598(Static325.anInt6083));
	}
}
