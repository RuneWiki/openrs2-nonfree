import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!qfa", name = "G", descriptor = "Lclient!cba;")
	public static Class33 aClass33_22;

	@OriginalMember(owner = "client!qfa", name = "E", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger9 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!qfa", name = "m", descriptor = "(I)I")
	public static int method5073() {
		@Pc(12) boolean local12 = false;
		@Pc(14) boolean local14 = false;
		@Pc(16) boolean local16 = false;
		if (Static268.aClass370_3.aBoolean739 && !Static268.aClass370_3.aBoolean740) {
			local12 = true;
			if (Static494.aClass2_Sub16_1.anInt3436 < 512 && Static494.aClass2_Sub16_1.anInt3436 != 0) {
				local12 = false;
			}
			if (Static623.aString117.startsWith("win")) {
				local16 = true;
				local14 = true;
			} else {
				local14 = true;
			}
		}
		if (Static509.aBoolean668) {
			local12 = false;
		}
		if (Static97.aBoolean223) {
			local14 = false;
		}
		if (Static2.aBoolean333) {
			local16 = false;
		}
		if (!local12 && !local14 && !local16) {
			return Static46.method1670();
		}
		@Pc(68) int local68 = -1;
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		if (local12) {
			try {
				local68 = Static436.method6915(2, 1000);
			} catch (@Pc(81) Exception local81) {
			}
		}
		if (local16) {
			try {
				local72 = Static436.method6915(3, 1000);
				if (Static74.aClass2_Sub13_5.aClass14_Sub5_2.method2945() == 3) {
					@Pc(102) Class108 local102 = Static186.aClass20_4.method7240();
					@Pc(107) long local107 = local102.aLong87 & 0xFFFFFFFFFFFFL;
					@Pc(110) int local110 = local102.anInt3959;
					if (local110 == 4318) {
						local14 &= local107 >= 64425238954L;
					} else if (local110 == 4098) {
						local14 &= local107 >= 60129613779L;
					}
				}
			} catch (@Pc(146) Exception local146) {
			}
		}
		if (local14) {
			try {
				local70 = Static436.method6915(1, 1000);
			} catch (@Pc(158) Exception local158) {
			}
		}
		if (local68 == -1 && local70 == -1 && local72 == -1) {
			return Static46.method1670();
		}
		local72 = (int) ((float) local72 * 1.1F);
		local70 = (int) ((float) local70 * 1.1F);
		if (local72 < local68 && local70 < local68) {
			return Static249.method4599(local68);
		} else if (local72 <= local70) {
			return Static277.method5092(1, local70);
		} else {
			return Static277.method5092(3, local72);
		}
	}

	@OriginalMember(owner = "client!qfa", name = "o", descriptor = "(I)V")
	public static void method5075() {
		Static489.aClass341_58 = new Class341();
	}
}
