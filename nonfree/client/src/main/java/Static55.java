import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!an;")
	public static Class16 aClass16_10;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_22 = new Class45(71, -2);

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_13 = new Class73();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!hv;I)I")
	public static int method1412(@OriginalArg(0) Class12_Sub20 arg0) {
		@Pc(7) String local7 = Static329.method5245(arg0);
		@Pc(9) int[] local9 = null;
		if (Static179.method3558(arg0.anInt4329)) {
			local9 = Static150.aClass254_2.method6340((int) arg0.aLong116).anIntArray174;
		} else if (arg0.anInt4328 != -1) {
			local9 = Static150.aClass254_2.method6340(arg0.anInt4328).anIntArray174;
		} else if (Static197.method3743(arg0.anInt4329)) {
			@Pc(32) Class12_Sub41 local32 = (Class12_Sub41) Static29.aClass68_7.method1917((long) arg0.aLong116);
			if (local32 != null) {
				@Pc(37) Class30_Sub1_Sub1_Sub2 local37 = local32.aClass30_Sub1_Sub1_Sub2_2;
				@Pc(40) Class130 local40 = local37.aClass130_1;
				if (local40.anIntArray308 != null) {
					local40 = local40.method3570(Static393.aClass31_1);
				}
				if (local40 != null) {
					local9 = local40.anIntArray310;
				}
			}
		} else if (Static350.method5484(arg0.anInt4329)) {
			@Pc(72) Class279 local72;
			if (arg0.anInt4329 == 1008) {
				local72 = Static49.aClass155_2.method4063((int) arg0.aLong116);
			} else {
				local72 = Static49.aClass155_2.method4063((int) (arg0.aLong116 >>> 32 & 0x7FFFFFFFL));
			}
			if (local72.anIntArray620 != null) {
				local72 = local72.method6881(Static393.aClass31_1);
			}
			if (local72 != null) {
				local9 = local72.anIntArray621;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static169.method3401(local9);
		}
		@Pc(138) int local138 = Static445.aClass244_7.method6148(Static519.aClass84Array15, local7);
		if (arg0.aBoolean346) {
			local138 += Static214.aClass84_10.c() + 4;
		}
		return local138;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIILclient!dj;)Ljava/awt/Frame;")
	public static Frame method1413(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class71 arg3) {
		if (!arg3.method1976()) {
			return null;
		}
		@Pc(27) Class10[] local27 = Static396.method6218(arg3);
		if (local27 == null) {
			return null;
		}
		@Pc(33) boolean local33 = false;
		for (@Pc(35) int local35 = 0; local35 < local27.length; local35++) {
			if (local27[local35].anInt154 == arg0 && arg2 == local27[local35].anInt155 && (!local33 || local27[local35].anInt151 > arg1)) {
				local33 = true;
				arg1 = local27[local35].anInt151;
			}
		}
		if (!local33) {
			return null;
		}
		@Pc(100) Class55 local100 = arg3.method1972(arg1, arg0, arg2);
		while (local100.anInt1481 == 0) {
			Static17.method388(10L);
		}
		@Pc(115) Frame local115 = (Frame) local100.anObject5;
		if (local115 == null) {
			return null;
		} else if (local100.anInt1481 == 2) {
			Static540.method7945(arg3, local115);
			return null;
		} else {
			return local115;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Z")
	public static boolean method1414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) boolean local22 = (arg1 & 0x37) == 0 ? Static58.method1436(arg1, arg0) : Static173.method3445(arg1, arg0);
		return (arg0 & 0x10000) != 0 | Static353.method5526(arg0, arg1) | local22;
	}
}
