import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "Z")
	public static boolean aBoolean359;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "Lclient!io;")
	public static final Class147 aClass147_5 = new Class147();

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "[F")
	public static final float[] aFloatArray39 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[200];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZIIIII)V")
	public static void method3828(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 + 1;
		Static118.method2461(Static228.anIntArrayArray46[arg4], arg0, arg2, arg1);
		@Pc(18) int local18 = arg3 - 1;
		Static118.method2461(Static228.anIntArrayArray46[arg3], arg0, arg2, arg1);
		for (@Pc(29) int local29 = local9; local29 <= local18; local29++) {
			@Pc(35) int[] local35 = Static228.anIntArrayArray46[local29];
			local35[arg1] = local35[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZJII)Ljava/lang/String;")
	public static String method3831(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(27) boolean local27 = false;
		if (arg2 < 0L) {
			arg2 = -arg2;
			local27 = true;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(48) int local48;
		@Pc(53) int local53;
		if (arg3 > 0) {
			for (local48 = 0; local48 < arg3; local48++) {
				local53 = (int) arg2;
				arg2 /= 10L;
				local41.append((char) (local53 + 48 - (int) arg2 * 10));
			}
			local41.append(local7);
		}
		local48 = 0;
		while (true) {
			local53 = (int) arg2;
			arg2 /= 10L;
			local41.append((char) (local53 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local27) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg1) {
				local48++;
				if (local48 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLclient!an;)V")
	public static void method3833(@OriginalArg(1) Class16 arg0) {
		Static196.aClass16_51 = arg0;
	}
}
