import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!rq", name = "A", descriptor = "I")
	public static int anInt6104;

	@OriginalMember(owner = "client!rq", name = "C", descriptor = "I")
	public static int anInt6105;

	@OriginalMember(owner = "client!rq", name = "q", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_154 = new Class81(17, 5);

	@OriginalMember(owner = "client!rq", name = "z", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_122 = new Class256("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "Lclient!os;")
	public static final Class184 aClass184_6 = new Class184();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZI)I")
	public static int method4858(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Z)I")
	public static int method4859(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		@Pc(8) int local8 = arg1.length();
		@Pc(11) int local11 = arg2.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local11 <= local15 - local19) {
				return 1;
			}
			@Pc(61) char local61;
			if (local17 == '\u0000') {
				local61 = arg1.charAt(local13++);
			} else {
				local61 = local17;
			}
			@Pc(74) char local74;
			if (local19 == '\u0000') {
				local74 = arg2.charAt(local15++);
			} else {
				local74 = local19;
			}
			local17 = Static448.method6047(local61);
			local19 = Static448.method6047(local74);
			local61 = Static351.method4910(local61, arg0);
			local74 = Static351.method4910(local74, arg0);
			if (local74 != local61 && Character.toUpperCase(local61) != Character.toUpperCase(local74)) {
				local61 = Character.toLowerCase(local61);
				local74 = Character.toLowerCase(local74);
				if (local74 != local61) {
					return Static113.method1698(arg0, local61) - Static113.method1698(arg0, local74);
				}
			}
		}
		@Pc(137) int local137 = Math.min(local8, local11);
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			if (arg0 == 2) {
				local15 = local11 - local139 - 1;
				local13 = local8 - local139 - 1;
			} else {
				local15 = local139;
				local13 = local139;
			}
			@Pc(168) char local168 = arg1.charAt(local13);
			@Pc(172) char local172 = arg2.charAt(local15);
			if (local172 != local168 && Character.toUpperCase(local168) != Character.toUpperCase(local172)) {
				local168 = Character.toLowerCase(local168);
				local172 = Character.toLowerCase(local172);
				if (local168 != local172) {
					return Static113.method1698(arg0, local168) - Static113.method1698(arg0, local172);
				}
			}
		}
		@Pc(211) int local211 = local8 - local11;
		if (local211 != 0) {
			return local211;
		}
		for (@Pc(225) int local225 = 0; local225 < local137; local225++) {
			@Pc(231) char local231 = arg1.charAt(local225);
			@Pc(235) char local235 = arg2.charAt(local225);
			if (local235 != local231) {
				return Static113.method1698(arg0, local231) - Static113.method1698(arg0, local235);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
	public static void method4860() {
		Static184.aClass26_4.V(Static399.anInt6964, Static399.aClass167_Sub1_1.aBoolean494 ? Static85.anInt3260 + 256 << 0 : -1, 256);
	}
}
