import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IILclient!gia;II)Lclient!to;")
	public static Class245_Sub2_Sub1 method4817(@OriginalArg(0) int arg0, @OriginalArg(2) Class67_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1.aBoolean327 || Static28.method398(arg2) && Static28.method398(arg3)) {
			return new Class245_Sub2_Sub1(arg1, 3553, arg0, arg2, arg3);
		} else if (arg1.aBoolean308) {
			return new Class245_Sub2_Sub1(arg1, 34037, arg0, arg2, arg3);
		} else {
			return new Class245_Sub2_Sub1(arg1, arg0, arg2, arg3, Static60.method735(arg2), Static60.method735(arg3));
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ZIII)I")
	public static int method4820(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub51 local14 = Static321.method5223(arg0, arg1);
		if (local14 == null) {
			return -1;
		} else if (arg2 >= 0 && local14.anIntArray577.length > arg2) {
			return local14.anIntArray577[arg2];
		} else {
			return -1;
		}
	}
}
