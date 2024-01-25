import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!he", name = "Q", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!he", name = "R", descriptor = "Lclient!vh;")
	public static Class250 aClass250_27;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_49 = new Class237(8, 3);

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([BIIZII)Z")
	public static boolean method2218(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class1_Sub1 local17 = new Class1_Sub1(arg0);
		@Pc(19) int local19 = -1;
		label54: while (true) {
			@Pc(23) int local23 = local17.method4120();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(42) int local42;
				while (!local36) {
					local42 = local17.method4096();
					if (local42 == 0) {
						continue label54;
					}
					local34 += local42 - 1;
					@Pc(69) int local69 = local34 & 0x3F;
					@Pc(75) int local75 = local34 >> 6 & 0x3F;
					@Pc(81) int local81 = local17.method4130() >> 2;
					@Pc(85) int local85 = local75 + arg2;
					@Pc(89) int local89 = arg1 + local69;
					if (local85 > 0 && local89 > 0 && local85 < arg4 - 1 && local89 < arg3 - 1) {
						@Pc(119) Class182 local119 = Static71.aClass105_6.method2336(local19);
						if (local81 != 22 || Static389.aClass128_Sub1_1.aBoolean240 || local119.anInt5468 != 0 || local119.anInt5492 == 1 || local119.aBoolean355) {
							local36 = true;
							if (!local119.method4391()) {
								local12 = false;
								Static120.anInt2114++;
							}
						}
					}
				}
				local42 = local17.method4096();
				if (local42 == 0) {
					break;
				}
				local17.method4130();
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!mu;")
	public static Class1_Sub11 method2219(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class1_Sub11_Sub2");
			@Pc(15) Class1_Sub11 local15 = (Class1_Sub11) local11.getDeclaredConstructor().newInstance();
			local15.method5036(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class1_Sub11_Sub1 local26 = new Class1_Sub11_Sub1();
			local26.method5036(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)Z")
	public static boolean method2220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
