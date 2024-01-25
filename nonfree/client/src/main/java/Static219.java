import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!hca", name = "db", descriptor = "I")
	public static int anInt3807 = 500;

	@OriginalMember(owner = "client!hca", name = "j", descriptor = "(I)V")
	public static void method3247() {
		@Pc(7) Class312 local7 = null;
		try {
			@Pc(13) Class338 local13 = Static566.aClass92_6.method1880("");
			while (local13.anInt9321 == 0) {
				Static26.method592(1L);
			}
			if (local13.anInt9321 == 1) {
				local7 = (Class312) local13.anObject18;
				@Pc(35) Class3_Sub4 local35 = Static336.aClass3_Sub41_18.method6701();
				local7.method6840(local35.anInt9739, 0, local35.aByteArray90);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method6838();
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lclient!dt;B)Lclient!ps;")
	public static Class33_Sub4 method3248(@OriginalArg(0) Class3_Sub4 arg0) {
		return new Class33_Sub4(arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7918(), arg0.method7945(), arg0.method7945(), arg0.method7954());
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V")
	public static void method3249(@OriginalArg(1) int arg0) {
		Static28.anInt691 = arg0;
		Static329.anInt5459 = -1;
		Static270.anInt4659 = 3;
		Static258.anInt4526 = 100;
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(Z)V")
	public static void method3251() {
		Static451.aBoolean520 = false;
		Static184.method2885();
	}
}
