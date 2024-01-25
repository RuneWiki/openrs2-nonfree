import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!uja", name = "Q", descriptor = "Lclient!ha;")
	public static Class101 aClass101_15;

	@OriginalMember(owner = "client!uja", name = "U", descriptor = "I")
	public static int anInt10630;

	@OriginalMember(owner = "client!uja", name = "V", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!uja", name = "e", descriptor = "(B)I")
	public static int method9111() {
		@Pc(15) Class101 local15 = aClass101_15;
		@Pc(17) boolean local17 = false;
		if (Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907() != 0) {
			@Pc(26) Canvas local26 = new Canvas();
			local26.setSize(100, 100);
			local15 = Static502.method7892((Class124) null, 0, local26, 0, (Interface3) null);
			local17 = true;
		}
		@Pc(43) long local43 = Static99.method1701();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local15.method8138();
		}
		@Pc(75) int local75 = (int) (Static99.method1701() - local43);
		local15.method8061(0, 100, -16777216, 0, 100);
		if (local17) {
			local15.method8148();
		}
		return local75;
	}

	@OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lclient!ol;I)Lclient!raa;")
	public static Class139_Sub2 method9112(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(12) Class139 local12 = Static522.method8052(arg0);
		@Pc(16) int local16 = arg0.method5211();
		@Pc(20) int local20 = arg0.method5211();
		@Pc(24) int local24 = arg0.method5211();
		@Pc(28) int local28 = arg0.method5211();
		@Pc(32) int local32 = arg0.method5211();
		@Pc(36) int local36 = arg0.method5211();
		return new Class139_Sub2(local12.aClass236_12, local12.aClass103_12, local12.anInt11172, local12.anInt11180, local12.anInt11174, local12.anInt11179, local12.anInt11181, local12.anInt11175, local12.anInt11173, local16, local20, local24, local28, local32, local36);
	}
}
