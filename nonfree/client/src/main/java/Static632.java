import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!vh", name = "s", descriptor = "Z")
	public static boolean aBoolean877 = false;

	@OriginalMember(owner = "client!vh", name = "z", descriptor = "[I")
	public static final int[] anIntArray560 = new int[1];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BZ)V")
	public static void method8528(@OriginalArg(1) boolean arg0) {
		Static250.method3863();
		if (!Static134.method1808(Static173.anInt3397)) {
			return;
		}
		Static292.anInt5664++;
		if (Static292.anInt5664 < 50 && !arg0) {
			return;
		}
		Static292.anInt5664 = 0;
		if (!Static419.aBoolean638 && Static12.aClass244_1 != null) {
			@Pc(37) Class5_Sub21 local37 = Static64.method905(Static263.aClass49_1, Static5.aClass305_3);
			Static495.method7092(local37);
			try {
				Static24.method6162();
			} catch (@Pc(44) IOException local44) {
				Static419.aBoolean638 = true;
			}
		}
		Static250.method3863();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!uc;I)V")
	public static void method8529(@OriginalArg(0) int arg0, @OriginalArg(1) Class347 arg1) {
		if (Static619.aBoolean858) {
			arg0 = 0;
			Static619.aBoolean858 = false;
		}
		if (Static368.aClass347_2 != null && Static368.aClass347_2.method8096(arg1)) {
			return;
		}
		Static368.aClass347_2 = arg1;
		Static56.aLong29 = Static547.method7619();
		Static63.anInt977 = arg0;
		Static404.anInt7177 = arg0;
		if (Static404.anInt7177 != 0) {
			Static527.aFloat188 = Static17.aFloat1;
			Static226.aFloat202 = Static360.aFloat123;
			Static246.aFloat93 = Static542.aFloat122;
			Static667.aFloat214 = Static349.aFloat121;
			Static189.anInt3684 = Static146.anInt2996;
			Static484.aClass57_4 = Static282.aClass57_1;
			Static154.anInt3150 = Static390.anInt6936;
			Static2.anInt7 = Static149.anInt3071;
			Static376.aFloat213 = Static416.aFloat143;
			Static466.aFloat163 = Static176.aFloat86;
			return;
		}
		Static489.method7020();
	}
}
