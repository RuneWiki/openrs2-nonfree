import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hja", name = "c", descriptor = "Lclient!qh;")
	public static Class4_Sub5_Sub17 aClass4_Sub5_Sub17_3;

	@OriginalMember(owner = "client!hja", name = "d", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_81 = new Class151(14, -2);

	@OriginalMember(owner = "client!hja", name = "e", descriptor = "[I")
	public static final int[] anIntArray250 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!hja", name = "f", descriptor = "I")
	public static int anInt3564 = 0;

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(ILclient!iaa;)I")
	public static int method3273(@OriginalArg(1) Class3_Sub1_Sub2_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt3932;
		@Pc(12) Class377 local12 = arg0.method8525();
		if (arg0.anInt9967 == -1 || arg0.aBoolean776) {
			local8 = arg0.anInt3937;
		} else if (local12.anInt10039 == arg0.anInt9967 || local12.anInt10035 == arg0.anInt9967 || arg0.anInt9967 == local12.anInt10051 || arg0.anInt9967 == local12.anInt10062) {
			local8 = arg0.anInt3941;
		} else if (arg0.anInt9967 == local12.anInt10063 || arg0.anInt9967 == local12.anInt10068 || local12.anInt10054 == arg0.anInt9967 || arg0.anInt9967 == local12.anInt10044) {
			local8 = arg0.anInt3930;
		}
		return local8;
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(III)Z")
	public static boolean method3274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
