import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
	public static int anInt9911;

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_93 = new Class269(5, 8);

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_94 = new Class269(49, 3);

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)I")
	public static int method8284() {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Static375.aClass359_4.aBoolean729 && !Static375.aClass359_4.aBoolean728) {
			local5 = true;
			if (Static604.aString98.startsWith("win")) {
				local7 = true;
				local9 = true;
			} else {
				local7 = true;
			}
		}
		if (Static225.aBoolean388) {
			local9 = false;
		}
		if (Static288.aBoolean414) {
			local7 = false;
		}
		if (Static638.aBoolean590) {
			local5 = false;
		}
		if (!local5 && !local7 && !local9) {
			return Static180.method3292();
		}
		@Pc(56) int local56 = -1;
		@Pc(58) int local58 = -1;
		if (local5) {
			try {
				local56 = Static573.method7871(2, 1000);
			} catch (@Pc(67) Exception local67) {
			}
		}
		@Pc(70) int local70 = -1;
		if (local9) {
			try {
				local70 = Static573.method7871(3, 1000);
				if (Static404.aClass2_Sub13_2.aClass33_Sub24_1.method7329() == 3) {
					@Pc(86) Class306 local86 = Static600.aClass87_15.method7942();
					@Pc(91) long local91 = local86.aLong241 & 0xFFFFFFFFFFFFL;
					@Pc(94) int local94 = local86.anInt8691;
					if (local94 == 4318) {
						local7 &= local91 >= 64425238954L;
					} else if (local94 == 4098) {
						local7 &= local91 >= 60129613779L;
					}
				}
			} catch (@Pc(128) Exception local128) {
			}
		}
		if (local7) {
			try {
				local58 = Static573.method7871(1, 1000);
			} catch (@Pc(138) Exception local138) {
			}
		}
		if (local56 == -1 && local58 == -1 && local70 == -1) {
			return Static180.method3292();
		}
		local70 = (int) ((float) local70 * 1.1F);
		local58 = (int) ((float) local58 * 1.1F);
		if (local56 > local70 && local58 < local56) {
			return Static19.method3499(local56);
		} else if (local58 >= local70) {
			return Static223.method3807(local58, 1);
		} else {
			return Static223.method3807(local70, 3);
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method8285(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static446.anInt7901; local9++) {
			if (arg0.equalsIgnoreCase(Static391.aStringArray25[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
