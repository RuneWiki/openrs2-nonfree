import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!t", name = "v", descriptor = "I")
	public static int anInt5778;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_187 = new Class217(10, -1);

	@OriginalMember(owner = "client!t", name = "u", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_152 = new Class21(50);

	@OriginalMember(owner = "client!t", name = "w", descriptor = "I")
	public static int anInt5779 = 2;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(I)I")
	public static int method5230() {
		if (Static31.aFrame1 == null) {
			return Static230.aBoolean143 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
	public static void method5231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub4_Sub17 local8 = Static132.method2717(arg0, 1);
		local8.method3480();
		local8.anInt3727 = arg1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ar;I)V")
	public static void method5232(@OriginalArg(0) Class1_Sub6 arg0) {
		if (arg0.aClass1_Sub39_5 != null) {
			arg0.aClass1_Sub39_5.anInt6074 = 0;
		}
		arg0.aBoolean325 = false;
		for (@Pc(18) Class1_Sub6 local18 = arg0.method4054(); local18 != null; local18 = arg0.method4056()) {
			method5232(local18);
		}
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
	public static void method5233(@OriginalArg(0) int arg0) {
		@Pc(14) Class1_Sub4_Sub17 local14 = Static132.method2717(arg0, 11);
		local14.method3481();
	}
}
