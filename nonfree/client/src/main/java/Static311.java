import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!jq", name = "K", descriptor = "Lclient!nca;")
	public static Class254 aClass254_96;

	@OriginalMember(owner = "client!jq", name = "E", descriptor = "Z")
	public static boolean aBoolean411 = false;

	@OriginalMember(owner = "client!jq", name = "F", descriptor = "Lclient!jea;")
	public static final Class192 aClass192_1 = Static640.method8678();

	@OriginalMember(owner = "client!jq", name = "C", descriptor = "I")
	public static int anInt4777 = -1;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)Z")
	public static boolean method4346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x60000) != 0 | Static302.method4222(arg0, arg1) || Static299.method4195(arg0, arg1);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IILclient!sj;IIII)V")
	public static void method4347(@OriginalArg(2) Class4_Sub2_Sub1_Sub2 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static628.method8495(0, arg0.anInt10229, arg3, arg0.anInt10228, arg0.aByte133);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZIZLclient!ha;)Lclient!da;")
	public static Class68 method4349(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class145 arg3) {
		@Pc(12) Class173 local12 = Static338.method4701(arg3, arg0, arg1, arg2);
		return local12 == null ? null : local12.aClass68_10;
	}
}
