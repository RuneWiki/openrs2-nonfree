import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!sj", name = "U", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array53;

	@OriginalMember(owner = "client!sj", name = "V", descriptor = "Lclient!ue;")
	public static Class226 aClass226_2;

	@OriginalMember(owner = "client!sj", name = "W", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!sj", name = "J", descriptor = "Lclient!ve;")
	public static final Class2_Sub24_Sub2 aClass2_Sub24_Sub2_34 = new Class2_Sub24_Sub2(5000);

	@OriginalMember(owner = "client!sj", name = "N", descriptor = "[I")
	public static final int[] anIntArray511 = new int[50];

	@OriginalMember(owner = "client!sj", name = "O", descriptor = "[I")
	public static final int[] anIntArray512 = new int[2048];

	@OriginalMember(owner = "client!sj", name = "T", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_93 = new Class183(5, 3);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([I[[BIBI[[B[B[I)I")
	public static int method5185(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(9) int local9 = arg0[arg3];
		@Pc(15) int local15 = local9 + arg6[arg3];
		@Pc(19) int local19 = arg0[arg2];
		@Pc(25) int local25 = local19 + arg6[arg2];
		@Pc(27) int local27 = local9;
		if (local9 < local19) {
			local27 = local19;
		}
		@Pc(38) int local38 = local15;
		if (local15 > local25) {
			local38 = local25;
		}
		@Pc(53) int local53 = arg5[arg3] & 0xFF;
		if ((arg5[arg2] & 0xFF) < local53) {
			local53 = arg5[arg2] & 0xFF;
		}
		@Pc(70) byte[] local70 = arg4[arg3];
		@Pc(74) byte[] local74 = arg1[arg2];
		@Pc(78) int local78 = local27 - local9;
		@Pc(83) int local83 = local27 - local19;
		for (@Pc(85) int local85 = local27; local85 < local38; local85++) {
			@Pc(102) int local102 = local74[local83++] + local70[local78++];
			if (local53 > local102) {
				local53 = local102;
			}
		}
		return -local53;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!eg;ILclient!g;)V")
	public static void method5186(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class83 arg1) {
		Static189.aClass83_16 = arg1;
		Static194.anInterface3_5 = arg0;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([BB)[B")
	public static byte[] method5187(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub24 local8 = new Class2_Sub24(arg0);
		@Pc(17) int local17 = local8.method5732();
		@Pc(21) int local21 = local8.method5776();
		if (local21 < 0 || Static120.anInt2647 != 0 && local21 > Static120.anInt2647) {
			throw new RuntimeException();
		} else if (local17 == 0) {
			@Pc(86) byte[] local86 = new byte[local21];
			local8.method5756(local86, local21);
			return local86;
		} else {
			@Pc(41) int local41 = local8.method5776();
			if (local41 < 0 || Static120.anInt2647 != 0 && local41 > Static120.anInt2647) {
				throw new RuntimeException();
			}
			@Pc(62) byte[] local62 = new byte[local41];
			if (local17 == 1) {
				Static103.method1840(local62, local41, arg0, local21);
			} else {
				Static136.aClass69_2.method1524(local8, local62);
			}
			return local62;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(BII)B")
	public static byte method5188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
