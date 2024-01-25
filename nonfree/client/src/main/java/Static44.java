import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lclient!of;")
	public static final Class174 aClass174_27 = new Class174("Loading sprites - ", "Lade Sprites - ", "Chargement des sprites - ", "Carregando sprites - ");

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public static void method856() {
		if (Static151.aClass96_2 != null) {
			Static151.aClass96_2.method3471();
		}
		if (Static63.aClass96_3 != null) {
			Static63.aClass96_3.method3471();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)Z")
	public static boolean method857(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!kw;IIIII)V")
	public static void method859(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt6979 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass3_Sub7Array3[local4] != null) {
				arg0.anInt6979++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt6979; local22++) {
			@Pc(31) long local31 = Static60.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class226 local41;
			while (local31 != 0L) {
				local41 = Static197.aClass226Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub7_2 == arg0.aClass3_Sub7Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static60.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static197.aClass226Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass3_Sub7_2 == arg0.aClass3_Sub7Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt6979 - 1; local93++) {
				arg0.aClass3_Sub7Array3[local93] = arg0.aClass3_Sub7Array3[local93 + 1];
			}
			arg0.anInt6979--;
		}
	}
}
