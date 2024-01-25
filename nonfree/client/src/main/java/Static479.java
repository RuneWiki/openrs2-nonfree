import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!pca", name = "b", descriptor = "Lclient!uj;")
	public static final Class371 aClass371_6 = new Class371("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)I")
	public static int method7001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static235.aShortArrayArray2 == null ? 0 : Static235.aShortArrayArray2[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ula;")
	public static RuntimeException_Sub1 method7003(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(12) RuntimeException_Sub1 local12;
		if (arg0 instanceof RuntimeException_Sub1) {
			local12 = (RuntimeException_Sub1) arg0;
			local12.aString126 = local12.aString126 + ' ' + arg1;
		} else {
			local12 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local12;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILclient!ha;IIII)Lclient!ka;")
	public static Class157 method7004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class67 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg0;
		@Pc(12) Class157 local12 = (Class157) Static271.aClass338_24.method8049(local6);
		if (local12 == null) {
			@Pc(22) Class178 local22 = Static542.method7606(Static719.aClass221_163, 0, true, arg0);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt5137 < 13) {
				local22.method4270();
			}
			local12 = arg2.method7653(local22, 2055, Static548.anInt9218, 64, 768);
			Static271.aClass338_24.method8044(local6, local12);
		}
		local12 = local12.method5211((byte) 6, 2055, true);
		if (arg5 != 0) {
			local12.a(arg5);
		}
		if (arg1 != 0) {
			local12.FA(arg1);
		}
		if (arg3 != 0) {
			local12.VA(arg3);
		}
		if (arg4 != 0) {
			local12.H(0, arg4, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method7005(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(44) int local44 = 0;
			@Pc(46) long local46 = arg0;
			while (local46 != 0L) {
				local46 /= 37L;
				local44++;
			}
			@Pc(64) StringBuffer local64 = new StringBuffer(local44);
			while (arg0 != 0L) {
				@Pc(70) long local70 = arg0;
				arg0 /= 37L;
				local64.append(Static562.aCharArray3[(int) (local70 - arg0 * 37L)]);
			}
			return local64.reverse().toString();
		}
	}
}
