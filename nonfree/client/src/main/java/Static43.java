import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
	public static int anInt794;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!qe;")
	private static Class78 aClass78_143 = Static199.method3560("Allocating memory");

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Lclient!qe;")
	private static Class78 aClass78_145 = Static199.method3560("green:");

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!qe;")
	public static Class78 aClass78_144 = aClass78_145;

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "Lclient!jh;")
	public static Class53 aClass53_3 = new Class53(4);

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "[Z")
	public static boolean[] aBooleanArray25 = new boolean[200];

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "Lclient!qe;")
	public static Class78 aClass78_146 = aClass78_145;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!qe;")
	public static Class78 aClass78_147 = Static199.method3560("<img=0>");

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!qe;")
	public static Class78 aClass78_148 = aClass78_143;

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "Lclient!qe;")
	private static Class78 aClass78_149 = Static199.method3560("M");

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!qe;")
	public static Class78 aClass78_150 = aClass78_149;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_151 = aClass78_149;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	public static int anInt795 = 0;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lclient!mj;B)Lclient!mj;")
	public static Class64 method585(@OriginalArg(0) Class64 arg0) {
		if (arg0.anInt3075 != -1) {
			return Static204.method3618(arg0.anInt3075);
		}
		@Pc(17) int local17 = arg0.anInt3044 >>> 16;
		for (@Pc(30) Class2_Sub11 local30 = (Class2_Sub11) Static12.aClass103_4.method3668(); local30 != null; local30 = (Class2_Sub11) Static12.aClass103_4.method3666()) {
			if (local17 == local30.anInt726) {
				return Static204.method3618((int) local30.aLong188);
			}
		}
		return null;
	}
}
