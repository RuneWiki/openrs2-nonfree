import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!baa", name = "y", descriptor = "Lclient!jw;")
	public static final Class184 aClass184_6 = new Class184(8, 1);

	@OriginalMember(owner = "client!baa", name = "z", descriptor = "[I")
	public static final int[] anIntArray300 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BIIZ)I")
	public static int method3671(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class2_Sub22 local8 = Static284.method8371(arg2, arg1);
		if (local8 == null) {
			return -1;
		} else if (arg0 >= 0 && local8.anIntArray219.length > arg0) {
			return local8.anIntArray219[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "(I)I")
	public static int method3672() {
		if (Static642.aBoolean757) {
			return 6;
		} else if (Static220.aClass2_Sub5_Sub20_17 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static220.aClass2_Sub5_Sub20_17.anInt10077;
			if (Static20.method474(local14)) {
				return 1;
			} else if (Static565.method7812(local14)) {
				return 2;
			} else if (Static542.method7600(local14)) {
				return 3;
			} else if (Static539.method7533(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZLclient!ak;)V")
	public static void method3674(@OriginalArg(1) Class11_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(11) Class2_Sub31 local11 = (Class2_Sub31) Static634.aClass222_44.method5468((long) arg0.anInt3246);
		if (local11 == null) {
			Static541.method7595(arg0.aByte124, null, null, arg0, 0, arg0.anIntArray233[0], arg0.anIntArray232[0]);
		} else {
			local11.method4826();
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ILclient!vk;Ljava/lang/Object;)V")
	public static void method3675(@OriginalArg(1) Class359 arg0, @OriginalArg(2) Object arg1) {
		if (arg0.anEventQueue1 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 50 && arg0.anEventQueue1.peekEvent() != null; local11++) {
			Static57.method1062(1L);
		}
		try {
			if (arg1 != null) {
				arg0.anEventQueue1.postEvent(new ActionEvent(arg1, 1001, "dummy"));
			}
		} catch (@Pc(43) Exception local43) {
		}
	}
}
