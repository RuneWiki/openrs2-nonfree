import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!uja", name = "d", descriptor = "[Lclient!ho;")
	public static Class9[] aClass9Array165;

	@OriginalMember(owner = "client!uja", name = "b", descriptor = "I")
	public static int anInt9842 = 0;

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ZII)V")
	public static void method8304(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class6_Sub6 local10 = Static249.method3626(arg0, arg1);
		if (local10 != null) {
			for (@Pc(19) int local19 = 0; local19 < local10.anIntArray55.length; local19++) {
				local10.anIntArray55[local19] = -1;
				local10.anIntArray54[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(I)V")
	public static void method8306() {
		Static170.method2435();
		Static95.aClass25_1 = null;
		Static602.aClass25_4 = null;
		Static83.aClass132_3 = null;
		Static459.aClass25_2 = null;
		Static128.aClass283ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(ILclient!iaa;)[I")
	public static int[] method8307(@OriginalArg(1) Class6_Sub26 arg0) {
		@Pc(10) Class6_Sub23 local10 = new Class6_Sub23(518);
		@Pc(13) int[] local13 = new int[4];
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			local13[local15] = (int) (Math.random() * 9.9999999E7D);
		}
		local10.method8366(10);
		local10.method8364(local13[0]);
		local10.method8364(local13[1]);
		local10.method8364(local13[2]);
		local10.method8364(local13[3]);
		for (@Pc(62) int local62 = 0; local62 < 10; local62++) {
			local10.method8364((int) (Math.random() * 9.9999999E7D));
		}
		local10.method8347((int) (Math.random() * 9.9999999E7D));
		local10.method8371(Static443.aBigInteger2, Static11.aBigInteger1);
		arg0.aClass6_Sub23_Sub1_2.method8358(local10.aByteArray101, 0, local10.anInt9901);
		return local13;
	}
}
