import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!ns", name = "M", descriptor = "I")
	public static int anInt6223;

	@OriginalMember(owner = "client!ns", name = "N", descriptor = "I")
	public static int anInt6224;

	@OriginalMember(owner = "client!ns", name = "T", descriptor = "[Lclient!mca;")
	public static Class38_Sub1[] aClass38_Sub1Array99;

	@OriginalMember(owner = "client!ns", name = "R", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_47 = new Class277(32);

	@OriginalMember(owner = "client!ns", name = "S", descriptor = "Lclient!re;")
	public static Class250 aClass250_4 = null;

	@OriginalMember(owner = "client!ns", name = "V", descriptor = "I")
	public static int anInt6229 = 0;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!os;I)Lclient!al;")
	public static Class1_Sub3 method5653(@OriginalArg(0) Class1_Sub17 arg0) {
		arg0.method4487();
		@Pc(15) int local15 = arg0.method4487();
		@Pc(19) Class1_Sub3 local19 = Static399.method6369(local15);
		local19.anInt9504 = arg0.method4487();
		@Pc(32) int local32 = arg0.method4487();
		for (@Pc(34) int local34 = 0; local34 < local32; local34++) {
			@Pc(40) int local40 = arg0.method4487();
			local19.method8200(local40, arg0);
		}
		local19.method8197();
		return local19;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "([BIIB)Ljava/lang/String;")
	public static String method5654(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) char[] local16 = new char[arg2];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
			@Pc(30) int local30 = arg0[local20 + arg1] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(51) char local51 = Static115.aCharArray5[local30 - 128];
					if (local51 == '\u0000') {
						local51 = '?';
					}
					local30 = local51;
				}
				local16[local18++] = (char) local30;
			}
		}
		return new String(local16, 0, local18);
	}
}
