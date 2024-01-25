import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "Lclient!vd;")
	public static Class353 aClass353_21;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "Lclient!pha;")
	public static final Class256 aClass256_1 = new Class256();

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "Lclient!mia;")
	public static final Class208 aClass208_20 = new Class208(22, 2);

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "I")
	public static int anInt2256 = 0;

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "[B")
	public static final byte[] aByteArray40 = new byte[2048];

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "[Lclient!ph;")
	public static final Class255[] aClass255Array1 = new Class255[6];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)I")
	public static int method1889() {
		@Pc(12) boolean local12 = false;
		@Pc(14) boolean local14 = false;
		@Pc(16) boolean local16 = false;
		if (Static529.aClass112_6.aBoolean263 && !Static529.aClass112_6.aBoolean264) {
			local12 = true;
			if (Static428.aClass6_Sub28_1.anInt6061 < 512 && Static428.aClass6_Sub28_1.anInt6061 != 0) {
				local12 = false;
			}
			if (Static177.aString41.startsWith("win")) {
				local14 = true;
				local16 = true;
			} else {
				local14 = true;
			}
		}
		if (Static146.aBoolean366) {
			local14 = false;
		}
		if (Static551.aBoolean641) {
			local16 = false;
		}
		if (Static130.aBoolean182) {
			local12 = false;
		}
		if (!local12 && !local14 && !local16) {
			return Static515.method7729();
		}
		@Pc(70) int local70 = -1;
		@Pc(72) int local72 = -1;
		if (local12) {
			try {
				local70 = Static385.method6196(2, 1000);
			} catch (@Pc(81) Exception local81) {
			}
		}
		@Pc(84) int local84 = -1;
		if (local16) {
			try {
				local84 = Static385.method6196(3, 1000);
				if (Static348.aClass6_Sub22_19.aClass15_Sub22_2.method6681() == 3) {
					@Pc(102) Class168 local102 = Static162.aClass100_7.method8779();
					@Pc(107) long local107 = local102.aLong142 & 0xFFFFFFFFFFFFL;
					@Pc(110) int local110 = local102.anInt5423;
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
				local72 = Static385.method6196(1, 1000);
			} catch (@Pc(156) Exception local156) {
			}
		}
		if (local70 == -1 && local72 == -1 && local84 == -1) {
			return Static515.method7729();
		}
		local72 = (int) ((float) local72 * 1.1F);
		local84 = (int) ((float) local84 * 1.1F);
		if (local70 > local84 && local72 < local70) {
			return Static78.method1372(local70);
		} else if (local72 < local84) {
			return Static648.method9033(3, local84);
		} else {
			return Static648.method9033(1, local72);
		}
	}
}
