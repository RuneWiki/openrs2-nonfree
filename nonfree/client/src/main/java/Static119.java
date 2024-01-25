import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
	public static int anInt3152;

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "Ljava/lang/String;")
	public static String aString24;

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!mn;")
	public static final Class211 aClass211_3 = new Class211();

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "[I")
	public static final int[] anIntArray154 = new int[8];

	@OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
	public static int anInt3172 = -1;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
	public static boolean method2925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static5.method116(arg0, arg1) || Static611.method9090(arg1, arg0);
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!ga;)V")
	public static void method2927(@OriginalArg(0) Class3_Sub1 arg0) {
		Static194.aClass20_5.H(arg0.anInt10303, arg0.anInt10306 + (arg0.method8618() >> 1), arg0.anInt10310, Static328.anIntArray396);
		arg0.anInt10309 = Static328.anIntArray396[0];
		arg0.anInt10305 = Static328.anIntArray396[1];
		arg0.anInt10311 = Static328.anIntArray396[2];
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lclient!cea;B)V")
	public static void method2928(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(8) byte[] local8 = new byte[24];
		if (Static174.aClass184_2 != null) {
			@Pc(24) int local24;
			try {
				Static174.aClass184_2.method5460(0L);
				Static174.aClass184_2.method5455(local8);
				for (local24 = 0; local24 < 24 && local8[local24] == 0; local24++) {
				}
				if (local24 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(48) Exception local48) {
				for (local24 = 0; local24 < 24; local24++) {
					local8[local24] = -1;
				}
			}
		}
		arg0.method8376(24, 0, local8);
	}
}
