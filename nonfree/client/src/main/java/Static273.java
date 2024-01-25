import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_66 = new Class171(22, 4);

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "[Lclient!dt;")
	public static final Class3_Sub4[] aClass3_Sub4Array1 = new Class3_Sub4[2048];

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public static int anInt4689 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BIIII)V")
	public static void method4019(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class3_Sub30 local10 = (Class3_Sub30) Static488.aClass302_50.method6603(); local10 != null; local10 = (Class3_Sub30) Static488.aClass302_50.method6605()) {
			Static585.method7771(arg2, arg1, local10, arg3, arg0);
		}
		@Pc(167) boolean local167;
		for (@Pc(37) Class3_Sub30 local37 = (Class3_Sub30) Static533.aClass302_48.method6603(); local37 != null; local37 = (Class3_Sub30) Static533.aClass302_48.method6605()) {
			@Pc(41) byte local41 = 1;
			@Pc(46) Class286 local46 = local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.method7878();
			if (local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 == -1 || local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.aBoolean673) {
				local41 = 0;
			} else if (local46.anInt7545 == local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 || local46.anInt7513 == local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 || local46.anInt7525 == local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 || local46.anInt7517 == local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647) {
				local41 = 2;
			} else if (local46.anInt7510 == local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 || local46.anInt7507 == local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 || local46.anInt7535 == local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 || local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9647 == local46.anInt7526) {
				local41 = 3;
			}
			if (local37.anInt4803 != local41) {
				@Pc(139) int local139 = Static44.method791(local37.aClass34_Sub1_Sub1_Sub2_Sub2_1);
				@Pc(143) Class261 local143 = local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.aClass261_1;
				if (local143.anIntArray364 != null) {
					local143 = local143.method5772(Static210.aClass262_1);
				}
				if (local143 == null || local139 == -1) {
					local37.aBoolean317 = false;
					local37.anInt4791 = -1;
					local37.anInt4803 = local41;
				} else if (local37.anInt4791 == local139 && local37.aBoolean317 == local143.aBoolean482) {
					local37.anInt4803 = local41;
					local37.anInt4795 = local143.anInt6823;
				} else {
					local167 = false;
					if (local37.aClass3_Sub12_Sub4_4 == null) {
						local167 = true;
					} else {
						local37.anInt4795 -= 512;
						if (local37.anInt4795 <= 0) {
							Static156.aClass3_Sub12_Sub1_1.method1766(local37.aClass3_Sub12_Sub4_4);
							local37.aClass3_Sub12_Sub4_4 = null;
							local167 = true;
						}
					}
					if (local167) {
						local37.aBoolean317 = local143.aBoolean482;
						local37.anInt4803 = local41;
						local37.aClass3_Sub39_Sub1_4 = null;
						local37.aClass3_Sub54_3 = null;
						local37.anInt4791 = local139;
						local37.anInt4795 = local143.anInt6823;
					}
				}
			}
			local37.anInt4789 = local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9614;
			local37.anInt4794 = local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9614 + (local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.method7866() << 8);
			local37.anInt4790 = local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9619;
			local37.anInt4793 = local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.anInt9619 + (local37.aClass34_Sub1_Sub1_Sub2_Sub2_1.method7866() << 8);
			Static585.method7771(arg2, arg1, local37, arg3, arg0);
		}
		for (@Pc(290) Class3_Sub30 local290 = (Class3_Sub30) Static588.aClass333_42.method7490(); local290 != null; local290 = (Class3_Sub30) Static588.aClass333_42.method7487()) {
			@Pc(294) byte local294 = 1;
			@Pc(299) Class286 local299 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.method7878();
			if (local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 == -1 || local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.aBoolean673) {
				local294 = 0;
			} else if (local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 == local299.anInt7545 || local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 == local299.anInt7513 || local299.anInt7525 == local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 || local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 == local299.anInt7517) {
				local294 = 2;
			} else if (local299.anInt7510 == local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 || local299.anInt7507 == local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 || local299.anInt7535 == local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647 || local299.anInt7526 == local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9647) {
				local294 = 3;
			}
			if (local294 != local290.anInt4803) {
				@Pc(395) int local395 = Static553.method7313(local290.aClass34_Sub1_Sub1_Sub2_Sub1_2);
				if (local395 == local290.anInt4791 && local290.aBoolean317 == local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.aBoolean141) {
					local290.anInt4803 = local294;
					local290.anInt4795 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt1802;
				} else {
					local167 = false;
					if (local290.aClass3_Sub12_Sub4_4 == null) {
						local167 = true;
					} else {
						local290.anInt4795 -= 512;
						if (local290.anInt4795 <= 0) {
							Static156.aClass3_Sub12_Sub1_1.method1766(local290.aClass3_Sub12_Sub4_4);
							local167 = true;
							local290.aClass3_Sub12_Sub4_4 = null;
						}
					}
					if (local167) {
						local290.aClass3_Sub39_Sub1_4 = null;
						local290.anInt4791 = local395;
						local290.anInt4803 = local294;
						local290.aClass3_Sub54_3 = null;
						local290.aBoolean317 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.aBoolean141;
						local290.anInt4795 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt1802;
					}
				}
			}
			local290.anInt4789 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9614;
			local290.anInt4794 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9614 + (local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.method7866() << 8);
			local290.anInt4790 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9619;
			local290.anInt4793 = local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.anInt9619 + (local290.aClass34_Sub1_Sub1_Sub2_Sub1_2.method7866() << 8);
			Static585.method7771(arg2, arg1, local290, arg3, arg0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILclient!nf;)Z")
	public static boolean method4020(@OriginalArg(1) Interface17 arg0) {
		@Pc(10) Class216 local10 = Static466.aClass340_6.method7665(arg0.method6661());
		if (local10.anInt5957 == -1) {
			return true;
		} else {
			@Pc(23) Class245 local23 = Static33.aClass208_11.method4945(local10.anInt5957);
			return local23.anInt6544 == -1 ? true : local23.method5499();
		}
	}
}
