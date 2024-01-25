import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!qe", name = "c", descriptor = "F")
	public static float aFloat146;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "[I")
	public static final int[] anIntArray536 = new int[8];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ig;ZZ)V")
	public static void method6239(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean738 = arg1;
		if (Static268.aBoolean293) {
			Static602.aClass358Array1[Static602.aClass358Array1.length - 1].method8051(arg0);
		} else {
			Static321.method4297(arg0, Static226.aClass2_Sub24Array38);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method6240(@OriginalArg(0) int arg0) {
		@Pc(14) Class2_Sub2_Sub4 local14 = Static566.method7763(arg0, 10);
		local14.method669();
	}
}
