import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!lja", name = "A", descriptor = "Lclient!gda;")
	public static Class126 aClass126_156;

	@OriginalMember(owner = "client!lja", name = "G", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_105 = new Class156(77, 0);

	@OriginalMember(owner = "client!lja", name = "P", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_144 = new Class381(71, 3);

	@OriginalMember(owner = "client!lja", name = "H", descriptor = "I")
	public static int anInt5636 = 0;

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(III)Lclient!ii;")
	public static Class169 method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class169 local7 = new Class169();
		local7.anInt4224 = arg0 + 5 + 1;
		local7.anInt4228 = arg1 + 5 + 1;
		local7.anInt4229 = -1;
		local7.anInt4219 = -1;
		local7.anIntArrayArray34 = new int[local7.anInt4228][local7.anInt4224];
		local7.method3869();
		return local7;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)Lclient!sf;")
	public static Class5_Sub1_Sub18 method5052() {
		@Pc(16) Class5_Sub1_Sub18 local16 = (Class5_Sub1_Sub18) Static188.aClass388_16.method9027();
		if (local16 != null) {
			local16.method9222();
			local16.method8955();
			return local16;
		}
		do {
			local16 = (Class5_Sub1_Sub18) Static424.aClass388_12.method9027();
			if (local16 == null) {
				return null;
			}
			if (local16.method7440() > Static480.method6763()) {
				return null;
			}
			local16.method9222();
			local16.method8955();
		} while ((Long.MIN_VALUE & local16.aLong298) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "(B)[Lclient!hm;")
	public static Class157[] method5054() {
		return new Class157[] { Static115.aClass157_1, Static115.aClass157_2, Static115.aClass157_3, Static115.aClass157_4, Static115.aClass157_5, Static115.aClass157_6, Static115.aClass157_7, Static115.aClass157_8, Static115.aClass157_9, Static115.aClass157_10, Static115.aClass157_11, Static115.aClass157_12, Static115.aClass157_13 };
	}
}
