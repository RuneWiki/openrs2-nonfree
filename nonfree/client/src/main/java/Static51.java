import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "[I")
	public static int[] anIntArray37;

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "Lclient!sa;")
	public static final Class311 aClass311_1 = new Class311();

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
	public static int anInt734 = 0;

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
	public static int anInt735 = 0;

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "[I")
	public static final int[] anIntArray38 = new int[14];

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIII)V")
	public static void method645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub52 local10 = (Class5_Sub52) Static573.aClass114_64.method2805(); local10 != null; local10 = (Class5_Sub52) Static573.aClass114_64.method2814()) {
			Static348.method5303(local10, arg0, arg2, arg3, arg1);
		}
		@Pc(173) boolean local173;
		for (@Pc(31) Class5_Sub52 local31 = (Class5_Sub52) Static195.aClass114_21.method2805(); local31 != null; local31 = (Class5_Sub52) Static195.aClass114_21.method2814()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class167 local40 = local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.method4580();
			if (local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479 == -1 || local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.aBoolean470) {
				local35 = 0;
			} else if (local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479 == local40.anInt4897 || local40.anInt4909 == local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479 || local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479 == local40.anInt4900 || local40.anInt4893 == local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479) {
				local35 = 2;
			} else if (local40.anInt4881 == local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479 || local40.anInt4879 == local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479 || local40.anInt4882 == local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479 || local40.anInt4876 == local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt5479) {
				local35 = 3;
			}
			if (local35 != local31.anInt9156) {
				@Pc(132) int local132 = Static258.method4028(local31.aClass28_Sub1_Sub4_Sub2_Sub1_2);
				@Pc(136) Class134 local136 = local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.aClass134_1;
				if (local136.anIntArray191 != null) {
					local136 = local136.method3276(Static161.aClass237_3);
				}
				if (local136 == null || local132 == -1) {
					local31.anInt9156 = local35;
					local31.aBoolean782 = false;
					local31.anInt9166 = -1;
				} else if (local31.anInt9166 == local132 && local136.aBoolean299 == local31.aBoolean782) {
					local31.anInt9156 = local35;
					local31.anInt9155 = local136.anInt3814;
				} else {
					local173 = false;
					if (local31.aClass5_Sub17_Sub2_2 == null) {
						local173 = true;
					} else {
						local31.anInt9155 -= 512;
						if (local31.anInt9155 <= 0) {
							Static245.aClass5_Sub17_Sub4_2.method6184(local31.aClass5_Sub17_Sub2_2);
							local173 = true;
							local31.aClass5_Sub17_Sub2_2 = null;
						}
					}
					if (local173) {
						local31.anInt9166 = local132;
						local31.anInt9156 = local35;
						local31.aClass5_Sub38_1 = null;
						local31.aClass5_Sub42_Sub1_3 = null;
						local31.anInt9155 = local136.anInt3814;
						local31.aBoolean782 = local136.aBoolean299;
					}
				}
			}
			local31.anInt9154 = local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt10781;
			local31.anInt9158 = local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt10781 + (local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.method4599() << 8);
			local31.anInt9160 = local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt10784;
			local31.anInt9164 = local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.anInt10784 + (local31.aClass28_Sub1_Sub4_Sub2_Sub1_2.method4599() << 8);
			Static348.method5303(local31, arg0, arg2, arg3, arg1);
		}
		for (@Pc(289) Class5_Sub52 local289 = (Class5_Sub52) Static520.aClass300_40.method7182(); local289 != null; local289 = (Class5_Sub52) Static520.aClass300_40.method7192()) {
			@Pc(293) byte local293 = 1;
			@Pc(298) Class167 local298 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.method4580();
			if (local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 == -1 || local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.aBoolean470) {
				local293 = 0;
			} else if (local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 == local298.anInt4897 || local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 == local298.anInt4909 || local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 == local298.anInt4900 || local298.anInt4893 == local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479) {
				local293 = 2;
			} else if (local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 == local298.anInt4881 || local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 == local298.anInt4879 || local298.anInt4882 == local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 || local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5479 == local298.anInt4876) {
				local293 = 3;
			}
			if (local289.anInt9156 != local293) {
				@Pc(382) int local382 = Static258.method4024(local289.aClass28_Sub1_Sub4_Sub2_Sub2_2);
				if (local289.anInt9166 == local382 && local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.aBoolean477 == local289.aBoolean782) {
					local289.anInt9156 = local293;
					local289.anInt9155 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5542;
				} else {
					local173 = false;
					if (local289.aClass5_Sub17_Sub2_2 == null) {
						local173 = true;
					} else {
						local289.anInt9155 -= 512;
						if (local289.anInt9155 <= 0) {
							Static245.aClass5_Sub17_Sub4_2.method6184(local289.aClass5_Sub17_Sub2_2);
							local289.aClass5_Sub17_Sub2_2 = null;
							local173 = true;
						}
					}
					if (local173) {
						local289.anInt9155 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt5542;
						local289.aBoolean782 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.aBoolean477;
						local289.anInt9156 = local293;
						local289.anInt9166 = local382;
						local289.aClass5_Sub42_Sub1_3 = null;
						local289.aClass5_Sub38_1 = null;
					}
				}
			}
			local289.anInt9154 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt10781;
			local289.anInt9158 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt10781 + (local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.method4599() << 8);
			local289.anInt9160 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt10784;
			local289.anInt9164 = local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.anInt10784 + (local289.aClass28_Sub1_Sub4_Sub2_Sub2_2.method4599() << 8);
			Static348.method5303(local289, arg0, arg2, arg3, arg1);
		}
	}
}
