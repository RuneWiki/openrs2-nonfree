import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	public static int anInt10628;

	@OriginalMember(owner = "client!gp", name = "r", descriptor = "F")
	public static float aFloat215;

	@OriginalMember(owner = "client!gp", name = "o", descriptor = "I")
	public static int anInt10633;

	@OriginalMember(owner = "client!gp", name = "l", descriptor = "Lclient!qh;")
	public static Class301 aClass301_9;

	@OriginalMember(owner = "client!gp", name = "p", descriptor = "[Lclient!rda;")
	public static Class4_Sub1[] aClass4_Sub1Array13;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Z)Lclient!de;")
	public static Class77 method8967() {
		try {
			return (Class77) Class.forName("lfa").getDeclaredConstructor().newInstance();
		} catch (@Pc(16) Throwable local16) {
			return new Class77_Sub2();
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(III)V")
	public static void method8970(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static20.method345(arg0)) {
			Static554.method7515(Static397.aClass238ArrayArray2[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)I")
	public static int method8971() {
		return Static181.anInt3401 == 1 ? Static208.anInt3698 : 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!nq;)[I")
	public static int[] method8973(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub41 arg1) {
		@Pc(10) Class5_Sub36 local10 = new Class5_Sub36(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method7324(10);
		local10.method7287(local13[0]);
		local10.method7287(local13[1]);
		local10.method7287(local13[2]);
		local10.method7287(local13[3]);
		@Pc(60) int local60 = 0;
		if (arg0 < 51) {
			return null;
		}
		while (local60 < 10) {
			local10.method7287((int) (Math.random() * 9.9999999E7D));
			local60++;
		}
		local10.method7296((int) (Math.random() * 9.9999999E7D));
		local10.method7305(Static283.aBigInteger1, Static489.aBigInteger5);
		arg1.aClass5_Sub36_Sub2_1.method7313(0, local10.anInt8456, local10.aByteArray89);
		return local13;
	}
}
