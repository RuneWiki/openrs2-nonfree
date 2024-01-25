import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static567 {

	@OriginalMember(owner = "client!uba", name = "V", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_86 = new Class181(54, -1);

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(BIIZFIIII)[[I")
	public static int[][] method8016(@OriginalArg(4) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class5_Sub2_Sub1 local13 = new Class5_Sub2_Sub1();
		local13.aBoolean8 = false;
		local13.anInt215 = 4;
		local13.anInt212 = (int) (arg0 * 4096.0F);
		local13.anInt210 = 3;
		local13.anInt209 = 4;
		local13.method8819();
		Static114.method1654(256, 64);
		for (@Pc(42) int local42 = 0; local42 < 256; local42++) {
			local13.method228(local42, local9[local42]);
		}
		return local9;
	}

	@OriginalMember(owner = "client!uba", name = "b", descriptor = "(III)Z")
	public static boolean method8018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)Z")
	public static boolean method8019(@OriginalArg(0) int arg0) {
		if (Static128.aBooleanArray12[arg0]) {
			return true;
		} else if (Static42.aClass384_21.method8869(arg0)) {
			@Pc(23) int local23 = Static42.aClass384_21.method8862(arg0);
			if (local23 == 0) {
				Static128.aBooleanArray12[arg0] = true;
				return true;
			}
			if (Static441.aClass357ArrayArray1[arg0] == null) {
				Static441.aClass357ArrayArray1[arg0] = new Class357[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static441.aClass357ArrayArray1[arg0][local47] == null) {
					@Pc(61) byte[] local61 = Static42.aClass384_21.method8885(arg0, local47);
					if (local61 != null) {
						@Pc(73) Class357 local73 = Static441.aClass357ArrayArray1[arg0][local47] = new Class357();
						local73.anInt9804 = (arg0 << 16) + local47;
						if (local61[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local73.method8396(new Class5_Sub12(local61));
					}
				}
			}
			Static128.aBooleanArray12[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uba", name = "c", descriptor = "(III)V")
	public static void method8021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub40 local12 = Static25.method507(Static98.aClass208_2, Static350.aClass181_47);
		local12.aClass5_Sub12_Sub2_2.method8622(arg0);
		local12.aClass5_Sub12_Sub2_2.method8596(arg1);
		Static612.method8496(local12);
	}
}
