import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!sh", name = "rb", descriptor = "I")
	public static int anInt3838;

	@OriginalMember(owner = "client!sh", name = "vb", descriptor = "Lclient!sd;")
	public static Class60 aClass60_32;

	@OriginalMember(owner = "client!sh", name = "gb", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!sh", name = "ub", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2278 = Static118.method2249("green:");

	@OriginalMember(owner = "client!sh", name = "hb", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2276 = aClass65_2278;

	@OriginalMember(owner = "client!sh", name = "lb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2277 = Static118.method2249("overlay2)3dat");

	@OriginalMember(owner = "client!sh", name = "xb", descriptor = "Z")
	public static boolean aBoolean155 = false;

	@OriginalMember(owner = "client!sh", name = "Cb", descriptor = "I")
	public static int anInt3846 = 0;

	@OriginalMember(owner = "client!sh", name = "Db", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2279 = aClass65_2278;

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)Lclient!oc;")
	public static Class65 method2919(@OriginalArg(0) int arg0) {
		@Pc(3) Class65 local3 = new Class65();
		local3.anInt3190 = 0;
		local3.aByteArray37 = new byte[arg0];
		return local3;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(Z)[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] method2922() {
		@Pc(6) Class1_Sub2_Sub5_Sub3[] local6 = new Class1_Sub2_Sub5_Sub3[anInt3838];
		for (@Pc(8) int local8 = 0; local8 < anInt3838; local8++) {
			@Pc(13) Class1_Sub2_Sub5_Sub3 local13 = new Class1_Sub2_Sub5_Sub3();
			local13.anInt1856 = Static108.anInt2647;
			local13.anInt1853 = Static148.anInt3487;
			local13.anInt1852 = Static111.anIntArray308[local8];
			local13.anInt1854 = Static127.anIntArray364[local8];
			local13.anInt1851 = Static138.anIntArray384[local8];
			local13.anInt1855 = Static160.anIntArray328[local8];
			@Pc(45) int local45 = local13.anInt1851 * local13.anInt1855;
			@Pc(49) byte[] local49 = Static153.aByteArrayArray33[local8];
			local13.anIntArray204 = new int[local45];
			for (@Pc(55) int local55 = 0; local55 < local45; local55++) {
				local13.anIntArray204[local55] = Static61.anIntArray154[local49[local55] & 0xFF];
			}
			local6[local8] = local13;
		}
		Static84.method1458();
		return local6;
	}
}
