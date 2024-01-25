import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[[Lclient!pb;")
	public static Class227[][] aClass227ArrayArray1;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "Lclient!er;")
	public static Class91 aClass91_1;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_107 = new Class150(3, 6);

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "Lclient!io;")
	public static final Class148 aClass148_6 = new Class148(13, 0, 1, 0);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!qa;ILclient!sb;)I")
	public static int method3582(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class264 arg1) {
		if (arg1.anInt7712 != -1) {
			return arg1.anInt7712;
		}
		if (arg1.anInt7717 != -1) {
			@Pc(33) Class271 local33 = arg0.anInterface8_145.method7237(arg0.method7062() ? arg1.anInt7717 : arg1.anInt7716);
			if (!local33.aBoolean566) {
				return local33.aShort100;
			}
		}
		return arg1.anInt7714;
	}
}
