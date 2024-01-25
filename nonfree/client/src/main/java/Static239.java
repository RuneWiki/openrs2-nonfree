import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!hw", name = "tb", descriptor = "Lclient!gj;")
	public static Class143 aClass143_59;

	@OriginalMember(owner = "client!hw", name = "vb", descriptor = "[Lclient!s;")
	public static Class104[] aClass104Array1;

	@OriginalMember(owner = "client!hw", name = "ib", descriptor = "Lclient!oaa;")
	public static final Class258 aClass258_3 = new Class258();

	@OriginalMember(owner = "client!hw", name = "ob", descriptor = "Z")
	public static final boolean aBoolean356 = false;

	@OriginalMember(owner = "client!hw", name = "sb", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("99dd3f578b82518fc07ac8f183760cb75e57d0c1fd5877af0d8d02f25aa5b10caf9d9089b82ba19e3472cfbc571b728680237bfed2e5e4305193dc4233b48e8c139fe02e0672d5ede03ececfea59c46ee5e45cc5c899c4d0a5f1dd340bcc863904215bb95e3601829bef32bd4a2bf3ccf9d445e5dff449dc335f523eb3d8015d30f1497b7e536084f9ef2d60f5d814060fa48b3a86e67019d4b9c6e633c728f3469ef95ad56061cb79a466f8e81a0fab2caeb03e3478b6534703d2331f028d9626ffdfa104d1a7189ca15d6c94c6715cd577d55719133763e2837ac78f8cc073bd896c0bdba28e089a5148f784660861b0aebf45d52158b549f0e93a0dfcae4c50e8152d9955b7c5a06fe7d79d11bbf0ae9685646268032140841ceb4978c880c021fadfd94d302947def381e83a5f171217fbd48d51e92a7b9e21a7f723211a485284c3ed504aa51b5721f0a7cfb2c4c541c7276c9630ebe8f14bf00590c617921c1e7531329670d63a3926e311eaad16a3ca9a455d59852171e221cf4e3ce3e20a3c7295fa330c696a29f7e46efed956c4fbd86774a5c49c700503cbce15b37da8706c1a5dd16780976739d252b86a5c317b9cddcfc0c9e2a692a33e0ee9695196d3a6797e5fde6fbd138a806f72064dc1a4916e93f790fba381fc68c67844b343a0429a7ad21da7f1d1678c59f037bec93ab84f779e1b51203e271dac346d", 16);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(Lclient!fca;IILclient!lu;)V")
	public static void method3852(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class231 arg2) {
		@Pc(9) Class3_Sub36 local9 = new Class3_Sub36();
		local9.anInt6623 = arg0.method4888();
		local9.anInt6621 = arg0.method4868();
		local9.anIntArray409 = new int[local9.anInt6623];
		local9.anIntArray407 = new int[local9.anInt6623];
		local9.aByteArrayArrayArray14 = new byte[local9.anInt6623][][];
		local9.aClass129Array2 = new Class129[local9.anInt6623];
		local9.aClass129Array1 = new Class129[local9.anInt6623];
		local9.anIntArray408 = new int[local9.anInt6623];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt6623; local55++) {
			try {
				@Pc(61) int local61 = arg0.method4888();
				@Pc(81) String local81;
				@Pc(85) String local85;
				@Pc(89) int local89;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local81 = arg0.method4847();
					local85 = arg0.method4847();
					local89 = 0;
					if (local61 == 1) {
						local89 = arg0.method4868();
					}
					local9.anIntArray409[local55] = local61;
					local9.anIntArray408[local55] = local89;
					local9.aClass129Array1[local55] = arg2.method5290(Static507.method7178(local81), local85);
				} else if (local61 == 3 || local61 == 4) {
					local81 = arg0.method4847();
					local85 = arg0.method4847();
					local89 = arg0.method4888();
					@Pc(92) String[] local92 = new String[local89];
					for (@Pc(94) int local94 = 0; local94 < local89; local94++) {
						local92[local94] = arg0.method4847();
					}
					@Pc(109) byte[][] local109 = new byte[local89][];
					@Pc(122) int local122;
					if (local61 == 3) {
						for (@Pc(116) int local116 = 0; local116 < local89; local116++) {
							local122 = arg0.method4868();
							local109[local116] = new byte[local122];
							arg0.method4832(local109[local116], 0, local122);
						}
					}
					local9.anIntArray409[local55] = local61;
					@Pc(153) Class[] local153 = new Class[local89];
					for (local122 = 0; local122 < local89; local122++) {
						local153[local122] = Static507.method7178(local92[local122]);
					}
					local9.aClass129Array2[local55] = arg2.method5299(local85, local153, Static507.method7178(local81));
					local9.aByteArrayArrayArray14[local55] = local109;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local9.anIntArray407[local55] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local9.anIntArray407[local55] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local9.anIntArray407[local55] = -3;
			} catch (@Pc(253) Exception local253) {
				local9.anIntArray407[local55] = -4;
			} catch (@Pc(260) Throwable local260) {
				local9.anIntArray407[local55] = -5;
			}
		}
		Static160.aClass193_18.method4462(local9);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(III)Z")
	public static boolean method3853(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IB)V")
	public static void method3856(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub6_Sub7 local13 = Static198.method3146((long) arg0, 10);
		local13.method1709();
	}
}
