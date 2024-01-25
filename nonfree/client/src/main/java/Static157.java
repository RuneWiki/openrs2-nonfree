import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
	public static int anInt3831;

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[[B")
	public static final byte[][] aByteArrayArray7 = new byte[250][];

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	public static int anInt3828 = 2;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "Lclient!gaa;")
	public static Class108 aClass108_4 = null;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "([Ljava/lang/String;IZI)Ljava/lang/String;")
	public static String method3365(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(19) String local19 = arg0[arg2];
			return local19 == null ? "null" : local19.toString();
		} else {
			@Pc(31) int local31 = arg1 + arg2;
			@Pc(33) int local33 = 0;
			for (@Pc(35) int local35 = arg2; local35 < local31; local35++) {
				@Pc(41) String local41 = arg0[local35];
				if (local41 == null) {
					local33 += 4;
				} else {
					local33 += local41.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local33);
			for (@Pc(67) int local67 = arg2; local67 < local31; local67++) {
				@Pc(73) String local73 = arg0[local67];
				if (local73 == null) {
					local60.append("null");
				} else {
					local60.append(local73);
				}
			}
			return local60.toString();
		}
	}
}
