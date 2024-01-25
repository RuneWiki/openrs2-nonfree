import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
	public static int anInt10380 = -1;

	@OriginalMember(owner = "client!wr", name = "O", descriptor = "Lclient!pw;")
	public static final Class261 aClass261_16 = new Class261(3);

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "I")
	public static final int anInt10389 = 1338;

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(ZI)V")
	public static void method8374(@OriginalArg(0) boolean arg0) {
		Static401.anInt7845 = 0;
		Static452.anInt3253 = 0;
		Static376.method6089();
		Static261.method3819(arg0);
		Static331.method5747();
		@Pc(21) boolean local21 = false;
		@Pc(28) int local28;
		for (@Pc(23) int local23 = 0; local23 < Static401.anInt7845; local23++) {
			local28 = Static207.anIntArray274[local23];
			@Pc(35) Class3_Sub46 local35 = (Class3_Sub46) Static331.aClass25_25.method946((long) local28);
			@Pc(38) Class2_Sub2_Sub1_Sub2 local38 = local35.aClass2_Sub2_Sub1_Sub2_2;
			if (Static256.aBoolean474 && Static37.method1121(local28)) {
				Static564.method8126();
			}
			if (local38.anInt7628 != Static129.anInt10429) {
				if (local38.aClass169_1.method4176()) {
					Static432.method4773(local38);
				}
				local38.method6322(null);
				local35.method8412();
				local21 = true;
			}
		}
		if (local21) {
			Static17.anInt6046 = Static331.aClass25_25.method950();
			Static331.aClass25_25.method955(Static60.aClass3_Sub46Array1);
		}
		if (Static89.aClass3_Sub7_Sub1_2.anInt7869 != Static79.anInt10464) {
			throw new RuntimeException("gnp1 pos:" + Static89.aClass3_Sub7_Sub1_2.anInt7869 + " psize:" + Static79.anInt10464);
		}
		for (local28 = 0; local28 < Static268.anInt5680; local28++) {
			if (Static331.aClass25_25.method946((long) Static304.anIntArray377[local28]) == null) {
				throw new RuntimeException("gnp2 pos:" + local28 + " size:" + Static268.anInt5680);
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z[Ljava/lang/String;[S)V")
	public static void method8377(@OriginalArg(1) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static401.method6482(arg0.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(III)I")
	public static int method8378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
