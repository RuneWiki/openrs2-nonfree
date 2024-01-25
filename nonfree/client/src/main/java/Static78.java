import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
	public static int anInt1650;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_34 = new Class239(94, -2);

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
	public static int anInt1651 = 64;

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
	public static int anInt1655 = 0;

	@OriginalMember(owner = "client!dba", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray8 = new int[128][128];

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIII)V")
	public static void method1570(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class2_Sub46 local6 = (Class2_Sub46) Static160.aClass249_18.method6527(); local6 != null; local6 = (Class2_Sub46) Static160.aClass249_18.method6525()) {
			Static181.method2998(arg0, arg2, arg1, local6, arg3);
		}
		for (@Pc(31) Class2_Sub46 local31 = (Class2_Sub46) Static286.aClass249_25.method6527(); local31 != null; local31 = (Class2_Sub46) Static286.aClass249_25.method6525()) {
			@Pc(35) byte local35 = 1;
			@Pc(42) Class24 local42 = local31.aClass1_Sub1_Sub2_Sub2_2.method4393();
			if (local31.aClass1_Sub1_Sub2_Sub2_2.aBoolean385) {
				local35 = 0;
			} else if (local42.anInt667 == local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063 || local42.anInt685 == local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063 || local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063 == local42.anInt686 || local42.anInt656 == local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063) {
				local35 = 2;
			} else if (local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063 == local42.anInt665 || local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063 == local42.anInt659 || local42.anInt653 == local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063 || local31.aClass1_Sub1_Sub2_Sub2_2.anInt5063 == local42.anInt661) {
				local35 = 3;
			}
			if (local35 != local31.anInt8986) {
				@Pc(129) int local129 = Static148.method2582(local31.aClass1_Sub1_Sub2_Sub2_2);
				if (local31.anInt8977 != local129) {
					if (local31.aClass2_Sub12_Sub3_4 != null) {
						Static288.aClass2_Sub12_Sub2_5.method2088(local31.aClass2_Sub12_Sub3_4);
						local31.aClass2_Sub12_Sub3_4 = null;
					}
					local31.anInt8977 = local129;
				}
				local31.anInt8986 = local35;
			}
			local31.anInt8984 = local31.aClass1_Sub1_Sub2_Sub2_2.anInt7660;
			local31.anInt8979 = local31.aClass1_Sub1_Sub2_Sub2_2.anInt7660 + (local31.aClass1_Sub1_Sub2_Sub2_2.method4394() << 6);
			local31.anInt8990 = local31.aClass1_Sub1_Sub2_Sub2_2.anInt7659;
			local31.anInt8976 = local31.aClass1_Sub1_Sub2_Sub2_2.anInt7659 + (local31.aClass1_Sub1_Sub2_Sub2_2.method4394() << 6);
			Static181.method2998(arg0, arg2, arg1, local31, arg3);
		}
		for (@Pc(210) Class2_Sub46 local210 = (Class2_Sub46) Static92.aClass127_16.method3203(); local210 != null; local210 = (Class2_Sub46) Static92.aClass127_16.method3212()) {
			@Pc(214) byte local214 = 1;
			@Pc(221) Class24 local221 = local210.aClass1_Sub1_Sub2_Sub1_2.method4393();
			if (local210.aClass1_Sub1_Sub2_Sub1_2.aBoolean385) {
				local214 = 0;
			} else if (local221.anInt667 == local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063 || local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063 == local221.anInt685 || local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063 == local221.anInt686 || local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063 == local221.anInt656) {
				local214 = 2;
			} else if (local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063 == local221.anInt665 || local221.anInt659 == local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063 || local221.anInt653 == local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063 || local221.anInt661 == local210.aClass1_Sub1_Sub2_Sub1_2.anInt5063) {
				local214 = 3;
			}
			if (local210.anInt8986 != local214) {
				@Pc(312) int local312 = Static215.method6796(local210.aClass1_Sub1_Sub2_Sub1_2);
				if (local210.anInt8977 != local312) {
					if (local210.aClass2_Sub12_Sub3_4 != null) {
						Static288.aClass2_Sub12_Sub2_5.method2088(local210.aClass2_Sub12_Sub3_4);
						local210.aClass2_Sub12_Sub3_4 = null;
					}
					local210.anInt8977 = local312;
				}
				local210.anInt8986 = local214;
			}
			local210.anInt8984 = local210.aClass1_Sub1_Sub2_Sub1_2.anInt7660;
			local210.anInt8979 = local210.aClass1_Sub1_Sub2_Sub1_2.anInt7660 + (local210.aClass1_Sub1_Sub2_Sub1_2.method4394() << 6);
			local210.anInt8990 = local210.aClass1_Sub1_Sub2_Sub1_2.anInt7659;
			local210.anInt8976 = local210.aClass1_Sub1_Sub2_Sub1_2.anInt7659 + (local210.aClass1_Sub1_Sub2_Sub1_2.method4394() << 6);
			Static181.method2998(arg0, arg2, arg1, local210, arg3);
		}
	}
}
