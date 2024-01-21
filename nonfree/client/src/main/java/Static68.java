import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_10;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
	public static int anInt1622;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
	public static int anInt1619 = -1;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_513 = Static181.method2795("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	public static int anInt1623 = 0;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	public static int anInt1625 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)J")
	public static synchronized long method1276() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < Static115.aLong89) {
			Static115.aLong90 += Static115.aLong89 - local1;
		}
		Static115.aLong89 = local1;
		return Static115.aLong90 + local1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!eh;Lclient!qe;ZLclient!eh;Lclient!qe;)Lclient!od;")
	public static Class2_Sub2_Sub5 method1278(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class83 arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) Class83 arg3) {
		@Pc(8) int local8 = arg2.method870(arg1);
		@Pc(14) int local14 = arg2.method875(local8, arg3);
		return Static48.method952(local8, arg2, local14, arg0);
	}
}
