import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
	public static int anInt6590;

	@OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
	public static int anInt6588 = -1;

	@OriginalMember(owner = "client!ol", name = "i", descriptor = "Lclient!bca;")
	public static final Class3_Sub10 aClass3_Sub10_2 = new Class3_Sub10(0, -1);

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "J")
	public static long aLong187 = 20000000L;

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
	public static int anInt6591 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIZIFBII)[[I")
	public static int[][] method5646(@OriginalArg(5) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class3_Sub1_Sub26 local18 = new Class3_Sub1_Sub26();
		local18.anInt5928 = 4;
		local18.anInt5925 = (int) (arg0 * 4096.0F);
		local18.anInt5919 = 3;
		local18.aBoolean479 = false;
		local18.anInt5931 = 4;
		local18.method7763();
		Static296.method4706(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method5121(local45, local14[local45]);
		}
		return local14;
	}
}
