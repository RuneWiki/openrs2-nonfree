import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_103 = new Class254(81, 2);

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_62 = new Class181(79, 3);

	@OriginalMember(owner = "client!kr", name = "e", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_63 = new Class181(82, 7);

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_64 = new Class181(56, 4);

	@OriginalMember(owner = "client!kr", name = "g", descriptor = "[Lclient!ro;")
	public static final Class6_Sub4_Sub15[] aClass6_Sub4_Sub15Array5 = new Class6_Sub4_Sub15[14];

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Z")
	public static boolean method4621(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static98.anInt2326; local1 < Static192.anInt4157; local1++) {
			@Pc(6) Class224[][] local6 = Static256.aClass224ArrayArrayArray1[local1];
			for (@Pc(9) int local9 = -Static203.anInt4358; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static579.anInt7897 + local9;
				@Pc(18) int local18 = Static579.anInt7897 - local9;
				if (local14 >= Static118.anInt2585 || local18 < Static275.anInt5345) {
					for (@Pc(27) int local27 = -Static203.anInt4358; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static266.anInt4817 + local27;
						@Pc(36) int local36 = Static266.anInt4817 - local27;
						@Pc(48) Class224 local48;
						if (local14 >= Static118.anInt2585) {
							if (local32 >= Static17.anInt874) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean469) {
									Static342.aBoolean472 = arg0;
									Static83.aClass58_2.method5092(local48);
									Static83.aClass58_2.method5095();
								}
							}
							if (local36 < Static67.anInt1577) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean469) {
									Static342.aBoolean472 = arg0;
									Static83.aClass58_2.method5092(local48);
									Static83.aClass58_2.method5095();
								}
							}
						}
						if (local18 < Static275.anInt5345) {
							if (local32 >= Static17.anInt874) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean469) {
									Static342.aBoolean472 = arg0;
									Static83.aClass58_2.method5092(local48);
									Static83.aClass58_2.method5095();
								}
							}
							if (local36 < Static67.anInt1577) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean469) {
									Static342.aBoolean472 = arg0;
									Static83.aClass58_2.method5092(local48);
									Static83.aClass58_2.method5095();
								}
							}
						}
						if (Static480.anInt9428 == 0) {
							if (Static311.aBoolean405) {
								Static83.aClass58_2.method5096(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(JIBIZ)Ljava/lang/String;")
	public static String method4622(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(32) boolean local32 = false;
		if (arg0 < 0L) {
			local32 = true;
			arg0 = -arg0;
		}
		@Pc(48) StringBuffer local48 = new StringBuffer(26);
		@Pc(52) int local52;
		@Pc(57) int local57;
		if (arg2 > 0) {
			for (local52 = 0; local52 < arg2; local52++) {
				local57 = (int) arg0;
				arg0 /= 10L;
				local48.append((char) (local57 + 48 - (int) arg0 * 10));
			}
			local48.append(local7);
		}
		local52 = 0;
		while (true) {
			local57 = (int) arg0;
			arg0 /= 10L;
			local48.append((char) (local57 + 48 - (int) arg0 * 10));
			if (arg0 == 0L) {
				if (local32) {
					local48.append('-');
				}
				return local48.reverse().toString();
			}
			if (arg3) {
				local52++;
				if (local52 % 3 == 0) {
					local48.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
	public static void method4624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= Static376.anInt7071 && arg0 <= Class179_Sub2.lb) {
			@Pc(28) int local28 = Static501.method4264(arg3, Static289.anInt5545, Static96.anInt2302);
			@Pc(34) int local34 = Static501.method4264(arg1, Static289.anInt5545, Static96.anInt2302);
			Static518.method7590(local34, arg2, arg0, local28);
		}
	}
}
