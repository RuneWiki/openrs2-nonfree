import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "Lclient!mfa;")
	public static final Class211 aClass211_67 = new Class211();

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("84e4924cf2decbbc1bbbfcdf12835fe2d12d6ae514438d77f59b189c477e1911ec0fb9fce0edede68b375d41e10b17342e8666d0e4e95085867ba6ee2a9efb763ad32634de7bf35569f60cd1d04649b842b58a1ba1ddf37d81abd5e0c171f717172f88c00ae9eeb45770e885a4302b1d192446598004fa7d46e68325f3fab707f03af4b2973c06efcb90a351752a908e396be7124b58dddac03ea37b0b23ec6975b23a8aa8603520d20e2e5ceb864692848c5cfb821b506ef9b35f6840675f662f596b995f14168e52d64908978804eeb5312903d2ff24507691ef824aaffee371dc11ca57e818612a5705ac6bd710be933cb4c4c3fa9245a23ba00692a16b5a899921a9f9a48d54c4b02b50981dce74377180ece9fc7f96dcf44f89930e5fb04d08dd0735fc0579c0778541bd50a94f274a443f5c041c03eeab0ee73b50ce84b71230ed1ed547a61efbaaa987b6d6f5b51c719246be0311c6b5eb87ffec1d8621d35336c1b7168d7df413c6298bff22fb4cb21f2659fd275c3204daf16008645a7b357abe62a327d181f3a074314aa138e7c204e8375a68305c534615a36b1e08ce597c599a9b7979fbc4996bf7bdbaaac618853875e80ce8b47334d1c55c8a239bcfe6acebb66ee662803d5b7c0b6eabc95a92193c27428da8ba48d194e2af9cd15de75e46955ee545018c8c74bed7c9be0af7d8ca82f1f1adf8deb9bcd525", 16);

	@OriginalMember(owner = "client!uea", name = "V", descriptor = "[I")
	public static final int[] anIntArray753 = new int[32];

	@OriginalMember(owner = "client!uea", name = "ab", descriptor = "Z")
	public static boolean aBoolean644 = false;

	@OriginalMember(owner = "client!uea", name = "bb", descriptor = "I")
	public static int anInt8696 = 0;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I[B)Lclient!nk;")
	public static Class6_Sub4_Sub10 method7257(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class6_Sub4_Sub10 local9 = new Class6_Sub4_Sub10();
		@Pc(14) Class6_Sub26 local14 = new Class6_Sub26(arg0);
		local14.anInt5769 = local14.aByteArray65.length - 2;
		@Pc(25) int local25 = local14.method4999();
		@Pc(35) int local35 = local14.aByteArray65.length - local25 - 2 - 12;
		local14.anInt5769 = local35;
		@Pc(42) int local42 = local14.method5000();
		local9.anInt6727 = local14.method4999();
		local9.anInt6729 = local14.method4999();
		local9.anInt6730 = local14.method4999();
		local9.anInt6728 = local14.method4999();
		@Pc(66) int local66 = local14.method4966();
		@Pc(79) int local79;
		@Pc(85) int local85;
		if (local66 > 0) {
			local9.aClass305Array1 = new Class305[local66];
			for (local79 = 0; local79 < local66; local79++) {
				local85 = local14.method4999();
				@Pc(92) Class305 local92 = new Class305(Static247.method4363(local85));
				local9.aClass305Array1[local79] = local92;
				while (local85-- > 0) {
					@Pc(103) int local103 = local14.method5000();
					@Pc(107) int local107 = local14.method5000();
					local92.method7448((long) local103, new Class6_Sub24(local107));
				}
			}
		}
		local14.anInt5769 = 0;
		local9.aString76 = local14.method4987();
		local9.anIntArray475 = new int[local42];
		local9.aStringArray39 = new String[local42];
		local9.anIntArray476 = new int[local42];
		local79 = 0;
		while (local35 > local14.anInt5769) {
			local85 = local14.method4999();
			if (local85 == 3) {
				local9.aStringArray39[local79] = local14.method4941().intern();
			} else if (local85 >= 100 || local85 == 21 || local85 == 38 || local85 == 39) {
				local9.anIntArray476[local79] = local14.method4966();
			} else {
				local9.anIntArray476[local79] = local14.method5000();
			}
			local9.anIntArray475[local79++] = local85;
		}
		return local9;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZI)Z")
	public static boolean method7258(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IBIII)V")
	public static void method7261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) Static284.aClass211_39.method5183(); local6 != null; local6 = (Class6_Sub2) Static284.aClass211_39.method5177()) {
			Static22.method871(arg2, arg1, local6, arg3, arg0);
		}
		for (@Pc(36) Class6_Sub2 local36 = (Class6_Sub2) Static299.aClass211_43.method5183(); local36 != null; local36 = (Class6_Sub2) Static299.aClass211_43.method5177()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class169 local45 = local36.aClass11_Sub1_Sub1_Sub1_1.method6209();
			if (local36.aClass11_Sub1_Sub1_Sub1_1.aBoolean545) {
				local40 = 0;
			} else if (local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 == local45.anInt5181 || local45.anInt5178 == local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 || local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 == local45.anInt5164 || local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 == local45.anInt5191) {
				local40 = 2;
			} else if (local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 == local45.anInt5161 || local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 == local45.anInt5160 || local45.anInt5166 == local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 || local36.aClass11_Sub1_Sub1_Sub1_1.anInt7390 == local45.anInt5194) {
				local40 = 3;
			}
			if (local36.anInt563 != local40) {
				@Pc(136) int local136 = Static421.method6532(local36.aClass11_Sub1_Sub1_Sub1_1);
				@Pc(140) Class222 local140 = local36.aClass11_Sub1_Sub1_Sub1_1.aClass222_1;
				if (local140.anIntArray464 != null) {
					local140 = local140.method5329(Static435.aClass234_1);
				}
				if (local140 == null || local136 == -1) {
					local36.anInt568 = -1;
					local36.aBoolean33 = false;
				} else if (local136 != local36.anInt568 || local36.aBoolean33 != local140.aBoolean467) {
					if (local36.aClass6_Sub10_Sub2_1 != null) {
						Static35.aClass6_Sub10_Sub3_1.method4742(local36.aClass6_Sub10_Sub2_1);
						local36.aClass6_Sub10_Sub2_1 = null;
					}
					local36.aClass6_Sub12_Sub1_2 = null;
					local36.aBoolean33 = local140.aBoolean467;
					local36.anInt568 = local136;
					local36.aClass6_Sub37_1 = null;
				}
				local36.anInt563 = local40;
			}
			local36.anInt566 = local36.aClass11_Sub1_Sub1_Sub1_1.anInt7347;
			local36.anInt565 = local36.aClass11_Sub1_Sub1_Sub1_1.anInt7347 + (local36.aClass11_Sub1_Sub1_Sub1_1.method6212() << 8);
			local36.anInt561 = local36.aClass11_Sub1_Sub1_Sub1_1.anInt7351;
			local36.anInt562 = local36.aClass11_Sub1_Sub1_Sub1_1.anInt7351 + (local36.aClass11_Sub1_Sub1_Sub1_1.method6212() << 8);
			Static22.method871(arg2, arg1, local36, arg3, arg0);
		}
		for (@Pc(258) Class6_Sub2 local258 = (Class6_Sub2) Static580.aClass305_42.method7445(); local258 != null; local258 = (Class6_Sub2) Static580.aClass305_42.method7449()) {
			@Pc(262) byte local262 = 1;
			@Pc(267) Class169 local267 = local258.aClass11_Sub1_Sub1_Sub2_1.method6209();
			if (local258.aClass11_Sub1_Sub1_Sub2_1.aBoolean545) {
				local262 = 0;
			} else if (local267.anInt5181 == local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 || local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 == local267.anInt5178 || local267.anInt5164 == local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 || local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 == local267.anInt5191) {
				local262 = 2;
			} else if (local267.anInt5161 == local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 || local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 == local267.anInt5160 || local267.anInt5166 == local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 || local258.aClass11_Sub1_Sub1_Sub2_1.anInt7390 == local267.anInt5194) {
				local262 = 3;
			}
			if (local258.anInt563 != local262) {
				@Pc(366) int local366 = Static325.method5248(local258.aClass11_Sub1_Sub1_Sub2_1);
				if (local366 != local258.anInt568 || local258.aClass11_Sub1_Sub1_Sub2_1.aBoolean547 != local258.aBoolean33) {
					if (local258.aClass6_Sub10_Sub2_1 != null) {
						Static35.aClass6_Sub10_Sub3_1.method4742(local258.aClass6_Sub10_Sub2_1);
						local258.aClass6_Sub10_Sub2_1 = null;
					}
					local258.anInt568 = local366;
					local258.aBoolean33 = local258.aClass11_Sub1_Sub1_Sub2_1.aBoolean547;
					local258.aClass6_Sub12_Sub1_2 = null;
					local258.aClass6_Sub37_1 = null;
				}
				local258.anInt563 = local262;
			}
			local258.anInt566 = local258.aClass11_Sub1_Sub1_Sub2_1.anInt7347;
			local258.anInt565 = local258.aClass11_Sub1_Sub1_Sub2_1.anInt7347 + (local258.aClass11_Sub1_Sub1_Sub2_1.method6212() << 8);
			local258.anInt561 = local258.aClass11_Sub1_Sub1_Sub2_1.anInt7351;
			local258.anInt562 = local258.aClass11_Sub1_Sub1_Sub2_1.anInt7351 + (local258.aClass11_Sub1_Sub1_Sub2_1.method6212() << 8);
			Static22.method871(arg2, arg1, local258, arg3, arg0);
		}
	}
}
