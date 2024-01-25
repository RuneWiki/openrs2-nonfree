import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!ci", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray2;

	@OriginalMember(owner = "client!ci", name = "cb", descriptor = "Lclient!ui;")
	public static Class230 aClass230_15;

	@OriginalMember(owner = "client!ci", name = "db", descriptor = "I")
	public static int anInt909;

	@OriginalMember(owner = "client!ci", name = "T", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_29 = new Class48(5, -1);

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!ci", name = "bb", descriptor = "Lclient!tb;")
	public static final Class219 aClass219_1 = new Class219(16);

	@OriginalMember(owner = "client!ci", name = "eb", descriptor = "Z")
	public static boolean aBoolean78 = true;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!ps;")
	public static Class182 method709(@OriginalArg(0) Component arg0) {
		return new Class182_Sub1(arg0, true);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BIC)I")
	public static int method710(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(15) int local15 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local15 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local15 = 1762;
		}
		return local15;
	}
}
