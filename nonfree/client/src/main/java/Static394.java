import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!nda", name = "F", descriptor = "Z")
	public static boolean aBoolean445;

	@OriginalMember(owner = "client!nda", name = "G", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_92 = new Class218(20, 8);

	@OriginalMember(owner = "client!nda", name = "H", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!nda", name = "I", descriptor = "I")
	public static int anInt6210 = 0;

	@OriginalMember(owner = "client!nda", name = "J", descriptor = "[I")
	public static final int[] anIntArray548 = new int[250];

	@OriginalMember(owner = "client!nda", name = "K", descriptor = "Lclient!naa;")
	public static final Class232 aClass232_3 = new Class232();

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIII)V")
	public static void method5571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		Static483.method7014(Static392.anIntArrayArray39[arg2], arg0 - arg3, arg0 - -arg3, arg1);
		@Pc(32) int local32 = -1;
		while (local9 > local7) {
			local32 += 2;
			local7++;
			local12 += local32;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(59) int[] local59 = Static392.anIntArrayArray39[arg2 + local9];
				@Pc(66) int[] local66 = Static392.anIntArrayArray39[arg2 - local9];
				@Pc(70) int local70 = arg0 + local7;
				@Pc(75) int local75 = arg0 - local7;
				Static483.method7014(local59, local75, local70, arg1);
				Static483.method7014(local66, local75, local70, arg1);
			}
			@Pc(91) int local91 = local9 + arg0;
			@Pc(96) int local96 = arg0 - local9;
			@Pc(102) int[] local102 = Static392.anIntArrayArray39[local7 + arg2];
			@Pc(109) int[] local109 = Static392.anIntArrayArray39[arg2 - local7];
			Static483.method7014(local102, local96, local91, arg1);
			Static483.method7014(local109, local96, local91, arg1);
		}
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(Lclient!aj;I)I")
	public static int method5572(@OriginalArg(0) Class15 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method526(Static13.anInt137)) {
			local5++;
		}
		if (arg0.method526(Static249.anInt4512)) {
			local5++;
		}
		if (arg0.method526(Static473.anInt7803)) {
			local5++;
		}
		if (arg0.method526(Static180.anInt3541)) {
			local5++;
		}
		if (arg0.method526(Static447.anInt7409)) {
			local5++;
		}
		if (arg0.method526(Static274.anInt4797)) {
			local5++;
		}
		if (arg0.method526(Static448.anInt7415)) {
			local5++;
		}
		if (arg0.method526(Static415.anInt6638)) {
			local5++;
		}
		if (arg0.method526(Static498.anInt10142)) {
			local5++;
		}
		if (arg0.method526(Static25.anInt546)) {
			local5++;
		}
		if (arg0.method526(Static276.anInt4805)) {
			local5++;
		}
		if (arg0.method526(Static585.anInt9440)) {
			local5++;
		}
		if (arg0.method526(Static653.anInt10389)) {
			local5++;
		}
		if (arg0.method526(Static268.anInt4735)) {
			local5++;
		}
		if (arg0.method526(Static480.anInt7975)) {
			local5++;
		}
		if (arg0.method526(Static675.anInt10881)) {
			local5++;
		}
		return local5;
	}
}
