import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static560 {

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!g;")
	public static Class121 aClass121_2;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
	public static int anInt9272;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!eq;")
	public static Class97 aClass97_137;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_157 = new Class274(38, 2);

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_90 = new Class269(56, -1);

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
	public static int method7761() {
		@Pc(5) int local5 = 0;
		@Pc(15) Field[] local15 = cq.class.getDeclaredFields();
		for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
			@Pc(24) Field local24 = local15[local19];
			if (oi.class.isAssignableFrom(local24.getType())) {
				local5++;
			}
		}
		return local5 + 1;
	}
}
