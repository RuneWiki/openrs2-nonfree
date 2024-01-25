import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I")
	public static int method7436() {
		@Pc(10) boolean local10 = false;
		@Pc(12) boolean local12 = false;
		@Pc(14) boolean local14 = false;
		if (Static570.aClass268_5.aBoolean644 && !Static570.aClass268_5.aBoolean645) {
			local10 = true;
			if (Static580.aClass5_Sub30_1.anInt4762 < 512 && Static580.aClass5_Sub30_1.anInt4762 != 0) {
				local10 = false;
			}
			if (Static429.aString64.startsWith("win")) {
				local14 = true;
				local12 = true;
			} else {
				local12 = true;
			}
		}
		if (Static206.aBoolean317) {
			local12 = false;
		}
		if (Static70.aBoolean78) {
			local10 = false;
		}
		if (Static184.aBoolean286) {
			local14 = false;
		}
		if (!local10 && !local12 && !local14) {
			return Static281.method4528();
		}
		@Pc(65) int local65 = -1;
		@Pc(67) int local67 = -1;
		if (local10) {
			try {
				local65 = Static293.method4687(1000, 2);
			} catch (@Pc(76) Exception local76) {
			}
		}
		@Pc(79) int local79 = -1;
		if (local14) {
			try {
				local79 = Static293.method4687(1000, 3);
				if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() == 3) {
					@Pc(97) Class118 local97 = Static208.aClass65_7.method6878();
					@Pc(102) long local102 = local97.aLong65 & 0xFFFFFFFFFFFFL;
					@Pc(105) int local105 = local97.anInt3332;
					if (local105 == 4318) {
						local12 &= local102 >= 64425238954L;
					} else if (local105 == 4098) {
						local12 &= local102 >= 60129613779L;
					}
				}
			} catch (@Pc(137) Exception local137) {
			}
		}
		if (local12) {
			try {
				local67 = Static293.method4687(1000, 1);
			} catch (@Pc(147) Exception local147) {
			}
		}
		if (local65 == -1 && local67 == -1 && local79 == -1) {
			return Static281.method4528();
		}
		local79 = (int) ((float) local79 * 1.1F);
		local67 = (int) ((float) local67 * 1.1F);
		if (local65 > local79 && local67 < local65) {
			return Static204.method3293(local65);
		} else if (local67 >= local79) {
			return Static463.method6623(local67, 1);
		} else {
			return Static463.method6623(local79, 3);
		}
	}
}
