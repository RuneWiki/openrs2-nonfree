import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "Lclient!vw;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_32 = new Class43();

	@OriginalMember(owner = "client!ku", name = "p", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZZII)I")
	public static int method4892(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class8_Sub18 local10 = Static211.method4038(false, arg2);
		if (local10 == null) {
			return 0;
		}
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < local10.anIntArray153.length; local18++) {
			if (local10.anIntArray153[local18] >= 0 && local10.anIntArray153[local18] < Static497.aClass258_21.anInt8017) {
				@Pc(47) Class284 local47 = Static497.aClass258_21.method6652(local10.anIntArray153[local18]);
				@Pc(57) int local57 = local47.method7058(arg1, Static144.aClass274_1.method6933(arg1).anInt3023);
				if (arg0) {
					local16 += local57 * local10.anIntArray154[local18];
				} else {
					local16 += local57;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lclient!gh;I)[Lclient!vj;")
	public static Class358[] method4893(@OriginalArg(0) Class118 arg0) {
		if (!arg0.method3411()) {
			return new Class358[0];
		}
		@Pc(16) Class301 local16 = arg0.method3395();
		while (local16.anInt8915 == 0) {
			Static214.method4061(10L);
		}
		if (local16.anInt8915 == 2) {
			return new Class358[0];
		}
		@Pc(35) int[] local35 = (int[]) local16.anObject18;
		@Pc(41) Class358[] local41 = new Class358[local35.length >> 2];
		for (@Pc(43) int local43 = 0; local43 < local41.length; local43++) {
			@Pc(49) Class358 local49 = new Class358();
			local41[local43] = local49;
			local49.anInt10258 = local35[local43 << 2];
			local49.anInt10252 = local35[(local43 << 2) + 1];
			local49.anInt10255 = local35[(local43 << 2) + 2];
			local49.anInt10253 = local35[(local43 << 2) + 3];
		}
		return local41;
	}
}
