import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dw", name = "H", descriptor = "I")
	public static int anInt1759;

	@OriginalMember(owner = "client!dw", name = "S", descriptor = "F")
	public static float aFloat21;

	@OriginalMember(owner = "client!dw", name = "z", descriptor = "I")
	public static int anInt1752 = 104;

	@OriginalMember(owner = "client!dw", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString29 = null;

	@OriginalMember(owner = "client!dw", name = "L", descriptor = "Lclient!ht;")
	public static final Class148 aClass148_7 = new Class148(1, -1);

	@OriginalMember(owner = "client!dw", name = "M", descriptor = "I")
	public static int anInt1761 = 0;

	@OriginalMember(owner = "client!dw", name = "Q", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_19 = new Class181(51, 4);

	@OriginalMember(owner = "client!dw", name = "R", descriptor = "I")
	public static int anInt1765 = 0;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIII)V")
	public static void method1634(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg0, 8);
		local8.method4140();
		local8.anInt4504 = arg1;
		local8.anInt4507 = arg2;
		local8.anInt4508 = arg3;
	}
}
