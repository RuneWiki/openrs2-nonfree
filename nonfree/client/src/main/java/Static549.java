import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!rc", name = "l", descriptor = "Lclient!tm;")
	public static Class361 aClass361_5;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!rc", name = "o", descriptor = "Lclient!kea;")
	public static Class208 aClass208_5;

	@OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
	public static int anInt5294 = 0;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V")
	public static void method4750() {
		for (@Pc(17) Class3_Sub56 local17 = (Class3_Sub56) Static581.aClass342_71.method7644(); local17 != null; local17 = (Class3_Sub56) Static581.aClass342_71.method7650()) {
			if (local17.aBoolean729) {
				local17.method9129();
			}
		}
		for (@Pc(41) Class3_Sub56 local41 = (Class3_Sub56) Static420.aClass342_49.method7644(); local41 != null; local41 = (Class3_Sub56) Static420.aClass342_49.method7650()) {
			if (local41.aBoolean729) {
				local41.method9129();
			}
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)I")
	public static int method4751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static393.aByteArrayArray8 == null ? 0 : Static393.aByteArrayArray8[arg0][arg1] & 0xFF;
	}
}
