import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "Lclient!im;")
	public static final Class140 aClass140_20 = new Class140(65, -2);

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method1093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(8) char[] local8 = new char[arg1];
		@Pc(15) int local15 = 0;
		@Pc(20) int local20 = arg0 + arg1;
		for (@Pc(22) int local22 = arg0; local22 < local20; local22++) {
			@Pc(30) int local30 = arg2[local22] & 0xFF;
			if (local30 < 128) {
				local8[local15++] = (char) local30;
			} else if (local30 >= 194) {
				@Pc(70) int local70;
				if (local30 < 224) {
					if (local20 <= local22 + 1) {
						throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
					}
					local22++;
					local70 = arg2[local22] & 0xFF;
					if (local70 < 128 || local70 > 191) {
						throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
					}
					local8[local15++] = (char) ((local30 & 0x3FFFF3F) << 6 | local70 & 0xFFFFFF7F);
				} else if (local30 < 240) {
					if (local20 <= local22 + 2) {
						throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
					}
					local22++;
					local70 = arg2[local22] & 0xFF;
					if (local70 < 128 || local70 > 191) {
						throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
					}
					local22++;
					@Pc(162) int local162 = arg2[local22] & 0xFF;
					if (local162 < 128 || local162 > 191) {
						throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
					}
					local8[local15++] = (char) (local162 & 0xFFFFFF7F | (local30 & 0xFFFFFF1F) << 12 | (local70 & 0x3FFFF7F) << 6);
				} else if (local30 < 244) {
					throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
				} else {
					throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + local30);
				}
			} else {
				throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + local30);
			}
		}
		return new String(local8, 0, local15);
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(BIIIIII)V")
	public static void method1094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(22) int local22 = Static400.method6041(arg4, Static205.anInt4042, Static99.anInt1988);
		@Pc(28) int local28 = Static400.method6041(arg0, Static205.anInt4042, Static99.anInt1988);
		@Pc(34) int local34 = Static400.method6041(arg1, Static216.anInt4203, Static358.anInt8908);
		@Pc(40) int local40 = Static400.method6041(arg3, Static216.anInt4203, Static358.anInt8908);
		@Pc(48) int local48 = Static400.method6041(arg4 + arg2, Static205.anInt4042, Static99.anInt1988);
		@Pc(57) int local57 = Static400.method6041(arg0 - arg2, Static205.anInt4042, Static99.anInt1988);
		for (@Pc(59) int local59 = local22; local59 < local48; local59++) {
			Static424.method6216(local40, arg5, local34, Static447.anIntArrayArray99[local59]);
		}
		for (@Pc(79) int local79 = local28; local79 > local57; local79--) {
			Static424.method6216(local40, arg5, local34, Static447.anIntArrayArray99[local79]);
		}
		@Pc(102) int local102 = Static400.method6041(arg1 + arg2, Static216.anInt4203, Static358.anInt8908);
		@Pc(111) int local111 = Static400.method6041(arg3 - arg2, Static216.anInt4203, Static358.anInt8908);
		for (@Pc(113) int local113 = local48; local113 <= local57; local113++) {
			@Pc(119) int[] local119 = Static447.anIntArrayArray99[local113];
			Static424.method6216(local102, arg5, local34, local119);
			Static424.method6216(local40, arg5, local111, local119);
		}
	}
}
