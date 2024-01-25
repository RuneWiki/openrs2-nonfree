import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "()V")
	public static void method4988() {
		for (@Pc(1) int local1 = 0; local1 < Static518.anInt8629; local1++) {
			@Pc(6) Class28_Sub1_Sub4 local6 = Static213.aClass28_Sub1_Sub4Array4[local1];
			Static327.method5081(local6, true);
			Static213.aClass28_Sub1_Sub4Array4[local1] = null;
		}
		Static518.anInt8629 = 0;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)V")
	public static void method4989() {
		@Pc(12) Class5_Sub21 local12 = Static64.method905(Static263.aClass49_1, Static570.aClass305_90);
		Static495.method7092(local12);
		for (@Pc(24) Class5_Sub39 local24 = (Class5_Sub39) Static452.aClass300_33.method7182(); local24 != null; local24 = (Class5_Sub39) Static452.aClass300_33.method7192()) {
			if (!local24.method9048()) {
				local24 = (Class5_Sub39) Static452.aClass300_33.method7182();
				if (local24 == null) {
					break;
				}
			}
			if (local24.anInt6236 == 0) {
				Static68.method931(local24, true, true);
			}
		}
		if (Static244.aClass345_7 != null) {
			Static211.method3351(Static244.aClass345_7);
			Static244.aClass345_7 = null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIIB)Lclient!tea;")
	public static Class57 method4990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 32147369L ^ (long) arg2 * 986053L ^ (long) arg0 * 97549L ^ (long) arg1 * 67481L ^ (long) arg3 * 475427L ^ (long) arg4 * 76724863L;
		@Pc(39) Class57 local39 = (Class57) Static97.aClass340_9.method7999(local33);
		if (local39 == null) {
			local39 = Static367.aClass65_11.method6893(arg1, arg0, arg3, arg2, arg5, arg4);
			Static97.aClass340_9.method7986(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
