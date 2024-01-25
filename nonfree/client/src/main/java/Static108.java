import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!go", name = "g", descriptor = "I")
	public static int anInt2044;

	@OriginalMember(owner = "client!go", name = "j", descriptor = "[Lclient!ij;")
	public static Class77[] aClass77Array2;

	@OriginalMember(owner = "client!go", name = "d", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_17 = new Class26(4);

	@OriginalMember(owner = "client!go", name = "h", descriptor = "I")
	public static int anInt2045 = 0;

	@OriginalMember(owner = "client!go", name = "i", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_19 = new Class16();

	@OriginalMember(owner = "client!go", name = "k", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)Lclient!gm;")
	public static Class84 method1650(@OriginalArg(1) int arg0) {
		@Pc(5) Class26 local5 = Static154.aClass26_25;
		@Pc(14) Class84 local14;
		synchronized (Static154.aClass26_25) {
			local14 = (Class84) Static154.aClass26_25.method332((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static327.aClass144_103.method3896(Static200.method3613(arg0), Static342.method5583(arg0));
		local14 = new Class84();
		local14.anInt2012 = arg0;
		if (local34 != null) {
			local14.method1645(new Class11_Sub25(local34));
		}
		local14.method1642();
		if (local14.aBoolean132) {
			local14.anInt2006 = 0;
			local14.aBoolean137 = false;
		}
		if (!Static81.aBoolean91 && local14.aBoolean125) {
			local14.anIntArray145 = null;
			local14.aStringArray18 = null;
		}
		@Pc(80) Class26 local80 = Static154.aClass26_25;
		synchronized (Static154.aClass26_25) {
			Static154.aClass26_25.method330((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLclient!kh;)Lclient!n;")
	public static Class11_Sub2 method1652(@OriginalArg(1) Class11_Sub25 arg0) {
		arg0.method5185();
		@Pc(13) int local13 = arg0.method5185();
		@Pc(17) Class11_Sub2 local17 = Static9.method115(local13);
		local17.anInt6765 = arg0.method5185();
		@Pc(26) int local26 = arg0.method5185();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method5185();
			local17.method5711(arg0, local34);
		}
		local17.method5708();
		return local17;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IBIII)V")
	public static void method1653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			Static224.method5303(Static73.anIntArrayArray6[arg0], arg1, arg2, arg3);
		} else {
			Static224.method5303(Static73.anIntArrayArray6[arg0], arg3, arg2, arg1);
		}
	}
}
