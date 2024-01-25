import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "Lclient!n;")
	public static Interface11 anInterface11_14;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_92 = new Class77(60, 4);

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "F")
	public static float aFloat194 = 0.25F;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_278 = new Class88("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "Z")
	public static boolean aBoolean673 = false;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_151 = new Class45(33, 0);

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "[I")
	public static final int[] anIntArray686 = new int[32];

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "[I")
	public static final int[] anIntArray687 = new int[8];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([BB)[B")
	public static byte[] method7853(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static554.method3498(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public static boolean method7857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static403.method6321(arg1, arg0) & Static201.method3810(arg1, arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;IZLclient!an;)Lclient!ji;")
	public static Class159 method7862(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class16 arg2) {
		@Pc(10) int local10 = arg2.method420(arg0);
		if (local10 == -1) {
			return new Class159(0);
		}
		@Pc(23) int[] local23 = arg2.method387(local10);
		@Pc(29) Class159 local29 = new Class159(local23.length);
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local36 < local29.anInt4868) {
				@Pc(52) Class12_Sub8 local52 = new Class12_Sub8(arg2.method408(local10, local23[local38++]));
				@Pc(56) int local56 = local52.method5225();
				@Pc(60) int local60 = local52.method5199();
				@Pc(64) int local64 = local52.method5216();
				if (!arg1 && local64 == 1) {
					local29.anInt4868--;
				} else {
					local29.anIntArray346[local36] = local56;
					local29.anIntArray347[local36] = local60;
					local36++;
				}
			}
			return local29;
		}
	}
}
