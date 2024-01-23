import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public static int anInt3788;

	@OriginalMember(owner = "client!sc", name = "D", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1290 = Static200.method3116(" )2>");

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1291 = Static200.method3116("Registrierter Benutzer");

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
	public static int[] anIntArray498 = new int[128];

	@OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
	public static int anInt3796 = 2;

	@OriginalMember(owner = "client!sc", name = "C", descriptor = "B")
	public static byte aByte13 = 0;

	@OriginalMember(owner = "client!sc", name = "E", descriptor = "I")
	public static int anInt3807 = 20;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(12) Class1_Sub21 local12 = null;
		for (@Pc(17) Class1_Sub21 local17 = (Class1_Sub21) Static129.aClass19_7.method609(); local17 != null; local17 = (Class1_Sub21) Static129.aClass19_7.method615()) {
			if (local17.anInt3156 == arg6 && local17.anInt3155 == arg4 && arg5 == local17.anInt3148 && local17.anInt3160 == arg3) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class1_Sub21();
			local12.anInt3160 = arg3;
			local12.anInt3148 = arg5;
			local12.anInt3156 = arg6;
			local12.anInt3155 = arg4;
			Static3.method59(local12);
			Static129.aClass19_7.method620(local12);
		}
		local12.anInt3166 = arg7;
		local12.anInt3159 = arg8;
		local12.anInt3162 = arg2;
		local12.anInt3151 = arg0;
		local12.anInt3164 = arg1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!kh;ILclient!ai;Lclient!kh;)[Lclient!nb;")
	public static Class1_Sub1_Sub6_Sub1[] method2833(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) Class60 arg2) {
		@Pc(4) int local4 = arg1.method3222(arg0);
		@Pc(18) int local18 = arg1.method3240(arg2, local4);
		return Static136.method2302(arg1, local4, local18);
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILclient!kh;)I")
	public static int method2834(@OriginalArg(1) Class60 arg0) {
		return arg0.method1835() + 1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(B[B)V")
	public static void method2835(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class1_Sub9 local10 = new Class1_Sub9(arg0);
		local10.anInt1192 = arg0.length - 2;
		Static180.anInt3836 = local10.method946();
		Static97.anIntArray263 = new int[Static180.anInt3836];
		Static91.anIntArray251 = new int[Static180.anInt3836];
		Static96.aByteArrayArray4 = new byte[Static180.anInt3836][];
		Static181.anIntArray504 = new int[Static180.anInt3836];
		Static10.anIntArray46 = new int[Static180.anInt3836];
		local10.anInt1192 = arg0.length - Static180.anInt3836 * 8 - 7;
		Static97.anInt2261 = local10.method946();
		Static176.anInt777 = local10.method946();
		@Pc(61) int local61 = (local10.method895() & 0xFF) + 1;
		for (@Pc(63) int local63 = 0; local63 < Static180.anInt3836; local63++) {
			Static91.anIntArray251[local63] = local10.method946();
		}
		for (@Pc(81) int local81 = 0; local81 < Static180.anInt3836; local81++) {
			Static97.anIntArray263[local81] = local10.method946();
		}
		for (@Pc(95) int local95 = 0; local95 < Static180.anInt3836; local95++) {
			Static181.anIntArray504[local95] = local10.method946();
		}
		for (@Pc(115) int local115 = 0; local115 < Static180.anInt3836; local115++) {
			Static10.anIntArray46[local115] = local10.method946();
		}
		local10.anInt1192 = arg0.length + 3 - Static180.anInt3836 * 8 - local61 * 3 - 7;
		Static110.anIntArray317 = new int[local61];
		for (@Pc(153) int local153 = 1; local153 < local61; local153++) {
			Static110.anIntArray317[local153] = local10.method920();
			if (Static110.anIntArray317[local153] == 0) {
				Static110.anIntArray317[local153] = 1;
			}
		}
		local10.anInt1192 = 0;
		for (@Pc(178) int local178 = 0; local178 < Static180.anInt3836; local178++) {
			@Pc(184) int local184 = Static181.anIntArray504[local178];
			@Pc(188) int local188 = Static10.anIntArray46[local178];
			@Pc(192) int local192 = local184 * local188;
			@Pc(195) byte[] local195 = new byte[local192];
			Static96.aByteArrayArray4[local178] = local195;
			@Pc(203) int local203 = local10.method895();
			@Pc(210) int local210;
			if (local203 == 0) {
				for (local210 = 0; local210 < local192; local210++) {
					local195[local210] = local10.method891();
				}
			} else if (local203 == 1) {
				for (local210 = 0; local210 < local184; local210++) {
					for (@Pc(233) int local233 = 0; local233 < local188; local233++) {
						local195[local210 + local233 * local184] = local10.method891();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIII)V")
	public static void method2836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static214.anInt4572 <= arg2 - arg3 && arg3 + arg2 <= Static130.anInt2847 && arg1 - arg3 >= Static141.anInt3163 && Static200.anInt4273 >= arg3 + arg1) {
			Static113.method1953(arg2, arg1, arg3, arg0);
		} else {
			Static111.method1916(arg0, arg3, arg1, arg2);
		}
	}
}
