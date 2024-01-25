import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "Lclient!hw;")
	public static Class151 aClass151_12;

	@OriginalMember(owner = "client!pt", name = "i", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray49;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Z")
	public static boolean aBoolean552 = false;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("966dbab55b4619ec3d0fb92b458b41a108b95aced76555ff797f78ad67b4315887d4a5eb32f277f45d7c1b6bc3421fc6174bc02cf2d1fd5a301fae111299c1fcfd5cb6cfde7948ede96d1f07782fd13335826570e2a5b2d2d7eabb93fcf87943dfa49cb808504405f0446f77573746ebbccc4bf37fdab0039da7af63de7a3a1af2dd7e97ffa51b4deccc11f882aa47b5434c0b7c30cafa1244de9bc2b7c8cf39afb8cbd4127f0ade986e11cfd0b7e0eb9dc125776c2f0a47d717b41e3ccb8622b34f50e32bfa786c6f7ecfe64eaa9d6c16bef7aa632cda38ff7fba12ce3d52e52470eea1af9d156403701d05bb1b562458edd8f83045e924848abe2f31dd13ddea65b0931414cd4e33fa4f15254a0e98ec63dd3de448fd597591ef58a3b82462011478e3ba4756ac09af8f8dd53a4c85e764b4f7322ecf6d4cbfad12a78741bddf17caf445b60e8a05458eb4dbf4f66a9a55b846c3a2424ca9e600d72cc44de37d8972b58b90e845508083d3d87284a2cd01f0228f8083c7893dc95e0b27c819209fb45061c2538eac266d0c5e62777bac2301e02167fad2c9b3992c966fc8bfdfc538b142632f83b5df846fe8ca5291c7732876c39959c85ade83f8414bd02fd20ad417de9fecaa9aa8019eefdb19af062ec162536da9855c7ea742b3ce54b50e2bb1618dd62f2f59e3736ccee2dcd72dc6f88b69d55a866954616297a20bf5", 16);

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZZII)I")
	public static int method6857(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class6_Sub6 local10 = Static249.method3626(false, arg0);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray55.length; local23++) {
			if (local10.anIntArray55[local23] >= 0 && Static340.aClass121_1.anInt3173 > local10.anIntArray55[local23]) {
				@Pc(48) Class216 local48 = Static340.aClass121_1.method2647(local10.anIntArray55[local23]);
				@Pc(60) int local60 = local48.method5149(Static280.aClass349_2.method8157(arg2).anInt9243, arg2);
				if (arg1) {
					local21 += local10.anIntArray54[local23] * local60;
				} else {
					local21 += local60;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!ae;IZI)Lclient!hw;")
	public static Class151 method6858(@OriginalArg(0) Class8 arg0, @OriginalArg(3) int arg1) {
		@Pc(18) byte[] local18 = arg0.method262(0, arg1);
		return local18 == null ? null : new Class151(local18);
	}
}
