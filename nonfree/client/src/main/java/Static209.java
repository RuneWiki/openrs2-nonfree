import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[100];

	@OriginalMember(owner = "client!haa", name = "c", descriptor = "[B")
	public static final byte[] aByteArray29 = new byte[2048];

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method2989(@OriginalArg(0) Class143 arg0) {
		Static429.aClass176Array1 = new Class176[Static596.anIntArray547.length];
		for (@Pc(9) int local9 = 0; local9 < Static596.anIntArray547.length; local9++) {
			@Pc(14) int local14 = Static596.anIntArray547[local9];
			@Pc(19) Class198 local19 = Static249.method3522(Static108.aClass50_31, local14);
			@Pc(27) Class72 local27 = arg0.method6194(local19, Static684.method7229(Static663.aClass50_187, local14));
			Static429.aClass176Array1[local9] = new Class176(local27, local19);
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)[Lclient!kq;")
	public static Class208[] method2990() {
		return new Class208[] { Static304.aClass208_1, Static304.aClass208_2, Static304.aClass208_3, Static304.aClass208_4, Static304.aClass208_5, Static304.aClass208_6, Static304.aClass208_7, Static304.aClass208_8, Static304.aClass208_9, Static304.aClass208_10, Static304.aClass208_11, Static304.aClass208_12 };
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)I")
	public static int method2991(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = arg0 - 1;
		@Pc(18) int local18 = local8 | local8 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}
}
