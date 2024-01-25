import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
	public static int anInt10489;

	@OriginalMember(owner = "client!pca", name = "j", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_229 = new Class200(49, 2);

	@OriginalMember(owner = "client!pca", name = "r", descriptor = "Lclient!vda;")
	public static Class2_Sub7_Sub20 aClass2_Sub7_Sub20_3 = null;

	@OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
	public static int anInt10488 = 0;

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "([Ljava/lang/Object;IIB[J)V")
	public static void method8910(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(17) int local17 = (arg2 + arg1) / 2;
		@Pc(19) int local19 = arg2;
		@Pc(23) long local23 = arg3[local17];
		arg3[local17] = arg3[arg1];
		arg3[arg1] = local23;
		@Pc(37) Object local37 = arg0[local17];
		arg0[local17] = arg0[arg1];
		arg0[arg1] = local37;
		@Pc(55) int local55 = local23 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg2; local57 < arg1; local57++) {
			if (local23 + (long) (local57 & local55) > arg3[local57]) {
				@Pc(78) long local78 = arg3[local57];
				arg3[local57] = arg3[local19];
				arg3[local19] = local78;
				@Pc(92) Object local92 = arg0[local57];
				arg0[local57] = arg0[local19];
				arg0[local19++] = local92;
			}
		}
		arg3[arg1] = arg3[local19];
		arg3[local19] = local23;
		arg0[arg1] = arg0[local19];
		arg0[local19] = local37;
		method8910(arg0, local19 - 1, arg2, arg3);
		method8910(arg0, arg1, local19 + 1, arg3);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Z")
	public static boolean method8912() {
		try {
			return Static304.method4769();
		} catch (@Pc(14) IOException local14) {
			Static271.method4448();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(79) String local79 = "T2 - " + (Static346.aClass200_117 == null ? -1 : Static346.aClass200_117.method4622()) + "," + (Static606.aClass200_222 == null ? -1 : Static606.aClass200_222.method4622()) + "," + (Static533.aClass200_198 == null ? -1 : Static533.aClass200_198.method4622()) + " - " + Static245.anInt4755 + "," + (Static406.anInt6899 + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0]) + "," + (Static338.anInt5885 + Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0]) + " - ";
			for (@Pc(81) int local81 = 0; local81 < Static245.anInt4755 && local81 < 50; local81++) {
				local79 = local79 + Static327.aClass2_Sub17_Sub1_1.aByteArray26[local81] + ",";
			}
			Static25.method7457(local19, local79);
			Static448.method6402(false);
			return true;
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILclient!lea;)V")
	public static void method8914(@OriginalArg(1) Class2_Sub11 arg0) {
		if (arg0.aClass2_Sub14_6 != null) {
			arg0.aClass2_Sub14_6.anInt2195 = 0;
		}
		arg0.aBoolean501 = false;
		for (@Pc(24) Class2_Sub11 local24 = arg0.method6156(); local24 != null; local24 = arg0.method6157()) {
			method8914(local24);
		}
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(BI)I")
	public static int method8915(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}
}
