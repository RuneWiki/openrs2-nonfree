import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Lclient!v;")
	public static final Class362 aClass362_56 = new Class362();

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZC)I")
	public static int method7062(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class29_Sub17.anIntArray426.length > arg0 ? Class29_Sub17.anIntArray426[arg0] : -1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
	public static Object method7063(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static279.aBoolean304) {
			try {
				@Pc(20) Class258 local20 = (Class258) Class.forName("Class258_Sub1").getDeclaredConstructor().newInstance();
				local20.method6308(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static279.aBoolean304 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!aaa;")
	public static Class2_Sub1_Sub1 method7064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class67 local14 = local7.aClass67_3; local14 != null; local14 = local14.aClass67_1) {
			@Pc(18) Class2_Sub1_Sub1 local18 = local14.aClass2_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort118 == arg1 && local18.aShort121 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I")
	public static int method7065(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
