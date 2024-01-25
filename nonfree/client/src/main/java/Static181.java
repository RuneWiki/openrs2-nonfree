import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
	public static int anInt3401;

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public static int anInt3402;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "[F")
	public static final float[] aFloatArray29 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_56 = new Class156(2, 4);

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[200];

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "Lclient!pe;")
	public static final Class282 aClass282_16 = new Class282(13, 0, 1, 0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method3134(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (arg0 > 36) {
			throw new IllegalArgumentException("Invalid radix:" + arg0);
		}
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(42) int local42 = 0;
		@Pc(45) int local45 = arg1.length();
		for (@Pc(47) int local47 = 0; local47 < local45; local47++) {
			@Pc(55) char local55 = arg1.charAt(local47);
			if (local47 == 0) {
				if (local55 == '-') {
					local31 = true;
					continue;
				}
				if (local55 == '+' && true) {
					continue;
				}
			}
			@Pc(94) int local94;
			if (local55 >= '0' && local55 <= '9') {
				local94 = local55 - '0';
			} else if (local55 >= 'A' && local55 <= 'Z') {
				local94 = local55 - '7';
			} else if (local55 >= 'a' && local55 <= 'z') {
				local94 = local55 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local94 >= arg0) {
				throw new NumberFormatException();
			}
			if (local31) {
				local94 = -local94;
			}
			@Pc(154) int local154 = local42 * arg0 + local94;
			if (local42 != local154 / arg0) {
				throw new NumberFormatException();
			}
			local42 = local154;
			local33 = true;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local42;
	}
}
