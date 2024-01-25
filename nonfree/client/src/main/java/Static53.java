import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!ra;")
	public static final Class276 aClass276_16 = new Class276(107, 17);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
	public static int method1290(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Lclient!lfa;")
	public static Class198 method1292(@OriginalArg(1) int arg0) {
		@Pc(10) Class198 local10 = (Class198) Static479.aClass211_57.method5534((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static475.aClass254_121.method6401(0, arg0);
		local10 = new Class198();
		if (local20 != null) {
			local10.method4994(new Class3_Sub7(local20), arg0);
		}
		Static479.aClass211_57.method5529((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BIII)V")
	public static void method1293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(9, arg0);
		local8.method1898();
		local8.anInt1945 = arg2;
		local8.anInt1946 = arg1;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BZLjava/lang/String;Lclient!pe;)Lclient!oda;")
	public static Class238 method1294(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class254 arg2) {
		@Pc(8) int local8 = arg2.method6414(arg1);
		if (local8 == -1) {
			return new Class238(0);
		}
		@Pc(21) int[] local21 = arg2.method6424(local8);
		@Pc(27) Class238 local27 = new Class238(local21.length);
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		while (true) {
			while (local29 < local27.anInt7252) {
				@Pc(44) Class3_Sub7 local44 = new Class3_Sub7(arg2.method6401(local8, local21[local31++]));
				@Pc(48) int local48 = local44.method6497();
				@Pc(52) int local52 = local44.method6535();
				@Pc(56) int local56 = local44.method6538();
				if (!arg0 && local56 == 1) {
					local27.anInt7252--;
				} else {
					local27.anIntArray465[local29] = local48;
					local27.anIntArray464[local29] = local52;
					local29++;
				}
			}
			return local27;
		}
	}
}
