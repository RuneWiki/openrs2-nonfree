import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!ik", name = "Tb", descriptor = "I")
	public static int anInt3263;

	@OriginalMember(owner = "client!ik", name = "Mb", descriptor = "Lclient!kj;")
	public static final Class130 aClass130_1 = new Class130();

	@OriginalMember(owner = "client!ik", name = "Sb", descriptor = "I")
	public static int anInt3262 = 0;

	@OriginalMember(owner = "client!ik", name = "z", descriptor = "(I)V")
	public static void method2777() {
		@Pc(7) Class220 local7 = null;
		try {
			@Pc(13) Class181 local13 = Static32.aClass51_1.method1359(true, "2");
			while (local13.anInt5298 == 0) {
				Static83.method1499(1L);
			}
			if (local13.anInt5298 == 1) {
				local7 = (Class220) local13.anObject7;
				@Pc(46) Class3_Sub25 local46 = new Class3_Sub25(Static351.anInt5923 * 6 + 3);
				local46.method4081(1);
				local46.method4123(Static351.anInt5923);
				for (@Pc(58) int local58 = 0; local58 < Static59.anIntArray56.length; local58++) {
					if (Static322.aBooleanArray19[local58]) {
						local46.method4123(local58);
						local46.method4082(Static59.anIntArray56[local58]);
					}
				}
				local7.method5187(local46.anInt4974, 0, local46.aByteArray88);
			}
		} catch (@Pc(95) Exception local95) {
		}
		try {
			if (local7 != null) {
				local7.method5190();
			}
		} catch (@Pc(102) Exception local102) {
		}
		Static235.aLong139 = Static354.method4966();
		Static451.aBoolean505 = false;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
	public static void method2780(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class3_Sub3_Sub4 local13 = Static281.method3883(2, arg1);
		local13.method1003();
		local13.aString7 = arg0;
	}

	@OriginalMember(owner = "client!ik", name = "B", descriptor = "(I)V")
	public static void method2784() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static391.aBooleanArray22[local7] = true;
		}
	}
}
