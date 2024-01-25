import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!kk", name = "Gb", descriptor = "I")
	public static int anInt6174;

	@OriginalMember(owner = "client!kk", name = "Hb", descriptor = "I")
	public static int anInt6175;

	@OriginalMember(owner = "client!kk", name = "Kb", descriptor = "I")
	public static int anInt6177;

	@OriginalMember(owner = "client!kk", name = "jb", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_135 = new Class205(78, 5);

	@OriginalMember(owner = "client!kk", name = "Eb", descriptor = "I")
	public static int anInt6172 = 0;

	@OriginalMember(owner = "client!kk", name = "Ib", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_96 = new Class32("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!kk", name = "Jb", descriptor = "I")
	public static int anInt6176 = -1;

	@OriginalMember(owner = "client!kk", name = "Lb", descriptor = "[I")
	public static final int[] anIntArray1303 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "(I)V")
	public static void method5324() {
		Static141.aBoolean213 = true;
	}

	@OriginalMember(owner = "client!kk", name = "m", descriptor = "(I)V")
	public static void method5331() {
		if (Static82.aBoolean110) {
			return;
		}
		Static285.aBoolean378 = true;
		if (Static207.aBoolean371) {
			Static1.aFloat80 = (int) Static1.aFloat80 - 17 & 0xFFFFFFF0;
		} else {
			Static283.aFloat70 += (-12.0F - Static283.aFloat70) / 2.0F;
		}
		Static82.aBoolean110 = true;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(IIIB)V")
	public static void method5334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 0) {
			Static216.method3597(Static52.aClass11_18);
		}
		if (arg1 == 1) {
			Static216.method3597(Static115.aClass11_41);
		}
		Static372.aClass2_Sub16_Sub2_4.method5328(arg2 + Static28.anInt606);
		Static372.aClass2_Sub16_Sub2_4.method5358(Static48.aClass69_1.method2261(82) ? 1 : 0);
		Static372.aClass2_Sub16_Sub2_4.method5365(Static319.anInt5425 + arg0);
		Static358.anInt2084 = arg0;
		Static60.anInt1159 = arg2;
		Static331.aBoolean415 = false;
		Static237.method3838();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	public static void method5352(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class119 local9 = Static252.aClass119ArrayArray1[arg0][arg1];
		if (local9 != null) {
			Static80.anInt1469 = local9.anInt3055;
			Static90.anInt1727 = local9.anInt3054;
			Static237.anInt4229 = local9.anInt3050;
		}
		Static56.method924();
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(IZ)V")
	public static void method5370(@OriginalArg(1) boolean arg0) {
		Static271.method4164();
		if (Static391.anInt6627 != 30 && Static391.anInt6627 != 25) {
			return;
		}
		Static149.anInt6254++;
		if (Static149.anInt6254 < 50 && !arg0) {
			return;
		}
		Static149.anInt6254 = 0;
		if (!Static55.aBoolean87 && Static88.aClass221_1 != null) {
			Static216.method3597(Static21.aClass11_5);
			try {
				Static88.aClass221_1.method4796(Static372.aClass2_Sub16_Sub2_4.aByteArray112, Static372.aClass2_Sub16_Sub2_4.anInt6145);
				Static372.aClass2_Sub16_Sub2_4.anInt6145 = 0;
			} catch (@Pc(57) IOException local57) {
				Static55.aBoolean87 = true;
			}
		}
		Static271.method4164();
	}
}
