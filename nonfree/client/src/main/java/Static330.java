import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "[S")
	public static short[] aShortArray102;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_203 = new Class119(64);

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[BI)I")
	public static int method5772(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static285.method5105(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([[[Lclient!ak;Z)V")
	public static void method5773(@OriginalArg(0) Class8[][][] arg0) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class8[][] local17 = arg0[local11];
			for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
				for (@Pc(23) int local23 = 0; local23 < local17[local19].length; local23++) {
					@Pc(31) Class8 local31 = local17[local19][local23];
					if (local31 != null) {
						if (local31.aClass62_Sub3_1 instanceof Interface9) {
							((Interface9) local31.aClass62_Sub3_1).method5577();
						}
						if (local31.aClass62_Sub5_2 instanceof Interface9) {
							((Interface9) local31.aClass62_Sub5_2).method5577();
						}
						if (local31.aClass62_Sub5_1 instanceof Interface9) {
							((Interface9) local31.aClass62_Sub5_1).method5577();
						}
						if (local31.aClass62_Sub4_2 instanceof Interface9) {
							((Interface9) local31.aClass62_Sub4_2).method5577();
						}
						if (local31.aClass62_Sub4_1 instanceof Interface9) {
							((Interface9) local31.aClass62_Sub4_1).method5577();
						}
						for (@Pc(81) Class172 local81 = local31.aClass172_1; local81 != null; local81 = local81.aClass172_4) {
							@Pc(86) Class62_Sub1 local86 = local81.aClass62_Sub1_1;
							if (local86 instanceof Interface9) {
								((Interface9) local86).method5577();
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lclient!uc;")
	public static Class2_Sub11_Sub19 method5774() {
		@Pc(13) Class2_Sub11_Sub19 local13 = (Class2_Sub11_Sub19) Static316.aClass54_10.method1661();
		if (local13 != null) {
			local13.method5945();
			local13.method5914();
			return local13;
		}
		do {
			local13 = (Class2_Sub11_Sub19) Static216.aClass54_3.method1661();
			if (local13 == null) {
				return null;
			}
			if (local13.method5535() > Static51.method1197()) {
				return null;
			}
			local13.method5945();
			local13.method5914();
		} while ((Long.MIN_VALUE & local13.aLong212) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5776(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(34) int local34 = 0;
			@Pc(36) long local36 = arg0;
			while (local36 != 0L) {
				local36 /= 37L;
				local34++;
			}
			@Pc(54) StringBuffer local54 = new StringBuffer(local34);
			while (arg0 != 0L) {
				@Pc(58) long local58 = arg0;
				arg0 /= 37L;
				local54.append(Static337.aCharArray15[(int) (local58 - arg0 * 37L)]);
			}
			return local54.reverse().toString();
		}
	}
}
