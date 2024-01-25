import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
	public static int anInt9322;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_13 = new Class215(10, 8);

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!bk;")
	public static final Class34 aClass34_4 = new Class34("RC", 1);

	@OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
	public static int anInt9324 = 7000;

	@OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
	public static int anInt9327 = anInt9324;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B[I[J)V")
	public static void method7965(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static302.method5130(0, arg0, arg1, arg1.length - 1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method7966() {
		@Pc(1) Class136 local1 = Static40.aClass136_9;
		synchronized (Static40.aClass136_9) {
			Static40.aClass136_9.method3138();
		}
		local1 = Static309.aClass136_36;
		synchronized (Static309.aClass136_36) {
			Static309.aClass136_36.method3138();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method7968(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I")
	public static int method7969() {
		@Pc(13) int local13 = 0;
		@Pc(23) Field[] local23 = qea.class.getDeclaredFields();
		for (@Pc(27) int local27 = 0; local27 < local23.length; local27++) {
			@Pc(33) Field local33 = local23[local27];
			if (ek.class.isAssignableFrom(local33.getType())) {
				local13++;
			}
		}
		return local13 + 1;
	}
}
