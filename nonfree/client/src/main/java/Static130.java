import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static130 {

	@OriginalMember(owner = "client!er", name = "F", descriptor = "Lclient!ob;")
	public static final Class247 aClass247_2 = new Class247();

	@OriginalMember(owner = "client!er", name = "K", descriptor = "[I")
	public static final int[] anIntArray290 = new int[1];

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!rc;Lclient!rc;)V")
	public static void method2735(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg1.aClass4_288 != null) {
			arg1.method8013();
		}
		arg1.aClass4_287 = arg0;
		arg1.aClass4_288 = arg0.aClass4_288;
		arg1.aClass4_288.aClass4_287 = arg1;
		arg1.aClass4_287.aClass4_288 = arg1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)I")
	public static int method2736() {
		return Static488.anInt8215;
	}
}
