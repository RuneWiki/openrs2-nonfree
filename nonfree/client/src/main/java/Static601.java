import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!vfa", name = "gc", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray17;

	@OriginalMember(owner = "client!vfa", name = "dc", descriptor = "Lclient!uk;")
	public static final Class346 aClass346_7 = new Class346("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!vfa", name = "id", descriptor = "Z")
	public static boolean aBoolean806 = false;

	@OriginalMember(owner = "client!vfa", name = "md", descriptor = "I")
	public static int anInt9877 = -1;

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BI)I")
	public static int method8386(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(III)Lclient!og;")
	public static Class14_Sub1_Sub3 method8388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass14_Sub1_Sub3_1;
	}

	@OriginalMember(owner = "client!vfa", name = "c", descriptor = "(III)Z")
	public static boolean method8391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)I")
	public static int method8395() {
		return Static453.anInt7627 == 1 ? Static355.anInt6322 : 0;
	}

	@OriginalMember(owner = "client!vfa", name = "b", descriptor = "(BI)I")
	public static int method8404(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
