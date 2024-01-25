import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!tda", name = "G", descriptor = "I")
	public static int anInt9853;

	@OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
	public static int anInt9860;

	@OriginalMember(owner = "client!tda", name = "x", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!tda", name = "r", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_176 = new Class186(7, 4);

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IILclient!ha;)Lclient!saa;")
	public static Class330 method8322(@OriginalArg(0) int arg0, @OriginalArg(2) Class67 arg1) {
		@Pc(10) Class288 local10 = Static247.method3753(true, arg1, arg0, true);
		return local10 == null ? null : local10.aClass330_10;
	}
}
