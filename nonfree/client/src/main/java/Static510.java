import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public static int anInt8857 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZI)I")
	public static int method7638(@OriginalArg(0) boolean arg0) {
		@Pc(5) int local5 = Static18.anInt243;
		if (local5 == 0) {
			return arg0 ? 0 : Static673.anInt10975;
		} else if (local5 == 1) {
			return Static673.anInt10975;
		} else if (local5 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
	public static void method7639() {
		Static541.aClass125_36.method2628();
		Static4.aClass269_1.method6492();
		Static676.aClass269_181.method6492();
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(II)I")
	public static int method7641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static690.aByteArrayArray33 == null ? 0 : Static690.aByteArrayArray33[arg0][arg1] & 0xFF;
	}
}
