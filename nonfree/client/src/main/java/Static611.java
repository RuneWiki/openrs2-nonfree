import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static611 {

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "[Lclient!cw;")
	public static Class61[] aClass61Array16;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "J")
	public static long aLong263;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_127 = new Class179(56, 15);

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Lclient!mha;")
	public static final Class222 aClass222_19 = new Class222(8, 0, 4, 1);

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "[I")
	public static final int[] anIntArray676 = new int[13];

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([[BLclient!tp;B)V")
	public static void method8221(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class275_Sub1 arg1) {
		@Pc(16) int local16 = Static403.aByteArrayArray22.length;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) byte[] local24 = arg0[local18];
			if (local24 != null) {
				@Pc(37) int local37 = (Static407.anIntArray620[local18] >> 8) * 64 - Static132.anInt2246;
				@Pc(48) int local48 = (Static407.anIntArray620[local18] & 0xFF) * 64 - Static123.anInt2176;
				Static48.method803();
				arg1.method7622(Static230.aClass240Array1, Static192.aClass95_4, local37, local24, local48);
			}
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)I")
	public static int method8223() {
		return Static607.anInt9768++;
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[SI)[S")
	public static short[] method8226(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static653.method5394(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
	public static void method8227() {
		@Pc(7) Class92 local7 = null;
		try {
			@Pc(17) Class108 local17 = Static452.aClass226_6.method4858("2");
			while (local17.anInt2766 == 0) {
				Static444.method6061(1L);
			}
			if (local17.anInt2766 == 1) {
				local7 = (Class92) local17.anObject6;
				@Pc(41) byte[] local41 = new byte[(int) local7.method1846()];
				@Pc(55) int local55;
				for (@Pc(43) int local43 = 0; local43 < local41.length; local43 += local55) {
					local55 = local7.method1843(local41, local43, local41.length - local43);
					if (local55 == -1) {
						throw new IOException("EOF");
					}
				}
				Static468.method6319(new Class2_Sub22(local41));
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local7 != null) {
				local7.method1845();
			}
		} catch (@Pc(90) Exception local90) {
		}
	}
}
