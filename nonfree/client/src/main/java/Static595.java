import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "[I")
	public static int[] anIntArray600;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
	public static boolean aBoolean725 = true;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!qs;")
	public static final Class273 aClass273_3 = new Class273();

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method8148(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(3, arg0);
		local8.method7363();
		local8.aString244 = arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(III)V")
	public static void method8149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(5, arg0);
		local8.method7363();
		local8.anInt9381 = arg1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BLclient!oo;I)V")
	public static void method8150(@OriginalArg(1) Class3_Sub26_Sub1 arg0, @OriginalArg(2) int arg1) {
		Static222.anInt4597 = 0;
		Static107.aBoolean187 = false;
		Static349.method5024(arg0);
		Static569.method7713(arg0);
		if (Static107.aBoolean187) {
			System.out.println("---endgpp---");
		}
		if (arg0.anInt8703 != arg1) {
			throw new RuntimeException("gpi1 pos:" + arg0.anInt8703 + " psize:" + arg1);
		}
	}
}
