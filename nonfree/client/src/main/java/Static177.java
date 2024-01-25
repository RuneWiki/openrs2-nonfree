import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iu", name = "bc", descriptor = "I")
	public static int anInt3636;

	@OriginalMember(owner = "client!iu", name = "cc", descriptor = "Lclient!gm;")
	public static Class87 aClass87_4;

	@OriginalMember(owner = "client!iu", name = "dc", descriptor = "I")
	public static int anInt3637;

	@OriginalMember(owner = "client!iu", name = "Zb", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_51 = new Class212(39, -1);

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(III)Lclient!pl;")
	public static Class11_Sub3 method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class162 local7 = Static294.aClass162ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_1;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!qa;ILclient!gw;II)V")
	public static void method3241(@OriginalArg(0) Class30 arg0, @OriginalArg(2) Class91 arg1) {
		Static345.aClass91_41.method2582();
		if (Static116.aBoolean168) {
			return;
		}
		for (@Pc(16) Class4_Sub4 local16 = (Class4_Sub4) arg1.method2584(); local16 != null; local16 = (Class4_Sub4) arg1.method2586()) {
			@Pc(24) Class217 local24 = Static425.aClass116_3.method3300(local16.anInt366);
			if (Static408.method5691(local24)) {
				@Pc(36) boolean local36 = Static466.method6323(local24, arg0, local16);
				if (local36) {
					Static122.method2307(arg0, local16, local24);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(Z)V")
	public static void method3242() {
		@Pc(7) Class137 local7 = null;
		try {
			@Pc(13) Class87 local13 = Static390.aClass255_5.method5847("3", false);
			while (local13.anInt2679 == 0) {
				Static77.method1653(1L);
			}
			if (local13.anInt2679 == 2) {
				throw new RuntimeException("Error opening file");
			}
			local7 = (Class137) local13.anObject3;
			@Pc(45) byte[] local45 = new byte[(int) local7.method3703()];
			if (local45.length == 0) {
				Static133.aString20 = "";
				Static235.aString41 = "";
			} else {
				@Pc(72) int local72;
				for (@Pc(59) int local59 = 0; local59 < local45.length; local59 += local72) {
					local72 = local7.method3704(local45, local45.length - local59, local59);
					if (local72 == -1) {
						throw new IOException("EOF");
					}
				}
				@Pc(98) Class4_Sub20 local98 = new Class4_Sub20(local45);
				@Pc(102) int local102 = local98.method4614();
				if (local102 > 50) {
					throw new RuntimeException("Bad length");
				}
				local98.anInt5526 = local102 + 1;
				if (!local98.method4597()) {
					throw new RuntimeException("Invalid CRC");
				}
				local98.anInt5526 = 1;
				@Pc(131) int local131 = local98.method4614();
				if (local131 != 0) {
					throw new RuntimeException("Invalid version " + local131);
				}
				Static235.aString41 = local98.method4569();
				Static133.aString20 = local98.method4569();
			}
		} catch (@Pc(157) Exception local157) {
			Static133.aString20 = "";
			Static235.aString41 = "";
		}
		try {
			if (local7 != null) {
				local7.method3708();
			}
		} catch (@Pc(168) Exception local168) {
		}
	}
}
