import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "[I")
	public static int[] anIntArray312;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBII)I")
	public static int method3257(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!te;II)Lclient!ba;")
	public static Class3_Sub3_Sub4 method3258(@OriginalArg(1) Class318 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt8037 | arg1 << 10;
		@Pc(19) Class3_Sub3_Sub4 local19 = (Class3_Sub3_Sub4) Static261.aClass189_2.method4445((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static151.aClass246_77.method5679(Static151.aClass246_77.method5670(local10));
		if (local36 == null) {
			local10 = arg2 + 65536 << 10 | arg0.anInt8037;
			local19 = (Class3_Sub3_Sub4) Static261.aClass189_2.method4445((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static151.aClass246_77.method5679(Static151.aClass246_77.method5670(local10));
			if (local36 == null) {
				local10 = arg0.anInt8037 | 0x3FFFC00;
				local19 = (Class3_Sub3_Sub4) Static261.aClass189_2.method4445((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static151.aClass246_77.method5679(Static151.aClass246_77.method5670(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static597.method7820(local36);
					} catch (@Pc(190) Exception local190) {
						throw new RuntimeException(local190.getMessage() + " S: " + local10);
					}
					local19.aClass318_1 = arg0;
					Static261.aClass189_2.method4442((long) local10 << 16, local19);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static597.method7820(local36);
				} catch (@Pc(122) Exception local122) {
					throw new RuntimeException(local122.getMessage() + " S: " + local10);
				}
				local19.aClass318_1 = arg0;
				Static261.aClass189_2.method4442((long) local10 << 16, local19);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static597.method7820(local36);
			} catch (@Pc(50) Exception local50) {
				throw new RuntimeException(local50.getMessage() + " S: " + local10);
			}
			local19.aClass318_1 = arg0;
			Static261.aClass189_2.method4442((long) local10 << 16, local19);
			return local19;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	public static void method3259(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub3_Sub7 local13 = Static363.method5457(arg0, 12);
		local13.method845();
	}
}
