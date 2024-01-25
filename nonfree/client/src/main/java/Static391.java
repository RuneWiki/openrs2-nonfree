import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger7 = new BigInteger("9a597da960c5a73334b2eec21f6ee46c67171fdb3e0fce31d740dbc2b72af2be1a367dd846911478224bd36e59709b294b8bcd5db6ed826468d080b3e8d47cd71d04755da4b20179876cb3c1ec069ba231d4c529101a2d462733bd91d866a461a3bb781a0dc551590917906b7f5aa3b6553006ca8472108e371b76fe56a7ce2724525e787156a7e1902864fb7128eb294e06d93dd4afd513d09293d4ad062f9062de383eda2f1173c784304db607bc00e41cd9547f652899d4d15cc1f7701272ed46b826abf141985a94af3380e0c603f911a8e131f81ee988a519b83c607c9d628f6705e38f471fce518997f540e74d56fb8aac54087dd778cd39dfd4285defa986e7f22b2f226223335aefd9ca8553ab7bd48291e582d463a23f294666c0fd769d745c743e419c20c3c1553ea921300b5462f25c23d674e1093fea56469044f5f92f1aa199dacf6fa52d42741acba53308891cfb5293d8320c79c74ba7cf4f3622be7a355b37566a40276af01f70f2c9e1a701783a59a7ecd575928f62d81d29c56113adc76c900afb86862e067bb75c7950690755a94c41071f6451af723319889e959f656549933de2e07af2a9aaa8f9fc2c13c6c498d2f59a5dcefdc5947a72592f819fdcaed936bfb725f756503715f9e35b62a6398fbb78a9f34a96ba428219c2c01ac549cb4ebb24b16856ec265a8271f6681c447ab4cefde4050eab", 16);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(FIFF)I")
	public static int method5715(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local17 < local26 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local35 > local26) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
