import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public static int anInt2663 = 0;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!kh;")
	public static Class60 aClass60_877 = Static200.method3116(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean147 = true;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray43 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
	public static int method2003(@OriginalArg(1) int arg0) {
		@Pc(17) int local17 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(31) int local31 = (local17 >>> 2 & 0xB3333333) + (local17 & 0x33333333);
		@Pc(40) int local40 = local31 + (local31 >>> 4) & 0xF0F0F0F;
		@Pc(46) int local46 = local40 + (local40 >>> 8);
		@Pc(52) int local52 = local46 + (local46 >>> 16);
		return local52 & 0xFF;
	}
}
