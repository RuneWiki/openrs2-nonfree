import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static641 {

	@OriginalMember(owner = "client!vl", name = "g", descriptor = "Lclient!np;")
	public static Class258 aClass258_7;

	@OriginalMember(owner = "client!vl", name = "k", descriptor = "I")
	public static int anInt10427;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_208 = new Class156(57, 6);

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
	public static int anInt10426 = -1;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_209 = new Class156(39, 1);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILclient!lda;)V")
	public static void method8834(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub1_Sub3 arg3) {
		@Pc(4) Class128 local4 = Static362.method8360(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub1_Sub3_1 = arg3;
		@Pc(19) int local19 = Static177.aClass84Array2 == Static77.aClass84Array1 ? 1 : 0;
		if (arg3.method8356()) {
			if (arg3.method8344()) {
				arg3.aClass4_Sub1_23 = Static194.aClass4_Sub1Array13[local19];
				Static194.aClass4_Sub1Array13[local19] = arg3;
				return;
			}
			arg3.aClass4_Sub1_23 = Static623.aClass4_Sub1Array11[local19];
			Static623.aClass4_Sub1Array11[local19] = arg3;
			Static597.aBoolean675 = true;
			return;
		}
		arg3.aClass4_Sub1_23 = Static321.aClass4_Sub1Array5[local19];
		Static321.aClass4_Sub1Array5[local19] = arg3;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method8836() {
		Static558.anInt8795 = 0;
		Static115.anInt1871++;
		Static149.anInt2925 = 0;
		Static236.method3741();
		Static566.method7656();
		Static632.method8772();
		@Pc(23) boolean local23 = false;
		@Pc(33) int local33;
		for (@Pc(25) int local25 = 0; local25 < Static558.anInt8795; local25++) {
			local33 = Static451.anIntArray436[local25];
			@Pc(40) Class5_Sub9 local40 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local33);
			@Pc(43) Class4_Sub1_Sub1_Sub2_Sub2 local43 = local40.aClass4_Sub1_Sub1_Sub2_Sub2_1;
			if (Static490.aBoolean536 && Static243.method3857(local33)) {
				Static438.method6290();
			}
			if (local43.anInt6827 != Static115.anInt1871) {
				if (local43.aClass105_1.method2620()) {
					Static72.method1169(local43);
				}
				local43.method5947((Class105) null);
				local23 = true;
				local40.method9222();
			}
		}
		if (local23) {
			Static259.anInt4657 = Static677.aClass306_37.method6939();
			Static677.aClass306_37.method6938(Static591.aClass5_Sub9Array1);
		}
		if (Static4.aClass389_17.anInt10756 != Static4.aClass389_17.aClass5_Sub36_Sub2_2.anInt8456) {
			throw new RuntimeException("gnp1 pos:" + Static4.aClass389_17.aClass5_Sub36_Sub2_2.anInt8456 + " psize:" + Static4.aClass389_17.anInt10756);
		}
		for (local33 = 0; local33 < Static438.anInt7239; local33++) {
			if (Static677.aClass306_37.method6943((long) Static558.anIntArray500[local33]) == null) {
				throw new RuntimeException("gnp2 pos:" + local33 + " size:" + Static438.anInt7239);
			}
		}
		if (Static259.anInt4657 - Static438.anInt7239 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static259.anInt4657 - Static438.anInt7239));
		}
		for (@Pc(205) int local205 = 0; local205 < Static259.anInt4657; local205++) {
			if (Static591.aClass5_Sub9Array1[local205].aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt6827 != Static115.anInt1871) {
				throw new RuntimeException("gnp4 uk:" + Static591.aClass5_Sub9Array1[local205].aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt6843);
			}
		}
	}
}
