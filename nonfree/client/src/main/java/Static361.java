import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!nu", name = "S", descriptor = "F")
	public static float aFloat197;

	@OriginalMember(owner = "client!nu", name = "K", descriptor = "Z")
	public static final boolean aBoolean500 = false;

	@OriginalMember(owner = "client!nu", name = "c", descriptor = "(II)Lclient!lt;")
	public static Class1_Sub8 method5833(@OriginalArg(0) int arg0) {
		@Pc(7) Class136[] local7 = Class34.aClass136Array1;
		synchronized (Class34.aClass136Array1) {
			@Pc(37) Class1_Sub8 local37;
			if (arg0 >= Class34.aClass136Array1.length || Class34.aClass136Array1[arg0].method3283()) {
				local37 = new Class1_Sub8();
				local37.aClass1_Sub9Array1 = new Class1_Sub9[arg0];
				for (@Pc(59) int local59 = 0; local59 < arg0; local59++) {
					local37.aClass1_Sub9Array1[local59] = new Class1_Sub9();
				}
			} else {
				local37 = (Class1_Sub8) Class34.aClass136Array1[arg0].method3287();
				local37.method8252();
				@Pc(44) int local44 = Static212.anIntArray191[arg0]--;
			}
			return local37;
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method5835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class289 local13 = local7.aClass289_1; local13 != null; local13 = local13.aClass289_3) {
			@Pc(17) Class1_Sub4_Sub2 local17 = local13.aClass1_Sub4_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort121 == arg1 && local17.aShort120 == arg2) {
				Static466.method7865(local17, false);
				return;
			}
		}
	}
}
