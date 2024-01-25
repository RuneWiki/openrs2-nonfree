import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "[[I")
	public static int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "Lclient!wl;")
	public static final Class221 aClass221_227 = new Class221(33, 10);

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_61 = new Class107(20);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V")
	public static void method5812() {
		if (Static107.aBoolean214) {
			return;
		}
		Static273.aBoolean493 = true;
		Static107.aBoolean214 = true;
		if (Static311.aBoolean549) {
			Static366.aFloat48 = (int) Static366.aFloat48 + 191 & 0xFFFFFF80;
		} else {
			Static145.aFloat37 += (24.0F - Static145.aFloat37) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)V")
	public static void method5815(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static196.aClass51ArrayArrayArray3 == null) {
			return;
		}
		@Pc(19) long local19 = (long) (arg2 << 28 | arg1 << 14 | arg0);
		@Pc(25) Class2_Sub20 local25 = (Class2_Sub20) Static198.aClass41_24.method902(local19);
		if (local25 == null) {
			Static126.method2479(arg2, arg0, arg1);
			return;
		}
		@Pc(39) Class2_Sub27 local39 = (Class2_Sub27) local25.aClass180_16.method4919();
		if (local39 == null) {
			Static126.method2479(arg2, arg0, arg1);
			return;
		}
		@Pc(61) Class1_Sub5_Sub1 local61 = (Class1_Sub5_Sub1) Static126.method2479(arg2, arg0, arg1);
		if (local61 == null) {
			local61 = new Class1_Sub5_Sub1();
		} else {
			local61.anInt6162 = local61.anInt6165 = -1;
		}
		local61.anInt6161 = local39.anInt4717;
		local61.anInt6160 = local39.anInt4715;
		label44: while (true) {
			@Pc(89) Class2_Sub27 local89 = (Class2_Sub27) local25.aClass180_16.method4916();
			if (local89 == null) {
				break;
			}
			if (local61.anInt6161 != local89.anInt4717) {
				local61.anInt6158 = local89.anInt4715;
				local61.anInt6162 = local89.anInt4717;
				while (true) {
					@Pc(110) Class2_Sub27 local110 = (Class2_Sub27) local25.aClass180_16.method4916();
					if (local110 == null) {
						break label44;
					}
					if (local110.anInt4717 != local61.anInt6161 && local61.anInt6162 != local110.anInt4717) {
						local61.anInt6165 = local110.anInt4717;
						local61.anInt6166 = local110.anInt4715;
					}
				}
			}
		}
		@Pc(158) int local158 = Static97.method1899(arg2, (arg1 << 7) + 64, (arg0 << 7) + 64);
		Static96.method1887(arg2, arg0, arg1, local158, local61);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public static void method5821(@OriginalArg(0) int arg0) {
		if (!Static146.method2839(arg0)) {
			return;
		}
		@Pc(14) Class68[] local14 = Static264.aClass68ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class68 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt1838 = 0;
				local22.anInt1899 = 0;
				local22.anInt1906 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(IIII)V")
	public static void method5830(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2_Sub9_Sub4 local15 = Static98.method1971(11, arg1);
		local15.method1801();
		local15.anInt1729 = arg2;
		local15.anInt1723 = arg0;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
	public static void method5838() {
		Static107.aBoolean215 = false;
		Static195.anInt4281 = 0;
		Static284.anInt5721 = -3;
		Static46.anInt750 = 0;
		Static176.anInt3968 = 0;
		Static269.anInt6656 = 1;
		Static248.anInt5204 = -1;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)Lclient!eq;")
	public static Class63 method5843(@OriginalArg(1) int arg0) {
		@Pc(10) Class63 local10 = (Class63) Static34.aClass107_1.method3021((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static46.aClass104_34.method2756(4, arg0);
		local10 = new Class63();
		if (local20 != null) {
			local10.method1688(arg0, new Class2_Sub12(local20));
		}
		local10.method1687(arg0);
		Static34.aClass107_1.method3018((long) arg0, local10);
		return local10;
	}
}
