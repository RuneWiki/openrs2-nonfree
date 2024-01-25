import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!mf", name = "l", descriptor = "Lclient!s;")
	public static Class1_Sub9_Sub4 aClass1_Sub9_Sub4_2;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_166 = new Class137(78, 15);

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[200];

	@OriginalMember(owner = "client!mf", name = "i", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_151 = new Class214(43, 8);

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILclient!kn;I)V")
	public static void method3190(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class141 arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class1_Sub42 local12 = (Class1_Sub42) Static335.aClass254_40.method5437(); local12 != null; local12 = (Class1_Sub42) Static335.aClass254_40.method5433()) {
			if (local12.anInt6731 == arg1 && local12.anInt6733 == arg3 << 7 && arg0 << 7 == local12.anInt6732 && arg2.anInt3383 == local12.aClass141_1.anInt3383) {
				if (local12.aClass1_Sub9_Sub1_3 != null) {
					Static155.aClass1_Sub9_Sub2_1.method1038(local12.aClass1_Sub9_Sub1_3);
					local12.aClass1_Sub9_Sub1_3 = null;
				}
				if (local12.aClass1_Sub9_Sub1_4 != null) {
					Static155.aClass1_Sub9_Sub2_1.method1038(local12.aClass1_Sub9_Sub1_4);
					local12.aClass1_Sub9_Sub1_4 = null;
				}
				local12.method5617();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZLclient!vg;)V")
	public static void method3191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class250 arg2) {
		Static130.anInt2250 = arg1;
		Static429.anInt7121 = arg0;
		Static384.aClass250_12 = arg2;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(JBLclient!qa;)V")
	public static void method3192(@OriginalArg(0) long arg0, @OriginalArg(2) Class128 arg1) {
		Static408.anInt6633 = 0;
		Static302.anInt5058 = Static10.anInt225;
		Static10.anInt225 = 0;
		@Pc(14) long local14 = Static232.method3058();
		for (@Pc(19) Class13_Sub2 local19 = (Class13_Sub2) Static358.aClass227_5.method4827(); local19 != null; local19 = (Class13_Sub2) Static358.aClass227_5.method4834()) {
			if (local19.method701(arg1, arg0)) {
				Static408.anInt6633++;
			}
		}
		if (Static4.aBoolean9 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static358.aClass227_5.method4830() + ", running: " + Static408.anInt6633 + ". Particles: " + Static10.anInt225 + ". Time taken: " + (Static232.method3058() - local14) + "ms");
		}
	}
}
