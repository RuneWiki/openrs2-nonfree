import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static354 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!uu;")
	public static final Class359 aClass359_5 = new Class359();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!ib;)Lclient!wn;")
	public static Class125_Sub4 method5309(@OriginalArg(1) Class5_Sub23 arg0) {
		return new Class125_Sub4(arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8510(), arg0.method8529());
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)Z")
	public static boolean method5310() {
		if (Static107.anInt1746 == 3) {
			return Static566.anInt9503 == 0 && Static222.anInt3623 == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!df;)V")
	public static void method5312(@OriginalArg(0) Class8_Sub1 arg0) {
		Static205.aClass57_5.H(arg0.anInt10355, arg0.anInt10357 + (arg0.method8900(-2226) >> 1), arg0.anInt10363, Static265.anIntArray255);
		arg0.anInt10358 = Static265.anIntArray255[0];
		arg0.anInt10360 = Static265.anIntArray255[1];
		arg0.anInt10361 = Static265.anIntArray255[2];
	}
}
