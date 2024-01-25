import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static145 {

	@OriginalMember(owner = "client!ew", name = "s", descriptor = "Lclient!qda;")
	public static Class59 aClass59_4;

	@OriginalMember(owner = "client!ew", name = "u", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!ew", name = "q", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("8649fcf2448fbde5f1d6ced139d3d718500a07d69124b6996771a365fa4555a22af3e19bde8d36f85c258d129c5beaa9b08a1acd3adf51f45730ba44496b5cf55a693a1283846f30ea4e3ab20c18a5e85426e22031ffab13deaab3898c045633472513dae5a014145cec13391ae5734a1b3963662aef6761bffb95294dbfad792ebf06d5c24e497d858228aa29aac511e5b908060c8e0f96c5919c283fd31d16591a4a9eb9377d42ac478834718ec73880f8e5ddfe5fc91826b4f7bc67ac50d7fc787fdd863e07418f2a88e2937aab9e8e78ef34768289d0349f9d541bd1474cbb469359e519172fe524fed02b7b73372990f469634cec3a0bd7358f2da75dd4613b9ccacad3415f7075e360a2a93727ca55a3c3bfd82d90eb4b92faa942f9fbe652edec790a3f31f9059d9af2d15b80a43f8c49359ddb80fc8d28d617d9812150adf9aada993788300f8724abc261500c005cc24e04aba9f1ec8aa43e5989339eeffc86a1bb1dfc5bb442f3aec04d8bc5df858657237d48258e2a79c5d87eb1fddb3e9551b929011a300b8632508340e423860b443d8cb011c979b2988bef47cbb720231480dbc88d57bfddff8f9f19adc2ce4e79dcbbb8ebbc70455b68e5b69aeff83952a912a24bb4be21f4c0029b1ea2bc77b0071d956b744136132f7ee4a415bbe3f04c170921e8531d36b1a26c06d1b39629ad103d60fb9e4039eccbd1", 16);

	@OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
	public static int anInt2413 = 0;

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
	public static void method2181() {
		Static203.aClass265_16.method6573();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
	public static boolean method2183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static488.method7146(arg0, arg1) || Static389.method575(arg1, arg0)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static93.method1446(arg1, arg0);
		}
	}
}
