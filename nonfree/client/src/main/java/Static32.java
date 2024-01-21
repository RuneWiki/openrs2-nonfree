import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_3 = new Class85(100);

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_313 = Static193.method3027(" GMT");

	@OriginalMember(owner = "client!da", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_314 = Static193.method3027("Lade Eingabe)2Steuerungsprogramm)3)3)3");

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_315 = Static193.method3027("Hier wechseln");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)J")
	public static long method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass83_1 == null ? 0L : local7.aClass83_1.aLong111;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZB)V")
	public static void method575(@OriginalArg(0) boolean arg0) {
		Static48.method3330();
		Static116.anInt3346++;
		if (Static116.anInt3346 < 50 && !arg0) {
			return;
		}
		Static116.anInt3346 = 0;
		if (Static9.aBoolean14 || Static148.aClass33_2 == null) {
			return;
		}
		Static93.aClass3_Sub4_Sub1_18.method1298(2);
		try {
			Static148.aClass33_2.method924(Static93.aClass3_Sub4_Sub1_18.anInt1758, Static93.aClass3_Sub4_Sub1_18.aByteArray12);
			Static93.aClass3_Sub4_Sub1_18.anInt1758 = 0;
		} catch (@Pc(46) IOException local46) {
			Static9.aBoolean14 = true;
		}
	}
}
