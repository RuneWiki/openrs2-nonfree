import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
	public static int anInt10298;

	@OriginalMember(owner = "client!wba", name = "x", descriptor = "Lclient!wb;")
	public static Class382 aClass382_5;

	@OriginalMember(owner = "client!wba", name = "q", descriptor = "Lclient!ol;")
	public static final Class270 aClass270_1 = Static172.method2841();

	@OriginalMember(owner = "client!wba", name = "s", descriptor = "Lclient!tja;")
	public static final Class352 aClass352_76 = new Class352(64);

	@OriginalMember(owner = "client!wba", name = "u", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_149 = new Class216(30, -1);

	@OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
	public static int anInt10297 = 1;

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBIIIIIIIIII)V")
	public static void method8705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static583.method7687(arg8)) {
			return;
		}
		if (Static269.aClass199ArrayArray1[arg8] == null) {
			Static75.method1615(Static392.aClass199ArrayArray2[arg8], -1, arg5, arg7, arg9, arg4, arg3, arg1, arg0, arg10, arg2, arg6);
		} else {
			Static75.method1615(Static269.aClass199ArrayArray1[arg8], -1, arg5, arg7, arg9, arg4, arg3, arg1, arg0, arg10, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)I")
	public static int method8707() {
		@Pc(12) boolean local12 = false;
		@Pc(14) boolean local14 = false;
		@Pc(16) boolean local16 = false;
		if (Static239.aClass207_2.aBoolean399 && !Static239.aClass207_2.aBoolean398) {
			local12 = true;
			if (Static566.aClass4_Sub41_1.anInt7533 < 512 && Static566.aClass4_Sub41_1.anInt7533 != 0) {
				local12 = false;
			}
			if (Static332.aString65.startsWith("win")) {
				local16 = true;
				local14 = true;
			} else {
				local14 = true;
			}
		}
		if (Static431.aBoolean528) {
			local16 = false;
		}
		if (Static376.aBoolean422) {
			local14 = false;
		}
		if (Static357.aBoolean407) {
			local12 = false;
		}
		if (!local12 && !local14 && !local16) {
			return Static269.method3872();
		}
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		@Pc(74) int local74 = -1;
		if (local12) {
			try {
				local70 = Static97.method1974(1000, 2);
			} catch (@Pc(83) Exception local83) {
			}
		}
		if (local16) {
			try {
				local74 = Static97.method1974(1000, 3);
				if (Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052() == 3) {
					@Pc(102) Class359 local102 = Static582.aClass33_13.method8115();
					@Pc(107) long local107 = local102.aLong266 & 0xFFFFFFFFFFFFL;
					@Pc(110) int local110 = local102.anInt9152;
					if (local110 == 4318) {
						local14 &= local107 >= 64425238954L;
					} else if (local110 == 4098) {
						local14 &= local107 >= 60129613779L;
					}
				}
			} catch (@Pc(146) Exception local146) {
			}
		}
		if (local14) {
			try {
				local72 = Static97.method1974(1000, 1);
			} catch (@Pc(156) Exception local156) {
			}
		}
		if (local70 == -1 && local72 == -1 && local74 == -1) {
			return Static269.method3872();
		}
		local74 = (int) ((float) local74 * 1.1F);
		local72 = (int) ((float) local72 * 1.1F);
		if (local74 < local70 && local72 < local70) {
			return Static255.method3693(local70);
		} else if (local72 < local74) {
			return Static422.method5864(3, local74);
		} else {
			return Static422.method5864(1, local72);
		}
	}
}
