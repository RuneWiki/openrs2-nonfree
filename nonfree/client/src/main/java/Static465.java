import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!ps", name = "M", descriptor = "I")
	public static int anInt8177;

	@OriginalMember(owner = "client!ps", name = "O", descriptor = "I")
	public static int anInt8179;

	@OriginalMember(owner = "client!ps", name = "P", descriptor = "[I")
	public static int[] anIntArray621;

	@OriginalMember(owner = "client!ps", name = "E", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_146 = new Class44(115, -2);

	@OriginalMember(owner = "client!ps", name = "L", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_147 = new Class44(24, -1);

	@OriginalMember(owner = "client!ps", name = "N", descriptor = "I")
	public static int anInt8178 = 0;

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)[Lclient!jb;")
	public static Class174[] method6816() {
		return new Class174[] { Static453.aClass174_1, Static453.aClass174_2, Static453.aClass174_3, Static453.aClass174_4, Static453.aClass174_5, Static453.aClass174_6, Static453.aClass174_7, Static453.aClass174_8, Static453.aClass174_9, Static453.aClass174_10, Static453.aClass174_11, Static453.aClass174_12, Static453.aClass174_13 };
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)Lclient!mb;")
	public static Class226 method6817(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class226 local12 = new Class226();
		local12.anInt6527 = arg0 + 5 + 1;
		local12.anInt6545 = -1;
		local12.anInt6523 = arg1 + 6;
		local12.anInt6536 = -1;
		local12.anIntArrayArray39 = new int[local12.anInt6527][local12.anInt6523];
		local12.method5368();
		return local12;
	}
}
