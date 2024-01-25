import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!gfa", name = "B", descriptor = "Lclient!pk;")
	public static Interface20 anInterface20_1;

	@OriginalMember(owner = "client!gfa", name = "y", descriptor = "I")
	public static int anInt3707 = 0;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B[B)V")
	public static void method3293(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class6_Sub40 local10 = new Class6_Sub40(arg0);
		@Pc(12) boolean local12 = false;
		while (true) {
			while (true) {
				@Pc(16) int local16 = local10.method8604();
				if (local16 == 0) {
					if (!local12) {
						if (Static183.anIntArray225 == null) {
							Static637.anInt10653 = 4;
							Static94.anIntArray123 = new int[4];
							Static183.anIntArray225 = new int[4];
						}
						for (local16 = 0; local16 < Static183.anIntArray225.length; local16++) {
							Static183.anIntArray225[local16] = 0;
							Static94.anIntArray123[local16] = local16 * 20;
						}
					}
					return;
				}
				if (local16 == 1) {
					if (Static183.anIntArray225 == null) {
						Static94.anIntArray123 = new int[4];
						Static183.anIntArray225 = new int[4];
						Static637.anInt10653 = 4;
					}
					local12 = true;
					for (@Pc(63) int local63 = 0; local63 < Static183.anIntArray225.length; local63++) {
						Static183.anIntArray225[local63] = local10.method8615();
						Static94.anIntArray123[local63] = local10.method8615();
					}
				} else if (local16 == 2) {
					Static247.anInt4939 = local10.method8571();
				} else if (local16 == 3) {
					Static637.anInt10653 = local10.method8604();
					Static94.anIntArray123 = new int[Static637.anInt10653];
					Static183.anIntArray225 = new int[Static637.anInt10653];
				}
			}
		}
	}

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "(Z)V")
	public static void method3295() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(16) Runtime local16 = Runtime.getRuntime();
					@Pc(22) Integer local22 = (Integer) local12.invoke(local16, (Object[]) null);
					Static90.anInt1831 = local22;
				} catch (@Pc(27) Throwable local27) {
				}
			}
		} catch (@Pc(29) Exception local29) {
		}
	}

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "(I)V")
	public static void method3296() {
		if (Static91.anIntArray99 != null) {
			return;
		}
		Static91.anIntArray99 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = (local50 + 1.0D) * local57;
				} else {
					local80 = local50 + local57 - local50 * local57;
				}
				@Pc(95) double local95 = local57 * 2.0D - local80;
				@Pc(99) double local99 = local39 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local39 - 0.3333333333333333D;
				if (local113 < 0.0D) {
					local113++;
				}
				if (local99 * 6.0D < 1.0D) {
					local59 = local95 + local99 * 6.0D * (local80 - local95);
				} else if (local99 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local99 * 3.0D < 2.0D) {
					local59 = local95 + (0.6666666666666666D - local99) * 6.0D * (local80 - local95);
				} else {
					local59 = local95;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local95 + local39 * (local80 - local95) * 6.0D;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local95 + (0.6666666666666666D - local39) * 6.0D * (local80 - local95);
				} else {
					local61 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local63 = local113 * 6.0D * (local80 - local95) + local95;
				} else if (local113 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local113 * 3.0D < 2.0D) {
					local63 = (local80 - local95) * 6.0D * (0.6666666666666666D - local113) + local95;
				} else {
					local63 = local95;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(292) int local292 = (int) (local59 * 256.0D);
			@Pc(297) int local297 = (int) (local61 * 256.0D);
			@Pc(302) int local302 = (int) (local63 * 256.0D);
			@Pc(313) int local313 = (local292 << 16) - (-(local297 << 8) - local302);
			Static91.anIntArray99[local26] = local313;
		}
	}
}
