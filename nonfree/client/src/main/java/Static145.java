import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
	public static int anInt3525;

	@OriginalMember(owner = "client!fca", name = "o", descriptor = "[Lclient!jea;")
	public static final Class164[] aClass164Array1 = new Class164[6];

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "F")
	public static float aFloat104 = 1.0F;

	@OriginalMember(owner = "client!fca", name = "v", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_62 = new Class215(32, 6);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BII)Z")
	public static boolean method3218(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!kda;B)V")
	public static void method3219(@OriginalArg(0) Class3_Sub1_Sub3_Sub3 arg0) {
		@Pc(8) int local8 = arg0.anInt6042 - Static407.anInt7704;
		@Pc(22) int local22 = arg0.anInt6085 * 512 + arg0.method5214() * 256;
		@Pc(34) int local34 = arg0.anInt6101 * 512 + arg0.method5214() * 256;
		arg0.anInt6105 = 0;
		arg0.anInt10310 += (local34 - arg0.anInt10310) / local8;
		arg0.anInt10303 += (local22 - arg0.anInt10303) / local8;
		if (arg0.anInt6036 == 0) {
			arg0.method5218(8192);
		}
		if (arg0.anInt6036 == 1) {
			arg0.method5218(12288);
		}
		if (arg0.anInt6036 == 2) {
			arg0.method5218(0);
		}
		if (arg0.anInt6036 == 3) {
			arg0.method5218(4096);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIZLjava/lang/String;)I")
	public static int method3221(@OriginalArg(1) int arg0, @OriginalArg(3) String arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(39) int local39 = arg1.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg1.charAt(local41);
			if (local41 == 0) {
				if (local47 == '-') {
					local24 = true;
					continue;
				}
				if (local47 == '+') {
					continue;
				}
			}
			@Pc(74) int local74;
			if (local47 >= '0' && local47 <= '9') {
				local74 = local47 - '0';
			} else if (local47 >= 'A' && local47 <= 'Z') {
				local74 = local47 - '7';
			} else if (local47 >= 'a' && local47 <= 'z') {
				local74 = local47 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg0 <= local74) {
				throw new NumberFormatException();
			}
			if (local24) {
				local74 = -local74;
			}
			@Pc(125) int local125 = arg0 * local28 + local74;
			if (local28 != local125 / arg0) {
				throw new NumberFormatException();
			}
			local26 = true;
			local28 = local125;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(III)Z")
	public static boolean method3222(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
