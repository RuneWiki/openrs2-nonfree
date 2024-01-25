import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "Lclient!tu;")
	public static Class245 aClass245_1;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public static int anInt3927 = -1;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "S")
	public static short aShort60 = 320;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "Lclient!os;")
	public static final Class182 aClass182_134 = new Class182("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
	public static int anInt3945 = 0;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
	public static int anInt3947 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lclient!wl;")
	public static Class10_Sub3 method3130(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class10_Sub3_Sub2");
			@Pc(15) Class10_Sub3 local15 = (Class10_Sub3) local11.getDeclaredConstructor().newInstance();
			local15.method3890(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class10_Sub3_Sub1 local26 = new Class10_Sub3_Sub1();
			local26.method3890(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)V")
	public static void method3132() {
		for (@Pc(11) int local11 = 0; local11 < Static443.anInt7418; local11++) {
			@Pc(17) Class68 local17 = Static383.aClass68Array1[local11];
			if (local17.aByte14 == 2) {
				if (local17.aClass10_Sub7_Sub1_1 == null) {
					local17.anInt1950 = Integer.MIN_VALUE;
				} else {
					Static461.aClass10_Sub7_Sub2_5.method1841(local17.aClass10_Sub7_Sub1_1);
				}
			}
		}
	}
}
