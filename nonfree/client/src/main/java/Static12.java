import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!aga", name = "U", descriptor = "Lclient!vfa;")
	public static Class368 aClass368_1;

	@OriginalMember(owner = "client!aga", name = "M", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_16 = new Class179(130, 0);

	@OriginalMember(owner = "client!aga", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString10 = "";

	@OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)I")
	public static int method448() {
		return Static644.anInt10398;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!ae;ZII)Lclient!wia;")
	public static Class6_Sub4_Sub20 method449(@OriginalArg(0) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class6_Sub23 local14 = new Class6_Sub23(arg0.method262(arg1, arg2));
		@Pc(47) Class6_Sub4_Sub20 local47 = new Class6_Sub4_Sub20(arg1, local14.method8354(), local14.method8354(), local14.method8369(), local14.method8369(), local14.method8374() == 1, local14.method8374(), local14.method8374());
		@Pc(51) int local51 = local14.method8374();
		for (@Pc(53) int local53 = 0; local53 < local51; local53++) {
			local47.aClass362_65.method8536(new Class6_Sub43(local14.method8374(), local14.method8363(), local14.method8363(), local14.method8363(), local14.method8363(), local14.method8363(), local14.method8363(), local14.method8363(), local14.method8363()));
		}
		local47.method9024();
		return local47;
	}
}
