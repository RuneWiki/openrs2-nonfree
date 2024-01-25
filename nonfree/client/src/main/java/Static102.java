import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "Lclient!jk;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!gq", name = "m", descriptor = "[I")
	public static int[] anIntArray226;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "[I")
	public static int[] anIntArray228;

	@OriginalMember(owner = "client!gq", name = "h", descriptor = "[Lclient!be;")
	public static final Class17_Sub1_Sub1_Sub1[] aClass17_Sub1_Sub1_Sub1Array1 = new Class17_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
	public static int anInt2428 = 0;

	@OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
	public static int anInt2432 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILclient!md;)V")
	public static void method2113(@OriginalArg(1) Class1_Sub25 arg0) {
		if (Static77.aClass194ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface5 local8 = null;
		if (arg0.anInt3965 == 0) {
			local8 = (Interface5) Static352.method5612(arg0.anInt3976, arg0.anInt3971, arg0.anInt3977);
		}
		if (arg0.anInt3965 == 1) {
			local8 = (Interface5) Static223.method5335(arg0.anInt3976, arg0.anInt3971, arg0.anInt3977);
		}
		if (arg0.anInt3965 == 2) {
			local8 = (Interface5) Static258.method4649(arg0.anInt3976, arg0.anInt3971, arg0.anInt3977, ol.class);
		}
		if (arg0.anInt3965 == 3) {
			local8 = (Interface5) Static127.method2619(arg0.anInt3976, arg0.anInt3971, arg0.anInt3977);
		}
		if (local8 == null) {
			arg0.anInt3975 = 0;
			arg0.anInt3970 = -1;
			arg0.anInt3966 = 0;
		} else {
			arg0.anInt3970 = local8.method4799();
			arg0.anInt3966 = local8.method4794();
			arg0.anInt3975 = local8.method4797();
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!bg;I)Lclient!b;")
	public static Class14_Sub1 method2114(@OriginalArg(0) Class1_Sub8 arg0) {
		return new Class14_Sub1(arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4551(), arg0.method4514(), arg0.method4514(), arg0.method4532());
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public static void method2117() {
		if (Static253.aBoolean507) {
			return;
		}
		Static253.aBoolean507 = true;
		Static329.aBoolean614 = true;
		if (Static327.aBoolean607) {
			Static36.aFloat5 = (int) Static36.aFloat5 - 17 & 0xFFFFFFF0;
		} else {
			Static146.aFloat40 += (-12.0F - Static146.aFloat40) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)Lclient!kn;")
	public static Class116 method2118(@OriginalArg(0) int arg0) {
		@Pc(5) Class87 local5 = Static204.aClass87_38;
		@Pc(14) Class116 local14;
		synchronized (Static204.aClass87_38) {
			local14 = (Class116) Static204.aClass87_38.method2482((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static53.aClass216_13.method5648(Static295.method4969(arg0), Static296.method4973(arg0));
		local14 = new Class116();
		if (local34 != null) {
			local14.method3249(new Class1_Sub8(local34));
		}
		@Pc(49) Class87 local49 = Static204.aClass87_38;
		synchronized (Static204.aClass87_38) {
			Static204.aClass87_38.method2481(local14, (long) arg0);
			return local14;
		}
	}
}
