import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
	public static int anInt6155;

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([ILclient!qo;IZI)V")
	public static void method5544(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class60_Sub1_Sub1_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(6) boolean local6;
		@Pc(8) int local8;
		if (arg1.anIntArray256 != null) {
			local6 = true;
			for (local8 = 0; local8 < arg1.anIntArray256.length; local8++) {
				if (arg1.anIntArray256[local8] != arg0[local8]) {
					local6 = false;
					break;
				}
			}
			@Pc(39) Class104 local39 = arg1.aClass104_8;
			if (local6 && local39.method9030()) {
				@Pc(54) Class212 local54 = arg1.aClass104_8.method9041();
				@Pc(57) int local57 = local54.anInt5520;
				if (local57 == 1) {
					local39.method9018(arg2);
				}
				if (local57 == 2) {
					local39.method9034();
				}
			}
		}
		local6 = true;
		for (local8 = 0; local8 < arg0.length; local8++) {
			if (arg0[local8] != -1) {
				local6 = false;
			}
			if (arg1.anIntArray256 == null || arg1.anIntArray256[local8] == -1 || Static444.aClass68_3.method1286(arg0[local8]).anInt5523 >= Static444.aClass68_3.method1286(arg1.anIntArray256[local8]).anInt5523) {
				arg1.anIntArray256 = arg0;
				arg1.aClass104_8.method9037(arg2);
				if (arg3) {
					arg1.anInt4880 = arg1.anInt4879;
				}
			}
		}
		if (!local6) {
			return;
		}
		arg1.anIntArray256 = arg0;
		arg1.aClass104_8.method9037(arg2);
		if (arg3) {
			arg1.anInt4880 = arg1.anInt4879;
			return;
		}
	}
}
