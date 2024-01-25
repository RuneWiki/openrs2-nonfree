import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!jfa", name = "y", descriptor = "J")
	public static long aLong125;

	@OriginalMember(owner = "client!jfa", name = "B", descriptor = "[I")
	public static int[] anIntArray281;

	@OriginalMember(owner = "client!jfa", name = "f", descriptor = "Lclient!ffa;")
	public static final Class94 aClass94_3 = new Class94(128);

	@OriginalMember(owner = "client!jfa", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger3 = new BigInteger("b10f43c90b04f222de60a23d3d923dc957324bd33fdff6d8ae8b54859b0e6baa640c45bf425d0562bc03a4667608651cc5576ba020a4985502a91635c8b94145", 16);

	@OriginalMember(owner = "client!jfa", name = "A", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_72 = new Class47(75, -1);

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIII)V")
	public static void method4044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(19) int local19 = Static140.aClass6_Sub48_Sub1_1.anInt8993 * arg0 >> 8;
		if (local19 != 0 && arg2 != -1) {
			Static390.method5735(arg2, local19, Static540.aClass251_59);
			Static422.aBoolean507 = true;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "([BIII)Ljava/lang/String;")
	public static String method4045(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) char[] local8 = new char[arg2];
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 + arg2;
		for (@Pc(22) int local22 = arg1; local22 < local15; local22++) {
			@Pc(30) int local30 = arg0[local22] & 0xFF;
			if (local30 < 128) {
				local8[local10++] = (char) local30;
			} else if (local30 >= 194) {
				@Pc(92) int local92;
				if (local30 >= 224) {
					if (local30 >= 240) {
						if (local30 < 244) {
							throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
						}
						throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local30);
					}
					if (local22 + 2 >= local15) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local22++;
					local92 = arg0[local22] & 0xFF;
					if (local92 < 128 || local92 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local22++;
					@Pc(114) int local114 = arg0[local22] & 0xFF;
					if (local114 < 128 || local114 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local114 & 0xFFFFFF7F | (local30 & 0xFFFFFF1F) << 12 | (local92 & 0xFFFFFF7F) << 6);
				} else if (local22 + 1 < local15) {
					local22++;
					local92 = arg0[local22] & 0xFF;
					if (local92 < 128 || local92 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local10++] = (char) (local92 & 0xFFFFFF7F | (local30 & 0x3FFFF3F) << 6);
				} else {
					throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local30);
			}
		}
		return new String(local8, 0, local10);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(Lclient!pfa;BLclient!e;)V")
	public static void method4051(@OriginalArg(0) Class251 arg0, @OriginalArg(2) Interface4 arg1) {
		Static116.anInterface4_5 = arg1;
		Static447.aClass251_102 = arg0;
	}
}
