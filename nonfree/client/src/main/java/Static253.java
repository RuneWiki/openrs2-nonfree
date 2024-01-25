import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_70 = new Class15("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_150 = new Class56(38, 0);

	@OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
	public static int anInt4185 = 0;

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
	public static int anInt4186 = 0;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_59 = new Class146(25, -1);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)Lclient!be;")
	public static Class21 method3327(@OriginalArg(1) int arg0) {
		@Pc(8) Class21[] local8 = Static95.method1452();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class21 local16 = local8[local10];
			if (arg0 == local16.anInt409) {
				return local16;
			}
		}
		return null;
	}
}
