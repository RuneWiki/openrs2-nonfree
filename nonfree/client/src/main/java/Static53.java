import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "[F")
	public static final float[] aFloatArray8 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIBLclient!ht;)Lclient!bu;")
	public static Class3_Sub7_Sub3 method839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class137 arg2) {
		@Pc(10) int local10 = arg2.anInt3804 | arg0 << 10;
		@Pc(19) Class3_Sub7_Sub3 local19 = (Class3_Sub7_Sub3) Static173.aClass116_1.method3126((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static241.aClass322_84.method6807(Static241.aClass322_84.method6813(local10));
		if (local36 == null) {
			local10 = arg2.anInt3804 | arg1 + 65536 << 10;
			local19 = (Class3_Sub7_Sub3) Static173.aClass116_1.method3126((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static241.aClass322_84.method6807(Static241.aClass322_84.method6813(local10));
			if (local36 == null) {
				local10 = arg2.anInt3804 | 0x3FFFC00;
				local19 = (Class3_Sub7_Sub3) Static173.aClass116_1.method3126((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static241.aClass322_84.method6807(Static241.aClass322_84.method6813(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static468.method6472(local36);
					} catch (@Pc(192) Exception local192) {
						throw new RuntimeException(local192.getMessage() + " S: " + local10);
					}
					local19.aClass137_3 = arg2;
					Static173.aClass116_1.method3127(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static468.method6472(local36);
				} catch (@Pc(124) Exception local124) {
					throw new RuntimeException(local124.getMessage() + " S: " + local10);
				}
				local19.aClass137_3 = arg2;
				Static173.aClass116_1.method3127(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static468.method6472(local36);
			} catch (@Pc(52) Exception local52) {
				throw new RuntimeException(local52.getMessage() + " S: " + local10);
			}
			local19.aClass137_3 = arg2;
			Static173.aClass116_1.method3127(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)I")
	public static int method844(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
