import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	public static int anInt6158;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!em;")
	public static final Class83 aClass83_129 = new Class83(88, 7);

	@OriginalMember(owner = "client!n", name = "f", descriptor = "Z")
	public static boolean aBoolean470 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!ql;IZ)V")
	public static void method5001(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub38 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg1.anInt7676;
		@Pc(12) int local12 = (int) arg1.aLong268;
		arg1.method7908();
		if (arg0) {
			Static257.method3746(local8);
		}
		Static190.method5361(local8);
		@Pc(33) Class160 local33 = Static512.method7155(local12);
		if (local33 != null) {
			Static415.method5900(local33);
		}
		Static595.method7986();
		if (!arg2 && Static165.anInt3165 != -1) {
			Static568.method7207(Static165.anInt3165, 1);
		}
		@Pc(54) Class69 local54 = new Class69(Static148.aClass91_6);
		for (@Pc(59) Class1_Sub38 local59 = (Class1_Sub38) local54.method1483(); local59 != null; local59 = (Class1_Sub38) local54.method1480()) {
			if (!local59.method7907()) {
				local59 = (Class1_Sub38) local54.method1483();
				if (local59 == null) {
					return;
				}
			}
			if (local59.anInt7675 == 3) {
				@Pc(85) int local85 = (int) local59.aLong268;
				if (local8 == local85 >>> 16) {
					method5001(true, local59, arg2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!paa;Lclient!paa;I)V")
	public static void method5002(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) Class1_Sub8 arg1) {
		if (arg1.aClass1_Sub8_61 != null) {
			arg1.method7712();
		}
		arg1.aClass1_Sub8_62 = arg0.aClass1_Sub8_62;
		arg1.aClass1_Sub8_61 = arg0;
		arg1.aClass1_Sub8_61.aClass1_Sub8_62 = arg1;
		arg1.aClass1_Sub8_62.aClass1_Sub8_61 = arg1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method5003() {
		if (Static285.aString62.toLowerCase().indexOf("microsoft") != -1) {
			Static170.anIntArray147[191] = 73;
			Static170.anIntArray147[219] = 42;
			Static170.anIntArray147[223] = 28;
			Static170.anIntArray147[192] = 58;
			Static170.anIntArray147[190] = 72;
			Static170.anIntArray147[186] = 57;
			Static170.anIntArray147[221] = 43;
			Static170.anIntArray147[222] = 59;
			Static170.anIntArray147[188] = 71;
			Static170.anIntArray147[220] = 74;
			Static170.anIntArray147[187] = 27;
			Static170.anIntArray147[189] = 26;
			return;
		}
		if (Static285.aMethod1 == null) {
			Static170.anIntArray147[192] = 58;
			Static170.anIntArray147[222] = 59;
		} else {
			Static170.anIntArray147[192] = 28;
			Static170.anIntArray147[520] = 59;
			Static170.anIntArray147[222] = 58;
		}
		Static170.anIntArray147[61] = 27;
		Static170.anIntArray147[91] = 42;
		Static170.anIntArray147[92] = 74;
		Static170.anIntArray147[46] = 72;
		Static170.anIntArray147[93] = 43;
		Static170.anIntArray147[44] = 71;
		Static170.anIntArray147[45] = 26;
		Static170.anIntArray147[59] = 57;
		Static170.anIntArray147[47] = 73;
	}
}
