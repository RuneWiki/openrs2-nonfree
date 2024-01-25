import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "Lclient!maa;")
	public static final Class211 aClass211_1 = new Class211();

	@OriginalMember(owner = "client!sn", name = "e", descriptor = "Lclient!kg;")
	public static final Class188 aClass188_7 = new Class188("", 17);

	@OriginalMember(owner = "client!sn", name = "g", descriptor = "Z")
	public static final boolean aBoolean649 = false;

	@OriginalMember(owner = "client!sn", name = "h", descriptor = "[I")
	public static final int[] anIntArray603 = new int[8];

	@OriginalMember(owner = "client!sn", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray38 = new String[100];

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
	public static void method7331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub5_Sub10 local13 = Static594.method8175(arg0, 1);
		local13.method4393();
		local13.anInt5255 = arg1;
	}
}
