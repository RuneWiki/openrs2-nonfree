import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!ih;")
	public static Class116 aClass116_6;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!qc;")
	public static Class203 aClass203_1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[F")
	public static final float[] aFloatArray5 = new float[16];

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray3 = new boolean[8];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method964() {
		if (Static165.aFloat28 < 1024.0F) {
			Static165.aFloat28 = 1024.0F;
		}
		if (Static165.aFloat28 > 3072.0F) {
			Static165.aFloat28 = 3072.0F;
		}
		while (Static265.aFloat51 >= 16384.0F) {
			Static265.aFloat51 -= 16384.0F;
		}
		while (Static265.aFloat51 < 0.0F) {
			Static265.aFloat51 += 16384.0F;
		}
		@Pc(41) int local41 = Static14.anInt435 >> 7;
		@Pc(45) int local45 = Static390.anInt6891 >> 7;
		@Pc(51) int local51 = Static221.method3331(Static388.anInt6870, Static390.anInt6891, Static14.anInt435);
		@Pc(57) int local57 = 0;
		@Pc(85) int local85;
		if (local41 > 3 && local45 > 3 && Static181.anInt3574 - 4 > local41 && Static117.anInt2450 - 4 > local45) {
			for (local85 = local41 - 4; local85 <= local41 + 4; local85++) {
				for (@Pc(91) int local91 = local45 - 4; local91 <= local45 + 4; local91++) {
					@Pc(95) int local95 = Static388.anInt6870;
					if (local95 < 3 && Static313.method4558(local91, local85)) {
						local95++;
					}
					@Pc(106) int local106 = 0;
					if (Static393.aClass115_Sub1_2.aByteArrayArrayArray15 != null && Static393.aClass115_Sub1_2.aByteArrayArrayArray15[local95] != null) {
						local106 = (Static393.aClass115_Sub1_2.aByteArrayArrayArray15[local95][local85][local91] & 0xFF) * 8;
					}
					@Pc(138) int local138 = local106 + local51 - Static55.aClass86Array1[local95].method6594(local85, local91);
					if (local138 > local57) {
						local57 = local138;
					}
				}
			}
		}
		local85 = (local57 >> 0) * 1536;
		if (local85 > 786432) {
			local85 = 786432;
		}
		if (local85 < 262144) {
			local85 = 262144;
		}
		if (local85 > Static98.anInt6274) {
			Static98.anInt6274 += (local85 - Static98.anInt6274) / 24;
		} else if (Static98.anInt6274 > local85) {
			Static98.anInt6274 += (local85 - Static98.anInt6274) / 80;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
	public static void method966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static212.method3218(arg0, 5);
		local13.method3088();
		local13.anInt3749 = arg1;
	}
}
