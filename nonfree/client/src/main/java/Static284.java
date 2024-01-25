import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!of", name = "t", descriptor = "I")
	public static int anInt5213;

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_167 = new Class92(32, -1);

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
	public static boolean aBoolean385 = true;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	public static int anInt5211 = 0;

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_170 = new Class175("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!jd;")
	public static final Class119 aClass119_14 = new Class119(6, 0, 4, 2);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!tn;ZLclient!qa;Lclient!cc;)V")
	public static void method4172(@OriginalArg(0) Class223 arg0, @OriginalArg(2) Class75 arg1, @OriginalArg(3) Class3_Sub8 arg2) {
		@Pc(10) Class22 local10 = arg0.method5285(arg1);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.UA();
		if (local10.qa() > local16) {
			local16 = local10.qa();
		}
		@Pc(28) int local28 = arg2.anInt1151;
		@Pc(31) int local31 = arg2.anInt1155;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 0;
		@Pc(51) int local51;
		@Pc(74) int local74;
		if (arg0.aString61 != null) {
			local33 = Static87.aClass179_7.method4391(null, null, arg0.aString61, Static328.aStringArray143);
			for (local51 = 0; local51 < local33; local51++) {
				@Pc(57) String local57 = Static328.aStringArray143[local51];
				if (local33 - 1 > local51) {
					local57 = local57.substring(0, local57.length() - 4);
				}
				local74 = Static265.aClass244_12.method5568(local57);
				if (local35 < local74) {
					local35 = local74;
				}
			}
			local37 = Static265.aClass244_12.method5574() * local33 + Static265.aClass244_12.method5572() / 2;
		}
		local51 = arg2.anInt1151 + local16 / 2;
		if (local28 < Static210.anInt7498 + local16) {
			local28 = Static210.anInt7498;
			local51 = local35 / 2 + Static210.anInt7498 + local16 / 2 + 5 + 10;
		} else if (Static210.anInt7494 - local16 < local28) {
			local28 = Static210.anInt7494 - local16;
			local51 = Static210.anInt7494 - local16 / 2 - local35 / 2 - 10 - 5;
		}
		@Pc(165) int local165 = arg2.anInt1155;
		if (Static210.anInt7503 + local16 > local31) {
			local165 = Static210.anInt7503 + local16 / 2 + 10;
			local31 = Static210.anInt7503;
		} else if (Static210.anInt7500 - local16 < local31) {
			local165 = Static210.anInt7500 - local37 - local16 / 2 - 10;
			local31 = Static210.anInt7500 - local16;
		}
		local74 = (int) (Math.atan2((double) (local28 - arg2.anInt1151), (double) (local31 - arg2.anInt1155)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method6069((float) local16 / 2.0F + (float) local28, (float) local31 + (float) local16 / 2.0F, 4096, local74);
		@Pc(250) int local250 = -2;
		@Pc(252) int local252 = -2;
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		if (arg0.aString61 != null) {
			local250 = local51 - local35 / 2 - 5;
			local252 = local165;
			local264 = local165 + local33 * Static265.aClass244_12.method5574() + 3;
			local262 = local250 + local35 + 10;
			if (arg0.anInt6711 != 0) {
				arg1.method2600(local264 - local165, local250, local262 - local250, local165, arg0.anInt6711);
			}
			if (arg0.anInt6736 != 0) {
				arg1.method2625(arg0.anInt6736, local165, local264 - local165, -local250 + local262, local250);
			}
			for (@Pc(333) int local333 = 0; local333 < local33; local333++) {
				@Pc(339) String local339 = Static328.aStringArray143[local333];
				if (local33 - 1 > local333) {
					local339 = local339.substring(0, local339.length() - 4);
				}
				Static265.aClass244_12.method5569(arg1, local339, local51, local165, arg0.anInt6715);
				local165 += Static265.aClass244_12.method5574();
			}
		}
		if (arg0.anInt6703 == -1 && arg0.aString61 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(395) Class3_Sub41 local395 = new Class3_Sub41(arg2);
		local395.anInt6768 = local28 - local16;
		local395.anInt6763 = local31 - local16;
		local395.anInt6770 = local31 + local16;
		local395.anInt6774 = local250;
		local395.anInt6775 = local264;
		local395.anInt6762 = local16 + local28;
		local395.anInt6771 = local252;
		local395.anInt6773 = local262;
		Static316.aClass229_35.method5321(local395);
	}
}
