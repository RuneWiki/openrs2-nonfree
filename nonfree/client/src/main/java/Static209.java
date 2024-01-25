import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "Lclient!pe;")
	public static Class254 aClass254_70;

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("a12820b1d6a4e014a5e1dd5efa6bde9b954ce5bc374dd16bbecd6913e768bc36c4153b6b12662f13352ad50423b3aef8070e62560ef9b5c46e7485412b1211fc46b603e5fa7fec712d7a1f1734ad77196851281d650d3213c0b102535ab7111da6fea314a18e757b40b1865848de145a5ad3b82fb15577c02e0d5c4f4df28e8e1f8a683c4961f55f4659a78a6ae4902a075b7cd1f9a2b50906b459d9235afa5c36b84f7b2c75582055ebede7362b34185f152cc8e1ada730e173b11164c35d2981dfda9add475ec799f95209117c9f76a4ab6482e9ac03fccd2a76b73dd8376fedb3630a987818e9897e0ca1a45842d07f3ddff7b45fb9250a73b4f4c08648973e52e5d0b7a737bba345e317f043d646479bcdad3466991c5cd7dcbd31a04af523658416a72b02f290080795e69bf16dc2563d8f5bf0bb6f99668033a705a4d2ea19397674978ff46ee71b218bf77903698225982889261279ac11e85a29e17f59d11b4af0dbf0c10fc9f0ba7bbff4f22e691212b17ad01c23adbe462109e19a8d0a7c67c8bf071bbf1cab5fc364e8cf370fb9e46c31d418c893cebb747775532b3468e51a0419cc63edab940ec0fa7ac63b0f9f5e2e1706c911415643a3822745c25878f038a225f336ec5471f483fa078c7ee1f3b4737b4b061129c2d495cec8e914b530e4d41b3a6895d5bbcc1701d8516613d1a2e3d29685864a354b79bb", 16);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public static void method3673() {
		Static222.method3806();
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method3675(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) String arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7) {
		@Pc(11) Class300 local11 = Static449.aClass300Array1[99];
		for (@Pc(13) int local13 = 99; local13 > 0; local13--) {
			Static449.aClass300Array1[local13] = Static449.aClass300Array1[local13 - 1];
		}
		if (local11 == null) {
			local11 = new Class300(arg6, arg0, arg4, arg5, arg7, arg1, arg3, arg2);
		} else {
			local11.method7402(arg5, arg3, arg2, arg0, arg7, arg1, arg6, arg4);
		}
		Static468.anInt8769++;
		Static449.aClass300Array1[0] = local11;
		Static350.anInt7049 = Static509.anInt9418;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!wk;B)V")
	public static void method3677(@OriginalArg(0) Class2_Sub2_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt7616 - Static129.anInt10429;
		@Pc(28) int local28 = arg0.anInt7654 * 512 + arg0.method6311() * 256;
		@Pc(39) int local39 = arg0.anInt7607 * 512 + arg0.method6311() * 256;
		arg0.anInt9398 += (local28 - arg0.anInt9398) / local8;
		arg0.anInt7658 = 0;
		arg0.anInt9396 += (local39 - arg0.anInt9396) / local8;
		if (arg0.anInt7597 == 0) {
			arg0.method6309(8192);
		}
		if (arg0.anInt7597 == 1) {
			arg0.method6309(12288);
		}
		if (arg0.anInt7597 == 2) {
			arg0.method6309(0);
		}
		if (arg0.anInt7597 == 3) {
			arg0.method6309(4096);
		}
	}
}
