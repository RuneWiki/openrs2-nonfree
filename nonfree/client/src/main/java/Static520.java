import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public static int anInt8645;

	@OriginalMember(owner = "client!ro", name = "k", descriptor = "Lclient!rda;")
	public static final Class300 aClass300_40 = new Class300(16);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Lclient!ai;")
	public static Class15 method7364(@OriginalArg(0) int arg0) {
		@Pc(10) Class15 local10 = (Class15) Static506.aClass340_51.method7999((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static553.aClass390_109.method8914(1, arg0);
		local10 = new Class15();
		local10.anInt239 = arg0;
		if (local25 != null) {
			local10.method209(new Class5_Sub41(local25));
		}
		local10.method210();
		if (local10.anInt240 == 2 && Static637.aClass300_47.method7188((long) arg0) == null) {
			Static637.aClass300_47.method7191(new Class5_Sub47(Static146.anInt2981), (long) arg0);
			Static154.aClass15Array1[Static146.anInt2981++] = local10;
		}
		Static506.aClass340_51.method7986((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZBZLclient!oq;Ljava/lang/String;)V")
	public static void method7365(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class268 arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static602.method8252(arg2, arg3, 3);
			return;
		}
		@Pc(25) String local25;
		if (Static429.aString64.startsWith("win") && arg2.aBoolean644) {
			local25 = null;
			if (Static639.anApplet2 != null) {
				local25 = Static639.anApplet2.getParameter("haveie6");
			}
			if (local25 == null || !local25.equals("1")) {
				@Pc(43) Class331 local43 = Static602.method8252(arg2, arg3, 0);
				Static510.aClass331_6 = local43;
				Static672.aClass268_6 = arg2;
				Static449.aString72 = arg3;
				return;
			}
		}
		if (Static429.aString64.startsWith("mac")) {
			local25 = null;
			if (Static639.anApplet2 != null) {
				local25 = Static639.anApplet2.getParameter("havefirefox");
			}
			if (local25 != null && local25.equals("1") && arg0) {
				Static602.method8252(arg2, arg3, 1);
				return;
			}
		}
		Static602.method8252(arg2, arg3, 2);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIBI)V")
	public static void method7366(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static1.anInt9943 != 1) {
			return;
		}
		@Pc(11) int local11 = arg0 / Static597.anInt9791;
		@Pc(15) int local15 = arg3 / Static597.anInt9791;
		@Pc(19) int local19 = arg2 / Static382.anInt6778;
		@Pc(23) int local23 = arg1 / Static382.anInt6778;
		if (local11 >= Static299.anInt5764 || local15 < 0 || Static31.anInt495 <= local19 || local23 < 0) {
			return;
		}
		if (local11 < 0) {
			local11 = 0;
		}
		if (local19 < 0) {
			local19 = 0;
		}
		if (local15 >= Static299.anInt5764) {
			local15 = Static299.anInt5764 - 1;
		}
		if (Static31.anInt495 <= local23) {
			local23 = Static31.anInt495 - 1;
		}
		for (@Pc(68) int local68 = local19; local68 <= local23; local68++) {
			@Pc(78) int local78 = Static17.method232(local68 + Static494.anInt8274, Static31.anInt495) * Static299.anInt5764;
			for (@Pc(80) int local80 = local11; local80 <= local15; local80++) {
				@Pc(90) int local90 = Static17.method232(Static109.anInt2331 + local80, Static299.anInt5764) + local78;
				Static516.anIntArray483[local90] = Static10.anInt165;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "(I)V")
	public static void method7368() {
		Static166.aClass340_19.method7987();
	}
}
