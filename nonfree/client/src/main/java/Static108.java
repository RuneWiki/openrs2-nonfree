import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dja", name = "c", descriptor = "I")
	public static int anInt2244;

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "I")
	public static int anInt2245;

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(III)Lclient!kh;")
	public static Class208 method2085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class208 local7 = Static676.method8728(arg1);
		if (arg0 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass208Array20 == null || local7.aClass208Array20.length <= arg0) {
			return null;
		} else {
			return local7.aClass208Array20[arg0];
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIBJIZLclient!gj;)V")
	public static void method2086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2, @OriginalArg(6) Class143 arg3) {
		Static511.method8669(arg3, arg1, arg2, arg0);
	}
}
