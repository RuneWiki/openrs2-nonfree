import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Lclient!bt;")
	public static Class34 aClass34_80;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "[Lclient!rc;")
	public static Class308[] aClass308Array4;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_122 = new Class151(5, 12);

	@OriginalMember(owner = "client!me", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[200];

	@OriginalMember(owner = "client!me", name = "u", descriptor = "[I")
	public static int[] anIntArray419 = null;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public static void method4804() {
		for (@Pc(3) int local3 = 0; local3 < 100; local3++) {
			Static146.aClass97Array1[local3] = null;
		}
		Static208.anInt3378 = 0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!bt;I)I")
	public static int method4807(@OriginalArg(0) Class34 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1235(Static389.anInt5686)) {
			local5++;
		}
		if (arg0.method1235(Static114.anInt2222)) {
			local5++;
		}
		if (arg0.method1235(Static312.anInt4876)) {
			local5++;
		}
		if (arg0.method1235(Static41.anInt850)) {
			local5++;
		}
		if (arg0.method1235(Static110.anInt2179)) {
			local5++;
		}
		if (arg0.method1235(Static206.anInt3355)) {
			local5++;
		}
		if (arg0.method1235(Static148.anInt2698)) {
			local5++;
		}
		if (arg0.method1235(Static416.anInt5990)) {
			local5++;
		}
		if (arg0.method1235(Static201.anInt3303)) {
			local5++;
		}
		if (arg0.method1235(Static303.anInt4791)) {
			local5++;
		}
		if (arg0.method1235(Static6.anInt87)) {
			local5++;
		}
		if (arg0.method1235(Static220.anInt3540)) {
			local5++;
		}
		if (arg0.method1235(Static633.anInt9786)) {
			local5++;
		}
		if (arg0.method1235(Static654.anInt10323)) {
			local5++;
		}
		if (arg0.method1235(Static36.anInt795)) {
			local5++;
		}
		if (arg0.method1235(Static128.anInt2407)) {
			local5++;
		}
		return local5;
	}
}
