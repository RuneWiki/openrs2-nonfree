import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "[Lclient!pea;")
	public static Interface16[] anInterface16Array5;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "[Lclient!it;")
	public static Class28[] aClass28Array22;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!gca;")
	public static final Class116 aClass116_15 = new Class116();

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public static int anInt10376 = 0;

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
	public static int anInt10377 = 0;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "Lclient!vj;")
	public static final Class365 aClass365_18 = new Class365(8, 1);

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "[I")
	public static final int[] anIntArray591 = new int[8];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBIII)V")
	public static void method8831(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class5_Sub20 local6 = (Class5_Sub20) Static368.aClass330_32.method7908(); local6 != null; local6 = (Class5_Sub20) Static368.aClass330_32.method7914()) {
			Static154.method2246(arg0, arg1, arg2, local6, arg3);
		}
		@Pc(178) boolean local178;
		for (@Pc(35) Class5_Sub20 local35 = (Class5_Sub20) Static497.aClass330_55.method7908(); local35 != null; local35 = (Class5_Sub20) Static497.aClass330_55.method7914()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class269 local44 = local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.method1025();
			if (local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 == -1 || local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.aBoolean70) {
				local39 = 0;
			} else if (local44.anInt7255 == local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 || local44.anInt7248 == local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 || local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 == local44.anInt7264 || local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 == local44.anInt7257) {
				local39 = 2;
			} else if (local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 == local44.anInt7256 || local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 == local44.anInt7251 || local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264 == local44.anInt7277 || local44.anInt7287 == local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt1264) {
				local39 = 3;
			}
			if (local39 != local35.anInt2420) {
				@Pc(141) int local141 = Static65.method1091(local35.aClass4_Sub2_Sub1_Sub1_Sub2_2);
				@Pc(145) Class225 local145 = local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.aClass225_1;
				if (local145.anIntArray304 != null) {
					local145 = local145.method4990(Static301.aClass59_1);
				}
				if (local145 == null || local141 == -1) {
					local35.aBoolean183 = false;
					local35.anInt2413 = -1;
					local35.anInt2420 = local39;
				} else if (local35.anInt2413 == local141 && local145.aBoolean411 == local35.aBoolean183) {
					local35.anInt2420 = local39;
					local35.anInt2417 = local145.anInt5644;
				} else {
					local178 = false;
					if (local35.aClass5_Sub1_Sub4_2 == null) {
						local178 = true;
					} else {
						local35.anInt2417 -= 512;
						if (local35.anInt2417 <= 0) {
							Static26.aClass5_Sub1_Sub2_1.method5052(local35.aClass5_Sub1_Sub4_2);
							local178 = true;
							local35.aClass5_Sub1_Sub4_2 = null;
						}
					}
					if (local178) {
						local35.anInt2413 = local141;
						local35.aClass5_Sub37_Sub1_1 = null;
						local35.anInt2420 = local39;
						local35.anInt2417 = local145.anInt5644;
						local35.aBoolean183 = local145.aBoolean411;
						local35.aClass5_Sub29_2 = null;
					}
				}
			}
			local35.anInt2410 = local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt10231;
			local35.anInt2407 = local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt10231 + (local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.method1018() << 8);
			local35.anInt2406 = local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt10229;
			local35.anInt2408 = local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.anInt10229 + (local35.aClass4_Sub2_Sub1_Sub1_Sub2_2.method1018() << 8);
			Static154.method2246(arg0, arg1, arg2, local35, arg3);
		}
		for (@Pc(303) Class5_Sub20 local303 = (Class5_Sub20) Static311.aClass273_13.method6577(); local303 != null; local303 = (Class5_Sub20) Static311.aClass273_13.method6589()) {
			@Pc(307) byte local307 = 1;
			@Pc(312) Class269 local312 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1025();
			if (local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264 == -1 || local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.aBoolean70) {
				local307 = 0;
			} else if (local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264 == local312.anInt7255 || local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264 == local312.anInt7248 || local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264 == local312.anInt7264 || local312.anInt7257 == local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264) {
				local307 = 2;
			} else if (local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264 == local312.anInt7256 || local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264 == local312.anInt7251 || local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264 == local312.anInt7277 || local312.anInt7287 == local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt1264) {
				local307 = 3;
			}
			if (local303.anInt2420 != local307) {
				@Pc(413) int local413 = Static543.method7963(local303.aClass4_Sub2_Sub1_Sub1_Sub1_1);
				if (local413 == local303.anInt2413 && local303.aBoolean183 == local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.aBoolean45) {
					local303.anInt2420 = local307;
					local303.anInt2417 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt919;
				} else {
					local178 = false;
					if (local303.aClass5_Sub1_Sub4_2 == null) {
						local178 = true;
					} else {
						local303.anInt2417 -= 512;
						if (local303.anInt2417 <= 0) {
							Static26.aClass5_Sub1_Sub2_1.method5052(local303.aClass5_Sub1_Sub4_2);
							local303.aClass5_Sub1_Sub4_2 = null;
							local178 = true;
						}
					}
					if (local178) {
						local303.anInt2413 = local413;
						local303.aClass5_Sub37_Sub1_1 = null;
						local303.aClass5_Sub29_2 = null;
						local303.anInt2420 = local307;
						local303.anInt2417 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt919;
						local303.aBoolean183 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.aBoolean45;
					}
				}
			}
			local303.anInt2410 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt10231;
			local303.anInt2407 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt10231 + (local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1018() << 8);
			local303.anInt2406 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt10229;
			local303.anInt2408 = local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt10229 + (local303.aClass4_Sub2_Sub1_Sub1_Sub1_1.method1018() << 8);
			Static154.method2246(arg0, arg1, arg2, local303, arg3);
		}
	}
}
