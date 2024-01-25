import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!nt", name = "V", descriptor = "Lclient!rc;")
	public static Class205 aClass205_95;

	@OriginalMember(owner = "client!nt", name = "O", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_94 = new Class205(41, 12);

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(BLclient!ld;)I")
	public static int method3868(@OriginalArg(1) Class2_Sub26 arg0) {
		@Pc(12) String local12 = Static308.method4502(arg0);
		@Pc(14) int[] local14 = null;
		if (Static37.method674(arg0.anInt3594)) {
			local14 = Static15.aClass81_1.method2175((int) arg0.aLong127).anIntArray853;
		} else if (arg0.anInt3593 != -1) {
			local14 = Static15.aClass81_1.method2175(arg0.anInt3593).anIntArray853;
		} else if (Static17.method319(arg0.anInt3594)) {
			@Pc(88) Class1_Sub5_Sub1_Sub2 local88 = Static299.aClass1_Sub5_Sub1_Sub2Array1[(int) arg0.aLong127];
			if (local88 != null) {
				@Pc(93) Class133 local93 = local88.aClass133_1;
				if (local93.anIntArray653 != null) {
					local93 = local93.method3094(Static321.aClass211_1);
				}
				if (local93 != null) {
					local14 = local93.anIntArray651;
				}
			}
		} else if (Static249.method5593(arg0.anInt3594)) {
			@Pc(60) Class172 local60;
			if (arg0.anInt3594 == 1001) {
				local60 = Static221.aClass118_6.method2858((int) arg0.aLong127);
			} else {
				local60 = Static221.aClass118_6.method2858((int) (arg0.aLong127 >>> 32 & 0x7FFFFFFFL));
			}
			if (local60.anIntArray801 != null) {
				local60 = local60.method3775(Static321.aClass211_1);
			}
			if (local60 != null) {
				local14 = local60.anIntArray802;
			}
		}
		if (local14 != null) {
			local12 = local12 + Static245.method3916(local14);
		}
		@Pc(133) int local133 = Static238.aClass136_7.method3123(local12, Static382.aClass18Array14);
		if (arg0.aBoolean273) {
			local133 += Static120.aClass18_12.method4563() + 4;
		}
		return local133;
	}

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "(I)Z")
	public static boolean method3869() {
		return Static38.aBoolean60;
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(BI)V")
	public static void method3871() {
		Static55.aClass160_9.method3606(5);
	}
}
