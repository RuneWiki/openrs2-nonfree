import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!j", name = "c", descriptor = "Lclient!kv;")
	public static final Class171 aClass171_5 = new Class171();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBII)V")
	public static void method3888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 + Static324.anInt6132;
		@Pc(16) int local16 = arg2 + Static517.anInt8716;
		if (Static313.aClass206ArrayArrayArray2 == null || arg1 < 0 || arg2 < 0 || arg1 >= Static542.anInt9387 || arg2 >= Static36.anInt1324) {
			return;
		}
		@Pc(46) long local46 = (long) (local7 | local16 << 14 | arg0 << 28);
		@Pc(52) Class1_Sub11 local52 = (Class1_Sub11) Static528.aClass174_40.method4422(local46);
		if (local52 == null) {
			Static228.method7528(arg0, arg1, arg2);
			return;
		}
		@Pc(66) Class1_Sub2 local66 = (Class1_Sub2) local52.aClass38_21.method1419();
		if (local66 == null) {
			Static228.method7528(arg0, arg1, arg2);
			return;
		}
		@Pc(80) Class47_Sub1_Sub1 local80 = (Class47_Sub1_Sub1) Static228.method7528(arg0, arg1, arg2);
		if (local80 == null) {
			local80 = new Class47_Sub1_Sub1();
		} else {
			local80.anInt1871 = local80.anInt1863 = -1;
		}
		local80.anInt1868 = local66.anInt719;
		local80.anInt1867 = local66.anInt716;
		label46: while (true) {
			@Pc(107) Class1_Sub2 local107 = (Class1_Sub2) local52.aClass38_21.method1415();
			if (local107 == null) {
				break;
			}
			if (local80.anInt1868 != local107.anInt719) {
				local80.anInt1874 = local107.anInt716;
				local80.anInt1871 = local107.anInt719;
				while (true) {
					@Pc(128) Class1_Sub2 local128 = (Class1_Sub2) local52.aClass38_21.method1415();
					if (local128 == null) {
						break label46;
					}
					if (local80.anInt1868 != local128.anInt719 && local128.anInt719 != local80.anInt1871) {
						local80.anInt1863 = local128.anInt719;
						local80.anInt1872 = local128.anInt716;
					}
				}
			}
		}
		@Pc(165) int local165 = Static74.method1954(arg0, (arg2 << 7) + 64, (arg1 << 7) + 64);
		Static526.method7500(arg0, arg1, arg2, local165, local80);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z")
	public static boolean method3889(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)Z")
	public static boolean method3891(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static422.method6288(arg1, arg0) | Static470.method5654(arg0, arg1)) & Static114.method6188(arg1, arg0);
	}
}
