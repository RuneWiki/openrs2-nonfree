import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	public static int anInt5357;

	@OriginalMember(owner = "client!vk", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray20;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V")
	public static void method4251() {
		for (@Pc(3) int local3 = 0; local3 < Static84.anInt1709; local3++) {
			@Pc(10) int local10 = Static97.anIntArray219[local3];
			@Pc(14) Class12_Sub3_Sub2 local14 = Static257.aClass12_Sub3_Sub2Array1[local10];
			@Pc(18) int local18 = Static101.aClass4_Sub17_Sub1_4.method1874();
			if ((local18 & 0x1) != 0) {
				local18 += Static101.aClass4_Sub17_Sub1_4.method1874() << 8;
			}
			Static95.method1526(local14, local10, local18);
		}
	}

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V")
	public static void method4252() {
		Static142.aClass4_Sub17_Sub1_3.method1905(190);
		Static142.aClass4_Sub17_Sub1_3.method1875(Static44.anInt886);
	}

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
	public static void method4253() {
		aByteArrayArrayArray20 = null;
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V")
	public static void method4254(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub2_Sub21 local10 = Static39.method4121(arg0, 13);
		local10.method4360();
		local10.anInt5492 = arg1;
	}
}
