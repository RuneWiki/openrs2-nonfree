import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Lclient!me;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "Lclient!he;")
	private static Class26 aClass26_241 = Static6.method100("flash2:");

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_242 = aClass26_241;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_243 = aClass26_241;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!sf;")
	public static Class66 aClass66_6 = new Class66(500);

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_244 = Static6.method100("leuchten2:");

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "Lclient!he;")
	public static Class26 aClass26_245 = Static6.method100(")4l");

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Lclient!he;")
	public static Class26 aClass26_246 = Static6.method100("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "Lclient!he;")
	public static Class26 aClass26_247 = Static6.method100("<col=00ffff>");

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "Lclient!he;")
	private static Class26 aClass26_248 = Static6.method100("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public static int anInt418 = 0;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
	public static int anInt419 = 0;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Lclient!he;")
	public static Class26 aClass26_249 = Static6.method100("http:)4)4");

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "Lclient!he;")
	public static Class26 aClass26_250 = Static6.method100("va");

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "Lclient!he;")
	public static Class26 aClass26_251 = Static6.method100("Ausw-=hlen");

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "Lclient!he;")
	public static Class26 aClass26_252 = aClass26_248;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "Lclient!he;")
	public static Class26 aClass26_253 = Static6.method100(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	public static int anInt420 = 0;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method267() {
		aClass26_250 = null;
		aClass26_247 = null;
		aClass26_248 = null;
		aClass26_249 = null;
		aClass26_244 = null;
		aClass26_243 = null;
		aClass26_241 = null;
		aClass26_253 = null;
		aClass26_245 = null;
		aClass26_251 = null;
		aClass26_242 = null;
		aClass26_246 = null;
		aClass66_6 = null;
		aClass47_1 = null;
		aClass26_252 = null;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public static void method269() {
		@Pc(6) int local6 = Static33.aClass3_Sub11_Sub1_2.method1031(8);
		@Pc(11) int local11;
		if (Static62.anInt1885 > local6) {
			for (local11 = local6; local11 < Static62.anInt1885; local11++) {
				Static96.anIntArray311[Static58.anInt1778++] = Static117.anIntArray370[local11];
			}
		}
		if (Static62.anInt1885 < local6) {
			throw new RuntimeException("gppov1");
		}
		Static62.anInt1885 = 0;
		for (local11 = 0; local11 < local6; local11++) {
			@Pc(53) int local53 = Static117.anIntArray370[local11];
			@Pc(57) Class3_Sub1_Sub5_Sub1_Sub1 local57 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local53];
			@Pc(62) int local62 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
			if (local62 == 0) {
				Static117.anIntArray370[Static62.anInt1885++] = local53;
				local57.anInt2722 = Static4.anInt136;
			} else {
				@Pc(85) int local85 = Static33.aClass3_Sub11_Sub1_2.method1031(2);
				if (local85 == 0) {
					Static117.anIntArray370[Static62.anInt1885++] = local53;
					local57.anInt2722 = Static4.anInt136;
					Static76.anIntArray206[Static19.anInt512++] = local53;
				} else {
					@Pc(127) int local127;
					@Pc(139) int local139;
					if (local85 == 1) {
						Static117.anIntArray370[Static62.anInt1885++] = local53;
						local57.anInt2722 = Static4.anInt136;
						local127 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
						local57.method1882(false, local127);
						local139 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
						if (local139 == 1) {
							Static76.anIntArray206[Static19.anInt512++] = local53;
						}
					} else if (local85 == 2) {
						Static117.anIntArray370[Static62.anInt1885++] = local53;
						local57.anInt2722 = Static4.anInt136;
						local127 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
						local57.method1882(true, local127);
						local139 = Static33.aClass3_Sub11_Sub1_2.method1031(3);
						local57.method1882(true, local139);
						@Pc(195) int local195 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
						if (local195 == 1) {
							Static76.anIntArray206[Static19.anInt512++] = local53;
						}
					} else if (local85 == 3) {
						Static96.anIntArray311[Static58.anInt1778++] = local53;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z[Lclient!he;)[Lclient!he;")
	public static Class26[] method271(@OriginalArg(1) Class26[] arg0) {
		@Pc(4) Class26[] local4 = new Class26[5];
		for (@Pc(6) int local6 = 0; local6 < 5; local6++) {
			local4[local6] = Static119.method2136(new Class26[] { Static122.method2170(local6), Static60.aClass26_909 });
			if (arg0 != null && arg0[local6] != null) {
				local4[local6] = Static119.method2136(new Class26[] { local4[local6], arg0[local6] });
			}
		}
		return local4;
	}
}
