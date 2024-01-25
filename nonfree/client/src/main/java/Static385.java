import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "I")
	public static int anInt6803;

	@OriginalMember(owner = "client!om", name = "e", descriptor = "F")
	public static float aFloat135;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public static int anInt6801 = -1;

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!aea;")
	public static final Class8 aClass8_5 = new Class8();

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method5687(@OriginalArg(1) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(25) int local25 = local6 + 3 & 0xFFFFFFFC;
		@Pc(31) int local31 = local25 / 4 * 3;
		if (local25 - 2 >= local6 || Static200.method3596(arg0.charAt(local25 - 2)) == -1) {
			local31 -= 2;
		} else if (local6 <= local25 - 1 || Static200.method3596(arg0.charAt(local25 - 1)) == -1) {
			local31--;
		}
		@Pc(71) byte[] local71 = new byte[local31];
		Static476.method6630(local71, arg0, 0);
		return local71;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lclient!qf;")
	public static Class281 method5688() {
		return Static92.method2117();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!st;)I")
	public static int method5690(@OriginalArg(1) Class10_Sub1_Sub2_Sub2 arg0) {
		@Pc(14) int local14 = arg0.anInt8548;
		@Pc(18) Class130 local18 = arg0.method7026();
		if (arg0.aBoolean592) {
			local14 = arg0.anInt8561;
		} else if (arg0.anInt8491 == local18.anInt3824 || arg0.anInt8491 == local18.anInt3782 || arg0.anInt8491 == local18.anInt3813 || arg0.anInt8491 == local18.anInt3789) {
			local14 = arg0.anInt8570;
		} else if (local18.anInt3797 == arg0.anInt8491 || arg0.anInt8491 == local18.anInt3795 || local18.anInt3798 == arg0.anInt8491 || arg0.anInt8491 == local18.anInt3803) {
			local14 = arg0.anInt8546;
		}
		return local14;
	}
}
