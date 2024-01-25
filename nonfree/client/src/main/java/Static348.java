import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!r", name = "d", descriptor = "[B")
	public static final byte[] aByteArray79 = new byte[2048];

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!jp;B)V")
	public static void method4537(@OriginalArg(0) Class1_Sub19_Sub2 arg0) {
		arg0.method2941();
		@Pc(10) int local10 = Static220.anInt4038;
		@Pc(20) Class11_Sub1_Sub3_Sub2 local20 = Static94.aClass11_Sub1_Sub3_Sub2_1 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local10] = new Class11_Sub1_Sub3_Sub2();
		local20.anInt3279 = local10;
		@Pc(28) int local28 = arg0.method2946(30);
		@Pc(41) byte local41 = (byte) (local28 >> 28);
		@Pc(47) int local47 = local28 >> 14 & 0x3FFF;
		@Pc(51) int local51 = local28 & 0x3FFF;
		local20.anIntArray246[0] = local47 - Static315.anInt5207;
		local20.anInt6428 = (local20.anIntArray246[0] << 7) + (local20.method2635() << 6);
		local20.anIntArray247[0] = local51 - Static47.anInt676;
		local20.anInt6430 = (local20.anIntArray247[0] << 7) + (local20.method2635() << 6);
		Static390.anInt6272 = local20.aByte90 = local41;
		if (Static351.aClass1_Sub19Array1[local10] != null) {
			local20.method2649(Static351.aClass1_Sub19Array1[local10]);
		}
		Static103.anInt6434 = 0;
		Static56.anIntArray110[Static103.anInt6434++] = local10;
		Static207.aByteArray40[local10] = 0;
		Static260.anInt4568 = 0;
		for (@Pc(129) int local129 = 1; local129 < 2048; local129++) {
			if (local10 != local129) {
				@Pc(139) int local139 = arg0.method2946(18);
				@Pc(143) int local143 = local139 >> 16;
				@Pc(149) int local149 = local139 >> 8 & 0xFF;
				@Pc(153) int local153 = local139 & 0xFF;
				@Pc(161) Class70 local161 = Static393.aClass70Array1[local129] = new Class70();
				local161.anInt1295 = 0;
				local161.anInt1296 = -1;
				local161.anInt1299 = local153 + (local143 << 28) + (local149 << 14);
				local161.aBoolean150 = false;
				Static10.anIntArray386[Static260.anInt4568++] = local129;
				Static207.aByteArray40[local129] = 0;
			}
		}
		arg0.method2940();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method4538(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
	public static void method4539() {
		@Pc(7) Class235 local7 = null;
		try {
			@Pc(13) Class253 local13 = Static259.aClass177_2.method3832(false, "3");
			while (local13.anInt6669 == 0) {
				Static331.method4343(1L);
			}
			if (local13.anInt6669 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class235) local13.anObject9;
			@Pc(45) byte[] local45 = new byte[(int) local7.method4941()];
			if (local45.length == 0) {
				Static244.aString3 = "";
				Static290.aString53 = "";
			} else {
				@Pc(72) int local72;
				for (@Pc(59) int local59 = 0; local59 < local45.length; local59 += local72) {
					local72 = local7.method4940(local59, local45, local45.length - local59);
					if (local72 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(93) Class1_Sub19 local93 = new Class1_Sub19(local45);
				@Pc(97) int local97 = local93.method2915();
				if (local97 > 50) {
					throw new RuntimeException("Bad length");
				}
				local93.anInt3698 = local97 + 1;
				if (!local93.method2886()) {
					throw new RuntimeException("Invalid CRC");
				}
				local93.anInt3698 = 1;
				@Pc(126) int local126 = local93.method2915();
				if (local126 != 0) {
					throw new RuntimeException("Invalid version " + local126);
				}
				Static290.aString53 = local93.method2924();
				Static244.aString3 = local93.method2924();
			}
		} catch (@Pc(149) Exception local149) {
			Static244.aString3 = "";
			Static290.aString53 = "";
		}
		try {
			if (local7 != null) {
				local7.method4942();
			}
		} catch (@Pc(160) Exception local160) {
		}
	}
}
