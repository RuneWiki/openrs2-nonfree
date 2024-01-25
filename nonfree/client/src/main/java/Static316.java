import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static316 {

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(I)Z")
	public static boolean method4370() {
		Static673.aBoolean800 = true;
		Static209.anInt3391++;
		return true;
	}

	@OriginalMember(owner = "client!kka", name = "g", descriptor = "(I)Lclient!uea;")
	public static Class4_Sub48 method4373() {
		return Static294.anInt4653 == 0 ? new Class4_Sub48() : Static458.aClass4_Sub48Array1[--Static294.anInt4653];
	}

	@OriginalMember(owner = "client!kka", name = "a", descriptor = "(III)V")
	public static void method4374(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class4_Sub5_Sub11 local9 = Static652.method8695((long) arg0, 5);
		local9.method3955();
		local9.anInt4427 = arg1;
	}
}
