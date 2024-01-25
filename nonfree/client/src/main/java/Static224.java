import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
	public static int anInt4176;

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "I")
	public static int anInt4179 = 0;

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "I")
	public static int anInt4180 = 1;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method3562(@OriginalArg(0) String arg0) {
		if (Static9.anInt148 == 3) {
			return -1;
		} else if (Static540.aHashtable7.containsKey(arg0)) {
			return 100;
		} else {
			@Pc(20) String local20 = Static158.method2885(arg0);
			if (local20 == null) {
				return -1;
			}
			@Pc(33) String local33 = Static314.aString43 + local20;
			if (!Static386.aClass117_96.method2976("", local33)) {
				return -1;
			} else if (Static386.aClass117_96.method2955(local33)) {
				@Pc(69) byte[] local69 = Static386.aClass117_96.method2980(local33, "");
				@Pc(74) File local74 = Static390.aClass9_21.method300(local20);
				if (local69 == null || local74 == null) {
					return -1;
				}
				@Pc(80) boolean local80 = true;
				@Pc(84) byte[] local84 = Static32.method722(local74);
				if (local84 != null && local84.length == local69.length) {
					for (@Pc(101) int local101 = 0; local101 < local84.length; local101++) {
						if (local69[local101] != local84[local101]) {
							local80 = false;
							break;
						}
					}
				} else {
					local80 = false;
				}
				try {
					if (!local80) {
						Static390.aClass9_21.method292(local74, local69);
					}
				} catch (@Pc(131) Throwable local131) {
					return -1;
				}
				Static505.method6632(arg0, local74);
				return 100;
			} else {
				return Static386.aClass117_96.method2969(local33);
			}
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIIIII)V")
	public static void method3563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg4 * arg4;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg2 << 1;
		@Pc(45) int local45 = local29 + (1 - local37) * local21;
		@Pc(54) int local54 = local25 - local33 * (local37 - 1);
		@Pc(58) int local58 = local21 << 2;
		@Pc(62) int local62 = local25 << 2;
		@Pc(70) int local70 = local29 * 3;
		@Pc(78) int local78 = ((arg2 << 1) - 3) * local33;
		@Pc(84) int local84 = local62;
		@Pc(90) int local90 = local58 * (arg2 - 1);
		Static321.method5153(arg3, arg0 - arg4, Static352.anIntArrayArray51[arg1], arg4 + arg0);
		while (local17 > 0) {
			if (local45 < 0) {
				while (local45 < 0) {
					local54 += local84;
					local45 += local70;
					local70 += local62;
					local15++;
					local84 += local62;
				}
			}
			if (local54 < 0) {
				local54 += local84;
				local45 += local70;
				local70 += local62;
				local84 += local62;
				local15++;
			}
			local45 += -local90;
			local54 += -local78;
			local78 -= local58;
			local90 -= local58;
			local17--;
			@Pc(177) int local177 = arg1 - local17;
			@Pc(181) int local181 = local17 + arg1;
			@Pc(185) int local185 = local15 + arg0;
			@Pc(189) int local189 = arg0 - local15;
			Static321.method5153(arg3, local189, Static352.anIntArrayArray51[local177], local185);
			Static321.method5153(arg3, local189, Static352.anIntArrayArray51[local181], local185);
		}
	}
}
