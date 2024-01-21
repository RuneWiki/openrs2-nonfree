import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
	public static int anInt3804;

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!vg", name = "z", descriptor = "[I")
	public static int[] anIntArray400;

	@OriginalMember(owner = "client!vg", name = "F", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array11;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
	public static boolean aBoolean262 = false;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	public static int anInt3798 = 0;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	public static int anInt3799 = 0;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2029 = Static122.method531("Benutzen");

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2030 = Static122.method531("");

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2031 = aClass73_2030;

	@OriginalMember(owner = "client!vg", name = "C", descriptor = "[Lclient!sd;")
	public static Class73[] aClass73Array28 = new Class73[8];

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
	public static void method2692() {
		aByteArrayArray12 = null;
		aClass73_2030 = null;
		aClass73_2031 = null;
		anIntArray400 = null;
		aClass73Array28 = null;
		aClass3_Sub1_Sub3_Sub4Array11 = null;
		anIntArray399 = null;
		aClass73_2029 = null;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	public static void method2693() {
		for (@Pc(3) int local3 = 0; local3 < Static181.anInt3975; local3++) {
			@Pc(9) int local9 = Static2.anIntArray1[local3];
			@Pc(13) Class3_Sub1_Sub4_Sub7_Sub1 local13 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local9];
			@Pc(17) int local17 = Static159.aClass3_Sub12_Sub1_4.method1354();
			if ((local17 & 0x40) != 0) {
				local17 += Static159.aClass3_Sub12_Sub1_4.method1354() << 8;
			}
			Static61.method1116(local13, local17, local9);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!f;IZI)[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] method2694(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return Static133.method2204(arg2, arg1, arg0) ? Static41.method777() : null;
	}
}
