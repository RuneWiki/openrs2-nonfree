import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
	public static int anInt4829 = 0;

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(IILclient!fha;B)V")
	public static void method4418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14_Sub1_Sub1_Sub3_Sub1 arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static655.method4110(local6, 0, local6.length, arg0);
		Static440.method6531(arg1, arg2, local6);
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(B)V")
	public static void method4419() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static274.aBooleanArray60[local7] = false;
		}
		Static229.anInt3965 = -1;
		Static467.anInt7868 = -1;
		Static609.anInt9978 = -1;
		Static394.anInt6873 = -1;
		Static584.anInt9543 = 1;
		Static87.anInt1434 = 0;
		Static315.anInt5510 = 0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Lclient!wu;ZII)Lclient!av;")
	public static Class5_Sub4_Sub1 method4421(@OriginalArg(0) Class384 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class5_Sub12 local14 = new Class5_Sub12(arg0.method8885(arg2, arg1));
		@Pc(45) Class5_Sub4_Sub1 local45 = new Class5_Sub4_Sub1(arg1, local14.method8617(), local14.method8617(), local14.method8623(), local14.method8623(), local14.method8645() == 1, local14.method8645(), local14.method8645());
		@Pc(49) int local49 = local14.method8645();
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local45.aClass306_5.method7303(new Class5_Sub48(local14.method8645(), local14.method8631(), local14.method8631(), local14.method8631(), local14.method8631(), local14.method8631(), local14.method8631(), local14.method8631(), local14.method8631()));
		}
		local45.method540();
		return local45;
	}
}
