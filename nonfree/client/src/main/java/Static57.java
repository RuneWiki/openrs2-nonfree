import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
	public static int anInt1081 = 0;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Z")
	public static boolean aBoolean82 = true;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!dl", name = "k", descriptor = "Z")
	public static boolean aBoolean84 = false;

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
	public static void method920() {
		if (Static10.anInt190 == 10 && Static283.aBoolean393) {
			Static264.method4398(28);
		}
		if (Static10.anInt190 == 30) {
			Static264.method4398(25);
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(BII)I")
	public static int method923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 - 1 & arg1 >> 31;
		return (arg1 + (arg1 >>> 31)) % arg0 + local16;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZII)V")
	public static void method925(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class3_Sub4_Sub7 local15 = Static34.method528(arg1, 7);
		local15.method971();
		local15.anInt1132 = arg0;
	}
}
