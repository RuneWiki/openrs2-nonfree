import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!pl", name = "k", descriptor = "I")
	public static int anInt4236;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	public static int anInt4245;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString149 = "Loaded interfaces";

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZLclient!rn;I)Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2 method3551(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) int arg2) {
		return Static115.method1878(arg2, arg1, arg0) ? Static183.method3085() : null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Lclient!gi;")
	public static Class3_Sub4_Sub8 method3555(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub4_Sub8 local10 = (Class3_Sub4_Sub8) Static109.aClass33_7.method828((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25;
		if (arg0 < 32768) {
			local25 = Static224.aClass155_119.method4121(0, arg0);
		} else {
			local25 = Static230.aClass155_94.method4121(0, arg0 & 0x7FFF);
		}
		local10 = new Class3_Sub4_Sub8();
		if (local25 != null) {
			local10.method1410(new Class3_Sub26(local25));
		}
		if (arg0 >= 32768) {
			local10.method1407();
		}
		Static109.aClass33_7.method827(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	public static void method3557() {
		if (Static3.aBoolean1) {
			Static3.aBoolean1 = false;
			Static194.aClass3_Sub4_Sub12_2 = null;
			Static79.aClass81_2 = null;
		}
	}
}
