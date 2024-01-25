import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!aw", name = "v", descriptor = "Z")
	public static boolean aBoolean32;

	@OriginalMember(owner = "client!aw", name = "p", descriptor = "I")
	public static int anInt391;

	@OriginalMember(owner = "client!aw", name = "k", descriptor = "I")
	public static int anInt392;

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_7 = new Class322(102, 3);

	@OriginalMember(owner = "client!aw", name = "r", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!aw", name = "l", descriptor = "[Lclient!ol;")
	public static final Class272[] aClass272Array1 = new Class272[6];

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)Lclient!ng;")
	public static Class6_Sub17_Sub4 method348() {
		return Static449.aClass6_Sub17_Sub4_3;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)I")
	public static int method350() {
		if (Static637.aClass381_13 == null) {
			if (!Static484.aBoolean623 && Static197.aClass6_Sub2_Sub11_2 != null) {
				return Static197.aClass6_Sub2_Sub11_2.anInt5170;
			}
			@Pc(31) int local31 = Static331.aClass42_8.method6019();
			@Pc(35) int local35 = Static331.aClass42_8.method6014();
			@Pc(55) int local55;
			@Pc(57) int local57;
			@Pc(77) int local77;
			@Pc(160) Class6_Sub2_Sub11 local160;
			if (Static84.aBoolean110) {
				@Pc(289) Class131 local289;
				if (local31 > Static25.anInt354 && local31 < Static406.anInt7073 + Static25.anInt354) {
					local55 = -1;
					for (local57 = 0; local57 < Static574.anInt9192; local57++) {
						if (Static356.aBoolean442) {
							local77 = local57 * 16 + Static243.anInt4678 + 33;
							if (local77 - 13 < local35 && local77 + 3 >= local35) {
								local55 = local57;
							}
						} else {
							local77 = local57 * 16 + Static243.anInt4678 + 31;
							if (local77 - 13 < local35 && local77 + 3 >= local35) {
								local55 = local57;
							}
						}
					}
					if (local55 != -1) {
						local77 = 0;
						local289 = new Class131(Static228.aClass82_5);
						for (@Pc(294) Class6_Sub2_Sub2 local294 = (Class6_Sub2_Sub2) local289.method3484(); local294 != null; local294 = (Class6_Sub2_Sub2) local289.method3483()) {
							if (local55 == local77++) {
								return ((Class6_Sub2_Sub11) local294.aClass82_1.aClass6_Sub2_17.aClass6_Sub2_65).anInt5170;
							}
						}
					}
				} else if (Static310.aClass6_Sub2_Sub2_1 != null && Static421.anInt7230 < local31 && local31 < Static69.anInt919 + Static421.anInt7230) {
					local55 = -1;
					for (local57 = 0; local57 < Static310.aClass6_Sub2_Sub2_1.anInt618; local57++) {
						if (Static356.aBoolean442) {
							local77 = Static145.anInt3045 + local57 * 16 + 33;
							if (local35 > local77 - 13 && local77 + 3 >= local35) {
								local55 = local57;
							}
						} else {
							local77 = Static145.anInt3045 + local57 * 16 + 31;
							if (local77 - 13 < local35 && local35 <= local77 + 3) {
								local55 = local57;
							}
						}
					}
					if (local55 != -1) {
						local77 = 0;
						local289 = new Class131(Static310.aClass6_Sub2_Sub2_1.aClass82_1);
						for (local160 = (Class6_Sub2_Sub11) local289.method3484(); local160 != null; local160 = (Class6_Sub2_Sub11) local289.method3483()) {
							if (local55 == local77++) {
								return local160.anInt5170;
							}
						}
					}
				}
			} else if (local31 > Static25.anInt354 && local31 < Static25.anInt354 + Static406.anInt7073) {
				local55 = -1;
				for (local57 = 0; local57 < Static539.anInt8776; local57++) {
					if (Static356.aBoolean442) {
						local77 = Static243.anInt4678 + (-local57 + (Static539.anInt8776 - 1)) * 16 + 33;
						if (local35 > local77 - 13 && local77 + 3 >= local35) {
							local55 = local57;
						}
					} else {
						local77 = Static243.anInt4678 + (Static539.anInt8776 + -1 - local57) * 16 + 31;
						if (local77 - 13 < local35 && local77 + 3 >= local35) {
							local55 = local57;
						}
					}
				}
				if (local55 != -1) {
					local77 = 0;
					@Pc(155) Class167 local155 = new Class167(Static116.aClass340_17);
					for (local160 = (Class6_Sub2_Sub11) local155.method4235(); local160 != null; local160 = (Class6_Sub2_Sub11) local155.method4236()) {
						if (local77++ == local55) {
							return local160.anInt5170;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(III)Z")
	public static boolean method351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg1 & 0x2000) != 0 | Static249.method4344(arg1, arg0) | Static569.method7983(arg1, arg0)) & Static188.method3524(arg0, arg1);
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(BLclient!mv;Lclient!oja;)Lclient!dm;")
	public static Class6_Sub13 method353(@OriginalArg(1) Class241 arg0, @OriginalArg(2) Class270 arg1) {
		@Pc(8) Class6_Sub13 local8 = Static136.method2606();
		local8.anInt2126 = arg0.anInt6670;
		local8.aClass241_29 = arg0;
		if (local8.anInt2126 == -1) {
			local8.aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1(260);
		} else if (local8.anInt2126 == -2) {
			local8.aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1(10000);
		} else if (local8.anInt2126 <= 18) {
			local8.aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1(20);
		} else if (local8.anInt2126 <= 98) {
			local8.aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1(100);
		} else {
			local8.aClass6_Sub15_Sub1_1 = new Class6_Sub15_Sub1(260);
		}
		local8.aClass6_Sub15_Sub1_1.method2474(arg1);
		local8.aClass6_Sub15_Sub1_1.method2471(local8.aClass241_29.method5928());
		local8.anInt2125 = 0;
		return local8;
	}
}
