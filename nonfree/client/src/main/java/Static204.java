import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hs", name = "I", descriptor = "Lclient!kga;")
	public static Class196 aClass196_6;

	@OriginalMember(owner = "client!hs", name = "L", descriptor = "Lclient!bi;")
	public static Class31 aClass31_43;

	@OriginalMember(owner = "client!hs", name = "G", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("eb51df29ed25ea9e1e3e44fb194556a04b5298b4f920fd5276f02b9629db03d9d951bcead868b60af74747a376e3154e1ad17095b8acd03ecb0f70c1653a03cb", 16);

	@OriginalMember(owner = "client!hs", name = "J", descriptor = "Lclient!db;")
	public static final Class64 aClass64_171 = new Class64(44, -1);

	@OriginalMember(owner = "client!hs", name = "K", descriptor = "I")
	public static int anInt4280 = 0;

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)I")
	public static int method3627(@OriginalArg(0) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
