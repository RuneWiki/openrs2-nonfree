import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!sba", name = "f", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_10;

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)[Lclient!gq;")
	public static Class117[] method7370() {
		return new Class117[] { Static332.aClass117_11, Static285.aClass117_9, Static568.aClass117_12 };
	}

	@OriginalMember(owner = "client!sba", name = "a", descriptor = "(III)V")
	public static void method7372(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub1_Sub21 local8 = Static57.method8561(0, 15);
		local8.method8631();
		local8.anInt10490 = arg0;
		local8.anInt10489 = arg1;
	}
}
