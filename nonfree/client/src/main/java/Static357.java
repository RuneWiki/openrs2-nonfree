import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ[S)[S")
	public static short[] method5758(@OriginalArg(0) int arg0, @OriginalArg(2) short[] arg1) {
		@Pc(11) short[] local11 = new short[arg0];
		Static651.method755(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I")
	public static int method5759(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
	public static void method5760() {
		Static262.aClass216_43.method5454();
		Static551.anInt9154 = 0;
	}
}
