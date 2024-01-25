import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "I")
	public static int anInt5217;

	@OriginalMember(owner = "client!lda", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray11;

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "Lclient!bt;")
	public static Class34 aClass34_72;

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "Z")
	public static boolean aBoolean403 = false;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(III)Z")
	public static boolean method4613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static15.method1581(arg0, arg1) || Static425.method5897(arg1, arg0);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!lja;Lclient!kl;B)Lclient!uea;")
	public static Class4_Sub48 method4615(@OriginalArg(0) Class216 arg0, @OriginalArg(1) Class196 arg1) {
		@Pc(13) Class4_Sub48 local13 = Static316.method4373();
		local13.anInt9240 = arg0.anInt5284;
		local13.aClass216_139 = arg0;
		if (local13.anInt9240 == -1) {
			local13.aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(260);
		} else if (local13.anInt9240 == -2) {
			local13.aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(10000);
		} else if (local13.anInt9240 <= 18) {
			local13.aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(20);
		} else if (local13.anInt9240 > 98) {
			local13.aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(260);
		} else {
			local13.aClass4_Sub11_Sub1_2 = new Class4_Sub11_Sub1(100);
		}
		local13.aClass4_Sub11_Sub1_2.method987(arg1);
		local13.aClass4_Sub11_Sub1_2.method996(local13.aClass216_139.method4670());
		local13.anInt9241 = 0;
		return local13;
	}
}
