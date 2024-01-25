import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	public static int anInt7197;

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "[I")
	public static int[] anIntArray576;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "[Lclient!la;")
	public static final Class200[] aClass200Array2 = new Class200[14];

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)Z")
	public static boolean method6383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)I")
	public static int method6384() {
		@Pc(12) boolean local12 = false;
		@Pc(14) boolean local14 = false;
		@Pc(16) boolean local16 = false;
		if (Static214.aClass192_1.aBoolean389 && !Static214.aClass192_1.aBoolean390) {
			local12 = true;
			if (Static343.aClass5_Sub28_1.anInt5496 < 512 && Static343.aClass5_Sub28_1.anInt5496 != 0) {
				local12 = false;
			}
			if (Static295.aString75.startsWith("win")) {
				local16 = true;
				local14 = true;
			} else {
				local14 = true;
			}
		}
		if (Static601.aBoolean806) {
			local14 = false;
		}
		if (Static646.aBoolean838) {
			local12 = false;
		}
		if (Static335.aBoolean485) {
			local16 = false;
		}
		if (!local12 && !local14 && !local16) {
			return Static644.method8842();
		}
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		if (local12) {
			try {
				local70 = Static569.method6634(2, 1000);
			} catch (@Pc(81) Exception local81) {
			}
		}
		@Pc(84) int local84 = -1;
		if (local16) {
			try {
				local84 = Static569.method6634(3, 1000);
				if (Static627.aClass5_Sub46_31.aClass11_Sub15_2.method4289() == 3) {
					@Pc(100) Class185 local100 = Static485.aClass126_17.method6980();
					@Pc(105) long local105 = local100.aLong144 & 0xFFFFFFFFFFFFL;
					@Pc(108) int local108 = local100.anInt4673;
					if (local108 == 4318) {
						local14 &= local105 >= 64425238954L;
					} else if (local108 == 4098) {
						local14 &= local105 >= 60129613779L;
					}
				}
			} catch (@Pc(146) Exception local146) {
			}
		}
		if (local14) {
			try {
				local72 = Static569.method6634(1, 1000);
			} catch (@Pc(156) Exception local156) {
			}
		}
		if (local70 == -1 && local72 == -1 && local84 == -1) {
			return Static644.method8842();
		}
		local72 = (int) ((float) local72 * 1.1F);
		local84 = (int) ((float) local84 * 1.1F);
		if (local84 < local70 && local72 < local70) {
			return Static539.method7689(local70);
		} else if (local84 <= local72) {
			return Static559.method7851(local72, 1);
		} else {
			return Static559.method7851(local84, 3);
		}
	}
}
