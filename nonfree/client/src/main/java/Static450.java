import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "Lclient!nn;")
	public static Class174 aClass174_1;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "[S")
	public static final short[] aShortArray114 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILclient!uu;)V")
	public static void method5935(@OriginalArg(1) Class5_Sub15_Sub2 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static246.anInt3974; local3++) {
			@Pc(17) int local17 = Static52.anIntArray44[local3];
			@Pc(21) Class2_Sub1_Sub3_Sub2 local21 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local17];
			@Pc(25) int local25 = arg0.method5539();
			if ((local25 & 0x10) != 0) {
				local25 += arg0.method5539() << 8;
			}
			if ((local25 & 0x800) != 0) {
				local25 += arg0.method5539() << 16;
			}
			Static133.method1869(local25, arg0, local21, local17);
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JIIBZILjava/lang/String;IZILjava/lang/String;)V")
	public static void method5939(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) String arg9) {
		if (!Static272.aBoolean283 && Static18.anInt395 < 500) {
			@Pc(24) int local24 = arg6 == -1 ? Static333.anInt5333 : arg6;
			@Pc(38) Class5_Sub41 local38 = new Class5_Sub41(arg5, arg9, local24, arg4, arg1, arg0, arg2, arg8, arg3, arg7);
			Static122.aClass177_13.method3615(local38);
			Static18.anInt395++;
		}
	}
}
