import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "Lclient!vg;")
	public static final Class52 aClass52_1 = Static17.method804();

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB)Z")
	public static boolean method4063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!wd;)I")
	public static int method4064(@OriginalArg(1) Class366 arg0) {
		if (Static527.aClass366_12 == arg0) {
			return 6407;
		} else if (Static456.aClass366_9 == arg0) {
			return 6408;
		} else if (arg0 == Static526.aClass366_11) {
			return 6406;
		} else if (arg0 == Static20.aClass366_1) {
			return 6409;
		} else if (arg0 == Static627.aClass366_15) {
			return 6410;
		} else if (Static95.aClass366_3 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIII)I")
	public static int method4065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B[B)[B")
	public static byte[] method4067(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class8_Sub8 local8 = new Class8_Sub8(arg0);
		@Pc(12) int local12 = local8.method8525();
		@Pc(25) int local25 = local8.method8540();
		if (local25 < 0 || Static350.anInt6761 != 0 && Static350.anInt6761 < local25) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(45) byte[] local45 = new byte[local25];
			local8.method8563(0, local45, local25);
			return local45;
		} else {
			@Pc(57) int local57 = local8.method8540();
			if (local57 < 0 || Static350.anInt6761 != 0 && Static350.anInt6761 < local57) {
				throw new RuntimeException();
			}
			@Pc(78) byte[] local78 = new byte[local57];
			if (local12 == 1) {
				Static219.method4128(local78, local57, arg0, local25);
			} else {
				@Pc(85) Class267 local85 = Static340.aClass267_1;
				synchronized (Static340.aClass267_1) {
					Static340.aClass267_1.method6800(local78, local8);
				}
			}
			return local78;
		}
	}
}
