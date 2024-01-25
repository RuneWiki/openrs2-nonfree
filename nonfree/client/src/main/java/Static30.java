import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZIZIILjava/lang/String;JIZZLjava/lang/String;I)V")
	public static void method395(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) String arg9, @OriginalArg(11) int arg10) {
		if (arg1) {
			Static173.method2510();
			if (Static189.aString54.equals("")) {
				Static179.anInt7441 = 39;
				return;
			}
		}
		@Pc(21) int[] local21 = new int[4];
		for (@Pc(23) int local23 = 0; local23 < 3; local23++) {
			local21[local23] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(41) Class7_Sub14 local41 = new Class7_Sub14(128);
		local41.method3970(10);
		local41.method3993((arg8 ? 4 : 0) | (arg7 ? 1 : 0) | (arg0 ? 2 : 0));
		local41.method3934(arg5);
		local41.method3933(local21[0]);
		local41.method3947(arg4);
		local41.method3933(local21[1]);
		local41.method3993(Static274.anInt4622);
		local41.method3970(arg10);
		local41.method3970(arg6);
		local41.method3933(local21[2]);
		local41.method3993(arg3);
		local41.method3993(arg2);
		local41.method3933(local21[3]);
		local41.method3936(Static257.aBigInteger2, Static51.aBigInteger1);
		@Pc(137) Class7_Sub14 local137 = new Class7_Sub14(366);
		local137.method3947(arg9);
		if (arg1) {
			local137.method3934(Static301.method4015(Static189.aString54));
			try {
				local137.method3934(Long.parseLong(Static133.aString26));
			} catch (@Pc(158) Exception local158) {
				Static179.anInt7441 = 39;
				return;
			}
		}
		@Pc(169) int local169 = 8 - (local137.anInt4989 & 0x7);
		for (@Pc(171) int local171 = 0; local171 < local169; local171++) {
			local137.method3970((int) (Math.random() * 255.0D));
		}
		local137.method3982(local21);
		Static255.aClass7_Sub14_Sub1_2.anInt4989 = 0;
		Static255.aClass7_Sub14_Sub1_2.method3970(arg1 ? Class22_Sub7.aClass188_12.anInt5048 : Class22_Sub7.aClass188_9.anInt5048);
		Static255.aClass7_Sub14_Sub1_2.method3993(local137.anInt4989 + local41.anInt4989 + 28);
		Static255.aClass7_Sub14_Sub1_2.method3993(595);
		Static255.aClass7_Sub14_Sub1_2.method3970(Static5.anInt20);
		Static255.aClass7_Sub14_Sub1_2.method3970(Static191.aClass137_3.anInt3868);
		Static123.method2017(Static255.aClass7_Sub14_Sub1_2);
		Static255.aClass7_Sub14_Sub1_2.method3952(local41.anInt4989, local41.aByteArray75);
		Static255.aClass7_Sub14_Sub1_2.method3952(local137.anInt4989, local137.aByteArray75);
		Static179.anInt7441 = -3;
		Static419.anInt6675 = 0;
		Static364.anInt2000 = 0;
		Static196.anInt3465 = 1;
	}
}
