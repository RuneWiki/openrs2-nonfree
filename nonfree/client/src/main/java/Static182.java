import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!v;")
	public static final Class91 aClass91_21 = new Class91();

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
	public static int anInt4064 = 0;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2432 = Static118.method2249("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_2431 = aClass65_2432;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Z")
	public static final boolean aBoolean163 = false;

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public static int anInt4065 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
	public static int method3056(@OriginalArg(0) int arg0) {
		if (arg0 == 16711935) {
			return -1;
		}
		@Pc(17) double local17 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(26) double local26 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(33) double local33 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(40) double local40 = local17;
		if (local26 > local17) {
			local40 = local26;
		}
		if (local40 < local33) {
			local40 = local33;
		}
		@Pc(54) double local54 = 0.0D;
		@Pc(56) double local56 = 0.0D;
		@Pc(58) double local58 = local17;
		if (local17 > local26) {
			local58 = local26;
		}
		if (local33 < local58) {
			local58 = local33;
		}
		@Pc(76) double local76 = (local40 + local58) / 2.0D;
		@Pc(81) int local81 = (int) (local76 * 256.0D);
		if (local40 != local58) {
			if (local40 == local17) {
				local56 = (local26 - local33) / (local40 - local58);
			} else if (local40 == local26) {
				local56 = (local33 - local17) / (local40 - local58) + 2.0D;
			} else if (local40 == local33) {
				local56 = (local17 - local26) / (local40 - local58) + 4.0D;
			}
			if (local76 < 0.5D) {
				local54 = (local40 - local58) / (local58 + local40);
			}
			if (local76 >= 0.5D) {
				local54 = (local40 - local58) / (-local58 + -local40 + 2.0D);
			}
		}
		local56 /= 6.0D;
		@Pc(168) int local168 = (int) (local56 * 256.0D);
		if (local81 < 0) {
			local81 = 0;
		} else if (local81 > 255) {
			local81 = 255;
		}
		@Pc(188) int local188 = (int) (local54 * 256.0D);
		if (local188 < 0) {
			local188 = 0;
		} else if (local188 > 255) {
			local188 = 255;
		}
		if (local81 > 243) {
			local188 >>= 0x4;
		} else if (local81 > 217) {
			local188 >>= 0x3;
		} else if (local81 > 192) {
			local188 >>= 0x2;
		} else if (local81 > 179) {
			local188 >>= 0x1;
		}
		return (local81 >> 1) + (local188 >> 5 << 7) + (local168 >> 2 << 10);
	}
}
