import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZLjava/lang/Object;B)[B")
	public static byte[] method4108(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static451.method5219(local13) : local13;
		} else if (arg1 instanceof Class65) {
			@Pc(27) Class65 local27 = (Class65) arg1;
			return local27.method1546();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BILclient!tq;I)V")
	public static void method4109(@OriginalArg(1) int arg0, @OriginalArg(2) Class239 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray18 != null) {
			@Pc(13) Class6_Sub29 local13 = new Class6_Sub29();
			local13.aClass239_10 = arg1;
			local13.anObjectArray4 = arg1.anObjectArray18;
			Static308.method4424(local13);
		}
		Static172.anInt3044 = arg2;
		Static415.anInt6945 = arg0;
		Static391.anInt2016 = arg1.anInt6423;
		Static274.aBoolean336 = true;
		Static365.anInt3369 = arg1.anInt6492;
		Static60.anInt1241 = arg1.anInt6461;
		Static321.anInt5236 = arg1.anInt6487;
		Static54.anInt1132 = arg1.anInt6416;
		Static354.method4992(arg1);
	}
}
