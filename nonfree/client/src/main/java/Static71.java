import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cp", name = "c", descriptor = "[[Lclient!mc;")
	public static Class198[][] aClass198ArrayArray1;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "Lclient!m;")
	public static Class91 aClass91_3;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;)V")
	public static void method1597(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static445.anInt8114 = 2;
		Static122.anInt2825 = arg0;
		Static331.method5281(false, arg2, arg1);
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIIBI)V")
	public static void method1600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 == arg3) {
			Static493.method7335(arg1, arg0, arg3, arg4);
		} else if (Static251.anInt5168 <= arg4 - arg3 && arg4 + arg3 <= Static341.anInt6481 && arg0 - arg2 >= Static507.anInt9124 && arg2 + arg0 <= Static234.anInt4897) {
			Static305.method4964(arg3, arg4, arg0, arg2, arg1);
		} else {
			Static148.method5742(arg3, arg2, arg1, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(IJZLjava/lang/String;)V")
	public static void method1601(@OriginalArg(1) long arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2) {
		if (arg1) {
			Static440.method6678();
			if (Static63.aString91.equals("")) {
				Static194.anInt4316 = 39;
				return;
			}
		}
		@Pc(21) Class12_Sub8 local21 = new Class12_Sub8(576);
		local21.method5214(10);
		local21.method5190((int) (Math.random() * 65535.0D));
		local21.method5208(arg0);
		local21.method5190(arg1 ? Static362.anInt6761 : Static423.anInt79);
		local21.method5223((int) (Math.random() * 9.9999999E7D));
		local21.method5180(arg2);
		local21.method5223((int) (Math.random() * 9.9999999E7D));
		if (arg1) {
			local21.method5208(Static178.method3535(Static63.aString91));
			try {
				local21.method5208(Long.parseLong(Static36.aString98));
			} catch (@Pc(79) Exception local79) {
				Static194.anInt4316 = 39;
				return;
			}
		} else {
			local21.method5223((int) (Math.random() * 9.9999999E7D));
			local21.method5223((int) (Math.random() * 9.9999999E7D));
			local21.method5223((int) (Math.random() * 9.9999999E7D));
			local21.method5223((int) (Math.random() * 9.9999999E7D));
		}
		local21.method5223((int) (Math.random() * 9.9999999E7D));
		local21.method5170(Static427.aBigInteger4, Static188.aBigInteger1);
		Static383.aClass12_Sub8_Sub2_1.anInt6217 = 0;
		Static383.aClass12_Sub8_Sub2_1.method5214(arg1 ? Static17.aClass137_12.anInt4298 : Static17.aClass137_9.anInt4298);
		Static383.aClass12_Sub8_Sub2_1.method5190(local21.anInt6217 + 28);
		Static383.aClass12_Sub8_Sub2_1.method5190(606);
		Static383.aClass12_Sub8_Sub2_1.method5214(Static345.anInt6495);
		Static383.aClass12_Sub8_Sub2_1.method5214(Static293.aClass138_7.anInt4315);
		Static247.method4271(Static383.aClass12_Sub8_Sub2_1);
		Static383.aClass12_Sub8_Sub2_1.method5193(local21.aByteArray82, local21.anInt6217);
		Static194.anInt4316 = -3;
		Static267.anInt5373 = 0;
		Static96.anInt2249 = 0;
		Static175.anInt3980 = 1;
	}
}
