import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!li", name = "I", descriptor = "[I")
	public static int[] anIntArray267;

	@OriginalMember(owner = "client!li", name = "M", descriptor = "I")
	public static int anInt3163;

	@OriginalMember(owner = "client!li", name = "O", descriptor = "I")
	public static int anInt3164;

	@OriginalMember(owner = "client!li", name = "L", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!li", name = "N", descriptor = "Lclient!vh;")
	public static Class187 aClass187_85 = new Class187(64);

	@OriginalMember(owner = "client!li", name = "P", descriptor = "Lclient!qb;")
	public static Class142 aClass142_16 = new Class142(16);

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
	public static void method2752() {
		Static299.aClass187_149.method4525();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!lf;I)Ljava/lang/String;")
	public static String method2755(@OriginalArg(0) Class1_Sub14 arg0) {
		return Static115.method2065(arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIZ)Lclient!sb;")
	public static Class1_Sub2_Sub18 method2756(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) int local5 = arg1 << 8 | arg0;
		@Pc(18) Class1_Sub2_Sub18 local18 = (Class1_Sub2_Sub18) Static268.aClass148_11.method3600((long) local5 << 16);
		if (local18 != null) {
			return local18;
		}
		@Pc(32) byte[] local32 = Static162.aClass121_77.method3139(Static162.aClass121_77.method3123(local5));
		if (local32 == null) {
			local5 = arg0 | arg2 + 65536 << 8;
			local18 = (Class1_Sub2_Sub18) Static268.aClass148_11.method3600((long) local5 << 16);
			if (local18 != null) {
				return local18;
			}
			local32 = Static162.aClass121_77.method3139(Static162.aClass121_77.method3123(local5));
			if (local32 == null) {
				local5 = arg0 | 0xFFFF00;
				local18 = (Class1_Sub2_Sub18) Static268.aClass148_11.method3600((long) local5 << 16);
				if (local18 != null) {
					return local18;
				}
				local32 = Static162.aClass121_77.method3139(Static162.aClass121_77.method3123(local5));
				if (local32 == null) {
					return null;
				} else if (local32.length <= 1) {
					return null;
				} else {
					local18 = Static100.method1819(local32);
					local18.anInt4571 = arg0;
					Static268.aClass148_11.method3602(local18, (long) local5 << 16);
					return local18;
				}
			} else if (local32.length <= 1) {
				return null;
			} else {
				local18 = Static100.method1819(local32);
				local18.anInt4571 = arg0;
				Static268.aClass148_11.method3602(local18, (long) local5 << 16);
				return local18;
			}
		} else if (local32.length > 1) {
			local18 = Static100.method1819(local32);
			local18.anInt4571 = arg0;
			Static268.aClass148_11.method3602(local18, (long) local5 << 16);
			return local18;
		} else {
			return null;
		}
	}
}
