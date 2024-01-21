import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "[Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4[] aClass2_Sub1_Sub7_Sub4Array11;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "Lclient!pe;")
	public static Class13 aClass13_38;

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1220 = Static158.method3034("Please wait )2 attempting to reestablish)3");

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public static int anInt4404 = -1;

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1222 = Static158.method3034("Bad session id)3");

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1221 = aClass60_1222;

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "I")
	public static int anInt4408 = -1;

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
	public static int anInt4410 = 0;

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1223 = aClass60_1220;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIBI)I")
	public static int method3393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 >> 7;
		@Pc(16) int local16 = arg1 >> 7;
		if (local16 < 0 || local12 < 0 || local16 > 103 || local12 > 103) {
			return 0;
		}
		@Pc(36) int local36 = arg0;
		if (arg0 < 3 && (Static147.aByteArrayArrayArray36[1][local16][local12] & 0x2) == 2) {
			local36 = arg0 + 1;
		}
		@Pc(59) int local59 = arg2 & 0x7F;
		@Pc(63) int local63 = arg1 & 0x7F;
		@Pc(90) int local90 = Static32.anIntArrayArrayArray4[local36][local16 + 1][local12] * local63 + (128 - local63) * Static32.anIntArrayArrayArray4[local36][local16][local12] >> 7;
		@Pc(121) int local121 = Static32.anIntArrayArrayArray4[local36][local16 + 1][local12 + 1] * local63 + Static32.anIntArrayArrayArray4[local36][local16][local12 + 1] * (128 - local63) >> 7;
		return local90 * (128 - local59) + local121 * local59 >> 7;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)Lclient!ob;")
	public static Class60 method3394(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(29) long local29 = arg0;
			@Pc(31) int local31 = 0;
			while (local29 != 0L) {
				local31++;
				local29 /= 37L;
			}
			@Pc(44) byte[] local44 = new byte[local31];
			while (arg0 != 0L) {
				@Pc(47) long local47 = arg0;
				arg0 /= 37L;
				local31--;
				local44[local31] = Static35.aByteArray36[(int) (local47 - arg0 * 37L)];
			}
			@Pc(74) Class60 local74 = new Class60();
			local74.aByteArray39 = local44;
			local74.anInt3466 = local44.length;
			return local74;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(B)Lclient!kc;")
	public static Class2_Sub1_Sub7_Sub4 method3395() {
		@Pc(18) Class2_Sub1_Sub7_Sub4 local18 = new Class2_Sub1_Sub7_Sub4();
		local18.anInt2693 = Static30.anIntArray96[0];
		local18.anInt2696 = Static93.anInt2723;
		local18.anInt2691 = Static103.anIntArray342[0];
		local18.anInt2694 = Static178.anIntArray468[0];
		local18.anInt2692 = Static175.anInt4257;
		local18.anInt2695 = Static30.anIntArray95[0];
		@Pc(50) int local50 = local18.anInt2694 * local18.anInt2691;
		local18.anIntArray310 = new int[local50];
		@Pc(58) byte[] local58 = Static197.aByteArrayArray10[0];
		for (@Pc(60) int local60 = 0; local60 < local50; local60++) {
			local18.anIntArray310[local60] = Static16.anIntArray43[local58[local60] & 0xFF];
		}
		Static81.method1910();
		return local18;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(B)V")
	public static void method3396() {
		while (true) {
			@Pc(9) Class67 local9 = Static99.aClass67_5;
			@Pc(16) Class2_Sub18 local16;
			synchronized (Static99.aClass67_5) {
				local16 = (Class2_Sub18) Static127.aClass67_8.method2842();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass13_Sub1_22.method541((int) local16.aLong151, local16.aByteArray43, false, local16.aClass69_4);
		}
	}
}
