import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!gf;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "[Lclient!ha;")
	public static Class35[] aClass35Array14;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIII)V")
	public static void method2390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class266 local3 = new Class266();
		local3.anInt8150 = arg1 >> Static175.anInt3259;
		local3.anInt8152 = arg2 >> Static175.anInt3259;
		local3.anInt8144 = arg3 >> Static175.anInt3259;
		local3.anInt8143 = arg4 >> Static175.anInt3259;
		local3.anInt8156 = arg0;
		local3.anInt8151 = arg1;
		local3.anInt8154 = arg2;
		local3.anInt8162 = arg3;
		local3.anInt8163 = arg4;
		local3.anInt8149 = arg5;
		local3.anInt8159 = arg6;
		Static432.aClass266Array2[Static511.anInt8888++] = local3;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
	public static void method2391() {
		Static152.aClass231_64.method6231(5);
	}
}
