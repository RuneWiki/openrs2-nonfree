import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!kn", name = "Ob", descriptor = "I")
	public static int anInt3368;

	@OriginalMember(owner = "client!kn", name = "Wb", descriptor = "I")
	public static int anInt3375;

	@OriginalMember(owner = "client!kn", name = "bc", descriptor = "Ljava/awt/Image;")
	public static Image anImage4;

	@OriginalMember(owner = "client!kn", name = "Jb", descriptor = "Ljava/lang/String;")
	public static String aString97 = "wave:";

	@OriginalMember(owner = "client!kn", name = "Pb", descriptor = "[I")
	public static int[] anIntArray299 = new int[100];

	@OriginalMember(owner = "client!kn", name = "Yb", descriptor = "Lclient!tl;")
	public static Class155 aClass155_28 = new Class155(16);

	@OriginalMember(owner = "client!kn", name = "cc", descriptor = "Z")
	public static boolean aBoolean171 = false;

	@OriginalMember(owner = "client!kn", name = "dc", descriptor = "Ljava/lang/String;")
	public static String aString98 = "yellow:";

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2674(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(7) int arg4) {
		@Pc(15) long local15 = Static172.method3180(arg3, arg4 + 0, arg1);
		@Pc(33) int local33;
		@Pc(26) int local26;
		@Pc(40) int local40;
		@Pc(44) Class30 local44;
		@Pc(52) int local52;
		@Pc(60) int[] local60;
		@Pc(76) int local76;
		if (local15 != 0L) {
			local26 = (int) local15 >> 14 & 0x1F;
			local33 = (int) local15 >> 20 & 0x3;
			local40 = (int) (local15 >>> 32) & Integer.MAX_VALUE;
			local44 = Static268.method4511(local40);
			if (local44.anInt828 == -1) {
				local52 = arg0;
				if (local15 > 0L) {
					local52 = arg2;
				}
				local60 = Static203.anIntArray460;
				local76 = (52736 - arg1 * 512) * 4 + arg4 * 4 + 24624;
				if (local26 == 0 || local26 == 2) {
					if (local33 == 0) {
						local60[local76] = local52;
						local60[local76 + 512] = local52;
						local60[local76 + 1024] = local52;
						local60[local76 + 1536] = local52;
					} else if (local33 == 1) {
						local60[local76] = local52;
						local60[local76 + 1] = local52;
						local60[local76 + 2] = local52;
						local60[local76 + 3] = local52;
					} else if (local33 == 2) {
						local60[local76 + 3] = local52;
						local60[local76 + 512 + 3] = local52;
						local60[local76 + 1024 + 3] = local52;
						local60[local76 + 1536 + 3] = local52;
					} else if (local33 == 3) {
						local60[local76 + 1536] = local52;
						local60[local76 + 1 + 1536] = local52;
						local60[local76 + 1536 + 2] = local52;
						local60[local76 + 1536 + 3] = local52;
					}
				}
				if (local26 == 3) {
					if (local33 == 0) {
						local60[local76] = local52;
					} else if (local33 == 1) {
						local60[local76 + 3] = local52;
					} else if (local33 == 2) {
						local60[local76 + 3 + 1536] = local52;
					} else if (local33 == 3) {
						local60[local76 + 1536] = local52;
					}
				}
				if (local26 == 2) {
					if (local33 == 3) {
						local60[local76] = local52;
						local60[local76 + 512] = local52;
						local60[local76 + 1024] = local52;
						local60[local76 + 1536] = local52;
					} else if (local33 == 0) {
						local60[local76] = local52;
						local60[local76 + 1] = local52;
						local60[local76 + 2] = local52;
						local60[local76 + 3] = local52;
					} else if (local33 == 1) {
						local60[local76 + 3] = local52;
						local60[local76 + 3 + 512] = local52;
						local60[local76 + 3 + 1024] = local52;
						local60[local76 + 1539] = local52;
					} else if (local33 == 2) {
						local60[local76 + 1536] = local52;
						local60[local76 + 1 + 1536] = local52;
						local60[local76 + 2 + 1536] = local52;
						local60[local76 + 3 + 1536] = local52;
					}
				}
			} else if (!Static89.method1541(arg1, local44, arg4, local33)) {
				return false;
			}
		}
		local15 = Static199.method3572(arg3, arg4 + 0, arg1);
		if (local15 != 0L) {
			local33 = (int) local15 >> 20 & 0x3;
			local26 = (int) local15 >> 14 & 0x1F;
			local40 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			local44 = Static268.method4511(local40);
			if (local44.anInt828 == -1) {
				if (local26 == 9) {
					local52 = 15658734;
					if (local15 > 0L) {
						local52 = 15597568;
					}
					local60 = Static203.anIntArray460;
					local76 = arg4 * 4 + (103 - arg1) * 4 * 512 + 24624;
					if (local33 == 0 || local33 == 2) {
						local60[local76 + 1536] = local52;
						local60[local76 + 1024 + 1] = local52;
						local60[local76 + 2 + 512] = local52;
						local60[local76 + 3] = local52;
					} else {
						local60[local76] = local52;
						local60[local76 + 513] = local52;
						local60[local76 + 1024 + 2] = local52;
						local60[local76 + 1536 + 3] = local52;
					}
				}
			} else if (!Static89.method1541(arg1, local44, arg4, local33)) {
				return false;
			}
		}
		local15 = Static242.method4165(arg3, arg4 + 0, arg1);
		if (local15 != 0L) {
			local33 = (int) local15 >> 20 & 0x3;
			local26 = Integer.MAX_VALUE & (int) (local15 >>> 32);
			@Pc(599) Class30 local599 = Static268.method4511(local26);
			if (local599.anInt828 != -1 && !Static89.method1541(arg1, local599, arg4, local33)) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "(I)V")
	public static void method2675() {
		Static240.method4148(false);
		System.gc();
		Static140.method2511(25);
	}
}
