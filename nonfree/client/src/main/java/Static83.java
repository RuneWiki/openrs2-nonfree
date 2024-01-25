import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public static int anInt2025;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_29 = new Class177(3, 3);

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "Lclient!rr;")
	public static final Class220 aClass220_3 = new Class220(4, 1, 1, 1);

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_50 = new Class158("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V")
	public static void method1514() {
		Static130.aClass137Array5 = null;
		Static276.aClass137Array12 = null;
		Static391.aClass137Array18 = null;
		Static247.aClass137Array10 = null;
		Static344.aClass137Array16 = null;
		Static235.aClass137_13 = null;
		Static73.aClass137Array4 = null;
		Static44.aClass137Array13 = null;
		Static12.aClass137Array2 = null;
		Static184.aClass137Array8 = null;
		Static3.aClass137Array1 = null;
		Static96.aClass137_3 = null;
		Static366.aClass137Array17 = null;
		Static13.aClass20_2 = null;
		Static344.aClass137Array15 = null;
		Static339.aClass137Array14 = null;
		Static180.aClass20_3 = null;
		Static308.aClass20_5 = null;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!pt;IIIII)V")
	public static void method1515(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt1886 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub4Array2[local4] != null) {
				arg0.anInt1886++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt1886; local22++) {
			@Pc(31) long local31 = Static457.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class75 local41;
			while (local31 != 0L) {
				local41 = Static135.aClass75Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub4_2 == arg0.aClass1_Sub4Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static457.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = Static135.aClass75Array1[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass1_Sub4_2 == arg0.aClass1_Sub4Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt1886 - 1; local93++) {
				arg0.aClass1_Sub4Array2[local93] = arg0.aClass1_Sub4Array2[local93 + 1];
			}
			arg0.anInt1886--;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method1516(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg0.charAt(local12);
			if (local18 <= '\u007f') {
				local10++;
			} else if (local18 > '\u07ff') {
				local10 += 3;
			} else {
				local10 += 2;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	public static void method1517() {
		Static126.anInt2794 = 0;
		Static401.aClass203_47.method4553();
		Static401.aClass203_47.method4551(Static63.aClass1_Sub35_1);
		Static126.anInt2794++;
	}
}
