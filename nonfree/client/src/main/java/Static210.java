import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	public static int anInt3640;

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "I")
	public static int anInt3641 = 2;

	@OriginalMember(owner = "client!hga", name = "r", descriptor = "Lclient!ii;")
	public static final Class157 aClass157_1 = new Class157();

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3219(@OriginalArg(0) String arg0) {
		@Pc(6) Class5_Sub40 local6 = Static599.method8376();
		local6.aClass5_Sub12_Sub2_2.method8647(Static603.aClass244_12.anInt6597);
		local6.aClass5_Sub12_Sub2_2.method8655(0);
		@Pc(21) int local21 = local6.aClass5_Sub12_Sub2_2.anInt10154;
		local6.aClass5_Sub12_Sub2_2.method8655(640);
		@Pc(32) int[] local32 = Static192.method7615(local6);
		@Pc(36) int local36 = local6.aClass5_Sub12_Sub2_2.anInt10154;
		local6.aClass5_Sub12_Sub2_2.method8619(arg0);
		local6.aClass5_Sub12_Sub2_2.method8647(Static321.anInt5554);
		local6.aClass5_Sub12_Sub2_2.anInt10154 += 7;
		local6.aClass5_Sub12_Sub2_2.method8620(local32, local6.aClass5_Sub12_Sub2_2.anInt10154, local36);
		local6.aClass5_Sub12_Sub2_2.method8642(local6.aClass5_Sub12_Sub2_2.anInt10154 - local21);
		Static612.method8496(local6);
		Static621.anInt10073 = 0;
		Static45.anInt744 = -3;
		Static301.anInt4797 = 1;
		Static361.anInt6379 = 0;
	}
}
