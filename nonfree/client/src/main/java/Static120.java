import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static120 {

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "[Lclient!hk;")
	public static Class155[] aClass155Array6;

	@OriginalMember(owner = "client!efa", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!efa", name = "r", descriptor = "I")
	public static int anInt1966;

	@OriginalMember(owner = "client!efa", name = "H", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_36 = new Class156(111, 7);

	@OriginalMember(owner = "client!efa", name = "w", descriptor = "I")
	public static final int anInt1954 = 4;

	@OriginalMember(owner = "client!efa", name = "p", descriptor = "I")
	public static int anInt1959 = 0;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)Z")
	public static boolean method1766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static207.method3390(arg1, arg0) | (arg0 & 0x40000) != 0 || Static223.method3547(arg0, arg1);
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)Lclient!wea;")
	public static Class389 method1769(@OriginalArg(0) boolean arg0) {
		return Static285.method4551(arg0, Static652.anInt10664) ? Static4.aClass389_16 : Static4.aClass389_17;
	}
}
