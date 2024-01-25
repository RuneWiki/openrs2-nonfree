import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!er", name = "I", descriptor = "[[S")
	public static short[][] aShortArrayArray1;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!er", name = "G", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_64 = new Class102(63, 2);

	@OriginalMember(owner = "client!er", name = "K", descriptor = "[B")
	public static final byte[] aByteArray13 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIBI)V")
	public static void method1551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg1 + Static275.anInt4506;
		@Pc(13) int local13 = Static209.anInt3497 + arg0;
		if (Static309.aClass270ArrayArrayArray3 == null || arg1 < 0 || arg0 < 0 || arg1 >= Static166.anInt2852 || Static426.anInt6923 <= arg0) {
			return;
		}
		@Pc(47) long local47 = (long) (local13 << 14 | arg2 << 28 | local9);
		@Pc(53) Class2_Sub12 local53 = (Class2_Sub12) Static201.aClass72_21.method1659(local47);
		if (local53 == null) {
			Static276.method3715(arg2, arg1, arg0);
			return;
		}
		@Pc(67) Class2_Sub37 local67 = (Class2_Sub37) local53.aClass156_9.method3155();
		if (local67 == null) {
			Static276.method3715(arg2, arg1, arg0);
			return;
		}
		@Pc(81) Class3_Sub1_Sub1 local81 = (Class3_Sub1_Sub1) Static276.method3715(arg2, arg1, arg0);
		if (local81 == null) {
			local81 = new Class3_Sub1_Sub1();
		} else {
			local81.anInt56 = local81.anInt63 = -1;
		}
		local81.anInt68 = local67.anInt4632;
		local81.anInt65 = local67.anInt4634;
		label46: while (true) {
			@Pc(109) Class2_Sub37 local109 = (Class2_Sub37) local53.aClass156_9.method3150();
			if (local109 == null) {
				break;
			}
			if (local81.anInt68 != local109.anInt4632) {
				local81.anInt56 = local109.anInt4632;
				local81.anInt58 = local109.anInt4634;
				while (true) {
					@Pc(134) Class2_Sub37 local134 = (Class2_Sub37) local53.aClass156_9.method3150();
					if (local134 == null) {
						break label46;
					}
					if (local134.anInt4632 != local81.anInt68 && local81.anInt56 != local134.anInt4632) {
						local81.anInt60 = local134.anInt4634;
						local81.anInt63 = local134.anInt4632;
					}
				}
			}
		}
		@Pc(181) int local181 = Static302.method3973((arg0 << 7) + 64, (arg1 << 7) + 64, arg2);
		Static387.method4963(arg2, arg1, arg0, local181, local81);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I[B)[B")
	public static byte[] method1552(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static464.method1964(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)Z")
	public static boolean method1553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZJLjava/lang/String;)V")
	public static void method1555(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) String arg2) {
		if (arg0) {
			Static339.method4553();
			if (Static250.aString118.equals("")) {
				Static310.anInt5372 = 39;
				return;
			}
		}
		@Pc(19) Class2_Sub13 local19 = new Class2_Sub13(128);
		local19.method3602(10);
		local19.method3568((int) (Math.random() * 65535.0D));
		local19.method3570(arg1);
		local19.method3568(Static294.anInt979);
		local19.method3569((int) (Math.random() * 9.9999999E7D));
		local19.method3590(arg2);
		local19.method3569((int) (Math.random() * 9.9999999E7D));
		if (arg0) {
			local19.method3570(Static380.method358(Static250.aString118));
			try {
				local19.method3570(Long.parseLong(Static341.aString160));
			} catch (@Pc(109) Exception local109) {
				Static310.anInt5372 = 39;
				return;
			}
		} else {
			local19.method3569((int) (Math.random() * 9.9999999E7D));
			local19.method3569((int) (Math.random() * 9.9999999E7D));
			local19.method3569((int) (Math.random() * 9.9999999E7D));
			local19.method3569((int) (Math.random() * 9.9999999E7D));
		}
		local19.method3569((int) (Math.random() * 9.9999999E7D));
		local19.method3575(Static385.aBigInteger2, Static193.aBigInteger1);
		Static456.aClass2_Sub13_Sub2_2.anInt4347 = 0;
		Static456.aClass2_Sub13_Sub2_2.method3602(arg0 ? Static167.aClass236_12.anInt6448 : Static167.aClass236_9.anInt6448);
		Static456.aClass2_Sub13_Sub2_2.method3568(local19.anInt4347 + 28);
		Static456.aClass2_Sub13_Sub2_2.method3568(599);
		Static456.aClass2_Sub13_Sub2_2.method3602(Static331.anInt5597);
		Static456.aClass2_Sub13_Sub2_2.method3602(Static118.aClass4_1.anInt73);
		Static34.method523(Static456.aClass2_Sub13_Sub2_2);
		Static456.aClass2_Sub13_Sub2_2.method3596(local19.anInt4347, local19.aByteArray52);
		Static310.anInt5372 = -3;
		Static116.anInt2153 = 0;
		Static183.anInt3120 = 0;
		Static128.anInt2309 = 1;
	}
}
