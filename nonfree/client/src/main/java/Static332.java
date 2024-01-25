import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static332 {

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
	public static int anInt5708;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "Lclient!no;")
	public static final Class167 aClass167_8 = new Class167("", 10);

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_91 = new Class217(13, 8);

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_119 = new Class119(79, -1);

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)I")
	public static int method4456() {
		return 6;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z")
	public static boolean method4457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
