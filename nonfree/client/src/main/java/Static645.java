import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static645 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!ik;")
	public static Class180 aClass180_2;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
	public static int anInt9906;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!pia;")
	public static final Class291 aClass291_7 = new Class291();

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[[B")
	public static final byte[][] aByteArrayArray24 = new byte[1000][];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BIIIILclient!nca;Z)V")
	public static void method8738(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) Class254 arg2) {
		Static450.anInt7299 = arg0;
		Static478.aClass2_Sub23_Sub5_4 = null;
		Static225.anInt3586 = 2;
		Static24.aClass254_16 = arg2;
		Static515.anInt8213 = arg1;
		Static39.anInt535 = 1;
		Static403.anInt6656 = 0;
		Static112.aBoolean215 = false;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
	public static boolean method8740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
