import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
	public static int anInt10554;

	@OriginalMember(owner = "client!pt", name = "g", descriptor = "Lclient!le;")
	public static final Class208 aClass208_3 = Static612.method8700();

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_168 = new Class337(37, 6);

	@OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
	public static int anInt10553 = -1;

	@OriginalMember(owner = "client!pt", name = "m", descriptor = "Z")
	public static final boolean aBoolean758 = false;

	@OriginalMember(owner = "client!pt", name = "n", descriptor = "[I")
	public static int[] anIntArray599 = null;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method8966(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(39) int local39 = arg0.length();
		for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
			@Pc(47) char local47 = arg0.charAt(local41);
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
			if (arg1 <= local74) {
				throw new NumberFormatException();
			}
			if (local24) {
				local74 = -local74;
			}
			@Pc(120) int local120 = local74 + arg1 * local28;
			if (local120 / arg1 != local28) {
				throw new NumberFormatException();
			}
			local28 = local120;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V")
	public static void method8968() {
		if (!Static95.aBoolean143) {
			Static95.aBoolean143 = true;
			Static444.aFloat139 += (-Static444.aFloat139 - 24.0F) / 2.0F;
			Static187.aBoolean232 = true;
		}
	}
}
