import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "Lclient!si;")
	public static final Class335 aClass335_42 = new Class335(16);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZLjava/lang/String;III)V")
	public static void method8483(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static105.method1887(arg1, (String) null, arg3, arg2, false, arg0);
	}

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "(I)V")
	public static void method8485() {
		@Pc(7) Class182 local7 = null;
		try {
			@Pc(13) Class268 local13 = Static96.aClass48_5.method1306("2");
			while (local13.anInt8008 == 0) {
				Static650.method9565(1L);
			}
			if (local13.anInt8008 == 1) {
				local7 = (Class182) local13.anObject19;
				@Pc(44) byte[] local44 = new byte[(int) local7.method4765()];
				@Pc(59) int local59;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local59) {
					local59 = local7.method4773(local46, local44.length - local46, local44);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static548.method8413(new Class2_Sub8(local44));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method4769();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}
}
