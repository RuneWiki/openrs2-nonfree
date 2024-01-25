import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!tl", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas13;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V")
	public static void method7714() {
		if (Static77.anIntArray92 != null) {
			return;
		}
		Static77.anIntArray92 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(79) double local79;
				if (local57 < 0.5D) {
					local79 = (local50 + 1.0D) * local57;
				} else {
					local79 = local50 + local57 - local57 * local50;
				}
				@Pc(94) double local94 = local57 * 2.0D - local79;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local98 * 6.0D < 1.0D) {
					local59 = local94 + local98 * (local79 - local94) * 6.0D;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local79;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = (local79 - local94) * (0.6666666666666666D - local98) * 6.0D + local94;
				} else {
					local59 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local39 * 6.0D * (local79 - local94) + local94;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local94 + (0.6666666666666666D - local39) * (-local94 + local79) * 6.0D;
				} else {
					local61 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = local94 + local112 * 6.0D * (local79 - local94);
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local112) * 6.0D * (local79 - local94) + local94;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local19);
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			@Pc(294) int local294 = (int) (local59 * 256.0D);
			@Pc(299) int local299 = (int) (local61 * 256.0D);
			@Pc(304) int local304 = (int) (local63 * 256.0D);
			@Pc(314) int local314 = (local294 << 16) + (local299 << 8) + local304;
			Static77.anIntArray92[local26] = local314;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lclient!oh;BI)Lclient!ur;")
	public static Class345 method7716(@OriginalArg(0) Class237 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method6305(arg1);
		return local8 == null ? null : new Class345(local8);
	}
}
