import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "[I")
	public static int[] anIntArray264;

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "Lclient!c;")
	public static Class5 aClass5_14;

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "I")
	public static int anInt2981;

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
	public static final int[] anIntArray265 = new int[100];

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
	public static int anInt2979 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
	public static int method2756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg1 > 0) {
			local12 = arg0 & 0x1 | local12 << 1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local12;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLclient!bg;Ljava/lang/String;)I")
	public static int method2757(@OriginalArg(1) Class1_Sub8 arg0, @OriginalArg(2) String arg1) {
		@Pc(6) int local6 = arg0.anInt5182;
		@Pc(15) byte[] local15 = Static309.method5167(arg1);
		arg0.method4546(local15.length);
		arg0.anInt5182 += Static213.aClass55_1.method1614(arg0.aByteArray81, local15, arg0.anInt5182, local15.length, 0);
		return arg0.anInt5182 - local6;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIBI)Lclient!pe;")
	public static Class1_Sub4_Sub18 method2758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 | arg1 << 8;
		@Pc(18) Class1_Sub4_Sub18 local18 = (Class1_Sub4_Sub18) Static225.aClass92_6.method2606((long) local9 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(38) byte[] local38 = Static124.aClass216_43.method5659(Static124.aClass216_43.method5671(local9));
		if (local38 == null) {
			local9 = arg2 + 65536 << 8 | arg0;
			local18 = (Class1_Sub4_Sub18) Static225.aClass92_6.method2606((long) local9 << 16);
			if (local18 != null) {
				return local18;
			}
			local38 = Static124.aClass216_43.method5659(Static124.aClass216_43.method5671(local9));
			if (local38 == null) {
				local9 = arg0 | 0xFFFF00;
				local18 = (Class1_Sub4_Sub18) Static225.aClass92_6.method2606((long) local9 << 16);
				if (local18 != null) {
					return local18;
				}
				local38 = Static124.aClass216_43.method5659(Static124.aClass216_43.method5671(local9));
				if (local38 == null) {
					return null;
				} else if (local38.length <= 1) {
					return null;
				} else {
					local18 = Static176.method3471(local38);
					local18.anInt4795 = arg0;
					Static225.aClass92_6.method2601((long) local9 << 16, local18);
					return local18;
				}
			} else if (local38.length <= 1) {
				return null;
			} else {
				local18 = Static176.method3471(local38);
				local18.anInt4795 = arg0;
				Static225.aClass92_6.method2601((long) local9 << 16, local18);
				return local18;
			}
		} else if (local38.length <= 1) {
			return null;
		} else {
			local18 = Static176.method3471(local38);
			local18.anInt4795 = arg0;
			Static225.aClass92_6.method2601((long) local9 << 16, local18);
			return local18;
		}
	}
}
