import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!jc", name = "j", descriptor = "Lclient!ll;")
	public static Class152 aClass152_2;

	@OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
	public static int anInt1113;

	@OriginalMember(owner = "client!jc", name = "M", descriptor = "Z")
	private static boolean aBoolean100;

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "Z")
	private static boolean aBoolean101;

	@OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
	private static int anInt1118;

	@OriginalMember(owner = "client!jc", name = "P", descriptor = "Z")
	private static boolean aBoolean102;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!jc", name = "t", descriptor = "[[B")
	public static final byte[][] aByteArrayArray9 = new byte[50][];

	@OriginalMember(owner = "client!jc", name = "H", descriptor = "Lclient!nd;")
	public static final Class175 aClass175_2 = new Class175(2, 6);

	@OriginalMember(owner = "client!jc", name = "providesignlink", descriptor = "(Lclient!hf;)V")
	private static void method995(@OriginalArg(0) Class103 arg0) {
		Static165.aClass103_3 = arg0;
		Static281.aClass103_4 = arg0;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!ha;)Lclient!lr;")
	public static Class157 method1006(@OriginalArg(1) Class6_Sub15 arg0) {
		@Pc(7) Class157 local7 = new Class157();
		local7.anInt3952 = arg0.method3108();
		local7.aClass6_Sub1_Sub6_1 = Static327.aClass129_2.method2908(local7.anInt3952);
		return local7;
	}
}
