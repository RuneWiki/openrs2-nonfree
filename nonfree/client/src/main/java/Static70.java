import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
	public static int anInt1835;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static int anInt1838;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!kg;")
	public static Class114 aClass114_2;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	public static int anInt1828 = 0;

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_104 = new Class159("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public static int anInt1840 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Object;Lclient!ml;I)V")
	public static void method1651(@OriginalArg(0) Object arg0, @OriginalArg(1) Class134 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg1.anEventQueue1.peekEvent() != null; local11++) {
			Static249.method4396(1L);
		}
		if (arg0 != null) {
			arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!o;III[Z)Z")
	public static boolean method1652(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static261.aClass60Array2 != Static77.aClass60Array1) {
			@Pc(11) int local11 = Static304.aClass60Array3[arg1].method2270(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class60 local18 = Static304.aClass60Array3[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.method2270(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method2266(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.method2259(arg0, arg2, local27, arg3);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!ak;BIILclient!mq;Lclient!vq;Lclient!t;I)V")
	public static void method1654(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class136 arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) Class189 arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg0.anInt207 - arg1 / 2 - 5;
		@Pc(19) int local19 = arg2 + 2;
		if (arg3.anInt4274 != 0) {
			arg4.method2687(local15, arg3.anInt4274, arg1 + 10, local19, arg6 * arg5.method4930() + arg2 + 1 - local19);
		}
		if (arg3.anInt4255 != 0) {
			arg4.method2727(local19, arg2 + arg6 * arg5.method4930() + 1 - local19, arg1 + 10, arg3.anInt4255, local15);
		}
		@Pc(72) int local72 = arg3.anInt4270;
		if (arg0.aBoolean20 && arg3.anInt4268 != -1) {
			local72 = arg3.anInt4268;
		}
		for (@Pc(88) int local88 = 0; local88 < arg6; local88++) {
			@Pc(94) String local94 = Static31.aStringArray7[local88];
			if (arg6 - 1 > local88) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg5.method4934(arg4, local94, arg0.anInt207, arg2, local72);
			arg2 += arg5.method4930();
		}
	}
}
