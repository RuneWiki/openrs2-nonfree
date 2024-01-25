import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("8829051be325ef6b948d198318e89b23577e0a2eeb4f7bbbee451c9bf4bdb308d90f45971799cb492076426d8b63dc93cf2b50ec9ecd8bc05682d3b87798f073c43a91e39732bcdc7c9450548430874b2b0636c948164b12052ce812a008f60e47d29a5ab5b08968cc1c7ea779752b6491c0c5d6f1745fa6ec0b7c9da86331a8697de103e00fdfb5143d8e3f15ad6f2f183feea4fd091d707870cb13845e5305de45e04c481739b89db82b70766729a903775fa79f4d119692819a3802e8238a386d1174e19f3f700042d8492a43ac922a5ff162478af33f77477cad55894e2e82e43ef0de395b42ccd618b24913a630c7b10b977f69a231820d5ed4522d35e8eb8ab17535496456cb43fc3eda6d2700c1514c7193e0aa2f5804ec6317aea10c2383a91abc31e471973d5f0d73cc529b4dff693d6cd68a5c8426aa355548b853f5cb6e695393e765ed6c63ea4932ca0a362cc4480aa01090fd1994e8c4d0d2aa800a42aae6cf42900f0fb248c692521fffd7ba23f99c29e987a14ec4a234cc61000b2ec758d2bca270fc55d0d93513c99812147860adb35b8265b992f35ee6ebfd0a86529078d529844af8e21fed67f4ade9ebba1da14fd56690e291e18bcdbdb1549d8a5ca76f701f2e1550455d8d40ce511daa9090d23e17950fdf0cbb09a057d7c098a55360b656078a49435a5bc4efd21545a4884bda371e3da23f9adc97", 16);

	@OriginalMember(owner = "client!pq", name = "v", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_205 = new Class160(13, -1);

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "[I")
	public static final int[] anIntArray423 = new int[6];

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!tja;Lclient!da;ZLjava/lang/String;BLclient!ha;)V")
	public static void method7167(@OriginalArg(0) Class350 arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3, @OriginalArg(5) Class144 arg4) {
		@Pc(23) boolean local23 = !Static524.aBoolean668 || Static342.method5223();
		if (!local23) {
			return;
		}
		@Pc(40) int local40;
		@Pc(49) int local49;
		if (Static524.aBoolean668 && local23) {
			@Pc(147) Class350 local147 = Static52.aClass350_1;
			@Pc(153) Class68 local153 = arg4.method6958(local147, Static123.aClass266Array1, true);
			local40 = local147.method8352((Class45[]) null, 250, arg3);
			local49 = local147.method8351(local147.anInt9698, 250, arg3, (Class45[]) null);
			@Pc(172) int local172 = Static631.aClass266_3.anInt7303;
			@Pc(176) int local176 = local172 + 4;
			local49 += local176 * 2;
			local40 += local176 * 2;
			if (local40 < Static630.anInt10333) {
				local40 = Static630.anInt10333;
			}
			if (Static382.anInt6717 > local49) {
				local49 = Static382.anInt6717;
			}
			@Pc(206) int local206 = Static443.aClass258_10.method6293(Static380.anInt6690, local40) + Static149.anInt2321;
			@Pc(214) int local214 = Static85.aClass205_2.method5049(Static380.anInt6697, local49) + Static529.anInt9098;
			if (Static656.aBoolean741) {
				local206 += Static532.method7876();
				local214 += Static276.method4674();
			}
			arg4.method6964(Static190.aClass266_2, false).method7487(Static142.aClass266_1.anInt7303 + local206, local214 - -Static142.aClass266_1.anInt7305, local40 - Static142.aClass266_1.anInt7303 * 2, local49 - Static142.aClass266_1.anInt7305 * 2, 1, 0, 0);
			arg4.method6964(Static142.aClass266_1, true).method7488(local206, local214);
			Static142.aClass266_1.method6460();
			arg4.method6964(Static142.aClass266_1, true).method7488(local40 + local206 - local172, local214);
			Static142.aClass266_1.method6464();
			arg4.method6964(Static142.aClass266_1, true).method7488(local40 + local206 - local172, local49 + local214 + -local172);
			Static142.aClass266_1.method6460();
			arg4.method6964(Static142.aClass266_1, true).method7488(local206, local49 + local214 - local172);
			Static142.aClass266_1.method6464();
			arg4.method6964(Static631.aClass266_3, true).method7500(local206, local214 + Static142.aClass266_1.anInt7305, local172, local49 - Static142.aClass266_1.anInt7305 * 2);
			Static631.aClass266_3.method6472();
			arg4.method6964(Static631.aClass266_3, true).method7500(Static142.aClass266_1.anInt7303 + local206, local214, local40 - Static142.aClass266_1.anInt7303 * 2, local172);
			Static631.aClass266_3.method6472();
			arg4.method6964(Static631.aClass266_3, true).method7500(local206 + local40 - local172, Static142.aClass266_1.anInt7305 + local214, local172, local49 - Static142.aClass266_1.anInt7305 * 2);
			Static631.aClass266_3.method6472();
			arg4.method6964(Static631.aClass266_3, true).method7500(Static142.aClass266_1.anInt7303 + local206, -local172 + local214 + local49, local40 - Static142.aClass266_1.anInt7303 * 2, local172);
			Static631.aClass266_3.method6472();
			local153.method9436(0, local49 - local176 * 2, Static383.anInt6724 | 0xFF000000, local176 + local214, local40 - local176 * 2, local176 + local206, arg3, (Class1) null, -1, 0, (int[]) null, 0, 1, (Class45[]) null, 1);
			Static226.method5053(local214, local49, local40, local206);
		} else {
			local40 = arg0.method8352((Class45[]) null, 250, arg3);
			local49 = arg0.method8358(arg3, 250, (Class45[]) null) * 13;
			arg4.aa(6, 6, local40 + 4 + 4, local49 - -8, -16777216, 0);
			arg4.method6923(6, 6, local40 + 4 + 4, local49 - -4 - -4, -1, 0);
			arg1.method9436(0, local49, -1, 10, local40, 10, arg3, (Class1) null, -1, 0, (int[]) null, 0, 1, (Class45[]) null, 1);
			Static226.method5053(6, local49 + 8, local40 + 8, 6);
		}
		if (!arg2) {
			return;
		}
		try {
			if (Static656.aBoolean741) {
				Static359.method5456();
			} else {
				arg4.method6928();
			}
		} catch (@Pc(454) Exception_Sub1 local454) {
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)I")
	public static int method7168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg0 * 57 + arg1;
		@Pc(23) int local23 = local17 << 13 ^ local17;
		@Pc(37) int local37 = (local23 * 15731 * local23 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!nh;I)V")
	public static void method7169(@OriginalArg(0) Class4_Sub3_Sub3_Sub3 arg0) {
		@Pc(6) Class181 local6 = arg0.aClass181_8;
		if (Static530.anInt9105 == arg0.anInt3286 || !local6.method8970() || local6.method8948()) {
			@Pc(30) int local30 = arg0.anInt3286 - arg0.anInt3287;
			@Pc(36) int local36 = Static530.anInt9105 - arg0.anInt3287;
			@Pc(48) int local48 = arg0.anInt3292 * 512 + arg0.method2870(0) * 256;
			@Pc(60) int local60 = arg0.anInt3294 * 512 + arg0.method2870(0) * 256;
			@Pc(72) int local72 = arg0.anInt3293 * 512 + arg0.method2870(0) * 256;
			@Pc(86) int local86 = arg0.anInt3291 * 512 + arg0.method2870(0) * 256;
			arg0.anInt11178 = ((local30 - local36) * local60 + local36 * local86) / local30;
			arg0.anInt11184 = ((local30 - local36) * local48 + local36 * local72) / local30;
		}
		arg0.anInt3299 = 0;
		if (arg0.anInt3290 == 0) {
			arg0.method2873(8192, false);
		}
		if (arg0.anInt3290 == 1) {
			arg0.method2873(12288, false);
		}
		if (arg0.anInt3290 == 2) {
			arg0.method2873(0, false);
		}
		if (arg0.anInt3290 == 3) {
			arg0.method2873(4096, false);
		}
	}
}
