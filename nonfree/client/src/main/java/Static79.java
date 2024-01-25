import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public static int anInt1141;

	@OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
	public static int anInt1140 = 0;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "([BZ)[B")
	public static byte[] method1085(@OriginalArg(0) byte[] arg0) {
		@Pc(13) int local13 = arg0.length;
		@Pc(16) byte[] local16 = new byte[local13];
		Static695.method5648(arg0, 0, local16, 0, local13);
		return local16;
	}

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "(I)V")
	public static void method1086() {
		Static98.aClass359_11.method8507();
		Static99.aClass359_12.method8507();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!jc;)Lclient!gja;")
	public static Class137_Sub1 method1087(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(13) Class137 local13 = Static614.method8475(arg0);
		@Pc(17) int local17 = arg0.method3004();
		return new Class137_Sub1(local13.anInt4035, local13.aClass318_11, local13.aClass238_6, local13.anInt4036, local13.anInt4034, local17);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(II)V")
	public static void method1088(@OriginalArg(1) int arg0) {
		Static625.anInt9857 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)V")
	public static void method1089(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static334.aClass243ArrayArrayArray2 = Static104.aClass243ArrayArrayArray1;
			Static555.aClass96Array3 = Static216.aClass96Array1;
		} else {
			Static334.aClass243ArrayArrayArray2 = Static526.aClass243ArrayArrayArray3;
			Static555.aClass96Array3 = Static524.aClass96Array2;
		}
		Static66.anInt802 = Static334.aClass243ArrayArrayArray2.length;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public static void method1090() {
		for (@Pc(15) int local15 = 0; local15 < Static272.aByteArrayArrayArray2.length; local15++) {
			for (@Pc(19) int local19 = 0; local19 < Static272.aByteArrayArrayArray2[0].length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < Static272.aByteArrayArrayArray2[0][0].length; local23++) {
					Static272.aByteArrayArrayArray2[local15][local19][local23] = 0;
				}
			}
		}
	}
}
