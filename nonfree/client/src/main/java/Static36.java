import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "Lclient!qt;")
	public static Class199 aClass199_3;

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "[Lclient!pt;")
	public static final Class4_Sub1_Sub17[] aClass4_Sub1_Sub17Array4 = new Class4_Sub1_Sub17[14];

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)[B")
	public static byte[] method643(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub15 local12 = (Class4_Sub1_Sub15) Static392.aClass142_3.method3483((long) arg0);
		if (local12 == null) {
			@Pc(25) byte[] local25 = new byte[512];
			@Pc(31) Random local31 = new Random((long) arg0);
			for (@Pc(33) int local33 = 0; local33 < 255; local33++) {
				local25[local33] = (byte) local33;
			}
			for (@Pc(48) int local48 = 0; local48 < 255; local48++) {
				@Pc(55) int local55 = 255 - local48;
				@Pc(60) int local60 = Static226.method3443(local31, local55);
				@Pc(64) byte local64 = local25[local60];
				local25[local60] = local25[local55];
				local25[local55] = local25[511 - local48] = local64;
			}
			local12 = new Class4_Sub1_Sub15(local25);
			Static392.aClass142_3.method3480((long) arg0, local12);
		}
		return local12.aByteArray57;
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!pe;")
	public static Class16_Sub1 method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class164 local7 = Static202.aClass164ArrayArrayArray5[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class7 local14 = local7.aClass7_3; local14 != null; local14 = local14.aClass7_1) {
			@Pc(18) Class16_Sub1 local18 = local14.aClass16_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort94 == arg1 && local18.aShort96 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
