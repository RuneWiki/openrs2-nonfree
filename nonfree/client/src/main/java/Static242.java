import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "F")
	public static float aFloat101;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[[[Lclient!rg;")
	public static Class255[][][] aClass255ArrayArrayArray2;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_207 = new Class296(29, 3);

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
	public static final int[] anIntArray465 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("9d2807361d7f8f77c012d7e92f3f469beb8e3a64629d2016a3346d6967aaaec9704c0cce71e2ff6d606780d0083f67f04536b019c8301eac2615c1a94330a4f9341d9d0687ceeb8acf773914b76f2e208f5498809ca7e54e0dd4c14ea45c76bcf9c8962ddbce4899fb7909c0a9eab07cbb62f19054ffe4a13b36f1d0724acc9421af2ab7c80229bb97286b7e70c208e1873fba5d3a279b7ecb8afdd1423417d7251bb4f1977601dca1ca0ae4bfd4211e3f0a3ccc98f377a271fbb790d9c07ba2495bb1081230ac49369373887092a1e1c8f38ecaf4b172ca9e6600362a82ecdc89579a98e3efd35c39954f42383959a9a414bae5977c346bbd2f08440fad4914430b57d4baccac64d00fd6e9d4bede27ae5526a2afdd63887ed24699aeb9398d86ebba7858f8d24e3dbceb565a3aa3b54e62920be50d4646c15a040537ce989a67f69d60b383f15b910f7ce1693657e4e0eff2ec3cee2a31bd921f6f982a53456e3b10356e002bed4a8a5eeb88db388b971888e9e2f2f5231ed651f7a76fab68b17c083063a34c1a9c9d6e7b5064740f2ce0372fa5df4933c8f12b14b9535371f9506f3cb3fd0e1a285fadfbca542cf898635b6db51e68d614177c181e306f76d94bbbc96ae87bae4e9d8ec342d1a4740b8c3ed389a22238cbce898f04483fbfd94ceeb9498867c32852079d0688e23605b9520d47a02928beed77638674bbdd", 16);

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!bn;")
	public static final Class31 aClass31_6 = new Class31(12, 0, 1, 0);

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "[I")
	public static final int[] anIntArray466 = new int[1000];

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)[Lclient!js;")
	public static Class158[] method4178() {
		return new Class158[] { Static295.aClass158_1, Static295.aClass158_2, Static295.aClass158_3, Static295.aClass158_4, Static295.aClass158_5, Static295.aClass158_6, Static295.aClass158_7, Static295.aClass158_8, Static295.aClass158_9, Static295.aClass158_10, Static295.aClass158_11, Static295.aClass158_12, Static295.aClass158_13, Static295.aClass158_14 };
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)Lclient!raa;")
	public static Class1_Sub39 method4179() {
		if (Static118.aClass37_11 == null || Static466.aClass106_1 == null) {
			return null;
		}
		for (@Pc(14) Class1_Sub39 local14 = (Class1_Sub39) Static466.aClass106_1.method2485(); local14 != null; local14 = (Class1_Sub39) Static466.aClass106_1.method2485()) {
			@Pc(21) Class30 local21 = Static118.aClass272_2.method6380(local14.anInt7253);
			if (local21 != null && local21.aBoolean49 && local21.method907(Static118.anInterface16_2)) {
				return local14;
			}
		}
		return null;
	}
}
