import java.awt.Canvas;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!lq", name = "k", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_230 = new Class179(75, 3);

	@OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
	public static final int anInt5999 = -1;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IJ)V")
	public static void method5106(@OriginalArg(1) long arg0) {
		Static43.aCalendar1.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLclient!sha;Z)V")
	public static void method5107(@OriginalArg(1) Class321 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) int local20 = arg0.anInt9075 == 0 ? arg0.anInt9103 : arg0.anInt9075;
		@Pc(29) int local29 = arg0.anInt9024 == 0 ? arg0.anInt9077 : arg0.anInt9024;
		Static70.method1235(arg1, local20, arg0.anInt9040, local29, Static109.aClass321ArrayArray1[arg0.anInt9040 >> 16]);
		if (arg0.aClass321Array1 != null) {
			Static70.method1235(arg1, local20, arg0.anInt9040, local29, arg0.aClass321Array1);
		}
		@Pc(62) Class6_Sub51 local62 = (Class6_Sub51) Static262.aClass209_35.method5038((long) arg0.anInt9040);
		if (local62 != null) {
			Static347.method9041(local29, arg1, local20, local62.anInt9360);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILclient!gga;)Lclient!vj;")
	public static Class47_Sub1 method5108(@OriginalArg(1) Class6_Sub23 arg0) {
		@Pc(15) Class47 local15 = Static489.method7091(arg0);
		@Pc(19) int local19 = arg0.method8340();
		return new Class47_Sub1(local15.anInt10343, local15.aClass7_11, local15.aClass249_14, local15.anInt10344, local15.anInt10347, local19);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/awt/Canvas;BII)Lclient!fb;")
	public static Class6_Sub18 method5109(@OriginalArg(0) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(11) Class local11 = Class.forName("Class6_Sub18_Sub1");
			@Pc(15) Class6_Sub18 local15 = (Class6_Sub18) local11.getDeclaredConstructor().newInstance();
			local15.method4130(arg0, arg2, arg1);
			return local15;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub18_Sub2 local28 = new Class6_Sub18_Sub2();
			local28.method4130(arg0, arg2, arg1);
			return local28;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZIII)V")
	public static void method5110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 ? Static96.aClass6_Sub22_7.aClass29_Sub5_4.method1502() : Static96.aClass6_Sub22_7.aClass29_Sub5_5.method1502()) != 0 && arg0 != 0 && Static505.anInt8479 < 50 && arg4 != -1) {
			Static461.aClass243Array1[Static505.anInt8479++] = new Class243((byte) (arg2 ? 3 : 2), arg4, arg0, arg3, arg1, 0, arg5, (Class2_Sub1) null);
		}
	}
}
