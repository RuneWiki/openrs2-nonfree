import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static397 {

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	public static int anInt7100;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array12;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_17 = new Class60(13, 4);

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "Lclient!ao;")
	public static Class12 aClass12_345 = null;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray53 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "[S")
	public static final short[] aShortArray113 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
	public static int anInt7107 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BIIII[BI)V")
	public static void method5464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(25) int local25 = -arg7; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg1++;
				arg2[local33] += arg6[arg5++];
				@Pc(45) int local45 = arg1++;
				arg2[local45] += arg6[arg5++];
				@Pc(57) int local57 = arg1++;
				arg2[local57] += arg6[arg5++];
				@Pc(69) int local69 = arg1++;
				arg2[local69] += arg6[arg5++];
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local33 = arg1++;
				arg2[local33] += arg6[arg5++];
			}
			arg5 += arg0;
			arg1 += arg3;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I")
	public static int method5465(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static89.anIntArray81[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
	public static void method5466() {
		Static84.method4897(false);
		if (Static322.anInt4034 >= 0 && Static322.anInt4034 != 0) {
			Static375.method5899(Static322.anInt4034);
			Static322.anInt4034 = -1;
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLclient!ui;I)V")
	public static void method5468(@OriginalArg(1) Class241 arg0, @OriginalArg(2) int arg1) {
		if (Static210.aBoolean305) {
			arg1 = 0;
			Static210.aBoolean305 = false;
		}
		if (Static239.aClass241_2 != null && Static239.aClass241_2.method5498(arg0)) {
			return;
		}
		Static239.aClass241_2 = arg0;
		Static329.aLong172 = Static107.method1707();
		Static434.anInt7559 = arg1;
		Static214.anInt6455 = arg1;
		if (Static214.anInt6455 == 0) {
			Static245.method3551();
			return;
		}
		Static1.aFloat1 = Static71.aFloat20;
		Static33.aFloat8 = Static444.aFloat125;
		Static145.aFloat38 = Static241.aFloat74;
		Static133.aFloat30 = Static383.aFloat64;
		Static433.aClass89_6 = Static402.aClass89_5;
		Static358.anInt6541 = Static114.anInt2191;
		Static411.anInt7231 = Static65.anInt1188;
		Static193.aFloat71 = Static138.aFloat122;
		Static45.aFloat10 = Static250.aFloat75;
		Static243.anInt4258 = Static15.anInt285;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZILjava/awt/Component;)Lclient!br;")
	public static Class32 method5469(@OriginalArg(2) Component arg0) {
		return new Class32_Sub1(arg0, true);
	}
}
