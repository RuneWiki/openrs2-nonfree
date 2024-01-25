import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static609 {

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Lclient!gda;")
	public static Class126 aClass126_197;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "Lclient!gda;")
	public static Class126 aClass126_198;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
	public static int anInt7074;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!pe;")
	public static final Class282 aClass282_36 = new Class282(12, 0, 1, 0);

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("caf126958f3837e4f0180ac7a090ad8c2d5c116672b7f57addc170941586cb14baf04cabbeaeb56024982b1c28b3c5390f6fd671818336c5b8543b1d8c4daf9f246a5ab0cf1a4ee5c84c9dcff9a9a3d7c5cdca66db9c0fa28afea508c0ab836b42b315ef40a2a6be32f7ffa137533e316a7af38b008718983ca73a88e5ed02e405cae401b309e2a2c8849adc87ffb8ef71bd8f0c095e1765090ca4c9cd90796dc03ee089c872aaae59750f9829b74c5252ca7dfeba78643f98603b8ce01552b52a48432c7aa98b8ad8db6b23d8ff4d1a40cfa315959aa1051f1a9c7c6c88a1ead7ba0714c2a70fdb9a0b31a82cee116a994c5fc9377cec6cae55e668c61ed1c3a5f41ea6b858950bb774de51626f20eb2f01e09c714a1b03a0081c9a321a24a072a915e61865f1c4404f3d2c1a52941911f7377d0db7fb88b787d66f56982143244dbe2c50e7ebb6a16e5fb5ad6d9d06b8ee44fdd7a9ada285eccdeeab0bbdb2c7f78be894930ada0f26aa2ef1dddf9289ce7bc361503fbfa502ed9e02f4cad890b5cc2a33ea59ca6918e1f6d554bc1ceaf5331ef392a5a17b9731ab5cd4dc920969cce89b1a42d6c5762aa4232b684efc04ae768dceff122cd6ef0a05f9b57f6614febebec44b78d7a9c3a46f2ba4ae4529b39330a0937210b43c4834e591ac8d70508ce662ff978714661dccef3f4408fe576a5a0b84a8ae236c7a78da808b", 16);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIB)V")
	public static void method6158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) int local5 = Static191.anInt10376;
		if (local5 == 0) {
			return;
		}
		if (local5 == 1) {
			Static56.anInt973 = arg2;
			Static191.anInt10376 = 2;
			Static552.anInt8732 = arg3;
			Static534.anInt8529 = arg0;
			Static248.anInt4331 = arg1;
		} else if (local5 == 2) {
			if (arg0 < Static534.anInt8529) {
				Static534.anInt8529 = arg0;
			}
			if (arg2 > Static56.anInt973) {
				Static56.anInt973 = arg2;
			}
			if (Static552.anInt8732 < arg3) {
				Static552.anInt8732 = arg3;
			}
			if (Static248.anInt4331 > arg1) {
				Static248.anInt4331 = arg1;
			}
		}
	}
}
