import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!ov", name = "L", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable6 = new Hashtable();

	@OriginalMember(owner = "client!ov", name = "M", descriptor = "I")
	public static int anInt7658 = 7000;

	@OriginalMember(owner = "client!ov", name = "N", descriptor = "[I")
	public static final int[] anIntArray464 = new int[1000];

	@OriginalMember(owner = "client!ov", name = "P", descriptor = "I")
	public static int anInt7660 = anInt7658;

	@OriginalMember(owner = "client!ov", name = "R", descriptor = "I")
	public static int anInt7662 = -1;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZZLjava/lang/String;ILjava/lang/String;)V")
	public static void method6599(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3) {
		@Pc(6) Class6_Sub9 local6 = Static573.method8156();
		local6.aClass6_Sub40_Sub2_1.method8589(Static640.aClass218_7.anInt6779);
		local6.aClass6_Sub40_Sub2_1.method8561(0);
		@Pc(21) int local21 = local6.aClass6_Sub40_Sub2_1.anInt10169;
		local6.aClass6_Sub40_Sub2_1.method8561(639);
		@Pc(30) int[] local30 = Static288.method5012(local6);
		@Pc(34) int local34 = local6.aClass6_Sub40_Sub2_1.anInt10169;
		local6.aClass6_Sub40_Sub2_1.method8551(arg3);
		local6.aClass6_Sub40_Sub2_1.method8561(Static364.anInt6726);
		local6.aClass6_Sub40_Sub2_1.method8551(arg1);
		local6.aClass6_Sub40_Sub2_1.method8594(Static548.aLong241);
		local6.aClass6_Sub40_Sub2_1.method8589(Static307.anInt5931);
		local6.aClass6_Sub40_Sub2_1.method8589(Static630.aClass271_17.anInt8162);
		Static626.method8716(local6.aClass6_Sub40_Sub2_1);
		@Pc(75) String local75 = Static108.aString25;
		local6.aClass6_Sub40_Sub2_1.method8589(local75 == null ? 0 : 1);
		if (local75 != null) {
			local6.aClass6_Sub40_Sub2_1.method8551(local75);
		}
		local6.aClass6_Sub40_Sub2_1.method8589(arg2);
		local6.aClass6_Sub40_Sub2_1.method8589(arg0 ? 1 : 0);
		local6.aClass6_Sub40_Sub2_1.anInt10169 += 7;
		local6.aClass6_Sub40_Sub2_1.method8591(local6.aClass6_Sub40_Sub2_1.anInt10169, local30, local34);
		local6.aClass6_Sub40_Sub2_1.method8559(local6.aClass6_Sub40_Sub2_1.anInt10169 - local21);
		Static263.method4681(local6);
		Static128.anInt2438 = 0;
		Static612.anInt8715 = -3;
		Static292.anInt5761 = 0;
		Static114.anInt2256 = 1;
		if (arg2 < 13) {
			Static555.aBoolean645 = true;
			Static522.method7784();
		}
	}
}
