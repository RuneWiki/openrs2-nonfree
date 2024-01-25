import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
	public static final int anInt3385 = 5000;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
	public static int anInt3387 = 0;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V")
	public static void method2927() {
		Static79.aClass32_5 = new Class32();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IBLclient!iha;III)Ljava/awt/Frame;")
	public static Frame method2928(@OriginalArg(0) int arg0, @OriginalArg(2) Class173 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg1.method4235()) {
			return null;
		}
		@Pc(16) Class386[] local16 = Static231.method3887(arg1);
		if (local16 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local16.length; local25++) {
			if (arg2 == local16[local25].anInt10886 && local16[local25].anInt10883 == arg3 && (!local23 || arg0 < local16[local25].anInt10885)) {
				arg0 = local16[local25].anInt10885;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(109) Class230 local109 = arg1.method4251(arg2, arg3, arg0);
		while (local109.anInt6256 == 0) {
			Static548.method7968(10L);
		}
		@Pc(123) Frame local123 = (Frame) local109.anObject12;
		if (local123 == null) {
			return null;
		} else if (local109.anInt6256 == 2) {
			Static452.method6682(local123, arg1);
			return null;
		} else {
			return local123;
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)Lclient!waa;")
	public static Class385 method2929(@OriginalArg(1) int arg0) {
		@Pc(10) Class385 local10 = (Class385) Static493.aClass317_55.method7882((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(33) byte[] local33 = Static613.aClass310_119.method7803(arg0, 0);
		local10 = new Class385();
		if (local33 != null) {
			local10.method9223(new Class14_Sub21(local33));
		}
		local10.method9221();
		Static493.aClass317_55.method7875((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIZZ)V")
	public static void method2930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg1 < 1) {
			arg1 = 1;
		}
		if (arg0 < 1) {
			arg0 = 1;
		}
		@Pc(19) int local19 = arg1 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(51) int local51 = Static626.aShort111 + local19 * (Static124.aShort10 - Static626.aShort111) / 100;
		if (Static518.aShort86 > local51) {
			local51 = Static518.aShort86;
		} else if (local51 > Static528.aShort87) {
			local51 = Static528.aShort87;
		}
		@Pc(80) int local80 = local51 * arg1 * 512 / (arg0 * 334);
		@Pc(114) int local114;
		@Pc(121) int local121;
		@Pc(89) short local89;
		if (Static462.aShort82 > local80) {
			local89 = Static462.aShort82;
			local51 = local89 * 334 * arg0 / (arg1 * 512);
			if (local51 > Static528.aShort87) {
				local51 = Static528.aShort87;
				local114 = arg1 * 512 * local51 / (local89 * 334);
				local121 = (arg0 - local114) / 2;
				if (arg4) {
					Static103.aClass144_3.la();
					Static103.aClass144_3.method6887(arg2, -16777216, local121, arg1, arg3);
					Static103.aClass144_3.method6887(arg2, -16777216, local121, arg1, arg0 + arg3 - local121);
				}
				arg3 += local121;
				arg0 -= local121 * 2;
			}
		} else if (local80 > Static27.aShort1) {
			local89 = Static27.aShort1;
			local51 = local89 * 334 * arg0 / (arg1 * 512);
			if (Static518.aShort86 > local51) {
				local51 = Static518.aShort86;
				local114 = arg0 * local89 * 334 / (local51 * 512);
				local121 = (arg1 - local114) / 2;
				if (arg4) {
					Static103.aClass144_3.la();
					Static103.aClass144_3.method6887(arg2, -16777216, arg0, local121, arg3);
					Static103.aClass144_3.method6887(arg2 + arg1 - local121, -16777216, arg0, local121, arg3);
				}
				arg2 += local121;
				arg1 -= local121 * 2;
			}
		}
		Static351.anInt11020 = (short) arg0;
		Static368.anInt6253 = arg1 * local51 / 334;
		Static26.anInt350 = arg2;
		Static145.anInt2289 = arg3;
		Static517.anInt8884 = (short) arg1;
	}
}
