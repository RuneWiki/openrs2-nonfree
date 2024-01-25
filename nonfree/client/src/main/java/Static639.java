import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[Lclient!s;")
	public static Class313[] aClass313Array2;

	@OriginalMember(owner = "client!ud", name = "j", descriptor = "Lclient!kr;")
	public static final Class216 aClass216_13 = new Class216();

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Lclient!vba;")
	public static Class3_Sub55 method8663() {
		@Pc(7) Class333 local7 = null;
		@Pc(13) Class3_Sub55 local13 = new Class3_Sub55(Static667.aClass169_8, 0);
		try {
			@Pc(19) Class201 local19 = Static310.aClass47_4.method939("");
			while (local19.anInt5729 == 0) {
				Static564.method7845(1L);
			}
			if (local19.anInt5729 == 1) {
				local7 = (Class333) local19.anObject16;
				@Pc(54) byte[] local54 = new byte[(int) local7.method7954()];
				@Pc(69) int local69;
				for (@Pc(56) int local56 = 0; local56 < local54.length; local56 += local69) {
					local69 = local7.method7959(local56, local54.length - local56, local54);
					if (local69 == -1) {
						throw new IOException("EOF");
					}
				}
				local13 = new Class3_Sub55(new Class3_Sub28(local54), Static667.aClass169_8, 0);
			}
		} catch (@Pc(100) Exception local100) {
		}
		try {
			if (local7 != null) {
				local7.method7955();
			}
		} catch (@Pc(107) Exception local107) {
		}
		return local13;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZII)V")
	public static void method8665(@OriginalArg(1) boolean arg0) {
		if (22050 > 48000) {
			throw new IllegalArgumentException();
		}
		Static103.anInt1658 = 22050;
		Static510.aBoolean777 = arg0;
		Static209.anInt3629 = 2;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method8670() {
		@Pc(13) Class3_Sub4_Sub2 local13 = Static502.method7211(15, 0L);
		local13.method627();
	}
}
