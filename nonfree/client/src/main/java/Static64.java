import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!bt", name = "q", descriptor = "I")
	public static int anInt1107;

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
	public static int anInt1116;

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "[I")
	public static int[] anIntArray99 = new int[1];

	@OriginalMember(owner = "client!bt", name = "r", descriptor = "Lclient!pk;")
	public static final Class293 aClass293_2 = new Class293();

	@OriginalMember(owner = "client!bt", name = "w", descriptor = "[I")
	public static int[] anIntArray100 = new int[2];

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(I)V")
	public static void method959() {
		if (Static229.aClass386_6 != Static501.aClass386_8) {
			try {
				Static736.method7134(Static255.aClient1, "tbrefresh");
			} catch (@Pc(25) Throwable local25) {
			}
		}
	}

	@OriginalMember(owner = "client!bt", name = "c", descriptor = "(B)V")
	public static void method960() {
		Static587.aClass145_12.xa(((float) Static650.aClass2_Sub30_29.aClass11_Sub22_1.method5859() * 0.1F + 0.7F) * 1.1523438F);
		Static587.aClass145_12.ZA(Static224.anInt11064, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static587.aClass145_12.L(Static93.anInt1639, -1, 0);
		Static587.aClass145_12.method9701(Static302.aClass74_3);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(III)Lclient!gma;")
	public static Class142 method961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass142_2;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ZF)F")
	public static float method962(@OriginalArg(1) float arg0) {
		return arg0 * arg0 * arg0 * (arg0 * (arg0 * 6.0F - 15.0F) + 10.0F);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(BILjava/io/File;)[B")
	public static byte[] method963(@OriginalArg(1) int arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static192.method2752(arg0, arg1, local6);
			return local6;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}
}
