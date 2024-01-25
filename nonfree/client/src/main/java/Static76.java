import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method1511() {
		if (!Static186.aBoolean202) {
			return;
		}
		while (true) {
			while (Static260.aClass91_Sub1Array1.length > Static452.anInt7260) {
				@Pc(23) Class91_Sub1 local23 = Static260.aClass91_Sub1Array1[Static452.anInt7260];
				if (local23 != null && local23.anInt2665 == -1) {
					if (Static361.aClass1_Sub39_2 == null) {
						Static361.aClass1_Sub39_2 = Static9.aClass69_3.method1878(local23.aString21);
					}
					@Pc(45) int local45 = Static361.aClass1_Sub39_2.anInt6016;
					if (local45 == -1) {
						return;
					}
					Static361.aClass1_Sub39_2 = null;
					Static452.anInt7260++;
					local23.anInt2665 = local45;
				} else {
					Static452.anInt7260++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILjava/awt/Canvas;ILclient!ga;Lclient!od;)Lclient!ya;")
	public static Class39 method1513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2, @OriginalArg(4) Interface4 arg3, @OriginalArg(5) Class180 arg4) {
		return new Class39_Sub2(arg1, arg2, arg3, arg0, arg4);
	}
}
