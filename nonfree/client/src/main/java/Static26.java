import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
	public static int anInt443;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
	public static int anInt449;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	public static final int anInt450 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lclient!hi;")
	public static Class2_Sub20 method357() {
		if (Static476.aClass70_47 == null || Static565.aClass314_1 == null) {
			return null;
		}
		Static565.aClass314_1.method6300(Static476.aClass70_47);
		@Pc(18) Class2_Sub20 local18 = (Class2_Sub20) Static565.aClass314_1.method6302();
		if (local18 == null) {
			return null;
		} else {
			@Pc(33) Class142 local33 = Static476.aClass360_4.method7576(local18.anInt2970);
			return local33 != null && local33.aBoolean211 && local33.method2521(Static476.anInterface23_2) ? local18 : Static130.method1765();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)Lclient!kq;")
	public static Class198 method359(@OriginalArg(0) int arg0) {
		@Pc(15) Class198 local15 = (Class198) Static448.aClass21_17.method324((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(27) byte[] local27 = Static503.aClass229_119.method4980(1, arg0);
		local15 = new Class198();
		local15.anInt4875 = arg0;
		if (local27 != null) {
			local15.method4079(new Class2_Sub7(local27));
		}
		local15.method4078();
		if (local15.anInt4877 == 2 && Static514.aClass90_37.method1685((long) arg0) == null) {
			Static514.aClass90_37.method1684(new Class2_Sub44(Static32.anInt650), (long) arg0);
			Static55.aClass198Array1[Static32.anInt650++] = local15;
		}
		Static448.aClass21_17.method317(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!je;I)J")
	public static long method360(@OriginalArg(0) int arg0, @OriginalArg(2) Interface14 arg1, @OriginalArg(3) int arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = Long.MIN_VALUE;
		@Pc(14) Class216 local14 = Static362.aClass290_2.method5799(arg1.method7094());
		@Pc(35) long local35 = (long) ((arg1.method7091() | 0x10000) << 14 | arg2 | arg0 << 7 | arg1.method7093() << 20);
		if (local14.anInt5275 == 0) {
			local35 |= local7;
		}
		if (local14.anInt5237 == 1) {
			local35 |= local5;
		}
		return local35 | (long) arg1.method7094() << 32;
	}
}
