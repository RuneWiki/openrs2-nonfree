import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!fa;")
	public static Class77 aClass77_34 = new Class77(64);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBLclient!ki;)J")
	public static long method4821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Interface6 arg2) {
		@Pc(5) long local5 = 4194304L;
		@Pc(7) long local7 = 2147483648L;
		@Pc(9) long local9 = Long.MIN_VALUE;
		@Pc(21) Class236 local21 = Static54.aClass153_1.method3081(arg2.method5250());
		@Pc(42) long local42 = (long) ((arg2.method5246() | 0x10000) << 14 | arg0 | arg1 << 7 | arg2.method5251() << 20);
		if (local21.anInt5915 == 0) {
			local42 |= local9;
		}
		if (local21.anInt5923 == 1) {
			local42 |= local5;
		}
		if (local21.aBoolean539) {
			local42 |= local7;
		}
		return local42 | (long) arg2.method5250() << 32;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method4823() {
		@Pc(1) Class227 local1 = Static109.aClass227_16;
		synchronized (Static109.aClass227_16) {
			Static109.aClass227_16.method4871();
		}
		local1 = Static366.aClass227_46;
		synchronized (Static366.aClass227_46) {
			Static366.aClass227_46.method4871();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!ng;ILjava/awt/Canvas;Lclient!cp;)Lclient!tq;")
	public static Class164 method4828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class162 arg2, @OriginalArg(4) Canvas arg3, @OriginalArg(5) Interface2 arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class164_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, cp.class, Integer.TYPE, Integer.TYPE, ng.class);
			return (Class164) local57.newInstance(arg3, arg4, Integer.valueOf(arg1), new Integer(arg0), arg2);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}
}
