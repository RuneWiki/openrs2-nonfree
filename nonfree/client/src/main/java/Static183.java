import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!j", name = "C", descriptor = "Lclient!wu;")
	public static Class269 aClass269_3;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "[Lclient!sq;")
	public static Class20_Sub3[] aClass20_Sub3Array5;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_191 = new Class214(105, -1);

	@OriginalMember(owner = "client!j", name = "I", descriptor = "[J")
	public static final long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!j", name = "a", descriptor = "([BI)[B")
	public static byte[] method4173(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(20) byte[] local20 = new byte[arg0.length];
			Static459.method2110(arg0, 0, local20, 0, arg0.length);
			return local20;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
	public static void method4174() {
		for (@Pc(1) int local1 = 0; local1 < 100; local1++) {
			Static145.aBooleanArray15[local1] = true;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZII)I")
	public static int method4175(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static202.aClass163Array2 == null) {
			return 0;
		}
		@Pc(11) int local11 = arg1 >> 7;
		@Pc(15) int local15 = arg0 >> 7;
		if (local11 < 0 || local15 < 0 || Static425.anInt6922 - 1 < local11 || Static251.anInt4072 - 1 < local15) {
			return 0;
		}
		@Pc(48) int local48 = arg2;
		if (arg2 < 3 && (Static357.aByteArrayArrayArray11[1][local11][local15] & 0x2) != 0) {
			local48 = arg2 + 1;
		}
		return Static202.aClass163Array2[local48].va(arg1, arg0);
	}
}
