import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "[I")
	public static int[] anIntArray173;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "[B")
	public static final byte[] aByteArray9 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!ae;")
	public static Class4 aClass4_7 = null;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
	public static int anInt818 = 100;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!kj;BLclient!kj;)V")
	public static void method702(@OriginalArg(0) Class2_Sub10 arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg1.aClass2_Sub10_54 != null) {
			arg1.method5572();
		}
		arg1.aClass2_Sub10_54 = arg0;
		arg1.aClass2_Sub10_53 = arg0.aClass2_Sub10_53;
		arg1.aClass2_Sub10_54.aClass2_Sub10_53 = arg1;
		arg1.aClass2_Sub10_53.aClass2_Sub10_54 = arg1;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)I")
	public static int method703(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[S)[S")
	public static short[] method704(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static399.method2485(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V")
	public static void method705(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg0, 5);
		local8.method859();
	}
}
