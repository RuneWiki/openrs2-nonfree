import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wh", name = "l", descriptor = "Lclient!oe;")
	public static final Class181 aClass181_64 = new Class181();

	@OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
	public static int anInt7175 = 999999;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "Lclient!ob;")
	public static final Class179 aClass179_94 = new Class179(35, 2);

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_12 = new Class200("", 11);

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "S")
	public static short aShort98 = 32767;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)I")
	public static int method5872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static222.anIntArrayArray41 == null ? 0 : Static222.anIntArrayArray41[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IZIIJZIZZ)V")
	public static void method5874(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) boolean arg10) {
		if (arg9) {
			Static215.method3371();
			if (Static372.aString64.equals("")) {
				Static443.anInt7125 = 39;
				return;
			}
		}
		@Pc(17) int[] local17 = new int[4];
		for (@Pc(19) int local19 = 0; local19 < 3; local19++) {
			local17[local19] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(36) Class1_Sub5 local36 = new Class1_Sub5(128);
		local36.method5396(10);
		local36.method5393((arg10 ? 4 : 0) | (arg8 ? 1 : 0) | (arg4 ? 2 : 0));
		local36.method5358(arg7);
		local36.method5417(local17[0]);
		local36.method5385(arg1);
		local36.method5417(local17[1]);
		local36.method5393(Static209.anInt3932);
		local36.method5396(arg5);
		local36.method5396(arg6);
		local36.method5417(local17[2]);
		local36.method5393(arg0);
		local36.method5393(arg3);
		local36.method5417(local17[3]);
		local36.method5365(Static398.aBigInteger2, Static84.aBigInteger1);
		@Pc(128) Class1_Sub5 local128 = new Class1_Sub5(366);
		local128.method5385(arg2);
		if (arg9) {
			local128.method5358(Static214.method4406(Static372.aString64));
			try {
				local128.method5358(Long.parseLong(Static329.aString54));
			} catch (@Pc(147) Exception local147) {
				Static443.anInt7125 = 39;
				return;
			}
		}
		@Pc(158) int local158 = 8 - (local128.anInt6475 & 0x7);
		for (@Pc(160) int local160 = 0; local160 < local158; local160++) {
			local128.method5396((int) (Math.random() * 255.0D));
		}
		local128.method5386(local17);
		Static92.aClass1_Sub5_Sub1_1.anInt6475 = 0;
		Static92.aClass1_Sub5_Sub1_1.method5396(arg9 ? Static114.aClass208_12.anInt5814 : Static114.aClass208_9.anInt5814);
		Static92.aClass1_Sub5_Sub1_1.method5393(local128.anInt6475 + local36.anInt6475 + 28);
		Static92.aClass1_Sub5_Sub1_1.method5393(594);
		Static92.aClass1_Sub5_Sub1_1.method5396(Static341.anInt5770);
		Static92.aClass1_Sub5_Sub1_1.method5396(Static337.aClass61_5.anInt1910);
		Static341.method4808(Static92.aClass1_Sub5_Sub1_1);
		Static92.aClass1_Sub5_Sub1_1.method5367(local36.aByteArray89, local36.anInt6475);
		Static92.aClass1_Sub5_Sub1_1.method5367(local128.aByteArray89, local128.anInt6475);
		Static443.anInt7125 = -3;
		Static303.anInt5252 = 0;
		Static146.anInt2806 = 0;
		Static440.anInt7083 = 1;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIB)V")
	public static void method5875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class1_Sub2_Sub6 local16 = Static371.method5808(5, arg1);
		local16.method1778();
		local16.anInt2056 = arg0;
	}
}
