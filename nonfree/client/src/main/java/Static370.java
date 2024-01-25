import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!sq", name = "c", descriptor = "[F")
	public static final float[] aFloatArray28 = new float[16];

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_16 = new Class98(7, 0, 1, 1);

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "Lclient!hk;")
	public static Class4_Sub12_Sub2 aClass4_Sub12_Sub2_3 = new Class4_Sub12_Sub2(8192);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ILclient!fs;BI)Lclient!jq;")
	public static Class122 method4948(@OriginalArg(1) Class76 arg0, @OriginalArg(3) int arg1) {
		@Pc(11) byte[] local11 = arg0.method2104(0, arg1);
		return local11 == null ? null : new Class122(local11);
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
	public static int method4949(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
