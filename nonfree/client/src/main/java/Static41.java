import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!ml;")
	public static Class137 aClass137_1;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!bo;")
	public static final Class24 aClass24_2 = new Class24(16);

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
	public static final int[] anIntArray58 = new int[32];

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public static void method725() {
		Static4.aClass198_2.method5230();
		Static264.aClass198_49.method5230();
		Static290.aClass198_52.method5230();
		Static235.aClass198_44.method5230();
		Static181.aClass198_13.method5230();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZLjava/lang/String;I)I")
	public static int method727(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg1.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg1.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(73) int local73;
			if (local46 >= '0' && local46 <= '9') {
				local73 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local73 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local73 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local73 >= arg0) {
				throw new NumberFormatException();
			}
			if (local31) {
				local73 = -local73;
			}
			@Pc(123) int local123 = local35 * arg0 + local73;
			if (local35 != local123 / arg0) {
				throw new NumberFormatException();
			}
			local33 = true;
			local35 = local123;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}
}
