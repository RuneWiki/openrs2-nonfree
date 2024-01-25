import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_189 = new Class150(99, -2);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)I")
	public static int method6250(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local30 > local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local46 != local32) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(155) int local155 = (int) (local60 * 256.0D);
		@Pc(160) int local160 = (int) (local62 * 256.0D);
		if (local160 < 0) {
			local160 = 0;
		} else if (local160 > 255) {
			local160 = 255;
		}
		@Pc(181) int local181 = (int) (local68 * 256.0D);
		if (local181 < 0) {
			local181 = 0;
		} else if (local181 > 255) {
			local181 = 255;
		}
		if (local181 > 243) {
			local160 >>= 0x4;
		} else if (local181 > 217) {
			local160 >>= 0x3;
		} else if (local181 > 192) {
			local160 >>= 0x2;
		} else if (local181 > 179) {
			local160 >>= 0x1;
		}
		return (local181 >> 1) + (local160 >> 5 << 7) + ((local155 >> 2 & 0x3F) << 10);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "([Lclient!ha;B)V")
	public static void method6255(@OriginalArg(0) Class25[] arg0) {
		Static435.anInt7669 = arg0.length;
		Static372.aClass25Array8 = new Class25[Static435.anInt7669 + 10];
		Static208.anIntArray276 = new int[Static435.anInt7669 + 10];
		Static553.method2531(arg0, 0, Static372.aClass25Array8, 0, Static435.anInt7669);
		for (@Pc(26) int local26 = 0; local26 < Static435.anInt7669; local26++) {
			Static208.anIntArray276[local26] = Static372.aClass25Array8[local26].ma();
		}
		for (@Pc(45) int local45 = Static435.anInt7669; local45 < Static372.aClass25Array8.length; local45++) {
			Static208.anIntArray276[local45] = 12;
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method6256() {
		@Pc(11) Class97 local11 = null;
		try {
			@Pc(17) Class83 local17 = Static159.aClass9_10.method293(true, "2");
			while (local17.anInt2495 == 0) {
				Static213.method3465(1L);
			}
			if (local17.anInt2495 == 1) {
				local11 = (Class97) local17.anObject8;
				@Pc(41) byte[] local41 = new byte[(int) local11.method2500()];
				@Pc(56) int local56;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local56) {
					local56 = local11.method2501(local41, local41.length - local43, local43);
					if (local56 == -1) {
						throw new IOException("EOF");
					}
				}
				Static138.method2579(new Class5_Sub3(local41));
			}
		} catch (@Pc(80) Exception local80) {
		}
		try {
			if (local11 != null) {
				local11.method2499();
			}
		} catch (@Pc(87) Exception local87) {
		}
	}
}
