import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "[B")
	public static final byte[] aByteArray79 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "Lclient!cl;")
	public static final Class32 aClass32_10 = new Class32();

	@OriginalMember(owner = "client!sa", name = "W", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_303 = new Class159("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!sa", name = "Y", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray33 = new int[2][][];

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "Ljava/lang/String;")
	public static String aString57 = null;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZZLjava/lang/Object;)[B")
	public static byte[] method4822(@OriginalArg(0) boolean arg0, @OriginalArg(2) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static145.method2978(local13) : local13;
		} else if (arg1 instanceof Class88) {
			@Pc(27) Class88 local27 = (Class88) arg1;
			return local27.method2545();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)Lclient!jl;")
	public static Class8_Sub3 method4824(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class8_Sub3 local14 = local7.aClass8_Sub3_1;
			local7.aClass8_Sub3_1 = null;
			return local14;
		}
	}
}
