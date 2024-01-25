import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!pi", name = "P", descriptor = "Lclient!iq;")
	public static Class104 aClass104_135;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	public static int anInt5243 = 0;

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "Lclient!nn;")
	public static final Class140 aClass140_124 = new Class140("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

	@OriginalMember(owner = "client!pi", name = "I", descriptor = "Z")
	public static boolean aBoolean456 = true;

	@OriginalMember(owner = "client!pi", name = "K", descriptor = "[I")
	public static final int[] anIntArray407 = new int[2048];

	@OriginalMember(owner = "client!pi", name = "L", descriptor = "J")
	public static long aLong159 = -1L;

	@OriginalMember(owner = "client!pi", name = "M", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_158 = new Class157(8, 3);

	@OriginalMember(owner = "client!pi", name = "N", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_32 = new Class107(16);

	@OriginalMember(owner = "client!pi", name = "O", descriptor = "[[B")
	public static final byte[][] aByteArrayArray13 = new byte[1000][];

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
	public static int anInt5259 = -1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "([[IIILclient!dr;Z)V")
	public static void method4440(@OriginalArg(0) int[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) boolean arg3) {
		for (@Pc(9) int local9 = 0; local9 < arg1; local9++) {
			@Pc(15) int[][] local15;
			@Pc(27) int local27;
			@Pc(31) int local31;
			if (arg0 == null) {
				local15 = null;
			} else {
				local15 = new int[Static66.anInt1177 + 1][Static12.anInt213 + 1];
				for (local27 = 0; local27 <= Static12.anInt213; local27++) {
					for (local31 = 0; local31 <= Static66.anInt1177; local31++) {
						local15[local31][local27] = Static327.anIntArrayArrayArray12[local9][local31][local27] - arg0[local31][local27];
					}
				}
			}
			local27 = 0;
			local31 = 0;
			if (!arg3) {
				if (Static309.aBoolean544) {
					local27 = 2;
				}
				if (Static134.aBoolean271) {
					local31 = 8;
				}
				if (Static222.anInt6836 != 0) {
					if (local9 == 0 || Static147.anInt3175 >= 96) {
						local31 |= 0x10;
					}
					local27 |= 0x1;
				}
			}
			if (Static309.aBoolean544) {
				local31 |= 0x7;
			}
			@Pc(115) Class105 local115 = arg2.method3691(Static66.anInt1177, Static12.anInt213, Static327.anIntArrayArrayArray12[local9], local15, local27, local31);
			Static81.method1659(local9, local115);
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public static void method4441(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static202.aClass2_Sub9_Sub17_2 != null) {
			Static48.anInt4159 = Static202.aClass2_Sub9_Sub17_2.anInt5172;
		} else {
			Static48.anInt4159 = -1;
		}
		Static284.aClass180_39 = null;
		Static249.anInt5214 = 0;
		Static202.aClass2_Sub9_Sub17_2 = null;
		Static40.aClass68_3 = null;
		Static202.method4232();
		Static202.aClass180_34.method4917();
		Static300.aClass189_8 = null;
		Static86.aClass189_4 = null;
		Static72.aClass189_3 = null;
		Static202.aClass194_2 = null;
		Static112.aClass46_10 = null;
		Static49.anInt819 = -1;
		Static54.aClass189_1 = null;
		Static160.anInt3750 = -1;
		Static256.aClass189_7 = null;
		Static173.aClass189_5 = null;
		Static59.aClass189_2 = null;
		Static214.aClass189_6 = null;
		Static97.method1897();
		Static237.method4313(64, 128);
		Static356.method5689(64, 64);
		Static65.method2536(64);
		Static350.method5656(64);
	}
}
